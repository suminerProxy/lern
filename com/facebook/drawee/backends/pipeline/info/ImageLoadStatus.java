package com.facebook.drawee.backends.pipeline.info;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public @interface ImageLoadStatus {
    public static final int CANCELED = 4;
    public static final int DRAW = 6;
    public static final int ERROR = 5;
    public static final int INTERMEDIATE_AVAILABLE = 2;
    public static final int ORIGIN_AVAILABLE = 1;
    public static final int REQUESTED = 0;
    public static final int SUCCESS = 3;
    public static final int UNKNOWN = -1;
}
