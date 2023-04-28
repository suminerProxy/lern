package com.showstartfans.activity.activitys.maintab.newmain;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.R;
import com.showstartfans.activity.XiudongApplication;
import com.showstartfans.activity.activitys.community.CommunitySiteListActivity;
import com.showstartfans.activity.activitys.maintab.MessageCommActivity;
import com.showstartfans.activity.activitys.maintab.MessageShowActivity;
import com.showstartfans.activity.activitys.maintab.newmain.MainNewActivity;
import com.showstartfans.activity.activitys.profile.ShowClassSceneActivity;
import com.showstartfans.activity.activitys.usercenter.CollectActivity;
import com.showstartfans.activity.activitys.usercenter.OrderTabListActivity;
import com.showstartfans.activity.activitys.usercenter.UserQRCodeActivity;
import com.showstartfans.activity.base.BaseMainTabActivity;
import com.showstartfans.activity.eventmodel.InterceptKeyEvent;
import com.showstartfans.activity.eventmodel.LoginEvent;
import com.showstartfans.activity.eventmodel.MainTabEvent;
import com.showstartfans.activity.eventmodel.MessageNewEvent;
import com.showstartfans.activity.eventmodel.MessageTabOfficialEvent;
import com.showstartfans.activity.eventmodel.PlayMusicEvent;
import com.showstartfans.activity.eventmodel.PushEvent;
import com.showstartfans.activity.eventmodel.TicketMessageEvent;
import com.showstartfans.activity.eventmodel.TpnsTextMessageEvent;
import com.showstartfans.activity.eventmodel.UploadLogEvent;
import com.showstartfans.activity.model.GroupMsgBean;
import com.showstartfans.activity.model.JPushBean;
import com.showstartfans.activity.model.LevelInfo;
import com.showstartfans.activity.model.MessageUnreadBean;
import com.showstartfans.activity.service.UpGPSService;
import com.sobot.chat.ZCSobotApi;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.tencent.qcloud.tuicore.util.SPUtils;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import h.u.a.c.f0.v9.z3;
import h.u.a.i.a;
import h.u.a.l.g;
import h.u.a.t.a3;
import h.u.a.t.e3;
import h.u.a.t.f2;
import h.u.a.t.j1;
import h.u.a.t.j3;
import h.u.a.t.k1;
import h.u.a.t.k2;
import h.u.a.t.p2;
import h.u.a.u.t3;
import h.u.a.u.v3;
import h.u.a.u.y3.q.b;
import h.y.a.f.k;
import h.y.a.m.h;
import h.y.a.m.i;
import h.y.a.m.n;
import h.y.a.m.q;
import h.y.a.n.c1;
import h.y.a.n.f1;
import h.y.a.n.g1;
import h.y.a.n.i0;
import h.y.a.n.t0;
import h.y.a.n.u0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tencent.im.TencentIMControl;

