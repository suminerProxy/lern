package skin.support.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinFileUtils {
    private static String getCacheDir(Context context) {
        File externalCacheDir;
        if (Environment.getExternalStorageState().equals("mounted") && (externalCacheDir = context.getExternalCacheDir()) != null && (externalCacheDir.exists() || externalCacheDir.mkdirs())) {
            return externalCacheDir.getAbsolutePath();
        }
        return context.getCacheDir().getAbsolutePath();
    }

    public static String getSkinDir(Context context) {
        File file = new File(getCacheDir(context), SkinConstants.SKIN_DEPLOY_PATH);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static boolean isFileExists(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }
}
