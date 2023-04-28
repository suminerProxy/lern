package com.showstartfans.activity.widget.videoNew.listDm;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ScrollSpeedLinearLayoutManger extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    private float f7514a;
    private Context b;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends LinearSmoothScroller {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScrollSpeedLinearLayoutManger f7515a;

        public a(ScrollSpeedLinearLayoutManger scrollSpeedLinearLayoutManger, Context context) {
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        }
    }

    public ScrollSpeedLinearLayoutManger(Context context) {
    }

    public static /* synthetic */ float i(ScrollSpeedLinearLayoutManger scrollSpeedLinearLayoutManger) {
    }

    public void j() {
    }

    public void k() {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
    }
}
