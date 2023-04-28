package h.u.a.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapController;
import com.showstartfans.activity.model.TagBean;
import com.umeng.analytics.pro.am;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TageAdapter.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\u0011\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\u0010\u0013J*\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J\u001a\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0014J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/showstartfans/activity/adapter/TageAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/TagBean;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "maxTagNum", "", "tagDialog", "Lcom/showstartfans/activity/dialog/TagDialog;", "add", "", am.aI, h.a.a.a.a.i.g.C, MapController.ITEM_LAYER_TAG, "getItemCount", "getPostData", "", "", "()[Ljava/lang/String;", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "remove", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class u1 extends h.y.a.f.m<TagBean> {

    /* renamed from: n  reason: collision with root package name */
    private final int f20323n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private h.u.a.h.x0 f20324o;

    /* compiled from: TageAdapter.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/showstartfans/activity/adapter/TageAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/adapter/TageAdapter;Landroid/view/View;)V", "ibtn_delete", "Landroid/widget/ImageButton;", "kotlin.jvm.PlatformType", "getIbtn_delete", "()Landroid/widget/ImageButton;", "layout_main", "Landroid/widget/LinearLayout;", "getLayout_main", "()Landroid/widget/LinearLayout;", "tv_tag", "Landroid/widget/TextView;", "getTv_tag", "()Landroid/widget/TextView;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f20325a;
        private final LinearLayout b;
        private final ImageButton c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ u1 f20326d;

        public a(@NotNull u1 u1Var, View view) {
        }

        public final ImageButton c() {
        }

        public final LinearLayout d() {
        }

        public final TextView e() {
        }
    }

    /* compiled from: TageAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/TagBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<TagBean, Unit> {
        public final /* synthetic */ u1 this$0;

        public b(u1 u1Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TagBean tagBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable TagBean tagBean) {
        }
    }

    public u1(@NotNull Context context) {
    }

    public static /* synthetic */ void T(u1 u1Var, Ref.IntRef intRef, View view) {
    }

    public static /* synthetic */ void U(u1 u1Var, View view) {
    }

    public static /* synthetic */ void V(View view) {
    }

    private static final void W(u1 u1Var, View view) {
    }

    private static final void X(View view) {
    }

    private static final void Y(u1 u1Var, Ref.IntRef intRef, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    public void Q(int i2, @NotNull TagBean tagBean) {
    }

    public void R(@NotNull TagBean tagBean) {
    }

    @NotNull
    public final String[] S() {
    }

    @Override // h.y.a.f.m
    public /* bridge */ /* synthetic */ void add(int i2, TagBean tagBean) {
    }

    @Override // h.y.a.f.m, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    @Override // h.y.a.f.m
    public void remove(int i2) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }

    @Override // h.y.a.f.m
    public /* bridge */ /* synthetic */ void add(TagBean tagBean) {
    }
}
