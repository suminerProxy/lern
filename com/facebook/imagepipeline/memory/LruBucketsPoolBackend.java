package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Set;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class LruBucketsPoolBackend<T> implements PoolBackend<T> {
    private final Set<T> mCurrentItems;
    private final BucketMap<T> mMap;

    @Nullable
    private T maybeRemoveFromCurrentItems(@Nullable T t) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    @Nullable
    public T get(int size) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    @Nullable
    public T pop() {
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    public void put(T item) {
    }

    @VisibleForTesting
    public int valueCount() {
    }
}
