package com.facebook.cache.common;

import com.facebook.cache.common.CacheEventListener;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface CacheEvent {
    @Nullable
    CacheKey getCacheKey();

    long getCacheLimit();

    long getCacheSize();

    @Nullable
    CacheEventListener.EvictionReason getEvictionReason();

    @Nullable
    IOException getException();

    long getItemSize();

    @Nullable
    String getResourceId();
}
