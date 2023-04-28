package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class GhostViewHolder extends FrameLayout {
    private boolean mAttached;
    @NonNull
    private ViewGroup mParent;

    public GhostViewHolder(ViewGroup viewGroup) {
    }

    public static GhostViewHolder getHolder(@NonNull ViewGroup viewGroup) {
    }

    private int getInsertIndex(ArrayList<View> arrayList) {
    }

    private static void getParents(View view, ArrayList<View> arrayList) {
    }

    private static boolean isOnTop(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
    }

    public void addGhostView(GhostViewPort ghostViewPort) {
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
    }

    public void popToOverlayTop() {
    }

    private static boolean isOnTop(View view, View view2) {
    }
}
