package com.facebook.cache.common;

import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NoOpCacheErrorLogger implements CacheErrorLogger {
    @Nullable
    private static NoOpCacheErrorLogger sInstance;

    private NoOpCacheErrorLogger() {
    }

    public static synchronized NoOpCacheErrorLogger getInstance() {
        NoOpCacheErrorLogger noOpCacheErrorLogger;
        synchronized (NoOpCacheErrorLogger.class) {
            if (sInstance == null) {
                sInstance = new NoOpCacheErrorLogger();
            }
            noOpCacheErrorLogger = sInstance;
        }
        return noOpCacheErrorLogger;
    }

    @Override // com.facebook.cache.common.CacheErrorLogger
    public void logError(CacheErrorLogger.CacheErrorCategory category, Class<?> clazz, String message, @Nullable Throwable throwable) {
    }
}
