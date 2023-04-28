package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class ao {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9715a = true;
    public static boolean b = true;
    private static SimpleDateFormat c = null;

    /* renamed from: d  reason: collision with root package name */
    private static int f9716d = 30720;

    /* renamed from: e  reason: collision with root package name */
    private static StringBuilder f9717e;

    /* renamed from: f  reason: collision with root package name */
    private static StringBuilder f9718f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f9719g;

    /* renamed from: h  reason: collision with root package name */
    private static a f9720h;

    /* renamed from: i  reason: collision with root package name */
    private static String f9721i;

    /* renamed from: j  reason: collision with root package name */
    private static String f9722j;

    /* renamed from: k  reason: collision with root package name */
    private static Context f9723k;

    /* renamed from: l  reason: collision with root package name */
    private static String f9724l;

    /* renamed from: m  reason: collision with root package name */
    private static boolean f9725m;

    /* renamed from: n  reason: collision with root package name */
    private static boolean f9726n;

    /* renamed from: o  reason: collision with root package name */
    private static ExecutorService f9727o;

    /* renamed from: p  reason: collision with root package name */
    private static int f9728p;
    private static final Object q = new Object();

    static {
        try {
            c = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable th) {
            al.b(th.getCause());
        }
    }

    public static synchronized void a(Context context) {
        synchronized (ao.class) {
            if (f9725m || context == null || !b) {
                return;
            }
            try {
                f9727o = Executors.newSingleThreadExecutor();
                f9718f = new StringBuilder(0);
                f9717e = new StringBuilder(0);
                f9723k = context;
                aa a2 = aa.a(context);
                f9721i = a2.f9652d;
                a2.getClass();
                f9722j = "";
                f9724l = f9723k.getFilesDir().getPath() + "/buglylog_" + f9721i + h.l.a.a.c.f17369e + f9722j + ".txt";
                f9728p = Process.myPid();
            } catch (Throwable unused) {
            }
            f9725m = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(String str, String str2, String str3) {
        q qVar;
        try {
            aa b2 = aa.b();
            if (b2 == null || (qVar = b2.N) == null) {
                return false;
            }
            return qVar.appendLogToNative(str, str2, str3);
        } catch (Throwable th) {
            if (al.a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void e(String str, String str2, String str3) {
        synchronized (ao.class) {
            if (f9715a) {
                f(str, str2, str3);
            } else {
                g(str, str2, str3);
            }
        }
    }

    private static synchronized void f(String str, String str2, String str3) {
        synchronized (ao.class) {
            String a2 = a(str, str2, str3, Process.myTid());
            synchronized (q) {
                f9718f.append(a2);
                if (f9718f.length() >= f9716d) {
                    StringBuilder sb = f9718f;
                    f9718f = sb.delete(0, sb.indexOf("\u0001\r\n") + 1);
                }
            }
        }
    }

    private static synchronized void g(String str, String str2, String str3) {
        synchronized (ao.class) {
            String a2 = a(str, str2, str3, Process.myTid());
            synchronized (q) {
                try {
                    f9718f.append(a2);
                } catch (Throwable unused) {
                }
                if (f9718f.length() <= f9716d) {
                    return;
                }
                if (f9719g) {
                    return;
                }
                f9719g = true;
                a aVar = f9720h;
                if (aVar == null) {
                    f9720h = new a(f9724l);
                } else {
                    File file = aVar.b;
                    if (file == null || file.length() + f9718f.length() > f9720h.c) {
                        f9720h.a();
                    }
                }
                if (f9720h.a(f9718f.toString())) {
                    f9718f.setLength(0);
                    f9719g = false;
                }
            }
        }
    }

    private static String b() {
        q qVar;
        try {
            aa b2 = aa.b();
            if (b2 == null || (qVar = b2.N) == null) {
                return null;
            }
            return qVar.getLogFromNative();
        } catch (Throwable th) {
            if (al.a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    private static byte[] c() {
        File file;
        if (b) {
            if (f9726n) {
                al.a("[LogUtil] Get user log from native.", new Object[0]);
                String b2 = b();
                if (b2 != null) {
                    al.a("[LogUtil] Got user log from native: %d bytes", Integer.valueOf(b2.length()));
                    return ap.a(b2, "BuglyNativeLog.txt");
                }
            }
            StringBuilder sb = new StringBuilder();
            synchronized (q) {
                a aVar = f9720h;
                if (aVar != null && aVar.f9731a && (file = aVar.b) != null && file.length() > 0) {
                    sb.append(ap.a(f9720h.b, 30720, true));
                }
                StringBuilder sb2 = f9718f;
                if (sb2 != null && sb2.length() > 0) {
                    sb.append(f9718f.toString());
                }
            }
            return ap.a(sb.toString(), "BuglyLog.txt");
        }
        return null;
    }

    /* compiled from: BUGLY */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f9731a;
        public File b;
        public long c = 30720;

        /* renamed from: d  reason: collision with root package name */
        private String f9732d;

        /* renamed from: e  reason: collision with root package name */
        private long f9733e;

        public a(String str) {
            if (str == null || str.equals("")) {
                return;
            }
            this.f9732d = str;
            this.f9731a = a();
        }

        public final boolean a() {
            try {
                File file = new File(this.f9732d);
                this.b = file;
                if (file.exists() && !this.b.delete()) {
                    this.f9731a = false;
                    return false;
                } else if (this.b.createNewFile()) {
                    return true;
                } else {
                    this.f9731a = false;
                    return false;
                }
            } catch (Throwable th) {
                al.a(th);
                this.f9731a = false;
                return false;
            }
        }

        public final boolean a(String str) {
            FileOutputStream fileOutputStream;
            byte[] bytes;
            if (this.f9731a) {
                FileOutputStream fileOutputStream2 = null;
                try {
                    fileOutputStream = new FileOutputStream(this.b, true);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    fileOutputStream.write(str.getBytes("UTF-8"));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    this.f9733e += bytes.length;
                    this.f9731a = true;
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        al.a(th);
                        this.f9731a = false;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return false;
                    } catch (Throwable th3) {
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th3;
                    }
                }
            }
            return false;
        }
    }

    public static void a(int i2) {
        synchronized (q) {
            f9716d = i2;
            if (i2 < 0) {
                f9716d = 0;
            } else if (i2 > 30720) {
                f9716d = 30720;
            }
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (th == null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        a(str, str2, message + '\n' + ap.b(th));
    }

    public static synchronized void a(final String str, final String str2, final String str3) {
        synchronized (ao.class) {
            if (f9725m && b) {
                try {
                    if (f9726n) {
                        f9727o.execute(new Runnable() { // from class: com.tencent.bugly.proguard.ao.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (ao.d(str, str2, str3)) {
                                }
                            }
                        });
                    } else {
                        f9727o.execute(new Runnable() { // from class: com.tencent.bugly.proguard.ao.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                ao.e(str, str2, str3);
                            }
                        });
                    }
                } catch (Exception e2) {
                    al.b(e2);
                }
            }
        }
    }

    private static String a(String str, String str2, String str3, long j2) {
        String date;
        f9717e.setLength(0);
        if (str3.length() > 30720) {
            str3 = str3.substring(str3.length() - 30720, str3.length() - 1);
        }
        Date date2 = new Date();
        SimpleDateFormat simpleDateFormat = c;
        if (simpleDateFormat != null) {
            date = simpleDateFormat.format(date2);
        } else {
            date = date2.toString();
        }
        StringBuilder sb = f9717e;
        sb.append(date);
        sb.append(" ");
        sb.append(f9728p);
        sb.append(" ");
        sb.append(j2);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str3);
        sb.append("\u0001\r\n");
        return f9717e.toString();
    }

    public static byte[] a() {
        if (f9715a) {
            if (b) {
                return ap.a(f9718f.toString(), "BuglyLog.txt");
            }
            return null;
        }
        return c();
    }
}
