package androidx.core.animation;

import android.animation.Animator;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: Animator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a9\u0010\b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\n\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\t\u001a9\u0010\u000b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\t\u001a9\u0010\f\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\f\u0010\t\u001a9\u0010\u000e\u001a\u00020\r*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0010\u001a\u00020\r*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a¨\u0001\u0010\u0015\u001a\u00020\u0007*\u00020\u00002#\b\u0006\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a^\u0010\u0019\u001a\u00020\r*\u00020\u00002#\b\u0006\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroid/animation/Animator;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animator", "", "action", "Landroid/animation/Animator$AnimatorListener;", "doOnEnd", "(Landroid/animation/Animator;Lkotlin/jvm/functions/Function1;)Landroid/animation/Animator$AnimatorListener;", "doOnStart", "doOnCancel", "doOnRepeat", "Landroid/animation/Animator$AnimatorPauseListener;", "doOnResume", "(Landroid/animation/Animator;Lkotlin/jvm/functions/Function1;)Landroid/animation/Animator$AnimatorPauseListener;", "doOnPause", "onEnd", "onStart", "onCancel", "onRepeat", "addListener", "(Landroid/animation/Animator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroid/animation/Animator$AnimatorListener;", "onResume", "onPause", "addPauseListener", "(Landroid/animation/Animator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroid/animation/Animator$AnimatorPauseListener;", "core-ktx_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class AnimatorKt {
    @NotNull
    public static final Animator.AnimatorListener addListener(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1, @NotNull Function1<? super Animator, Unit> function12, @NotNull Function1<? super Animator, Unit> function13, @NotNull Function1<? super Animator, Unit> function14) {
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i2, Object obj) {
    }

    @RequiresApi(19)
    @NotNull
    public static final Animator.AnimatorPauseListener addPauseListener(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1, @NotNull Function1<? super Animator, Unit> function12) {
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, Function1 function1, Function1 function12, int i2, Object obj) {
    }

    @NotNull
    public static final Animator.AnimatorListener doOnCancel(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1) {
    }

    @NotNull
    public static final Animator.AnimatorListener doOnEnd(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1) {
    }

    @RequiresApi(19)
    @NotNull
    public static final Animator.AnimatorPauseListener doOnPause(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1) {
    }

    @NotNull
    public static final Animator.AnimatorListener doOnRepeat(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1) {
    }

    @RequiresApi(19)
    @NotNull
    public static final Animator.AnimatorPauseListener doOnResume(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1) {
    }

    @NotNull
    public static final Animator.AnimatorListener doOnStart(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1) {
    }
}
