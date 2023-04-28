package com.tencent.imsdk.relationship;

import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UserStatus implements Serializable {
    private String customStatus;
    private int statusType;
    private String userID;

    public String getCustomStatus() {
        return this.customStatus;
    }

    public int getStatusType() {
        return this.statusType;
    }

    public String getUserID() {
        return this.userID;
    }

    public void setCustomStatus(String str) {
        this.customStatus = str;
    }
}
