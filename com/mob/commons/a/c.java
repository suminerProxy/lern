package com.mob.commons.a;

import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.mob.MobSDK;
import com.mob.commons.MobProduct;
import com.mob.commons.v;
import com.mob.commons.w;
import com.mob.tools.MDP;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.UIHandler;
import java.io.File;
import java.util.HashMap;
import java.util.WeakHashMap;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class c implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private static final WeakHashMap<String, Object> f3428g = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public Object f3429a;
    public int b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3430d;

    /* renamed from: e  reason: collision with root package name */
    private final long f3431e;

    /* renamed from: f  reason: collision with root package name */
    private final long f3432f;

    /* renamed from: h  reason: collision with root package name */
    private int f3433h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3434i;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static WeakHashMap<Integer, c> f3439a;

        public static /* synthetic */ c a(Class cls) {
        }

        public static /* synthetic */ void b(c cVar) {
        }

        private static synchronized void c(c cVar) {
        }

        private static synchronized void d(c cVar) {
        }

        public static /* synthetic */ void a(c cVar) {
        }

        private static synchronized c b(Class<? extends c> cls) {
        }
    }

    public c(String str, String str2) {
        this(str, 0L, str2, 0L);
    }

    public static c a(Class<? extends c> cls) {
        c a2 = a.a(cls);
        if (a2 == null) {
            try {
                return cls.newInstance();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return a2;
            }
        }
        return a2;
    }

    public abstract void a();

    public void b() {
        long k2 = k();
        if (k2 <= 0 || k2 >= 604800) {
            return;
        }
        a(k2);
    }

    public void c() {
        this.f3434i = true;
    }

    public String d() {
        return this.c;
    }

    public boolean e() {
        return ((Long) com.mob.commons.b.a(this.c, Long.valueOf(this.f3431e))).longValue() != 0 && l();
    }

    public boolean f() {
        return this.b == 0;
    }

    public boolean g() {
        return h();
    }

    public boolean h() {
        if (e()) {
            v.c.execute(this);
            return true;
        }
        return false;
    }

    public boolean i() {
        boolean a2 = com.mob.commons.b.a();
        boolean b = com.mob.commons.b.b();
        if (a2 && b) {
            boolean e2 = e();
            NLog mobLog = MobLog.getInstance();
            mobLog.d("run clt: " + getClass().getSimpleName() + ", to: " + a2 + ", conn: " + b + ", " + this.c + ": " + e2 + ", key: " + a(this.c, (String) 0) + ", gp: " + k(), new Object[0]);
            return e2;
        }
        NLog mobLog2 = MobLog.getInstance();
        mobLog2.d("run clt: " + d() + ", to: " + a2 + ", conn: " + b, new Object[0]);
        return false;
    }

    public void j() {
    }

    public long k() {
        try {
            String str = this.f3430d;
            if (str != null) {
                return Long.parseLong(String.valueOf(com.mob.commons.b.a(str, Long.valueOf(this.f3432f))));
            }
            return 0L;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return 0L;
        }
    }

    public final boolean l() {
        if ("bs,l,ol,wi,wl,ext,aa,".contains(this.c + ChineseToPinyinResource.Field.COMMA)) {
            return com.mob.commons.h.a().b();
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (i()) {
                if (!com.mob.commons.b.d()) {
                    a(60000L);
                    try {
                        j();
                        return;
                    } catch (Throwable th) {
                        MobLog.getInstance().d(th);
                        return;
                    }
                }
                a();
                if (this.f3434i) {
                    a.a(this);
                } else {
                    a.b(this);
                }
                b();
            }
            j();
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    public c(String str, long j2, String str2, long j3) {
        this.b = 0;
        this.f3433h = 2;
        this.f3434i = false;
        this.c = str;
        this.f3430d = str2;
        this.f3431e = j2;
        this.f3432f = j3;
    }

    public void a(int i2) {
        this.f3433h = i2;
    }

    public void a(long j2) {
        a(j2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(long j2, Object obj) {
        o.a().a(j2, getClass(), new Object[]{Integer.valueOf(this.b + 1), obj}, this.f3433h);
    }

    public <T> T a(String str, T t) {
        return (T) com.mob.commons.b.a(str, t);
    }

    public void a(com.mob.tools.utils.b<HashMap<String, Object>> bVar) {
        if (((Integer) a(com.mob.commons.o.b("002Wdbdc"), (String) 0)).intValue() == 1) {
            DH.requester(MobSDK.getContext()).getLocation(0, 0, true).request(new DH.DHResponder(this, bVar) { // from class: com.mob.commons.a.c.1

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ com.mob.tools.utils.b f3435a;
                public final /* synthetic */ c b;

                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                }
            });
        } else {
            bVar.a(null);
        }
    }

    public void a(long j2, String str, Object obj) {
        a(j2, str, obj, false);
    }

    public void a(long j2, String str, Object obj, boolean z) {
        a(j2, str, obj, null, z);
    }

    public void a(long j2, String str, Object obj, HashMap<String, Object> hashMap, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = j2 > 0 ? (j2 * 1000) + currentTimeMillis : currentTimeMillis;
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(com.mob.commons.o.b("004c%chLdh"), str);
        hashMap2.put(com.mob.commons.o.b("004Sdccdef)c"), obj);
        hashMap2.put(com.mob.commons.o.b("008g+ceXchcWcdLkh"), Long.valueOf(currentTimeMillis));
        if (hashMap != null && !hashMap.isEmpty()) {
            hashMap2.putAll(hashMap);
        }
        if (z) {
            a(new com.mob.tools.utils.b<HashMap<String, Object>>(this, hashMap2, j3) { // from class: com.mob.commons.a.c.2

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ HashMap f3436a;
                public final /* synthetic */ long b;
                public final /* synthetic */ c c;

                @Override // com.mob.tools.utils.b
                public /* bridge */ /* synthetic */ void a(HashMap<String, Object> hashMap3) {
                }

                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void a2(HashMap<String, Object> hashMap3) {
                }
            });
        } else {
            com.mob.commons.d.a().a(j3, hashMap2);
        }
    }

    public void a(String str, HashMap<String, Object> hashMap) {
        a(str, hashMap, false);
    }

    public void a(String str, HashMap<String, Object> hashMap, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(com.mob.commons.o.b("004cKchKdh"), str);
        if (hashMap != null) {
            hashMap2.put(com.mob.commons.o.b("004gLceYc,ce"), hashMap);
        }
        hashMap2.put(com.mob.commons.o.b("008g!ce?chc=cdLkh"), Long.valueOf(currentTimeMillis));
        if (z) {
            a(new com.mob.tools.utils.b<HashMap<String, Object>>(this, hashMap2, currentTimeMillis) { // from class: com.mob.commons.a.c.3

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ HashMap f3437a;
                public final /* synthetic */ long b;
                public final /* synthetic */ c c;

                @Override // com.mob.tools.utils.b
                public /* bridge */ /* synthetic */ void a(HashMap<String, Object> hashMap3) {
                }

                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void a2(HashMap<String, Object> hashMap3) {
                }
            });
        } else {
            com.mob.commons.d.a().a(currentTimeMillis, hashMap2);
        }
    }

    public HashMap<String, Object> a(Location location) {
        if (location != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("accmt", Float.valueOf(location.getAccuracy()));
            if (Build.VERSION.SDK_INT >= 26 && location.hasVerticalAccuracy()) {
                hashMap.put("vacmt", Float.valueOf(location.getVerticalAccuracyMeters()));
            }
            hashMap.put("ltdmt", Double.valueOf(location.getLatitude()));
            hashMap.put("lndmt", Double.valueOf(location.getLongitude()));
            hashMap.put(com.mob.commons.o.b("005^dcXc_cdUkh"), Long.valueOf(location.getTime()));
            hashMap.put("prvmt", location.getProvider());
            hashMap.put("atdmt", Double.valueOf(location.getAltitude()));
            hashMap.put("brmt", Float.valueOf(location.getBearing()));
            hashMap.put("spmt", Float.valueOf(location.getSpeed()));
            return hashMap;
        }
        return null;
    }

    public static void a(String str, File file, String str2, String str3) throws Throwable {
        Object obj;
        Object invokeInstanceMethod = ReflectHelper.invokeInstanceMethod(MobSDK.getContext(), com.mob.commons.o.b("014Dee%hcXffdcceefefdjdbce9ghPcg"), new Object[0]);
        ReflectHelper.importClass(com.mob.commons.o.b("028g8cedc.iTcdcidkefchef$chk9dkeh2hZckffdcceefefdjdbceVghFcg"), com.mob.commons.o.b("028g8cedc.iTcdcidkefchef$chk9dkeh2hZckffdcceefefdjdbceVghFcg"));
        File parentFile = file.getParentFile();
        WeakHashMap<String, Object> weakHashMap = f3428g;
        synchronized (weakHashMap) {
            obj = weakHashMap.get(str);
            if (obj == null) {
                obj = ReflectHelper.newInstance(com.mob.commons.o.b("028gOcedc@i,cdcidkefchef'chk!dkeh,h9ckffdcceefefdjdbce<ghWcg"), file.getAbsolutePath(), parentFile.getAbsolutePath(), parentFile.getAbsolutePath(), invokeInstanceMethod);
                weakHashMap.put(str, obj);
            }
        }
        ResHelper.deleteFileAndFolder(parentFile);
        String a2 = com.mob.commons.e.a((MobProduct) null);
        Object invokeInstanceMethod2 = ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeInstanceMethod(obj, com.mob.commons.o.b("0098dcdbceSg;ffdcceefef"), str2), com.mob.commons.o.b("009-eeChcIfh>hcb[db,g"), str3, String.class);
        HashMap hashMap = new HashMap();
        hashMap.put(com.mob.commons.o.b("004g8cbcd%g"), a2);
        hashMap.put(com.mob.commons.o.b("004k^dbcdYg"), com.mob.tools.a.c.a(MobSDK.getContext()).b().aX());
        hashMap.put(com.mob.commons.o.b("010Sef>gTcife$hXcgefcddbcj"), Integer.valueOf(MobSDK.SDK_VERSION_CODE));
        hashMap.put(com.mob.commons.o.b("006[ce9ddZgi]hXch"), MobSDK.getAppkey());
        hashMap.put(com.mob.commons.o.b("009GceDdd-dgAh>cfcg.hc"), MobSDK.getAppSecret());
        hashMap.put(com.mob.commons.o.b("006g;db7kCcecdcj"), MobSDK.getDomain().getDomain());
        hashMap.put(com.mob.commons.o.b("010GegdbcgcfOhEgc0ccdCef"), Boolean.valueOf(MobSDK.checkForceHttps()));
        hashMap.put(com.mob.commons.o.b("004hDcf)hDck"), Long.valueOf(((Long) com.mob.commons.b.a(com.mob.commons.o.b("004hWcf1h$ck"), 5L)).longValue()));
        hashMap.put(com.mob.commons.o.b("002Rcf<g"), (String) com.mob.commons.b.a(com.mob.commons.o.b("002UcfHg"), com.mob.commons.o.b("006>fjfjfkfkfkfk")));
        hashMap.put("usridt", w.d());
        hashMap.put("mdp", MDP.class.getName());
        String fromHashMap = HashonHelper.fromHashMap(hashMap);
        ReflectHelper.invokeInstanceMethod(invokeInstanceMethod2, com.mob.commons.o.b("013!efDhcAdicfcfUh(efefcdebdc+h"), Boolean.TRUE);
        com.mob.commons.g.a().a(15);
        UIHandler.sendEmptyMessage(0, new Handler.Callback(invokeInstanceMethod2, fromHashMap) { // from class: com.mob.commons.a.c.4

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Object f3438a;
            public final /* synthetic */ String b;

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        });
    }
}
