package com.mob.commons;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import com.umeng.analytics.pro.am;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class b {
    private static AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicBoolean f3475d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private static AtomicBoolean f3476e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private static volatile HashMap<String, Object> f3477f = null;

    /* renamed from: a  reason: collision with root package name */
    public static volatile HashSet<Class<? extends com.mob.commons.a.c>> f3474a = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private static ConcurrentHashMap<String, Object> f3478g = new ConcurrentHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private static ConcurrentHashMap<String, Object> f3479h = new ConcurrentHashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private static CountDownLatch f3480i = new CountDownLatch(1);

    /* renamed from: j  reason: collision with root package name */
    private static CountDownLatch f3481j = new CountDownLatch(1);
    public static volatile boolean b = false;

    /* renamed from: k  reason: collision with root package name */
    private static volatile boolean f3482k = false;

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicBoolean f3483l = new AtomicBoolean(false);

    public static boolean d() {
        return c();
    }

    public static ConcurrentHashMap<String, Object> e() {
        return f3478g;
    }

    public static ConcurrentHashMap<String, Object> f() {
        return f3479h;
    }

    public static ArrayList<String> g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.mob.commons.a.o.a("0043fififhgj"));
        arrayList.add(com.mob.commons.a.o.a("005'gkfififhgj"));
        arrayList.add(com.mob.commons.a.o.a("005*feBjkjUfe"));
        arrayList.add(com.mob.commons.a.o.a("009)giei)jlTed^j(elehej"));
        arrayList.add(com.mob.commons.a.o.a("010Eeeeeeeehedeihhfdelel"));
        return (ArrayList) a(com.mob.commons.a.o.a("0040geefgheh"), arrayList);
    }

    public static void h() {
        if (a()) {
            c(3);
        }
    }

    public static boolean i() {
        return d("ie");
    }

    public static boolean j() {
        return d(am.ae);
    }

    private static HashSet<Class<? extends com.mob.commons.a.c>> o() {
        HashSet<Class<? extends com.mob.commons.a.c>> hashSet = new HashSet<>();
        try {
            hashSet.add(com.mob.commons.a.a.class);
        } catch (Throwable unused) {
        }
        try {
            hashSet.add(com.mob.commons.a.b.class);
        } catch (Throwable unused2) {
        }
        try {
            hashSet.add(com.mob.commons.a.d.class);
        } catch (Throwable unused3) {
        }
        try {
            hashSet.add(com.mob.commons.a.e.class);
        } catch (Throwable unused4) {
        }
        try {
            hashSet.add(com.mob.commons.a.f.class);
        } catch (Throwable unused5) {
        }
        try {
            hashSet.add(com.mob.commons.a.g.class);
        } catch (Throwable unused6) {
        }
        try {
            hashSet.add(com.mob.commons.a.h.class);
        } catch (Throwable unused7) {
        }
        try {
            hashSet.add(com.mob.commons.a.m.class);
        } catch (Throwable unused8) {
        }
        try {
            hashSet.add(com.mob.commons.a.i.class);
        } catch (Throwable unused9) {
        }
        try {
            hashSet.add(com.mob.commons.a.j.class);
        } catch (Throwable unused10) {
        }
        try {
            hashSet.add(com.mob.commons.a.k.class);
        } catch (Throwable unused11) {
        }
        try {
            hashSet.add(com.mob.commons.a.l.class);
        } catch (Throwable unused12) {
        }
        try {
            hashSet.add(com.mob.commons.a.n.class);
        } catch (Throwable unused13) {
        }
        try {
            hashSet.add(com.mob.commons.a.p.class);
        } catch (Throwable unused14) {
        }
        try {
            hashSet.add(com.mob.commons.a.q.class);
        } catch (Throwable unused15) {
        }
        try {
            hashSet.add(com.mob.commons.a.r.class);
        } catch (Throwable unused16) {
        }
        return hashSet;
    }

    private static void p() {
        Object obj = m.f3646h;
        synchronized (obj) {
            g.a().a(10);
            obj.notifyAll();
        }
    }

    private static void q() {
        Object obj = m.f3647i;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    private static void r() {
        if (f3483l.compareAndSet(false, true)) {
            try {
                com.mob.mgs.impl.b.a();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean c() {
        return (((Integer) a(com.mob.commons.a.o.a("002Gelei"), 0)).intValue() == 1) || t.a();
    }

    private static boolean d(String str) {
        List list = (List) a(com.mob.commons.a.o.a("003d4efJi"), (Object) null);
        return (list == null || list.isEmpty() || !list.contains(str)) ? false : true;
    }

    private static boolean e(String str) {
        List list = (List) a(com.mob.commons.a.o.a("002_ehfe"), (Object) null);
        return (list == null || list.size() == 0 || !list.contains(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v20, types: [com.mob.tools.network.NetworkHelper] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.OutputStream, com.mob.commons.b$8] */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.mob.tools.network.NetworkHelper] */
    public static void f(String str) {
        String b2;
        File file;
        ?? r7;
        ?? fileOutputStream;
        File file2 = null;
        try {
            g.a().a(0);
            b2 = s.b(str);
            file = new File(MobSDK.getContext().getFilesDir(), com.mob.commons.a.o.a("003)gheheh"));
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!h.a().b()) {
                g.a().a(18);
                ResHelper.deleteFileAndFolder(file);
            } else if (TextUtils.isEmpty(b2)) {
                g.a().a(1);
                ResHelper.deleteFileAndFolder(file);
            } else if (!c()) {
                p();
            } else {
                g.a().a(2);
                HashMap hashMap = (HashMap) new NetCommunicator(1024, "9e87e8d4b8f52f2916d0fb4342aa6b54a81a05666d0bdb23cc5ebf3a07440bc3976adff1ce11c64ddcdbfc017920648217196d51e3165e780e58b5460c525ee9", "13bda4b87eb42ab9e64e6b4f3d17cf8005a4ae94af37bc9fd76ebd91a828f017c81bd63cbe2924e361e20003b9e5f47cdac1f5fba5fca05730a32c5c65869590287207e79a604a2aac429e55f0d35c211367bd226dd5e57df7810f036071854aa1061a0f34b418b9178895a531107c652a428cfa6ecfa65333580ae7e0edf0e1").requestSynchronized(r.f(), b2, false);
                g.a().a(3);
                String str2 = (String) hashMap.get(com.mob.commons.a.o.a("002Rgife"));
                String str3 = (String) hashMap.get("m");
                Boolean bool = (Boolean) hashMap.get(com.mob.commons.a.o.a("002Meggh"));
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                String str4 = (String) hashMap.get(com.mob.commons.a.o.a("002Oegek"));
                String str5 = (String) hashMap.get(com.mob.commons.a.o.a("002!ehel"));
                String str6 = (String) hashMap.get(com.mob.commons.a.o.a("002Vgiel"));
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str4)) {
                    synchronized (m.f3646h) {
                        f3478g.clear();
                        f3478g.put("h", str3);
                        f3478g.put("k", str4);
                        f3478g.put(com.mob.commons.a.o.a("0026ehel"), str5);
                        f3478g.put(com.mob.commons.a.o.a("002Ngiel"), str6);
                        String checkHttpRequestUrl = NetCommunicator.checkHttpRequestUrl(str2);
                        if (booleanValue) {
                            g.a().a(5);
                            File file3 = new File(file, com.mob.commons.a.o.a("008Gehfdelgifmgheheh"));
                            if (!file3.exists() || !str3.equals(Data.MD5(file3))) {
                                g.a().a(6);
                                ResHelper.deleteFileAndFolder(file);
                                file.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(file3);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                try {
                                    new NetworkHelper().download(checkHttpRequestUrl, fileOutputStream, null);
                                    g.a().a(7);
                                    s.a((Closeable[]) new Closeable[]{fileOutputStream});
                                } catch (Throwable th3) {
                                    th = th3;
                                    file2 = fileOutputStream;
                                    s.a((Closeable[]) new Closeable[]{file2});
                                    throw th;
                                }
                            }
                        } else {
                            g.a().a(8);
                            ResHelper.deleteFileAndFolder(file);
                            byte[][] bArr = new byte[1];
                            int[] iArr = new int[1];
                            try {
                                r7 = new ByteArrayOutputStream(bArr, iArr) { // from class: com.mob.commons.b.8

                                    /* renamed from: a  reason: collision with root package name */
                                    public final /* synthetic */ byte[][] f3495a;
                                    public final /* synthetic */ int[] b;

                                    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                                    public void close() throws IOException {
                                    }
                                };
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            try {
                                new NetworkHelper().download(checkHttpRequestUrl, r7, null);
                                g.a().a(9);
                                s.a((Closeable[]) new Closeable[]{r7});
                                f3478g.put(com.mob.commons.a.o.a("001Mgd"), bArr[0]);
                                f3478g.put(am.aB, Integer.valueOf(iArr[0]));
                            } catch (Throwable th5) {
                                th = th5;
                                file2 = r7;
                                s.a((Closeable[]) new Closeable[]{file2});
                                throw th;
                            }
                        }
                    }
                    p();
                }
                g.a().a(4);
                ResHelper.deleteFileAndFolder(file);
                p();
            }
        } catch (Throwable th6) {
            th = th6;
            file2 = file;
            if (file2 != null) {
                try {
                    ResHelper.deleteFileAndFolder(file2);
                } catch (Throwable unused) {
                }
            }
            g.a().a(2, th);
        }
    }

    public static <T> T b(String str, T t) {
        if (TextUtils.isEmpty(str)) {
            return t;
        }
        if (f3477f != null) {
            return (T) a(f3477f, str, t);
        }
        return (T) a(HashonHelper.fromJson(x.a().c()), str, t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(boolean z) {
        if (b()) {
            MobLog.getInstance().d("b db st", new Object[0]);
            e.a((MobProduct) null);
            n.a().b();
            d(z);
        }
    }

    private static synchronized void d(boolean z) {
        synchronized (b.class) {
            HashSet<Class<? extends com.mob.commons.a.c>> o2 = o();
            Iterator<Class<? extends com.mob.commons.a.c>> it = o2.iterator();
            while (it.hasNext()) {
                Class<? extends com.mob.commons.a.c> next = it.next();
                try {
                    if (!f3474a.contains(next)) {
                        com.mob.commons.a.c newInstance = next.newInstance();
                        if (z || e(newInstance.d())) {
                            if (newInstance.g()) {
                                f3474a.add(next);
                            }
                        }
                    }
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
            o2.clear();
            NLog mobLog = MobLog.getInstance();
            mobLog.d("clt(" + z + ") over", new Object[0]);
        }
    }

    public static void a(CountDownLatch countDownLatch) {
        b(countDownLatch);
    }

    public static <T> T a(String str, T t) {
        if (TextUtils.isEmpty(str) || f3477f == null) {
            return t;
        }
        if (b(f3477f)) {
            f3477f.clear();
            f3477f = new HashMap<>();
            c(2);
        }
        return (T) ResHelper.forceCast(f3477f.get(str), t);
    }

    public static boolean b() {
        return ((Integer) a(com.mob.commons.a.o.a("004Aehfdelel"), 0)).intValue() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(String str) {
        String b2;
        File file;
        File file2 = null;
        try {
            b2 = s.b(str);
            file = new File(MobSDK.getContext().getFilesDir(), com.mob.commons.a.o.a("003<ghgdfe"));
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!h.a().b()) {
                ResHelper.deleteFileAndFolder(file);
            } else if (TextUtils.isEmpty(b2)) {
                ResHelper.deleteFileAndFolder(file);
            } else if (c()) {
                HashMap<String, Object> f2 = r.f();
                f2.put(com.mob.commons.a.o.a("007kj)eigheffdel"), String.valueOf(com.mob.commons.cc.a.a()));
                ArrayList arrayList = (ArrayList) ((HashMap) new NetCommunicator(1024, "9e87e8d4b8f52f2916d0fb4342aa6b54a81a05666d0bdb23cc5ebf3a07440bc3976adff1ce11c64ddcdbfc017920648217196d51e3165e780e58b5460c525ee9", "13bda4b87eb42ab9e64e6b4f3d17cf8005a4ae94af37bc9fd76ebd91a828f017c81bd63cbe2924e361e20003b9e5f47cdac1f5fba5fca05730a32c5c65869590287207e79a604a2aac429e55f0d35c211367bd226dd5e57df7810f036071854aa1061a0f34b418b9178895a531107c652a428cfa6ecfa65333580ae7e0edf0e1").requestSynchronized(f2, b2, false)).get(com.mob.commons.a.o.a("004+feefgh^e"));
                if (arrayList != null && !arrayList.isEmpty()) {
                    synchronized (m.f3647i) {
                        f3479h.clear();
                        f3479h.put(com.mob.commons.a.o.a("002+fe5e"), arrayList);
                    }
                }
                ResHelper.deleteFileAndFolder(file);
            }
        } catch (Throwable th2) {
            th = th2;
            file2 = file;
            try {
                f.a().a(9, -1, th, "-1");
                if (file2 != null) {
                    try {
                        ResHelper.deleteFileAndFolder(file2);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
                q();
            }
        }
    }

    private static void c(int i2) {
        if (f3476e.compareAndSet(false, true)) {
            String format = String.format(com.mob.commons.a.o.a("005Zhhglijkigh"), Integer.valueOf(i2));
            if (i2 == 2) {
                v.c.execute(new com.mob.tools.utils.e(format, i2) { // from class: com.mob.commons.b.5

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ String f3491a;
                    public final /* synthetic */ int b;

                    /* renamed from: com.mob.commons.b$5$1  reason: invalid class name */
                    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
                    public class AnonymousClass1 extends com.mob.tools.utils.b<HashMap<String, Object>> {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ AnonymousClass5 f3492a;

                        public AnonymousClass1(AnonymousClass5 anonymousClass5) {
                        }

                        @Override // com.mob.tools.utils.b
                        public /* bridge */ /* synthetic */ void a(HashMap<String, Object> hashMap) {
                        }

                        /* renamed from: a  reason: avoid collision after fix types in other method */
                        public void a2(HashMap<String, Object> hashMap) {
                        }
                    }

                    @Override // com.mob.tools.utils.e
                    public void a() {
                    }
                });
                return;
            }
            if (!TextUtils.isEmpty("M-")) {
                Thread currentThread = Thread.currentThread();
                currentThread.setName("M-" + format);
            }
            try {
                b(new com.mob.tools.utils.b<HashMap<String, Object>>(i2) { // from class: com.mob.commons.b.6

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ int f3493a;

                    @Override // com.mob.tools.utils.b
                    public /* bridge */ /* synthetic */ void a(HashMap<String, Object> hashMap) {
                    }

                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void a2(HashMap<String, Object> hashMap) {
                    }
                });
            } catch (Throwable unused) {
                f3476e.set(false);
            }
            com.mob.tools.b.a.b.set(Boolean.FALSE);
        }
    }

    private static void b(CountDownLatch countDownLatch) {
        HashMap fromJson = HashonHelper.fromJson(x.a().c());
        if (b(fromJson)) {
            x.a().b((String) null);
            fromJson = null;
        }
        if (a()) {
            a((HashMap<String, Object>) fromJson, false);
            if (fromJson != null && !fromJson.isEmpty()) {
                MobLog.getInstance().d("g ch: y", new Object[0]);
                boolean z = System.currentTimeMillis() - x.a().b(x.u, 0L) < 5000;
                MobLog.getInstance().d("g ch fre: " + z, new Object[0]);
                if (!z) {
                    c(2);
                }
                if (countDownLatch != null) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        MobLog.getInstance().d("g dhs_w cdl: " + countDownLatch, new Object[0]);
                        countDownLatch.await(3500L, TimeUnit.MILLISECONDS);
                        MobLog.getInstance().d("g dhs_w end, dur: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                    } catch (Throwable th) {
                        MobLog.getInstance().d(th);
                    }
                }
                a(true, false, z, 2);
                return;
            }
            MobLog.getInstance().d("g ch: n", new Object[0]);
            c(1);
        }
    }

    private static <T> T a(HashMap<String, Object> hashMap, String str, T t) {
        return (TextUtils.isEmpty(str) || b(hashMap) || !a(hashMap)) ? t : (T) ResHelper.forceCast(hashMap.get(str), t);
    }

    public static <T> T a(String str, T t, long j2) {
        try {
            if ((f3477f == null || f3477f.isEmpty()) && f3480i.getCount() > 0) {
                if (j2 > 0) {
                    f3480i.await(j2, TimeUnit.MILLISECONDS);
                } else {
                    f3480i.await();
                }
            }
            if (!e(str) && f3481j.getCount() > 0) {
                if (j2 > 0) {
                    f3481j.await(j2, TimeUnit.MILLISECONDS);
                } else {
                    f3481j.await();
                }
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        return (T) a(str, t);
    }

    private static CountDownLatch c(HashMap<String, Object> hashMap) {
        String str = (String) ResHelper.forceCast(hashMap.get(com.mob.commons.a.o.a("0024ghgh")), null);
        CountDownLatch a2 = com.mob.tools.a.d.a(MobSDK.getContext()).a(str);
        try {
            HashMap<String, Object> hashMap2 = (HashMap) hashMap.get(com.mob.commons.a.o.a("002jm"));
            String str2 = (String) ResHelper.forceCast((String) hashMap.get(com.mob.commons.a.o.a("0029ehEi")), com.mob.commons.a.o.a("006Chlhlhmhmhmhm"));
            long longValue = ((Long) ResHelper.forceCast(hashMap.get(com.mob.commons.a.o.a("004jUeh)j@em")), 5L)).longValue();
            HashMap<String, Object> hashMap3 = (HashMap) hashMap.get(com.mob.commons.a.o.a("002Wgg>f"));
            HashMap hashMap4 = (HashMap) hashMap.get(com.mob.commons.a.o.a("004)gg@fIehMi"));
            Integer num = (Integer) hashMap.get(com.mob.commons.a.o.a("004%gg*j[fd$e"));
            HashMap hashMap5 = new HashMap();
            hashMap5.put(com.mob.commons.a.o.a("002(fdVd"), hashMap.get(com.mob.commons.a.o.a("002(fdVd")));
            hashMap5.put(com.mob.commons.a.o.a("002Tghgh"), str);
            hashMap5.put(com.mob.commons.a.o.a("002jm"), hashMap2);
            hashMap5.put(com.mob.commons.a.o.a("002KehVi"), str2);
            hashMap5.put(com.mob.commons.a.o.a("004jWeh3jRem"), Long.valueOf(longValue));
            hashMap5.put(com.mob.commons.a.o.a("004[gg1j@fdIe"), num);
            if ((hashMap2 != null && hashMap2.size() > 0 && !TextUtils.isEmpty(str2)) || (hashMap3 != null && hashMap3.size() > 0 && hashMap4 != null && hashMap4.size() > 0)) {
                a(hashMap5, hashMap, hashMap2, hashMap3, hashMap4, num, a2);
                h.a().a(hashMap, hashMap2, hashMap3);
            }
            hashMap.put(com.mob.commons.a.o.a("010ijk)efeh!jSfjefMmj"), Long.valueOf(SystemClock.elapsedRealtime()));
            a(hashMap.remove(com.mob.commons.a.o.a("011FeffefeCjAggegfehjegehgh")));
            x.a().b(HashonHelper.fromHashMap(hashMap));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        return a2;
    }

    private static boolean a(HashMap<String, Object> hashMap) {
        return hashMap == null || ((Integer) ResHelper.forceCast(hashMap.get(com.mob.commons.a.o.a("002e1fd")), 0)).intValue() == 0;
    }

    public static boolean a() {
        return ((Integer) a(com.mob.commons.a.o.a("002e]fd"), 0)).intValue() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i2) {
        MobLog.getInstance().d("b ob st", new Object[0]);
        if (a() && b()) {
            String str = (String) a(com.mob.commons.a.o.a("003]gieleh"), (Object) null);
            if (TextUtils.isEmpty(str)) {
                if (i2 == 3 || t.b()) {
                    p();
                }
            } else if (i2 == 3 || c.compareAndSet(false, true)) {
                new com.mob.tools.utils.f(com.mob.commons.a.o.a("003Mgjjjij") + i2, str) { // from class: com.mob.commons.b.1

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ String f3484a;

                    /* renamed from: com.mob.commons.b$1$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
                    public class C00861 implements l {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ AnonymousClass1 f3485a;

                        public C00861(AnonymousClass1 anonymousClass1) {
                        }

                        @Override // com.mob.commons.l
                        public boolean a(FileLocker fileLocker) {
                        }
                    }

                    @Override // com.mob.tools.utils.f
                    public void a() {
                    }
                }.start();
            }
            if (a() && b()) {
                String str2 = (String) a("sbr", (Object) null);
                if (TextUtils.isEmpty(str2)) {
                    try {
                        ResHelper.deleteFileAndFolder(new File(MobSDK.getContext().getFilesDir(), com.mob.commons.a.o.a("003Nghgdfe")));
                    } catch (Throwable unused) {
                    }
                    q();
                } else if (i2 == 3 || f3475d.compareAndSet(false, true)) {
                    new com.mob.tools.utils.f("DS-" + i2, str2) { // from class: com.mob.commons.b.2

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ String f3486a;

                        /* renamed from: com.mob.commons.b$2$1  reason: invalid class name */
                        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
                        public class AnonymousClass1 implements l {

                            /* renamed from: a  reason: collision with root package name */
                            public final /* synthetic */ AnonymousClass2 f3487a;

                            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
                            }

                            @Override // com.mob.commons.l
                            public boolean a(FileLocker fileLocker) {
                            }
                        }

                        @Override // com.mob.tools.utils.f
                        public void a() {
                        }
                    }.start();
                }
                if (MobSDK.getDomain() != InternationalDomain.DEFAULT || MobSDK.checkV6()) {
                    return;
                }
                c.a(new com.mob.tools.utils.b<Void>() { // from class: com.mob.commons.b.3
                    @Override // com.mob.tools.utils.b
                    public /* bridge */ /* synthetic */ void a(Void r1) {
                    }

                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void a2(Void r1) {
                    }
                });
                return;
            }
            q();
        } else if (i2 == 3 || t.b()) {
            p();
        }
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && a() && b() && ((Integer) a(str, 0)).intValue() != 0;
    }

    private static void a(HashMap<String, Object> hashMap, boolean z) {
        f3477f = new HashMap<>();
        if (hashMap != null) {
            f3477f.putAll(hashMap);
        }
        try {
            if (z) {
                f3480i.countDown();
                f3481j.countDown();
            } else {
                f3480i.countDown();
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(boolean z, boolean z2, boolean z3, int i2) {
        new com.mob.tools.utils.f("PY-B" + i2, z, z2, z3, i2) { // from class: com.mob.commons.b.4

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f3488a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ boolean c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ int f3489d;

            /* renamed from: com.mob.commons.b$4$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass1 implements l {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass4 f3490a;

                public AnonymousClass1(AnonymousClass4 anonymousClass4) {
                }

                @Override // com.mob.commons.l
                public boolean a(FileLocker fileLocker) {
                }
            }

            @Override // com.mob.tools.utils.f
            public void a() {
            }
        }.start();
    }

    private static void a(Object obj) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(com.mob.commons.a.o.a("0045feefgh1e"), obj);
            File dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContext(), com.mob.commons.a.o.a("005]fm1mZehfeef"));
            ResHelper.saveObjectToFile(dataCacheFile.getPath(), Data.AES128Encode(com.mob.commons.a.o.a("0160hmhlkdkjifjfjihkiigfeggdehXiSgief"), HashonHelper.fromHashMap(hashMap)));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    private static void a(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, HashMap<String, Object> hashMap4, HashMap<String, Object> hashMap5, Integer num, CountDownLatch countDownLatch) {
        if (num != null && num.intValue() == 2) {
            com.mob.tools.b.a.b.set(Boolean.FALSE);
            try {
                countDownLatch.await(3500L, TimeUnit.MILLISECONDS);
                MobLog.getInstance().d("dhs wt geot.2 ovr", new Object[0]);
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        boolean a2 = h.a().a(true);
        h.a().c().put(com.mob.commons.a.o.a("006jmJeeeiKjCgh"), Boolean.valueOf(a2));
        if (hashMap3 != null && hashMap3.size() > 0 && !a2) {
            MobLog.getInstance().d("dhs em dg", new Object[0]);
            hashMap2.clear();
            hashMap2.putAll(hashMap);
            hashMap2.putAll(hashMap3);
        } else if (hashMap4 != null && hashMap4.size() > 0 && !h.a().a(hashMap5)) {
            MobLog.getInstance().d("dhs gpe dg", new Object[0]);
            hashMap2.clear();
            hashMap2.putAll(hashMap);
            hashMap2.putAll(hashMap4);
        } else {
            hashMap2.remove(com.mob.commons.a.o.a("0028gg[f"));
            hashMap2.remove(com.mob.commons.a.o.a("002jm"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(HashMap<String, Object> hashMap, int i2) {
        if (hashMap == null) {
            HashMap<String, Object> fromJson = HashonHelper.fromJson(x.a().d());
            if (!b(fromJson)) {
                hashMap = fromJson;
            }
            x.a().e();
        }
        CountDownLatch countDownLatch = null;
        if (hashMap != null && !hashMap.isEmpty()) {
            countDownLatch = c(hashMap);
        }
        a(hashMap, true);
        com.mob.tools.b.a.b.set(Boolean.FALSE);
        r();
        if (countDownLatch == null) {
            countDownLatch = com.mob.tools.a.d.a(MobSDK.getContext()).a();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            NLog mobLog = MobLog.getInstance();
            mobLog.d("ge dhs_w cdl: " + countDownLatch, new Object[0]);
            countDownLatch.await(3500L, TimeUnit.MILLISECONDS);
            NLog mobLog2 = MobLog.getInstance();
            mobLog2.d("ge dhs_w end, dur: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        a(false, true, true, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.mob.tools.utils.b<HashMap<String, Object>> bVar) {
        com.mob.tools.b.a.b.set(Boolean.TRUE);
        DH.requester(MobSDK.getContext()).checkNetworkAvailable().getDetailNetworkTypeForStatic().request(new DH.DHResponder(bVar) { // from class: com.mob.commons.b.7

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ com.mob.tools.utils.b f3494a;

            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
            }
        });
    }

    private static boolean b(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            long longValue = ((Long) ResHelper.forceCast(hashMap.get(com.mob.commons.a.o.a("010ijkXefeh<j[fjef:mj")), 0L)).longValue();
            return longValue != 0 && SystemClock.elapsedRealtime() - longValue >= 86400000;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashMap<String, Object> b(DH.DHResponse dHResponse) {
        try {
            if (dHResponse.checkNetworkAvailable()) {
                String packageName = DH.SyncMtd.getPackageName();
                String appkey = MobSDK.getAppkey();
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put(com.mob.commons.a.o.a("003SekYjZej"), appkey);
                hashMap.put(com.mob.commons.a.o.a("013<ffghCj^eiijfh*ij0el e9efReTej"), w.f());
                hashMap.put(com.mob.commons.a.o.a("004m<fdef(i"), com.mob.tools.a.c.a(MobSDK.getContext()).b().aY());
                HashMap<String, Object> a2 = r.a(dHResponse.getDetailNetworkTypeForStatic());
                a2.put(com.mob.commons.a.o.a("002eIgh"), String.valueOf(System.currentTimeMillis()));
                int privacyGrantedStatus = MobSDK.getPrivacyGrantedStatus();
                if (privacyGrantedStatus != -1) {
                    a2.put(com.mob.commons.a.o.a("009;efghfkggei-jj(hiEf"), String.valueOf(privacyGrantedStatus == 1));
                }
                a2.put(com.mob.commons.a.o.a("002k(jf"), String.valueOf(MobSDK.checkV6() ? 1 : -1));
                String httpGet = new NetworkHelper().httpGet(c.a(c.b) + "/v6/gcf", a2, hashMap);
                HashMap fromJson = HashonHelper.fromJson(httpGet);
                if (fromJson.isEmpty()) {
                    return null;
                }
                if ("200".equals(String.valueOf(fromJson.get(com.mob.commons.a.o.a("006-ghBeHegBe!edgh"))))) {
                    byte[] rawMD5 = Data.rawMD5((appkey + ":" + packageName + ":" + fromJson.get(com.mob.commons.a.o.a("009e_efMmjKghQeQeg!mf"))).getBytes("utf-8"));
                    String str = (String) ResHelper.forceCast(fromJson.get(com.mob.commons.a.o.a("0020gheh")));
                    if (str != null) {
                        String str2 = new String(Data.AES128Decode(rawMD5, Base64.decode(str, 2)), "utf-8");
                        NLog mobLog = MobLog.getInstance();
                        mobLog.d("sw: " + str2, new Object[0]);
                        HashMap<String, Object> fromJson2 = HashonHelper.fromJson(str2);
                        if (!fromJson2.isEmpty()) {
                            fromJson2.put(com.mob.commons.a.o.a("010ijk2efeh_jZfjef_mj"), Long.valueOf(SystemClock.elapsedRealtime()));
                            x.a().c(HashonHelper.fromHashMap(fromJson2));
                            return fromJson2;
                        }
                        throw new Throwable("RS is illegal: " + httpGet);
                    }
                    throw new Throwable("RS is illegal: " + httpGet);
                }
                throw new Throwable("RS is illegal: " + httpGet);
            }
            return null;
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }
}
