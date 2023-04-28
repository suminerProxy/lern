package com.tencent.qcloud.tuikit.tuichat.model;

import android.util.Pair;
import com.tencent.imsdk.v2.V2TIMCallback;
import com.tencent.imsdk.v2.V2TIMCompleteCallback;
import com.tencent.imsdk.v2.V2TIMConversation;
import com.tencent.imsdk.v2.V2TIMConversationOperationResult;
import com.tencent.imsdk.v2.V2TIMFriendInfoResult;
import com.tencent.imsdk.v2.V2TIMGroupApplicationResult;
import com.tencent.imsdk.v2.V2TIMGroupMemberFullInfo;
import com.tencent.imsdk.v2.V2TIMGroupMessageReadMemberList;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.imsdk.v2.V2TIMMessageReceipt;
import com.tencent.imsdk.v2.V2TIMSendCallback;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.GroupApplyInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageReceiptInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.OfflinePushInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.ReactUserBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.GroupMessageReadMembersInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.MergeMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ChatProvider {
    public static final int ERR_REVOKE_TIME_LIMIT_EXCEED = 6223;
    public static final int ERR_REVOKE_TIME_LIMIT_SVR_GROUP = 10031;
    public static final int ERR_REVOKE_TIME_LIMIT_SVR_MESSAGE = 20016;
    private static final String TAG = "ChatProvider";

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements V2TIMValueCallback<List<V2TIMMessage>> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass1(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMMessage> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMMessage> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 implements V2TIMSendCallback<V2TIMMessage> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ TUIMessageBean val$message;
        public final /* synthetic */ String val$receiver;

        public AnonymousClass10(ChatProvider chatProvider, IUIKitCallback iUIKitCallback, TUIMessageBean tUIMessageBean, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMSendCallback
        public void onProgress(int i2) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }

        public void onSuccess(V2TIMMessage v2TIMMessage) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 implements V2TIMSendCallback<V2TIMMessage> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ String val$id;

        public AnonymousClass11(ChatProvider chatProvider, IUIKitCallback iUIKitCallback, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMSendCallback
        public void onProgress(int i2) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }

        public void onSuccess(V2TIMMessage v2TIMMessage) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 implements V2TIMCallback {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass12(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 implements V2TIMCallback {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass13(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 implements V2TIMCallback {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ String val$draft;

        public AnonymousClass14(ChatProvider chatProvider, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 implements V2TIMValueCallback<V2TIMConversation> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass15(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMConversation v2TIMConversation) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMConversation v2TIMConversation) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass16 implements V2TIMSendCallback<V2TIMMessage> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass16(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMSendCallback
        public void onProgress(int i2) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }

        public void onSuccess(V2TIMMessage v2TIMMessage) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass17 implements V2TIMValueCallback<List<V2TIMFriendInfoResult>> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass17(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMFriendInfoResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMFriendInfoResult> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass18 implements V2TIMValueCallback<List<V2TIMMessage>> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass18(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMMessage> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMMessage> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass19 implements V2TIMValueCallback<List<V2TIMMessage>> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass19(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMMessage> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMMessage> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements V2TIMValueCallback<List<V2TIMMessage>> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass2(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMMessage> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMMessage> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass20 implements V2TIMValueCallback<List<V2TIMMessage>> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass20(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMMessage> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMMessage> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$21  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass21 implements V2TIMValueCallback<List<V2TIMMessageReceipt>> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass21(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMMessageReceipt> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMMessageReceipt> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$22  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass22 implements V2TIMCallback {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass22(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$23  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass23 implements V2TIMValueCallback<V2TIMGroupMessageReadMemberList> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass23(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMGroupMessageReadMemberList v2TIMGroupMessageReadMemberList) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMGroupMessageReadMemberList v2TIMGroupMessageReadMemberList) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$24  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass24 implements V2TIMCompleteCallback<V2TIMMessage> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass24(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCompleteCallback
        public /* bridge */ /* synthetic */ void onComplete(int i2, String str, V2TIMMessage v2TIMMessage) {
        }

        /* renamed from: onComplete  reason: avoid collision after fix types in other method */
        public void onComplete2(int i2, String str, V2TIMMessage v2TIMMessage) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$25  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass25 implements V2TIMValueCallback<List<V2TIMFriendInfoResult>> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass25(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMFriendInfoResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMFriendInfoResult> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$26  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass26 implements V2TIMValueCallback<List<V2TIMGroupMemberFullInfo>> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass26(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMGroupMemberFullInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMGroupMemberFullInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements V2TIMValueCallback<List<V2TIMMessage>> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass3(ChatProvider chatProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMMessage> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMMessage> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements V2TIMCallback {
        public final /* synthetic */ ChatProvider this$0;

        public AnonymousClass4(ChatProvider chatProvider) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements V2TIMValueCallback<List<V2TIMConversationOperationResult>> {
        public final /* synthetic */ ChatProvider this$0;

        public AnonymousClass5(ChatProvider chatProvider) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMConversationOperationResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMConversationOperationResult> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements V2TIMCallback {
        public final /* synthetic */ ChatProvider this$0;

        public AnonymousClass6(ChatProvider chatProvider) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements V2TIMValueCallback<List<V2TIMConversationOperationResult>> {
        public final /* synthetic */ ChatProvider this$0;

        public AnonymousClass7(ChatProvider chatProvider) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMConversationOperationResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMConversationOperationResult> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements V2TIMValueCallback<V2TIMGroupApplicationResult> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ List val$applies;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass8(ChatProvider chatProvider, IUIKitCallback iUIKitCallback, List list) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMGroupApplicationResult v2TIMGroupApplicationResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMGroupApplicationResult v2TIMGroupApplicationResult) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.model.ChatProvider$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements V2TIMSendCallback<V2TIMMessage> {
        public final /* synthetic */ ChatProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ ChatInfo val$chatInfo;
        public final /* synthetic */ TUIMessageBean val$message;

        public AnonymousClass9(ChatProvider chatProvider, IUIKitCallback iUIKitCallback, TUIMessageBean tUIMessageBean, ChatInfo chatInfo) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMSendCallback
        public void onProgress(int i2) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }

        public void onSuccess(V2TIMMessage v2TIMMessage) {
        }
    }

    public static /* synthetic */ String access$000() {
    }

    private void setMessageTypingFeature(TUIMessageBean tUIMessageBean) {
    }

    public void addJoinGroupMessage(TUIMessageBean tUIMessageBean, IUIKitCallback<List<GroupMemberInfo>> iUIKitCallback) {
    }

    public void addLeaveGroupMessage(TUIMessageBean tUIMessageBean, IUIKitCallback<List<String>> iUIKitCallback) {
    }

    public void addModifyGroupMessage(TUIMessageBean tUIMessageBean, IUIKitCallback<Pair<Integer, String>> iUIKitCallback) {
    }

    public void c2cReadReport(String str) {
    }

    public boolean checkFailedMessageInfo(TUIMessageBean tUIMessageBean) {
    }

    public void deleteMessages(List<TUIMessageBean> list, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void downloadMergerMessage(MergeMessageBean mergeMessageBean, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void findMessage(List<String> list, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void getConversationLastMessage(String str, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
    }

    public void getFriendName(String str, IUIKitCallback<String[]> iUIKitCallback) {
    }

    public void getGroupMembersInfo(String str, List<String> list, IUIKitCallback<List<GroupMemberInfo>> iUIKitCallback) {
    }

    public void getGroupMessageBySeq(String str, long j2, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void getGroupMessageReadMembers(TUIMessageBean tUIMessageBean, boolean z, int i2, long j2, IUIKitCallback<GroupMessageReadMembersInfo> iUIKitCallback) {
    }

    public void getMessageReadReceipt(List<TUIMessageBean> list, IUIKitCallback<List<MessageReceiptInfo>> iUIKitCallback) {
    }

    public void getReactUserBean(List<String> list, IUIKitCallback<List<ReactUserBean>> iUIKitCallback) {
    }

    public void groupReadReport(String str) {
    }

    public void loadApplyInfo(IUIKitCallback<List<GroupApplyInfo>> iUIKitCallback) {
    }

    public void loadC2CMessage(String str, int i2, TUIMessageBean tUIMessageBean, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void loadGroupMessage(String str, int i2, TUIMessageBean tUIMessageBean, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void loadHistoryMessageList(String str, boolean z, int i2, TUIMessageBean tUIMessageBean, int i3, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void modifyMessage(TUIMessageBean tUIMessageBean, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
    }

    public void revokeMessage(TUIMessageBean tUIMessageBean, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void sendGroupTipsMessage(String str, String str2, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
    }

    public String sendMessage(TUIMessageBean tUIMessageBean, ChatInfo chatInfo, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
    }

    public void sendMessageReadReceipt(List<TUIMessageBean> list, IUIKitCallback<Void> iUIKitCallback) {
    }

    public String sendTypingStatusMessage(TUIMessageBean tUIMessageBean, String str, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
    }

    public void setDraft(String str, String str2) {
    }

    public String sendMessage(TUIMessageBean tUIMessageBean, boolean z, String str, OfflinePushInfo offlinePushInfo, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
    }
}
