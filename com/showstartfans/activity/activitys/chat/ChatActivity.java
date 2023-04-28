package com.showstartfans.activity.activitys.chat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.eventmodel.OnConfirmGroupNoticeEvent;
import com.showstartfans.activity.eventmodel.OnGtoupPremissionEvent;
import com.showstartfans.activity.model.AuthorInfo;
import com.showstartfans.activity.model.GroupInfoNewBean;
import com.showstartfans.activity.model.GroupNoticeBean;
import com.showstartfans.activity.view.ImNoticeLayout;
import com.showstartfans.activity.view.custom_im_ui.activity.CustomTUIBaseChatActivity;
import com.showstartfans.activity.view.custom_im_ui.view.CustomChatView;
import com.showstartfans.activity.view.custom_im_ui.view.CustomMessageRecyclerView;
import com.tencent.imsdk.v2.V2TIMGroupInfoResult;
import com.tencent.imsdk.v2.V2TIMGroupMemberFullInfo;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import com.umeng.analytics.pro.am;
import h.u.a.o.v;
import h.y.a.m.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChatActivity.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 J2\u00020\u0001:\u0001JB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u001a\u0010\u0019\u001a\u00020\u00172\u0010\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\bJ\u0012\u0010%\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010&\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010(J\u0012\u0010)\u001a\u00020\u00172\b\u0010*\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010+\u001a\u00020\u00172\b\u0010*\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010,\u001a\u00020\u00172\b\u0010*\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010-\u001a\u00020\u0017H\u0014J\b\u0010.\u001a\u00020\u0017H\u0014J\b\u0010/\u001a\u00020\u000fH\u0002J\b\u00100\u001a\u00020\u0017H\u0016J\b\u00101\u001a\u00020\u0017H\u0014J\u0012\u00102\u001a\u00020\u00172\b\u00103\u001a\u0004\u0018\u000104H\u0007J\u0012\u00102\u001a\u00020\u00172\b\u00103\u001a\u0004\u0018\u000105H\u0007J\u0012\u00102\u001a\u00020\u00172\b\u00103\u001a\u0004\u0018\u000106H\u0007J\b\u00107\u001a\u00020\u0017H\u0014J\u0010\u00108\u001a\u00020\u00172\b\u00109\u001a\u0004\u0018\u00010\bJ\u0018\u0010:\u001a\u00020\u00172\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>J\b\u0010?\u001a\u00020@H\u0014J\u001c\u0010A\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J$\u0010D\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010\b2\b\u0010F\u001a\u0004\u0018\u00010\b2\b\u0010G\u001a\u0004\u0018\u00010\bJ\u0010\u0010H\u001a\u00020\u00172\b\u0010I\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/showstartfans/activity/activitys/chat/ChatActivity;", "Lcom/showstartfans/activity/view/custom_im_ui/activity/CustomTUIBaseChatActivity;", "()V", "MangerInfos", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/model/AuthorInfo;", "OwnerInfo", "TAG", "", "kotlin.jvm.PlatformType", "charInfo", "Lcom/tencent/qcloud/tuikit/tuichat/bean/ChatInfo;", "chatFragment", "Lcom/showstartfans/activity/view/custom_im_ui/fragment/CustomTUIBaseChatFragment;", "isFirstJoin", "", "mGroupInfoBean", "Lcom/showstartfans/activity/model/GroupInfoNewBean;", "my_notice_layout", "Lcom/showstartfans/activity/view/ImNoticeLayout;", "presenter", "Lcom/tencent/qcloud/tuikit/tuichat/presenter/ChatPresenter;", "OnFragmentInitView", "", "isGroup", "OnInitGroupFragment", "list", "", "OnLoadGroupInfoSuccess", "bean", "checkTips", "deleteConversationThis", "finish", "getChatView", "Lcom/showstartfans/activity/view/custom_im_ui/view/CustomChatView;", "getGroupAdminDatas", "groupid", "getGroupNotice", "gotoReplyDetails", "messageBean", "Lcom/tencent/qcloud/tuikit/tuichat/bean/message/TUIMessageBean;", "initC2CChat", "chatInfo", "initChat", "initGroupChat", "initListener", "initView", "isAdmin", "onBackPressed", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/OnConfirmGroupNoticeEvent;", "Lcom/showstartfans/activity/eventmodel/OnGtoupPremissionEvent;", "Lcom/showstartfans/activity/model/OnExitGroupEvent;", "onPause", "scrollToMessageItem", "originMsgId", "scrollToMessageItemBySeq", "noticeSeq", "", "listener", "Lcom/showstartfans/activity/view/custom_im_ui/view/CustomMessageRecyclerView$OnMsgScrollListener;", "setContentViewRes", "", "showGroupNoticeDialog", "noticeBean", "Lcom/showstartfans/activity/model/GroupNoticeBean;", "updateGroupChatStyle", "groupFromWord", "groupFromPicture", "groupFromVoice", "updateSpeakPermission", "speakPermission", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ChatActivity extends CustomTUIBaseChatActivity {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public static final a f5358m = null;
    @NotNull
    public Map<Integer, View> c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5359d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private h.u.a.u.y3.m.c f5360e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private ChatPresenter f5361f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private ImNoticeLayout f5362g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private ChatInfo f5363h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5364i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private GroupInfoNewBean f5365j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private AuthorInfo f5366k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<AuthorInfo> f5367l;

    /* compiled from: ChatActivity.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J&\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\b¨\u0006\u0012"}, d2 = {"Lcom/showstartfans/activity/activitys/chat/ChatActivity$Companion;", "", "()V", "GroupJoin", "", "ctx", "Landroid/content/Context;", "chatInfo", "Lcom/showstartfans/activity/model/ChatOption;", "canChat", "formatTencentBundle", "bundle", "Landroid/os/Bundle;", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "isFirstJoin", "", "start", "chatOption", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        private final void a(Context context, h.u.a.o.f fVar) {
        }

        private static final void b(Context context, h.u.a.o.f fVar, n nVar) {
        }

        private final void c(Context context, h.u.a.o.f fVar) {
        }

        private static final void d(Context context, h.u.a.o.f fVar, n nVar) {
        }

        private static final void e(Context context, View view) {
        }

        private final void f(Bundle bundle, h.u.a.o.f fVar) {
        }

        public static /* synthetic */ void g(Context context, View view) {
        }

        public static /* synthetic */ void h(Context context, h.u.a.o.f fVar, n nVar) {
        }

        public static /* synthetic */ void i(Context context, h.u.a.o.f fVar, n nVar) {
        }

        private final void j(Context context, h.u.a.o.f fVar, boolean z) {
        }

        public static /* synthetic */ void k(a aVar, Context context, h.u.a.o.f fVar, boolean z, int i2, Object obj) {
        }

        public final void l(@Nullable Context context, @Nullable h.u.a.o.f fVar) {
        }
    }

    /* compiled from: ChatActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/GroupInfoNewBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b extends Lambda implements Function1<GroupInfoNewBean, Unit> {
        public final /* synthetic */ ChatActivity this$0;

        public b(ChatActivity chatActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GroupInfoNewBean groupInfoNewBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable GroupInfoNewBean groupInfoNewBean) {
        }
    }

    /* compiled from: ChatActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class c extends Lambda implements Function0<Unit> {
        public static final c INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: ChatActivity.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/chat/ChatActivity$initGroupChat$1", "Lcom/tencent/imsdk/v2/V2TIMValueCallback;", "", "Lcom/tencent/imsdk/v2/V2TIMGroupInfoResult;", "onError", "", "i", "", am.aB, "", "onSuccess", "v2TIMGroupInfoResults", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class d implements V2TIMValueCallback<List<? extends V2TIMGroupInfoResult>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ChatActivity f5368a;

        public d(ChatActivity chatActivity) {
        }

        public void a(@NotNull List<? extends V2TIMGroupInfoResult> list) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, @NotNull String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<? extends V2TIMGroupInfoResult> list) {
        }
    }

    /* compiled from: ChatActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class e extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ ChatActivity this$0;

        public e(ChatActivity chatActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: ChatActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/chat/ChatActivity$onEvent$1$1", "Lcom/tencent/qcloud/tuicore/component/interfaces/IUIKitCallback;", "Lcom/tencent/qcloud/tuikit/tuichat/bean/message/TUIMessageBean;", "onSuccess", "", "data", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class f extends IUIKitCallback<TUIMessageBean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GroupNoticeBean f5369a;
        public final /* synthetic */ ChatActivity b;

        public f(GroupNoticeBean groupNoticeBean, ChatActivity chatActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(TUIMessageBean tUIMessageBean) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(@Nullable TUIMessageBean tUIMessageBean) {
        }
    }

    /* compiled from: ChatActivity.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/chat/ChatActivity$updateSpeakPermission$1", "Lcom/tencent/imsdk/v2/V2TIMValueCallback;", "", "Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;", "onError", "", "i", "", am.aB, "", "onSuccess", "v2TIMGroupMemberFullInfos", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class g implements V2TIMValueCallback<List<? extends V2TIMGroupMemberFullInfo>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ChatActivity f5370a;

        public g(ChatActivity chatActivity) {
        }

        public void a(@NotNull List<? extends V2TIMGroupMemberFullInfo> list) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, @NotNull String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<? extends V2TIMGroupMemberFullInfo> list) {
        }
    }

    public static final /* synthetic */ void A(ChatActivity chatActivity, GroupInfoNewBean groupInfoNewBean) {
    }

    public static final /* synthetic */ void B(ChatActivity chatActivity) {
    }

    public static final /* synthetic */ ChatInfo C(ChatActivity chatActivity) {
    }

    public static final /* synthetic */ h.u.a.u.y3.m.c D(ChatActivity chatActivity) {
    }

    private final void E(boolean z) {
    }

    private static final void F(ChatActivity chatActivity, n nVar) {
    }

    private static final void G(ImNoticeLayout imNoticeLayout, View view) {
    }

    private final void H() {
    }

    private static final void K(ChatActivity chatActivity, n nVar) {
    }

    private final void L(GroupInfoNewBean groupInfoNewBean) {
    }

    private static final void M(ChatActivity chatActivity, n nVar) {
    }

    private final void O(ChatInfo chatInfo) {
    }

    private static final void P(ChatActivity chatActivity) {
    }

    private final void Q(ChatInfo chatInfo) {
    }

    private static final void R(ChatActivity chatActivity, View view) {
    }

    private static final void S(ChatActivity chatActivity, View view) {
    }

    private static final void T(View view) {
    }

    private final boolean U() {
    }

    public static /* synthetic */ void V(ChatActivity chatActivity, n nVar) {
    }

    public static /* synthetic */ void W(ChatActivity chatActivity, n nVar) {
    }

    public static /* synthetic */ void X(ChatActivity chatActivity, View view) {
    }

    public static /* synthetic */ void Y(ChatActivity chatActivity) {
    }

    public static /* synthetic */ void Z(ImNoticeLayout imNoticeLayout, View view) {
    }

    public static /* synthetic */ void a0(ChatActivity chatActivity) {
    }

    public static /* synthetic */ void b0(ChatActivity chatActivity, n nVar) {
    }

    public static /* synthetic */ void c0(ChatActivity chatActivity, n nVar) {
    }

    public static /* synthetic */ void d0(ChatActivity chatActivity, View view) {
    }

    public static /* synthetic */ void e0(View view) {
    }

    private static final void f0(ChatActivity chatActivity, n nVar) {
    }

    private final void i0(GroupInfoNewBean groupInfoNewBean, GroupNoticeBean groupNoticeBean) {
    }

    private final void w(boolean z) {
    }

    private final void x(List<AuthorInfo> list) {
    }

    private static final void y(ChatActivity chatActivity) {
    }

    private final void z(GroupInfoNewBean groupInfoNewBean) {
    }

    @Nullable
    public final CustomChatView I() {
    }

    public final void J(@Nullable String str) {
    }

    public final void N(@Nullable TUIMessageBean tUIMessageBean) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // com.showstartfans.activity.view.custom_im_ui.activity.CustomBaseLightActivity, android.app.Activity
    public void finish() {
    }

    public final void g0(@Nullable String str) {
    }

    public final void h0(long j2, @Nullable CustomMessageRecyclerView.h hVar) {
    }

    @Override // com.showstartfans.activity.view.custom_im_ui.activity.CustomTUIBaseChatActivity
    public void initChat(@Nullable ChatInfo chatInfo) {
    }

    @Override // com.showstartfans.activity.view.custom_im_ui.activity.CustomBaseLightActivity, com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // com.showstartfans.activity.view.custom_im_ui.activity.CustomTUIBaseChatActivity, com.showstartfans.activity.view.custom_im_ui.activity.CustomBaseLightActivity, com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    public final void j0(@Nullable String str, @Nullable String str2, @Nullable String str3) {
    }

    public final void k0(@Nullable String str) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable OnGtoupPremissionEvent onGtoupPremissionEvent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable v vVar) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable OnConfirmGroupNoticeEvent onConfirmGroupNoticeEvent) {
    }
}
