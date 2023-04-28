package h.u.a.q.b;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* compiled from: MyOrientationListener.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class o implements SensorEventListener {
    private SensorManager b;
    private Context c;

    /* renamed from: d  reason: collision with root package name */
    private Sensor f24426d;

    /* renamed from: e  reason: collision with root package name */
    private float f24427e;

    /* renamed from: f  reason: collision with root package name */
    private a f24428f;

    /* compiled from: MyOrientationListener.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface a {
        void a(float f2);
    }

    public o(Context context) {
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

    public void setOnOrientationListener(a aVar) {
    }
}
