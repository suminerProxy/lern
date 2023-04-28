package i.a.e1.a.d;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import i.a.e1.c.q0;
import java.util.Objects;

/* compiled from: AndroidSchedulers.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final q0 f26718a = i.a.e1.a.c.a.f(i.a.e1.a.d.a.b);

    /* compiled from: AndroidSchedulers.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final q0 f26719a = null;

        private a() {
        }
    }

    private b() {
        throw new AssertionError("No instances.");
    }

    public static q0 a(Looper looper) {
        return b(looper, true);
    }

    @SuppressLint({"NewApi"})
    public static q0 b(Looper looper, boolean z) {
        Objects.requireNonNull(looper, "looper == null");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 16) {
            z = false;
        } else if (z && i2 < 22) {
            Message obtain = Message.obtain();
            try {
                obtain.setAsynchronous(true);
            } catch (NoSuchMethodError unused) {
                z = false;
            }
            obtain.recycle();
        }
        return new c(new Handler(looper), z);
    }

    public static q0 d() {
        return i.a.e1.a.c.a.g(f26718a);
    }
}
