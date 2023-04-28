package h.u.a.c;

import android.content.Context;
import com.showstartfans.activity.model.ActivityListBean;
import com.showstartfans.activity.model.GoodsDetailBean;
import com.showstartfans.activity.model.PSSTagRequestBean;
import com.showstartfans.activity.model.QuickCheckBean;
import com.showstartfans.activity.model.SearchListBean;
import com.showstartfans.activity.model.UserHomePagerInfoBean;
import com.showstartfans.activity.model.home.NewYearHomeHeaderBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApiTools.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jj\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2B\u0010\u000e\u001a>\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fJ\b\u0010\u0017\u001a\u00020\u0006H\u0002J\u0099\u0001\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\n2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00102\b\u0010!\u001a\u0004\u0018\u00010\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\f\u001a\u00020\r2%\u0010$\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u0006\u0018\u00010%JÆ\u0001\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u001a2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001a2\u0006\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\n2\b\b\u0002\u0010/\u001a\u00020\n2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\f\u001a\u00020\r2<\u0010\u000e\u001a8\u0012\u0015\u0012\u0013\u0018\u000102¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fJ^\u00103\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u00104\u001a\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\r2<\u0010\u000e\u001a8\u0012\u0015\u0012\u0013\u0018\u000105¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fJ=\u00106\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001a2%\u0010\u000e\u001a!\u0012\u0015\u0012\u0013\u0018\u000107¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010%JC\u00108\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001a2+\u0010\u000e\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u000209\u0018\u00010\u0010¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010%J=\u0010:\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2%\u0010$\u001a!\u0012\u0015\u0012\u0013\u0018\u00010;¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u0006\u0018\u00010%JM\u0010=\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u00104\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010%J\u0010\u0010?\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/showstartfans/activity/activitys/ApiTools;", "", "()V", "progressDialog", "Lcom/taihebase/activity/widget/dialog/ProgressDialog;", "collectListData", "", "ctx", "Landroid/content/Context;", "pageNo", "", "collectType", "showPro", "", "call", "Lkotlin/Function2;", "", "Lcom/showstartfans/activity/model/SearchListBean;", "Lkotlin/ParameterName;", "name", "data", "Lcom/taihebase/activity/network/ResultCode;", "code", "dismissProgress", "edtUserInfo", "userNickName", "", "signature", "birthday", "", "sex", "styleList", "Lcom/showstartfans/activity/model/PSSTagRequestBean;", "cityCode", "userHomeBg", "avatarPath", "callBac", "Lkotlin/Function1;", "success", "getActivityList", "context", "sortType", "showStyle", "searchMoreSaleKey", "searchMorePriceKey", "channelId", "cityTypeCode", "activityScaleId", "startTime", "endTime", "Lcom/showstartfans/activity/model/ActivityListBean;", "getGoodsDetail", "goodsId", "Lcom/showstartfans/activity/model/GoodsDetailBean;", "getHomeHeadData", "Lcom/showstartfans/activity/model/home/NewYearHomeHeaderBean;", "getHomeQuickCheck", "Lcom/showstartfans/activity/model/QuickCheckBean;", "getUserMsgInfoNew", "Lcom/showstartfans/activity/model/UserHomePagerInfoBean;", "bean", "goodsSaleOpen", "openStatus", "showProgress", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class s {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final s f19956a = null;
    @Nullable
    private static h.y.a.p.w.i b;

    private s() {
    }

    public static /* synthetic */ void A(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void B(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void C(boolean z, Function1 function1, h.y.a.m.n nVar) {
    }

    private final void D(Context context) {
    }

    private static final void b(Function2 function2, h.y.a.m.n nVar) {
    }

    private final void c() {
    }

    public static /* synthetic */ void e(s sVar, Context context, String str, String str2, long j2, int i2, List list, String str3, String str4, String str5, boolean z, Function1 function1, int i3, Object obj) {
    }

    private static final void f(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void h(s sVar, Context context, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4, String str7, String str8, boolean z, Function2 function2, int i5, Object obj) {
    }

    private static final void i(boolean z, Function2 function2, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void k(s sVar, Context context, String str, boolean z, Function2 function2, int i2, Object obj) {
    }

    private static final void l(boolean z, Function2 function2, h.y.a.m.n nVar) {
    }

    private static final void n(Function1 function1, h.y.a.m.n nVar) {
    }

    private static final void p(Function1 function1, h.y.a.m.n nVar) {
    }

    private static final void r(boolean z, Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void t(s sVar, Context context, String str, int i2, boolean z, Function1 function1, int i3, Object obj) {
    }

    private static final void u(boolean z, Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void v(boolean z, Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void w(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void x(boolean z, Function2 function2, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void y(boolean z, Function2 function2, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void z(Function2 function2, h.y.a.m.n nVar) {
    }

    public final void a(@NotNull Context context, int i2, int i3, boolean z, @Nullable Function2<? super List<? extends SearchListBean>, ? super h.y.a.m.o, Unit> function2) {
    }

    public final void d(@NotNull Context context, @Nullable String str, @Nullable String str2, long j2, int i2, @Nullable List<? extends PSSTagRequestBean> list, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    public final void g(@NotNull Context context, @NotNull String str, int i2, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull String str6, int i3, int i4, @Nullable String str7, @Nullable String str8, boolean z, @Nullable Function2<? super ActivityListBean, ? super h.y.a.m.o, Unit> function2) {
    }

    public final void j(@NotNull Context context, @NotNull String str, boolean z, @Nullable Function2<? super GoodsDetailBean, ? super h.y.a.m.o, Unit> function2) {
    }

    public final void m(@NotNull Context context, @NotNull String str, @Nullable Function1<? super NewYearHomeHeaderBean, Unit> function1) {
    }

    public final void o(@NotNull Context context, @NotNull String str, @Nullable Function1<? super List<? extends QuickCheckBean>, Unit> function1) {
    }

    public final void q(@NotNull Context context, boolean z, @Nullable Function1<? super UserHomePagerInfoBean, Unit> function1) {
    }

    public final void s(@NotNull Context context, @NotNull String str, int i2, boolean z, @Nullable Function1<? super Boolean, Unit> function1) {
    }
}
