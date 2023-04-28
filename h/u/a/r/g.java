package h.u.a.r;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.showstartfans.activity.activitys.usercenter.TabCouponsSelectNewActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TicketNotificationToast.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0003J\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u000fH\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/showstartfans/activity/toast/TicketNotificationToast;", "", "act", "Landroid/app/Activity;", "content", "", TabCouponsSelectNewActivity.f6399o, "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "layoutView", "Landroid/view/View;", "parentView", "Landroid/view/ViewGroup;", "runnable", "Ljava/lang/Runnable;", "dissmiss", "", "make", "show", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class g {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private String f24433a;
    @Nullable
    private Activity b;
    @Nullable
    private String c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private View f24434d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f24435e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f24436f;

    /* compiled from: TicketNotificationToast.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/toast/TicketNotificationToast$dissmiss$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Animator.AnimatorListener {
        public final /* synthetic */ g b;

        public a(g gVar) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@Nullable Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Nullable Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@Nullable Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@Nullable Animator animator) {
        }
    }

    public g(@Nullable Activity activity, @Nullable String str, @Nullable String str2) {
    }

    public static final /* synthetic */ View a(g gVar) {
    }

    public static final /* synthetic */ ViewGroup b(g gVar) {
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final void c() {
    }

    public static /* synthetic */ void d(g gVar) {
    }

    public static /* synthetic */ void e(g gVar, View view) {
    }

    private static final void g(g gVar, View view) {
    }

    private static final void h(g gVar) {
    }

    public final void f() {
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    public final void i() {
    }
}
