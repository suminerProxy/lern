package h.u.a.c.l0;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ScenePhotoAdapter.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u001a\u001a\u00020\rJ \u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0015H\u0016J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0018\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001c\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\n\u0010,\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u0006H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006/"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ScenePhotoAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "images", "", "", "is16_9", "", "(Landroid/content/Context;Ljava/util/List;Z)V", "ctx", "onPageClick", "Lkotlin/Function0;", "", "Lcom/showstartfans/activity/activitys/profile/OnPageClick;", "getOnPageClick", "()Lkotlin/jvm/functions/Function0;", "setOnPageClick", "(Lkotlin/jvm/functions/Function0;)V", "parentSc", "widthDP", "", "getWidthDP", "()I", "widthDP$delegate", "Lkotlin/Lazy;", "clearImg", "destroyItem", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", h.a.a.a.a.i.g.C, "object", "", "getCount", "getItemPosition", "instantiateItem", "view", "isViewFromObject", "Landroid/view/View;", "restoreState", "state", "Landroid/os/Parcelable;", "loader", "Ljava/lang/ClassLoader;", "saveState", "setParentViewCon", "postUrl", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class n3 extends PagerAdapter {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private Function0<Unit> f19480a;
    @NotNull
    private final Lazy b;
    private boolean c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private Context f19481d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private List<String> f19482e;

    /* compiled from: ScenePhotoAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<Integer> {
        public final /* synthetic */ n3 this$0;

        public a(n3 n3Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
        }
    }

    public n3(@NotNull Context context, @Nullable List<String> list, boolean z) {
    }

    public static final /* synthetic */ Context c(n3 n3Var) {
    }

    private final int f() {
    }

    private static final void g(n3 n3Var, View view) {
    }

    public static /* synthetic */ void h(n3 n3Var, View view) {
    }

    private final boolean j(String str) {
    }

    public final void d() {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NotNull ViewGroup viewGroup, int i2, @NotNull Object obj) {
    }

    @Nullable
    public final Function0<Unit> e() {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NotNull Object obj) {
    }

    public final void i(@Nullable Function0<Unit> function0) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup viewGroup, int i2) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable saveState() {
    }
}
