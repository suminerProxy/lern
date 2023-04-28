package com.mob.tools.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mob.tools.proguard.PublicMemberKeeper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class UIHandler implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static Handler f4532a;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Message f4533a;
        public final Handler.Callback b;

        public a(Message message, Handler.Callback callback) {
        }
    }

    private static void b() {
        f4532a = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.mob.tools.utils.UIHandler.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        });
    }

    public static boolean sendEmptyMessage(int i2, Handler.Callback callback) {
        a();
        return f4532a.sendMessage(a(i2, callback));
    }

    public static boolean sendEmptyMessageDelayed(int i2, long j2, Handler.Callback callback) {
        a();
        return f4532a.sendMessageDelayed(a(i2, callback), j2);
    }

    public static boolean sendMessage(Message message, Handler.Callback callback) {
        a();
        return f4532a.sendMessage(a(message, callback));
    }

    public static boolean sendMessageDelayed(Message message, long j2, Handler.Callback callback) {
        a();
        return f4532a.sendMessageDelayed(a(message, callback), j2);
    }

    private static synchronized void a() {
        synchronized (UIHandler.class) {
            if (f4532a == null) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Message message) {
        a aVar = (a) message.obj;
        Message message2 = aVar.f4533a;
        Handler.Callback callback = aVar.b;
        if (callback != null) {
            callback.handleMessage(message2);
        }
    }

    private static Message a(Message message, Handler.Callback callback) {
        Message message2 = new Message();
        message2.obj = new a(message, callback);
        return message2;
    }

    private static Message a(int i2, Handler.Callback callback) {
        Message message = new Message();
        message.what = i2;
        return a(message, callback);
    }
}
