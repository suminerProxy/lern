package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DocumentsContractApi19 {
    private static final int FLAG_VIRTUAL_DOCUMENT = 512;
    private static final String TAG = "DocumentFile";

    private DocumentsContractApi19() {
    }

    public static boolean canRead(Context context, Uri uri) {
    }

    public static boolean canWrite(Context context, Uri uri) {
    }

    private static void closeQuietly(@Nullable AutoCloseable autoCloseable) {
    }

    public static boolean exists(Context context, Uri uri) {
    }

    public static long getFlags(Context context, Uri uri) {
    }

    @Nullable
    public static String getName(Context context, Uri uri) {
    }

    @Nullable
    private static String getRawType(Context context, Uri uri) {
    }

    @Nullable
    public static String getType(Context context, Uri uri) {
    }

    public static boolean isDirectory(Context context, Uri uri) {
    }

    public static boolean isFile(Context context, Uri uri) {
    }

    public static boolean isVirtual(Context context, Uri uri) {
    }

    public static long lastModified(Context context, Uri uri) {
    }

    public static long length(Context context, Uri uri) {
    }

    private static int queryForInt(Context context, Uri uri, String str, int i2) {
    }

    private static long queryForLong(Context context, Uri uri, String str, long j2) {
    }

    @Nullable
    private static String queryForString(Context context, Uri uri, String str, @Nullable String str2) {
    }
}
