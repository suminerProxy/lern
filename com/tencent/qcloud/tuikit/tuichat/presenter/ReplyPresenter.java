package com.tencent.qcloud.tuikit.tuichat.presenter;

import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageRepliesBean;
import com.tencent.qcloud.tuikit.tuichat.bean.ReactUserBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener;
import com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener;
import com.tencent.qcloud.tuikit.tuichat.model.ChatProvider;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IReplyMessageHandler;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ReplyPresenter {
    private C2CChatEventListener c2CChatEventListener;
    private ChatInfo chatInfo;
    private ChatPresenter chatPresenter;
    private GroupChatEventListener groupChatEventListener;
    private String messageId;
    private ChatProvider provider;
    private IReplyMessageHandler replyHandler;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ReplyPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends C2CChatEventListener {
        public final /* synthetic */ ReplyPresenter this$0;

        public AnonymousClass1(ReplyPresenter replyPresenter) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener
        public void onRecvMessageModified(TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ReplyPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends GroupChatEventListener {
        public final /* synthetic */ ReplyPresenter this$0;

        public AnonymousClass2(ReplyPresenter replyPresenter) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onRecvMessageModified(TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ReplyPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<List<TUIMessageBean>> {
        public final /* synthetic */ ReplyPresenter this$0;
        public final /* synthetic */ Map val$messageBeanMap;
        public final /* synthetic */ List val$replyBeanList;

        public AnonymousClass3(ReplyPresenter replyPresenter, List list, Map map) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ReplyPresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IUIKitCallback<Map<String, ReactUserBean>> {
        public final /* synthetic */ ReplyPresenter this$0;
        public final /* synthetic */ Map val$replyBeanDataMap;

        public AnonymousClass4(ReplyPresenter replyPresenter, Map map) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Map<String, ReactUserBean> map) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Map<String, ReactUserBean> map) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ReplyPresenter$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ReplyPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ReplyPresenter$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<Void> {
            public final /* synthetic */ AnonymousClass5 this$1;

            public AnonymousClass1(AnonymousClass5 anonymousClass5) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }
        }

        public AnonymousClass5(ReplyPresenter replyPresenter, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ReplyPresenter$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends IUIKitCallback<Map<String, ReactUserBean>> {
        public final /* synthetic */ ReplyPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ List val$messageBeanList;

        public AnonymousClass6(ReplyPresenter replyPresenter, List list, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Map<String, ReactUserBean> map) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Map<String, ReactUserBean> map) {
        }
    }

    public static /* synthetic */ String access$000(ReplyPresenter replyPresenter) {
    }

    public static /* synthetic */ void access$100(ReplyPresenter replyPresenter, TUIMessageBean tUIMessageBean) {
    }

    public static /* synthetic */ void access$200(ReplyPresenter replyPresenter, Map map) {
    }

    public static /* synthetic */ IReplyMessageHandler access$300(ReplyPresenter replyPresenter) {
    }

    public static /* synthetic */ ChatInfo access$400(ReplyPresenter replyPresenter) {
    }

    public static /* synthetic */ ChatPresenter access$500(ReplyPresenter replyPresenter) {
    }

    private void onMessageModified(TUIMessageBean tUIMessageBean) {
    }

    private void processReplyBeanList(Map<MessageRepliesBean.ReplyBean, TUIMessageBean> map) {
    }

    public void findReplyMessages(MessageRepliesBean messageRepliesBean) {
    }

    public ChatPresenter getChatPresenter() {
    }

    public void getReactUserBean(TUIMessageBean tUIMessageBean, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void sendReplyMessage(TUIMessageBean tUIMessageBean, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
    }

    public void setChatEventListener() {
    }

    public void setChatInfo(ChatInfo chatInfo) {
    }

    public void setMessageId(String str) {
    }

    public void setReplyHandler(IReplyMessageHandler iReplyMessageHandler) {
    }
}
