package androidx.core.view.accessibility;

import android.graphics.Rect;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AccessibilityWindowInfoCompat {
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;
    private static final int UNDEFINED = -1;
    private Object mInfo;

    private AccessibilityWindowInfoCompat(Object obj) {
    }

    public static AccessibilityWindowInfoCompat obtain() {
    }

    private static String typeToString(int i2) {
    }

    public static AccessibilityWindowInfoCompat wrapNonNullInstance(Object obj) {
    }

    public boolean equals(Object obj) {
    }

    public AccessibilityNodeInfoCompat getAnchor() {
    }

    public void getBoundsInScreen(Rect rect) {
    }

    public AccessibilityWindowInfoCompat getChild(int i2) {
    }

    public int getChildCount() {
    }

    public int getId() {
    }

    public int getLayer() {
    }

    public AccessibilityWindowInfoCompat getParent() {
    }

    public AccessibilityNodeInfoCompat getRoot() {
    }

    public CharSequence getTitle() {
    }

    public int getType() {
    }

    public int hashCode() {
    }

    public boolean isAccessibilityFocused() {
    }

    public boolean isActive() {
    }

    public boolean isFocused() {
    }

    public void recycle() {
    }

    @NonNull
    public String toString() {
    }

    public static AccessibilityWindowInfoCompat obtain(AccessibilityWindowInfoCompat accessibilityWindowInfoCompat) {
    }
}
