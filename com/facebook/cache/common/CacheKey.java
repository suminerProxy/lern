package com.facebook.cache.common;

import android.net.Uri;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface CacheKey {
    boolean containsUri(Uri uri);

    boolean equals(Object o2);

    String getUriString();

    int hashCode();

    boolean isResourceIdForDebugging();

    String toString();
}
