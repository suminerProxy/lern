package com.facebook.imagepipeline.image;

import com.facebook.common.logging.FLog;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class CloseableImage implements Closeable, ImageInfo {
    private static final String TAG = "CloseableImage";
    private static final Set<String> mImageExtrasList = new HashSet(Arrays.asList(ProducerContext.ExtraKeys.ENCODED_SIZE, ProducerContext.ExtraKeys.ENCODED_WIDTH, ProducerContext.ExtraKeys.ENCODED_HEIGHT, ProducerContext.ExtraKeys.SOURCE_URI, ProducerContext.ExtraKeys.IMAGE_FORMAT, "bitmap_config", "is_rounded"));
    private Map<String, Object> mExtras = new HashMap();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        FLog.w(TAG, "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.image.HasImageMetadata
    public Map<String, Object> getExtras() {
        return this.mExtras;
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public QualityInfo getQualityInfo() {
        return ImmutableQualityInfo.FULL_QUALITY;
    }

    public abstract int getSizeInBytes();

    public abstract boolean isClosed();

    public boolean isStateful() {
        return false;
    }

    public void setImageExtra(String extra, Object value) {
        if (mImageExtrasList.contains(extra)) {
            this.mExtras.put(extra, value);
        }
    }

    public void setImageExtras(@Nullable Map<String, Object> extras) {
        if (extras == null) {
            return;
        }
        for (String str : mImageExtrasList) {
            Object obj = extras.get(str);
            if (obj != null) {
                this.mExtras.put(str, obj);
            }
        }
    }
}
