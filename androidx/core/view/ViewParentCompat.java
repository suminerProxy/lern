package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class ViewParentCompat {
    private static final String TAG = "ViewParentCompat";
    private static int[] sTempNestedScrollConsumed;

    private ViewParentCompat() {
    }

    private static int[] getTempNestedScrollConsumed() {
    }

    public static void notifySubtreeAccessibilityStateChanged(ViewParent viewParent, View view, View view2, int i2) {
    }

    public static boolean onNestedFling(ViewParent viewParent, View view, float f2, float f3, boolean z) {
    }

    public static boolean onNestedPreFling(ViewParent viewParent, View view, float f2, float f3) {
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i2, int i3, int i4, int i5) {
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i2) {
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i2) {
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view) {
    }

    @Deprecated
    public static boolean requestSendAccessibilityEvent(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i2, int i3, int[] iArr, int i4) {
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i2, int i3) {
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i2, int i3) {
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view, int i2) {
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i2, int i3, int i4, int i5, int i6) {
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i2, int i3, int i4, int i5, int i6, @NonNull int[] iArr) {
    }
}
