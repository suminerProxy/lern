package com.tencent.imsdk.v2;

import com.tencent.imsdk.conversation.ConversationAtInfo;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMGroupAtInfo implements Serializable {
    public static final String AT_ALL_TAG = "__kImSDK_MesssageAtALL__";
    public static final int TIM_AT_ALL = 2;
    public static final int TIM_AT_ALL_AT_ME = 3;
    public static final int TIM_AT_ME = 1;
    public static final int TIM_AT_UNKNOWN = 0;
    private ConversationAtInfo conversationAtInfo;

    public int getAtType() {
    }

    public long getSeq() {
    }

    public void setConversationGroupAtInfo(ConversationAtInfo conversationAtInfo) {
    }
}
