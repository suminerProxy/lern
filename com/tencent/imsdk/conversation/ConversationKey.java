package com.tencent.imsdk.conversation;

import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ConversationKey implements Serializable {
    public static final int TYPE_C2C = 1;
    public static final int TYPE_GROUP = 2;
    private String conversationID;
    private int conversationType;

    public String getConversationID() {
        return this.conversationID;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public void setConversationID(String str) {
        this.conversationID = str;
    }

    public void setConversationType(int i2) {
        this.conversationType = i2;
    }
}
