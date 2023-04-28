package com.mob.tools.a;

import android.content.Context;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.s;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import com.tencent.android.tpns.mqtt.MqttTopic;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f3983a;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f3984d;
    private Context b;
    private HashMap<String, Object> c;

    /* renamed from: g  reason: collision with root package name */
    private volatile File f3987g;

    /* renamed from: k  reason: collision with root package name */
    private long f3991k;

    /* renamed from: l  reason: collision with root package name */
    private long f3992l;

    /* renamed from: m  reason: collision with root package name */
    private long f3993m;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f3985e = new byte[0];

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f3986f = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    private ConcurrentLinkedQueue<CountDownLatch> f3988h = new ConcurrentLinkedQueue<>();

    /* renamed from: i  reason: collision with root package name */
    private volatile String f3989i = null;

    /* renamed from: j  reason: collision with root package name */
    private volatile int f3990j = -1;

    private d(Context context) {
        this.b = context;
    }

    private String e() {
        try {
            String str = (String) com.mob.commons.b.b(com.mob.commons.j.a("002Ehihi"), (Object) null);
            return str == null ? (String) com.mob.commons.b.b(com.mob.commons.j.a("009[hihefjgjhffg9fTfi2e"), (Object) null) : str;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    public static boolean c() {
        return f3984d;
    }

    public CountDownLatch d() {
        ConcurrentLinkedQueue<CountDownLatch> concurrentLinkedQueue = this.f3988h;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        try {
            return this.f3988h.peek();
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split(MqttTopic.MULTI_LEVEL_WILDCARD)) == null || split.length != 2) {
            return null;
        }
        return split[1];
    }

    public int b() {
        return this.f3990j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split(MqttTopic.MULTI_LEVEL_WILDCARD)) == null || split.length != 2) {
            return null;
        }
        return split[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str) {
        return (TextUtils.isEmpty(b(str)) || TextUtils.isEmpty(c(str))) ? false : true;
    }

    private void d(String str) {
        File dataCacheFile = ResHelper.getDataCacheFile(this.b, str);
        if (!dataCacheFile.exists() || dataCacheFile.length() <= 0) {
            return;
        }
        dataCacheFile.delete();
    }

    public static d a(Context context) {
        if (f3983a == null) {
            synchronized (d.class) {
                if (f3983a == null) {
                    f3983a = new d(context);
                }
            }
        }
        return f3983a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File b(File file, String str) {
        if (!file.exists()) {
            file.mkdirs();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d(str);
        return new File(file, str);
    }

    public final CountDownLatch a() {
        return a(e());
    }

    public void a(int i2) {
        this.f3990j = i2;
    }

    public final CountDownLatch a(String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            NLog mobLog = MobLog.getInstance();
            mobLog.d("dhs ofr: " + countDownLatch, new Object[0]);
            this.f3988h.offer(countDownLatch);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        v.f3698f.execute(new Runnable(this, str, countDownLatch) { // from class: com.mob.tools.a.d.1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f3994a;
            public final /* synthetic */ CountDownLatch b;
            public final /* synthetic */ d c;

            @Override // java.lang.Runnable
            public void run() {
            }
        });
        return countDownLatch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file) {
        if (this.f3987g != null && this.f3987g.exists()) {
            try {
                if (this.f3987g.delete()) {
                    MobLog.getInstance().d("dhs dof succ", new Object[0]);
                } else {
                    MobLog.getInstance().d("dhs dof fail", new Object[0]);
                }
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                MobLog.getInstance().d("dhs dof fail-e", new Object[0]);
            }
        }
        this.f3987g = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, Object> a(File file, String str) {
        String fromHashMap = HashonHelper.fromHashMap(new HashMap());
        HashMap<String, Object> hashMap = new HashMap<>();
        if (this.c == null) {
            HashMap<String, Object> hashMap2 = new HashMap<>();
            this.c = hashMap2;
            hashMap2.put("cacheMap", new ConcurrentHashMap());
            this.c.put("invokeTimesMap", new ConcurrentHashMap());
            this.c.put("expireTimeMap", new ConcurrentHashMap());
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            com.mob.commons.cc.a.a(MobSDK.getContext(), file.getAbsolutePath(), fromHashMap, hashMap, this.c);
            this.f3991k = System.currentTimeMillis() - currentTimeMillis;
            MobLog.getInstance().d(TextUtils.isEmpty(null) ? String.format("dhs l %d", Long.valueOf(this.f3991k)) : null, new Object[0]);
        } catch (Throwable th) {
            try {
                r3 = "dhs l e: " + th.getMessage();
                hashMap.clear();
                com.mob.commons.f.a().a(5, b(), th, "" + str);
                MobLog.getInstance().d(th);
            } catch (Throwable unused) {
            }
            this.f3991k = System.currentTimeMillis() - currentTimeMillis;
            if (TextUtils.isEmpty(r3)) {
                r3 = String.format("dhs l %d", Long.valueOf(this.f3991k));
            }
            MobLog.getInstance().d(r3, new Object[0]);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, File file, String str2) {
        FileOutputStream fileOutputStream;
        if (!TextUtils.isEmpty(str) && file != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String str3 = null;
            try {
                if (file.exists()) {
                    file.delete();
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
            try {
                MobLog.getInstance().d("dhs d...", new Object[0]);
                new NetworkHelper().download(str, fileOutputStream, null);
                String MD5 = Data.MD5(file);
                if (!TextUtils.equals(str2, MD5)) {
                    com.mob.commons.f.a().a(-1, 20, "", str2);
                    if (file.exists()) {
                        file.delete();
                    }
                    if (TextUtils.isEmpty(null)) {
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        this.f3992l = currentTimeMillis2;
                        str3 = String.format("dhs d %d", Long.valueOf(currentTimeMillis2));
                    }
                    MobLog.getInstance().d(str3, new Object[0]);
                    s.a(fileOutputStream);
                    return "";
                }
                if (TextUtils.isEmpty(null)) {
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                    this.f3992l = currentTimeMillis3;
                    str3 = String.format("dhs d %d", Long.valueOf(currentTimeMillis3));
                }
                MobLog.getInstance().d(str3, new Object[0]);
                s.a(fileOutputStream);
                return MD5;
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (Throwable unused) {
                }
                try {
                    str3 = "dhs d e: " + th.getMessage();
                    MobLog.getInstance().d(th);
                    com.mob.commons.f.a().a(2, b(), th, "" + str2);
                    if (TextUtils.isEmpty(str3)) {
                        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis;
                        this.f3992l = currentTimeMillis4;
                        str3 = String.format("dhs d %d", Long.valueOf(currentTimeMillis4));
                    }
                    MobLog.getInstance().d(str3, new Object[0]);
                    s.a(fileOutputStream);
                    return "";
                } catch (Throwable th3) {
                    if (TextUtils.isEmpty(str3)) {
                        long currentTimeMillis5 = System.currentTimeMillis() - currentTimeMillis;
                        this.f3992l = currentTimeMillis5;
                        str3 = String.format("dhs d %d", Long.valueOf(currentTimeMillis5));
                    }
                    MobLog.getInstance().d(str3, new Object[0]);
                    s.a(fileOutputStream);
                    throw th3;
                }
            }
        }
        return "";
    }
}
