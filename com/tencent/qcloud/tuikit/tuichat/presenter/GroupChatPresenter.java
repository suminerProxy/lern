package com.tencent.qcloud.tuikit.tuichat.presenter;

import android.util.Pair;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.GroupApplyInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageReceiptInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupChatPresenter extends ChatPresenter {
    private static final String TAG = "GroupChatPresenter";
    private List<GroupApplyInfo> currentApplies;
    private List<GroupMemberInfo> currentGroupMembers;
    private GroupChatEventListener groupChatEventListener;
    private GroupInfo groupInfo;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.GroupChatPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends GroupChatEventListener {
        public final /* synthetic */ GroupChatPresenter this$0;

        public AnonymousClass1(GroupChatPresenter groupChatPresenter) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void addMessage(TUIMessageBean tUIMessageBean, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void clearGroupMessage(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void exitGroupChat(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void handleRevoke(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onApplied(int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onGroupForceExit(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onGroupNameChanged(String str, String str2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onMessageChanged(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onReadReport(List<MessageReceiptInfo> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onRecvMessageModified(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onRecvNewMessage(TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.GroupChatPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<List<TUIMessageBean>> {
        public final /* synthetic */ GroupChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ TUIMessageBean val$lastMessageInfo;
        public final /* synthetic */ int val$type;

        public AnonymousClass2(GroupChatPresenter groupChatPresenter, TUIMessageBean tUIMessageBean, int i2, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<TUIMessageBean> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<TUIMessageBean> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.GroupChatPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ GroupChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ String val$groupId;

        public AnonymousClass3(GroupChatPresenter groupChatPresenter, IUIKitCallback iUIKitCallback, String str) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(TUIMessageBean tUIMessageBean) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.GroupChatPresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IUIKitCallback<List<GroupMemberInfo>> {
        public final /* synthetic */ GroupChatPresenter this$0;

        public AnonymousClass4(GroupChatPresenter groupChatPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<GroupMemberInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<GroupMemberInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.GroupChatPresenter$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends IUIKitCallback<List<String>> {
        public final /* synthetic */ GroupChatPresenter this$0;

        public AnonymousClass5(GroupChatPresenter groupChatPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<String> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<String> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.GroupChatPresenter$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends IUIKitCallback<Pair<Integer, String>> {
        public final /* synthetic */ GroupChatPresenter this$0;

        public AnonymousClass6(GroupChatPresenter groupChatPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Pair<Integer, String> pair) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Pair<Integer, String> pair) {
        }
    }

    public static /* synthetic */ GroupInfo access$000(GroupChatPresenter groupChatPresenter) {
    }

    public static /* synthetic */ String access$100() {
    }

    public static /* synthetic */ List access$200(GroupChatPresenter groupChatPresenter) {
    }

    private void addGroupMessage(TUIMessageBean tUIMessageBean) {
    }

    private void sendGroupTipsMessage(String str, String str2, IUIKitCallback<String> iUIKitCallback) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void addMessageInfo(TUIMessageBean tUIMessageBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void assembleGroupMessage(TUIMessageBean tUIMessageBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public ChatInfo getChatInfo() {
    }

    public void initListener() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void loadMessage(int i2, TUIMessageBean tUIMessageBean, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void onApplied(int i2) {
    }

    public void onGroupForceExit(String str) {
    }

    public void onGroupNameChanged(String str) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void onMessageLoadCompleted(List<TUIMessageBean> list, int i2) {
    }

    public void onReadReport(List<MessageReceiptInfo> list) {
    }

    public void setGroupInfo(GroupInfo groupInfo) {
    }
}
