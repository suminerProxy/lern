package com.facebook.common.references;

import com.facebook.infer.annotation.Nullsafe;
import java.lang.ref.SoftReference;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class OOMSoftReference<T> {
    @Nullable
    public SoftReference<T> softRef1;
    @Nullable
    public SoftReference<T> softRef2;
    @Nullable
    public SoftReference<T> softRef3;

    public void clear() {
    }

    @Nullable
    public T get() {
    }

    public void set(T hardReference) {
    }
}
