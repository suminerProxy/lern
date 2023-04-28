package com.tencent.qcloud.tuikit.tuiconversation.presenter;

import com.tencent.imsdk.v2.V2TIMUserStatus;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuiconversation.interfaces.ConversationEventListener;
import com.tencent.qcloud.tuikit.tuiconversation.model.ConversationProvider;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ConversationPresenter {
    private static final int GET_CONVERSATION_COUNT = 100;
    public static final int SHOW_TYPE_CONVERSATION_LIST = 0;
    public static final int SHOW_TYPE_CONVERSATION_LIST_WITH_FOLD = 1;
    public static final String TAG = "ConversationPresenter";
    public IConversationListAdapter adapter;
    public ConversationEventListener conversationEventListener;
    public List<ConversationInfo> foldConversationInfoList;
    private boolean hideFoldItem;
    private boolean isUnreadStatusOfFoldItem;
    public final List<ConversationInfo> loadedConversationInfoList;
    public ConversationInfo mUIFoldConversation;
    private HashMap<String, ConversationInfo> markUnreadAndHiddenMap;
    public final ConversationProvider provider;
    public int showType;
    private long totalUnreadCount;

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements ConversationEventListener {
        public final /* synthetic */ ConversationPresenter this$0;

        public AnonymousClass1(ConversationPresenter conversationPresenter) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 extends IUIKitCallback<Void> {
        public final /* synthetic */ ConversationPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ ConversationInfo val$conversationInfo;
        public final /* synthetic */ boolean val$isTop;

        public AnonymousClass10(ConversationPresenter conversationPresenter, ConversationInfo conversationInfo, boolean z, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 extends IUIKitCallback<Void> {
        public final /* synthetic */ ConversationPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ ConversationInfo val$conversation;

        public AnonymousClass11(ConversationPresenter conversationPresenter, ConversationInfo conversationInfo, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r4) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 extends IUIKitCallback<Void> {
        public final /* synthetic */ ConversationPresenter this$0;

        public AnonymousClass12(ConversationPresenter conversationPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r1) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 extends IUIKitCallback<Void> {
        public final /* synthetic */ ConversationPresenter this$0;
        public final /* synthetic */ ConversationInfo val$conversationInfo;
        public final /* synthetic */ boolean val$isHidden;

        public AnonymousClass13(ConversationPresenter conversationPresenter, ConversationInfo conversationInfo, boolean z) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 extends IUIKitCallback<Void> {
        public final /* synthetic */ ConversationPresenter this$0;
        public final /* synthetic */ ConversationInfo val$conversationInfo;
        public final /* synthetic */ boolean val$markUnread;

        public AnonymousClass14(ConversationPresenter conversationPresenter, ConversationInfo conversationInfo, boolean z) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 extends IUIKitCallback<Void> {
        public final /* synthetic */ ConversationPresenter this$0;

        public AnonymousClass15(ConversationPresenter conversationPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r1) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass16 extends IUIKitCallback<Void> {
        public final /* synthetic */ ConversationPresenter this$0;
        public final /* synthetic */ String val$conversationId;
        public final /* synthetic */ ConversationInfo val$finalConversationInfo;

        public AnonymousClass16(ConversationPresenter conversationPresenter, ConversationInfo conversationInfo, String str) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<List<ConversationInfo>> {
        public final /* synthetic */ ConversationPresenter this$0;

        public AnonymousClass2(ConversationPresenter conversationPresenter) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<List<ConversationInfo>> {
        public final /* synthetic */ ConversationPresenter this$0;

        public AnonymousClass3(ConversationPresenter conversationPresenter) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IUIKitCallback<Long> {
        public final /* synthetic */ ConversationPresenter this$0;

        public AnonymousClass4(ConversationPresenter conversationPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Long l2) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Long l2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends IUIKitCallback<List<ConversationInfo>> {
        public final /* synthetic */ ConversationPresenter this$0;

        public AnonymousClass5(ConversationPresenter conversationPresenter) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends IUIKitCallback<Void> {
        public final /* synthetic */ ConversationPresenter this$0;
        public final /* synthetic */ List val$conversationInfoList;

        public AnonymousClass6(ConversationPresenter conversationPresenter, List list) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 extends IUIKitCallback<Void> {
        public final /* synthetic */ ConversationPresenter this$0;

        public AnonymousClass7(ConversationPresenter conversationPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 extends IUIKitCallback<ConversationInfo> {
        public final /* synthetic */ ConversationPresenter this$0;

        public AnonymousClass8(ConversationPresenter conversationPresenter) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 extends IUIKitCallback<Void> {
        public final /* synthetic */ ConversationPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ ConversationInfo val$conversation;
        public final /* synthetic */ boolean val$setTop;

        public AnonymousClass9(ConversationPresenter conversationPresenter, ConversationInfo conversationInfo, boolean z, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r2) {
        }
    }

    public static /* synthetic */ long access$000(ConversationPresenter conversationPresenter) {
    }

    public static /* synthetic */ void access$100(ConversationPresenter conversationPresenter) {
    }

    public static /* synthetic */ void access$200(ConversationPresenter conversationPresenter, long j2) {
    }

    public static /* synthetic */ boolean access$300(ConversationPresenter conversationPresenter, List list) {
    }

    public static /* synthetic */ void access$400(ConversationPresenter conversationPresenter) {
    }

    public static /* synthetic */ void access$500(ConversationPresenter conversationPresenter, String str, boolean z) {
    }

    public static /* synthetic */ HashMap access$600(ConversationPresenter conversationPresenter) {
    }

    private void hideFoldItemFromUI() {
    }

    private void loadMarkedConversation() {
    }

    private ArrayList<ConversationInfo> processConversationList(List<ConversationInfo> list) {
    }

    private ArrayList<ConversationInfo> processConversationListWithFold(List<ConversationInfo> list) {
    }

    private ArrayList<ConversationInfo> processHiddenConversation(List<ConversationInfo> list) {
    }

    private void processNewMessage(String str, boolean z) {
    }

    private void refreshUnreadCount() {
    }

    private boolean updateMarkedUnreadAndHiddenList(List<ConversationInfo> list) {
    }

    private void updateTotalUnreadMessageCount(long j2) {
    }

    public void clearConversationMessage(ConversationInfo conversationInfo) {
    }

    public void clearFoldMarkAndDeleteConversation(String str) {
    }

    public void deleteConversation(ConversationInfo conversationInfo) {
    }

    public ConversationInfo getFirstFoldInfo() {
    }

    public void hideFoldItem(boolean z) {
    }

    public boolean isLoadFinished() {
    }

    public boolean isTopConversation(String str) {
    }

    public void loadAndSubscribeConversationUserStatus(List<ConversationInfo> list) {
    }

    public void loadConversation(long j2) {
    }

    public void loadMoreConversation() {
    }

    public void markConversationHidden(ConversationInfo conversationInfo, boolean z) {
    }

    public void markConversationUnread(ConversationInfo conversationInfo, boolean z) {
    }

    public void onConversationChanged(List<ConversationInfo> list) {
    }

    public void onFriendRemarkChanged(String str, String str2) {
    }

    public void onLoadConversationCompleted(List<ConversationInfo> list) {
    }

    public void onNewConversation(List<ConversationInfo> list, boolean z) {
    }

    public void onUserStatusChanged(List<V2TIMUserStatus> list) {
    }

    public void refreshChangedInfo(List<ConversationInfo> list, ArrayList<ConversationInfo> arrayList) {
    }

    public void setAdapter(IConversationListAdapter iConversationListAdapter) {
    }

    public void setConversationListener() {
    }

    public void setConversationTop(ConversationInfo conversationInfo, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void setShowType(int i2) {
    }

    public void setUnreadStatusOfFoldItem(boolean z) {
    }

    public void updateAdapter() {
    }

    public void updateUnreadTotal(long j2) {
    }

    public void deleteConversation(ConversationInfo conversationInfo, IUIKitCallback iUIKitCallback) {
    }

    public void clearConversationMessage(String str, boolean z) {
    }

    public void deleteConversation(String str, boolean z) {
    }

    public void setConversationTop(String str, boolean z, IUIKitCallback<Void> iUIKitCallback) {
    }
}
