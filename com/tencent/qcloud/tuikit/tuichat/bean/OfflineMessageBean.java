package com.tencent.qcloud.tuikit.tuichat.bean;

import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class OfflineMessageBean {
    public static final int REDIRECT_ACTION_CALL = 2;
    public static final int REDIRECT_ACTION_CHAT = 1;
    public int action;
    public int chatType;
    public String content;
    public String faceUrl;
    public String nickname;
    public long sendTime;
    public String sender;
    public int version;

    @NonNull
    public String toString() {
    }
}
