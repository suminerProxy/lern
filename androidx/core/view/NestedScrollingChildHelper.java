package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NestedScrollingChildHelper {
    private boolean mIsNestedScrollingEnabled;
    private ViewParent mNestedScrollingParentNonTouch;
    private ViewParent mNestedScrollingParentTouch;
    private int[] mTempNestedScrollConsumed;
    private final View mView;

    public NestedScrollingChildHelper(@NonNull View view) {
    }

    private boolean dispatchNestedScrollInternal(int i2, int i3, int i4, int i5, @Nullable int[] iArr, int i6, @Nullable int[] iArr2) {
    }

    private ViewParent getNestedScrollingParentForType(int i2) {
    }

    private int[] getTempNestedScrollConsumed() {
    }

    private void setNestedScrollingParentForType(int i2, ViewParent viewParent) {
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, @Nullable int[] iArr, @Nullable int[] iArr2) {
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, @Nullable int[] iArr) {
    }

    public boolean hasNestedScrollingParent() {
    }

    public boolean isNestedScrollingEnabled() {
    }

    public void onDetachedFromWindow() {
    }

    public void onStopNestedScroll(@NonNull View view) {
    }

    public void setNestedScrollingEnabled(boolean z) {
    }

    public boolean startNestedScroll(int i2) {
    }

    public void stopNestedScroll() {
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, @Nullable int[] iArr, @Nullable int[] iArr2, int i4) {
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, @Nullable int[] iArr, int i6) {
    }

    public boolean hasNestedScrollingParent(int i2) {
    }

    public boolean startNestedScroll(int i2, int i3) {
    }

    public void stopNestedScroll(int i2) {
    }

    public void dispatchNestedScroll(int i2, int i3, int i4, int i5, @Nullable int[] iArr, int i6, @Nullable int[] iArr2) {
    }
}
