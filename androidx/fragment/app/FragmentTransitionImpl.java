package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class FragmentTransitionImpl {

    /* renamed from: androidx.fragment.app.FragmentTransitionImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ FragmentTransitionImpl this$0;
        public final /* synthetic */ ArrayList val$inNames;
        public final /* synthetic */ int val$numSharedElements;
        public final /* synthetic */ ArrayList val$outNames;
        public final /* synthetic */ ArrayList val$sharedElementsIn;
        public final /* synthetic */ ArrayList val$sharedElementsOut;

        public AnonymousClass1(FragmentTransitionImpl fragmentTransitionImpl, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTransitionImpl$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ FragmentTransitionImpl this$0;
        public final /* synthetic */ Map val$nameOverrides;
        public final /* synthetic */ ArrayList val$sharedElementsIn;

        public AnonymousClass2(FragmentTransitionImpl fragmentTransitionImpl, ArrayList arrayList, Map map) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTransitionImpl$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ FragmentTransitionImpl this$0;
        public final /* synthetic */ Map val$nameOverrides;
        public final /* synthetic */ ArrayList val$sharedElementsIn;

        public AnonymousClass3(FragmentTransitionImpl fragmentTransitionImpl, ArrayList arrayList, Map map) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static void bfsAddViewChildren(List<View> list, View view) {
    }

    private static boolean containedBeforeIndex(List<View> list, View view, int i2) {
    }

    public static String findKeyForValue(Map<String, String> map, String str) {
    }

    public static boolean isNullOrEmpty(List list) {
    }

    public abstract void addTarget(Object obj, View view);

    public abstract void addTargets(Object obj, ArrayList<View> arrayList);

    public abstract void beginDelayedTransition(ViewGroup viewGroup, Object obj);

    public abstract boolean canHandle(Object obj);

    public void captureTransitioningViews(ArrayList<View> arrayList, View view) {
    }

    public abstract Object cloneTransition(Object obj);

    public void findNamedViews(Map<String, View> map, @NonNull View view) {
    }

    public void getBoundsOnScreen(View view, Rect rect) {
    }

    public abstract Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3);

    public abstract Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3);

    public ArrayList<String> prepareSetNameOverridesReordered(ArrayList<View> arrayList) {
    }

    public abstract void removeTarget(Object obj, View view);

    public abstract void replaceTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void scheduleHideFragmentView(Object obj, View view, ArrayList<View> arrayList);

    public void scheduleNameReset(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
    }

    public abstract void scheduleRemoveTargets(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void setEpicenter(Object obj, Rect rect);

    public abstract void setEpicenter(Object obj, View view);

    public void setNameOverridesOrdered(View view, ArrayList<View> arrayList, Map<String, String> map) {
    }

    public void setNameOverridesReordered(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
    }

    public abstract void setSharedElementTargets(Object obj, View view, ArrayList<View> arrayList);

    public abstract void swapSharedElementTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object wrapTransitionInSet(Object obj);
}
