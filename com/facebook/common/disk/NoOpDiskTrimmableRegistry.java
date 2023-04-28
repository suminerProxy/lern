package com.facebook.common.disk;

import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NoOpDiskTrimmableRegistry implements DiskTrimmableRegistry {
    @Nullable
    private static NoOpDiskTrimmableRegistry sInstance;

    private NoOpDiskTrimmableRegistry() {
    }

    public static synchronized NoOpDiskTrimmableRegistry getInstance() {
        NoOpDiskTrimmableRegistry noOpDiskTrimmableRegistry;
        synchronized (NoOpDiskTrimmableRegistry.class) {
            if (sInstance == null) {
                sInstance = new NoOpDiskTrimmableRegistry();
            }
            noOpDiskTrimmableRegistry = sInstance;
        }
        return noOpDiskTrimmableRegistry;
    }

    @Override // com.facebook.common.disk.DiskTrimmableRegistry
    public void registerDiskTrimmable(DiskTrimmable trimmable) {
    }

    @Override // com.facebook.common.disk.DiskTrimmableRegistry
    public void unregisterDiskTrimmable(DiskTrimmable trimmable) {
    }
}
