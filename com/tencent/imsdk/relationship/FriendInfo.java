package com.tencent.imsdk.relationship;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FriendInfo implements Serializable {
    private String addSource;
    private long addTime;
    private String addWording;
    private int relationType;
    private String remark;
    private List<String> friendGroups = new ArrayList();
    private HashMap<String, byte[]> friendCustomInfo = new HashMap<>();
    private UserInfo userInfo = new UserInfo();

    public void addFriendCustomInfo(String str, byte[] bArr) {
        this.friendCustomInfo.put(str, bArr);
    }

    public void addFriendGroup(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.friendGroups.add(str);
    }

    public String getAddSource() {
        return this.addSource;
    }

    public long getAddTime() {
        return this.addTime;
    }

    public String getAddWording() {
        return this.addWording;
    }

    public HashMap<String, byte[]> getFriendCustomInfo() {
        return this.friendCustomInfo;
    }

    public List<String> getFriendGroups() {
        return this.friendGroups;
    }

    public int getRelationType() {
        return this.relationType;
    }

    public String getRemark() {
        return this.remark;
    }

    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public void setAddSource(String str) {
        this.addSource = str;
    }

    public void setAddTime(long j2) {
        this.addTime = j2;
    }

    public void setAddWording(String str) {
        this.addWording = str;
    }

    public void setRelationType(int i2) {
        this.relationType = i2;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
