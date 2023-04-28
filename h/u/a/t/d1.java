package h.u.a.t;

import android.content.Context;
import com.showstartfans.activity.model.GroupInfoNewBean;
import com.showstartfans.activity.model.ShCartBean;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApiUtils.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JK\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0007JK\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0007Ja\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bJI\u0010\u0019\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\b2#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bJ\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J}\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u001ej\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u001f2\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u001ej\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u001f2\u0006\u0010\u0017\u001a\u00020\u00162#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bJE\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u00162#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bJ\u0010\u0010#\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bJA\u0010$\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2%\u0010\n\u001a!\u0012\u0015\u0012\u0013\u0018\u00010%¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bJ=\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00162#\u0010\n\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010(¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00040\u000bJI\u0010)\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010*\u001a\u0004\u0018\u00010\b2\b\u0010+\u001a\u0004\u0018\u00010\b2#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¨\u0006,"}, d2 = {"Lcom/showstartfans/activity/utils/ApiUtils;", "", "()V", "JinYanGroupMember", "", "ctx", "Landroid/content/Context;", "groupId", "", TUIConstants.TUILive.USER_ID, "callBack", "Lkotlin/Function1;", "Lcom/taihebase/activity/network/Result;", "Lkotlin/ParameterName;", "name", "sucess", "UnJinYanGroupMember", "addToShopCart", "activityId", "goodsId", "skuId", "num", "", "type", "", "confirmGroupNotice", "noticeId", "deleteConversationFromHttp", "deleteMoreFromShopCart", "goodIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "ids", "deleteSignleFromShopCart", "id", "exitGroup", "getGroupInfo", "Lcom/showstartfans/activity/model/GroupInfoNewBean;", "bean", "getShopCartData", "Lcom/showstartfans/activity/model/ShCartBean;", "modifyArticleStatus", "articleId", "status", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class d1 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final d1 f24456a = null;

    private d1() {
    }

    public static /* synthetic */ void A(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void B(Function1 function1, String str, String str2, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void C(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void D(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void E(h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void F(h.y.a.m.n nVar) {
    }

    private static final void H(Function1 function1, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void a(@Nullable Context context, @Nullable String str, @Nullable String str2, @Nullable Function1<? super h.y.a.m.n, Unit> function1) {
    }

    private static final void b(Function1 function1, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void c(@Nullable Context context, @Nullable String str, @Nullable String str2, @Nullable Function1<? super h.y.a.m.n, Unit> function1) {
    }

    private static final void d(Function1 function1, h.y.a.m.n nVar) {
    }

    private static final void f(Function1 function1, h.y.a.m.n nVar) {
    }

    private static final void h(Function1 function1, String str, String str2, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void i(int i2) {
    }

    private static final void j(h.y.a.m.n nVar) {
    }

    private static final void l(Function1 function1, h.y.a.m.n nVar) {
    }

    private static final void n(Function1 function1, h.y.a.m.n nVar) {
    }

    private static final void p(h.y.a.m.n nVar) {
    }

    private static final void r(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void t(d1 d1Var, Context context, int i2, Function1 function1, int i3, Object obj) {
    }

    private static final void u(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void v(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void w(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void x(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void y(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void z(Function1 function1, h.y.a.m.n nVar) {
    }

    public final void G(@Nullable Context context, @Nullable String str, @Nullable String str2, @Nullable Function1<? super h.y.a.m.n, Unit> function1) {
    }

    public final void e(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, int i2, int i3, @NotNull Function1<? super Boolean, Unit> function1) {
    }

    public final void g(@Nullable Context context, @Nullable String str, @Nullable String str2, @Nullable Function1<? super h.y.a.m.n, Unit> function1) {
    }

    public final void k(@NotNull Context context, @Nullable String str, @Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2, int i2, @NotNull Function1<? super Boolean, Unit> function1) {
    }

    public final void m(@NotNull Context context, @Nullable String str, int i2, @NotNull Function1<? super Boolean, Unit> function1) {
    }

    public final void o(@Nullable String str) {
    }

    public final void q(@Nullable Context context, @Nullable String str, @Nullable Function1<? super GroupInfoNewBean, Unit> function1) {
    }

    public final void s(@NotNull Context context, int i2, @NotNull Function1<? super ShCartBean, Unit> function1) {
    }
}
