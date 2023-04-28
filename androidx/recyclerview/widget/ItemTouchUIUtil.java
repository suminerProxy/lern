package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface ItemTouchUIUtil {
    void clearView(View view);

    void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f2, float f3, int i2, boolean z);

    void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f2, float f3, int i2, boolean z);

    void onSelected(View view);
}
