package com.facebook.common.memory;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NoOpMemoryTrimmableRegistry implements MemoryTrimmableRegistry {
    private static NoOpMemoryTrimmableRegistry sInstance;

    public static synchronized NoOpMemoryTrimmableRegistry getInstance() {
        NoOpMemoryTrimmableRegistry noOpMemoryTrimmableRegistry;
        synchronized (NoOpMemoryTrimmableRegistry.class) {
            if (sInstance == null) {
                sInstance = new NoOpMemoryTrimmableRegistry();
            }
            noOpMemoryTrimmableRegistry = sInstance;
        }
        return noOpMemoryTrimmableRegistry;
    }

    @Override // com.facebook.common.memory.MemoryTrimmableRegistry
    public void registerMemoryTrimmable(MemoryTrimmable trimmable) {
    }

    @Override // com.facebook.common.memory.MemoryTrimmableRegistry
    public void unregisterMemoryTrimmable(MemoryTrimmable trimmable) {
    }
}
