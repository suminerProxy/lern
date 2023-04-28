package com.showstartfans.activity.widget.videoNew.listDm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class AutoPollRecyclerView extends RecyclerView {

    /* renamed from: o  reason: collision with root package name */
    private static long f7501o;
    public b b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f7502d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7503e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7504f;

    /* renamed from: g  reason: collision with root package name */
    private final int f7505g;

    /* renamed from: h  reason: collision with root package name */
    private c f7506h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7507i;

    /* renamed from: j  reason: collision with root package name */
    public int f7508j;

    /* renamed from: k  reason: collision with root package name */
    public Paint f7509k;

    /* renamed from: l  reason: collision with root package name */
    private int f7510l;

    /* renamed from: m  reason: collision with root package name */
    private LinearGradient f7511m;

    /* renamed from: n  reason: collision with root package name */
    private int f7512n;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends RecyclerView.ItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7513a;
        public final /* synthetic */ Xfermode b;
        public final /* synthetic */ AutoPollRecyclerView c;

        public a(AutoPollRecyclerView autoPollRecyclerView, int i2, Xfermode xfermode) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b implements Runnable {
        private final WeakReference b;

        public b(AutoPollRecyclerView autoPollRecyclerView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        void a();
    }

    public AutoPollRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public static /* synthetic */ boolean a(AutoPollRecyclerView autoPollRecyclerView) {
    }

    public static /* synthetic */ boolean b(AutoPollRecyclerView autoPollRecyclerView) {
    }

    public static /* synthetic */ int c(AutoPollRecyclerView autoPollRecyclerView) {
    }

    public static /* synthetic */ int d(AutoPollRecyclerView autoPollRecyclerView) {
    }

    public static /* synthetic */ long e() {
    }

    public static /* synthetic */ long f(long j2) {
    }

    public static /* synthetic */ boolean g(AutoPollRecyclerView autoPollRecyclerView) {
    }

    public static /* synthetic */ int h(AutoPollRecyclerView autoPollRecyclerView) {
    }

    public static /* synthetic */ c i(AutoPollRecyclerView autoPollRecyclerView) {
    }

    public static /* synthetic */ LinearGradient j(AutoPollRecyclerView autoPollRecyclerView) {
    }

    public static /* synthetic */ LinearGradient k(AutoPollRecyclerView autoPollRecyclerView, LinearGradient linearGradient) {
    }

    public static /* synthetic */ int l(AutoPollRecyclerView autoPollRecyclerView) {
    }

    public static /* synthetic */ int m(AutoPollRecyclerView autoPollRecyclerView, int i2) {
    }

    public static /* synthetic */ int n(AutoPollRecyclerView autoPollRecyclerView) {
    }

    public static /* synthetic */ int o(AutoPollRecyclerView autoPollRecyclerView, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public void p(int i2) {
    }

    public void q() {
    }

    public void r() {
    }

    public void setPollCall(c cVar) {
    }

    public void setTotal(int i2) {
    }

    public void setVideoPlaying(boolean z) {
    }
}
