package com.facebook.drawee.interfaces;

import android.net.Uri;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface SimpleDraweeControllerBuilder {
    DraweeController build();

    SimpleDraweeControllerBuilder setCallerContext(Object callerContext);

    SimpleDraweeControllerBuilder setOldController(@Nullable DraweeController oldController);

    SimpleDraweeControllerBuilder setUri(Uri uri);

    SimpleDraweeControllerBuilder setUri(@Nullable String uriString);
}
