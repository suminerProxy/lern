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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ScenePhotoNewAdapter.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\fJ*\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0014J\u001a\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\bH\u0014R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ScenePhotoNewAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "", "ctx", "Landroid/content/Context;", "is16_9s", "", "round", "", "isPreview", "(Landroid/content/Context;ZIZ)V", "doubleClick", "Lcom/showstartfans/activity/activitys/profile/OnRecycleItemDoubleClick;", "is16_9", "onItemClick", "Lkotlin/Function1;", "Lcom/showstartfans/activity/activitys/profile/OnItemClick;", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "bingDoubleClick", "", "click", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewPhotoHolder", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class p3 extends h.y.a.f.m<String> {

    /* renamed from: n  reason: collision with root package name */
    private final int f19488n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f19489o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f19490p;
    @Nullable
    private i3 q;
    @Nullable
    private Function1<? super Integer, Boolean> r;

    /* compiled from: ScenePhotoNewAdapter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ScenePhotoNewAdapter$ViewPhotoHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/taihebase/activity/view/itemTouch/ItemTouchHelperViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/activitys/profile/ScenePhotoNewAdapter;Landroid/view/View;)V", "imgPost", "Lcom/taihebase/activity/view/LoadImageView;", "kotlin.jvm.PlatformType", "getImgPost", "()Lcom/taihebase/activity/view/LoadImageView;", "parent", "Landroid/widget/FrameLayout;", "getParent", "()Landroid/widget/FrameLayout;", "onItemClear", "", "onItemSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder implements h.y.a.o.z.b {

        /* renamed from: a  reason: collision with root package name */
        private final LoadImageView f19491a;
        private final FrameLayout b;
        public final /* synthetic */ p3 c;

        public a(@NotNull p3 p3Var, View view) {
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

    /* compiled from: ScenePhotoNewAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "isDouble", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function2<View, Boolean, Unit> {
        public final /* synthetic */ int $real_position;
        public final /* synthetic */ p3 this$0;

        public b(p3 p3Var, int i2) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Boolean bool) {
        }

        public final void invoke(@NotNull View view, boolean z) {
        }
    }

    public /* synthetic */ p3(Context context, boolean z, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static final /* synthetic */ Context Q(p3 p3Var) {
    }

    public static final /* synthetic */ i3 R(p3 p3Var) {
    }

    public static final /* synthetic */ boolean S(p3 p3Var) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    public final void T(@Nullable i3 i3Var) {
    }

    @Nullable
    public final Function1<Integer, Boolean> U() {
    }

    public final void V(@Nullable Function1<? super Integer, Boolean> function1) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }

    public p3(@NotNull Context context, boolean z, int i2, boolean z2) {
    }
}
