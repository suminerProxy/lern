package h.u.a.c.y;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.showstartfans.activity.model.MapRecordData;
import java.text.SimpleDateFormat;
import java.util.List;
import k.b.v0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommunityMapAdapter.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0016J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\fH\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\fH\u0016J\u0006\u0010#\u001a\u00020\u0016J\b\u0010$\u001a\u00020\u0016H\u0002J\b\u0010%\u001a\u00020\u0016H\u0002J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0004H\u0002J\b\u0010(\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/showstartfans/activity/activitys/community/CommunityMapAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/showstartfans/activity/activitys/community/ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "haveNoData", "", "haveYesData", "list", "", "Lkotlin/Pair;", "", "", "noList", "Lcom/showstartfans/activity/model/MapRecordData;", "progressDialog", "Lcom/taihebase/activity/widget/dialog/ProgressDialog;", "simpleDateFormat", "Ljava/text/SimpleDateFormat;", "yesList", "animationStatus", "", "status", "Landroid/view/View;", "dismissProgress", "getItemCount", "getItemViewType", h.a.a.a.a.i.g.C, "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "requestData", "requestNoListData", "requestYesListData", "showProgress", "ctx", "updateRecordData", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class a0 extends RecyclerView.Adapter<d0> {
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    public static final a f20047i = null;

    /* renamed from: j  reason: collision with root package name */
    private static final int f20048j = 0;

    /* renamed from: k  reason: collision with root package name */
    private static final int f20049k = 2;

    /* renamed from: l  reason: collision with root package name */
    private static final int f20050l = 3;

    /* renamed from: m  reason: collision with root package name */
    private static final int f20051m = 4;

    /* renamed from: n  reason: collision with root package name */
    private static final int f20052n = 5;

    /* renamed from: o  reason: collision with root package name */
    private static final int f20053o = 10;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final Context f20054a;
    @NotNull
    private List<Pair<Integer, Object>> b;
    @NotNull
    private final List<MapRecordData> c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final List<MapRecordData> f20055d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20056e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20057f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private h.y.a.p.w.i f20058g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final SimpleDateFormat f20059h;

    /* compiled from: CommunityMapAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/showstartfans/activity/activitys/community/CommunityMapAdapter$Companion;", "", "()V", "TYPE_DATA", "", "TYPE_NO_DATA", "TYPE_OPEN", "TYPE_TIME", "TYPE_TITLE", "TYPE_TOP_TOUCH", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: CommunityMapAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.showstartfans.activity.activitys.community.CommunityMapAdapter$onBindViewHolder$4", f = "CommunityMapAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b extends SuspendLambda implements Function2<v0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ d0 $holder;
        public int label;

        public b(d0 d0Var, Continuation<? super b> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(v0 v0Var, Continuation<? super Unit> continuation) {
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull v0 v0Var, @Nullable Continuation<? super Unit> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* compiled from: CommunityMapAdapter.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/activitys/community/CommunityMapAdapter$requestYesListData$1$data$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/showstartfans/activity/model/MapRecordData;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class c extends TypeToken<List<MapRecordData>> {
    }

    public a0(@NotNull Context context) {
    }

    private final void c(View view) {
    }

    private final void d() {
    }

    public static /* synthetic */ void e(a0 a0Var, View view) {
    }

    public static /* synthetic */ void f(a0 a0Var, MapRecordData mapRecordData, View view) {
    }

    public static /* synthetic */ void g(a0 a0Var, int i2, View view) {
    }

    public static /* synthetic */ void h(a0 a0Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void i(int i2, a0 a0Var, h.y.a.m.n nVar) {
    }

    private static final void k(a0 a0Var, int i2, View view) {
    }

    private static final void l(a0 a0Var, View view) {
    }

    private static final void m(a0 a0Var, MapRecordData mapRecordData, View view) {
    }

    private final void p() {
    }

    private static final void q(a0 a0Var, h.y.a.m.n nVar) {
    }

    private final void r() {
    }

    private static final void s(int i2, a0 a0Var, h.y.a.m.n nVar) {
    }

    private final void t(Context context) {
    }

    private final void u() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
    }

    public void j(@NotNull d0 d0Var, int i2) {
    }

    @NotNull
    public d0 n(@NotNull ViewGroup viewGroup, int i2) {
    }

    public final void o() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(d0 d0Var, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ d0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }
}
