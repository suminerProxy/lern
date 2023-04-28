package h.y.a.f.o;

import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseFunctionFragment.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0010H\u0004J1\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\r0\u0015J\u0006\u0010\u0018\u001a\u00020\rJ\b\u0010\u0019\u001a\u00020\u000bH\u0004J\b\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dH\u0004J\u0010\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020 R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/taihebase/activity/base/fragment/BaseFunctionFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/taihebase/activity/base/BaseInterface;", "()V", "ctx", "Landroidx/fragment/app/FragmentActivity;", "getCtx", "()Landroidx/fragment/app/FragmentActivity;", "ctx$delegate", "Lkotlin/Lazy;", "handler", "Landroid/os/Handler;", "MyToast", "", "text", "", "", "clickView", "view", "Landroid/view/View;", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "dissProgressDialog", "getHandler", "onPause", "postRunnable", "runnable", "Ljava/lang/Runnable;", "showProgressDialog", "cancle", "", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class d extends Fragment implements h.y.a.f.f {
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    @NotNull
    private final Lazy ctx$delegate;
    @NotNull
    private final Handler handler;

    /* compiled from: BaseFunctionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<FragmentActivity> {
        public final /* synthetic */ d this$0;

        public a(d dVar) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final FragmentActivity invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ FragmentActivity invoke() {
        }
    }

    /* renamed from: clickView$lambda-1  reason: not valid java name */
    private static final void m48clickView$lambda1(Function1 function1, View view) {
    }

    public static /* synthetic */ void e(d dVar, Runnable runnable) {
    }

    public static /* synthetic */ void f(Function1 function1, View view) {
    }

    /* renamed from: postRunnable$lambda-0  reason: not valid java name */
    private static final void m49postRunnable$lambda0(d dVar, Runnable runnable) {
    }

    public static /* synthetic */ void showProgressDialog$default(d dVar, boolean z, int i2, Object obj) {
    }

    public final void MyToast(@NotNull String str) {
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    public final void clickView(@NotNull View view, @NotNull Function1<? super View, Unit> function1) {
    }

    public final void dissProgressDialog() {
    }

    @Nullable
    public final FragmentActivity getCtx() {
    }

    @NotNull
    public final Handler getHandler() {
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
    }

    public final void postRunnable(@NotNull Runnable runnable) {
    }

    public final void showProgressDialog(boolean z) {
    }

    public final void MyToast(int i2) {
    }
}
