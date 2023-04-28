package h.c.a.a.b.b;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;

/* compiled from: ShakeDetector.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class g implements SensorEventListener {

    /* renamed from: j  reason: collision with root package name */
    private static final String f16104j = "ShakeDetector";

    /* renamed from: k  reason: collision with root package name */
    private static final int f16105k = 100;
    private long b;
    private float c;

    /* renamed from: d  reason: collision with root package name */
    private float f16106d;

    /* renamed from: e  reason: collision with root package name */
    private float f16107e;

    /* renamed from: f  reason: collision with root package name */
    private SensorManager f16108f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<a> f16109g;

    /* renamed from: h  reason: collision with root package name */
    private int f16110h;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f16111i;

    /* compiled from: ShakeDetector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface a {
        void a();
    }

    public g(Context context) {
    }

    private void b() {
    }

    public boolean a() {
    }

    public void c() {
    }

    public void d() {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
    }

    public void registerOnShakeListener(a aVar) {
    }

    public void unregisterOnShakeListener(a aVar) {
    }

    public g(Context context, int i2) {
    }
}
