package com.tencent.qcloud.tuikit.tuichat.presenter;

import android.os.Handler;
import android.os.Message;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.GroupApplyInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageReceiptInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.OfflinePushInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.ReactUserBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.ReplyMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.interfaces.IBaseMessageSender;
import com.tencent.qcloud.tuikit.tuichat.model.ChatProvider;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatModifyMessageHelper;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageAdapter;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class ChatPresenter {
    public static final int FORWARD_C2C_INTERVAL = 50;
    public static final int FORWARD_GROUP_INTERVAL = 90;
    public static final int MSG_PAGE_COUNT = 20;
    public static final int READ_REPORT_INTERVAL = 1000;
    public static final String TAG = "ChatPresenter";
    public IBaseMessageSender baseMessageSender;
    public boolean canReadReport;
    public ChatNotifyHandler chatNotifyHandler;
    public int currentChatUnreadCount;
    public boolean isChatFragmentShow;
    public boolean isHaveMoreNewMessage;
    public boolean isHaveMoreOldMessage;
    public boolean isLoading;
    public long lastReadReportTime;
    public List<TUIMessageBean> loadedMessageInfoList;
    public TUIMessageBean locateMessage;
    public TUIMessageBean mCacheNewMessage;
    public IMessageAdapter messageListAdapter;
    public MessageRecyclerView messageRecyclerView;
    public final ChatProvider provider;
    public final MessageReadReportHandler readReportHandler;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements IBaseMessageSender {
        public final /* synthetic */ ChatPresenter this$0;

        public AnonymousClass1(ChatPresenter chatPresenter) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.IBaseMessageSender
        public void sendMessage(TUIMessageBean tUIMessageBean, String str, boolean z) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 extends IUIKitCallback<List<TUIMessageBean>> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass10(ChatPresenter chatPresenter, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 implements Runnable {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ List val$data;
        public final /* synthetic */ CountDownLatch val$latch;
        public final /* synthetic */ List val$msgIdList;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$11$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<List<TUIMessageBean>> {
            public final /* synthetic */ AnonymousClass11 this$1;

            public AnonymousClass1(AnonymousClass11 anonymousClass11) {
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

        public AnonymousClass11(ChatPresenter chatPresenter, List list, CountDownLatch countDownLatch, List list2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 implements Runnable {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ List val$data;
        public final /* synthetic */ CountDownLatch val$latch;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$12$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<Map<String, ReactUserBean>> {
            public final /* synthetic */ AnonymousClass12 this$1;

            public AnonymousClass1(AnonymousClass12 anonymousClass12) {
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

        public AnonymousClass12(ChatPresenter chatPresenter, List list, CountDownLatch countDownLatch) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 implements Runnable {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ List val$data;
        public final /* synthetic */ CountDownLatch val$latch;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$13$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass13 this$1;

            public AnonymousClass1(AnonymousClass13 anonymousClass13) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass13(ChatPresenter chatPresenter, CountDownLatch countDownLatch, IUIKitCallback iUIKitCallback, List list) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ TUIMessageBean val$messageInfo;

        public AnonymousClass14(ChatPresenter chatPresenter, TUIMessageBean tUIMessageBean) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 extends IUIKitCallback<Void> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass15(ChatPresenter chatPresenter, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass16 implements Runnable {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ TUIMessageBean val$message;
        public final /* synthetic */ boolean val$retry;

        public AnonymousClass16(ChatPresenter chatPresenter, TUIMessageBean tUIMessageBean, boolean z, IUIKitCallback iUIKitCallback) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass17 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ TUIMessageBean val$message;

        public AnonymousClass17(ChatPresenter chatPresenter, TUIMessageBean tUIMessageBean, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass18 extends IUIKitCallback<Void> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ TUIMessageBean val$messageInfo;

        public AnonymousClass18(ChatPresenter chatPresenter, TUIMessageBean tUIMessageBean) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass19 implements Runnable {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ String val$chatId;
        public final /* synthetic */ boolean val$isGroup;

        public AnonymousClass19(ChatPresenter chatPresenter, String str, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<List<TUIMessageBean>> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<Void> {
            public final /* synthetic */ AnonymousClass2 this$1;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
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

        public AnonymousClass2(ChatPresenter chatPresenter, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass20 extends IUIKitCallback<Void> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ List val$messageInfos;

        public AnonymousClass20(ChatPresenter chatPresenter, List list) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$21  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass21 extends IUIKitCallback<Void> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ List val$msgs;

        public AnonymousClass21(ChatPresenter chatPresenter, List list) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$22  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass22 extends IUIKitCallback<Void> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ TUIMessageBean val$message;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$22$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<Void> {
            public final /* synthetic */ AnonymousClass22 this$1;

            public AnonymousClass1(AnonymousClass22 anonymousClass22) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }
        }

        public AnonymousClass22(ChatPresenter chatPresenter, TUIMessageBean tUIMessageBean) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$23  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass23 implements Runnable {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ String val$id;
        public final /* synthetic */ boolean val$isGroup;
        public final /* synthetic */ List val$msgInfos;
        public final /* synthetic */ String val$offlineTitle;
        public final /* synthetic */ boolean val$selfConversation;

        public AnonymousClass23(ChatPresenter chatPresenter, boolean z, List list, boolean z2, IUIKitCallback iUIKitCallback, String str, String str2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$24  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass24 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ TUIMessageBean val$message;

        public AnonymousClass24(ChatPresenter chatPresenter, IUIKitCallback iUIKitCallback, TUIMessageBean tUIMessageBean) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$25  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass25 extends IUIKitCallback<List<GroupApplyInfo>> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass25(ChatPresenter chatPresenter, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<GroupApplyInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<GroupApplyInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$26  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass26 extends IUIKitCallback<List<TUIMessageBean>> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass26(ChatPresenter chatPresenter, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$27  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass27 extends IUIKitCallback<List<TUIMessageBean>> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass27(ChatPresenter chatPresenter, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$28  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass28 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ TUIMessageBean val$messageBean;

        public AnonymousClass28(ChatPresenter chatPresenter, TUIMessageBean tUIMessageBean) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$29  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass29 extends IUIKitCallback<List<MessageReceiptInfo>> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ TUIMessageBean val$messageBean;

        public AnonymousClass29(ChatPresenter chatPresenter, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<MessageReceiptInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<MessageReceiptInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<List<TUIMessageBean>> {
            public final /* synthetic */ AnonymousClass3 this$1;

            public AnonymousClass1(AnonymousClass3 anonymousClass3) {
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

        public AnonymousClass3(ChatPresenter chatPresenter, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$30  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass30 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ ReplyMessageBean val$replyMessageBean;

        public AnonymousClass30(ChatPresenter chatPresenter, ReplyMessageBean replyMessageBean, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$31  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass31 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ChatPresenter this$0;

        public AnonymousClass31(ChatPresenter chatPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$32  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass32 extends ChatModifyMessageHelper.ModifyMessageTask {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ ReplyMessageBean val$replyMessage;

        public AnonymousClass32(ChatPresenter chatPresenter, TUIMessageBean tUIMessageBean, IUIKitCallback iUIKitCallback, ReplyMessageBean replyMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatModifyMessageHelper.ModifyMessageTask
        public TUIMessageBean packageMessage(TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$33  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass33 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ ReplyMessageBean val$replyMessageBean;

        public AnonymousClass33(ChatPresenter chatPresenter, ReplyMessageBean replyMessageBean, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$34  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass34 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ TUIMessageBean val$rootMessage;

        public AnonymousClass34(ChatPresenter chatPresenter, TUIMessageBean tUIMessageBean) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$35  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass35 extends ChatModifyMessageHelper.ModifyMessageTask {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ ReplyMessageBean val$replyMessage;

        public AnonymousClass35(ChatPresenter chatPresenter, TUIMessageBean tUIMessageBean, IUIKitCallback iUIKitCallback, ReplyMessageBean replyMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatModifyMessageHelper.ModifyMessageTask
        public TUIMessageBean packageMessage(TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$36  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass36 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ChatPresenter this$0;

        public AnonymousClass36(ChatPresenter chatPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$37  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass37 extends ChatModifyMessageHelper.ModifyMessageTask {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ String val$emojiId;

        public AnonymousClass37(ChatPresenter chatPresenter, TUIMessageBean tUIMessageBean, IUIKitCallback iUIKitCallback, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatModifyMessageHelper.ModifyMessageTask
        public TUIMessageBean packageMessage(TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$38  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass38 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ChatPresenter this$0;

        public AnonymousClass38(ChatPresenter chatPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onError(int i2, String str, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(TUIMessageBean tUIMessageBean) {
        }

        /* renamed from: onError  reason: avoid collision after fix types in other method */
        public void onError2(int i2, String str, TUIMessageBean tUIMessageBean) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$39  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass39 extends IUIKitCallback<List<GroupMemberInfo>> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ Map val$reactUserBeanMap;

        public AnonymousClass39(ChatPresenter chatPresenter, Map map, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ String val$chatId;
        public final /* synthetic */ List val$firstLoadedData;
        public final /* synthetic */ boolean[] val$isFailed;
        public final /* synthetic */ boolean val$isGroup;
        public final /* synthetic */ CountDownLatch val$latch;
        public final /* synthetic */ int val$loadCount;
        public final /* synthetic */ TUIMessageBean val$locateMessageInfo;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<List<TUIMessageBean>> {
            public final /* synthetic */ AnonymousClass4 this$1;

            public AnonymousClass1(AnonymousClass4 anonymousClass4) {
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

        public AnonymousClass4(ChatPresenter chatPresenter, String str, boolean z, int i2, TUIMessageBean tUIMessageBean, List list, CountDownLatch countDownLatch, IUIKitCallback iUIKitCallback, boolean[] zArr) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$40  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass40 extends IUIKitCallback<List<ReactUserBean>> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ Map val$reactUserBeanMap;

        public AnonymousClass40(ChatPresenter chatPresenter, Map map, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<ReactUserBean> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<ReactUserBean> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements Runnable {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ String val$chatId;
        public final /* synthetic */ boolean[] val$isFailed;
        public final /* synthetic */ boolean val$isGroup;
        public final /* synthetic */ CountDownLatch val$latch;
        public final /* synthetic */ int val$loadCount;
        public final /* synthetic */ TUIMessageBean val$locateMessageInfo;
        public final /* synthetic */ List val$secondLoadedData;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<List<TUIMessageBean>> {
            public final /* synthetic */ AnonymousClass5 this$1;

            public AnonymousClass1(AnonymousClass5 anonymousClass5) {
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

        public AnonymousClass5(ChatPresenter chatPresenter, String str, boolean z, int i2, TUIMessageBean tUIMessageBean, List list, CountDownLatch countDownLatch, boolean[] zArr) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements Runnable {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ List val$firstLoadedData;
        public final /* synthetic */ int val$getType;
        public final /* synthetic */ boolean[] val$isFailed;
        public final /* synthetic */ CountDownLatch val$latch;
        public final /* synthetic */ List val$secondLoadedData;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$6$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass6 this$1;

            public AnonymousClass1(AnonymousClass6 anonymousClass6) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass6(ChatPresenter chatPresenter, CountDownLatch countDownLatch, boolean[] zArr, IUIKitCallback iUIKitCallback, List list, List list2, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 extends IUIKitCallback<List<TUIMessageBean>> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ int val$getType;
        public final /* synthetic */ int val$loadCount;

        public AnonymousClass7(ChatPresenter chatPresenter, int i2, int i3, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 extends IUIKitCallback<List<MessageReceiptInfo>> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ List val$data;
        public final /* synthetic */ int val$getType;

        public AnonymousClass8(ChatPresenter chatPresenter, List list, int i2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<MessageReceiptInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<MessageReceiptInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 extends IUIKitCallback<List<TUIMessageBean>> {
        public final /* synthetic */ ChatPresenter this$0;
        public final /* synthetic */ List val$data;
        public final /* synthetic */ int val$type;

        public AnonymousClass9(ChatPresenter chatPresenter, int i2, List list) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface ChatNotifyHandler {
        void onApplied(int i2);

        void onExitChat(String str);

        void onFriendNameChanged(String str);

        void onGroupForceExit();

        void onGroupNameChanged(String str);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class MessageReadReportHandler extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface TypingListener {
        void onTyping(int i2);
    }

    public void addMessage(TUIMessageBean tUIMessageBean) {
    }

    public void addMessageAfterPreProcess(TUIMessageBean tUIMessageBean) {
    }

    public void addMessageInfo(TUIMessageBean tUIMessageBean) {
    }

    public void assembleGroupMessage(TUIMessageBean tUIMessageBean) {
    }

    public void c2cReadReport(String str) {
    }

    public boolean checkExist(TUIMessageBean tUIMessageBean) {
    }

    public boolean checkFailedMessageInfos(List<TUIMessageBean> list) {
    }

    public void clearMessage() {
    }

    public void deleteMessage(TUIMessageBean tUIMessageBean) {
    }

    public void deleteMessageInfos(List<TUIMessageBean> list) {
    }

    public void deleteMessages(List<Integer> list) {
    }

    public void filterGroupMessageReceipt(TUIMessageBean tUIMessageBean, String str) {
    }

    public void findMessage(String str, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
    }

    public void forwardMessage(List<TUIMessageBean> list, boolean z, String str, String str2, int i2, boolean z2, IUIKitCallback iUIKitCallback) {
    }

    public void forwardMessageInternal(TUIMessageBean tUIMessageBean, boolean z, String str, OfflinePushInfo offlinePushInfo, IUIKitCallback iUIKitCallback) {
    }

    public void forwardMessageMerge(List<TUIMessageBean> list, boolean z, String str, String str2, boolean z2, IUIKitCallback iUIKitCallback) {
    }

    public void forwardMessageOneByOne(List<TUIMessageBean> list, boolean z, String str, String str2, boolean z2, IUIKitCallback iUIKitCallback) {
    }

    public List<TUIMessageBean> forwardTextMessageForSelected(List<TUIMessageBean> list) {
    }

    public ChatInfo getChatInfo() {
    }

    public void getConversationLastMessage(String str, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
    }

    public void getMessageReadReceipt(List<TUIMessageBean> list, int i2) {
    }

    public void getReactUserBean(Set<String> set, IUIKitCallback<Map<String, ReactUserBean>> iUIKitCallback) {
    }

    public Set<String> getReactUserNames(List<TUIMessageBean> list) {
    }

    public void getReadReceiptAndRefresh(TUIMessageBean tUIMessageBean) {
    }

    public List<TUIMessageBean> getSelectPositionMessage(List<Integer> list) {
    }

    public List<TUIMessageBean> getSelectPositionMessageById(List<String> list) {
    }

    public void groupReadReport(String str) {
    }

    public void handleRevoke(String str) {
    }

    public void initMessageSender() {
    }

    public boolean isChatFragmentShow() {
    }

    public boolean isSupportTyping(long j2) {
    }

    public void limitReadReport(String str, boolean z) {
    }

    public void loadApplyList(IUIKitCallback<List<GroupApplyInfo>> iUIKitCallback) {
    }

    public void loadHistoryMessageList(String str, boolean z, int i2, int i3, TUIMessageBean tUIMessageBean, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void loadMessage(int i2, TUIMessageBean tUIMessageBean) {
    }

    public void loadMessage(int i2, TUIMessageBean tUIMessageBean, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void loadToWayMessageAsync(String str, boolean z, int i2, int i3, TUIMessageBean tUIMessageBean, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void locateMessage(String str, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void locateMessageBySeq(String str, long j2, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void markMessageAsRead(ChatInfo chatInfo) {
    }

    public void modifyMessage(TUIMessageBean tUIMessageBean) {
    }

    public void modifyRootMessageToAddReplyInfo(ReplyMessageBean replyMessageBean, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void modifyRootMessageToRemoveReplyInfo(ReplyMessageBean replyMessageBean, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void notifyTyping() {
    }

    public void onExitChat(String str) {
    }

    public void onLoadedMessageProcessed(List<TUIMessageBean> list, int i2) {
    }

    public void onMessageDeleted(TUIMessageBean tUIMessageBean) {
    }

    public void onMessageListDeleted(List<TUIMessageBean> list) {
    }

    public void onMessageLoadCompleted(List<TUIMessageBean> list, int i2) {
    }

    public void onMessageReadReceiptUpdated(List<TUIMessageBean> list, List<MessageReceiptInfo> list2) {
    }

    public void onRecvMessageModified(TUIMessageBean tUIMessageBean) {
    }

    public void onRecvNewMessage(TUIMessageBean tUIMessageBean) {
    }

    public void preProcessMessage(TUIMessageBean tUIMessageBean, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
    }

    public void processLoadedMessage(List<TUIMessageBean> list, int i2) {
    }

    public void reactMessage(String str, TUIMessageBean tUIMessageBean) {
    }

    public void readReport(String str, boolean z) {
    }

    public void refreshData(TUIMessageBean tUIMessageBean) {
    }

    public void removeDuplication(List<TUIMessageBean> list) {
    }

    public void resendMessageInfo(TUIMessageBean tUIMessageBean) {
    }

    public void resetCurrentChatUnreadCount() {
    }

    public void resetNewMessageCount() {
    }

    public void revokeMessage(TUIMessageBean tUIMessageBean) {
    }

    public boolean safetyCall() {
    }

    public void scrollToNewestMessage() {
    }

    public void sendMessage(TUIMessageBean tUIMessageBean, String str, boolean z) {
    }

    public void sendMessageReadReceipt(List<TUIMessageBean> list, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void sendTypingStatusMessage(TUIMessageBean tUIMessageBean, String str, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
    }

    public void setChatFragmentShow(boolean z) {
    }

    public void setChatNotifyHandler(ChatNotifyHandler chatNotifyHandler) {
    }

    public void setDraft(String str) {
    }

    public void setMessageListAdapter(IMessageAdapter iMessageAdapter) {
    }

    public void setMessageRecycleView(MessageRecyclerView messageRecyclerView) {
    }

    public void updateAdapter(int i2, int i3) {
    }

    public void updateMessageInfo(TUIMessageBean tUIMessageBean) {
    }

    public boolean updateMessageRevoked(String str) {
    }

    public void getMessageReadReceipt(List<TUIMessageBean> list, IUIKitCallback<List<MessageReceiptInfo>> iUIKitCallback) {
    }

    public void modifyRootMessageToAddReplyInfo(TUIMessageBean tUIMessageBean, ReplyMessageBean replyMessageBean) {
    }

    public void modifyRootMessageToRemoveReplyInfo(TUIMessageBean tUIMessageBean, ReplyMessageBean replyMessageBean) {
    }

    public void preProcessMessage(List<TUIMessageBean> list, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void sendMessage(TUIMessageBean tUIMessageBean, boolean z, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
    }

    public void updateAdapter(int i2, TUIMessageBean tUIMessageBean) {
    }

    public void findMessage(List<String> list, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }
}
