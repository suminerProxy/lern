package h.y.a.o.y;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.taihebase.activity.view.bottomsheet.behavior.SpecialBottomSheetBehavior;
import com.tencent.android.tpush.common.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BottomDialog.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\u0010J$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/taihebase/activity/view/bottomsheet/BottomDialog;", "Lcom/taihebase/activity/view/bottomsheet/behavior/SpecialBottomSheetDialog;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mctx", "theme", "", "(Landroid/content/Context;I)V", "canDrag", "", "isWrapConent", "peekHeight", "topOffset", "getContentHeight", "optionCanotDrag", "", "setCanotDrag", "setDialogBackGround", "Landroid/view/View;", "view", "setPeekHeight", "setTopOffset", Constants.FLAG_TAG_OFFSET, "topOffsetDefault", "wrapInBottomSheet", "layoutResId", "params", "Landroid/view/ViewGroup$LayoutParams;", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class c extends h.y.a.o.y.d.c {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Context f26463g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f26464h;

    /* renamed from: i  reason: collision with root package name */
    private int f26465i;

    /* renamed from: j  reason: collision with root package name */
    private int f26466j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f26467k;

    /* compiled from: BottomDialog.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/taihebase/activity/view/bottomsheet/BottomDialog$optionCanotDrag$1", "Lcom/taihebase/activity/view/bottomsheet/behavior/SpecialBottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends SpecialBottomSheetBehavior.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f26468a;

        public a(c cVar) {
        }

        @Override // com.taihebase.activity.view.bottomsheet.behavior.SpecialBottomSheetBehavior.c
        public void a(@NotNull View view, float f2) {
        }

        @Override // com.taihebase.activity.view.bottomsheet.behavior.SpecialBottomSheetBehavior.c
        public void b(@NotNull View view, int i2) {
        }
    }

    public c(@NotNull Context context, int i2) {
    }

    private final int e() {
    }

    private final void f() {
    }

    private final View h(View view) {
    }

    public final void g() {
    }

    public final void i(int i2) {
    }

    public final void j(int i2) {
    }

    public final void k() {
    }

    @Override // h.y.a.o.y.d.c
    @NotNull
    public View wrapInBottomSheet(int i2, @Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
    }

    public c(@NotNull Context context) {
    }
}
