package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;
import javax.annotation.Nullable;

@DoNotOptimize
@TargetApi(18)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Api18TraceUtils {
    private static final int MAX_SECTION_NAME_LENGTH = 127;

    public static void beginTraceSection(String str, @Nullable String str2, String str3) {
        String str4 = str + str2 + str3;
        if (str4.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            str4 = str + str2.substring(0, length) + str3;
        }
        Trace.beginSection(str4);
    }

    public static void endSection() {
        Trace.endSection();
    }
}
