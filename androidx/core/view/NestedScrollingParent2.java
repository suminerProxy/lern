package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface NestedScrollingParent2 extends NestedScrollingParent {
    void onNestedPreScroll(@NonNull View view, int i2, int i3, @NonNull int[] iArr, int i4);

    void onNestedScroll(@NonNull View view, int i2, int i3, int i4, int i5, int i6);

    void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i2, int i3);

    boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i2, int i3);

    void onStopNestedScroll(@NonNull View view, int i2);
}
