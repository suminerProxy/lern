package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    private static final int DEF_STYLE_RES = 0;
    private static final String LOG_TAG = null;
    @IdRes
    private int checkedId;
    private final CheckedStateTracker checkedStateTracker;
    private Integer[] childOrder;
    private final Comparator<MaterialButton> childOrderComparator;
    private final LinkedHashSet<OnButtonCheckedListener> onButtonCheckedListeners;
    private final List<CornerData> originalCornerData;
    private final PressedStateTracker pressedStateTracker;
    private boolean selectionRequired;
    private boolean singleSelection;
    private boolean skipCheckedStateTracker;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Comparator<MaterialButton> {
        public final /* synthetic */ MaterialButtonToggleGroup this$0;

        public AnonymousClass1(MaterialButtonToggleGroup materialButtonToggleGroup) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(MaterialButton materialButton, MaterialButton materialButton2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(MaterialButton materialButton, MaterialButton materialButton2) {
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends AccessibilityDelegateCompat {
        public final /* synthetic */ MaterialButtonToggleGroup this$0;

        public AnonymousClass2(MaterialButtonToggleGroup materialButtonToggleGroup) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class CheckedStateTracker implements MaterialButton.OnCheckedChangeListener {
        public final /* synthetic */ MaterialButtonToggleGroup this$0;

        private CheckedStateTracker(MaterialButtonToggleGroup materialButtonToggleGroup) {
        }

        @Override // com.google.android.material.button.MaterialButton.OnCheckedChangeListener
        public void onCheckedChanged(@NonNull MaterialButton materialButton, boolean z) {
        }

        public /* synthetic */ CheckedStateTracker(MaterialButtonToggleGroup materialButtonToggleGroup, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CornerData {
        private static final CornerSize noCorner = null;
        public CornerSize bottomLeft;
        public CornerSize bottomRight;
        public CornerSize topLeft;
        public CornerSize topRight;

        public CornerData(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        }

        public static CornerData bottom(CornerData cornerData) {
        }

        public static CornerData end(CornerData cornerData, View view) {
        }

        public static CornerData left(CornerData cornerData) {
        }

        public static CornerData right(CornerData cornerData) {
        }

        public static CornerData start(CornerData cornerData, View view) {
        }

        public static CornerData top(CornerData cornerData) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnButtonCheckedListener {
        void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, @IdRes int i2, boolean z);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        public final /* synthetic */ MaterialButtonToggleGroup this$0;

        private PressedStateTracker(MaterialButtonToggleGroup materialButtonToggleGroup) {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public void onPressedChanged(@NonNull MaterialButton materialButton, boolean z) {
        }

        public /* synthetic */ PressedStateTracker(MaterialButtonToggleGroup materialButtonToggleGroup, AnonymousClass1 anonymousClass1) {
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
    }

    public static /* synthetic */ int access$200(MaterialButtonToggleGroup materialButtonToggleGroup, View view) {
    }

    public static /* synthetic */ boolean access$300(MaterialButtonToggleGroup materialButtonToggleGroup) {
    }

    public static /* synthetic */ boolean access$400(MaterialButtonToggleGroup materialButtonToggleGroup) {
    }

    public static /* synthetic */ int access$502(MaterialButtonToggleGroup materialButtonToggleGroup, int i2) {
    }

    public static /* synthetic */ boolean access$600(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z) {
    }

    public static /* synthetic */ void access$700(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z) {
    }

    private void adjustChildMarginsAndUpdateLayout() {
    }

    @NonNull
    private LinearLayout.LayoutParams buildLayoutParams(@NonNull View view) {
    }

    private void checkForced(int i2) {
    }

    private void dispatchOnButtonChecked(@IdRes int i2, boolean z) {
    }

    private MaterialButton getChildButton(int i2) {
    }

    private int getFirstVisibleChildIndex() {
    }

    private int getIndexWithinVisibleButtons(@Nullable View view) {
    }

    private int getLastVisibleChildIndex() {
    }

    @Nullable
    private CornerData getNewCornerData(int i2, int i3, int i4) {
    }

    private int getVisibleButtonCount() {
    }

    private boolean isChildVisible(int i2) {
    }

    private void resetChildMargins(int i2) {
    }

    private void setCheckedId(int i2) {
    }

    private void setCheckedStateForView(@IdRes int i2, boolean z) {
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
    }

    private static void updateBuilderWithCornerData(ShapeAppearanceModel.Builder builder, @Nullable CornerData cornerData) {
    }

    private boolean updateCheckedStates(int i2, boolean z) {
    }

    private void updateChildOrder() {
    }

    public void addOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
    }

    public void check(@IdRes int i2) {
    }

    public void clearChecked() {
    }

    public void clearOnButtonCheckedListeners() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
    }

    @IdRes
    public int getCheckedButtonId() {
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
    }

    public boolean isSelectionRequired() {
    }

    public boolean isSingleSelection() {
    }

    @Override // android.view.View
    public void onFinishInflate() {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
    }

    public void removeOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
    }

    public void setSelectionRequired(boolean z) {
    }

    public void setSingleSelection(boolean z) {
    }

    public void uncheck(@IdRes int i2) {
    }

    @VisibleForTesting
    public void updateChildShapes() {
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public void setSingleSelection(@BoolRes int i2) {
    }
}
