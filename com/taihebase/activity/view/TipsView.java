package com.taihebase.activity.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TipsView extends FrameLayout {
    public static final float r = 20.0f;
    private static WeakReference<TipsView> s;
    private PullRefreshLayout b;
    private Paint c;

    /* renamed from: d  reason: collision with root package name */
    private Path f8063d;

    /* renamed from: e  reason: collision with root package name */
    public float f8064e;

    /* renamed from: f  reason: collision with root package name */
    public float f8065f;

    /* renamed from: g  reason: collision with root package name */
    public float f8066g;

    /* renamed from: h  reason: collision with root package name */
    public float f8067h;

    /* renamed from: i  reason: collision with root package name */
    public float f8068i;

    /* renamed from: j  reason: collision with root package name */
    public float f8069j;

    /* renamed from: k  reason: collision with root package name */
    public float f8070k;

    /* renamed from: l  reason: collision with root package name */
    public float f8071l;

    /* renamed from: m  reason: collision with root package name */
    public float f8072m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8073n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8074o;

    /* renamed from: p  reason: collision with root package name */
    public ImageView f8075p;
    public View q;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements d<View> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f8076a;
        public final /* synthetic */ TipsView b;

        public a(TipsView tipsView, View view) {
        }

        public View a() {
        }

        @Override // com.taihebase.activity.view.TipsView.d
        public /* bridge */ /* synthetic */ View invoke() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements View.OnTouchListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ d c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f8077d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ TipsView f8078e;

        public b(TipsView tipsView, View view, d dVar, c cVar) {
        }

        private /* synthetic */ void c(c cVar) {
        }

        public void a() {
        }

        public void b() {
        }

        public /* synthetic */ void d(c cVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        void onCancel();

        void onComplete();

        void onStart();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface d<Tresult> {
        Tresult invoke();
    }

    public TipsView(Context context) {
    }

    private void e() {
    }

    public static TipsView f(Activity activity) {
    }

    private void g() {
    }

    public static Bitmap i(View view) {
    }

    public void a(View view) {
    }

    public void b(View view, PullRefreshLayout pullRefreshLayout, c cVar) {
    }

    public void c(View view, c cVar) {
    }

    public void d(View view, d<View> dVar, c cVar) {
    }

    public void h(View view, boolean z) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void setColor(int i2) {
    }

    public TipsView(Context context, AttributeSet attributeSet) {
    }

    public TipsView(Context context, AttributeSet attributeSet, int i2) {
    }
}
