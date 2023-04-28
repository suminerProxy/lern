package h.y.a.o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: GridLayoutItemDecoration.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006$"}, d2 = {"Lcom/taihebase/activity/view/GridLayoutItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "()V", "decorateFullItem", "", "getDecorateFullItem", "()Z", "setDecorateFullItem", "(Z)V", "horizontalMiddleDecoration", "", "getHorizontalMiddleDecoration", "()I", "setHorizontalMiddleDecoration", "(I)V", "startAndEndDecoration", "getStartAndEndDecoration", "setStartAndEndDecoration", "topAndBottomDecoration", "getTopAndBottomDecoration", "setTopAndBottomDecoration", "verticalMiddleDecoration", "getVerticalMiddleDecoration", "setVerticalMiddleDecoration", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "registerObserverIfNeed", "Companion", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class p extends RecyclerView.ItemDecoration {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private static final a f26420f = null;
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public static final int f26421g = 1;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public static final int f26422h = 2;
    @Deprecated

    /* renamed from: i  reason: collision with root package name */
    public static final int f26423i = 3;

    /* renamed from: a  reason: collision with root package name */
    private int f26424a;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f26425d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f26426e;

    /* compiled from: GridLayoutItemDecoration.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taihebase/activity/view/GridLayoutItemDecoration$Companion;", "", "()V", "KEY_FRLL", "", "KEY_OFFSET", "KEY_REGISTER_OBSERVER", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: GridLayoutItemDecoration.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/taihebase/activity/view/GridLayoutItemDecoration$registerObserverIfNeed$1$1", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onItemRangeInserted", "", "positionStart", "", "itemCount", "onItemRangeMoved", "fromPosition", "toPosition", "onItemRangeRemoved", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends RecyclerView.AdapterDataObserver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.Adapter f26427a;

        public b(RecyclerView.Adapter adapter) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i2, int i3, int i4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i2, int i3) {
        }
    }

    private final void f(RecyclerView.State state, RecyclerView recyclerView) {
    }

    public final boolean a() {
    }

    public final int b() {
    }

    public final int c() {
    }

    public final int d() {
    }

    public final int e() {
    }

    public final void g(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
    }

    public final void h(int i2) {
    }

    public final void i(int i2) {
    }

    public final void j(int i2) {
    }

    public final void k(int i2) {
    }
}
