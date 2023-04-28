package com.mob.commons;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.UIHandler;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class s {

    /* renamed from: com.mob.commons.s$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3678a;

        static {
            int[] iArr = new int[InternationalDomain.values().length];
            f3678a = iArr;
            try {
                iArr[InternationalDomain.JP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3678a[InternationalDomain.US.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static Context a() {
        try {
            return b();
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static Context b() {
        try {
            Object c = c();
            if (c != null) {
                return (Context) ReflectHelper.invokeInstanceMethod(c, com.mob.commons.a.o.a("014=ggVje4fk.ffEfeefeheg>e4effdel"), new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static Object c() {
        Object a2;
        final ReflectHelper.a<Void, Object> aVar = new ReflectHelper.a<Void, Object>() { // from class: com.mob.commons.s.1
            @Override // com.mob.tools.utils.ReflectHelper.a
            public Object a(Void r3) {
                try {
                    return ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(com.mob.commons.a.o.a("026FegelQi=eifdef+iPfmeg>ff.fmfkeh^e3ef^k^efOeLejfj_d'eiBj5eg'i")), com.mob.commons.a.o.a("021Mehedeiei'j2elFeTfkehBe6efXkMef2eZejfj$d:eiQj2egNi"), new Object[0]);
                } catch (Throwable th) {
                    MobLog.getInstance().w(th);
                    return null;
                }
            }
        };
        if ((Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId() || Build.VERSION.SDK_INT >= 18) && (a2 = aVar.a(null)) != null) {
            return a2;
        }
        final Object obj = new Object();
        final Object[] objArr = new Object[1];
        synchronized (obj) {
            UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.commons.s.2
                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:10:0x001a
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
                    */
                @Override // android.os.Handler.Callback
                public boolean handleMessage(android.os.Message r5) {
                    /*
                        r4 = this;
                        java.lang.Object r5 = r1
                        monitor-enter(r5)
                        r0 = 0
                        java.lang.Object[] r1 = r2     // Catch: java.lang.Throwable -> L20
                        com.mob.tools.utils.ReflectHelper$a r2 = r3     // Catch: java.lang.Throwable -> L20
                        r3 = 0
                        java.lang.Object r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L20
                        r1[r0] = r2     // Catch: java.lang.Throwable -> L20
                        java.lang.Object r1 = r1     // Catch: java.lang.Throwable -> L15
                        r1.notify()     // Catch: java.lang.Throwable -> L15
                        goto L34
                    L15:
                        r1 = move-exception
                        com.mob.tools.log.NLog r2 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L1e
                    L1a:
                        r2.w(r1)     // Catch: java.lang.Throwable -> L1e
                        goto L34
                    L1e:
                        r0 = move-exception
                        goto L46
                    L20:
                        r1 = move-exception
                        com.mob.tools.log.NLog r2 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L36
                        r2.w(r1)     // Catch: java.lang.Throwable -> L36
                        java.lang.Object r1 = r1     // Catch: java.lang.Throwable -> L2e
                        r1.notify()     // Catch: java.lang.Throwable -> L2e
                        goto L34
                    L2e:
                        r1 = move-exception
                        com.mob.tools.log.NLog r2 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L1e
                        goto L1a
                    L34:
                        monitor-exit(r5)     // Catch: java.lang.Throwable -> L1e
                        return r0
                    L36:
                        r0 = move-exception
                        java.lang.Object r1 = r1     // Catch: java.lang.Throwable -> L3d
                        r1.notify()     // Catch: java.lang.Throwable -> L3d
                        goto L45
                    L3d:
                        r1 = move-exception
                        com.mob.tools.log.NLog r2 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L1e
                        r2.w(r1)     // Catch: java.lang.Throwable -> L1e
                    L45:
                        throw r0     // Catch: java.lang.Throwable -> L1e
                    L46:
                        monitor-exit(r5)     // Catch: java.lang.Throwable -> L1e
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.s.AnonymousClass2.handleMessage(android.os.Message):boolean");
                }
            });
            obj.wait();
        }
        return objArr[0];
    }

    public static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
        }
    }

    public static String b(String str) {
        Uri parse;
        String scheme;
        String str2;
        try {
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        boolean checkForceHttps = MobSDK.checkForceHttps();
        if (checkForceHttps || (Build.VERSION.SDK_INT >= 23 && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted())) {
            str = str.trim();
            if (str.startsWith(com.mob.commons.a.o.a("007deefghh")) && (parse = Uri.parse(str.trim())) != null && (scheme = parse.getScheme()) != null && scheme.equals(com.mob.commons.a.o.a("004deef"))) {
                String host = parse.getHost();
                String path = parse.getPath();
                String query = parse.getQuery();
                String str3 = "";
                if (host != null) {
                    int port = parse.getPort();
                    StringBuilder sb = new StringBuilder();
                    sb.append(host);
                    if (port > 0 && port != 80) {
                        str2 = ":" + port;
                        sb.append(str2);
                        host = sb.toString();
                        if (!checkForceHttps && Build.VERSION.SDK_INT >= 24 && ((Boolean) ReflectHelper.invokeInstanceMethod(NetworkSecurityPolicy.getInstance(), com.mob.commons.a.o.a("027CefghhhfeEj+egei*ej0emCeVfjeieggigiefehhi^jPei'm,efLeeji"), host)).booleanValue()) {
                            return str;
                        }
                    }
                    str2 = "";
                    sb.append(str2);
                    host = sb.toString();
                    if (!checkForceHttps) {
                        return str;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https://");
                sb2.append(host);
                if (path == null) {
                    path = "";
                }
                sb2.append(path);
                if (query != null) {
                    str3 = "?" + query;
                }
                sb2.append(str3);
                return sb2.toString();
            }
        }
        return str;
    }

    public static void a(final com.mob.tools.utils.b<ArrayList<HashMap<String, Object>>> bVar) {
        DH.requester(MobSDK.getContext()).getAvailableWifiListOneKey().getBssid().request(new DH.DHResponder() { // from class: com.mob.commons.s.3
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                ArrayList arrayList = new ArrayList();
                try {
                    ArrayList<HashMap<String, Object>> availableWifiListOneKey = dHResponse.getAvailableWifiListOneKey();
                    if (availableWifiListOneKey != null && !availableWifiListOneKey.isEmpty()) {
                        ArrayList<String> g2 = b.g();
                        if (g2 != null && !g2.isEmpty()) {
                            String bssid = dHResponse.getBssid();
                            Iterator<HashMap<String, Object>> it = availableWifiListOneKey.iterator();
                            while (it.hasNext()) {
                                HashMap<String, Object> next = it.next();
                                Object obj = next.get(com.mob.commons.a.o.a("0051gkfififhgj"));
                                if (obj != null && String.valueOf(obj).equals(bssid)) {
                                    next.put(com.mob.commons.a.o.a("0108eeeeeeehedeihhfdelel"), Boolean.TRUE);
                                    bssid = null;
                                }
                                HashMap hashMap = new HashMap();
                                Iterator<String> it2 = g2.iterator();
                                while (it2.hasNext()) {
                                    String next2 = it2.next();
                                    Object obj2 = next.get(next2);
                                    if (obj2 != null) {
                                        hashMap.put(next2, obj2);
                                    }
                                }
                                arrayList.add(hashMap);
                            }
                        }
                        com.mob.tools.utils.b.this.a(null);
                        return;
                    }
                } catch (Throwable th) {
                    MobLog.getInstance().w(th);
                }
                com.mob.tools.utils.b bVar2 = com.mob.tools.utils.b.this;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                bVar2.a(arrayList);
            }
        });
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = "";
        if (str.startsWith(com.mob.commons.a.o.a("007deefghh"))) {
            str = str.replace(com.mob.commons.a.o.a("007deefghh"), "");
        }
        if (str.startsWith("https://")) {
            str = str.replace("https://", "");
        }
        if (MobSDK.checkV6()) {
            str2 = com.mob.commons.a.o.a("002kNjf");
        } else {
            int i2 = AnonymousClass4.f3678a[MobSDK.getDomain().ordinal()];
            if (i2 == 1) {
                str2 = "jp";
            } else if (i2 == 2) {
                str2 = com.mob.commons.a.o.a("002+edgh");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return b(com.mob.commons.a.o.a("007deefghh") + str);
        }
        if (str.startsWith(str2 + ".")) {
            return b(com.mob.commons.a.o.a("007deefghh") + str);
        }
        return b(com.mob.commons.a.o.a("007deefghh") + str2 + HelpFormatter.DEFAULT_OPT_PREFIX + str);
    }

    public static String a(String str, int i2) {
        int parseInt;
        int i3 = 0;
        int i4 = 3;
        if (str.startsWith("00")) {
            parseInt = Integer.parseInt(str.substring(2, 3));
        } else if (str.startsWith("0")) {
            parseInt = Integer.parseInt(str.substring(1, 3));
        } else {
            parseInt = Integer.parseInt(str.substring(0, 3));
        }
        char[] charArray = str.toCharArray();
        int[] iArr = new int[parseInt];
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (i4 < charArray.length) {
            if (charArray[i4] < 'a') {
                z = !z;
            } else {
                if (z) {
                    iArr[i3] = charArray[i4] - i2;
                } else {
                    iArr[i3] = (charArray[i4] - i2) * 10;
                    i4++;
                    iArr[i3] = iArr[i3] + (charArray[i4] - i2);
                }
                sb.append(iArr[i3]);
                i3++;
            }
            i4++;
        }
        return d.a(iArr);
    }
}
