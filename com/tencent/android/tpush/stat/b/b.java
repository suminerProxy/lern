package com.tencent.android.tpush.stat.b;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import com.tencent.android.tpush.data.RegisterEntity;
import com.tencent.android.tpush.service.cache.CacheManager;
import com.tencent.android.tpush.service.util.f;
import com.tencent.tpns.baseapi.base.util.Util;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpHost;
import org.json.JSONArray;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static String f9106a;
    private static String b;
    private static String c;

    /* renamed from: d  reason: collision with root package name */
    private static Random f9107d;

    /* renamed from: e  reason: collision with root package name */
    private static Map<Long, String> f9108e = new HashMap(10);

    /* renamed from: f  reason: collision with root package name */
    private static String f9109f = "";

    /* renamed from: g  reason: collision with root package name */
    private static c f9110g = null;

    /* renamed from: h  reason: collision with root package name */
    private static String f9111h = null;

    /* renamed from: i  reason: collision with root package name */
    private static long f9112i = -1;

    /* renamed from: j  reason: collision with root package name */
    private static int f9113j = 0;

    /* renamed from: k  reason: collision with root package name */
    private static String f9114k = "__MTA_FIRST_ACTIVATE__";

    /* renamed from: l  reason: collision with root package name */
    private static int f9115l = -1;

    public static String a(Context context, long j2) {
        List<ResolveInfo> a2;
        RegisterEntity registerInfoByPkgName;
        try {
            if (f9108e.containsKey(Long.valueOf(j2))) {
                return f9108e.get(Long.valueOf(j2));
            }
            if (context == null || (a2 = f.a(context)) == null) {
                return "0";
            }
            for (ResolveInfo resolveInfo : a2) {
                String str = resolveInfo.activityInfo.packageName;
                if (str != null && (registerInfoByPkgName = CacheManager.getRegisterInfoByPkgName(str)) != null && registerInfoByPkgName.accessId == j2) {
                    String str2 = registerInfoByPkgName.xgSDKVersion + "";
                    f9108e.put(Long.valueOf(registerInfoByPkgName.accessId), str2);
                    return str2;
                }
            }
            return "0";
        } catch (Throwable th) {
            f9110g.b(th);
            return "0";
        }
    }

    public static HttpHost b(Context context) {
        NetworkInfo activeNetworkInfo;
        String defaultHost;
        if (context == null) {
            return null;
        }
        try {
        } catch (Throwable th) {
            f9110g.b(th);
        }
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0 && (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null) {
            if ((activeNetworkInfo.getTypeName() == null || !activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) && activeNetworkInfo.getExtraInfo() != null && (defaultHost = Proxy.getDefaultHost()) != null && defaultHost.trim().length() > 0) {
                return new HttpHost(defaultHost, Proxy.getDefaultPort());
            }
            return null;
        }
        return null;
    }

    public static String c(Context context) {
        String str;
        if (c(f9109f)) {
            return f9109f;
        }
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f9109f = str;
        } catch (Throwable th) {
            f9110g.b(th);
        }
        if (str != null) {
            if (str.length() == 0) {
                return "unknown";
            }
            return f9109f;
        }
        return "unknown";
    }

    private static synchronized Random d() {
        Random random;
        synchronized (b.class) {
            if (f9107d == null) {
                f9107d = new Random();
            }
            random = f9107d;
        }
        return random;
    }

    public static boolean e(Context context) {
        if (f9112i < 0) {
            f9112i = d.a(context, "mta.qq.com.checktime", 0L);
        }
        return Math.abs(System.currentTimeMillis() - f9112i) > 86400000;
    }

    public static void f(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        f9112i = currentTimeMillis;
        d.b(context, "mta.qq.com.checktime", currentTimeMillis);
    }

    public static int g(Context context) {
        return d.a(context, "mta.qq.com.difftime", 0);
    }

    public static String h(Context context) {
        if (context == null) {
            return null;
        }
        return context.getClass().getName();
    }

    public static String d(Context context) {
        return Util.getCurProcessName(context);
    }

    public static long c() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar.getTimeInMillis() + 86400000;
        } catch (Throwable th) {
            f9110g.b(th);
            return System.currentTimeMillis() + 86400000;
        }
    }

    public static String a(Context context) {
        return "1.3.7.0";
    }

    public static int a() {
        return d().nextInt(Integer.MAX_VALUE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x003d -> B:37:0x0065). Please submit an issue!!! */
    public static byte[] a(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = null;
        try {
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            } catch (Throwable th) {
                th = th;
                gZIPInputStream = null;
            }
        } catch (IOException e2) {
            f9110g.b((Throwable) e2);
        }
        try {
            byte[] bArr3 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr3);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr3, 0, read);
            }
            bArr2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayInputStream.close();
            } catch (IOException e3) {
                f9110g.b((Throwable) e3);
            }
            try {
                gZIPInputStream.close();
            } catch (IOException e4) {
                f9110g.b((Throwable) e4);
            }
            byteArrayOutputStream.close();
        } catch (Throwable th2) {
            th = th2;
            try {
                f9110g.b(th);
                try {
                    byteArrayInputStream.close();
                } catch (IOException e5) {
                    f9110g.b((Throwable) e5);
                }
                if (gZIPInputStream != null) {
                    try {
                        gZIPInputStream.close();
                    } catch (IOException e6) {
                        f9110g.b((Throwable) e6);
                    }
                }
                byteArrayOutputStream.close();
                return bArr2;
            } catch (Throwable th3) {
                try {
                    byteArrayInputStream.close();
                } catch (IOException e7) {
                    f9110g.b((Throwable) e7);
                }
                if (gZIPInputStream != null) {
                    try {
                        gZIPInputStream.close();
                    } catch (IOException e8) {
                        f9110g.b((Throwable) e8);
                    }
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e9) {
                    f9110g.b((Throwable) e9);
                }
                throw th3;
            }
        }
        return bArr2;
    }

    public static String b(Context context, long j2) {
        return com.tencent.android.tpush.service.util.c.a(context).a(j2);
    }

    public static synchronized c b() {
        c cVar;
        synchronized (b.class) {
            if (f9110g == null) {
                c cVar2 = new c("XgStat");
                f9110g = cVar2;
                cVar2.a(true);
            }
            cVar = f9110g;
        }
        return cVar;
    }

    public static boolean c(String str) {
        return (str == null || str.trim().length() == 0) ? false : true;
    }

    public static long b(String str) {
        return a(str, ".", 100, 3, 0L).longValue();
    }

    public static String a(String str) {
        if (str == null) {
            return "0";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                int i2 = b2 & 255;
                if (i2 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i2));
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            f9110g.b(th);
            return "0";
        }
    }

    public static Long a(String str, String str2, int i2, int i3, Long l2) {
        if (str != null && str2 != null) {
            if (str2.equalsIgnoreCase(".") || str2.equalsIgnoreCase("|")) {
                str2 = String.format("\\%s", str2);
            }
            String[] split = str.split(str2);
            if (split.length == i3) {
                try {
                    Long l3 = 0L;
                    for (String str3 : split) {
                        l3 = Long.valueOf(i2 * (l3.longValue() + Long.valueOf(str3).longValue()));
                    }
                    return l3;
                } catch (NumberFormatException unused) {
                }
            }
        }
        return l2;
    }

    public static String a(Context context, String str) {
        if (com.tencent.android.tpush.stat.d.d()) {
            if (f9111h == null) {
                f9111h = d(context);
            }
            if (f9111h != null) {
                str = str + h.l.a.a.c.f17369e + f9111h;
            }
        }
        return Util.getKey(str);
    }

    public static int a(Context context, boolean z) {
        if (z) {
            f9113j = g(context);
        }
        return f9113j;
    }

    public static void a(Context context, int i2) {
        f9113j = i2;
        d.b(context, "mta.qq.com.difftime", i2);
    }

    public static JSONArray a(Throwable th) {
        JSONArray jSONArray = new JSONArray();
        if (th != null) {
            jSONArray.put(th.toString());
            a(jSONArray, th.getStackTrace());
        }
        return jSONArray;
    }

    public static JSONArray a(JSONArray jSONArray, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                jSONArray.put(stackTraceElement.toString());
            }
        }
        return jSONArray;
    }
}
