package tencent.txlive.util;

import android.content.Context;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.GoodsLiveBean;
import com.showstartfans.activity.model.LiveDetailNoticeInfoBean;
import com.showstartfans.activity.model.LiveRoomDetailBean;
import com.showstartfans.activity.model.LiveShowMenuBean;
import com.showstartfans.activity.model.LiveShowMenuEventMsgBean;
import com.showstartfans.activity.model.LiveStartPLayInfoBean;
import com.showstartfans.activity.model.LiveTopGoodsClaBean;
import com.showstartfans.activity.model.LiveTopHotBean;
import com.showstartfans.activity.model.LiveTopUserBean;
import com.tencent.cloud.huiyansdkface.facelight.api.WbCloudFaceContant;
import com.tencent.qcloud.tuicore.TUIConstants;
import h.y.a.m.n;
import h.y.a.p.w.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tencent.txlive.room.roomutil.commondef.LoginInfo;
import tencent.txlive.zhibo.audience.RoomMemberBean;

/* compiled from: LiveToolUtils.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Js\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102%\u0010\u0015\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016J\b\u0010\u001b\u001a\u00020\bH\u0002JL\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042#\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016¢\u0006\u0002\u0010!JE\u0010\"\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2+\u0010\u0015\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020$\u0018\u00010#¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016J?\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\f2%\u0010\u0015\u001a!\u0012\u0015\u0012\u0013\u0018\u00010(¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016JE\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\f2+\u0010\u0015\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020+\u0018\u00010#¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016J?\u0010,\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2%\u0010\u0015\u001a!\u0012\u0015\u0012\u0013\u0018\u00010-¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016J?\u0010.\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\f2%\u0010\u0015\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016J?\u0010/\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2%\u0010\u0015\u001a!\u0012\u0015\u0012\u0013\u0018\u000100¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016Jc\u00101\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2+\u0010\u0015\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u000202\u0018\u00010#¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016JS\u00103\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2%\u0010\u0015\u001a!\u0012\u0015\u0012\u0013\u0018\u000104¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016JY\u00105\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2+\u0010\u0015\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u000206\u0018\u00010#¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016J-\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010<J1\u0010=\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010>\u001a\u0004\u0018\u00010\f2\b\u0010?\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010@J1\u0010A\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010B\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010CJT\u0010D\u001a\u00020\b2\u0006\u0010&\u001a\u00020\n2\b\u00109\u001a\u0004\u0018\u00010\f2\b\u0010:\u001a\u0004\u0018\u00010\u00042\u0006\u0010;\u001a\u00020\u00102#\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016¢\u0006\u0002\u0010EJq\u0010F\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010G\u001a\u0004\u0018\u00010\u00042\b\u0010H\u001a\u0004\u0018\u00010\u00042>\u0010\u0015\u001a:\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020J0#¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(K\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020\b\u0018\u00010I¢\u0006\u0002\u0010MJ*\u0010N\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010O\u001a\u00020 J?\u0010P\u001a\u00020\b2\u0006\u0010&\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\f2%\u0010\u0015\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016H\u0002J?\u0010R\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2%\u0010\u0015\u001a!\u0012\u0015\u0012\u0013\u0018\u00010S¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016J*\u0010T\u001a\u00020\b2\u0006\u0010&\u001a\u00020\n2\u0006\u0010U\u001a\u00020\u00042\b\u0010V\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\fJ\u0018\u0010W\u001a\u00020\b2\u0006\u0010&\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010O\u001a\u00020\b2\u0006\u0010&\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Ltencent/txlive/util/LiveToolUtils;", "", "()V", "countPoll", "", "progressDialog", "Lcom/taihebase/activity/widget/dialog/ProgressDialog;", "confirmOrder", "", "baseActivity", "Landroid/content/Context;", "liveEventId", "", "pushUserId", "liveThemeId", "goodsId", "", "goodsNum", "goodsPrice", "", "goodsSKUId", "callBac", "Lkotlin/Function1;", "Lcom/taihebase/activity/network/Result;", "Lkotlin/ParameterName;", "name", "success", "dismissProgress", "followUserALL", "context", TUIConstants.TUILive.USER_ID, "userType", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "getLiveGift", "", "Lcom/showstartfans/activity/model/GoodsLiveBean;", "getLiveMenu", "ctx", TUIConstants.TUILive.ROOM_ID, "Lcom/showstartfans/activity/model/LiveShowMenuBean;", "getLiveMenuDetail", "programId", "Lcom/showstartfans/activity/model/LiveShowMenuEventMsgBean;", "getLiveNotice", "Lcom/showstartfans/activity/model/LiveDetailNoticeInfoBean;", "getLiveNowPlayUrl", "getLivePlayInfo", "Lcom/showstartfans/activity/model/LiveStartPLayInfoBean;", "getLiveTopGoodsUser", "Lcom/showstartfans/activity/model/LiveTopUserBean;", "getLiveTopRank", "Lcom/showstartfans/activity/model/LiveTopHotBean;", "getSendGoodsClaList", "Lcom/showstartfans/activity/model/LiveTopGoodsClaBean;", "getUserInfo", "Ltencent/txlive/room/roomutil/commondef/LoginInfo;", WbCloudFaceContant.SIGN, "userRole", TUIConstants.TUILive.SDK_APP_ID, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)Ltencent/txlive/room/roomutil/commondef/LoginInfo;", "liveSendData", "operateUserId", "type", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "liveZan", "num", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "loginLive", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;JLkotlin/jvm/functions/Function1;)V", "memberList", "pageNo", "pageSize", "Lkotlin/Function2;", "Ltencent/txlive/zhibo/audience/RoomMemberBean;", "datas", "status", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;)V", "openLivePlay", "showProgress", "pollingCall", "orderJobKey", "refreshLiveInfoMsg", "Lcom/showstartfans/activity/model/LiveRoomDetailBean;", "report", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "content", "reserveLive", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class LiveToolUtils {
    @NotNull
    public static final LiveToolUtils INSTANCE = null;
    private static int countPoll;
    @Nullable
    private static i progressDialog;

    private LiveToolUtils() {
    }

    public static /* synthetic */ void a(Function1 function1, n nVar) {
    }

    public static final /* synthetic */ void access$dismissProgress(LiveToolUtils liveToolUtils) {
    }

    public static /* synthetic */ void b(Function2 function2, n nVar) {
    }

    public static /* synthetic */ void c(n nVar) {
    }

    /* renamed from: confirmOrder$lambda-16  reason: not valid java name */
    private static final void m1637confirmOrder$lambda16(Function1 function1, Context context, n nVar) {
    }

    /* renamed from: confirmOrder$lambda-16$lambda-15  reason: not valid java name */
    private static final void m1638confirmOrder$lambda16$lambda15(Context context, String str, Function1 function1) {
    }

    public static /* synthetic */ void d(n nVar) {
    }

    private final void dismissProgress() {
    }

    public static /* synthetic */ void e(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void f(Function1 function1, Context context, n nVar) {
    }

    public static /* synthetic */ void g(Function1 function1, n nVar) {
    }

    /* renamed from: getLiveGift$lambda-14  reason: not valid java name */
    private static final void m1639getLiveGift$lambda14(Function1 function1, n nVar) {
    }

    /* renamed from: getLiveMenu$lambda-11  reason: not valid java name */
    private static final void m1640getLiveMenu$lambda11(Function1 function1, n nVar) {
    }

    /* renamed from: getLiveMenuDetail$lambda-12  reason: not valid java name */
    private static final void m1641getLiveMenuDetail$lambda12(Function1 function1, n nVar) {
    }

    /* renamed from: getLiveNotice$lambda-4  reason: not valid java name */
    private static final void m1642getLiveNotice$lambda4(Function1 function1, n nVar) {
    }

    /* renamed from: getLiveNowPlayUrl$lambda-3  reason: not valid java name */
    private static final void m1643getLiveNowPlayUrl$lambda3(Function1 function1, n nVar) {
    }

    /* renamed from: getLivePlayInfo$lambda-13  reason: not valid java name */
    private static final void m1644getLivePlayInfo$lambda13(Function1 function1, n nVar) {
    }

    /* renamed from: getLiveTopGoodsUser$lambda-19  reason: not valid java name */
    private static final void m1645getLiveTopGoodsUser$lambda19(Function1 function1, n nVar) {
    }

    /* renamed from: getLiveTopRank$lambda-20  reason: not valid java name */
    private static final void m1646getLiveTopRank$lambda20(Function1 function1, n nVar) {
    }

    /* renamed from: getSendGoodsClaList$lambda-18  reason: not valid java name */
    private static final void m1647getSendGoodsClaList$lambda18(Function1 function1, n nVar) {
    }

    public static /* synthetic */ LoginInfo getUserInfo$default(LiveToolUtils liveToolUtils, String str, Integer num, Long l2, int i2, Object obj) {
    }

    public static /* synthetic */ void h(Context context, String str, Function1 function1, n nVar) {
    }

    public static /* synthetic */ void i(Context context, String str, n nVar) {
    }

    public static /* synthetic */ void j(n nVar) {
    }

    public static /* synthetic */ void k(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void l(n nVar) {
    }

    /* renamed from: liveSendData$lambda-5  reason: not valid java name */
    private static final void m1648liveSendData$lambda5(n nVar) {
    }

    /* renamed from: liveZan$lambda-6  reason: not valid java name */
    private static final void m1649liveZan$lambda6(n nVar) {
    }

    public static /* synthetic */ void m(Function1 function1, n nVar) {
    }

    /* renamed from: memberList$lambda-8  reason: not valid java name */
    private static final void m1650memberList$lambda8(Function2 function2, n nVar) {
    }

    public static /* synthetic */ void n(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void o(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void openLivePlay$default(LiveToolUtils liveToolUtils, Context context, int i2, String str, boolean z, int i3, Object obj) {
    }

    /* renamed from: openLivePlay$lambda-1  reason: not valid java name */
    private static final void m1651openLivePlay$lambda1(Context context, String str, n nVar) {
    }

    public static /* synthetic */ void p(Context context, String str, Function1 function1) {
    }

    private final void pollingCall(Context context, String str, Function1<? super n, Unit> function1) {
    }

    /* renamed from: pollingCall$lambda-17  reason: not valid java name */
    private static final void m1652pollingCall$lambda17(Context context, String str, Function1 function1, n nVar) {
    }

    public static /* synthetic */ void q(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void r(Function1 function1, n nVar) {
    }

    /* renamed from: refreshLiveInfoMsg$lambda-2  reason: not valid java name */
    private static final void m1653refreshLiveInfoMsg$lambda2(Function1 function1, n nVar) {
    }

    /* renamed from: report$lambda-9  reason: not valid java name */
    private static final void m1654report$lambda9(n nVar) {
    }

    /* renamed from: reserveLive$lambda-10  reason: not valid java name */
    private static final void m1655reserveLive$lambda10(n nVar) {
    }

    public static /* synthetic */ void s(Function1 function1, n nVar) {
    }

    private final void showProgress(Context context) {
    }

    public final void confirmOrder(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, long j2, int i2, double d2, long j3, @Nullable Function1<? super n, Unit> function1) {
    }

    public final void followUserALL(@NotNull Context context, @Nullable String str, @Nullable Integer num, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    public final void getLiveGift(@NotNull Context context, @Nullable String str, @Nullable Function1<? super List<? extends GoodsLiveBean>, Unit> function1) {
    }

    public final void getLiveMenu(@NotNull Context context, @Nullable String str, @Nullable Function1<? super LiveShowMenuBean, Unit> function1) {
    }

    public final void getLiveMenuDetail(@NotNull Context context, @Nullable String str, @Nullable Function1<? super List<? extends LiveShowMenuEventMsgBean>, Unit> function1) {
    }

    public final void getLiveNotice(@NotNull Context context, @Nullable String str, @Nullable Function1<? super LiveDetailNoticeInfoBean, Unit> function1) {
    }

    public final void getLiveNowPlayUrl(@NotNull Context context, @Nullable String str, @Nullable Function1<? super String, Unit> function1) {
    }

    public final void getLivePlayInfo(@NotNull Context context, @Nullable String str, @Nullable Function1<? super LiveStartPLayInfoBean, Unit> function1) {
    }

    public final void getLiveTopGoodsUser(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Function1<? super List<? extends LiveTopUserBean>, Unit> function1) {
    }

    public final void getLiveTopRank(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Function1<? super LiveTopHotBean, Unit> function1) {
    }

    public final void getSendGoodsClaList(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Function1<? super List<? extends LiveTopGoodsClaBean>, Unit> function1) {
    }

    @NotNull
    public final LoginInfo getUserInfo(@Nullable String str, @Nullable Integer num, @Nullable Long l2) {
    }

    public final void liveSendData(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable Integer num) {
    }

    public final void liveZan(@NotNull Context context, @Nullable String str, @Nullable Integer num, @Nullable String str2) {
    }

    public final void loginLive(@NotNull Context context, @Nullable String str, @Nullable Integer num, long j2, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    public final void memberList(@NotNull Context context, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Function2<? super List<? extends RoomMemberBean>, ? super Boolean, Unit> function2) {
    }

    public final void openLivePlay(@NotNull Context context, int i2, @Nullable String str, boolean z) {
    }

    public final void refreshLiveInfoMsg(@NotNull Context context, @Nullable String str, @Nullable Function1<? super LiveRoomDetailBean, Unit> function1) {
    }

    public final void report(@NotNull Context context, int i2, @Nullable String str, @Nullable String str2) {
    }

    public final void reserveLive(@NotNull Context context, @Nullable String str) {
    }
}
