package h.u.a.c.n0.o9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.model.PSSTagBean;
import com.showstartfans.activity.model.SSTagBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EditUserTagAdapter.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J*\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0014J\u001a\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0014J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/adapter/EditUserTagAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/PSSTagBean;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "drawables", "", "", "[Ljava/lang/Integer;", "labsIdList", "", "getLabsIdList", "()Ljava/util/List;", "labsList", "Lcom/showstartfans/activity/model/SSTagBean;", "getLabsList", "setLabsList", "(Ljava/util/List;)V", "onBindViewHolder_impl", "", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", h.a.a.a.a.i.g.C, "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "selectDrawable", "i", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class x extends h.y.a.f.m<PSSTagBean> {
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private final Context f19826n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    private final Integer[] f19827o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    private List<SSTagBean> f19828p;
    @NotNull
    private final List<PSSTagBean> q;

    /* compiled from: EditUserTagAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/SSTagBean;", "invoke", "(Lcom/showstartfans/activity/model/SSTagBean;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function1<SSTagBean, Boolean> {
        public final /* synthetic */ PSSTagBean $bean;

        public a(PSSTagBean pSSTagBean) {
        }

        @NotNull
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(@NotNull SSTagBean sSTagBean) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(SSTagBean sSTagBean) {
        }
    }

    public x(@NotNull Context context) {
    }

    public static /* synthetic */ void S(x xVar, PSSTagBean pSSTagBean, View view) {
    }

    private static final void T(x xVar, PSSTagBean pSSTagBean, View view) {
    }

    private final int U(int i2) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    @NotNull
    public final List<PSSTagBean> Q() {
    }

    @NotNull
    public final List<SSTagBean> R() {
    }

    public final void V(@NotNull List<SSTagBean> list) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
