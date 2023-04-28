package h.f.a.a;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import h.f.a.a.m;

/* compiled from: VerticalScrollingController.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class p extends m implements j {

    /* renamed from: e  reason: collision with root package name */
    private ChipsLayoutManager f16329e;

    /* compiled from: VerticalScrollingController.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a extends LinearSmoothScroller {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AnchorViewState f16330a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ p f16331d;

        public a(p pVar, Context context, AnchorViewState anchorViewState, int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public PointF computeScrollVectorForPosition(int i2) {
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        }
    }

    public p(ChipsLayoutManager chipsLayoutManager, h.f.a.a.t.m mVar, m.a aVar) {
    }

    public static /* synthetic */ ChipsLayoutManager x(p pVar) {
    }

    @Override // h.f.a.a.j
    public RecyclerView.SmoothScroller b(@NonNull Context context, int i2, int i3, AnchorViewState anchorViewState) {
    }

    @Override // h.f.a.a.j
    public boolean i() {
    }

    @Override // h.f.a.a.j
    public boolean k() {
    }

    @Override // h.f.a.a.m
    public void t(int i2) {
    }
}
