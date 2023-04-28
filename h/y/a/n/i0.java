package h.y.a.n;

import com.tencent.bugly.crashreport.BuglyLog;

/* compiled from: MLog.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f26316a = "TaiheDebug";

    public static void a(String str) {
        if (h.y.a.f.k.s) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String fileName = stackTrace[1].getFileName();
            String methodName = stackTrace[1].getMethodName();
            int lineNumber = stackTrace[1].getLineNumber();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(fileName + "---");
            stringBuffer.append(methodName + "---");
            stringBuffer.append(lineNumber + "---");
            stringBuffer.append(str);
            stringBuffer.toString();
            return;
        }
        BuglyLog.d(f26316a, str);
    }

    public static void b(String str, String str2) {
        if (h.y.a.f.k.s) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String fileName = stackTrace[1].getFileName();
            String methodName = stackTrace[1].getMethodName();
            int lineNumber = stackTrace[1].getLineNumber();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(fileName + "---");
            stringBuffer.append(methodName + "---");
            stringBuffer.append(lineNumber + "---");
            stringBuffer.append(str2);
            stringBuffer.toString();
            return;
        }
        BuglyLog.d(str, str2);
    }

    public static void c(String str) {
        if (h.y.a.f.k.s) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String fileName = stackTrace[1].getFileName();
            String methodName = stackTrace[1].getMethodName();
            int lineNumber = stackTrace[1].getLineNumber();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(fileName + "---");
            stringBuffer.append(methodName + "---");
            stringBuffer.append(lineNumber + "---");
            stringBuffer.append(str);
            stringBuffer.toString();
            return;
        }
        BuglyLog.e(f26316a, str);
    }

    public static void d(String str, String str2) {
        if (h.y.a.f.k.s) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String fileName = stackTrace[1].getFileName();
            String methodName = stackTrace[1].getMethodName();
            int lineNumber = stackTrace[1].getLineNumber();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(fileName + "---");
            stringBuffer.append(methodName + "---");
            stringBuffer.append(lineNumber + "---");
            stringBuffer.append(str2);
            stringBuffer.toString();
            return;
        }
        BuglyLog.e(str, str2);
    }

    public static void e(String str) {
        if (h.y.a.f.k.s) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String fileName = stackTrace[1].getFileName();
            String methodName = stackTrace[1].getMethodName();
            int lineNumber = stackTrace[1].getLineNumber();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(fileName + "---");
            stringBuffer.append(methodName + "---");
            stringBuffer.append(lineNumber + "---");
            stringBuffer.append(str);
            stringBuffer.toString();
            return;
        }
        BuglyLog.i(f26316a, str);
    }

    public static void f(String str, String str2) {
        if (h.y.a.f.k.s) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String fileName = stackTrace[1].getFileName();
            String methodName = stackTrace[1].getMethodName();
            int lineNumber = stackTrace[1].getLineNumber();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(fileName + "---");
            stringBuffer.append(methodName + "---");
            stringBuffer.append(lineNumber + "---");
            stringBuffer.append(str2);
            stringBuffer.toString();
            return;
        }
        BuglyLog.i(str, str2);
    }

    public static void g(String str) {
        if (h.y.a.f.k.s) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String fileName = stackTrace[1].getFileName();
            String methodName = stackTrace[1].getMethodName();
            int lineNumber = stackTrace[1].getLineNumber();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(fileName + "---");
            stringBuffer.append(methodName + "---");
            stringBuffer.append(lineNumber + "---");
            stringBuffer.append(str);
            stringBuffer.toString();
            return;
        }
        BuglyLog.v(f26316a, str);
    }

    public static void h(String str, String str2) {
        if (h.y.a.f.k.s) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String fileName = stackTrace[1].getFileName();
            String methodName = stackTrace[1].getMethodName();
            int lineNumber = stackTrace[1].getLineNumber();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(fileName + "---");
            stringBuffer.append(methodName + "---");
            stringBuffer.append(lineNumber + "---");
            stringBuffer.append(str2);
            stringBuffer.toString();
            return;
        }
        BuglyLog.v(str, str2);
    }

    public static void i(String str) {
        if (h.y.a.f.k.s) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String fileName = stackTrace[1].getFileName();
            String methodName = stackTrace[1].getMethodName();
            int lineNumber = stackTrace[1].getLineNumber();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(fileName + "---");
            stringBuffer.append(methodName + "---");
            stringBuffer.append(lineNumber + "---");
            stringBuffer.append(str);
            stringBuffer.toString();
            return;
        }
        BuglyLog.w(f26316a, str);
    }

    public static void j(String str, String str2) {
        if (h.y.a.f.k.s) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String fileName = stackTrace[1].getFileName();
            String methodName = stackTrace[1].getMethodName();
            int lineNumber = stackTrace[1].getLineNumber();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(fileName + "---");
            stringBuffer.append(methodName + "---");
            stringBuffer.append(lineNumber + "---");
            stringBuffer.append(str2);
            stringBuffer.toString();
            return;
        }
        BuglyLog.w(str, str2);
    }
}
