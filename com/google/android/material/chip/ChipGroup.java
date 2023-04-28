package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.FlowLayout;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ChipGroup extends FlowLayout {
    private static final int DEF_STYLE_RES = 0;
    @IdRes
    private int checkedId;
    private final CheckedStateTracker checkedStateTracker;
    @Dimension
    private int chipSpacingHorizontal;
    @Dimension
    private int chipSpacingVertical;
    @Nullable
    private OnCheckedChangeListener onCheckedChangeListener;
    @NonNull
    private PassThroughHierarchyChangeListener passThroughListener;
    private boolean protectFromCheckedChange;
    private boolean selectionRequired;
    private boolean singleSelection;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class CheckedStateTracker implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ ChipGroup this$0;

        private CheckedStateTracker(ChipGroup chipGroup) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean z) {
        }

        public /* synthetic */ CheckedStateTracker(ChipGroup chipGroup, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
        }

        public LayoutParams(int i2, int i3) {
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnCheckedChangeListener {
        void onCheckedChanged(ChipGroup chipGroup, @IdRes int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        private ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;
        public final /* synthetic */ ChipGroup this$0;

        private PassThroughHierarchyChangeListener(ChipGroup chipGroup) {
        }

        public static /* synthetic */ ViewGroup.OnHierarchyChangeListener access$202(PassThroughHierarchyChangeListener passThroughHierarchyChangeListener, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }

        public /* synthetic */ PassThroughHierarchyChangeListener(ChipGroup chipGroup, AnonymousClass1 anonymousClass1) {
        }
    }

    public ChipGroup(Context context) {
    }

    public static /* synthetic */ CheckedStateTracker access$1000(ChipGroup chipGroup) {
    }

    public static /* synthetic */ boolean access$300(ChipGroup chipGroup) {
    }

    public static /* synthetic */ boolean access$400(ChipGroup chipGroup) {
    }

    public static /* synthetic */ void access$500(ChipGroup chipGroup, int i2, boolean z) {
    }

    public static /* synthetic */ void access$600(ChipGroup chipGroup, int i2, boolean z) {
    }

    public static /* synthetic */ int access$700(ChipGroup chipGroup) {
    }

    public static /* synthetic */ boolean access$800(ChipGroup chipGroup) {
    }

    public static /* synthetic */ void access$900(ChipGroup chipGroup, int i2) {
    }

    private int getChipCount() {
    }

    private void setCheckedId(int i2) {
    }

    private void setCheckedStateForView(@IdRes int i2, boolean z) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
    }

    public void check(@IdRes int i2) {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void clearCheck() {
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @IdRes
    public int getCheckedChipId() {
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
    }

    @Dimension
    public int getChipSpacingHorizontal() {
    }

    @Dimension
    public int getChipSpacingVertical() {
    }

    public int getIndexOfChip(@Nullable View view) {
    }

    public boolean isSelectionRequired() {
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
    }

    public boolean isSingleSelection() {
    }

    @Override // android.view.View
    public void onFinishInflate() {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    public void setChipSpacing(@Dimension int i2) {
    }

    public void setChipSpacingHorizontal(@Dimension int i2) {
    }

    public void setChipSpacingHorizontalResource(@DimenRes int i2) {
    }

    public void setChipSpacingResource(@DimenRes int i2) {
    }

    public void setChipSpacingVertical(@Dimension int i2) {
    }

    public void setChipSpacingVerticalResource(@DimenRes int i2) {
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
    }

    @Deprecated
    public void setFlexWrap(int i2) {
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
    }

    public void setSelectionRequired(boolean z) {
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
    }

    public void setSingleSelection(boolean z) {
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
    }

    private void setCheckedId(int i2, boolean z) {
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void setSingleLine(@BoolRes int i2) {
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i2) {
    }

    public void setSingleSelection(@BoolRes int i2) {
    }
}
