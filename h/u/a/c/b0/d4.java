package h.u.a.c.b0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mobile.auth.BuildConfig;
import com.mobile.auth.gatewayauth.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LogisticsListAdapter.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J*\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0014J\u001a\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0018H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/showstartfans/activity/activitys/goods/LogisticsListAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/LogisticsBean;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "createGoodImage", "Landroid/view/View;", "url", "", "createLog", BuildConfig.FLAVOR_type, "Lcom/showstartfans/activity/model/Log;", "createLogClose", "listener", "Landroid/view/View$OnClickListener;", "createLogHead", "deliverystatus", "createLogOpen", "onBindViewHolder_impl", "", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class d4 extends h.y.a.f.m<h.u.a.o.p> {
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private final Context f17940n;

    /* compiled from: LogisticsListAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u0015\u001a\n \u0007*\u0004\u0018\u00010\r0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/showstartfans/activity/activitys/goods/LogisticsListAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/activitys/goods/LogisticsListAdapter;Landroid/view/View;)V", "imagesContainer", "Landroid/view/ViewGroup;", "kotlin.jvm.PlatformType", "getImagesContainer", "()Landroid/view/ViewGroup;", "logsContainer", "getLogsContainer", Constant.LOGIN_ACTIVITY_NUMBER, "Landroid/widget/TextView;", "getNumber", "()Landroid/widget/TextView;", "numberCopy", "getNumberCopy", "()Landroid/view/View;", "numberLine", "getNumberLine", "status", "getStatus", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f17941a;
        private final ViewGroup b;
        private final View c;

        /* renamed from: d  reason: collision with root package name */
        private final TextView f17942d;

        /* renamed from: e  reason: collision with root package name */
        private final View f17943e;

        /* renamed from: f  reason: collision with root package name */
        private final ViewGroup f17944f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ d4 f17945g;

        public a(@NotNull d4 d4Var, View view) {
        }

        public final ViewGroup c() {
        }

        public final ViewGroup d() {
        }

        public final TextView e() {
        }

        public final View f() {
        }

        public final View g() {
        }

        public final TextView h() {
        }
    }

    public d4(@NotNull Context context) {
    }

    private final View Q(String str) {
    }

    private final View R(h.u.a.o.m mVar) {
    }

    private final View S(View.OnClickListener onClickListener) {
    }

    private final View T(h.u.a.o.m mVar, String str) {
    }

    private final View U(View.OnClickListener onClickListener) {
    }

    public static /* synthetic */ void V(h.u.a.o.o oVar, d4 d4Var, int i2, View view) {
    }

    public static /* synthetic */ void W(h.u.a.o.o oVar, View view) {
    }

    public static /* synthetic */ void X(h.u.a.o.o oVar, d4 d4Var, int i2, View view) {
    }

    public static /* synthetic */ void Y(a aVar, View view) {
    }

    private static final void Z(h.u.a.o.o oVar, d4 d4Var, int i2, View view) {
    }

    private static final void a0(h.u.a.o.o oVar, d4 d4Var, int i2, View view) {
    }

    private static final void b0(h.u.a.o.o oVar, View view) {
    }

    private static final void c0(a aVar, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
