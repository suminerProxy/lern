package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface NestedScrollingParent {
    int getNestedScrollAxes();

    boolean onNestedFling(@NonNull View view, float f2, float f3, boolean z);

    boolean onNestedPreFling(@NonNull View view, float f2, float f3);

    void onNestedPreScroll(@NonNull View view, int i2, int i3, @NonNull int[] iArr);

    void onNestedScroll(@NonNull View view, int i2, int i3, int i4, int i5);

    void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i2);

    boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i2);

    void onStopNestedScroll(@NonNull View view);
}