/* compiled from: MainNewActivity.kt */
@Metadata(d1 = {"\u0000\u008d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012*\u00016\u0018\u0000 \u008b\u00012\u00020\u00012\u00020\u0002:\u0002\u008b\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020AH\u0002J\u000e\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020\tJ\b\u0010E\u001a\u00020AH\u0002J\u0010\u0010F\u001a\u00020A2\b\u0010G\u001a\u0004\u0018\u000104J\u0006\u0010H\u001a\u00020AJ\u0006\u0010I\u001a\u00020AJ\u0006\u0010J\u001a\u00020AJ\u0006\u0010K\u001a\u00020AJ\u0006\u0010L\u001a\u00020AJ\u0006\u0010M\u001a\u00020AJ\u0006\u0010N\u001a\u00020AJ\u0006\u0010O\u001a\u00020AJ\b\u0010P\u001a\u00020AH\u0002J\u0006\u0010Q\u001a\u00020\tJ\u0006\u0010R\u001a\u00020\tJ\u0006\u0010S\u001a\u00020\tJ\u000e\u0010T\u001a\u00020A2\u0006\u0010U\u001a\u00020\tJ\u0012\u0010V\u001a\u00020A2\b\b\u0002\u0010W\u001a\u00020XH\u0002J\b\u0010Y\u001a\u00020AH\u0014J\b\u0010Z\u001a\u00020AH\u0002J\b\u0010[\u001a\u00020AH\u0014J\b\u0010\\\u001a\u00020AH\u0002J\b\u0010]\u001a\u00020AH\u0014J\b\u0010^\u001a\u00020AH\u0014J\b\u0010_\u001a\u00020AH\u0016J\u0012\u0010`\u001a\u00020A2\b\u0010a\u001a\u0004\u0018\u00010bH\u0014J\b\u0010c\u001a\u00020AH\u0014J\u0012\u0010d\u001a\u00020A2\b\u0010e\u001a\u0004\u0018\u00010fH\u0007J\u0012\u0010d\u001a\u00020A2\b\u0010e\u001a\u0004\u0018\u00010gH\u0007J\u0012\u0010d\u001a\u00020A2\b\u0010e\u001a\u0004\u0018\u00010hH\u0007J\u0012\u0010d\u001a\u00020A2\b\u0010e\u001a\u0004\u0018\u00010iH\u0007J\u0012\u0010d\u001a\u00020A2\b\u0010e\u001a\u0004\u0018\u00010jH\u0007J\u0012\u0010d\u001a\u00020A2\b\u0010e\u001a\u0004\u0018\u00010kH\u0007J\u0012\u0010d\u001a\u00020A2\b\u0010e\u001a\u0004\u0018\u00010lH\u0007J\u0012\u0010d\u001a\u00020A2\b\u0010e\u001a\u0004\u0018\u00010mH\u0007J\u0012\u0010d\u001a\u00020A2\b\u0010e\u001a\u0004\u0018\u00010nH\u0007J\u0012\u0010d\u001a\u00020A2\b\u0010e\u001a\u0004\u0018\u00010oH\u0007J\u0012\u0010p\u001a\u00020A2\b\u0010q\u001a\u0004\u0018\u00010XH\u0014J\u0010\u0010r\u001a\u00020A2\u0006\u0010a\u001a\u00020bH\u0014J\b\u0010s\u001a\u00020AH\u0014J\u0018\u0010t\u001a\u00020A2\u0006\u0010u\u001a\u00020b2\u0006\u0010v\u001a\u00020wH\u0016J\u001a\u0010x\u001a\u00020A2\u0006\u0010y\u001a\u00020z2\b\b\u0002\u0010{\u001a\u00020\u0005H\u0002J\u0012\u0010|\u001a\u00020A2\b\u0010}\u001a\u0004\u0018\u00010zH\u0002J\b\u0010~\u001a\u00020AH\u0002J\b\u0010\u007f\u001a\u00020\tH\u0014J\u0010\u0010\u0080\u0001\u001a\u00020A2\u0007\u0010\u0081\u0001\u001a\u00020\tJ\t\u0010\u0082\u0001\u001a\u00020AH\u0002J\u0010\u0010\u0083\u0001\u001a\u00020A2\u0007\u0010\u0081\u0001\u001a\u00020\tJ\u0007\u0010\u0084\u0001\u001a\u00020AJ\u0010\u0010\u0085\u0001\u001a\u00020A2\u0007\u0010\u0086\u0001\u001a\u00020\u0005J\u0010\u0010\u0087\u0001\u001a\u00020A2\u0007\u0010\u0088\u0001\u001a\u00020\u0005J\u0012\u0010\u0089\u0001\u001a\u00020A2\u0007\u0010\u008a\u0001\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\u001e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u0011R\u001a\u0010!\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u0011R\u001a\u0010$\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010\u0011R\u001a\u0010'\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010\u0011R\u001a\u0010*\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u0011R\u001a\u00100\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\r\"\u0004\b2\u0010\u0011R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b7\u00108R\u001b\u0010;\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b=\u0010>¨\u0006\u008c\u0001"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/MainNewActivity;", "Lcom/showstartfans/activity/base/BaseMainTabActivity;", "Lcom/showstartfans/activity/view/custom_im_ui/kits/DyConversationManager$MessageUnreadWatcher;", "()V", "clickMenu", "", "handler", "Landroid/os/Handler;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "<set-?>", "lastIndex", "getLastIndex", "()I", "mActivityMsgNum", "getMActivityMsgNum", "setMActivityMsgNum", "(I)V", "mAttentionNum", "getMAttentionNum", "setMAttentionNum", "mCommentMsgNum", "getMCommentMsgNum", "setMCommentMsgNum", "mFansMsgNum", "getMFansMsgNum", "setMFansMsgNum", "mGoodsUnReadNum", "getMGoodsUnReadNum", "setMGoodsUnReadNum", "mGroupUnReadNum", "getMGroupUnReadNum", "setMGroupUnReadNum", "mIMunReadNum", "getMIMunReadNum", "setMIMunReadNum", "mLikeMsgNum", "getMLikeMsgNum", "setMLikeMsgNum", "mOfficialMsgNum", "getMOfficialMsgNum", "setMOfficialMsgNum", "mOrderMsgNum", "getMOrderMsgNum", "setMOrderMsgNum", "mRaiseUnReadNum", "getMRaiseUnReadNum", "setMRaiseUnReadNum", "mStatementMsgNum", "getMStatementMsgNum", "setMStatementMsgNum", "mUnreadBean", "Lcom/showstartfans/activity/model/MessageUnreadBean;", "runnableAES", "com/showstartfans/activity/activitys/maintab/newmain/MainNewActivity$runnableAES$2$1", "getRunnableAES", "()Lcom/showstartfans/activity/activitys/maintab/newmain/MainNewActivity$runnableAES$2$1;", "runnableAES$delegate", "Lkotlin/Lazy;", "tabManager", "Lcom/showstartfans/activity/view/TabFragmentManager;", "getTabManager", "()Lcom/showstartfans/activity/view/TabFragmentManager;", "tabManager$delegate", "checkImUnreadNum", "", "checkItem", "checkItemById", "id", "checkShortcutType", "checkUnReadMsg", "unreadBean", "checkUpdateUserEfat", "clearCommNum", "clearFollowNum", "clearJoinGroupNum", "clearOfficalNum", "clearOrderMsgNum", "clearShowMsgNum", "clearTabFoundUnReadNum", "getAllMessagePoint", "getFoundUnReadNum", "getIndex", "getMsgUnReadNumAll", "gotoTab", "poi", "initCheck", "mIntent", "Landroid/content/Intent;", "initData", "initDeBugTools", "initListener", "initScreenListener", "initView", "loginImSuccess", "looperQueueFree", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/InterceptKeyEvent;", "Lcom/showstartfans/activity/eventmodel/LoginEvent;", "Lcom/showstartfans/activity/eventmodel/MainTabEvent;", "Lcom/showstartfans/activity/eventmodel/MessageNewEvent;", "Lcom/showstartfans/activity/eventmodel/PlayMusicEvent;", "Lcom/showstartfans/activity/eventmodel/PushEvent;", "Lcom/showstartfans/activity/eventmodel/TicketMessageEvent;", "Lcom/showstartfans/activity/eventmodel/TpnsTextMessageEvent;", "Lcom/showstartfans/activity/eventmodel/UploadLogEvent;", "Lcom/taihebase/activity/network/TokenExpireEvent;", "onNewIntent", "intent", "onRestoreInstanceState", "onResume", "onSaveInstanceState", "outState", "outPersistentState", "Landroid/os/PersistableBundle;", "onViewClick", am.aE, "Landroid/view/View;", "isDoubleClick", "registerDoubleClickListener", "clickView", "requestLocation", "setContentViewRes", "setFoundUnReadNum", "num", "setFragmentVisible", "setMsgUnReadNum", "setPlayMusicIcon", "showTickerRedPoint", "show", "updateTicketTabUI", "reset", "updateUnread", AnimatedPasterJsonConfig.CONFIG_COUNT, "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class MainNewActivity extends BaseMainTabActivity implements b.d {
    @NotNull
    public static final String C = "PointPos";

    /* renamed from: i  reason: collision with root package name */
    private int f5943i;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private MessageUnreadBean f5946l;

    /* renamed from: m  reason: collision with root package name */
    private int f5947m;

    /* renamed from: n  reason: collision with root package name */
    private int f5948n;

    /* renamed from: o  reason: collision with root package name */
    private int f5949o;

    /* renamed from: p  reason: collision with root package name */
    private int f5950p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    @NotNull
    public static final a B = new a(null);
    @NotNull
    private static final String D = h.a.a.a.a.i.g.C;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public Map<Integer, View> f5942h = new LinkedHashMap();

    /* renamed from: j  reason: collision with root package name */
    private int f5944j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5945k = true;
    @NotNull
    private final Handler y = new Handler();
    @NotNull
    private final Lazy z = LazyKt__LazyJVMKt.lazy(new g(this));
    @NotNull
    private final Lazy A = LazyKt__LazyJVMKt.lazy(new f(this));

    /* compiled from: MainNewActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/MainNewActivity$Companion;", "", "()V", "POSITION_ID", "", "getPOSITION_ID", "()Ljava/lang/String;", MainNewActivity.C, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final String a() {
        }
    }

    /* compiled from: MainNewActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/MainNewActivity$initDeBugTools$1", "Lcom/showstartfans/activity/helper/SensorManagerHelper$OnShakeListener;", "onShake", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements a.InterfaceC0360a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MainNewActivity f5951a;

        public b(MainNewActivity mainNewActivity) {
        }

        @Override // h.u.a.i.a.InterfaceC0360a
        public void a() {
        }
    }

    /* compiled from: MainNewActivity.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/MainNewActivity$initScreenListener$1", "Lcom/showstartfans/activity/listener/ScreenListener$ScreenStateListener;", "onScreenOff", "", "onScreenOn", "onUserPresent", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements g.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MainNewActivity f5952a;

        public c(MainNewActivity mainNewActivity) {
        }

        @Override // h.u.a.l.g.c
        public void a() {
        }

        @Override // h.u.a.l.g.c
        public void b() {
        }

        @Override // h.u.a.l.g.c
        public void c() {
        }
    }

    /* compiled from: MainNewActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "isInCheckDoubleClick", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function2<View, Boolean, Unit> {
        public final /* synthetic */ MainNewActivity this$0;

        public d(MainNewActivity mainNewActivity) {
        }

        public static /* synthetic */ void a(MainNewActivity mainNewActivity) {
        }

        /* renamed from: invoke$lambda-1  reason: not valid java name */
        private static final void m22invoke$lambda1(MainNewActivity mainNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Boolean bool) {
        }

        public final void invoke(@NotNull View view, boolean z) {
        }
    }

    /* compiled from: MainNewActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ MainNewActivity this$0;

        public e(MainNewActivity mainNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
        }
    }

    /* compiled from: MainNewActivity.kt */
    @Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/showstartfans/activity/activitys/maintab/newmain/MainNewActivity$runnableAES$2$1", "invoke", "()Lcom/showstartfans/activity/activitys/maintab/newmain/MainNewActivity$runnableAES$2$1;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function0<a> {
        public final /* synthetic */ MainNewActivity this$0;

        /* compiled from: MainNewActivity.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/MainNewActivity$runnableAES$2$1", "Ljava/lang/Runnable;", "run", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a implements Runnable {
            public final /* synthetic */ MainNewActivity b;

            public a(MainNewActivity mainNewActivity) {
            }

            public static /* synthetic */ void a(MainNewActivity mainNewActivity, a aVar, n nVar) {
            }

            private static final void b(MainNewActivity mainNewActivity, a aVar, n nVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public f(MainNewActivity mainNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ a invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final a invoke() {
        }
    }

    /* compiled from: MainNewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/view/TabFragmentManager;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends Lambda implements Function0<t3> {
        public final /* synthetic */ MainNewActivity this$0;

        public g(MainNewActivity mainNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ t3 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final t3 invoke() {
        }
    }

    private final void D0() {
        h.k(getCtx(), "/app/msg/unreadMsg", new i(), new h.y.a.m.g(this) { // from class: h.u.a.c.f0.v9.k

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MainNewActivity f18721a;

            @Override // h.y.a.m.g
            public final void a(h.y.a.m.n nVar) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(MainNewActivity this$0, n nVar) {
        MessageUnreadBean messageUnreadBean;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!nVar.f() || (messageUnreadBean = (MessageUnreadBean) f2.c(nVar.c(), MessageUnreadBean.class)) == null) {
            return;
        }
        this$0.u0(messageUnreadBean);
    }

    private final f.a V0() {
        return (f.a) this.A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t3 W0() {
        return (t3) this.z.getValue();
    }

    private final void Y0(Intent intent) {
        this.f5943i = intent.getIntExtra(C, this.f5943i);
        r0();
    }

    public static /* synthetic */ void Z0(MainNewActivity mainNewActivity, Intent intent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            intent = mainNewActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "fun initCheck(mIntent: I…        checkItem()\n    }");
        }
        mainNewActivity.Y0(intent);
    }

    private final void a1() {
        if (k.s) {
            new h.u.a.i.a(this).setOnShakeListener(new b(this));
            if (TextUtils.isEmpty(SPUtils.getInstance().getString("EnvMode"))) {
                return;
            }
            f1.i("当前环境：" + ((Object) SPUtils.getInstance().getString("EnvMode")) + "\n此toast仅测试环境可见");
        }
    }

    private final void b1() {
        new h.u.a.l.g(this).b(new c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f1(MainNewActivity this$0, PlayMusicEvent playMusicEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = (TextView) this$0._$_findCachedViewById(R.id.tabUserTV);
        if (textView == null) {
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, playMusicEvent.isPlay ? R.drawable.icon_user_music_selector : R.drawable.icon_user_selector, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g1(MessageNewEvent messageNewEvent, Object obj) {
        EventBus.getDefault().post(messageNewEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h1(View view, boolean z) {
        if (this.f5945k) {
            int i2 = R.id.tabHome;
            if (Intrinsics.areEqual(view, (TextView) _$_findCachedViewById(i2))) {
                this.f5943i = 0;
            } else if (Intrinsics.areEqual(view, (TextView) _$_findCachedViewById(R.id.tabFound_p))) {
                this.f5943i = 1;
            } else if (Intrinsics.areEqual(view, (FrameLayout) _$_findCachedViewById(R.id.ticket_holder))) {
                this.f5943i = 2;
            } else if (Intrinsics.areEqual(view, (FrameLayout) _$_findCachedViewById(R.id.tabMessage))) {
                this.f5943i = 3;
            } else if (Intrinsics.areEqual(view, (TextView) _$_findCachedViewById(R.id.tabUserTV))) {
                this.f5943i = 4;
            }
            if (!z) {
                if (Intrinsics.areEqual(view, (TextView) _$_findCachedViewById(i2))) {
                    r0();
                    g1.M0(getCtx().getApplicationContext());
                } else if (Intrinsics.areEqual(view, (TextView) _$_findCachedViewById(R.id.tabFound_p))) {
                    r0();
                    g1.D0(getCtx().getApplicationContext());
                } else if (Intrinsics.areEqual(view, (FrameLayout) _$_findCachedViewById(R.id.ticket_holder))) {
                    if (k1.f24512a.q(getCtx(), new String[0])) {
                        r0();
                    }
                } else if (Intrinsics.areEqual(view, (FrameLayout) _$_findCachedViewById(R.id.tabMessage))) {
                    if (k1.f24512a.q(getCtx(), new String[0])) {
                        r0();
                        g1.V0(getCtx().getApplicationContext());
                    }
                } else if (Intrinsics.areEqual(view, (TextView) _$_findCachedViewById(R.id.tabUserTV)) && k1.f24512a.q(getCtx(), new String[0])) {
                    r0();
                    g1.P0(getCtx().getApplicationContext());
                }
                m1();
                return;
            }
            h.y.a.f.o.e d2 = W0().d(this.f5943i);
            if (d2 != null && (d2 instanceof h.u.a.l.b)) {
                ((h.u.a.l.b) d2).p();
            }
        }
    }

    public static /* synthetic */ void i1(MainNewActivity mainNewActivity, View view, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        mainNewActivity.h1(view, z);
    }

    private final void j1(View view) {
        v3.f24747a.b(view, new d(this), new e(this));
    }

    private final void k1() {
        if (!H().H0()) {
            H().y2();
            h0();
        } else if (h.z.a.f.e(this).f("android.permission.ACCESS_FINE_LOCATION")) {
            if (Build.VERSION.SDK_INT >= 26) {
                startForegroundService(new Intent(getCtx(), UpGPSService.class));
            } else {
                startService(new Intent(getCtx(), UpGPSService.class));
            }
        }
    }

    private final void m1() {
        try {
            if (this.f5943i == 2) {
                h.y.a.f.o.e d2 = W0().d(this.f5943i);
                if (d2 != null) {
                    d2.Resume();
                }
            } else {
                h.y.a.f.o.e d3 = W0().d(2);
                if (d3 != null) {
                    d3.Pause();
                }
            }
        } catch (Exception unused) {
        }
    }

    private final void q0() {
        GroupMsgBean goodsMsgVo;
        GroupMsgBean raiseMsgVo;
        if (G()) {
            h.u.a.u.y3.q.b.s().C(this);
            h.u.a.u.y3.q.b.s().h(this);
            MessageUnreadBean messageUnreadBean = this.f5946l;
            ConversationInfo formatToGoodConversationInfo = (messageUnreadBean == null || (goodsMsgVo = messageUnreadBean.getGoodsMsgVo()) == null) ? null : goodsMsgVo.formatToGoodConversationInfo();
            MessageUnreadBean messageUnreadBean2 = this.f5946l;
            ConversationInfo formatToCrowdConversationInfo = (messageUnreadBean2 == null || (raiseMsgVo = messageUnreadBean2.getRaiseMsgVo()) == null) ? null : raiseMsgVo.formatToCrowdConversationInfo();
            ArrayList arrayList = new ArrayList();
            if (formatToGoodConversationInfo != null) {
                arrayList.add(formatToGoodConversationInfo);
            }
            if (formatToCrowdConversationInfo != null) {
                arrayList.add(formatToCrowdConversationInfo);
            }
            h.u.a.u.y3.q.b.s().x(arrayList, null);
        }
    }

    private final void r0() {
        TextView textView = (TextView) _$_findCachedViewById(R.id.tabHome);
        if (textView != null) {
            textView.setSelected(this.f5943i == 0);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.tabFound_p);
        if (textView2 != null) {
            textView2.setSelected(this.f5943i == 1);
        }
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.ticket_holder);
        if (frameLayout != null) {
            frameLayout.setSelected(this.f5943i == 2);
        }
        FrameLayout frameLayout2 = (FrameLayout) _$_findCachedViewById(R.id.tabMessage);
        if (frameLayout2 != null) {
            frameLayout2.setSelected(this.f5943i == 3);
        }
        TextView textView3 = (TextView) _$_findCachedViewById(R.id.tabUserTV);
        if (textView3 != null) {
            textView3.setSelected(this.f5943i == 4);
        }
        int i2 = this.f5944j;
        int i3 = this.f5943i;
        if (i2 != i3) {
            this.f5944j = i3;
            W0().e(this.f5943i);
            C1(this.f5943i != 2);
        }
    }

    private final void t0() {
        int intExtra = getIntent().getIntExtra("ShortcutType", -1);
        if (intExtra == 1) {
            this.f5943i = 2;
            r0();
        } else if (intExtra == 2) {
            startActivity(new Intent(getCtx(), CollectActivity.class));
        } else if (intExtra == 3) {
            OrderTabListActivity.a.d(OrderTabListActivity.f6352f, this, 1, null, 4, null);
        } else if (intExtra != 4) {
        } else {
            startActivity(new Intent(getCtx(), UserQRCodeActivity.class));
        }
    }

    public final void A0() {
        this.v = 0;
        z1(U0());
    }

    public final void A1() {
        TextView textView = (TextView) _$_findCachedViewById(R.id.tabUserTV);
        if (textView == null) {
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.icon_user_music_selector, 0, 0);
    }

    public final void B0() {
        this.f5948n = 0;
        z1(U0());
    }

    public final void B1(boolean z) {
        ((ImageView) _$_findCachedViewById(R.id.iv_ticket_redpoint)).setVisibility(z ? 0 : 8);
    }

    public final void C0() {
        this.f5947m = 0;
        l1(F0());
        try {
            h.y.a.f.o.e d2 = W0().d(1);
            if (d2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.showstartfans.activity.activitys.maintab.newmain.TabFindNewFragment");
            }
            ((z3) d2).z();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void C1(boolean z) {
        if (z) {
            ImageView imageView = (ImageView) _$_findCachedViewById(R.id.tab_ticket_icon);
            if ((imageView == null ? null : imageView.getTag()) == null) {
                return;
            }
        }
        if (!z) {
            ImageView imageView2 = (ImageView) _$_findCachedViewById(R.id.tab_ticket_icon);
            if ((imageView2 == null ? null : imageView2.getTag()) != null) {
                return;
            }
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.ticket_name);
        if (textView != null) {
            textView.setText(z ? "票夹" : "刷新");
        }
        int i2 = R.id.tab_ticket_icon;
        ImageView imageView3 = (ImageView) _$_findCachedViewById(i2);
        if (imageView3 != null) {
            imageView3.setTag(z ? null : "刷新");
        }
        ImageView imageView4 = (ImageView) _$_findCachedViewById(i2);
        if (imageView4 == null) {
            return;
        }
        imageView4.setImageResource(z ? R.drawable.ic_tickets_selector : c1.c() ? R.drawable.icon_home_ticket_ref_night : R.drawable.icon_home_ticket_ref);
    }

    public final int F0() {
        return this.f5947m;
    }

    public final int G0() {
        return this.f5943i;
    }

    public final int H0() {
        return this.f5944j;
    }

    public final int I0() {
        return this.f5948n;
    }

    public final int J0() {
        return this.f5947m;
    }

    public final int K0() {
        return this.f5949o;
    }

    public final int L0() {
        return this.f5950p;
    }

    public final int M0() {
        return this.q;
    }

    public final int N0() {
        return this.r;
    }

    public final int O0() {
        return this.x;
    }

    public final int P0() {
        return this.t;
    }

    public final int Q0() {
        return this.u;
    }

    public final int R0() {
        return this.v;
    }

    @Override // com.showstartfans.activity.base.BaseMainTabActivity
    public void S() {
        q0();
    }

    public final int S0() {
        return this.s;
    }

    public final int T0() {
        return this.w;
    }

    public final int U0() {
        i0.g("mActivityMsgNum=" + this.f5948n + " mCommentMsgNum=" + this.f5949o + " mFansMsgNum=" + this.f5950p + " mGoodsUnReadNum=" + this.q + " mGroupUnReadNum=" + this.r + " mRaiseUnReadNum=" + this.s + " mLikeMsgNum=" + this.t + " mOfficialMsgNum=" + this.u + " mOrderMsgNum=" + this.v + " mStatementMsgNum=" + this.w + " mIMunReadNum=" + this.x);
        return this.f5948n + this.f5949o + this.f5950p + this.q + this.r + this.s + this.t + this.u + this.v + this.w + this.x;
    }

    @Override // com.showstartfans.activity.base.BaseMainTabActivity
    public void W() {
    }

    public final void X0(int i2) {
        this.f5943i = i2;
        r0();
    }

    @Override // com.showstartfans.activity.base.BaseMainTabActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
        this.f5942h.clear();
    }

    @Override // com.showstartfans.activity.base.BaseMainTabActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
        Map<Integer, View> map = this.f5942h;
        View view = map.get(Integer.valueOf(i2));
        if (view == null) {
            View findViewById = findViewById(i2);
            if (findViewById == null) {
                return null;
            }
            map.put(Integer.valueOf(i2), findViewById);
            return findViewById;
        }
        return view;
    }

    @Override // h.u.a.u.y3.q.b.d
    public void g(int i2) {
        this.x = i2;
        z1(U0());
    }

    @Override // com.showstartfans.activity.base.BaseMainTabActivity, com.taihebase.activity.base.BaseNewActivity
    public void initData() {
        super.initData();
        Z0(this, null, 1, null);
        k1();
        j1.f24501a.a(this);
        j3.m(getCtx(), null);
        if (H().h1()) {
            D0();
        }
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
        j1((TextView) _$_findCachedViewById(R.id.tabHome));
        j1((TextView) _$_findCachedViewById(R.id.tabFound_p));
        j1((FrameLayout) _$_findCachedViewById(R.id.ticket_holder));
        j1((FrameLayout) _$_findCachedViewById(R.id.tabMessage));
        j1((TextView) _$_findCachedViewById(R.id.tabUserTV));
    }

    @Override // com.showstartfans.activity.base.BaseMainTabActivity, com.taihebase.activity.base.BaseNewActivity
    public void initView() {
        super.initView();
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        Boolean hasUnRedTicketMain = u0.L().d("hasUnRedTicketMain", false);
        Intrinsics.checkNotNullExpressionValue(hasUnRedTicketMain, "hasUnRedTicketMain");
        B1(hasUnRedTicketMain.booleanValue());
        b1();
        a1();
    }

    public final void l1(int i2) {
        if (i2 > 0) {
            try {
                TextView textView = (TextView) _$_findCachedViewById(R.id.tabFoundNum);
                if (textView != null) {
                    textView.setText(i2 > 99 ? "99" : Intrinsics.stringPlus("", Integer.valueOf(i2)));
                }
            } catch (Exception unused) {
                int i3 = R.id.tabFoundNum;
                TextView textView2 = (TextView) _$_findCachedViewById(i3);
                if (textView2 != null) {
                    textView2.setText("");
                }
                TextView textView3 = (TextView) _$_findCachedViewById(i3);
                if (textView3 == null) {
                    return;
                }
                textView3.setVisibility(8);
                return;
            }
        }
        TextView textView4 = (TextView) _$_findCachedViewById(R.id.tabFoundNum);
        if (textView4 == null) {
            return;
        }
        textView4.setVisibility(i2 > 0 ? 0 : 8);
    }

    public final void n1(int i2) {
        this.f5948n = i2;
    }

    public final void o1(int i2) {
        this.f5947m = i2;
    }

    @Override // com.taihebase.activity.base.BaseNoToolBarActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, com.tbruyelle.rxpermissions.BaseFixOTranslucentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.remove(FragmentActivity.FRAGMENTS_TAG);
        }
        Integer valueOf = bundle == null ? null : Integer.valueOf(bundle.getInt(MapBundleKey.MapObjKey.OBJ_SL_INDEX));
        this.f5943i = valueOf == null ? this.f5943i : valueOf.intValue();
        super.onCreate(bundle);
        t0();
        this.y.postDelayed(V0(), XiudongApplication.b.a());
    }

    @Override // com.showstartfans.activity.base.BaseMainTabActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        e3.f24462a.a();
        h.u.a.u.y3.q.b.s().o();
        super.onDestroy();
        try {
            EventBus.getDefault().unregister(this);
            a3.q();
        } catch (Exception unused) {
        }
        this.y.removeCallbacks(V0());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable LoginEvent loginEvent) {
        if (loginEvent == null) {
            return;
        }
        if (loginEvent.isLogin) {
            U();
            Y();
            a0();
            D0();
            return;
        }
        X();
        ZCSobotApi.outCurrentUserZCLibInfo(getCtx());
        C0();
        z1(0);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            int intExtra = intent.getIntExtra(D, -1000);
            if (intExtra != -1000) {
                s0(intExtra);
            }
            MessageNewEvent messageNewEvent = (MessageNewEvent) intent.getParcelableExtra("event");
            if (messageNewEvent != null) {
                t0.b(1000, new i.a.x0.g(messageNewEvent) { // from class: h.u.a.c.f0.v9.j
                    public final /* synthetic */ MessageNewEvent b;

                    @Override // i.a.x0.g
                    public final void accept(Object obj) {
                    }
                });
            }
            J(intent);
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NotNull Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        this.f5943i = savedInstanceState.getInt(MapBundleKey.MapObjKey.OBJ_SL_INDEX);
        r0();
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState, @NotNull PersistableBundle outPersistentState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Intrinsics.checkNotNullParameter(outPersistentState, "outPersistentState");
        super.onSaveInstanceState(outState, outPersistentState);
        super.onSaveInstanceState(outState);
        outState.putInt(MapBundleKey.MapObjKey.OBJ_SL_INDEX, this.f5943i);
    }

    public final void p1(int i2) {
        this.f5949o = i2;
    }

    public final void q1(int i2) {
        this.f5950p = i2;
    }

    public final void r1(int i2) {
        this.q = i2;
    }

    public final void s0(int i2) {
        switch (i2) {
            case R.id.tabFound_p /* 2131365283 */:
                this.f5943i = 1;
                break;
            case R.id.tabHome /* 2131365284 */:
                this.f5943i = 0;
                break;
            case R.id.tabMessage /* 2131365286 */:
                this.f5943i = 3;
                break;
            case R.id.tabUserTV /* 2131365292 */:
                this.f5943i = 4;
                break;
            case R.id.ticket_holder /* 2131365434 */:
                this.f5943i = 2;
                break;
        }
        r0();
        t0();
    }

    public final void s1(int i2) {
        this.r = i2;
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
        return R.layout.activity_main_new;
    }

    public final void t1(int i2) {
        this.x = i2;
    }

    public final void u0(@Nullable MessageUnreadBean messageUnreadBean) {
        this.f5946l = messageUnreadBean;
        if (messageUnreadBean == null) {
            return;
        }
        q0();
        this.f5947m = messageUnreadBean.getAttentionNum();
        this.f5948n = messageUnreadBean.getActivityMsgNum();
        this.f5949o = messageUnreadBean.getCommentMsgNum();
        this.f5950p = messageUnreadBean.getFansMsgNum();
        GroupMsgBean groupMsgVo = messageUnreadBean.getGroupMsgVo();
        this.r = groupMsgVo == null ? 0 : groupMsgVo.getUnReadNum();
        this.q = 0;
        this.s = 0;
        this.t = messageUnreadBean.getLikeMsgNum();
        this.u = messageUnreadBean.getOfficialMsgNum();
        this.v = messageUnreadBean.getOrderMsgNum();
        this.w = messageUnreadBean.getStatementMsgNum();
        int U0 = U0();
        l1(F0());
        if (U0 > 0) {
            z1(U0);
        }
    }

    public final void u1(int i2) {
        this.t = i2;
    }

    public final void v0() {
        long currentTimeMillis = System.currentTimeMillis();
        XiudongApplication.a aVar = XiudongApplication.b;
        if (currentTimeMillis - aVar.b() > aVar.a()) {
            aVar.d(System.currentTimeMillis());
            onEvent(new q());
        }
    }

    public final void v1(int i2) {
        this.u = i2;
    }

    public final void w0() {
        this.f5949o = 0;
        this.f5950p = 0;
        this.t = 0;
        this.w = 0;
        z1(U0());
    }

    public final void w1(int i2) {
        this.v = i2;
    }

    public final void x0() {
    }

    public final void x1(int i2) {
        this.s = i2;
    }

    public final void y0() {
        this.r = 0;
        z1(U0());
    }

    public final void y1(int i2) {
        this.w = i2;
    }

    public final void z0() {
        this.u = 0;
        z1(U0());
    }

    public final void z1(int i2) {
        if (i2 > 0) {
            try {
                TextView textView = (TextView) _$_findCachedViewById(R.id.msgNum);
                if (textView != null) {
                    textView.setText(i2 > 99 ? "99" : Intrinsics.stringPlus("", Integer.valueOf(i2)));
                }
            } catch (Exception unused) {
                int i3 = R.id.msgNum;
                TextView textView2 = (TextView) _$_findCachedViewById(i3);
                if (textView2 != null) {
                    textView2.setText("");
                }
                TextView textView3 = (TextView) _$_findCachedViewById(i3);
                if (textView3 == null) {
                    return;
                }
                textView3.setVisibility(8);
                return;
            }
        }
        TextView textView4 = (TextView) _$_findCachedViewById(R.id.msgNum);
        if (textView4 == null) {
            return;
        }
        textView4.setVisibility(i2 > 0 ? 0 : 8);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable q qVar) {
        this.y.removeCallbacks(V0());
        this.y.post(V0());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable MessageNewEvent messageNewEvent) {
        EventBus.getDefault().removeStickyEvent(messageNewEvent);
        if ((messageNewEvent == null ? null : messageNewEvent.jpushBean) != null && H().h1()) {
            if (messageNewEvent.jpushBean.getMsgTypeV2() == 1 && Intrinsics.areEqual("1", messageNewEvent.jpushBean.getIsTicketMessage())) {
                s0(R.id.ticket_holder);
                EventBus.getDefault().post(new MessageTabOfficialEvent());
            } else if (messageNewEvent.jpushBean.getMsgTypeV2() == 6) {
                s0(R.id.ticket_holder);
                EventBus.getDefault().post(new MessageTabOfficialEvent());
            } else {
                if (messageNewEvent.jpushBean.getMsgTypeV2() == 8) {
                    if (Intrinsics.areEqual(messageNewEvent.jpushBean.getIsSceneRecordMsg(), "1")) {
                        CommunitySiteListActivity.a.b(CommunitySiteListActivity.f5393g, this, 0, null, 6, null);
                    } else if (TextUtils.isEmpty(messageNewEvent.jpushBean.getSceneActivityId())) {
                    } else {
                        ShowClassSceneActivity.a aVar = ShowClassSceneActivity.s;
                        BaseNewFunctionActivity ctx = getCtx();
                        String sceneActivityId = messageNewEvent.jpushBean.getSceneActivityId();
                        Intrinsics.checkNotNullExpressionValue(sceneActivityId, "event.jpushBean.sceneActivityId");
                        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(sceneActivityId);
                        aVar.a(ctx, intOrNull != null ? intOrNull.intValue() : 0, 1, "");
                    }
                } else if (messageNewEvent.jpushBean.getMsgTypeV2() != 4 && messageNewEvent.jpushBean.getMsgTypeV2() != 7) {
                    if (messageNewEvent.jpushBean.getMsgTypeV2() == 9) {
                        MessageShowActivity.f5825g.a(this, 0);
                    } else if (messageNewEvent.jpushBean.getMsgTypeV2() == 10) {
                        MessageShowActivity.f5825g.a(this, 2);
                    } else if (messageNewEvent.jpushBean.getMsgTypeV2() == 11) {
                        MessageShowActivity.f5825g.a(this, 1);
                    } else if (messageNewEvent.jpushBean.getMsgTypeV2() == 12) {
                        MessageShowActivity.f5825g.a(this, 4);
                    } else if (messageNewEvent.jpushBean.getMsgTypeV2() == 13) {
                        MessageShowActivity.f5825g.a(this, 3);
                    } else if (messageNewEvent.jpushBean.getMsgTypeV2() == 14) {
                        MessageCommActivity.f5822f.a(this, 1, null);
                    } else if (messageNewEvent.jpushBean.getMsgTypeV2() == 15) {
                        MessageCommActivity.f5822f.a(this, 2, null);
                    } else if (messageNewEvent.jpushBean.getMsgTypeV2() == 16) {
                        MessageCommActivity.f5822f.a(this, 3, null);
                    } else if (messageNewEvent.jpushBean.getMsgTypeV2() == 3) {
                        JPushBean jPushBean = messageNewEvent.jpushBean;
                        String str = jPushBean.fromUserId;
                        String str2 = jPushBean.fromUserType;
                        String str3 = jPushBean.fromUserName;
                        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                            return;
                        }
                        TencentIMControl tencentIMControl = TencentIMControl.INSTANCE;
                        tencentIMControl.openChat(this, str + '_' + ((Object) str2), str3, 1);
                    } else {
                        s0(R.id.tabMessage);
                    }
                } else {
                    MessageCommActivity.f5822f.a(this, 0, null);
                }
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable TicketMessageEvent ticketMessageEvent) {
        JPushBean jPushBean;
        if (ticketMessageEvent == null || (jPushBean = ticketMessageEvent.bean) == null || !Intrinsics.areEqual("1", jPushBean.getIsTicketMessage())) {
            return;
        }
        p2.f24565a.a(this, ticketMessageEvent.bean.getTicketId());
        B1(true);
        u0.L().i1("hasUnRedTicketMain", Boolean.TRUE);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable MainTabEvent mainTabEvent) {
        if (mainTabEvent == null) {
            return;
        }
        X0(mainTabEvent.checkIndex);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable PlayMusicEvent playMusicEvent) {
        TextView textView;
        if (playMusicEvent == null || (textView = (TextView) _$_findCachedViewById(R.id.tabUserTV)) == null) {
            return;
        }
        textView.post(new Runnable(this, playMusicEvent) { // from class: h.u.a.c.f0.v9.i
            public final /* synthetic */ MainNewActivity b;
            public final /* synthetic */ PlayMusicEvent c;

            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public final void onEvent(@Nullable UploadLogEvent uploadLogEvent) {
        if (uploadLogEvent == null) {
            return;
        }
        k2.h(uploadLogEvent.uploadId).A();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable InterceptKeyEvent interceptKeyEvent) {
        if (interceptKeyEvent == null) {
            return;
        }
        c0(!interceptKeyEvent.isIntercept);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable PushEvent pushEvent) {
        if (pushEvent == null || pushEvent.bean == null) {
            return;
        }
        D0();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable TpnsTextMessageEvent tpnsTextMessageEvent) {
        JPushBean jPushBean;
        LevelInfo levelInfo;
        if (tpnsTextMessageEvent == null || (jPushBean = tpnsTextMessageEvent.bean) == null || jPushBean.getMsgTypeV2() != 17 || (levelInfo = (LevelInfo) f2.c(tpnsTextMessageEvent.bean.userLevel, LevelInfo.class)) == null) {
            return;
        }
        new h.u.a.c.l0.e3(this, levelInfo).m();
    }
}
