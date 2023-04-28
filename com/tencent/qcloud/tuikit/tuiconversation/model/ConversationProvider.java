package com.tencent.qcloud.tuikit.tuiconversation.model;

import com.tencent.imsdk.v2.V2TIMCallback;
import com.tencent.imsdk.v2.V2TIMConversation;
import com.tencent.imsdk.v2.V2TIMConversationListFilter;
import com.tencent.imsdk.v2.V2TIMConversationOperationResult;
import com.tencent.imsdk.v2.V2TIMConversationResult;
import com.tencent.imsdk.v2.V2TIMGroupMemberInfoResult;
import com.tencent.imsdk.v2.V2TIMUserStatus;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ConversationProvider {
    private static final String TAG = "ConversationProvider";
    private boolean isFinished;
    private List<ConversationInfo> markConversationInfoList;
    private long nextLoadSeq;

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements V2TIMValueCallback<V2TIMConversationResult> {
        public final /* synthetic */ ConversationProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass1(ConversationProvider conversationProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMConversationResult v2TIMConversationResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMConversationResult v2TIMConversationResult) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 implements V2TIMCallback {
        public final /* synthetic */ ConversationProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass10(ConversationProvider conversationProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 implements V2TIMCallback {
        public final /* synthetic */ ConversationProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass11(ConversationProvider conversationProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 implements V2TIMCallback {
        public final /* synthetic */ ConversationProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass12(ConversationProvider conversationProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 implements V2TIMValueCallback<V2TIMGroupMemberInfoResult> {
        public final /* synthetic */ ConversationProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ String val$groupId;
        public final /* synthetic */ int val$iconCount;

        public AnonymousClass13(ConversationProvider conversationProvider, IUIKitCallback iUIKitCallback, String str, int i2) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 implements V2TIMValueCallback<List<V2TIMUserStatus>> {
        public final /* synthetic */ ConversationProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ HashMap val$dataSourceMap;

        public AnonymousClass14(ConversationProvider conversationProvider, HashMap hashMap, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMUserStatus> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMUserStatus> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 implements V2TIMCallback {
        public final /* synthetic */ ConversationProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass15(ConversationProvider conversationProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass16 implements V2TIMValueCallback<V2TIMConversationResult> {
        public final /* synthetic */ ConversationProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ V2TIMConversationListFilter val$filter;

        public AnonymousClass16(ConversationProvider conversationProvider, V2TIMConversationListFilter v2TIMConversationListFilter, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMConversationResult v2TIMConversationResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMConversationResult v2TIMConversationResult) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements V2TIMValueCallback<V2TIMConversation> {
        public final /* synthetic */ ConversationProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass2(ConversationProvider conversationProvider, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements V2TIMValueCallback<Long> {
        public final /* synthetic */ ConversationProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass3(ConversationProvider conversationProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(Long l2) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Long l2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements V2TIMCallback {
        public final /* synthetic */ ConversationProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass4(ConversationProvider conversationProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements V2TIMValueCallback<List<V2TIMConversationOperationResult>> {
        public final /* synthetic */ ConversationProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass5(ConversationProvider conversationProvider, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements V2TIMValueCallback<List<V2TIMConversationOperationResult>> {
        public final /* synthetic */ ConversationProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass6(ConversationProvider conversationProvider, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements V2TIMCallback {
        public final /* synthetic */ ConversationProvider this$0;

        public AnonymousClass7(ConversationProvider conversationProvider) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements V2TIMCallback {
        public final /* synthetic */ ConversationProvider this$0;

        public AnonymousClass8(ConversationProvider conversationProvider) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements V2TIMValueCallback<List<V2TIMConversationOperationResult>> {
        public final /* synthetic */ ConversationProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass9(ConversationProvider conversationProvider, IUIKitCallback iUIKitCallback) {
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

    public static /* synthetic */ String access$000() {
    }

    public static /* synthetic */ boolean access$100(ConversationProvider conversationProvider) {
    }

    public static /* synthetic */ boolean access$102(ConversationProvider conversationProvider, boolean z) {
    }

    public static /* synthetic */ long access$200(ConversationProvider conversationProvider) {
    }

    public static /* synthetic */ long access$202(ConversationProvider conversationProvider, long j2) {
    }

    public static /* synthetic */ List access$300(ConversationProvider conversationProvider) {
    }

    public void clearHistoryMessage(String str, boolean z, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void deleteConversation(String str, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void getConversation(String str, IUIKitCallback<ConversationInfo> iUIKitCallback) {
    }

    public void getGroupMemberIconList(String str, int i2, IUIKitCallback<List<Object>> iUIKitCallback) {
    }

    public void getMarkConversationList(V2TIMConversationListFilter v2TIMConversationListFilter, boolean z, IUIKitCallback<List<ConversationInfo>> iUIKitCallback) {
    }

    public void getTotalUnreadMessageCount(IUIKitCallback<Long> iUIKitCallback) {
    }

    public boolean isLoadFinished() {
    }

    public void loadConversation(long j2, int i2, IUIKitCallback<List<ConversationInfo>> iUIKitCallback) {
    }

    public void loadConversationUserStatus(List<ConversationInfo> list, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void loadMoreConversation(int i2, IUIKitCallback<List<ConversationInfo>> iUIKitCallback) {
    }

    public void loadSuccess(boolean z, long j2) {
    }

    public void markConversationFold(String str, boolean z, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void markConversationHidden(String str, boolean z, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void markConversationUnread(ConversationInfo conversationInfo, boolean z, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void readlyLoad() {
    }

    public void setConversationTop(String str, boolean z, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void subscribeConversationUserStatus(List<String> list, IUIKitCallback<Void> iUIKitCallback) {
    }
}
