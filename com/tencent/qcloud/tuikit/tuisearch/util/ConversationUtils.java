package com.tencent.qcloud.tuikit.tuisearch.util;

import com.tencent.imsdk.v2.V2TIMConversation;
import com.tencent.imsdk.v2.V2TIMGroupMemberInfoResult;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuikit.tuisearch.bean.ConversationInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ConversationUtils {
    public static final String SP_IMAGE = "_conversation_group_face";
    private static final String TAG = "ConversationUtils";

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.util.ConversationUtils$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements V2TIMValueCallback<V2TIMGroupMemberInfoResult> {
        public final /* synthetic */ String val$groupID;
        public final /* synthetic */ ConversationInfo val$info;

        public AnonymousClass1(String str, ConversationInfo conversationInfo) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMGroupMemberInfoResult v2TIMGroupMemberInfoResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMGroupMemberInfoResult v2TIMGroupMemberInfoResult) {
        }
    }

    public static /* synthetic */ String access$000() {
    }

    public static ConversationInfo convertV2TIMConversation(V2TIMConversation v2TIMConversation) {
    }

    public static List<ConversationInfo> convertV2TIMConversationList(List<V2TIMConversation> list) {
    }

    private static void fillConversationUrlForGroup(V2TIMConversation v2TIMConversation, ConversationInfo conversationInfo) {
    }

    private static void fillFaceUrlList(String str, ConversationInfo conversationInfo) {
    }

    private static int getAtInfoType(V2TIMConversation v2TIMConversation) {
    }

    public static String getGroupConversationAvatar(String str) {
    }
}
