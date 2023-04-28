package com.showstartfans.activity.view.custom_im_ui.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.showstartfans.activity.model.AuthorInfo;
import com.showstartfans.activity.model.GroupNoticeBean;
import com.showstartfans.activity.view.GroupNoticeTipsView;
import com.tencent.imsdk.v2.V2TIMGroupAtInfo;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView;
import com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageAdapter;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CustomChatView extends ChatView {
    private ImageView b;
    public GroupNoticeTipsView c;

    /* renamed from: d  reason: collision with root package name */
    private ImJumpMessageView f7127d;

    /* renamed from: e  reason: collision with root package name */
    private ImJumpMessageView f7128e;

    /* renamed from: f  reason: collision with root package name */
    public h.u.a.u.y3.j.e f7129f;

    /* renamed from: g  reason: collision with root package name */
    private CustomInputView f7130g;

    /* renamed from: h  reason: collision with root package name */
    private AuthorInfo f7131h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<AuthorInfo> f7132i;

    /* renamed from: j  reason: collision with root package name */
    private h.u.a.o.e f7133j;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements MessageRecyclerView.OnPopActionClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomChatView f7134a;

        /* renamed from: com.showstartfans.activity.view.custom_im_ui.view.CustomChatView$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class View$OnClickListenerC0135a implements View.OnClickListener {
            public final /* synthetic */ a b;

            public View$OnClickListenerC0135a(a aVar) {
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

        public a(CustomChatView customChatView) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ V2TIMMessage b;
        public final /* synthetic */ CustomChatView c;

        public b(CustomChatView customChatView, V2TIMMessage v2TIMMessage) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements V2TIMValueCallback<List<V2TIMMessage>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomChatView f7135a;

        public c(CustomChatView customChatView) {
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
    public class d extends IUIKitCallback<TUIMessageBean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUIMessageBean f7136a;
        public final /* synthetic */ CustomChatView b;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a implements Runnable {
            public final /* synthetic */ d b;

            public a(d dVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public d(CustomChatView customChatView, TUIMessageBean tUIMessageBean) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e implements MessageRecyclerView.OnLoadMoreHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomChatView f7137a;

        public e(CustomChatView customChatView) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class f implements MessageRecyclerView.OnEmptySpaceClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomChatView f7138a;

        public f(CustomChatView customChatView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView.OnEmptySpaceClickListener
        public void onClick() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class g implements InputView.ChatInputHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomChatView f7139a;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a implements Runnable {
            public final /* synthetic */ g b;

            public a(g gVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class b implements Runnable {
            public final /* synthetic */ g b;

            public b(g gVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class c implements Runnable {
            public final /* synthetic */ g b;

            public c(g gVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class d implements Runnable {
            public final /* synthetic */ int b;
            public final /* synthetic */ g c;

            public d(g gVar, int i2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class e implements Runnable {
            public final /* synthetic */ g b;

            public e(g gVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class f implements Runnable {
            public final /* synthetic */ g b;

            public f(g gVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public g(CustomChatView customChatView) {
        }

        public void a() {
        }

        public void b() {
        }

        public void c(int i2) {
        }

        public void d() {
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
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class h implements View.OnClickListener {
        public final /* synthetic */ CustomChatView b;

        public h(CustomChatView customChatView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class i implements InputView.MessageHandler {
        public final /* synthetic */ CustomChatView b;

        public i(CustomChatView customChatView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView.MessageHandler
        public void scrollToEnd() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView.MessageHandler
        public void sendMessage(TUIMessageBean tUIMessageBean) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class j implements Runnable {
        public final /* synthetic */ CustomChatView b;

        public j(CustomChatView customChatView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class k implements View.OnClickListener {
        public final /* synthetic */ String b;
        public final /* synthetic */ CustomChatView c;

        public k(CustomChatView customChatView, String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class l implements V2TIMValueCallback<List<V2TIMMessage>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7140a;
        public final /* synthetic */ CustomChatView b;

        public l(CustomChatView customChatView, int i2) {
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

    public CustomChatView(Context context) {
    }

    public static /* synthetic */ AnimationDrawable A(CustomChatView customChatView) {
    }

    public static /* synthetic */ AnimationDrawable B(CustomChatView customChatView) {
    }

    public static /* synthetic */ View C(CustomChatView customChatView) {
    }

    public static /* synthetic */ AnimationDrawable D(CustomChatView customChatView) {
    }

    public static /* synthetic */ ImageView E(CustomChatView customChatView) {
    }

    public static /* synthetic */ TextView F(CustomChatView customChatView) {
    }

    public static /* synthetic */ TextView G(CustomChatView customChatView) {
    }

    public static /* synthetic */ TextView H(CustomChatView customChatView) {
    }

    public static /* synthetic */ void I(CustomChatView customChatView, TUIMessageBean tUIMessageBean) {
    }

    public static /* synthetic */ View J(CustomChatView customChatView) {
    }

    public static /* synthetic */ ImageView K(CustomChatView customChatView) {
    }

    public static /* synthetic */ TextView L(CustomChatView customChatView) {
    }

    public static /* synthetic */ void M(CustomChatView customChatView) {
    }

    public static /* synthetic */ boolean N(CustomChatView customChatView, boolean z) {
    }

    public static /* synthetic */ ChatInfo O(CustomChatView customChatView) {
    }

    public static /* synthetic */ ChatPresenter P(CustomChatView customChatView) {
    }

    public static /* synthetic */ boolean Q(CustomChatView customChatView, boolean z) {
    }

    public static /* synthetic */ ChatPresenter R(CustomChatView customChatView) {
    }

    public static /* synthetic */ h.u.a.o.e S(CustomChatView customChatView) {
    }

    public static /* synthetic */ boolean T(CustomChatView customChatView) {
    }

    public static /* synthetic */ void U(CustomChatView customChatView, List list, h.u.a.o.e eVar) {
    }

    public static /* synthetic */ void V(CustomChatView customChatView) {
    }

    public static /* synthetic */ MessageAdapter W(CustomChatView customChatView) {
    }

    public static /* synthetic */ MessageAdapter X(CustomChatView customChatView) {
    }

    public static /* synthetic */ MessageAdapter Y(CustomChatView customChatView) {
    }

    public static /* synthetic */ MessageAdapter Z(CustomChatView customChatView) {
    }

    public static /* synthetic */ void a(CustomChatView customChatView, TUIMessageBean tUIMessageBean) {
    }

    private void a0() {
    }

    public static /* synthetic */ void b(CustomChatView customChatView, TUIMessageBean tUIMessageBean) {
    }

    private void b0(List<V2TIMMessage> list, h.u.a.o.e eVar) {
    }

    public static /* synthetic */ String c() {
    }

    public static /* synthetic */ String d() {
    }

    public static /* synthetic */ boolean e(CustomChatView customChatView, boolean z) {
    }

    public static /* synthetic */ boolean f(CustomChatView customChatView) {
    }

    public static /* synthetic */ MessageRecyclerView g(CustomChatView customChatView) {
    }

    private void getUnReadMessageUp() {
    }

    public static /* synthetic */ boolean h(CustomChatView customChatView, boolean z) {
    }

    public static /* synthetic */ MessageRecyclerView i(CustomChatView customChatView) {
    }

    public static /* synthetic */ ChatPresenter j(CustomChatView customChatView) {
    }

    public static /* synthetic */ ChatPresenter k(CustomChatView customChatView) {
    }

    public static /* synthetic */ boolean l(CustomChatView customChatView) {
    }

    public static /* synthetic */ void m(CustomChatView customChatView, TUIMessageBean tUIMessageBean) {
    }

    public static /* synthetic */ String n() {
    }

    public static /* synthetic */ boolean o(CustomChatView customChatView, boolean z) {
    }

    public static /* synthetic */ long p(CustomChatView customChatView) {
    }

    public static /* synthetic */ long q(CustomChatView customChatView) {
    }

    public static /* synthetic */ long r(CustomChatView customChatView, long j2) {
    }

    public static /* synthetic */ View s(CustomChatView customChatView) {
    }

    public static /* synthetic */ ImageView t(CustomChatView customChatView) {
    }

    public static /* synthetic */ AnimationDrawable u(CustomChatView customChatView, AnimationDrawable animationDrawable) {
    }

    public static /* synthetic */ ImageView v(CustomChatView customChatView) {
    }

    public static /* synthetic */ AnimationDrawable w(CustomChatView customChatView) {
    }

    public static /* synthetic */ void x(CustomChatView customChatView, TUIMessageBean tUIMessageBean) {
    }

    public static /* synthetic */ TextView y(CustomChatView customChatView) {
    }

    public static /* synthetic */ TextView z(CustomChatView customChatView) {
    }

    public void c0(V2TIMMessage v2TIMMessage, int i2) {
    }

    public Boolean d0() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView
    public void displayBackToAtMessages(V2TIMGroupAtInfo v2TIMGroupAtInfo) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView
    public void displayBackToLastMessages(String str) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView
    public void displayBackToNewMessages(String str, int i2) {
    }

    public void e0(AuthorInfo authorInfo, ArrayList<AuthorInfo> arrayList) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView, com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IChatLayout
    public void exitChat() {
    }

    public CustomMessageRecyclerView getCustomMessageLayout() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView, com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IChatLayout
    public /* bridge */ /* synthetic */ InputView getInputLayout() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView, com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IChatLayout
    public void initDefault() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView
    public void initListener() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView
    public void initViews() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView
    public void replyMessage(TUIMessageBean tUIMessageBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView, com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IChatLayout
    public void sendMessage(TUIMessageBean tUIMessageBean, boolean z) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView, com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IChatLayout
    public void setChatInfo(ChatInfo chatInfo) {
    }

    public void setGroupNoticeTipsData(GroupNoticeBean groupNoticeBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView, com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IChatLayout
    public CustomInputView getInputLayout() {
    }

    public CustomChatView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public CustomChatView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
