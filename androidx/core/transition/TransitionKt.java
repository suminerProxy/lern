package androidx.core.transition;

import android.transition.Transition;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: Transition.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a9\u0010\b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\n\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b¢\u0006\u0004\b\n\u0010\t\u001a9\u0010\u000b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b¢\u0006\u0004\b\u000b\u0010\t\u001a9\u0010\f\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b¢\u0006\u0004\b\f\u0010\t\u001a9\u0010\r\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b¢\u0006\u0004\b\r\u0010\t\u001aÍ\u0001\u0010\u0013\u001a\u00020\u0007*\u00020\u00002#\b\u0006\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroid/transition/Transition;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "transition", "", "action", "Landroid/transition/Transition$TransitionListener;", "doOnEnd", "(Landroid/transition/Transition;Lkotlin/jvm/functions/Function1;)Landroid/transition/Transition$TransitionListener;", "doOnStart", "doOnCancel", "doOnResume", "doOnPause", "onEnd", "onStart", "onCancel", "onResume", "onPause", "addListener", "(Landroid/transition/Transition;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroid/transition/Transition$TransitionListener;", "core-ktx_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class TransitionKt {
    @RequiresApi(19)
    @NotNull
    public static final Transition.TransitionListener addListener(@NotNull Transition transition, @NotNull Function1<? super Transition, Unit> function1, @NotNull Function1<? super Transition, Unit> function12, @NotNull Function1<? super Transition, Unit> function13, @NotNull Function1<? super Transition, Unit> function14, @NotNull Function1<? super Transition, Unit> function15) {
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i2, Object obj) {
    }

    @RequiresApi(19)
    @NotNull
    public static final Transition.TransitionListener doOnCancel(@NotNull Transition transition, @NotNull Function1<? super Transition, Unit> function1) {
    }

    @RequiresApi(19)
    @NotNull
    public static final Transition.TransitionListener doOnEnd(@NotNull Transition transition, @NotNull Function1<? super Transition, Unit> function1) {
    }

    @RequiresApi(19)
    @NotNull
    public static final Transition.TransitionListener doOnPause(@NotNull Transition transition, @NotNull Function1<? super Transition, Unit> function1) {
    }

    @RequiresApi(19)
    @NotNull
    public static final Transition.TransitionListener doOnResume(@NotNull Transition transition, @NotNull Function1<? super Transition, Unit> function1) {
    }

    @RequiresApi(19)
    @NotNull
    public static final Transition.TransitionListener doOnStart(@NotNull Transition transition, @NotNull Function1<? super Transition, Unit> function1) {
    }
}
