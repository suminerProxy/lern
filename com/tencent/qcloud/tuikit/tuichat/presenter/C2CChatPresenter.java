package com.tencent.qcloud.tuikit.tuichat.presenter;

import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageReceiptInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.MessageTypingBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class C2CChatPresenter extends ChatPresenter {
    private static final String TAG = "C2CChatPresenter";
    private C2CChatEventListener chatEventListener;
    private ChatInfo chatInfo;
    private ChatPresenter.TypingListener typingListener;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.C2CChatPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends C2CChatEventListener {
        public final /* synthetic */ C2CChatPresenter this$0;

        public AnonymousClass1(C2CChatPresenter c2CChatPresenter) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener
        public void addMessage(TUIMessageBean tUIMessageBean, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener
        public void clearC2CMessage(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener
        public void exitC2CChat(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener
        public void handleRevoke(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener
        public void onFriendNameChanged(String str, String str2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener
        public void onMessageChanged(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener
        public void onReadReport(List<MessageReceiptInfo> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener
        public void onRecvMessageModified(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener
        public void onRecvNewMessage(TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.C2CChatPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<List<TUIMessageBean>> {
        public final /* synthetic */ C2CChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ TUIMessageBean val$lastMessageInfo;
        public final /* synthetic */ int val$type;

        public AnonymousClass2(C2CChatPresenter c2CChatPresenter, TUIMessageBean tUIMessageBean, IUIKitCallback iUIKitCallback, int i2) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.C2CChatPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<String[]> {
        public final /* synthetic */ C2CChatPresenter this$0;

        public AnonymousClass3(C2CChatPresenter c2CChatPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(String[] strArr) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(String[] strArr) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.C2CChatPresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ C2CChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ TUIMessageBean val$message;

        public AnonymousClass4(C2CChatPresenter c2CChatPresenter, TUIMessageBean tUIMessageBean, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onProgress(Object obj) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(TUIMessageBean tUIMessageBean) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(TUIMessageBean tUIMessageBean) {
        }
    }

    public static /* synthetic */ ChatInfo access$000(C2CChatPresenter c2CChatPresenter) {
    }

    public static /* synthetic */ String access$100() {
    }

    public static /* synthetic */ void access$200(C2CChatPresenter c2CChatPresenter, MessageTypingBean messageTypingBean) {
    }

    private void parseTypingMessage(MessageTypingBean messageTypingBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public ChatInfo getChatInfo() {
    }

    public void initListener() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public boolean isSupportTyping(long j2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void loadMessage(int i2, TUIMessageBean tUIMessageBean, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void onFriendInfoChanged() {
    }

    public void onFriendNameChanged(String str) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void onMessageLoadCompleted(List<TUIMessageBean> list, int i2) {
    }

    public void onReadReport(List<MessageReceiptInfo> list) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void sendTypingStatusMessage(TUIMessageBean tUIMessageBean, String str, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
    }

    public void setChatInfo(ChatInfo chatInfo) {
    }

    public void setTypingListener(ChatPresenter.TypingListener typingListener) {
    }
}
