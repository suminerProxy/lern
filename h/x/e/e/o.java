package h.x.e.e;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import com.mobile.auth.BuildConfig;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.text.SimpleDateFormat;

/* compiled from: FileUtil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public static final String f25896a = "welcomepic";
    public static final String b = "Pictures";
    public static final String c = "Camera";

    /* renamed from: d  reason: collision with root package name */
    public static final String f25897d = "upimagezoom";

    /* renamed from: e  reason: collision with root package name */
    public static final String f25898e = "city";

    /* renamed from: f  reason: collision with root package name */
    public static final String f25899f = "city.txt";

    /* renamed from: g  reason: collision with root package name */
    public static final String f25900g = "XiuDong";

    public static Bitmap A(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static File B(Context context, String str) {
        return m(context, "volume", str, true);
    }

    public static File C(Context context, String str) {
        String absolutePath = e(context, f25896a).getAbsolutePath();
        return new File(absolutePath, str + D(str));
    }

    public static String D(String str) {
        if (str.indexOf("?") != -1) {
            str = str.substring(0, str.indexOf("?"));
        }
        int lastIndexOf = str.lastIndexOf(".");
        return lastIndexOf != -1 ? str.substring(lastIndexOf, str.length()) : "";
    }

    public static String E(File file) {
        int read;
        String str = "";
        BufferedInputStream bufferedInputStream = null;
        try {
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        read = bufferedInputStream2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        str = str + new String(bArr, 0, read);
                    }
                    bufferedInputStream2.close();
                    bufferedInputStream = read;
                } catch (FileNotFoundException e3) {
                    e = e3;
                    bufferedInputStream = bufferedInputStream2;
                    e.printStackTrace();
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                        bufferedInputStream = bufferedInputStream;
                    }
                    return str;
                } catch (IOException e4) {
                    e = e4;
                    bufferedInputStream = bufferedInputStream2;
                    e.printStackTrace();
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                        bufferedInputStream = bufferedInputStream;
                    }
                    return str;
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e6) {
                e = e6;
            } catch (IOException e7) {
                e = e7;
            }
            return str;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean F() {
        return Environment.getExternalStorageState().equalsIgnoreCase("mounted");
    }

    public static boolean G(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    public static boolean H(String str) {
        String[] u = u();
        for (int i2 = 0; i2 < u.length; i2++) {
            if (str.endsWith("." + u[i2])) {
                return true;
            }
        }
        return false;
    }

    public static String I(Context context) {
        File file = new File(context.getExternalFilesDir(null).getAbsolutePath() + "/moment");
        if (!file.exists()) {
            file.mkdir();
        }
        return file.getAbsolutePath();
    }

    public static String J(Context context, String str) {
        return m(context, c, s(str), false).getAbsolutePath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String K(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42 java.io.FileNotFoundException -> L4d
            java.io.InputStream r4 = r4.open(r5)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42 java.io.FileNotFoundException -> L4d
            if (r4 == 0) goto L35
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch: java.io.IOException -> L31 java.io.FileNotFoundException -> L33 java.lang.Throwable -> L58
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L31 java.io.FileNotFoundException -> L33 java.lang.Throwable -> L58
            r1.<init>()     // Catch: java.io.IOException -> L31 java.io.FileNotFoundException -> L33 java.lang.Throwable -> L58
        L14:
            int r2 = r4.read(r5)     // Catch: java.io.IOException -> L31 java.io.FileNotFoundException -> L33 java.lang.Throwable -> L58
            r3 = -1
            if (r2 != r3) goto L2c
            r4.close()     // Catch: java.io.IOException -> L31 java.io.FileNotFoundException -> L33 java.lang.Throwable -> L58
            r1.close()     // Catch: java.io.IOException -> L31 java.io.FileNotFoundException -> L33 java.lang.Throwable -> L58
            java.lang.String r5 = new java.lang.String     // Catch: java.io.IOException -> L31 java.io.FileNotFoundException -> L33 java.lang.Throwable -> L58
            byte[] r1 = r1.toByteArray()     // Catch: java.io.IOException -> L31 java.io.FileNotFoundException -> L33 java.lang.Throwable -> L58
            r5.<init>(r1)     // Catch: java.io.IOException -> L31 java.io.FileNotFoundException -> L33 java.lang.Throwable -> L58
            r0 = r5
            goto L35
        L2c:
            r3 = 0
            r1.write(r5, r3, r2)     // Catch: java.io.IOException -> L31 java.io.FileNotFoundException -> L33 java.lang.Throwable -> L58
            goto L14
        L31:
            r5 = move-exception
            goto L44
        L33:
            r5 = move-exception
            goto L4f
        L35:
            if (r4 == 0) goto L57
            r4.close()     // Catch: java.io.IOException -> L3b
            goto L57
        L3b:
            r4 = move-exception
            r4.printStackTrace()
            goto L57
        L40:
            r5 = move-exception
            goto L5a
        L42:
            r5 = move-exception
            r4 = r0
        L44:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L57
            r4.close()     // Catch: java.io.IOException -> L3b
            goto L57
        L4d:
            r5 = move-exception
            r4 = r0
        L4f:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L57
            r4.close()     // Catch: java.io.IOException -> L3b
        L57:
            return r0
        L58:
            r5 = move-exception
            r0 = r4
        L5a:
            if (r0 == 0) goto L64
            r0.close()     // Catch: java.io.IOException -> L60
            goto L64
        L60:
            r4 = move-exception
            r4.printStackTrace()
        L64:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h.x.e.e.o.K(android.content.Context, java.lang.String):java.lang.String");
    }

    public static void L(Context context) {
        File[] listFiles;
        File file = new File(context.getExternalFilesDir(null).getAbsolutePath() + "/moment");
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                if (file2.exists()) {
                    file2.delete();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
        if (r5.isRecycled() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r5.isRecycled() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File M(android.content.Context r4, android.view.View r5, java.lang.String r6) {
        /*
            android.graphics.Bitmap r5 = A(r5)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r2 = 100
            r5.compress(r1, r2, r0)
            byte[] r0 = r0.toByteArray()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = ".jpeg"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.io.File r6 = j(r4, r6)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53 java.io.FileNotFoundException -> L5e
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53 java.io.FileNotFoundException -> L5e
            r2 = 0
            int r3 = r0.length     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53 java.io.FileNotFoundException -> L5e
            r1.write(r0, r2, r3)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53 java.io.FileNotFoundException -> L5e
            r1.flush()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53 java.io.FileNotFoundException -> L5e
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53 java.io.FileNotFoundException -> L5e
            java.lang.String r1 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53 java.io.FileNotFoundException -> L5e
            android.net.Uri r1 = android.net.Uri.fromFile(r6)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53 java.io.FileNotFoundException -> L5e
            r0.setData(r1)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53 java.io.FileNotFoundException -> L5e
            r4.sendBroadcast(r0)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53 java.io.FileNotFoundException -> L5e
            boolean r4 = r5.isRecycled()
            if (r4 != 0) goto L69
        L4d:
            r5.recycle()
            goto L69
        L51:
            r4 = move-exception
            goto L6a
        L53:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L51
            boolean r4 = r5.isRecycled()
            if (r4 != 0) goto L69
            goto L4d
        L5e:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L51
            boolean r4 = r5.isRecycled()
            if (r4 != 0) goto L69
            goto L4d
        L69:
            return r6
        L6a:
            boolean r6 = r5.isRecycled()
            if (r6 != 0) goto L73
            r5.recycle()
        L73:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h.x.e.e.o.M(android.content.Context, android.view.View, java.lang.String):java.io.File");
    }

    public static boolean N(Bitmap bitmap, int i2, File file) throws IOException, FileNotFoundException {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean compress = bitmap.compress(Bitmap.CompressFormat.JPEG, i2, fileOutputStream);
            fileOutputStream.close();
            return compress;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    public static File a(Context context, String str, String str2) {
        File l2 = l(context, str, str2);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(l2);
            InputStream open = context.getAssets().open(str2);
            byte[] bArr = new byte[1024];
            for (int read = open.read(bArr); read > 0; read = open.read(bArr)) {
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.flush();
            open.close();
            fileOutputStream.close();
            return l2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer("");
            for (int i2 = 0; i2 < digest.length; i2++) {
                int i3 = digest[i2];
                if (i3 < 0) {
                    i3 += 256;
                }
                if (i3 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i3));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static void c(Context context, File file, File file2, boolean z) {
        Intent intent;
        try {
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[1444];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileInputStream.close();
            }
        } catch (Exception unused) {
            if (!z) {
                return;
            }
            intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        } catch (Throwable th) {
            if (z) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                intent2.setData(Uri.fromFile(file2));
                context.sendBroadcast(intent2);
            }
            throw th;
        }
        if (z) {
            intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file2));
            context.sendBroadcast(intent);
        }
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.isFile() && file.exists()) {
            return file.delete();
        }
        return false;
    }

    public static File e(Context context, String str) {
        File file = new File(context.getCacheDir().getAbsolutePath() + "/" + f25900g + "/" + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String f(Context context) {
        return i(context, c, false).getAbsolutePath();
    }

    public static File g(Context context) {
        return i(context, BuildConfig.FLAVOR_type, true);
    }

    @Deprecated
    public static File h(Context context, String str) {
        File file = new File(t(context, true), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Deprecated
    public static File i(Context context, String str, boolean z) {
        File file = new File(t(context, z), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File j(Context context, String str) {
        return k(context, str, false);
    }

    public static File k(Context context, String str, boolean z) {
        return m(context, "download", b(str) + D(str), z);
    }

    public static File l(Context context, String str, String str2) {
        return new File(h(context, str), str2);
    }

    public static File m(Context context, String str, String str2, boolean z) {
        return new File(i(context, str, z), str2);
    }

    public static File n(byte[] bArr, File file) {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                    try {
                        bufferedOutputStream2.write(bArr);
                        bufferedOutputStream2.close();
                    } catch (Exception e2) {
                        e = e2;
                        bufferedOutputStream = bufferedOutputStream2;
                        e.printStackTrace();
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        return file;
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        return file;
    }

    public static String o(Context context) {
        return i(context, b, false).getAbsolutePath();
    }

    public static String p(Context context, String str) {
        return i(context, str, false).getAbsolutePath();
    }

    public static String q(String str) {
        return "fans_pic_upload" + D(str);
    }

    public static String r(Context context, String str) {
        return m(context, "upload", "fans_pic_upload" + D(str), true).getAbsolutePath();
    }

    public static String s(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_hhmmss");
        Date date = new Date(System.currentTimeMillis());
        return str + simpleDateFormat.format((java.util.Date) date) + ".jpeg";
    }

    @Deprecated
    public static File t(Context context, boolean z) {
        File file;
        File file2 = null;
        try {
            if (F()) {
                if (z) {
                    file = new File(context.getExternalCacheDir().getPath() + f25900g);
                } else {
                    file = new File(Environment.getExternalStorageDirectory(), f25900g);
                }
                file2 = file;
                if (!file2.exists()) {
                    file2.mkdirs();
                }
            }
        } catch (Exception unused) {
        }
        if (file2 == null || !file2.exists()) {
            file2 = new File(context.getCacheDir().getAbsolutePath() + "/" + f25900g);
            if (!file2.exists()) {
                file2.mkdirs();
            }
        }
        return file2;
    }

    public static String[] u() {
        return new String[]{"amr", "mp3", "wav", "3gpp", "3gp", "aac", "m4a", "ogg"};
    }

    public static String v(Context context, String str) {
        return m(context, "tusdk", str, true).getAbsolutePath();
    }

    public static String w(Context context) {
        return i(context, f25897d, false).getAbsolutePath();
    }

    public static Uri x(String str) {
        return Uri.parse(str);
    }

    public static String y(Context context, String str) {
        return m(context, "videoConver", str, false).getAbsolutePath();
    }

    public static String z(Context context, String str) {
        return m(context, "videoCut", str, false).getAbsolutePath();
    }
}
