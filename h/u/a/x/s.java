package h.u.a.x;

import android.content.Context;
import com.showstartfans.activity.model.MessageDetailLettersBean;
import com.showstartfans.activity.model.VideoDetailCommBean;
import com.showstartfans.activity.model.VocalConcertDetailPhotoBean;
import com.tencent.android.tpush.common.MessageKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoMV.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000bJ?\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0007J\u0006\u0010\u0015\u001a\u00020\u0006JY\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0007JU\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2+\u0010\u000f\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0007JM\u0010#\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2+\u0010\u000f\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u000e\u0018\u00010 ¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0007J]\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00112+\u0010\u000f\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020)\u0018\u00010 ¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0007J_\u0010*\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00112+\u0010\u000f\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020)\u0018\u00010 ¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0007JG\u0010+\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u00112%\u0010\u000f\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0007JD\u0010-\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010/J?\u00100\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2%\u0010\u000f\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0007JG\u00102\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u00010\u000e2#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0007J\u001a\u00105\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u00010\u000eH\u0007J?\u00106\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\n2%\u0010\u000f\u001a!\u0012\u0015\u0012\u0013\u0018\u000107¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0007JV\u00109\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2:\u0010\u000f\u001a6\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0006\u0018\u00010:H\u0007J6\u0010;\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u000e2\b\u0010=\u001a\u0004\u0018\u00010\u000e2\u0006\u0010>\u001a\u00020\nH\u0007J`\u0010?\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010@\u001a\u0004\u0018\u00010\u000e2:\u0010\u000f\u001a6\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0006\u0018\u00010:H\u0007J\u000e\u0010,\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0081\u0001\u0010A\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010B\u001a\u00020\n2\b\u0010C\u001a\u0004\u0018\u00010\u000e2\b\u0010D\u001a\u0004\u0018\u00010\u000e2\u0006\u0010E\u001a\u00020\n2\b\u0010F\u001a\u0004\u0018\u00010\u000e2\u0006\u0010G\u001a\u00020\u001e2\b\u0010>\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2%\u0010\u000f\u001a!\u0012\u0015\u0012\u0013\u0018\u00010!¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/showstartfans/activity/wmodel/VideoMV;", "", "()V", "progressDialog", "Lcom/taihebase/activity/widget/dialog/ProgressDialog;", "addVideoClick", "", "context", "Landroid/content/Context;", "videoId", "", "(Landroid/content/Context;Ljava/lang/Integer;)V", "deleteCommAPI", "id", "", "callBac", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "dismissProgress", "doWish", "followUserId", "followType", "isWish", MessageKey.MSG_SOURCE, "getBarrageList", "mediaId", "startTime", "", "endTime", "", "Lcom/showstartfans/activity/model/MessageDetailLettersBean;", "datas", "getPaySuccessByVideoIds", "showProcess", "idS", "getVideoComm", "pageNo", "commType", "Lcom/showstartfans/activity/model/VideoDetailCommBean;", "getVideoCommReplay", "getVideoDetailMsg", "showProgress", "getVideoPlayUrl", "realUrl", "(Landroid/content/Context;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "getVideoSharePic", "postImg", "increasePost", "eventStr", "increasePostId", "increaseUpdate", "refreshMediaInfo", "Lcom/showstartfans/activity/model/VocalConcertDetailPhotoBean;", "bean", "removeFans", "Lkotlin/Function2;", "sendReport", "commId", "content", "type", "setRemark", "remark", "submitUserTag", "beanId", "letterId", "mainLetterId", "toUserType", "commInput", "time", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class s {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final s f25392a = null;
    @Nullable
    private static h.y.a.p.w.i b;

    private s() {
    }

    private static final void A(h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void B(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void C(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void D(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void E(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void F(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void G(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void H(h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void I(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void J(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void K(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void L(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void M(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void N(Function2 function2, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void O(h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void P(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void Q(h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void R(Function2 function2, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void S(@NotNull Context context, int i2, @Nullable Function1<? super VocalConcertDetailPhotoBean, Unit> function1) {
    }

    private static final void T(Function1 function1, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void U(@NotNull Context context, @Nullable String str, @Nullable Function2<? super Boolean, ? super String, Unit> function2) {
    }

    private static final void V(Function2 function2, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void W(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, int i2) {
    }

    private static final void X(h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void Y(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable Function2<? super Boolean, ? super String, Unit> function2) {
    }

    private static final void Z(Function2 function2, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void a(@NotNull Context context, @Nullable Integer num) {
    }

    private static final void b(h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void b0(@NotNull Context context, int i2, @Nullable String str, @Nullable String str2, int i3, @Nullable String str3, long j2, @Nullable String str4, @Nullable String str5, @Nullable Function1<? super MessageDetailLettersBean, Unit> function1) {
    }

    @JvmStatic
    public static final void c(@NotNull Context context, @Nullable String str, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    private static final void c0(Function1 function1, h.y.a.m.n nVar) {
    }

    private static final void d(Function1 function1, h.y.a.m.n nVar) {
    }

    @JvmStatic
    @JvmOverloads
    public static final void f(@NotNull Context context, @Nullable String str, int i2, int i3, int i4, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    @JvmStatic
    @JvmOverloads
    public static final void g(@NotNull Context context, @Nullable String str, int i2, int i3, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    public static /* synthetic */ void h(Context context, String str, int i2, int i3, int i4, Function1 function1, int i5, Object obj) {
    }

    private static final void i(Function1 function1, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void j(@NotNull Context context, int i2, long j2, long j3, @Nullable Function1<? super List<? extends MessageDetailLettersBean>, Unit> function1) {
    }

    private static final void k(Function1 function1, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void l(@NotNull Context context, boolean z, int i2, @Nullable Function1<? super List<String>, Unit> function1) {
    }

    private static final void m(Function1 function1, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void n(@NotNull Context context, int i2, int i3, int i4, boolean z, @Nullable Function1<? super List<? extends VideoDetailCommBean>, Unit> function1) {
    }

    private static final void o(Function1 function1, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void p(@NotNull Context context, @Nullable String str, int i2, int i3, boolean z, @Nullable Function1<? super List<? extends VideoDetailCommBean>, Unit> function1) {
    }

    private static final void q(Function1 function1, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void r(@NotNull Context context, int i2, boolean z, @Nullable Function1<Object, Unit> function1) {
    }

    private static final void s(Function1 function1, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void t(@NotNull Context context, @Nullable Integer num, @Nullable Function1<? super String, Unit> function1) {
    }

    private static final void u(Function1 function1, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void v(@NotNull Context context, int i2, @Nullable Function1<? super String, Unit> function1) {
    }

    private static final void w(Function1 function1, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void x(@NotNull Context context, int i2, @Nullable String str, @Nullable Function1<? super String, Unit> function1) {
    }

    private static final void y(Function1 function1, h.y.a.m.n nVar) {
    }

    @JvmStatic
    public static final void z(@NotNull Context context, @Nullable String str) {
    }

    public final void a0(@NotNull Context context) {
    }

    public final void e() {
    }
}
