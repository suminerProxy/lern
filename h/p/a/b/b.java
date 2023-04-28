package h.p.a.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: ChannelReaderUtil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f17741a = "ChannelReaderUtil";
    private static String b;

    public static Map<Integer, ByteBuffer> a(Context context) {
        return h.p.a.c.b.a(new File(b(context)));
    }

    private static String b(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static byte[] c(Context context, int i2) {
        return h.p.a.c.b.c(new File(b(context)), i2);
    }

    public static String d(Context context) {
        if (b == null) {
            String f2 = f(context);
            if (f2 == null) {
                f2 = e(context);
            }
            b = f2;
        }
        return b;
    }

    public static String e(Context context) {
        String c = h.p.a.c.a.c(new File(b(context)));
        String str = "getChannelByV1 , channel = " + c;
        return c;
    }

    public static String f(Context context) {
        String d2 = h.p.a.c.a.d(new File(b(context)));
        String str = "getChannelByV2 , channel = " + d2;
        return d2;
    }

    public static String g(Context context, int i2) {
        String d2 = h.p.a.c.b.d(new File(b(context)), i2);
        String str = "id = " + i2 + " , value = " + d2;
        return d2;
    }
}
