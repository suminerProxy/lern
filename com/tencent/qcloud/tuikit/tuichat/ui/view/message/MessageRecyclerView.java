package com.tencent.qcloud.tuikit.tuichat.ui.view.message;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageProperties;
import com.tencent.qcloud.tuikit.tuichat.bean.message.QuoteMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.component.face.Emoji;
import com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageLayout;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MessageRecyclerView extends RecyclerView implements IMessageLayout {
    public static final int DATA_CHANGE_LOCATE_TO_POSITION = 7;
    public static final int DATA_CHANGE_NEW_MESSAGE = 8;
    public static final int DATA_CHANGE_SCROLL_TO_POSITION = 10;
    public static final int DATA_CHANGE_TYPE_ADD_BACK = 3;
    public static final int DATA_CHANGE_TYPE_ADD_FRONT = 2;
    public static final int DATA_CHANGE_TYPE_CLEAR = 6;
    public static final int DATA_CHANGE_TYPE_DELETE = 5;
    public static final int DATA_CHANGE_TYPE_LOAD = 1;
    public static final int DATA_CHANGE_TYPE_REFRESH = 0;
    public static final int DATA_CHANGE_TYPE_UPDATE = 4;
    public static final int REVOKE_TIME_OUT = 120;
    public static final int SCROLL_TO_END_OFFSET = -999999;
    public static final int SCROLL_TO_POSITION = 9;
    public static final String TAG = null;
    public MessageAdapter mAdapter;
    public ChatPopMenu mChatPopMenu;
    public OnEmptySpaceClickListener mEmptySpaceClickListener;
    public OnLoadMoreHandler mHandler;
    public List<ChatPopMenu.ChatPopMenuAction> mMorePopActions;
    public OnItemClickListener mOnItemClickListener;
    public OnPopActionClickListener mOnPopActionClickListener;
    public List<ChatPopMenu.ChatPopMenuAction> mPopActions;
    public int mSelectedPosition;
    public OnMenuEmojiClickListener menuEmojiOnClickListener;
    public ChatPresenter presenter;
    public final MessageProperties properties;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ MessageRecyclerView this$0;

        public AnonymousClass1(MessageRecyclerView messageRecyclerView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnTouchListener {
        public final /* synthetic */ MessageRecyclerView this$0;
        public final /* synthetic */ GestureDetector val$gestureDetector;

        public AnonymousClass2(MessageRecyclerView messageRecyclerView, GestureDetector gestureDetector) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements ChatPopMenu.EmojiOnClickListener {
        public final /* synthetic */ MessageRecyclerView this$0;
        public final /* synthetic */ TUIMessageBean val$messageInfo;

        public AnonymousClass3(MessageRecyclerView messageRecyclerView, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu.EmojiOnClickListener
        public void onClick(Emoji emoji) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements OnEmptySpaceClickListener {
        public final /* synthetic */ MessageRecyclerView this$0;

        public AnonymousClass4(MessageRecyclerView messageRecyclerView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnEmptySpaceClickListener
        public void onClick() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends OnItemClickListener {
        public final /* synthetic */ MessageRecyclerView this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass5 this$1;
            public final /* synthetic */ TUIMessageBean val$messageInfo;
            public final /* synthetic */ int val$position;
            public final /* synthetic */ View val$view;

            public AnonymousClass1(AnonymousClass5 anonymousClass5, View view, int i2, TUIMessageBean tUIMessageBean) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView$5$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 implements View.OnClickListener {
            public final /* synthetic */ AnonymousClass5 this$1;

            public AnonymousClass2(AnonymousClass5 anonymousClass5) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView$5$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass3 implements View.OnClickListener {
            public final /* synthetic */ AnonymousClass5 this$1;
            public final /* synthetic */ TUIMessageBean val$messageInfo;

            public AnonymousClass3(AnonymousClass5 anonymousClass5, TUIMessageBean tUIMessageBean) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public AnonymousClass5(MessageRecyclerView messageRecyclerView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onMessageLongClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onReEditRevokeMessage(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onReactOnClick(String str, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onRecallClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onReplyDetailClick(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onReplyMessageClick(View view, int i2, QuoteMessageBean quoteMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onSendFailBtnClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onTextSelected(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onUserIconClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onUserIconLongClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends IUIKitCallback<Void> {
        public final /* synthetic */ MessageRecyclerView this$0;

        public AnonymousClass6(MessageRecyclerView messageRecyclerView) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 extends IUIKitCallback<TUIMessageBean> {
        public final /* synthetic */ MessageRecyclerView this$0;

        public AnonymousClass7(MessageRecyclerView messageRecyclerView) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnEmptySpaceClickListener {
        void onClick();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnLoadMoreHandler {
        void displayBackToLastMessage(boolean z);

        void displayBackToNewMessage(boolean z, String str, int i2);

        void hideBackToAtMessage();

        boolean isListEnd(int i2);

        void loadMessageFinish();

        void loadMore(int i2);

        void scrollMessageFinish();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnMenuEmojiClickListener {
        void onClick(Emoji emoji, TUIMessageBean tUIMessageBean);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnPopActionClickListener {
        void onCopyClick(TUIMessageBean tUIMessageBean);

        void onDeleteMessageClick(TUIMessageBean tUIMessageBean);

        void onForwardMessageClick(TUIMessageBean tUIMessageBean);

        void onMultiSelectMessageClick(TUIMessageBean tUIMessageBean);

        void onQuoteMessageClick(TUIMessageBean tUIMessageBean);

        void onReplyMessageClick(TUIMessageBean tUIMessageBean);

        void onRevokeMessageClick(TUIMessageBean tUIMessageBean);

        void onSendMessageClick(TUIMessageBean tUIMessageBean, boolean z);
    }

    public MessageRecyclerView(Context context) {
    }

    private /* synthetic */ void a(TUIMessageBean tUIMessageBean) {
    }

    private /* synthetic */ void c(TUIMessageBean tUIMessageBean) {
    }

    private /* synthetic */ void e(TUIMessageBean tUIMessageBean) {
    }

    private /* synthetic */ void g(TUIMessageBean tUIMessageBean) {
    }

    private /* synthetic */ void i(TUIMessageBean tUIMessageBean) {
    }

    private /* synthetic */ void k(TUIMessageBean tUIMessageBean) {
    }

    private /* synthetic */ void m(TUIMessageBean tUIMessageBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageLayout
    public void addPopAction(ChatPopMenu.ChatPopMenuAction chatPopMenuAction) {
    }

    public /* synthetic */ void b(TUIMessageBean tUIMessageBean) {
    }

    public /* synthetic */ void d(TUIMessageBean tUIMessageBean) {
    }

    public void displayBackToNewMessage(boolean z, String str, int i2) {
    }

    public /* synthetic */ void f(TUIMessageBean tUIMessageBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public int getAvatar() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public int getAvatarRadius() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public int[] getAvatarSize() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public int getChatContextFontSize() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public Drawable getChatTimeBubble() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public int getChatTimeFontColor() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public int getChatTimeFontSize() {
    }

    public OnEmptySpaceClickListener getEmptySpaceClickListener() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public Drawable getLeftBubble() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public int getLeftChatContentFontColor() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public int getLeftNameVisibility() {
    }

    public OnLoadMoreHandler getLoadMoreHandler() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public int getNameFontColor() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public int getNameFontSize() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageLayout
    public OnItemClickListener getOnItemClickListener() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageLayout
    public List<ChatPopMenu.ChatPopMenuAction> getPopActions() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public Drawable getRightBubble() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public int getRightChatContentFontColor() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public int getRightNameVisibility() {
    }

    public int getSelectedPosition() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public Drawable getTipsMessageBubble() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public int getTipsMessageFontColor() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public int getTipsMessageFontSize() {
    }

    public /* synthetic */ void h(TUIMessageBean tUIMessageBean) {
    }

    public void init() {
    }

    public void initPopActions(TUIMessageBean tUIMessageBean) {
    }

    public boolean isDisplayJumpMessageLayout() {
    }

    public boolean isLastItemVisibleCompleted() {
    }

    public boolean isListEnd(int i2) {
    }

    public /* synthetic */ void j(TUIMessageBean tUIMessageBean) {
    }

    public /* synthetic */ void l(TUIMessageBean tUIMessageBean) {
    }

    public void loadMessageFinish() {
    }

    public void locateOriginMessage(String str) {
    }

    public /* synthetic */ void n(TUIMessageBean tUIMessageBean) {
    }

    public void onMsgAddBack() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i2) {
    }

    public void scrollMessageFinish() {
    }

    public void scrollToEnd() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageLayout
    public void setAdapter(MessageAdapter messageAdapter) {
    }

    public void setAdapterListener() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setAvatar(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setAvatarRadius(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setAvatarSize(int[] iArr) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setChatContextFontSize(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setChatTimeBubble(Drawable drawable) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setChatTimeFontColor(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setChatTimeFontSize(int i2) {
    }

    public void setClickEmptySpaceEvent() {
    }

    public void setEmptySpaceClickListener(OnEmptySpaceClickListener onEmptySpaceClickListener) {
    }

    public void setHighShowPosition(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setLeftBubble(Drawable drawable) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setLeftChatContentFontColor(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setLeftNameVisibility(int i2) {
    }

    public void setLoadMoreMessageHandler(OnLoadMoreHandler onLoadMoreHandler) {
    }

    public void setMenuEmojiOnClickListener(OnMenuEmojiClickListener onMenuEmojiClickListener) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setNameFontColor(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setNameFontSize(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageLayout
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
    }

    public void setPopActionClickListener(OnPopActionClickListener onPopActionClickListener) {
    }

    public void setPresenter(ChatPresenter chatPresenter) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setRightBubble(Drawable drawable) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setRightChatContentFontColor(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setRightNameVisibility(int i2) {
    }

    public void setSelectedPosition(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setTipsMessageBubble(Drawable drawable) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setTipsMessageFontColor(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageProperties
    public void setTipsMessageFontSize(int i2) {
    }

    public void showItemPopMenu(int i2, TUIMessageBean tUIMessageBean, View view) {
    }

    public void showRootMessageReplyDetail(TUIMessageBean tUIMessageBean) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollToPosition(int i2) {
    }

    public MessageRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public void showRootMessageReplyDetail(String str) {
    }

    public MessageRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
