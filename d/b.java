package d;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* compiled from: TuiFileUtils.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static Context f15528a;

    public static File a() {
        return Environment.getExternalStorageDirectory();
    }

    public static void b(Context context) {
        f15528a = context;
    }
}
