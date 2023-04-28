package com.facebook.cache.common;

import android.net.Uri;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DebuggingCacheKey extends SimpleCacheKey {
    @Nullable
    private final Object mCallerContext;
    private final Uri mSourceUri;

    public DebuggingCacheKey(String key, @Nullable Object callerContext, Uri sourceUri) {
    }

    @Nullable
    public Object getCallerContext() {
    }

    public Uri getSourceUri() {
    }
}
