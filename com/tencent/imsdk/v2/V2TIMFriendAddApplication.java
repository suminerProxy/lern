package com.tencent.imsdk.v2;

import com.tencent.imsdk.relationship.FriendAddApplication;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMFriendAddApplication implements Serializable {
    private FriendAddApplication friendAddApplication;

    public V2TIMFriendAddApplication(String str) {
        FriendAddApplication friendAddApplication = new FriendAddApplication();
        this.friendAddApplication = friendAddApplication;
        friendAddApplication.setUserID(str);
        this.friendAddApplication.setAddType(2);
    }

    public FriendAddApplication getFriendAddApplication() {
        return this.friendAddApplication;
    }

    public void setAddSource(String str) {
        this.friendAddApplication.setAddSource(str);
    }

    public void setAddType(int i2) {
        if (i2 != 1 && i2 != 2) {
            i2 = 2;
        }
        this.friendAddApplication.setAddType(i2);
    }

    public void setAddWording(String str) {
        this.friendAddApplication.setAddWording(str);
    }

    public void setFriendGroup(String str) {
        this.friendAddApplication.setGroupName(str);
    }

    public void setFriendRemark(String str) {
        this.friendAddApplication.setRemark(str);
    }

    public void setUserID(String str) {
        this.friendAddApplication.setUserID(str);
    }
}
