package com.facebook.imagepipeline.transcoder;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public @interface TranscodeStatus {
    public static final int TRANSCODING_ERROR = 2;
    public static final int TRANSCODING_NO_RESIZING = 1;
    public static final int TRANSCODING_SUCCESS = 0;
}
