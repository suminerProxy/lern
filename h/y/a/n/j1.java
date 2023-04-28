package h.y.a.n;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WeakHandler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class j1 extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Activity> f26317a;
    private WeakReference<h.y.a.k.f> b;

    public j1(Activity activity) {
        this.f26317a = new WeakReference<>(activity);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        WeakReference<h.y.a.k.f> weakReference = this.b;
        if (weakReference != null && weakReference.get() != null) {
            this.b.get().onHandlerMessage(this.f26317a.get(), message);
        }
        super.handleMessage(message);
    }

    public void setOnHandlerListener(h.y.a.k.f fVar) {
        this.b = new WeakReference<>(fVar);
    }
}
