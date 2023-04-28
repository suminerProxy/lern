package h.u.a.w.f0.a;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.MessageDetailLettersBean;
import i.a.j0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LinkDMListData.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003Bg\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\t¢\u0006\u0002\u0010\u000fJ\u001d\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00028\u00002\b\b\u0002\u0010+\u001a\u00020\u001d¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020\rJ\u0006\u0010.\u001a\u00020\rJ\r\u0010/\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u00100J\u000e\u00101\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!J\r\u00102\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u00100J\u0006\u00103\u001a\u00020\rJ\u0010\u00104\u001a\u00020\r2\b\b\u0002\u00105\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\b\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R=\u0010 \u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000!¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\r\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u0082D¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/showstartfans/activity/widget/videoNew/listDm/LinkDMListData;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/showstartfans/activity/model/MessageDetailLettersBean;", "", "backDataThread", "Lio/reactivex/Scheduler;", "cycleDurationCheck", "", "checkStart", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "data", "", "durationDone", "(Lio/reactivex/Scheduler;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "cacheList", "", "currentCache", "Lcom/showstartfans/activity/model/MessageDetailLettersBean;", MapBundleKey.MapObjKey.OBJ_DIS, "Lio/reactivex/disposables/Disposable;", "extraTag", "", "getExtraTag", "()Ljava/lang/String;", "setExtraTag", "(Ljava/lang/String;)V", "isChecking", "", "locked", "Ljava/lang/Object;", "punchListBack", "", "mlist", "getPunchListBack", "()Lkotlin/jvm/functions/Function1;", "setPunchListBack", "(Lkotlin/jvm/functions/Function1;)V", "punchSize", "", "addCache", "entity", "needCheckIfIsMine", "(Lcom/showstartfans/activity/model/MessageDetailLettersBean;Z)V", "cycleCheck", "dispose", "getCache", "()Lcom/showstartfans/activity/model/MessageDetailLettersBean;", "getCacheList", "getTopOne", "punchCycleCheck", "startCycleCheck", "usepuch", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class c<T extends MessageDetailLettersBean> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final j0 f25326a;
    private final long b;
    @Nullable
    private final Function1<T, Unit> c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private final Function1<T, Unit> f25327d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final List<T> f25328e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private T f25329f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Object f25330g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f25331h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private i.a.u0.c f25332i;

    /* renamed from: j  reason: collision with root package name */
    private final int f25333j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private Function1<? super List<? extends T>, Unit> f25334k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private String f25335l;

    public c() {
    }

    public c(@NotNull j0 j0Var, long j2, @Nullable Function1<? super T, Unit> function1, @Nullable Function1<? super T, Unit> function12) {
    }

    public static /* synthetic */ void b(c cVar, MessageDetailLettersBean messageDetailLettersBean, boolean z, int i2, Object obj) {
    }

    private static final void d(c cVar, Long l2) {
    }

    public static /* synthetic */ void k(c cVar, Long l2) {
    }

    public static /* synthetic */ void l(c cVar, Long l2) {
    }

    private static final void n(c cVar, Long l2) {
    }

    public static /* synthetic */ void r(c cVar, boolean z, int i2, Object obj) {
    }

    public final synchronized void a(@NotNull T t, boolean z) {
    }

    public final void c() {
    }

    public final void e() {
    }

    @Nullable
    public final synchronized T f() {
    }

    @Nullable
    public final synchronized List<T> g() {
    }

    @NotNull
    public final String h() {
    }

    @Nullable
    public final Function1<List<? extends T>, Unit> i() {
    }

    @Nullable
    public final synchronized T j() {
    }

    public final void m() {
    }

    public final void o(@NotNull String str) {
    }

    public final void p(@Nullable Function1<? super List<? extends T>, Unit> function1) {
    }

    public final void q(boolean z) {
    }

    public /* synthetic */ c(j0 j0Var, long j2, Function1 function1, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
