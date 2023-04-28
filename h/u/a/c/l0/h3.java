package h.u.a.c.l0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.taihebase.activity.view.LoadImageView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MomentUserAdapter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0018\u0019\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0015J\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0014R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/MomentUserAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mapAnimation", "", "", "Landroid/view/animation/Animation;", "createAnimation", "real_position", "getItemViewType", h.a.a.a.a.i.g.C, "onBindViewHolder_impl", "", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewMomentMoreHolder", "ViewMomentUserHolder", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class h3 extends h.y.a.f.m<Object> {
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final a f19414o = null;

    /* renamed from: p  reason: collision with root package name */
    public static final int f19415p = 100;
    public static final int q = 101;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private final Map<Integer, Animation> f19416n;

    /* compiled from: MomentUserAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/MomentUserAdapter$Companion;", "", "()V", "TYPE_MORE", "", "TYPE_NORMAL", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: MomentUserAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/MomentUserAdapter$ViewMomentMoreHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/activitys/profile/MomentUserAdapter;Landroid/view/View;)V", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "userContainer", "Landroid/view/ViewStub;", "getUserContainer", "()Landroid/view/ViewStub;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class b extends RecyclerView.ViewHolder {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final TextView f19417a;
        @NotNull
        private final ViewStub b;
        public final /* synthetic */ h3 c;

        public b(@NotNull h3 h3Var, View view) {
        }

        @NotNull
        public final TextView c() {
        }

        @NotNull
        public final ViewStub d() {
        }
    }

    /* compiled from: MomentUserAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/MomentUserAdapter$ViewMomentUserHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/activitys/profile/MomentUserAdapter;Landroid/view/View;)V", "bg", "Lcom/taihebase/activity/view/LoadImageView;", "getBg", "()Lcom/taihebase/activity/view/LoadImageView;", "bottomBg", "getBottomBg", TtmlNode.TAG_HEAD, "getHead", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class c extends RecyclerView.ViewHolder {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final LoadImageView f19418a;
        @NotNull
        private final LoadImageView b;
        @NotNull
        private final LoadImageView c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final TextView f19419d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ h3 f19420e;

        public c(@NotNull h3 h3Var, View view) {
        }

        @NotNull
        public final LoadImageView c() {
        }

        @NotNull
        public final LoadImageView d() {
        }

        @NotNull
        public final LoadImageView e() {
        }

        @NotNull
        public final TextView f() {
        }
    }

    public h3(@NotNull Context context) {
    }

    private final Animation Q(int i2) {
    }

    public static /* synthetic */ void R(h3 h3Var, String str, View view) {
    }

    public static /* synthetic */ void S(h3 h3Var, Object obj, View view) {
    }

    private static final void T(h3 h3Var, Object obj, View view) {
    }

    private static final void U(h3 h3Var, String str, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    @Override // h.y.a.f.m, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
    }

    @Override // h.y.a.f.m
    @SuppressLint({"ResourceType"})
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
