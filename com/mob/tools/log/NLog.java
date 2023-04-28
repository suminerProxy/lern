package com.mob.tools.log;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.mob.commons.j;
import com.mob.commons.n;
import com.mob.tools.b;
import com.mob.tools.proguard.ClassKeeper;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class NLog implements ClassKeeper, PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, NLog> f4424a = new HashMap<>();
    private static final HashMap<String, String> b = new HashMap<>();
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private int f4425d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4426e;

    static {
        b.a();
    }

    public NLog() {
        this.f4426e = false;
        this.c = null;
        this.f4425d = -1;
    }

    private String a(Throwable th) {
        try {
            return Log.getStackTraceString(th);
        } catch (Throwable th2) {
            if (th2 instanceof OutOfMemoryError) {
                return j.a("023RhhJkf6gj^fBfhfiflgkfjfhfiTkGgjWf'fjfgfmhhkegegeVn");
            }
            return th2.getMessage();
        }
    }

    private String b(Throwable th) {
        try {
            String name = th.getClass().getName();
            String c = c(th);
            String stackTraceElement = th.getStackTrace().length > 0 ? th.getStackTrace()[0].toString() : "";
            Throwable th2 = th;
            while (th2 != null && th2.getCause() != null) {
                th2 = th2.getCause();
            }
            if (th2 != null && th2 != th) {
                return name + ":" + c + "\n" + stackTraceElement + "\n......\nCaused by:\n" + a(th2);
            }
            return a(th);
        } catch (Throwable unused) {
            return a(th);
        }
    }

    private static String c(Throwable th) {
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return "";
        }
        if (message.length() <= 1000) {
            return message;
        }
        return message.substring(0, 1000) + "\n[Message over limit size:1000, cut!]";
    }

    public static NLog getInstance(String str, int i2, String str2) {
        NLog nLog;
        HashMap<String, NLog> hashMap = f4424a;
        synchronized (hashMap) {
            nLog = hashMap.get(str);
            if (nLog == null) {
                nLog = new NLog(str, i2);
                b.put(str, str2);
                hashMap.put(str, nLog);
            }
        }
        return nLog;
    }

    public static NLog getInstanceForSDK(String str, boolean z) {
        return getInstance(str);
    }

    public static void setCollector(String str, LogCollector logCollector) {
        getInstance(str).setCollector(logCollector);
    }

    public final void crash(Throwable th) {
        a(6, 1, b(th));
    }

    public final int d(Throwable th) {
        return log(3, th);
    }

    public final void dg() {
        this.f4426e = true;
    }

    public final int e(Throwable th) {
        return log(6, th);
    }

    public final void error(Throwable th) {
        error(a(th));
    }

    public final int i(Throwable th) {
        return log(4, th);
    }

    public final int log(int i2, Throwable th) {
        return a(i2, 0, a(th));
    }

    public NLog setCollector(LogCollector logCollector) {
        return this;
    }

    public final int v(Throwable th) {
        return log(2, th);
    }

    public final int w(Throwable th) {
        return log(5, th);
    }

    public final int d(Object obj, Object... objArr) {
        return log(3, obj, objArr);
    }

    public final int e(Throwable th, Object obj, Object... objArr) {
        return log(6, th, obj, objArr);
    }

    public final void error(String str) {
        a(6, 2, str);
    }

    public final int i(Throwable th, Object obj, Object... objArr) {
        return log(4, th, obj, objArr);
    }

    public final int log(int i2, Object obj, Object... objArr) {
        String obj2 = obj.toString();
        if (objArr.length > 0) {
            obj2 = String.format(obj2, objArr);
        }
        return a(i2, 0, obj2);
    }

    public final int v(Object obj, Object... objArr) {
        return log(2, obj, objArr);
    }

    public final int w(Object obj, Object... objArr) {
        return log(5, obj, objArr);
    }

    public final int d(Throwable th, Object obj, Object... objArr) {
        return log(3, th, obj, objArr);
    }

    public final int e(Object obj, Object... objArr) {
        return log(6, obj, objArr);
    }

    public final int i(Object obj, Object... objArr) {
        return log(4, obj, objArr);
    }

    public final int v(Throwable th, Object obj, Object... objArr) {
        return log(2, th, obj, objArr);
    }

    public final int w(Throwable th, Object obj, Object... objArr) {
        return log(5, th, obj, objArr);
    }

    public final int e(String str) {
        return log(6, str, new Object[0]);
    }

    public final int i(String str) {
        return log(4, str, new Object[0]);
    }

    public final int w(String str) {
        return log(5, str, new Object[0]);
    }

    private NLog(String str, int i2) {
        this.f4426e = false;
        this.c = str;
        this.f4425d = i2;
    }

    private int a(int i2, int i3, String str) {
        String str2;
        try {
            str2 = Process.myPid() + HelpFormatter.DEFAULT_OPT_PREFIX + Process.myTid() + ChineseToPinyinResource.Field.LEFT_BRACKET + Thread.currentThread().getName() + ") " + str;
        } catch (Throwable unused) {
            str2 = str;
        }
        try {
            if (i3 == 1) {
                String str3 = this.c;
                int i4 = this.f4425d;
                HashMap<String, String> hashMap = b;
                if (!hashMap.isEmpty()) {
                    NLog nLog = null;
                    Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<String, String> next = it.next();
                        if (next.getValue() != null && str.contains(next.getValue())) {
                            nLog = f4424a.get(next.getKey());
                            break;
                        }
                    }
                    if (nLog != null) {
                        str3 = nLog.c;
                        i4 = nLog.f4425d;
                    }
                }
                n.a().a(1, str3, i4, str2);
            } else if (i3 == 2) {
                n.a().a(2, this.c, this.f4425d, str2);
            }
            n.a().a(i2, str2);
            return 0;
        } catch (Throwable unused2) {
            return 0;
        }
    }

    public final int log(int i2, Throwable th, Object obj, Object... objArr) {
        String obj2 = obj.toString();
        StringBuilder sb = new StringBuilder();
        if (objArr.length > 0) {
            obj2 = String.format(obj2, objArr);
        }
        sb.append(obj2);
        sb.append('\n');
        sb.append(a(th));
        return a(i2, 0, sb.toString());
    }

    @Deprecated
    public static NLog getInstance(String str) {
        NLog nLog;
        HashMap<String, NLog> hashMap = f4424a;
        synchronized (hashMap) {
            nLog = hashMap.get(str);
            if (nLog == null) {
                nLog = new NLog(str, -1);
                b.put(str, null);
                hashMap.put(str, nLog);
            }
        }
        return nLog;
    }
}
