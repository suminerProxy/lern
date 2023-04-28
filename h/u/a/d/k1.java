package h.u.a.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.model.TagBean;
import com.sobot.network.http.model.SobotProgress;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SearchTagAdapter.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J*\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0014J\u001a\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u001dH\u0014J\u0010\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0018R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R?\u0010\b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\tj\u0004\u0018\u0001`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/showstartfans/activity/adapter/SearchTagAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/TagBean;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "layout_mian", "Landroidx/constraintlayout/widget/ConstraintLayout;", "onChekcTagListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "bean", "", "Lcom/showstartfans/activity/adapter/OnChekcTagListener;", "getOnChekcTagListener", "()Lkotlin/jvm/functions/Function1;", "setOnChekcTagListener", "(Lkotlin/jvm/functions/Function1;)V", "tv_create", "Landroid/widget/TextView;", "tv_tag_create", "createTag", SobotProgress.TAG, "", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "setCreateStr", "createTagStr", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class k1 extends h.y.a.f.m<TagBean> {
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private Function1<? super TagBean, Unit> f20278n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private TextView f20279o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private TextView f20280p;
    @Nullable
    private ConstraintLayout q;

    /* compiled from: SearchTagAdapter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/adapter/SearchTagAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/adapter/SearchTagAdapter;Landroid/view/View;)V", "tv_msg", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getTv_msg", "()Landroid/widget/TextView;", "tv_tag", "getTv_tag", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f20281a;
        private final TextView b;
        public final /* synthetic */ k1 c;

        public a(@NotNull k1 k1Var, View view) {
        }

        public final TextView c() {
        }

        public final TextView d() {
        }
    }

    public k1(@NotNull Context context) {
    }

    private final void Q(String str) {
    }

    private static final void R(k1 k1Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void T(k1 k1Var, TagBean tagBean, View view) {
    }

    public static /* synthetic */ void U(k1 k1Var, String str, View view) {
    }

    public static /* synthetic */ void V(k1 k1Var, h.y.a.m.n nVar) {
    }

    private static final void W(k1 k1Var, TagBean tagBean, View view) {
    }

    private static final void Y(k1 k1Var, String str, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    @Nullable
    public final Function1<TagBean, Unit> S() {
    }

    public final void X(@Nullable String str) {
    }

    public final void Z(@Nullable Function1<? super TagBean, Unit> function1) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
