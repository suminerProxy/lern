package com.tencent.qcloud.tuikit.tuichat.presenter;

import android.os.Handler;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener;
import com.tencent.qcloud.tuikit.tuichat.model.ChatProvider;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ChatModifyMessageHelper {
    private static final int RETRY_MAX_TIME = 3000;
    private static final int RETRY_MIN_TIME = 500;
    private static final int RETRY_TIMES = 3;
    private static final ChatModifyMessageHelper helper = null;
    private final Map<String, TUIMessageBean> cache;
    private final Handler handler;
    private final ChatProvider provider;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatModifyMessageHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends C2CChatEventListener {
        public final /* synthetic */ ChatModifyMessageHelper this$0;

        public AnonymousClass1(ChatModifyMessageHelper chatModifyMessageHelper) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.C2CChatEventListener
        public void onRecvMessageModified(TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatModifyMessageHelper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass2 implements Runnable {
        public final /* synthetic */ ModifyMessageTask val$task;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ChatModifyMessageHelper$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<TUIMessageBean> {
            public final /* synthetic */ AnonymousClass2 this$0;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
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

        public AnonymousClass2(ModifyMessageTask modifyMessageTask) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class ModifyMessageTask {
        private final IUIKitCallback<TUIMessageBean> callback;
        private TUIMessageBean messageBean;
        private int retryTimes;

        public ModifyMessageTask(TUIMessageBean tUIMessageBean, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
        }

        public static /* synthetic */ TUIMessageBean access$100(ModifyMessageTask modifyMessageTask) {
        }

        public static /* synthetic */ TUIMessageBean access$102(ModifyMessageTask modifyMessageTask, TUIMessageBean tUIMessageBean) {
        }

        public static /* synthetic */ IUIKitCallback access$200(ModifyMessageTask modifyMessageTask) {
        }

        public static /* synthetic */ int access$500(ModifyMessageTask modifyMessageTask) {
        }

        public static /* synthetic */ int access$508(ModifyMessageTask modifyMessageTask) {
        }

        public abstract TUIMessageBean packageMessage(TUIMessageBean tUIMessageBean);
    }

    private ChatModifyMessageHelper() {
    }

    public static /* synthetic */ void access$000(ChatModifyMessageHelper chatModifyMessageHelper, TUIMessageBean tUIMessageBean) {
    }

    public static /* synthetic */ ChatModifyMessageHelper access$300() {
    }

    public static /* synthetic */ Map access$400(ChatModifyMessageHelper chatModifyMessageHelper) {
    }

    public static /* synthetic */ int access$600(ChatModifyMessageHelper chatModifyMessageHelper) {
    }

    public static /* synthetic */ void access$700(ModifyMessageTask modifyMessageTask, long j2) {
    }

    public static /* synthetic */ ChatProvider access$800(ChatModifyMessageHelper chatModifyMessageHelper) {
    }

    public static void enqueueTask(ModifyMessageTask modifyMessageTask) {
    }

    private int getRetryDelay() {
    }

    private void onUpdateCache(TUIMessageBean tUIMessageBean) {
    }

    private static void enqueueTask(ModifyMessageTask modifyMessageTask, long j2) {
    }
}
