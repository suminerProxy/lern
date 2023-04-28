package h.c.a.a.g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.ant.phone.xmedia.algorithm.OCR;
import h.c.a.a.a;
import h.c.a.a.h.f;
import h.c.a.a.j.a;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: XMediaOCRManager.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class a implements a.InterfaceC0302a {
    private static final String t = "XMediaOCRManager";
    private static final int u = 0;
    private static final int v = 1;
    private static final int w = 2;
    private static final int x = 3;

    /* renamed from: a  reason: collision with root package name */
    private OCR f16191a;
    private h.c.a.a.j.a b;
    private a.InterfaceC0297a c;

    /* renamed from: d  reason: collision with root package name */
    private String f16192d;

    /* renamed from: e  reason: collision with root package name */
    private int f16193e;

    /* renamed from: f  reason: collision with root package name */
    private String f16194f;

    /* renamed from: g  reason: collision with root package name */
    private String f16195g;

    /* renamed from: h  reason: collision with root package name */
    private String[] f16196h;

    /* renamed from: i  reason: collision with root package name */
    private float[] f16197i;

    /* renamed from: j  reason: collision with root package name */
    private HashMap<String, Object> f16198j;

    /* renamed from: k  reason: collision with root package name */
    private int f16199k;

    /* renamed from: l  reason: collision with root package name */
    private long f16200l;

    /* renamed from: m  reason: collision with root package name */
    private f f16201m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f16202n;

    /* renamed from: o  reason: collision with root package name */
    private volatile boolean f16203o;

    /* renamed from: p  reason: collision with root package name */
    private HandlerThread f16204p;
    private b q;
    private volatile boolean r;
    private Object s;

    /* compiled from: XMediaOCRManager.java */
    /* renamed from: h.c.a.a.g.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class C0301a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f16205a;

        public C0301a(a aVar) {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
        }
    }

    /* compiled from: XMediaOCRManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<a> f16206a;
        public final /* synthetic */ a b;

        public b(a aVar, a aVar2, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public static /* synthetic */ void a(a aVar) {
    }

    public static /* synthetic */ void b(a aVar) {
    }

    public static /* synthetic */ void c(a aVar) {
    }

    public static /* synthetic */ void d(a aVar) {
    }

    public static /* synthetic */ void e(a aVar) {
    }

    private void f() {
    }

    private void g() {
    }

    private void h() {
    }

    private void i() {
    }

    private synchronized void k() {
    }

    private void m(int i2) {
    }

    private boolean n(Message message) {
    }

    private void o() {
    }

    public void j(String str, int i2, String str2, String str3, String[] strArr, float[] fArr, HashMap<String, Object> hashMap, a.InterfaceC0297a interfaceC0297a) {
    }

    public void l() {
    }

    @Override // h.c.a.a.j.a.InterfaceC0302a
    public void onRgbFrameAvailable(byte[] bArr, int i2, int i3) {
    }

    @Override // h.c.a.a.j.a.InterfaceC0302a
    public void onYuvFrameAvailable(byte[] bArr, int i2, int i3, int i4) {
    }

    public void p() {
    }

    public void q() {
    }
}
