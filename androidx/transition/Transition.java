package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class Transition implements Cloneable {
    public static final boolean DBG = false;
    private static final int[] DEFAULT_MATCH_ORDER = null;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private static final PathMotion STRAIGHT_PATH_MOTION = null;
    private static ThreadLocal<ArrayMap<Animator, AnimationInfo>> sRunningAnimators;
    private ArrayList<Animator> mAnimators;
    public boolean mCanRemoveViews;
    public ArrayList<Animator> mCurrentAnimators;
    public long mDuration;
    private TransitionValuesMaps mEndValues;
    private ArrayList<TransitionValues> mEndValuesList;
    private boolean mEnded;
    private EpicenterCallback mEpicenterCallback;
    private TimeInterpolator mInterpolator;
    private ArrayList<TransitionListener> mListeners;
    private int[] mMatchOrder;
    private String mName;
    private ArrayMap<String, String> mNameOverrides;
    private int mNumInstances;
    public TransitionSet mParent;
    private PathMotion mPathMotion;
    private boolean mPaused;
    public TransitionPropagation mPropagation;
    private ViewGroup mSceneRoot;
    private long mStartDelay;
    private TransitionValuesMaps mStartValues;
    private ArrayList<TransitionValues> mStartValuesList;
    private ArrayList<View> mTargetChildExcludes;
    private ArrayList<View> mTargetExcludes;
    private ArrayList<Integer> mTargetIdChildExcludes;
    private ArrayList<Integer> mTargetIdExcludes;
    public ArrayList<Integer> mTargetIds;
    private ArrayList<String> mTargetNameExcludes;
    private ArrayList<String> mTargetNames;
    private ArrayList<Class<?>> mTargetTypeChildExcludes;
    private ArrayList<Class<?>> mTargetTypeExcludes;
    private ArrayList<Class<?>> mTargetTypes;
    public ArrayList<View> mTargets;

    /* renamed from: androidx.transition.Transition$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 extends PathMotion {
        @Override // androidx.transition.PathMotion
        public Path getPath(float f2, float f3, float f4, float f5) {
        }
    }

    /* renamed from: androidx.transition.Transition$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public final /* synthetic */ Transition this$0;
        public final /* synthetic */ ArrayMap val$runningAnimators;

        public AnonymousClass2(Transition transition, ArrayMap arrayMap) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.transition.Transition$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 extends AnimatorListenerAdapter {
        public final /* synthetic */ Transition this$0;

        public AnonymousClass3(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnimationInfo {
        public String mName;
        public Transition mTransition;
        public TransitionValues mValues;
        public View mView;
        public WindowIdImpl mWindowId;

        public AnimationInfo(View view, String str, Transition transition, WindowIdImpl windowIdImpl, TransitionValues transitionValues) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ArrayListManager {
        private ArrayListManager() {
        }

        public static <T> ArrayList<T> add(ArrayList<T> arrayList, T t) {
        }

        public static <T> ArrayList<T> remove(ArrayList<T> arrayList, T t) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class EpicenterCallback {
        public abstract Rect onGetEpicenter(@NonNull Transition transition);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface MatchOrder {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface TransitionListener {
        void onTransitionCancel(@NonNull Transition transition);

        void onTransitionEnd(@NonNull Transition transition);

        void onTransitionPause(@NonNull Transition transition);

        void onTransitionResume(@NonNull Transition transition);

        void onTransitionStart(@NonNull Transition transition);
    }

    public Transition() {
    }

    private void addUnmatched(ArrayMap<View, TransitionValues> arrayMap, ArrayMap<View, TransitionValues> arrayMap2) {
    }

    private static void addViewValues(TransitionValuesMaps transitionValuesMaps, View view, TransitionValues transitionValues) {
    }

    private static boolean alreadyContains(int[] iArr, int i2) {
    }

    private void captureHierarchy(View view, boolean z) {
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i2, boolean z) {
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t, boolean z) {
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z) {
    }

    private static ArrayMap<Animator, AnimationInfo> getRunningAnimators() {
    }

    private static boolean isValidMatch(int i2) {
    }

    private static boolean isValueChanged(TransitionValues transitionValues, TransitionValues transitionValues2, String str) {
    }

    private void matchIds(ArrayMap<View, TransitionValues> arrayMap, ArrayMap<View, TransitionValues> arrayMap2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
    }

    private void matchInstances(ArrayMap<View, TransitionValues> arrayMap, ArrayMap<View, TransitionValues> arrayMap2) {
    }

    private void matchItemIds(ArrayMap<View, TransitionValues> arrayMap, ArrayMap<View, TransitionValues> arrayMap2, LongSparseArray<View> longSparseArray, LongSparseArray<View> longSparseArray2) {
    }

    private void matchNames(ArrayMap<View, TransitionValues> arrayMap, ArrayMap<View, TransitionValues> arrayMap2, ArrayMap<String, View> arrayMap3, ArrayMap<String, View> arrayMap4) {
    }

    private void matchStartAndEnd(TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2) {
    }

    private static int[] parseMatchOrder(String str) {
    }

    private void runAnimator(Animator animator, ArrayMap<Animator, AnimationInfo> arrayMap) {
    }

    @NonNull
    public Transition addListener(@NonNull TransitionListener transitionListener) {
    }

    @NonNull
    public Transition addTarget(@NonNull View view) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void animate(Animator animator) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
    }

    public abstract void captureEndValues(@NonNull TransitionValues transitionValues);

    public void capturePropagationValues(TransitionValues transitionValues) {
    }

    public abstract void captureStartValues(@NonNull TransitionValues transitionValues);

    public void captureValues(ViewGroup viewGroup, boolean z) {
    }

    public void clearValues(boolean z) {
    }

    /* renamed from: clone  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object mo7clone() throws CloneNotSupportedException {
    }

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList<TransitionValues> arrayList, ArrayList<TransitionValues> arrayList2) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void end() {
    }

    @NonNull
    public Transition excludeChildren(@NonNull View view, boolean z) {
    }

    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
    }

    public long getDuration() {
    }

    @Nullable
    public Rect getEpicenter() {
    }

    @Nullable
    public EpicenterCallback getEpicenterCallback() {
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
    }

    public TransitionValues getMatchedTransitionValues(View view, boolean z) {
    }

    @NonNull
    public String getName() {
    }

    @NonNull
    public PathMotion getPathMotion() {
    }

    @Nullable
    public TransitionPropagation getPropagation() {
    }

    public long getStartDelay() {
    }

    @NonNull
    public List<Integer> getTargetIds() {
    }

    @Nullable
    public List<String> getTargetNames() {
    }

    @Nullable
    public List<Class<?>> getTargetTypes() {
    }

    @NonNull
    public List<View> getTargets() {
    }

    @Nullable
    public String[] getTransitionProperties() {
    }

    @Nullable
    public TransitionValues getTransitionValues(@NonNull View view, boolean z) {
    }

    public boolean isTransitionRequired(@Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
    }

    public boolean isValidTarget(View view) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(View view) {
    }

    public void playTransition(ViewGroup viewGroup) {
    }

    @NonNull
    public Transition removeListener(@NonNull TransitionListener transitionListener) {
    }

    @NonNull
    public Transition removeTarget(@NonNull View view) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
    }

    public void setCanRemoveViews(boolean z) {
    }

    @NonNull
    public Transition setDuration(long j2) {
    }

    public void setEpicenterCallback(@Nullable EpicenterCallback epicenterCallback) {
    }

    @NonNull
    public Transition setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
    }

    public void setMatchOrder(int... iArr) {
    }

    public void setPathMotion(@Nullable PathMotion pathMotion) {
    }

    public void setPropagation(@Nullable TransitionPropagation transitionPropagation) {
    }

    public Transition setSceneRoot(ViewGroup viewGroup) {
    }

    @NonNull
    public Transition setStartDelay(long j2) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void start() {
    }

    public String toString() {
    }

    @NonNull
    public Transition addTarget(@IdRes int i2) {
    }

    public Transition clone() {
    }

    @NonNull
    public Transition excludeChildren(@IdRes int i2, boolean z) {
    }

    @NonNull
    public Transition excludeTarget(@IdRes int i2, boolean z) {
    }

    @NonNull
    public Transition removeTarget(@IdRes int i2) {
    }

    public String toString(String str) {
    }

    @NonNull
    public Transition addTarget(@NonNull String str) {
    }

    @NonNull
    public Transition excludeChildren(@NonNull Class<?> cls, boolean z) {
    }

    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z) {
    }

    @NonNull
    public Transition removeTarget(@NonNull String str) {
    }

    @NonNull
    public Transition excludeTarget(@NonNull Class<?> cls, boolean z) {
    }

    @NonNull
    public Transition removeTarget(@NonNull Class<?> cls) {
    }

    @NonNull
    public Transition addTarget(@NonNull Class<?> cls) {
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
    }
}
