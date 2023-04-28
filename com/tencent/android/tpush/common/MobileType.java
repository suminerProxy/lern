package com.tencent.android.tpush.common;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public enum MobileType {
    UNKNOWN((byte) 0, "未知运营商"),
    TELCOM((byte) 1, "中国电信"),
    UNICOM((byte) 2, "中国联通"),
    CHINAMOBILE((byte) 3, "中国移动");
    
    private String str;
    private byte type;

    MobileType(byte b, String str) {
        this.type = b;
        this.str = str;
    }

    public String getStr() {
        return this.str;
    }

    public byte getType() {
        return this.type;
    }
}
