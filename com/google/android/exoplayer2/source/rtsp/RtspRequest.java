package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RtspRequest {
    public static final int METHOD_ANNOUNCE = 1;
    public static final int METHOD_DESCRIBE = 2;
    public static final int METHOD_GET_PARAMETER = 3;
    public static final int METHOD_OPTIONS = 4;
    public static final int METHOD_PAUSE = 5;
    public static final int METHOD_PLAY = 6;
    public static final int METHOD_PLAY_NOTIFY = 7;
    public static final int METHOD_RECORD = 8;
    public static final int METHOD_REDIRECT = 9;
    public static final int METHOD_SETUP = 10;
    public static final int METHOD_SET_PARAMETER = 11;
    public static final int METHOD_TEARDOWN = 12;
    public static final int METHOD_UNSET = 0;
    public final RtspHeaders headers;
    public final String messageBody;
    public final int method;
    public final Uri uri;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Method {
    }

    public RtspRequest(Uri uri, int method, RtspHeaders headers, String messageBody) {
    }
}
