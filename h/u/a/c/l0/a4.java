package h.u.a.c.l0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.taihebase.activity.view.LoadImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShowPhotoBannerAdapter.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J*\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0014J\u001a\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\bH\u0014R.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ShowPhotoBannerAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onItemClick", "Lkotlin/Function1;", "", "", "Lcom/showstartfans/activity/activitys/profile/OnItemClickShowPhotoBanner;", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewPhotoHolder", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class a4 extends h.y.a.f.m<String> {
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private Function1<? super Integer, Unit> f19376n;

    /* compiled from: ShowPhotoBannerAdapter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ShowPhotoBannerAdapter$ViewPhotoHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/taihebase/activity/view/itemTouch/ItemTouchHelperViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/activitys/profile/ShowPhotoBannerAdapter;Landroid/view/View;)V", "imgPost", "Lcom/taihebase/activity/view/LoadImageView;", "kotlin.jvm.PlatformType", "getImgPost", "()Lcom/taihebase/activity/view/LoadImageView;", "parent", "Landroid/widget/FrameLayout;", "getParent", "()Landroid/widget/FrameLayout;", "onItemClear", "", "onItemSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder implements h.y.a.o.z.b {

        /* renamed from: a  reason: collision with root package name */
        private final LoadImageView f19377a;
        private final FrameLayout b;
        public final /* synthetic */ a4 c;

        public a(@NotNull a4 a4Var, View view) {
        }

        @Override // h.y.a.o.z.b
        public void a() {
        }

        @Override // h.y.a.o.z.b
        public void b() {
        }

        public final LoadImageView c() {
        }

        public final FrameLayout d() {
        }
    }

    public a4(@NotNull Context context) {
    }

    public static /* synthetic */ void R(a4 a4Var, int i2, View view) {
    }

    private static final void S(a4 a4Var, int i2, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    @Nullable
    public final Function1<Integer, Unit> Q() {
    }

    public final void T(@Nullable Function1<? super Integer, Unit> function1) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
