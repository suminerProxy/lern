package com.tencent.qcloud.tuikit.tuichat.bean;

import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MessageTyping implements Serializable {
    public static final String EDIT_END = "EIMAMSG_InputStatus_End";
    public static final String EDIT_START = "EIMAMSG_InputStatus_Ing";
    public static final int TYPE_TYPING = 14;
    public String actionParam;
    public String businessID;
    public int typingStatus;
    public int userAction;
    public int version;

    public void setTypingStatus(boolean z) {
    }
}
