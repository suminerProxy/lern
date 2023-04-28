package com.tencent.tpns.baseapi.base.logger;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.baseapi.core.net.HttpRequestCallback;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TBaseLogger {

    /* renamed from: k  reason: collision with root package name */
    private static Context f13643k;

    /* renamed from: l  reason: collision with root package name */
    private static DeviceInfo f13644l;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ExecutorService f13635a = Executors.newSingleThreadExecutor(new MinPriorityThreadFactory());
    private static boolean b = false;
    private static boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private static String f13636d = "tencent" + File.separator + ".TPush";

    /* renamed from: e  reason: collision with root package name */
    private static int f13637e = 2;

    /* renamed from: f  reason: collision with root package name */
    private static List<String> f13638f = Collections.synchronizedList(new ArrayList());

    /* renamed from: g  reason: collision with root package name */
    private static boolean f13639g = false;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f13640h = false;

    /* renamed from: i  reason: collision with root package name */
    private static String f13641i = null;

    /* renamed from: j  reason: collision with root package name */
    private static String f13642j = null;

    /* renamed from: m  reason: collision with root package name */
    private static boolean f13645m = false;

    /* renamed from: n  reason: collision with root package name */
    private static LoggerInterface f13646n = new DefaultLogger();

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class MinPriorityThreadFactory implements ThreadFactory {
        private MinPriorityThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("tpns-log");
            thread.setPriority(10);
            return thread;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface WriteFileCallback {
        void onFinished();
    }

    public static void addThirdLog(int i2, String str, String str2, Throwable th) {
        if (i2 == 2) {
            vv(str, str2, th);
        } else if (i2 == 3) {
            dd(str, str2, th);
        } else if (i2 == 4) {
            ii(str, str2, th);
        } else if (i2 == 5) {
            ww(str, str2, th);
        } else if (i2 != 6) {
            ee(str, "illegal log level: " + str2, th);
        } else {
            ee(str, str2, th);
        }
    }

    public static void dd(String str, String str2) {
        if (a(3)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.d("TPush", "[" + str + "] " + str2);
            a("DEBUG", str, str2, null);
        }
    }

    public static void e(String str, String str2) {
        if (b && a(6)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.e("TPush", "[" + str + "] " + str2);
        }
        a("ERROR", str, str2, null);
    }

    public static void ee(String str, String str2) {
        if (a(6)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.e("TPush", "[" + str + "] " + str2);
        }
        a("ERROR", str, str2, null);
    }

    public static void enableDebug(Context context, boolean z) {
        b = z;
        c = z;
        init(context);
    }

    private static String f() {
        String str = f13641i;
        if (str != null) {
            return str;
        }
        try {
            Context context = f13643k;
            if (context != null) {
                f13641i = context.getExternalFilesDir(f13636d).getAbsolutePath();
            }
            return f13641i;
        } catch (Throwable th) {
            w("TBase - TPush", "TLogger ->getFileNamePre:" + th.getMessage());
            return null;
        }
    }

    public static void flush() {
        flush(null);
    }

    public static Context getAppContent() {
        return f13643k;
    }

    public static String getStackTraceString(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static void i(String str, String str2) {
        if (b && a(4)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.i("TPush", "[" + str + "] " + str2);
            if (c) {
                a("INFO", str, str2, null);
            }
        }
    }

    public static void ii(String str, String str2) {
        if (a(4)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.i("TPush", "[" + str + "] " + str2);
            a("INFO", str, str2, null);
        }
    }

    public static void init(Context context) {
        if (context == null) {
            return;
        }
        if (f13643k == null) {
            f13643k = context.getApplicationContext();
        }
        f13639g = LogUtil.isSDCardMounted(f13643k);
    }

    public static boolean isFileEnabled() {
        return c;
    }

    public static void removeOldDebugLogFiles(int i2) {
        File[] listFiles;
        int i3 = 7;
        try {
            String f2 = f();
            if (TextUtils.isEmpty(f2)) {
                return;
            }
            String str = f2 + File.separator + "Logs";
            File file = new File(str);
            if (file.exists()) {
                int length = str.length() + 5;
                int length2 = LogUtil.PATTERN_DATETIME_FILENAME.length() + length;
                if (file.listFiles() == null || file.listFiles().length <= 0) {
                    return;
                }
                for (File file2 : file.listFiles()) {
                    if (file2.isFile()) {
                        String absolutePath = file2.getAbsolutePath();
                        Date parseDateInFilename = LogUtil.parseDateInFilename(absolutePath.substring(length, length2));
                        if (i2 > 0) {
                            i3 -= i2;
                        }
                        if (LogUtil.isDaysAgo(parseDateInFilename, i3)) {
                            d("TBase - TPush", "delete logs file " + absolutePath);
                            file2.delete();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            e("TBase - TPush", "removeOldDebugLogFiles", th);
        }
    }

    public static void setDebugLevel(int i2) {
        if (i2 < 2 || i2 > 6) {
            return;
        }
        f13637e = i2;
    }

    public static void setLogger(LoggerInterface loggerInterface) {
        f13646n = loggerInterface;
        f13645m = true;
        loggerInterface.i("TBase - TPush", "set third logger delegate");
    }

    public static synchronized void uploadLogFile(final Context context, final HttpRequestCallback httpRequestCallback) {
        synchronized (TBaseLogger.class) {
            init(context);
            final String f2 = f();
            flush(new WriteFileCallback() { // from class: com.tencent.tpns.baseapi.base.logger.TBaseLogger.1
                @Override // com.tencent.tpns.baseapi.base.logger.TBaseLogger.WriteFileCallback
                public void onFinished() {
                    LogUploadUtil.uploadFile(context, f2, "Logs", "tmp", httpRequestCallback);
                }
            });
        }
    }

    public static void v(String str, String str2) {
        if (b && a(2)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.v("TPush", "[" + str + "] " + str2);
            if (c) {
                a("TRACE", str, str2, null);
            }
        }
    }

    public static void vv(String str, String str2) {
        if (a(2)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.v("TPush", "[" + str + "] " + str2);
            a("TRACE", str, str2, null);
        }
    }

    public static void w(String str, String str2) {
        if (b && a(5)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.w("TPush", "[" + str + "] " + str2);
        }
        a("WARN", str, str2, null);
    }

    public static void ww(String str, String str2) {
        if (a(5)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.w("TPush", "[" + str + "] " + str2);
        }
        a("WARN", str, str2, null);
    }

    public static /* synthetic */ String a() {
        return f();
    }

    private static void b(String str) {
        if (f13640h) {
            return;
        }
        f13638f.add(str);
        if (f13638f.size() == 100) {
            List<String> list = f13638f;
            f13638f = Collections.synchronizedList(new ArrayList());
            boolean isSDCardMounted = LogUtil.isSDCardMounted(f13643k);
            f13639g = isSDCardMounted;
            if (isSDCardMounted) {
                v("TBase - TPush", "have writable external storage, write log file!");
                a(list, null);
                return;
            }
            v("TBase - TPush", "no writable external storage");
        }
    }

    public static void d(String str, String str2) {
        if (b && a(3)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.d("TPush", "[" + str + "] " + str2);
            if (c) {
                a("DEBUG", str, str2, null);
            }
        }
    }

    public static void flush(WriteFileCallback writeFileCallback) {
        f13640h = true;
        List<String> list = f13638f;
        f13638f = Collections.synchronizedList(new ArrayList());
        if (f13639g) {
            a(list, writeFileCallback);
        }
        f13640h = false;
    }

    private static boolean a(int i2) {
        return i2 >= f13637e;
    }

    public static void dd(String str, String str2, Throwable th) {
        if (a(3)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.d("TPush", "[" + str + "] " + str2, th);
            a("DEBUG", str, str2, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (b && a(6)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.e("TPush", "[" + str + "] " + str2, th);
        }
        a("ERROR", str, str2, th);
    }

    public static void ee(String str, String str2, Throwable th) {
        if (a(6)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.e("TPush", "[" + str + "] " + str2, th);
        }
        a("ERROR", str, str2, th);
    }

    public static void ii(String str, String str2, Throwable th) {
        if (a(4)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.i("TPush", "[" + str + "] " + str2, th);
            a("INFO", str, str2, th);
        }
    }

    public static void vv(String str, String str2, Throwable th) {
        if (a(2)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.v("TPush", "[" + str + "] " + str2, th);
            a("TRACE", str, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (b && a(5)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.w("TPush", "[" + str + "] " + str2, th);
        }
        a("WARN", str, str2, th);
    }

    public static void ww(String str, String str2, Throwable th) {
        if (a(5)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.w("TPush", "[" + str + "] " + str2, th);
        }
        a("WARN", str, str2, th);
    }

    private static void a(String str, String str2, String str3, Throwable th) {
        if (f13645m) {
            return;
        }
        str2 = (str2 == null || str2.trim().equals("")) ? "TBase - TPush" : "TBase - TPush";
        try {
            String formatDate = LogUtil.formatDate(new Date(), "MM.dd_HH:mm:ss_SSS");
            if (str3 == null) {
                str3 = "";
            }
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str3), 256);
            String str4 = "[" + str2 + "]";
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    b(((Object) formatDate) + " " + e() + " " + str + " " + str4 + " " + readLine);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            if (th != null) {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                b(((Object) formatDate) + " " + e() + " " + str + stringWriter.toString());
            }
        } catch (Throwable unused) {
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (b && a(4)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.i("TPush", "[" + str + "] " + str2, th);
            if (c) {
                a("INFO", str, str2, th);
            }
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (b && a(2)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.v("TPush", "[" + str + "] " + str2, th);
            if (c) {
                a("TRACE", str, str2, th);
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (b && a(3)) {
            LoggerInterface loggerInterface = f13646n;
            loggerInterface.d("TPush", "[" + str + "] " + str2, th);
            if (c) {
                a("DEBUG", str, str2, th);
            }
        }
    }

    private static String e() {
        try {
            return Process.myPid() + " " + Thread.currentThread().getId();
        } catch (Throwable unused) {
            return "";
        }
    }

    private static void a(final List<String> list, final WriteFileCallback writeFileCallback) {
        try {
            f13635a.execute(new TTask() { // from class: com.tencent.tpns.baseapi.base.logger.TBaseLogger.2
                /* JADX WARN: Removed duplicated region for block: B:53:0x0175  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
                @Override // com.tencent.tpns.baseapi.base.util.TTask
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void TRun() {
                    /*
                        Method dump skipped, instructions count: 399
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.tpns.baseapi.base.logger.TBaseLogger.AnonymousClass2.TRun():void");
                }
            });
        } catch (Throwable th) {
            e("TBase - TPush", "savelog error", th);
        }
    }
}
