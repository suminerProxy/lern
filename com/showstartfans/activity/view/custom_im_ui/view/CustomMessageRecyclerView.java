package com.showstartfans.activity.view.custom_im_ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.QuoteMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.component.face.Emoji;
import com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageAdapter;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CustomMessageRecyclerView extends MessageRecyclerView {
    private g b;
    private ChatInfo c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7188d;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomMessageRecyclerView f7189a;

        /* renamed from: com.showstartfans.activity.view.custom_im_ui.view.CustomMessageRecyclerView$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class View$OnClickListenerC0136a implements View.OnClickListener {
            public final /* synthetic */ a b;

            public View$OnClickListenerC0136a(a aVar) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class b implements View.OnClickListener {
            public final /* synthetic */ TUIMessageBean b;
            public final /* synthetic */ a c;

            public b(a aVar, TUIMessageBean tUIMessageBean) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public a(CustomMessageRecyclerView customMessageRecyclerView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onMessageClick(View view, int i2, TUIMessageBean tUIMessageBean) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements ChatPopMenu.EmojiOnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUIMessageBean f7190a;
        public final /* synthetic */ CustomMessageRecyclerView b;

        public b(CustomMessageRecyclerView customMessageRecyclerView, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu.EmojiOnClickListener
        public void onClick(Emoji emoji) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements MessageRecyclerView.OnEmptySpaceClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomMessageRecyclerView f7191a;

        public c(CustomMessageRecyclerView customMessageRecyclerView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnEmptySpaceClickListener
        public void onClick() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d implements ChatPopMenu.ChatPopMenuAction.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUIMessageBean f7192a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ CustomMessageRecyclerView c;

        public d(CustomMessageRecyclerView customMessageRecyclerView, TUIMessageBean tUIMessageBean, boolean z) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu.ChatPopMenuAction.OnClickListener
        public void onClick() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e extends IUIKitCallback<TUIMessageBean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f7193a;
        public final /* synthetic */ h b;
        public final /* synthetic */ CustomMessageRecyclerView c;

        public e(CustomMessageRecyclerView customMessageRecyclerView, long j2, h hVar) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class f implements V2TIMValueCallback<List<V2TIMMessage>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IUIKitCallback f7194a;
        public final /* synthetic */ CustomMessageRecyclerView b;

        public f(CustomMessageRecyclerView customMessageRecyclerView, IUIKitCallback iUIKitCallback) {
        }

        public void a(List<V2TIMMessage> list) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMMessage> list) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface g {
        void a(TUIMessageBean tUIMessageBean, boolean z);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface h {
        void a();

        void b();
    }

    public CustomMessageRecyclerView(Context context) {
    }

    public static /* synthetic */ OnItemClickListener A(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ MessageAdapter B(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ g C(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ String D() {
    }

    public static /* synthetic */ String E() {
    }

    public static /* synthetic */ String F() {
    }

    public static /* synthetic */ OnItemClickListener G(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ OnItemClickListener H(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ OnItemClickListener I(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ OnItemClickListener J(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ OnItemClickListener K(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ OnItemClickListener L(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ OnItemClickListener M(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    private ChatPopMenu.ChatPopMenuAction N(String str, ChatPopMenu.ChatPopMenuAction.OnClickListener onClickListener) {
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

    public static /* synthetic */ OnItemClickListener o(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ OnItemClickListener p(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ OnItemClickListener q(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ OnItemClickListener r(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ void s(CustomMessageRecyclerView customMessageRecyclerView, TUIMessageBean tUIMessageBean) {
    }

    public static /* synthetic */ ChatPresenter t(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ MessageRecyclerView.OnPopActionClickListener u(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ OnItemClickListener v(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ OnItemClickListener w(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ MessageRecyclerView.OnMenuEmojiClickListener x(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ MessageRecyclerView.OnMenuEmojiClickListener y(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public static /* synthetic */ MessageAdapter z(CustomMessageRecyclerView customMessageRecyclerView) {
    }

    public void O(long j2, IUIKitCallback<TUIMessageBean> iUIKitCallback) {
    }

    public /* synthetic */ void P(TUIMessageBean tUIMessageBean) {
    }

    public /* synthetic */ void Q(TUIMessageBean tUIMessageBean) {
    }

    public /* synthetic */ void R(TUIMessageBean tUIMessageBean) {
    }

    public /* synthetic */ void S(TUIMessageBean tUIMessageBean) {
    }

    public /* synthetic */ void T(TUIMessageBean tUIMessageBean) {
    }

    public /* synthetic */ void U(TUIMessageBean tUIMessageBean) {
    }

    public /* synthetic */ void V(TUIMessageBean tUIMessageBean) {
    }

    public void W(String str) {
    }

    public void X(long j2, h hVar) {
    }

    public ChatInfo getChatInfo() {
    }

    public TUIMessageBean getFirstVisibleMessage() {
    }

    public TUIMessageBean getLastMessage() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView
    public void initPopActions(TUIMessageBean tUIMessageBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView
    public void setAdapterListener() {
    }

    public void setChatInfo(ChatInfo chatInfo) {
    }

    public void setCustomPopActionClickListener(g gVar) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView
    public void showItemPopMenu(int i2, TUIMessageBean tUIMessageBean, View view) {
    }

    public CustomMessageRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public CustomMessageRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
