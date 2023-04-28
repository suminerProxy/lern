package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface PoolBackend<T> {
    @Nullable
    T get(int size);

    int getSize(T item);

    @Nullable
    T pop();

    void put(T item);
}
