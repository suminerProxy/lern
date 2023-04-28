package h.x.e.d.l;

import android.view.GestureDetector;
import android.view.View;

/* compiled from: IAttacher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public interface c {
    public static final float f0 = 3.0f;
    public static final float g0 = 1.75f;
    public static final float h0 = 1.0f;
    public static final long i0 = 200;

    void a(float f2, float f3, float f4, boolean z);

    void b(int i2, int i3);

    void d(float f2, boolean z);

    float getMaximumScale();

    float getMediumScale();

    float getMinimumScale();

    g getOnPhotoTapListener();

    j getOnViewTapListener();

    float getScale();

    void setAllowParentInterceptOnEdge(boolean z);

    void setMaximumScale(float f2);

    void setMediumScale(float f2);

    void setMinimumScale(float f2);

    void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener);

    void setOnLongClickListener(View.OnLongClickListener onLongClickListener);

    void setOnPhotoTapListener(g gVar);

    void setOnScaleChangeListener(h hVar);

    void setOnViewTapListener(j jVar);

    void setScale(float f2);

    void setZoomTransitionDuration(long j2);
}
