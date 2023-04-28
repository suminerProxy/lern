package com.mob.commons;

import android.os.Process;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f3679a = true;
    private static volatile int b = -1;
    private static AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicBoolean f3680d = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(boolean z, boolean z2) {
        if (z) {
            CountDownLatch g2 = g();
            MobLog.getInstance().d(DH.SyncMtd.isInMainProcess() ? "main" : "sub", new Object[0]);
            if (!z2) {
                b(g2);
            } else {
                b.h();
            }
        }
    }

    public static int d() {
        NLog mobLog = MobLog.getInstance();
        mobLog.d("get py grtd status: " + b, new Object[0]);
        return b;
    }

    public static int e() {
        NLog mobLog = MobLog.getInstance();
        mobLog.d("get py grtd status mem: " + b, new Object[0]);
        if (b != -1) {
            return b;
        }
        int b2 = x.b() ? x.a().b(x.f3711i, -1) : -1;
        NLog mobLog2 = MobLog.getInstance();
        mobLog2.d("get py grtd status cache: " + b2, new Object[0]);
        return b2;
    }

    public static String f() {
        return "jvr<1fgxsowakcet{mpzqnWPKUVCN0dy2iuhFDHQ|GTXERO:43YJ7lZ;/MI>\"@8A?9[)_]5=.(S'6~盺朼L\\-";
    }

    public static CountDownLatch g() {
        if (!f3680d.getAndSet(true)) {
            com.mob.tools.a.m.a(MobSDK.getContext()).a(com.mob.tools.a.m.a(MobSDK.getContext()).b());
            return com.mob.tools.a.c.a(MobSDK.getContext()).a(com.mob.tools.a.c.a(MobSDK.getContext()).d());
        }
        return new CountDownLatch(0);
    }

    private static void i() {
        try {
            ServerSocketChannel open = ServerSocketChannel.open();
            open.configureBlocking(false);
            open.socket().bind(new InetSocketAddress(37926));
            n.f3649a = false;
            open.close();
        } catch (Throwable unused) {
        }
    }

    private static void j() {
        j.a().a(new i() { // from class: com.mob.commons.t.3
            @Override // com.mob.commons.i
            public void a(boolean z, boolean z2, long j2) {
                if (z) {
                    MobLog.getInstance().d("fg.", new Object[0]);
                    boolean unused = t.f3679a = true;
                    return;
                }
                MobLog.getInstance().d("bg.", new Object[0]);
                boolean unused2 = t.f3679a = false;
            }
        });
    }

    public static boolean c() {
        if (!x.b()) {
            return o.f3666e;
        }
        return x.a().a(x.f3710h, o.f3666e);
    }

    public static void a(final boolean z) {
        v.c.execute(new com.mob.tools.utils.e() { // from class: com.mob.commons.t.1
            @Override // com.mob.tools.utils.e
            public void a() {
                int i2;
                com.mob.tools.b.a.b.set(Boolean.TRUE);
                if (!TextUtils.isEmpty("M-")) {
                    Thread.currentThread().setName("M-" + k.a("004Kefggfgej"));
                }
                boolean z2 = o.f3666e;
                if (x.b()) {
                    z2 = x.a().a(x.f3710h, o.f3666e);
                    i2 = x.a().b(x.f3711i, -1);
                } else {
                    i2 = -1;
                }
                if (i2 != -1) {
                    int unused = t.b = i2;
                }
                if (!z2 || t.b == 1) {
                    t.b(true, z);
                } else {
                    t.b(false, z);
                }
                NLog mobLog = MobLog.getInstance();
                StringBuilder sb = new StringBuilder();
                sb.append(z ? k.a("002$bfOg") : "");
                sb.append("init cfg over. py ");
                sb.append(t.b);
                mobLog.d(sb.toString(), new Object[0]);
                com.mob.tools.b.a.b.set(Boolean.FALSE);
            }
        });
    }

    public static boolean a() {
        return f3679a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final CountDownLatch countDownLatch) {
        if (c.compareAndSet(false, true)) {
            o.a(MobSDK.getContext());
            i();
            w.a();
            j();
            new com.mob.tools.utils.f("PY-C") { // from class: com.mob.commons.t.2
                @Override // com.mob.tools.utils.f
                public void a() {
                    com.mob.tools.b.a.b.set(Boolean.TRUE);
                    NLog mobLog = MobLog.getInstance();
                    mobLog.d("g lk st: " + Process.myPid(), new Object[0]);
                    boolean a2 = m.a(m.a(m.f3645g), new l(this) { // from class: com.mob.commons.t.2.1

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ AnonymousClass2 f3683a;

                        @Override // com.mob.commons.l
                        public boolean a(FileLocker fileLocker) {
                        }
                    });
                    NLog mobLog2 = MobLog.getInstance();
                    mobLog2.d("g lk res: " + a2 + Process.myPid(), new Object[0]);
                    com.mob.tools.b.a.b.set(Boolean.FALSE);
                }
            }.start();
        }
    }

    public static boolean b() {
        return !c() || b == 1;
    }

    public static void b(final boolean z) {
        b = z ? 1 : 0;
        NLog mobLog = MobLog.getInstance();
        mobLog.d("submit py: " + z, new Object[0]);
        new com.mob.tools.utils.f(k.a("004_efggfgei")) { // from class: com.mob.commons.t.4
            @Override // com.mob.tools.utils.f
            public void a() {
                x.a().a(x.f3711i, z ? 1 : 0);
                if (z) {
                    CountDownLatch g2 = t.g();
                    MobLog.getInstance().d(DH.SyncMtd.isInMainProcess() ? "main" : "sub", new Object[0]);
                    t.b(g2);
                    DH.requester(MobSDK.getContext()).getDetailNetworkTypeForStatic().request(new DH.DHResponder(this) { // from class: com.mob.commons.t.4.1

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ AnonymousClass4 f3685a;

                        @Override // com.mob.tools.utils.DH.DHResponder
                        public void onResponse(DH.DHResponse dHResponse) {
                        }
                    });
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(boolean z, String str) throws Throwable {
        HashMap<String, Object> a2 = r.a(str);
        a2.put(k.a("009QbcdechddbfBggGefAc"), String.valueOf(z));
        String httpGet = new NetworkHelper().httpGet(c.a(c.c) + k.a("036ecXbfbcTh1bdbebg,ecAcacbbcbebgMe*bdba]ba@cabfbceabdZb.bccabiGeCdeTb_bd:b_bade"), a2, NetCommunicator.getCommonDefaultHeaders());
        NLog mobLog = MobLog.getInstance();
        mobLog.d("RS sp: " + httpGet, new Object[0]);
        HashMap fromJson = HashonHelper.fromJson(httpGet);
        if (fromJson != null) {
            if ("200".equals(String.valueOf(fromJson.get(k.a("004$beca>fg"))))) {
                return;
            }
            throw new Throwable("RS code is not 200: " + httpGet);
        }
        throw new Throwable("RS is illegal: " + httpGet);
    }
}
