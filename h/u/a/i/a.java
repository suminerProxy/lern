package h.u.a.i;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* compiled from: SensorManagerHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class a implements SensorEventListener {

    /* renamed from: j  reason: collision with root package name */
    private static final int f24338j = 5000;

    /* renamed from: k  reason: collision with root package name */
    private static final int f24339k = 50;
    private SensorManager b;
    private Sensor c;

    /* renamed from: d  reason: collision with root package name */
    private InterfaceC0360a f24340d;

    /* renamed from: e  reason: collision with root package name */
    private Context f24341e;

    /* renamed from: f  reason: collision with root package name */
    private float f24342f;

    /* renamed from: g  reason: collision with root package name */
    private float f24343g;

    /* renamed from: h  reason: collision with root package name */
    private float f24344h;

    /* renamed from: i  reason: collision with root package name */
    private long f24345i;

    /* compiled from: SensorManagerHelper.java */
    /* renamed from: h.u.a.i.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface InterfaceC0360a {
        void a();
    }

    public a(Context context) {
    }

    public void a() {
    }

    public void b() {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
    }

    public void setOnShakeListener(InterfaceC0360a interfaceC0360a) {
    }
}
