package com.sobot.chat.core.channel;

import android.app.Notification;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.PowerManager;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.sobot.chat.core.HttpUtils;
import com.sobot.chat.core.a.a.i;
import com.sobot.chat.core.a.a.j;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotTCPServer extends Service {
    public static NetworkInfo b = null;
    public static WifiInfo c = null;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f7713d = true;
    private LimitQueue<String> A;
    private com.sobot.chat.core.a.a B;
    private int C;
    private List<String> D;
    private Timer E;
    private TimerTask F;
    private final int G;
    private final int H;
    private int I;
    private boolean J;
    private Map<String, String> K;
    private Map<String, String> L;
    private b M;
    private Runnable N;
    private boolean O;
    private PowerManager.WakeLock P;

    /* renamed from: a  reason: collision with root package name */
    public int f7714a;

    /* renamed from: e  reason: collision with root package name */
    public Context f7715e;

    /* renamed from: f  reason: collision with root package name */
    public String f7716f;

    /* renamed from: g  reason: collision with root package name */
    public String f7717g;

    /* renamed from: h  reason: collision with root package name */
    public String f7718h;

    /* renamed from: i  reason: collision with root package name */
    public String f7719i;

    /* renamed from: j  reason: collision with root package name */
    public String f7720j;

    /* renamed from: k  reason: collision with root package name */
    public String f7721k;

    /* renamed from: l  reason: collision with root package name */
    public String f7722l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7723m;

    /* renamed from: n  reason: collision with root package name */
    public int f7724n;

    /* renamed from: o  reason: collision with root package name */
    public final int f7725o;

    /* renamed from: p  reason: collision with root package name */
    public final int f7726p;
    public int q;
    public SparseArray<String> r;
    public boolean s;
    public boolean t;
    private MyMessageReceiver u;
    private SystemMessageReceiver v;
    private LocalBroadcastManager w;
    private a x;
    private final int y;
    private boolean z;

    /* renamed from: com.sobot.chat.core.channel.SobotTCPServer$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements i.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SobotTCPServer f7728a;

        public AnonymousClass2(SobotTCPServer sobotTCPServer) {
        }

        @Override // com.sobot.chat.core.a.a.i.c
        public byte[] a(i iVar, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.core.channel.SobotTCPServer$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements i.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SobotTCPServer f7729a;

        public AnonymousClass3(SobotTCPServer sobotTCPServer) {
        }

        @Override // com.sobot.chat.core.a.a.i.b
        public int a(i iVar, byte[] bArr) {
        }
    }

    /* renamed from: com.sobot.chat.core.channel.SobotTCPServer$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SobotTCPServer f7730a;

        public AnonymousClass4(SobotTCPServer sobotTCPServer) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.core.channel.SobotTCPServer$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SobotTCPServer f7733a;

        public AnonymousClass6(SobotTCPServer sobotTCPServer) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AssistService extends Service {

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a extends Binder {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AssistService f7734a;

            public a(AssistService assistService) {
            }

            public AssistService a() {
            }
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
        }

        @Override // android.app.Service
        public void onDestroy() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class MyMessageReceiver extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SobotTCPServer f7735a;

        public MyMessageReceiver(SobotTCPServer sobotTCPServer) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class SystemMessageReceiver extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SobotTCPServer f7736a;

        public SystemMessageReceiver(SobotTCPServer sobotTCPServer) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SobotTCPServer f7737a;

        private a(SobotTCPServer sobotTCPServer) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ a(SobotTCPServer sobotTCPServer, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public static /* synthetic */ a a(SobotTCPServer sobotTCPServer, a aVar) {
    }

    public static /* synthetic */ int b(SobotTCPServer sobotTCPServer) {
    }

    public static /* synthetic */ Notification c(SobotTCPServer sobotTCPServer) {
    }

    public static /* synthetic */ a d(SobotTCPServer sobotTCPServer) {
    }

    public static /* synthetic */ void e(SobotTCPServer sobotTCPServer) {
    }

    public static /* synthetic */ com.sobot.chat.core.a.a f(SobotTCPServer sobotTCPServer) {
    }

    public static /* synthetic */ void g(SobotTCPServer sobotTCPServer) {
    }

    public static /* synthetic */ LimitQueue h(SobotTCPServer sobotTCPServer) {
    }

    public static /* synthetic */ Map i(SobotTCPServer sobotTCPServer) {
    }

    public static /* synthetic */ Runnable j(SobotTCPServer sobotTCPServer) {
    }

    public static /* synthetic */ b k(SobotTCPServer sobotTCPServer) {
    }

    private String l() {
    }

    private void m() {
    }

    private b n() {
    }

    private void o() {
    }

    private void p() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
    }

    public static /* synthetic */ void a(SobotTCPServer sobotTCPServer) {
    }

    private void e(com.sobot.chat.core.a.a aVar) {
    }

    private void f(com.sobot.chat.core.a.a aVar) {
    }

    private void g() {
    }

    private void h() {
    }

    private void i() {
    }

    private Notification j() {
    }

    private void k() {
    }

    public boolean b(Context context, NetworkInfo networkInfo) {
    }

    public synchronized void c() {
    }

    public com.sobot.chat.core.a.a d() {
    }

    public static /* synthetic */ void a(SobotTCPServer sobotTCPServer, com.sobot.chat.core.a.a aVar) {
    }

    public static /* synthetic */ void a(SobotTCPServer sobotTCPServer, String str) {
    }

    public static /* synthetic */ boolean a(SobotTCPServer sobotTCPServer, boolean z) {
    }

    public void e() {
    }

    public void a(Context context, NetworkInfo networkInfo) {
    }

    private void c(com.sobot.chat.core.a.a aVar) {
    }

    public boolean f() {
    }

    private void d(com.sobot.chat.core.a.a aVar) {
    }

    /* renamed from: com.sobot.chat.core.channel.SobotTCPServer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements com.sobot.chat.core.a.a.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SobotTCPServer f7727a;

        public AnonymousClass1(SobotTCPServer sobotTCPServer) {
        }

        @Override // com.sobot.chat.core.a.a.b
        public void a(com.sobot.chat.core.a.a aVar) {
        }

        @Override // com.sobot.chat.core.a.a.b
        public void b(com.sobot.chat.core.a.a aVar) {
        }

        @Override // com.sobot.chat.core.a.a.b
        public void a(com.sobot.chat.core.a.a aVar, @NonNull j jVar) {
        }
    }

    public void a() {
    }

    /* renamed from: com.sobot.chat.core.channel.SobotTCPServer$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SobotTCPServer f7731a;

        public AnonymousClass5(SobotTCPServer sobotTCPServer) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        /* renamed from: com.sobot.chat.core.channel.SobotTCPServer$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements HttpUtils.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass5 f7732a;

            public AnonymousClass1(AnonymousClass5 anonymousClass5) {
            }

            @Override // com.sobot.chat.core.HttpUtils.a
            public void a(int i2) {
            }

            @Override // com.sobot.chat.core.HttpUtils.a
            public void a(String str) {
            }

            @Override // com.sobot.chat.core.HttpUtils.a
            public void a(Exception exc, String str, int i2) {
            }
        }
    }

    public boolean b() {
    }

    private void b(com.sobot.chat.core.a.a aVar) {
    }

    public synchronized void a(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    public void b(boolean z) {
    }

    private void a(com.sobot.chat.core.a.a aVar) {
    }

    public void a(boolean z) {
    }

    private void a(String str) {
    }
}
