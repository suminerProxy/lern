package com.tencent.qcloud.tuikit.tuichat.ui.page;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageRepliesBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.presenter.ReplyPresenter;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IReplyMessageHandler;
import com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageAdapter;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.ReplyDetailsView;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MessageReplyDetailActivity extends BaseLightActivity implements InputView.MessageHandler, IReplyMessageHandler {
    private static final int SCROLL_TO_END_OFFSET = -999999;
    private ChatInfo chatInfo;
    private InputView inputView;
    private TUIMessageBean message;
    private MessageAdapter messageAdapter;
    private MessageRecyclerView messageRecyclerView;
    private ReplyPresenter presenter;
    private ReplyDetailsView repliesList;
    private TitleBarLayout titleBarLayout;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReplyDetailActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ MessageReplyDetailActivity this$0;

        public AnonymousClass1(MessageReplyDetailActivity messageReplyDetailActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReplyDetailActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<Void> {
        public final /* synthetic */ MessageReplyDetailActivity this$0;

        public AnonymousClass2(MessageReplyDetailActivity messageReplyDetailActivity) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReplyDetailActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ MessageReplyDetailActivity this$0;

        public AnonymousClass3(MessageReplyDetailActivity messageReplyDetailActivity) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReplyDetailActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ MessageReplyDetailActivity this$0;

        public AnonymousClass4(MessageReplyDetailActivity messageReplyDetailActivity) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReplyDetailActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements View.OnTouchListener {
        public final /* synthetic */ MessageReplyDetailActivity this$0;
        public final /* synthetic */ GestureDetector val$gestureDetector;

        public AnonymousClass5(MessageReplyDetailActivity messageReplyDetailActivity, GestureDetector gestureDetector) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    public static /* synthetic */ void access$000(MessageReplyDetailActivity messageReplyDetailActivity) {
    }

    public static /* synthetic */ InputView access$100(MessageReplyDetailActivity messageReplyDetailActivity) {
    }

    private void initData() {
    }

    private void initMessageDetail() {
    }

    private void setOnEmptyAreaClickListener() {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IReplyMessageHandler
    public void onRepliesMessageFound(Map<MessageRepliesBean.ReplyBean, TUIMessageBean> map) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView.MessageHandler
    public void scrollToEnd() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView.MessageHandler
    public void sendMessage(TUIMessageBean tUIMessageBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IReplyMessageHandler
    public void updateData(TUIMessageBean tUIMessageBean) {
    }
}
