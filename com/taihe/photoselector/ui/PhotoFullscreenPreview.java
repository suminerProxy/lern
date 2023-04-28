package com.taihe.photoselector.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.taihe.photoselector.ui.photodrawee.PhotoDraweeView;
import com.taihe.photoselector.ui.photodrawee.ScaleImageView;
import h.x.e.d.h;
import h.x.e.d.l.f;
import h.x.e.d.l.j;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PhotoFullscreenPreview extends FrameLayout {
    private j b;
    private Context c;

    /* renamed from: d  reason: collision with root package name */
    private h f7847d;

    /* renamed from: e  reason: collision with root package name */
    private f f7848e;

    /* renamed from: f  reason: collision with root package name */
    private h.x.e.d.l.d f7849f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements View.OnLongClickListener {
        public final /* synthetic */ PhotoFullscreenPreview b;

        public a(PhotoFullscreenPreview photoFullscreenPreview) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PhotoFullscreenPreview f7850a;

        public b(PhotoFullscreenPreview photoFullscreenPreview) {
        }

        @Override // h.x.e.d.l.j
        public void onViewTap(View view, float f2, float f3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ ScaleImageView b;
        public final /* synthetic */ PhotoFullscreenPreview c;

        public c(PhotoFullscreenPreview photoFullscreenPreview, ScaleImageView scaleImageView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ SubsamplingScaleImageView b;
        public final /* synthetic */ PhotoFullscreenPreview c;

        public d(PhotoFullscreenPreview photoFullscreenPreview, SubsamplingScaleImageView subsamplingScaleImageView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e extends AsyncTask<String, Integer, String[]> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PhotoFullscreenPreview f7851a;

        private e(PhotoFullscreenPreview photoFullscreenPreview) {
        }

        public String[] a(String... strArr) {
        }

        public void b(String[] strArr) {
        }

        public void c(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String[] doInBackground(String[] strArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onProgressUpdate(Integer[] numArr) {
        }

        public /* synthetic */ e(PhotoFullscreenPreview photoFullscreenPreview, a aVar) {
        }
    }

    public PhotoFullscreenPreview(Context context) {
    }

    public static /* synthetic */ h.x.e.d.l.d a(PhotoFullscreenPreview photoFullscreenPreview) {
    }

    public static /* synthetic */ j b(PhotoFullscreenPreview photoFullscreenPreview) {
    }

    public static /* synthetic */ h c(PhotoFullscreenPreview photoFullscreenPreview) {
    }

    public static /* synthetic */ h d(PhotoFullscreenPreview photoFullscreenPreview, h hVar) {
    }

    public static /* synthetic */ Context e(PhotoFullscreenPreview photoFullscreenPreview) {
    }

    public static /* synthetic */ void f(PhotoFullscreenPreview photoFullscreenPreview, String str, String str2) {
    }

    public static /* synthetic */ void g(PhotoFullscreenPreview photoFullscreenPreview) {
    }

    private FrameLayout.LayoutParams getContentLayoutParams() {
    }

    private FrameLayout.LayoutParams getParams() {
    }

    private PhotoDraweeView getPhotoDraweeView() {
    }

    private void h() {
    }

    public static /* synthetic */ boolean j(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ boolean k(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
    }

    private void o(String str, String str2, boolean z) {
    }

    private void p(String str, String str2, boolean z) {
    }

    private void q(String str, String str2, boolean z, int i2, int i3) {
    }

    private void r(String str, String str2) {
    }

    private void s(String str, String str2) {
    }

    public String i(String str) {
    }

    public void l(String str, boolean z) {
    }

    public void m(String str, String str2, int i2, int i3) {
    }

    public void n(String str, String str2, int i2, int i3) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void setOnDoubleTapInterceptListener(f fVar) {
    }

    public void setOnLongClickInterceptListener(h.x.e.d.l.d dVar) {
    }

    public void setOnViewTapListener(j jVar) {
    }

    public PhotoFullscreenPreview(Context context, AttributeSet attributeSet) {
    }

    public PhotoFullscreenPreview(Context context, AttributeSet attributeSet, int i2) {
    }
}
