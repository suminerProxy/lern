package com.mob.commons.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mob.commons.d;
import com.mob.commons.s;
import com.mob.commons.v;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.MobLog;
import com.tencent.imsdk.BaseConstants;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class o implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private static o f3464a = new o();
    private Handler b;

    private o() {
        String str;
        if (TextUtils.isEmpty("M-")) {
            str = null;
        } else {
            str = v.f3695a + a("004Jfjhjijhm");
        }
        this.b = MobHandlerThread.newHandler(str, this);
    }

    public static o a() {
        return f3464a;
    }

    public Handler b() {
        return this.b;
    }

    public Looper c() {
        Handler handler = this.b;
        if (handler != null) {
            return handler.getLooper();
        }
        return null;
    }

    public boolean d(long j2, Runnable runnable) {
        return b(1005, j2, runnable);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        c a2;
        try {
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        if (!com.mob.commons.b.d()) {
            Message obtain = Message.obtain();
            obtain.copyFrom(message);
            this.b.sendMessageDelayed(obtain, 60000L);
            return false;
        }
        int i2 = message.what;
        if (i2 != 1003 && i2 != 1004 && i2 != 1006) {
            if (i2 == 1002) {
                d.b bVar = (d.b) message.obj;
                if (bVar != null) {
                    if (!bVar.f3594a) {
                        bVar.f3594a = true;
                    }
                    v.f3696d.execute(bVar);
                    int i3 = message.arg1;
                    Message obtain2 = Message.obtain();
                    obtain2.what = 1002;
                    obtain2.obj = bVar;
                    obtain2.arg1 = i3;
                    a(obtain2, i3 * 1000);
                }
            } else if (i2 == 1005) {
                Runnable runnable = (Runnable) message.obj;
                if (runnable != null) {
                    v.c.execute(runnable);
                }
            } else if (i2 >= 10000 || i2 < -10000) {
                Object[] objArr = (Object[]) message.obj;
                Class cls = (Class) objArr[0];
                if (cls != null && (a2 = c.a(cls)) != null) {
                    Object[] objArr2 = (Object[]) objArr[1];
                    a2.b = ((Integer) objArr2[0]).intValue();
                    a2.f3429a = objArr2[1];
                    a2.g();
                }
            }
            return false;
        }
        Runnable runnable2 = (Runnable) message.obj;
        if (runnable2 != null) {
            v.f3696d.execute(runnable2);
        }
        return false;
    }

    public void a(long j2, Class<? extends c> cls, Object[] objArr, int i2) {
        int a2 = a(cls);
        if (i2 == 1) {
            this.b.removeMessages(a2);
        } else if (i2 == 2 && this.b.hasMessages(a2)) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = a2;
        obtain.obj = new Object[]{cls, objArr};
        a(obtain, j2 * 1000);
    }

    public boolean b(long j2, Runnable runnable) {
        return a(1004, j2 * 1000, runnable);
    }

    public void d() {
        this.b.removeMessages(1002);
    }

    private boolean b(int i2, long j2, Runnable runnable) {
        Message obtain = Message.obtain();
        obtain.what = i2;
        obtain.obj = runnable;
        a(obtain, j2);
        return true;
    }

    public boolean c(long j2, Runnable runnable) {
        return a(1006, j2 * 1000, runnable);
    }

    public boolean a(long j2, Runnable runnable) {
        return a(1003, j2 * 1000, runnable);
    }

    public void a(long j2, int i2, d.b bVar) {
        Message obtain = Message.obtain();
        obtain.what = 1002;
        obtain.arg1 = i2;
        obtain.obj = bVar;
        a(obtain, j2 * 1000);
    }

    private boolean a(int i2, long j2, Runnable runnable) {
        if (this.b.hasMessages(i2)) {
            return false;
        }
        b(i2, j2, runnable);
        return true;
    }

    private int a(Class<? extends c> cls) {
        int hashCode = cls.getName().hashCode();
        return hashCode > 0 ? hashCode + 10000 : hashCode + BaseConstants.ERR_SVR_SSO_VCODE;
    }

    private void a(Message message, long j2) {
        if (j2 > 0) {
            this.b.sendMessageDelayed(message, j2);
        } else {
            this.b.sendMessage(message);
        }
    }

    public static String a(String str) {
        return s.a(str, 100);
    }
}
