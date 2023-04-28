package com.tencent.imsdk.relationship;

import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FriendAddApplication implements Serializable {
    private String addSource;
    private int addType;
    private String addWording;
    private String groupName;
    private String remark;
    private String userID;

    public void setAddSource(String str) {
        this.addSource = str;
    }

    public void setAddType(int i2) {
        this.addType = i2;
    }

    public void setAddWording(String str) {
        this.addWording = str;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setUserID(String str) {
        this.userID = str;
    }
}
