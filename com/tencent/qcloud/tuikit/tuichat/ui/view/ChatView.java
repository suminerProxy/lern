package com.tencent.qcloud.tuikit.tuichat.ui.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.imsdk.v2.V2TIMGroupAtInfo;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.UnreadCountTextView;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.GroupApplyInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.component.face.Emoji;
import com.tencent.qcloud.tuikit.tuichat.component.noticelayout.NoticeLayout;
import com.tencent.qcloud.tuikit.tuichat.interfaces.TotalUnreadCountListener;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IChatLayout;
import com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageAdapter;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ChatView extends LinearLayout implements IChatLayout {
    public static final int FORWARD_MSG_NUM_LIMIT = 30;
    public static final String TAG = null;
    public boolean isSupportTyping;
    public long lastTypingTime;
    public MessageAdapter mAdapter;
    public ImageView mArrowImageView;
    public ChatInfo mChatInfo;
    public boolean mClickLastMessageShow;
    public FrameLayout mCustomView;
    public View mDeleteButton;
    public LinearLayout mForwardLayout;
    public View mForwardMergeButton;
    public View mForwardOneButton;
    public ForwardSelectActivityListener mForwardSelectActivityListener;
    public NoticeLayout mGroupApplyLayout;
    public InputView mInputView;
    public boolean mJumpGroupAtInfoShow;
    public LinearLayout mJumpMessageLayout;
    public TextView mJumpMessageTextView;
    public boolean mJumpNewMessageShow;
    public MessageRecyclerView mMessageRecyclerView;
    public NoticeLayout mNoticeLayout;
    public View mRecordingGroup;
    public ImageView mRecordingIcon;
    public TextView mRecordingTips;
    public TitleBarLayout mTitleBar;
    public ChatPresenter.TypingListener mTypingListener;
    public Runnable mTypingRunnable;
    public AnimationDrawable mVolumeAnim;
    public ChatPresenter presenter;
    public TotalUnreadCountListener unreadCountListener;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements ChatPresenter.TypingListener {
        public final /* synthetic */ ChatView this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class RunnableC02171 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ String val$oldTitle;

            public RunnableC02171(AnonymousClass1 anonymousClass1, String str) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(ChatView chatView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter.TypingListener
        public void onTyping(int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 extends IUIKitCallback<Void> {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass10(ChatView chatView) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 implements TotalUnreadCountListener {
        public final /* synthetic */ ChatView this$0;
        public final /* synthetic */ UnreadCountTextView val$unreadCountTextView;

        public AnonymousClass11(ChatView chatView, UnreadCountTextView unreadCountTextView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.TotalUnreadCountListener
        public void onTotalUnreadCountChanged(long j2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 implements ChatPresenter.ChatNotifyHandler {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass12(ChatView chatView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter.ChatNotifyHandler
        public void onApplied(int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter.ChatNotifyHandler
        public void onExitChat(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter.ChatNotifyHandler
        public /* synthetic */ void onFriendNameChanged(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter.ChatNotifyHandler
        public void onGroupForceExit() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter.ChatNotifyHandler
        public void onGroupNameChanged(String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 implements ChatPresenter.ChatNotifyHandler {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass13(ChatView chatView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter.ChatNotifyHandler
        public /* synthetic */ void onApplied(int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter.ChatNotifyHandler
        public void onExitChat(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter.ChatNotifyHandler
        public void onFriendNameChanged(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter.ChatNotifyHandler
        public /* synthetic */ void onGroupForceExit() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter.ChatNotifyHandler
        public /* synthetic */ void onGroupNameChanged(String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 extends IUIKitCallback<List<GroupApplyInfo>> {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass14(ChatView chatView) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 implements MessageRecyclerView.OnPopActionClickListener {
        public final /* synthetic */ ChatView this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$15$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ AnonymousClass15 this$1;

            public AnonymousClass1(AnonymousClass15 anonymousClass15) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$15$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 implements View.OnClickListener {
            public final /* synthetic */ AnonymousClass15 this$1;
            public final /* synthetic */ TUIMessageBean val$msg;

            public AnonymousClass2(AnonymousClass15 anonymousClass15, TUIMessageBean tUIMessageBean) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public AnonymousClass15(ChatView chatView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnPopActionClickListener
        public void onCopyClick(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnPopActionClickListener
        public void onDeleteMessageClick(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnPopActionClickListener
        public void onForwardMessageClick(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnPopActionClickListener
        public void onMultiSelectMessageClick(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnPopActionClickListener
        public void onQuoteMessageClick(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnPopActionClickListener
        public void onReplyMessageClick(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnPopActionClickListener
        public void onRevokeMessageClick(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnPopActionClickListener
        public void onSendMessageClick(TUIMessageBean tUIMessageBean, boolean z) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass16 implements MessageRecyclerView.OnLoadMoreHandler {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass16(ChatView chatView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnLoadMoreHandler
        public void displayBackToLastMessage(boolean z) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnLoadMoreHandler
        public void displayBackToNewMessage(boolean z, String str, int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnLoadMoreHandler
        public void hideBackToAtMessage() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnLoadMoreHandler
        public boolean isListEnd(int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnLoadMoreHandler
        public void loadMessageFinish() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnLoadMoreHandler
        public void loadMore(int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnLoadMoreHandler
        public void scrollMessageFinish() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass17 implements MessageRecyclerView.OnEmptySpaceClickListener {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass17(ChatView chatView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnEmptySpaceClickListener
        public void onClick() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass18 implements InputView.ChatInputHandler {
        public final /* synthetic */ ChatView this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$18$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass18 this$1;

            public AnonymousClass1(AnonymousClass18 anonymousClass18) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$18$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ AnonymousClass18 this$1;

            public AnonymousClass2(AnonymousClass18 anonymousClass18) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$18$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass3 implements Runnable {
            public final /* synthetic */ AnonymousClass18 this$1;

            public AnonymousClass3(AnonymousClass18 anonymousClass18) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$18$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass4 implements Runnable {
            public final /* synthetic */ AnonymousClass18 this$1;
            public final /* synthetic */ int val$status;

            public AnonymousClass4(AnonymousClass18 anonymousClass18, int i2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$18$5  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass5 implements Runnable {
            public final /* synthetic */ AnonymousClass18 this$1;

            public AnonymousClass5(AnonymousClass18 anonymousClass18) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$18$6  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass6 implements Runnable {
            public final /* synthetic */ AnonymousClass18 this$1;

            public AnonymousClass6(AnonymousClass18 anonymousClass18) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass18(ChatView chatView) {
        }

        public void cancelRecording() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView.ChatInputHandler
        public void onInputAreaClick() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView.ChatInputHandler
        public void onRecordStatusChanged(int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView.ChatInputHandler
        public void onUserTyping(boolean z, long j2) {
        }

        public void startRecording() {
        }

        public void stopAbnormally(int i2) {
        }

        public void stopRecording() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass19 implements View.OnClickListener {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass19(ChatView chatView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ ChatView this$0;
        public final /* synthetic */ String val$messageId;

        public AnonymousClass2(ChatView chatView, String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass20 implements InputView.MessageHandler {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass20(ChatView chatView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView.MessageHandler
        public void scrollToEnd() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView.MessageHandler
        public void sendMessage(TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$21  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass21 implements View.OnClickListener {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass21(ChatView chatView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$22  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass22 implements View.OnClickListener {
        public final /* synthetic */ ChatView this$0;
        public final /* synthetic */ CharSequence val$leftTitle;

        public AnonymousClass22(ChatView chatView, CharSequence charSequence) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$23  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass23 implements View.OnClickListener {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass23(ChatView chatView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$24  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass24 implements View.OnClickListener {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass24(ChatView chatView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$25  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass25 implements View.OnClickListener {
        public final /* synthetic */ ChatView this$0;
        public final /* synthetic */ CharSequence val$leftTitle;

        public AnonymousClass25(ChatView chatView, CharSequence charSequence) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$26  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass26 implements View.OnClickListener {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass26(ChatView chatView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$27  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass27 implements View.OnClickListener {
        public final /* synthetic */ ChatView this$0;
        public final /* synthetic */ List val$messageInfoList;

        public AnonymousClass27(ChatView chatView, List list) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$28  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass28 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ChatView this$0;
        public final /* synthetic */ TUIMessageBean val$msg;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$28$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass28 this$1;

            public AnonymousClass1(AnonymousClass28 anonymousClass28) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass28(ChatView chatView, TUIMessageBean tUIMessageBean) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$29  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass29 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ChatView this$0;
        public final /* synthetic */ TUIMessageBean val$msg;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$29$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass29 this$1;

            public AnonymousClass1(AnonymousClass29 anonymousClass29) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$29$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 extends IUIKitCallback<Void> {
            public final /* synthetic */ AnonymousClass29 this$1;

            public AnonymousClass2(AnonymousClass29 anonymousClass29) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }
        }

        public AnonymousClass29(ChatView chatView, TUIMessageBean tUIMessageBean) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ ChatView this$0;
        public final /* synthetic */ String val$messageId;

        public AnonymousClass3(ChatView chatView, String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$30  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass30 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass30(ChatView chatView) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$31  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass31 extends ClickableSpan {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass31(ChatView chatView) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$32  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass32 implements View.OnClickListener {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass32(ChatView chatView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$33  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass33 implements View.OnClickListener {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass33(ChatView chatView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ ChatView this$0;
        public final /* synthetic */ V2TIMGroupAtInfo val$groupAtInfo;

        public AnonymousClass4(ChatView chatView, V2TIMGroupAtInfo v2TIMGroupAtInfo) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends IUIKitCallback<Void> {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass5(ChatView chatView) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends IUIKitCallback<Void> {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass6(ChatView chatView) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public final /* synthetic */ ChatView this$0;
        public final /* synthetic */ ChatInfo val$chatInfo;

        public AnonymousClass7(ChatView chatView, ChatInfo chatInfo) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 extends RecyclerView.OnScrollListener {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass8(ChatView chatView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements MessageRecyclerView.OnMenuEmojiClickListener {
        public final /* synthetic */ ChatView this$0;

        public AnonymousClass9(ChatView chatView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnMenuEmojiClickListener
        public void onClick(Emoji emoji, TUIMessageBean tUIMessageBean) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface ForwardSelectActivityListener {
        void onStartForwardSelectActivity(int i2, List<TUIMessageBean> list);
    }

    public ChatView(Context context) {
    }

    public boolean checkFailedMessageInfos(List<TUIMessageBean> list) {
    }

    public void deleteMessage(TUIMessageBean tUIMessageBean) {
    }

    public void deleteMessageInfos(List<TUIMessageBean> list) {
    }

    public void deleteMessages(List<Integer> list) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public void displayBackToAtMessages(V2TIMGroupAtInfo v2TIMGroupAtInfo) {
    }

    public void displayBackToLastMessages(String str) {
    }

    public void displayBackToNewMessages(String str, int i2) {
    }

    public void exitChat() {
    }

    public void forwardMessage(TUIMessageBean tUIMessageBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IChatLayout
    public ChatInfo getChatInfo() {
    }

    public FrameLayout getCustomView() {
    }

    public View getDeleteButton() {
    }

    public LinearLayout getForwardLayout() {
    }

    public View getForwardMergeButton() {
    }

    public View getForwardOneButton() {
    }

    public InputView getInputLayout() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IChatLayout
    public MessageRecyclerView getMessageLayout() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IChatLayout
    public NoticeLayout getNoticeLayout() {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ILayout
    public TitleBarLayout getTitleBar() {
    }

    public void hideBackToAtMessages() {
    }

    public void hideJumpMessageLayouts() {
    }

    public void initDefault() {
    }

    public void initGroupAtInfoLayout() {
    }

    public void initListener() {
    }

    public void initViews() {
    }

    public boolean isSupportTyping(long j2) {
    }

    public void loadApplyList() {
    }

    public void loadMessages(TUIMessageBean tUIMessageBean, int i2) {
    }

    public void locateOriginMessage(String str) {
    }

    public void locateOriginMessageBySeq(long j2) {
    }

    public void multiSelectMessage(TUIMessageBean tUIMessageBean) {
    }

    public void onApplied(int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    public void onExitChat() {
    }

    public void onFriendNameChanged(String str) {
    }

    public void onGroupNameChanged(String str) {
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i2) {
    }

    public void openWebUrl(String str) {
    }

    public void quoteMessage(TUIMessageBean tUIMessageBean) {
    }

    public void reactMessage(Emoji emoji, TUIMessageBean tUIMessageBean) {
    }

    public void replyMessage(TUIMessageBean tUIMessageBean) {
    }

    public void resetForwardState(String str) {
    }

    public void resetTitleBar(String str) {
    }

    public void revokeMessage(TUIMessageBean tUIMessageBean) {
    }

    public void scrollToEnd() {
    }

    public void sendMessage(TUIMessageBean tUIMessageBean, boolean z) {
    }

    public void sendMsgReadReceipt(int i2, int i3) {
    }

    public void sendReplyMessage(TUIMessageBean tUIMessageBean, boolean z) {
    }

    public void sendTypingStatusMessage(boolean z) {
    }

    public void setChatHandler() {
    }

    public void setChatInfo(ChatInfo chatInfo) {
    }

    public void setForwardSelectActivityListener(ForwardSelectActivityListener forwardSelectActivityListener) {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ILayout
    public void setParentLayout(Object obj) {
    }

    public void setPresenter(ChatPresenter chatPresenter) {
    }

    public void setTitleBarWhenMultiSelectMessage() {
    }

    public void setTotalUnread() {
    }

    public void showForwardDialog(boolean z, boolean z2) {
    }

    public void showForwardLimitDialog(List<TUIMessageBean> list) {
    }

    public void showNotSupportDialog() {
    }

    public void startSelectForwardActivity(int i2, List<TUIMessageBean> list) {
    }

    public void updateUnreadCount(UnreadCountTextView unreadCountTextView, long j2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IChatLayout
    public void loadMessages(int i2) {
    }

    public ChatView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public ChatView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
