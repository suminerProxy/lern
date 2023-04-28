package h.p.a.c;

import h.p.a.a.e;
import h.p.a.a.f.a;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

/* compiled from: IdValueReader.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class b {
    public static Map<Integer, ByteBuffer> a(File file) {
        if (file != null && file.exists() && file.isFile()) {
            try {
                return e.e(e.g(file));
            } catch (a.c unused) {
                PrintStream printStream = System.out;
                printStream.println("APK : " + file.getAbsolutePath() + " not have apk signature block");
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static ByteBuffer b(File file, int i2) {
        if (file != null && file.exists() && file.isFile()) {
            Map<Integer, ByteBuffer> a2 = a(file);
            PrintStream printStream = System.out;
            printStream.println("getByteBufferValueById , destApk " + file.getAbsolutePath() + " IdValueMap = " + a2);
            if (a2 != null) {
                return a2.get(Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static byte[] c(File file, int i2) {
        if (file != null && file.exists() && file.isFile()) {
            ByteBuffer b = b(file, i2);
            PrintStream printStream = System.out;
            printStream.println("getByteValueById , id = " + i2 + " , value = " + b);
            if (b != null) {
                return Arrays.copyOfRange(b.array(), b.arrayOffset() + b.position(), b.arrayOffset() + b.limit());
            }
        }
        return null;
    }

    public static String d(File file, int i2) {
        byte[] c;
        if (file != null && file.exists() && file.isFile() && (c = c(file, i2)) != null) {
            try {
                if (c.length > 0) {
                    return new String(c, "UTF-8");
                }
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
