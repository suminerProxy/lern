package org.libpag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static c f29864a;
    private static HandlerThread b;
    private static volatile int c;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public PAGImageView f29865a;
        public String b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public Bitmap f29866d;

        public static a a(PAGImageView pAGImageView, String str, int i2, Bitmap bitmap) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f29867a;
        public int b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public int f29868d;

        /* renamed from: e  reason: collision with root package name */
        public long f29869e;

        /* renamed from: f  reason: collision with root package name */
        public PAGDecoder f29870f;

        public boolean a() {
        }

        public void b() {
        }

        public void c() {
        }

        public boolean a(Context context, PAGComposition pAGComposition, String str, int i2, int i3, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final Object f29871a;
        private List<PAGImageView> b;

        public c(Looper looper) {
        }

        public void a(PAGImageView pAGImageView) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public static synchronized void a() {
    }

    public static double b(int i2, int i3) {
    }

    public static synchronized void b() {
    }

    public static /* synthetic */ void c() {
    }

    private static void d() {
    }

    public static void a(int i2, Object obj) {
    }

    public static void a(PAGImageView pAGImageView) {
    }

    public static Matrix a(int i2, int i3, int i4, int i5, int i6) {
    }

    public static String a(String str) {
    }

    private static double a(double d2, double d3) {
    }

    public static int a(double d2, int i2) {
    }

    public static Bitmap a(int i2, int i3) {
    }
}
