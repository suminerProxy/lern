package com.tencent.android.tpush.stat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.jg.EType;
import com.jg.JgMethodChecked;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.tpns.baseapi.base.util.CommonWorkingThread;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.dataacquisition.DeviceInfos;
import org.apache.http.HttpHost;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f9085a;
    private volatile int b = 2;
    private volatile String c = "";

    /* renamed from: d  reason: collision with root package name */
    private volatile HttpHost f9086d = null;

    /* renamed from: e  reason: collision with root package name */
    private Context f9087e;

    /* renamed from: f  reason: collision with root package name */
    private com.tencent.android.tpush.stat.b.c f9088f;

    private b(Context context) {
        this.f9087e = null;
        this.f9088f = null;
        this.f9087e = context.getApplicationContext();
        f.a(context);
        this.f9088f = com.tencent.android.tpush.stat.b.b.b();
        f();
        d();
    }

    private void f() {
        this.b = 0;
        this.f9086d = null;
        this.c = null;
    }

    public String a() {
        return this.c;
    }

    public boolean b() {
        return this.b == 1;
    }

    public boolean c() {
        return this.b != 0;
    }

    public void d() {
        if (DeviceInfos.isNetworkAvailable(this.f9087e)) {
            this.c = DeviceInfos.getLinkedWay(this.f9087e);
            if (d.b()) {
                com.tencent.android.tpush.stat.b.c cVar = this.f9088f;
                cVar.b("NETWORK name:" + this.c);
            }
            if (com.tencent.android.tpush.stat.b.b.c(this.c)) {
                if ("WIFI".equalsIgnoreCase(this.c)) {
                    this.b = 1;
                } else {
                    this.b = 2;
                }
                this.f9086d = com.tencent.android.tpush.stat.b.b.b(this.f9087e);
                return;
            }
            return;
        }
        if (d.b()) {
            this.f9088f.b("NETWORK TYPE: network is close.");
        }
        f();
    }

    @JgMethodChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.RECEIVERCHECK})
    public void e() {
        try {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.tencent.android.tpush.stat.b.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    CommonWorkingThread.getInstance().execute(new TTask() { // from class: com.tencent.android.tpush.stat.b.1.1
                        @Override // com.tencent.tpns.baseapi.base.util.TTask
                        public void TRun() {
                            b.this.d();
                        }
                    });
                }
            };
            if (Build.VERSION.SDK_INT >= 33) {
                this.f9087e.getApplicationContext().registerReceiver(broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 4);
            } else {
                this.f9087e.getApplicationContext().registerReceiver(broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            }
        } catch (Throwable th) {
            TLogger.e("registerBroadcast", "", th);
        }
    }

    public static b a(Context context) {
        if (f9085a == null) {
            synchronized (b.class) {
                if (f9085a == null) {
                    f9085a = new b(context);
                }
            }
        }
        return f9085a;
    }
}
