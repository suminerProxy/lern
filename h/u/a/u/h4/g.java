package h.u.a.u.h4;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* compiled from: WheelScroller.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class g {

    /* renamed from: l  reason: collision with root package name */
    private static final int f24685l = 400;

    /* renamed from: m  reason: collision with root package name */
    public static final int f24686m = 1;

    /* renamed from: a  reason: collision with root package name */
    private c f24687a;
    private Context b;
    private GestureDetector c;

    /* renamed from: d  reason: collision with root package name */
    private Scroller f24688d;

    /* renamed from: e  reason: collision with root package name */
    private int f24689e;

    /* renamed from: f  reason: collision with root package name */
    private float f24690f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f24691g;

    /* renamed from: h  reason: collision with root package name */
    private GestureDetector.SimpleOnGestureListener f24692h;

    /* renamed from: i  reason: collision with root package name */
    private final int f24693i;

    /* renamed from: j  reason: collision with root package name */
    private final int f24694j;

    /* renamed from: k  reason: collision with root package name */
    private Handler f24695k;

    /* compiled from: WheelScroller.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ g b;

        public a(g gVar) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        }
    }

    /* compiled from: WheelScroller.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f24696a;

        public b(g gVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* compiled from: WheelScroller.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        void a();

        void b();

        void c(int i2);

        void onFinished();
    }

    public g(Context context, c cVar) {
    }

    public static /* synthetic */ int a(g gVar) {
    }

    public static /* synthetic */ int b(g gVar, int i2) {
    }

    public static /* synthetic */ Scroller c(g gVar) {
    }

    public static /* synthetic */ void d(g gVar, int i2) {
    }

    public static /* synthetic */ c e(g gVar) {
    }

    public static /* synthetic */ Handler f(g gVar) {
    }

    public static /* synthetic */ void g(g gVar) {
    }

    private void h() {
    }

    private void j() {
    }

    private void n(int i2) {
    }

    private void o() {
    }

    public void i() {
    }

    public boolean k(MotionEvent motionEvent) {
    }

    public void l(int i2, int i3) {
    }

    public void m(Interpolator interpolator) {
    }

    public void p() {
    }
}
