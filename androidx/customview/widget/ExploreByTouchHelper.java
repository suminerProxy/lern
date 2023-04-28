package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.customview.widget.FocusStrategy;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = null;
    private static final FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> NODE_ADAPTER = null;
    private static final FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> SPARSE_VALUES_ADAPTER = null;
    public int mAccessibilityFocusedVirtualViewId;
    private final View mHost;
    private int mHoveredVirtualViewId;
    public int mKeyboardFocusedVirtualViewId;
    private final AccessibilityManager mManager;
    private MyNodeProvider mNodeProvider;
    private final int[] mTempGlobalRect;
    private final Rect mTempParentRect;
    private final Rect mTempScreenRect;
    private final Rect mTempVisibleRect;

    /* renamed from: androidx.customview.widget.ExploreByTouchHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> {
        @Override // androidx.customview.widget.FocusStrategy.BoundsAdapter
        public /* bridge */ /* synthetic */ void obtainBounds(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Rect rect) {
        }

        /* renamed from: obtainBounds  reason: avoid collision after fix types in other method */
        public void obtainBounds2(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Rect rect) {
        }
    }

    /* renamed from: androidx.customview.widget.ExploreByTouchHelper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 implements FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> {
        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        public /* bridge */ /* synthetic */ AccessibilityNodeInfoCompat get(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat, int i2) {
        }

        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        public /* bridge */ /* synthetic */ int size(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public AccessibilityNodeInfoCompat get2(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat, int i2) {
        }

        /* renamed from: size  reason: avoid collision after fix types in other method */
        public int size2(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class MyNodeProvider extends AccessibilityNodeProviderCompat {
        public final /* synthetic */ ExploreByTouchHelper this$0;

        public MyNodeProvider(ExploreByTouchHelper exploreByTouchHelper) {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i2) {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat findFocus(int i2) {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int i2, int i3, Bundle bundle) {
        }
    }

    public ExploreByTouchHelper(@NonNull View view) {
    }

    private boolean clearAccessibilityFocus(int i2) {
    }

    private boolean clickKeyboardFocusedVirtualView() {
    }

    private AccessibilityEvent createEvent(int i2, int i3) {
    }

    private AccessibilityEvent createEventForChild(int i2, int i3) {
    }

    private AccessibilityEvent createEventForHost(int i2) {
    }

    @NonNull
    private AccessibilityNodeInfoCompat createNodeForChild(int i2) {
    }

    @NonNull
    private AccessibilityNodeInfoCompat createNodeForHost() {
    }

    private SparseArrayCompat<AccessibilityNodeInfoCompat> getAllNodes() {
    }

    private void getBoundsInParent(int i2, Rect rect) {
    }

    private static Rect guessPreviouslyFocusedRect(@NonNull View view, int i2, @NonNull Rect rect) {
    }

    private boolean isVisibleToUser(Rect rect) {
    }

    private static int keyToDirection(int i2) {
    }

    private boolean moveFocus(int i2, @Nullable Rect rect) {
    }

    private boolean performActionForChild(int i2, int i3, Bundle bundle) {
    }

    private boolean performActionForHost(int i2, Bundle bundle) {
    }

    private boolean requestAccessibilityFocus(int i2) {
    }

    private void updateHoveredVirtualView(int i2) {
    }

    public final boolean clearKeyboardFocusForVirtualView(int i2) {
    }

    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
    }

    public final boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
    }

    public final int getAccessibilityFocusedVirtualViewId() {
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
    }

    @Deprecated
    public int getFocusedVirtualView() {
    }

    public final int getKeyboardFocusedVirtualViewId() {
    }

    public abstract int getVirtualViewAt(float f2, float f3);

    public abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
    }

    public final void invalidateVirtualView(int i2) {
    }

    @NonNull
    public AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int i2) {
    }

    public final void onFocusChanged(boolean z, int i2, @Nullable Rect rect) {
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public abstract boolean onPerformActionForVirtualView(int i2, int i3, @Nullable Bundle bundle);

    public void onPopulateEventForHost(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i2, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public abstract void onPopulateNodeForVirtualView(int i2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    public void onVirtualViewKeyboardFocusChanged(int i2, boolean z) {
    }

    public boolean performAction(int i2, int i3, Bundle bundle) {
    }

    public final boolean requestKeyboardFocusForVirtualView(int i2) {
    }

    public final boolean sendEventForVirtualView(int i2, int i3) {
    }

    public final void invalidateVirtualView(int i2, int i3) {
    }
}
