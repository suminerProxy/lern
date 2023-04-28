package h.f.a.a;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;

/* compiled from: IScrollingController.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface j {
    int a(RecyclerView.State state);

    RecyclerView.SmoothScroller b(@NonNull Context context, int i2, int i3, AnchorViewState anchorViewState);

    int c(RecyclerView.State state);

    boolean d(RecyclerView.Recycler recycler, RecyclerView.State state);

    int e(int i2, RecyclerView.Recycler recycler, RecyclerView.State state);

    int f(int i2, RecyclerView.Recycler recycler, RecyclerView.State state);

    int g(RecyclerView.State state);

    int h(RecyclerView.State state);

    boolean i();

    int j(RecyclerView.State state);

    boolean k();

    int l(RecyclerView.State state);
}
