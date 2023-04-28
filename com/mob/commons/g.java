package com.mob.commons;

import android.os.Message;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f3614a = com.mob.commons.a.o.a("004Wfm?i4ejfe");
    private static g b;
    private NetCommunicator c;

    /* renamed from: f  reason: collision with root package name */
    private String f3617f;

    /* renamed from: h  reason: collision with root package name */
    private Runnable f3619h;

    /* renamed from: d  reason: collision with root package name */
    private SimpleDateFormat f3615d = new SimpleDateFormat(com.mob.commons.a.o.a("025UejejejejijhjhjijCii$jdieie9gmmg.ghghfmfififijdhd"));

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, Object> f3616e = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private int f3618g = -1;

    private g() {
        this.f3617f = null;
        try {
            this.f3617f = UUID.randomUUID().toString();
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        this.f3619h = new com.mob.tools.utils.e(this) { // from class: com.mob.commons.g.1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f3620a;

            @Override // com.mob.tools.utils.e
            public void a() {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        boolean z;
        File[] listFiles;
        if (this.f3616e.size() > 0) {
            z = a(this.f3616e);
            if (!z) {
                c(this.f3616e);
            }
            this.f3616e.clear();
        } else {
            z = true;
        }
        if (z) {
            File e2 = e();
            if (!e2.exists() || !e2.isDirectory() || (listFiles = e2.listFiles()) == null || listFiles.length <= 0) {
                return;
            }
            for (File file : listFiles) {
                if (a((HashMap) ResHelper.readObjectFromFile(file.getAbsolutePath())) && !file.delete()) {
                    file.delete();
                }
            }
        }
    }

    private void d() {
        if (this.c == null) {
            this.c = new NetCommunicator(1024, "ab0a0a6473d1891d388773574764b239d4ad80cb2fd3a83d81d03901c1548c13fee7c9692c326e6682b239d4c5d0021d1b607642c47ec29f10b0602908c3e6c9", "23c3c8cb41c47dd288cc7f4c218fbc7c839a34e0a0d1b2130e87b7914936b120a2d6570ee7ac66282328d50f2acfd82f2259957c89baea32547758db05de9cd7c6822304c8e45742f24bbbe41c1e12f09e18c6fab4d078065f2e5aaed94c900c66e8bbf8a120eefa7bd1fb52114d529250084f5f6f369ed4ce9645978dd30c51");
        }
    }

    private File e() {
        return new File(ResHelper.getDataCache(MobSDK.getContext()), f3614a);
    }

    private synchronized int b() {
        return this.f3618g;
    }

    public static synchronized g a() {
        g gVar;
        synchronized (g.class) {
            if (b == null) {
                b = new g();
            }
            gVar = b;
        }
        return gVar;
    }

    private boolean b(HashMap<String, Object> hashMap) throws Throwable {
        if (hashMap == null || hashMap.isEmpty()) {
            return true;
        }
        HashMap<String, Object> f2 = r.f();
        f2.put(com.mob.commons.a.o.a("006j%eieifdeigh"), hashMap);
        d();
        HashMap hashMap2 = (HashMap) this.c.requestSynchronized(f2, c.a(c.f3530f) + com.mob.commons.a.o.a("004hiGeife"), false);
        return hashMap2 == null || hashMap2.isEmpty();
    }

    private void d(HashMap<String, Object> hashMap) throws Throwable {
        File[] listFiles;
        File e2 = e();
        if (!e2.exists() || !e2.isDirectory()) {
            e2.delete();
            e2.mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        String str = f3614a;
        sb.append(str);
        sb.append(h.l.a.a.c.f17369e);
        int i2 = 0;
        sb.append(0);
        File file = new File(e2, sb.toString());
        if (file.exists() && (listFiles = e2.listFiles()) != null && listFiles.length > 0) {
            file = new File(e2, str + h.l.a.a.c.f17369e + 0);
            while (file.exists()) {
                i2++;
                file = new File(e2, f3614a + h.l.a.a.c.f17369e + i2);
            }
        }
        ResHelper.saveObjectToFile(file.getPath(), hashMap);
    }

    public synchronized void a(int i2) {
        this.f3618g = i2;
        if (i2 != 1 && i2 != 4 && i2 != 17 && i2 != 18 && i2 != 19 && i2 != 20 && i2 != 10) {
        }
    }

    public synchronized void a(int i2, Throwable th) {
        a(i2, b(), th, null, "-99");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private synchronized void a(int i2, int i3, Throwable th, String str, String str2) {
        if (th == null) {
            MobLog.getInstance().d(str, new Object[0]);
        } else {
            MobLog.getInstance().d(th);
        }
        if (e.a()) {
            return;
        }
        Message message = new Message();
        message.what = 1;
        Object[] objArr = new Object[5];
        objArr[0] = Long.valueOf(System.currentTimeMillis());
        if (th == null) {
            th = str;
        }
        objArr[1] = th;
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(i3);
        objArr[4] = str2;
        message.obj = objArr;
        v.f3696d.execute(new com.mob.tools.utils.e(this, message) { // from class: com.mob.commons.g.2

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Message f3621a;
            public final /* synthetic */ g b;

            @Override // com.mob.tools.utils.e
            public void a() {
            }
        });
    }

    private void c(HashMap<String, Object> hashMap) {
        try {
            d(hashMap);
        } catch (Throwable th) {
            try {
                d(hashMap);
            } catch (Throwable unused) {
                MobLog.getInstance().d(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        String valueOf;
        if (this.f3616e.size() > 10) {
            c(this.f3616e);
            this.f3616e.clear();
        }
        Object[] objArr = (Object[]) message.obj;
        this.f3616e.put(com.mob.commons.a.o.a("002.ghBi"), this.f3617f);
        ArrayList arrayList = (ArrayList) this.f3616e.get(com.mob.commons.a.o.a("004$feefgh^e"));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.mob.commons.a.o.a("002Eeh$e"), objArr[0]);
        if (objArr[1] instanceof Throwable) {
            valueOf = a((Throwable) objArr[1]);
        } else {
            valueOf = String.valueOf(objArr[1]);
        }
        if (!TextUtils.isEmpty(valueOf)) {
            valueOf = valueOf.replaceAll("\r\n\t", " ").replaceAll("\n\t", " ").replaceAll("\n", " ");
        }
        String a2 = com.mob.commons.a.o.a("002m2gg");
        hashMap.put(a2, "[" + this.f3615d.format(objArr[0]) + "][" + objArr[2] + "][" + objArr[3] + "][" + objArr[4] + "] " + valueOf);
        hashMap.put(com.mob.commons.a.o.a("002je"), objArr[2]);
        hashMap.put(com.mob.commons.a.o.a("002fCfd"), objArr[3]);
        arrayList.add(hashMap);
        this.f3616e.put(com.mob.commons.a.o.a("004GfeefghGe"), arrayList);
        if (e.a()) {
            return;
        }
        DH.requester(MobSDK.getContext()).checkNetworkAvailable().request(new DH.DHResponder(this) { // from class: com.mob.commons.g.3

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f3622a;

            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
            }
        });
    }

    private boolean a(HashMap<String, Object> hashMap) {
        try {
            return b(hashMap);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            try {
                return b(hashMap);
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #1 {all -> 0x0049, blocks: (B:18:0x002f, B:20:0x0033, B:24:0x003f), top: B:38:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f A[Catch: all -> 0x0049, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0049, blocks: (B:18:0x002f, B:20:0x0033, B:24:0x003f), top: B:38:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(java.lang.Throwable r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            if (r5 != 0) goto L5
            return r0
        L5:
            r1 = 0
            r2 = r5
        L7:
            if (r2 == 0) goto L13
            boolean r3 = r2 instanceof java.net.UnknownHostException     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto Le
            return r0
        Le:
            java.lang.Throwable r2 = r2.getCause()     // Catch: java.lang.Throwable -> L2e
            goto L7
        L13:
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            r5.printStackTrace(r1)     // Catch: java.lang.Throwable -> L2b
            r1.flush()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L2b
            r0.close()     // Catch: java.lang.Throwable -> L2a
        L2a:
            return r5
        L2b:
            r5 = move-exception
            r1 = r0
            goto L2f
        L2e:
            r5 = move-exception
        L2f:
            boolean r0 = r5 instanceof java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L3f
            java.lang.String r5 = "0233gg:je-fi+eHegehekfjeiegeh9jBfiDeMeiefelggjdfdfdRm"
            java.lang.String r5 = com.mob.commons.a.o.a(r5)     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L3e
            r1.close()     // Catch: java.lang.Throwable -> L3e
        L3e:
            return r5
        L3f:
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.lang.Throwable -> L48
        L48:
            return r5
        L49:
            r5 = move-exception
            if (r1 == 0) goto L4f
            r1.close()     // Catch: java.lang.Throwable -> L4f
        L4f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.g.a(java.lang.Throwable):java.lang.String");
    }
}
