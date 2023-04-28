package h.p.a.c;

import h.p.a.a.d;
import h.p.a.a.e;
import java.io.File;
import java.io.PrintStream;

/* compiled from: ChannelReader.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class a {
    public static boolean a(File file) {
        if (file != null && file.exists() && file.isFile()) {
            return d.b(file);
        }
        return false;
    }

    public static boolean b(File file) {
        if (file != null && file.exists() && file.isFile()) {
            return e.a(file);
        }
        return false;
    }

    public static String c(File file) {
        try {
            return d.f(file);
        } catch (Exception unused) {
            PrintStream printStream = System.out;
            printStream.println("APK : " + file.getAbsolutePath() + " not have channel info from Zip Comment");
            return null;
        }
    }

    public static String d(File file) {
        PrintStream printStream = System.out;
        printStream.println("try to read channel info from apk : " + file.getAbsolutePath());
        return b.d(file, h.p.a.a.b.f17711a);
    }

    public static boolean e(File file, String str) {
        if (str != null) {
            return str.equals(c(file));
        }
        return false;
    }

    public static boolean f(File file, String str) {
        if (str != null) {
            return str.equals(d(file));
        }
        return false;
    }
}
