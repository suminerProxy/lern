package com.umeng.umcrash;

import com.uc.crashsdk.export.CustomLogInfo;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UMCustomLogInfoBuilder {
    public static final String LINE_SEP = "\n";
    public static final String LOG_KEY_AC = "k_ac";
    public static final String LOG_KEY_CT = "k_ct";
    private static final String LOG_KEY_STACK_FUNC = "stackFunc";
    private static final String LOG_KEY_STACK_HASH = "stackHash";
    private static final String LOG_SECTION_SEP = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---";
    public static final String LOG_TYPE = "exception";
    private Map<String, String> kvInfoMap;
    private CustomLogInfo mCustomLogInfo;
    private List<String> sectionList;
    private String stack;

    public UMCustomLogInfoBuilder(String str) {
    }

    public UMCustomLogInfoBuilder addLogCat(boolean z) {
    }

    public UMCustomLogInfoBuilder addSection(String str) {
    }

    public CustomLogInfo build() {
    }

    public UMCustomLogInfoBuilder put(String str, String str2) {
    }

    public UMCustomLogInfoBuilder stack(Throwable th) {
    }

    public UMCustomLogInfoBuilder stackFunc(String str) {
    }

    public UMCustomLogInfoBuilder stackHash(String str) {
    }

    public UMCustomLogInfoBuilder uploadNow(boolean z) {
    }

    public UMCustomLogInfoBuilder stack(String str) {
    }
}
