package androidx.core.view;

import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float f2, float f3, boolean z);

    boolean dispatchNestedPreFling(float f2, float f3);

    boolean dispatchNestedPreScroll(int i2, int i3, @Nullable int[] iArr, @Nullable int[] iArr2);

    boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, @Nullable int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z);

    boolean startNestedScroll(int i2);

    void stopNestedScroll();
}
