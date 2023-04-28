package com.tencent.android.tpush.data;

import java.io.Serializable;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class UnregisterInfo implements Serializable {
    public static final byte TYPE_UNINSTALL = 1;
    public static final byte TYPE_UNREGISTER = 0;
    private static final long serialVersionUID = -2293449011577410421L;
    public long accessId;
    public String accessKey;
    public String appCert;
    public byte isUninstall;
    public String option;
    public String packName;
    public long timestamp;
    public String token;

    public UnregisterInfo() {
    }

    public String toString() {
    }

    public UnregisterInfo(int i2, String str, String str2, byte b, String str3) {
    }
}
