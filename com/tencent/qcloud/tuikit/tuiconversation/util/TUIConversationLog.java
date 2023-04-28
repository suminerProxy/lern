package com.tencent.qcloud.tuikit.tuiconversation.util;

import com.tencent.imsdk.common.IMLog;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUIConversationLog extends IMLog {
    private static final String PRE = "TUIKit-";

    public static void d(String str, String str2) {
        IMLog.d(mixTag(str), str2);
    }

    public static void e(String str, String str2) {
        IMLog.e(mixTag(str), str2);
    }

    public static void i(String str, String str2) {
        IMLog.i(mixTag(str), str2);
    }

    private static String mixTag(String str) {
        return PRE + str;
    }

    public static void v(String str, String str2) {
        IMLog.v(mixTag(str), str2);
    }

    public static void w(String str, String str2) {
        IMLog.w(mixTag(str), str2);
    }

    public static void w(String str, String str2, Throwable th) {
        String mixTag = mixTag(str);
        IMLog.w(mixTag, str2 + th.getMessage());
    }
}
