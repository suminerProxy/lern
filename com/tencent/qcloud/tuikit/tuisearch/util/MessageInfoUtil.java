package com.tencent.qcloud.tuikit.tuisearch.util;

import android.content.Context;
import com.tencent.imsdk.v2.V2TIMDownloadCallback;
import com.tencent.imsdk.v2.V2TIMElem;
import com.tencent.imsdk.v2.V2TIMGroupMemberInfo;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.qcloud.tuikit.tuisearch.bean.MessageInfo;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MessageInfoUtil {
    private static final String TAG = "MessageInfoUtil";

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.util.MessageInfoUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements V2TIMDownloadCallback {
        public final /* synthetic */ MessageInfo val$msgInfo;
        public final /* synthetic */ String val$path;

        public AnonymousClass1(MessageInfo messageInfo, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMDownloadCallback
        public void onProgress(V2TIMElem.V2ProgressInfo v2ProgressInfo) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    public static int convertTIMElemType2MessageInfoType(int i2) {
    }

    public static MessageInfo convertTIMMessage2MessageInfo(V2TIMMessage v2TIMMessage) {
    }

    public static List<MessageInfo> convertTIMMessages2MessageInfos(List<V2TIMMessage> list) {
    }

    private static MessageInfo createCustomMessageInfo(V2TIMMessage v2TIMMessage, Context context) {
    }

    private static MessageInfo createGroupTipsMessageInfo(V2TIMMessage v2TIMMessage, Context context) {
    }

    public static MessageInfo createMessageInfo(V2TIMMessage v2TIMMessage) {
    }

    private static MessageInfo createNormalMessageInfo(V2TIMMessage v2TIMMessage, Context context, int i2) {
    }

    public static String getDisplayName(V2TIMMessage v2TIMMessage) {
    }

    public static boolean isTyping(byte[] bArr) {
    }

    private static void setCallingExtra(MessageInfo messageInfo) {
    }

    private static void setLiveExtra(MessageInfo messageInfo, HashMap hashMap) {
    }

    public static void setMessageInfoCommonAttributes(MessageInfo messageInfo, V2TIMMessage v2TIMMessage) {
    }

    public static String getDisplayName(V2TIMGroupMemberInfo v2TIMGroupMemberInfo) {
    }
}
