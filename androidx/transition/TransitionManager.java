package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TransitionManager {
    private static final String LOG_TAG = "TransitionManager";
    private static Transition sDefaultTransition;
    public static ArrayList<ViewGroup> sPendingTransitions;
    private static ThreadLocal<WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>>> sRunningTransitions;
    private ArrayMap<Scene, ArrayMap<Scene, Transition>> mScenePairTransitions;
    private ArrayMap<Scene, Transition> mSceneTransitions;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MultiListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public ViewGroup mSceneRoot;
        public Transition mTransition;

        /* renamed from: androidx.transition.TransitionManager$MultiListener$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 extends TransitionListenerAdapter {
            public final /* synthetic */ MultiListener this$0;
            public final /* synthetic */ ArrayMap val$runningTransitions;

            public AnonymousClass1(MultiListener multiListener, ArrayMap arrayMap) {
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NonNull Transition transition) {
            }
        }

        public MultiListener(Transition transition, ViewGroup viewGroup) {
        }

        private void removeListeners() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static void beginDelayedTransition(@NonNull ViewGroup viewGroup) {
    }

    private static void changeScene(Scene scene, Transition transition) {
    }

    public static void endTransitions(ViewGroup viewGroup) {
    }

    public static ArrayMap<ViewGroup, ArrayList<Transition>> getRunningTransitions() {
    }

    private Transition getTransition(Scene scene) {
    }

    public static void go(@NonNull Scene scene) {
    }

    private static void sceneChangeRunTransition(ViewGroup viewGroup, Transition transition) {
    }

    private static void sceneChangeSetup(ViewGroup viewGroup, Transition transition) {
    }

    public void setTransition(@NonNull Scene scene, @Nullable Transition transition) {
    }

    public void transitionTo(@NonNull Scene scene) {
    }

    public static void beginDelayedTransition(@NonNull ViewGroup viewGroup, @Nullable Transition transition) {
    }

    public static void go(@NonNull Scene scene, @Nullable Transition transition) {
    }

    public void setTransition(@NonNull Scene scene, @NonNull Scene scene2, @Nullable Transition transition) {
    }
}
