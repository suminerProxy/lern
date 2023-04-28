package com.facebook.common.memory;

import com.facebook.common.references.ResourceReleaser;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface Pool<V> extends ResourceReleaser<V>, MemoryTrimmable {
    V get(int size);

    @Override // com.facebook.common.references.ResourceReleaser
    void release(V value);
}
