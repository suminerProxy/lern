package com.facebook.imagepipeline.common;

import com.facebook.infer.annotation.Nullsafe;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public @interface SourceUriType {
    public static final int SOURCE_TYPE_DATA = 7;
    public static final int SOURCE_TYPE_LOCAL_ASSET = 5;
    public static final int SOURCE_TYPE_LOCAL_CONTENT = 4;
    public static final int SOURCE_TYPE_LOCAL_FILE = 1;
    public static final int SOURCE_TYPE_LOCAL_IMAGE_FILE = 3;
    public static final int SOURCE_TYPE_LOCAL_RESOURCE = 6;
    public static final int SOURCE_TYPE_LOCAL_VIDEO_FILE = 2;
    public static final int SOURCE_TYPE_NETWORK = 0;
    public static final int SOURCE_TYPE_QUALIFIED_RESOURCE = 8;
    public static final int SOURCE_TYPE_UNKNOWN = -1;
}
