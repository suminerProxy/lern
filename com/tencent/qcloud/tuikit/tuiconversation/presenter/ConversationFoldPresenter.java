package com.tencent.qcloud.tuikit.tuiconversation.presenter;

import com.tencent.imsdk.v2.V2TIMUserStatus;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener;
import com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListAdapter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ConversationFoldPresenter {
    private static final int GET_CONVERSATION_COUNT = 100;
    private static final String TAG = "ConversationFoldPresenter";
    private IConversationListAdapter adapter;
    public ConversationEventListener conversationEventForMarkObserver;
    private final List<ConversationInfo> loadedConversationInfoList;
    private final ConversationProvider provider;

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationFoldPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements ConversationEventListener {
        public final /* synthetic */ ConversationFoldPresenter this$0;

        public AnonymousClass1(ConversationFoldPresenter conversationFoldPresenter) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener
        public void clearConversationMessage(String str, boolean z) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener
        public void clearFoldMarkAndDeleteConversation(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener
        public void deleteConversation(String str, boolean z) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener
        public long getUnreadTotal() {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener
        public boolean isTopConversation(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener
        public void onConversationChanged(List<ConversationInfo> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener
        public void onFriendRemarkChanged(String str, String str2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener
        public void onNewConversation(List<ConversationInfo> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener
        public void onReceiveMessage(String str, boolean z) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener
        public void onSyncServerFinish() {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener
        public void onUserStatusChanged(List<V2TIMUserStatus> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener
        public void refreshUserStatusFragmentUI() {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener
        public void setConversationTop(String str, boolean z, IUIKitCallback<Void> iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener
        public void updateTotalUnreadMessageCount(long j2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationFoldPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<List<ConversationInfo>> {
        public final /* synthetic */ ConversationFoldPresenter this$0;

        public AnonymousClass2(ConversationFoldPresenter conversationFoldPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<ConversationInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<ConversationInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationFoldPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<ConversationInfo> {
        public final /* synthetic */ ConversationFoldPresenter this$0;

        public AnonymousClass3(ConversationFoldPresenter conversationFoldPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(ConversationInfo conversationInfo) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(ConversationInfo conversationInfo) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationFoldPresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IUIKitCallback<Void> {
        public final /* synthetic */ ConversationFoldPresenter this$0;
        public final /* synthetic */ ConversationInfo val$conversationInfo;
        public final /* synthetic */ boolean val$isHidden;

        public AnonymousClass4(ConversationFoldPresenter conversationFoldPresenter, ConversationInfo conversationInfo, boolean z) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r3) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationFoldPresenter$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends IUIKitCallback<Void> {
        public final /* synthetic */ ConversationFoldPresenter this$0;
        public final /* synthetic */ ConversationInfo val$conversationInfo;
        public final /* synthetic */ boolean val$markUnread;

        public AnonymousClass5(ConversationFoldPresenter conversationFoldPresenter, ConversationInfo conversationInfo, boolean z) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r3) {
        }
    }

    public static /* synthetic */ void access$000(ConversationFoldPresenter conversationFoldPresenter, String str, boolean z) {
    }

    public static /* synthetic */ void access$100(ConversationFoldPresenter conversationFoldPresenter, List list) {
    }

    public static /* synthetic */ String access$200() {
    }

    public static /* synthetic */ IConversationListAdapter access$300(ConversationFoldPresenter conversationFoldPresenter) {
    }

    private void onLoadConversationCompleted(List<ConversationInfo> list) {
    }

    private ArrayList<ConversationInfo> processFoldedAndHiddenConversation(List<ConversationInfo> list) {
    }

    private void processNewMessage(String str, boolean z) {
    }

    private void refreshChangedInfo(List<ConversationInfo> list, ArrayList<ConversationInfo> arrayList) {
    }

    public void deleteConversation(ConversationInfo conversationInfo) {
    }

    public void deleteConversationFromUI(String str, boolean z) {
    }

    public void initListener() {
    }

    public void loadConversation() {
    }

    public void markConversationHidden(ConversationInfo conversationInfo, boolean z) {
    }

    public void markConversationUnread(ConversationInfo conversationInfo, boolean z) {
    }

    public void onConversationChanged(List<ConversationInfo> list) {
    }

    public void onNewConversation(List<ConversationInfo> list) {
    }

    public void setAdapter(IConversationListAdapter iConversationListAdapter) {
    }

    public void deleteConversationFromUI(String str) {
    }
}
