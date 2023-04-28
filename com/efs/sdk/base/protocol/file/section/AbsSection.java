package com.efs.sdk.base.protocol.file.section;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class AbsSection {
    public static final String SEP_LINE_BREAK = "linebreak";
    public static final String SEP_ORIGIN_LINE_BREAK = "\n";
    public String name;
    public String sep;
    public String type;
    public String version;

    public AbsSection(String str) {
    }

    public abstract String changeToStr();

    public String getDeclarationLine() {
    }

    public void setSep(String str) {
    }
}
