package com.tencent.qcloud.tuikit.tuigroup.bean;

import com.tencent.imsdk.v2.V2TIMGroupAtInfo;
import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ChatInfo implements Serializable {
    public static final int TYPE_C2C = 1;
    public static final int TYPE_GROUP = 2;
    public static final int TYPE_INVALID = 0;
    private static List<V2TIMGroupAtInfo> atInfoList;
    private String chatName;
    private String groupType;
    private String id;
    private boolean isFolded;
    private boolean isTopChat;
    private int type;

    public List<V2TIMGroupAtInfo> getAtInfoList() {
    }

    public String getChatName() {
    }

    public String getGroupType() {
    }

    public String getId() {
    }

    public int getType() {
    }

    public boolean isFolded() {
    }

    public boolean isTopChat() {
    }

    public void setChatName(String str) {
    }

    public void setFolded(boolean z) {
    }

    public void setGroupType(String str) {
    }

    public void setId(String str) {
    }

    public void setTopChat(boolean z) {
    }

    public void setType(int i2) {
    }
}
