package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class StagingArea {
    private static final Class<?> TAG = StagingArea.class;
    @GuardedBy("this")
    private Map<CacheKey, EncodedImage> mMap = new HashMap();

    private StagingArea() {
    }

    public static StagingArea getInstance() {
        return new StagingArea();
    }

    private synchronized void logStats() {
        FLog.v(TAG, "Count = %d", Integer.valueOf(this.mMap.size()));
    }

    public void clearAll() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.mMap.values());
            this.mMap.clear();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            EncodedImage encodedImage = (EncodedImage) arrayList.get(i2);
            if (encodedImage != null) {
                encodedImage.close();
            }
        }
    }

    public synchronized boolean containsKey(CacheKey key) {
        Preconditions.checkNotNull(key);
        if (this.mMap.containsKey(key)) {
            EncodedImage encodedImage = this.mMap.get(key);
            synchronized (encodedImage) {
                if (EncodedImage.isValid(encodedImage)) {
                    return true;
                }
                this.mMap.remove(key);
                FLog.w(TAG, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(encodedImage)), key.getUriString(), Integer.valueOf(System.identityHashCode(key)));
                return false;
            }
        }
        return false;
    }

    @Nullable
    public synchronized EncodedImage get(final CacheKey key) {
        Preconditions.checkNotNull(key);
        EncodedImage encodedImage = this.mMap.get(key);
        if (encodedImage != null) {
            synchronized (encodedImage) {
                if (!EncodedImage.isValid(encodedImage)) {
                    this.mMap.remove(key);
                    FLog.w(TAG, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(encodedImage)), key.getUriString(), Integer.valueOf(System.identityHashCode(key)));
                    return null;
                }
                encodedImage = EncodedImage.cloneOrNull(encodedImage);
            }
        }
        return encodedImage;
    }

    public synchronized void put(final CacheKey key, final EncodedImage encodedImage) {
        Preconditions.checkNotNull(key);
        Preconditions.checkArgument(Boolean.valueOf(EncodedImage.isValid(encodedImage)));
        EncodedImage.closeSafely(this.mMap.put(key, EncodedImage.cloneOrNull(encodedImage)));
        logStats();
    }

    public boolean remove(final CacheKey key) {
        EncodedImage remove;
        Preconditions.checkNotNull(key);
        synchronized (this) {
            remove = this.mMap.remove(key);
        }
        if (remove == null) {
            return false;
        }
        try {
            return remove.isValid();
        } finally {
            remove.close();
        }
    }

    public synchronized boolean remove(final CacheKey key, final EncodedImage encodedImage) {
        Preconditions.checkNotNull(key);
        Preconditions.checkNotNull(encodedImage);
        Preconditions.checkArgument(Boolean.valueOf(EncodedImage.isValid(encodedImage)));
        EncodedImage encodedImage2 = this.mMap.get(key);
        if (encodedImage2 == null) {
            return false;
        }
        CloseableReference<PooledByteBuffer> byteBufferRef = encodedImage2.getByteBufferRef();
        CloseableReference<PooledByteBuffer> byteBufferRef2 = encodedImage.getByteBufferRef();
        if (byteBufferRef != null && byteBufferRef2 != null && byteBufferRef.get() == byteBufferRef2.get()) {
            this.mMap.remove(key);
            CloseableReference.closeSafely(byteBufferRef2);
            CloseableReference.closeSafely(byteBufferRef);
            EncodedImage.closeSafely(encodedImage2);
            logStats();
            return true;
        }
        CloseableReference.closeSafely(byteBufferRef2);
        CloseableReference.closeSafely(byteBufferRef);
        EncodedImage.closeSafely(encodedImage2);
        return false;
    }
}
