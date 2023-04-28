package com.mob.tools.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mob.MobSDK;
import com.mob.commons.k;
import com.mob.commons.s;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.KVPair;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.DH;
import com.sobot.network.http.SobotOkHttpUtils;
import com.umeng.analytics.pro.aq;
import h.y.a.n.d1;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLDecoder;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.text.Typography;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ResHelper implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static float f4523a;
    private static int b;
    private static Uri c;

    public static void clearCache(Context context) throws Throwable {
        deleteFileAndFolder(new File(getCachePath(context, null)));
    }

    public static void closeIOs(Closeable... closeableArr) {
        if (closeableArr == null || closeableArr.length <= 0) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
        }
    }

    public static boolean copyFile(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !new File(str).exists()) {
            return false;
        }
        try {
            copyFile(new FileInputStream(str), new FileOutputStream(str2));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Deprecated
    public static long dateStrToLong(String str) {
        return new SimpleDateFormat("yyyy-MM-dd").parse(str, new ParsePosition(0)).getTime();
    }

    @Deprecated
    public static long dateToLong(String str) {
        try {
            Date date = new Date(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar.getTimeInMillis();
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return 0L;
        }
    }

    @Deprecated
    public static Bundle decodeUrl(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String str2 : str.split(com.alipay.sdk.sys.a.b)) {
                String[] split = str2.split("=");
                if (split.length >= 2 && split[1] != null) {
                    bundle.putString(URLDecoder.decode(split[0]), URLDecoder.decode(split[1]));
                } else {
                    bundle.putString(URLDecoder.decode(split[0]), "");
                }
            }
        }
        return bundle;
    }

    public static void deleteFileAndFolder(File file) throws Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        String[] list = file.list();
        if (list != null && list.length > 0) {
            for (String str : list) {
                File file2 = new File(file, str);
                if (file2.isDirectory()) {
                    deleteFileAndFolder(file2);
                } else {
                    file2.delete();
                }
            }
            file.delete();
            return;
        }
        file.delete();
    }

    public static int designToDevice(Context context, int i2, int i3) {
        if (b == 0) {
            int[] screenSize = getScreenSize(context);
            b = screenSize[0] < screenSize[1] ? screenSize[0] : screenSize[1];
        }
        return (int) (((i3 * b) / i2) + 0.5f);
    }

    public static int dipToPx(Context context, int i2) {
        if (f4523a <= 0.0f) {
            f4523a = context.getResources().getDisplayMetrics().density;
        }
        return (int) ((i2 * f4523a) + 0.5f);
    }

    @Deprecated
    public static String encodeUrl(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                obj = "";
            }
            if (z) {
                z = false;
            } else {
                sb.append(com.alipay.sdk.sys.a.b);
            }
            sb.append(Data.urlEncode(str) + "=" + Data.urlEncode(String.valueOf(obj)));
        }
        return sb.toString();
    }

    public static <T> T forceCast(Object obj) {
        return (T) forceCast(obj, null);
    }

    public static int getAnimRes(Context context, String str) {
        return getResId(context, "anim", str);
    }

    public static int getBitmapRes(Context context, String str) {
        int resId = getResId(context, "drawable", str);
        return resId <= 0 ? getResId(context, "mipmap", str) : resId;
    }

    public static String getCachePath(Context context, String str) {
        String str2 = context.getFilesDir().getAbsolutePath() + k.a("001e") + "MobSDK" + k.a("007e!bebdbeWage");
        try {
            String sandboxPath = DH.SyncMtd.getSandboxPath();
            if (sandboxPath != null) {
                str2 = sandboxPath + k.a("001e") + "MobSDK" + k.a("001e") + DH.SyncMtd.getPackageName() + k.a("007e1bebdbe]age");
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str2 + str + k.a("001e");
        }
        File file = new File(str2);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return str2;
    }

    public static String getCacheRoot(Context context) {
        return getCacheRoot(context, false);
    }

    public static File getCacheRootFile(Context context, String str) {
        try {
            String cacheRoot = getCacheRoot(context);
            if (cacheRoot != null) {
                File file = new File(cacheRoot, str);
                if (!file.getParentFile().exists() || !file.getParentFile().isDirectory()) {
                    file.getParentFile().delete();
                    file.getParentFile().mkdirs();
                }
                return file;
            }
            return null;
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static int getColorRes(Context context, String str) {
        return getResId(context, "color", str);
    }

    public static String getDataCache(Context context) {
        String str = context.getFilesDir().getAbsolutePath() + k.a("001e") + "MobSDK";
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            file.delete();
            file.mkdirs();
        }
        return str;
    }

    public static File getDataCacheFile(Context context, String str) {
        return getDataCacheFile(context, str, false);
    }

    public static float getDensity(Context context) {
        if (f4523a <= 0.0f) {
            f4523a = context.getResources().getDisplayMetrics().density;
        }
        return f4523a;
    }

    public static int getDensityDpi(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static float[] getDensityXYDpi(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new float[]{displayMetrics.xdpi, displayMetrics.ydpi};
    }

    @Deprecated
    public static long getFileSize(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return getFileSize(new File(str));
    }

    public static int getIdRes(Context context, String str) {
        return getResId(context, k.a("002@bc+f"), str);
    }

    public static String getImageCachePath(Context context) {
        return getCachePath(context, "images");
    }

    public static int getLayoutRes(Context context, String str) {
        return getResId(context, k.a("006<cbbdbgcaba7b"), str);
    }

    @Deprecated
    public static synchronized Uri getMediaUri(Context context, String str, String str2) {
        Uri uri;
        synchronized (ResHelper.class) {
            Object obj = new Object();
            c = null;
            MediaScannerConnection.scanFile(context, new String[]{str}, new String[]{str2}, new MediaScannerConnection.OnScanCompletedListener(obj) { // from class: com.mob.tools.utils.ResHelper.1

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Object f4524a;

                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public void onScanCompleted(String str3, Uri uri2) {
                }
            });
            try {
                if (c == null) {
                    synchronized (obj) {
                        obj.wait(SobotOkHttpUtils.DEFAULT_MILLISECONDS);
                    }
                }
            } catch (Throwable unused) {
            }
            uri = c;
            c = null;
        }
        return uri;
    }

    public static int getRawRes(Context context, String str) {
        return getResId(context, "raw", str);
    }

    public static int getResId(Context context, String str, String str2) {
        int i2 = 0;
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                return 0;
            }
            i2 = context.getResources().getIdentifier(str2, str, packageName);
            if (i2 <= 0) {
                i2 = context.getResources().getIdentifier(str2.toLowerCase(), str, packageName);
            }
            if (i2 <= 0) {
                NLog mobLog = MobLog.getInstance();
                mobLog.w("failed to parse " + str + " resource \"" + str2 + "\"");
            }
        }
        return i2;
    }

    public static int getScreenHeight(Context context) {
        return getScreenSize(context)[1];
    }

    public static int[] getScreenSize(Context context) {
        WindowManager windowManager;
        Display display = null;
        try {
            windowManager = (WindowManager) DH.SyncMtd.getSystemServiceSafe("window");
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            windowManager = null;
        }
        if (windowManager == null) {
            return new int[]{0, 0};
        }
        try {
            display = windowManager.getDefaultDisplay();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        if (display == null) {
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
            } catch (Throwable th3) {
                MobLog.getInstance().w(th3);
                return new int[]{0, 0};
            }
        } else if (Build.VERSION.SDK_INT < 13) {
            try {
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                display.getMetrics(displayMetrics2);
                return new int[]{displayMetrics2.widthPixels, displayMetrics2.heightPixels};
            } catch (Throwable th4) {
                MobLog.getInstance().w(th4);
                return new int[]{0, 0};
            }
        } else {
            try {
                Point point = new Point();
                Method method = display.getClass().getMethod(k.a("011UddCgb7ec4g7bdcbcfbceaXg"), Point.class);
                method.setAccessible(true);
                method.invoke(display, point);
                return new int[]{point.x, point.y};
            } catch (Throwable th5) {
                MobLog.getInstance().w(th5);
                return new int[]{0, 0};
            }
        }
    }

    public static int getScreenWidth(Context context) {
        return getScreenSize(context)[0];
    }

    public static int getStringArrayRes(Context context, String str) {
        return getResId(context, "array", str);
    }

    public static int getStringRes(Context context, String str) {
        return getResId(context, "string", str);
    }

    public static int getStyleRes(Context context, String str) {
        return getResId(context, TtmlNode.TAG_STYLE, str);
    }

    public static int[] getStyleableRes(Context context, String str) {
        try {
            Object staticField = ReflectHelper.getStaticField(ReflectHelper.importClass(context.getPackageName() + ".R$styleable"), str);
            return staticField == null ? new int[0] : staticField.getClass().isArray() ? (int[]) staticField : new int[]{((Integer) staticField).intValue()};
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return new int[0];
        }
    }

    public static <T> boolean isEqual(T t, T t2) {
        return !((t == null && t2 != null) || !(t == null || t.equals(t2)));
    }

    @Deprecated
    public static int parseInt(String str) throws Throwable {
        return parseInt(str, 10);
    }

    @Deprecated
    public static long parseLong(String str) throws Throwable {
        return parseLong(str, 10);
    }

    @Deprecated
    public static Uri pathToContentUri(Context context, String str) {
        try {
            if (DH.SyncMtd.checkPermission(k.a("040Kbdbi+fEbfcabcZf5cj;cg+bfAj)bcdedebccabicjecebchdgbbebfecgebeccdchcibbcfcgdjecchfieb"))) {
                Cursor query = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{aq.f14745d}, "_data=? ", new String[]{str}, null);
                if (query != null && query.moveToFirst()) {
                    int i2 = query.getInt(query.getColumnIndex(aq.f14745d));
                    Uri parse = Uri.parse("content://media/external/images/media");
                    return Uri.withAppendedPath(parse, "" + i2);
                } else if (new File(str).exists()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_data", str);
                    return context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                } else {
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static int pxToDip(Context context, int i2) {
        if (f4523a <= 0.0f) {
            f4523a = context.getResources().getDisplayMetrics().density;
        }
        return (int) ((i2 / f4523a) + 0.5f);
    }

    public static ArrayList<HashMap<String, String>> readArrayListFromFile(String str) {
        return readArrayListFromFile(str, false);
    }

    public static long readLongFromFile(String str) {
        Throwable th;
        DataInputStream dataInputStream;
        File dataCacheFile = getDataCacheFile(MobSDK.getContext(), str);
        if (dataCacheFile.exists()) {
            try {
                dataInputStream = new DataInputStream(new FileInputStream(dataCacheFile));
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = null;
            }
            try {
                long readLong = dataInputStream.readLong();
                s.a(dataInputStream);
                return readLong;
            } catch (Throwable th3) {
                th = th3;
                try {
                    MobLog.getInstance().d(th);
                    s.a(dataInputStream);
                    return 0L;
                } catch (Throwable th4) {
                    s.a(dataInputStream);
                    throw th4;
                }
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0.exists() == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object readObjectFromFile(java.lang.String r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 != 0) goto L71
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L13
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L13
            boolean r9 = r0.exists()     // Catch: java.lang.Throwable -> L13
            if (r9 != 0) goto L1c
            goto L1b
        L13:
            r9 = move-exception
            com.mob.tools.log.NLog r0 = com.mob.tools.MobLog.getInstance()
            r0.d(r9)
        L1b:
            r0 = r1
        L1c:
            if (r0 == 0) goto L71
            r9 = 2
            r2 = 1
            r3 = 0
            r4 = 3
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L4d
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L49
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L49
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L46
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r7 = r6.readObject()     // Catch: java.lang.Throwable -> L44
            r6.close()     // Catch: java.lang.Throwable -> L44
            java.io.Closeable[] r1 = new java.io.Closeable[r4]
            r1[r3] = r6
            r1[r2] = r0
            r1[r9] = r5
            closeIOs(r1)
            return r7
        L44:
            r7 = move-exception
            goto L51
        L46:
            r7 = move-exception
            r6 = r1
            goto L51
        L49:
            r7 = move-exception
            r0 = r1
            r6 = r0
            goto L51
        L4d:
            r7 = move-exception
            r0 = r1
            r5 = r0
            r6 = r5
        L51:
            com.mob.tools.log.NLog r8 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L64
            r8.d(r7)     // Catch: java.lang.Throwable -> L64
            java.io.Closeable[] r4 = new java.io.Closeable[r4]
            r4[r3] = r6
            r4[r2] = r0
            r4[r9] = r5
            closeIOs(r4)
            goto L71
        L64:
            r1 = move-exception
            java.io.Closeable[] r4 = new java.io.Closeable[r4]
            r4[r3] = r6
            r4[r2] = r0
            r4[r9] = r5
            closeIOs(r4)
            throw r1
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.utils.ResHelper.readObjectFromFile(java.lang.String):java.lang.Object");
    }

    public static void saveArrayListToFile(ArrayList<HashMap<String, String>> arrayList, String str) {
        saveArrayListToFile(arrayList, str, false);
    }

    public static boolean saveLongToFile(long j2, String str) {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = null;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(getDataCacheFile(MobSDK.getContext(), str)));
        } catch (Throwable th) {
            th = th;
        }
        try {
            dataOutputStream.writeLong(j2);
            dataOutputStream.flush();
            s.a(dataOutputStream);
            return true;
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream2 = dataOutputStream;
            try {
                MobLog.getInstance().d(th);
                s.a(dataOutputStream2);
                return false;
            } catch (Throwable th3) {
                s.a(dataOutputStream2);
                throw th3;
            }
        }
    }

    public static boolean saveObjectToFile(String str, Object obj) {
        File file;
        GZIPOutputStream gZIPOutputStream;
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream;
        if (!TextUtils.isEmpty(str)) {
            FileOutputStream fileOutputStream2 = null;
            try {
                file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                file = null;
            }
            if (obj == null) {
                return true;
            }
            if (!file.getParentFile().exists() || !file.getParentFile().isDirectory()) {
                file.getParentFile().delete();
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
            if (file != null) {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
                        try {
                            objectOutputStream = new ObjectOutputStream(gZIPOutputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            objectOutputStream = null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        gZIPOutputStream = null;
                        objectOutputStream = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    gZIPOutputStream = null;
                    objectOutputStream = null;
                }
                try {
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.flush();
                    objectOutputStream.close();
                    closeIOs(objectOutputStream, gZIPOutputStream, fileOutputStream);
                    return true;
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        MobLog.getInstance().d(th);
                        closeIOs(objectOutputStream, gZIPOutputStream, fileOutputStream2);
                        return false;
                    } catch (Throwable th6) {
                        closeIOs(objectOutputStream, gZIPOutputStream, fileOutputStream2);
                        throw th6;
                    }
                }
            }
        }
        return false;
    }

    @Deprecated
    public static long strToDate(String str) {
        return new SimpleDateFormat(d1.f26281e).parse(str, new ParsePosition(0)).getTime();
    }

    @Deprecated
    public static Bundle urlToBundle(String str) {
        int indexOf;
        String str2;
        if (str.indexOf("://") >= 0) {
            str2 = k.a("007abbcdee") + str.substring(indexOf + 1);
        } else {
            str2 = k.a("007abbcdee") + str;
        }
        try {
            URL url = new URL(str2);
            Bundle decodeUrl = decodeUrl(url.getQuery());
            decodeUrl.putAll(decodeUrl(url.getRef()));
            return decodeUrl;
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return new Bundle();
        }
    }

    @Deprecated
    public static Uri videoPathToContentUri(Context context, String str) {
        try {
            if (DH.SyncMtd.checkPermission(k.a("040:bdbi;f'bfcabcZf9cj+cg*bf*j]bcdedebccabicjecebchdgbbebfecgebeccdchcibbcfcgdjecchfieb"))) {
                Cursor query = context.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{aq.f14745d}, "_data=? ", new String[]{str}, null);
                if (query != null && query.moveToFirst()) {
                    int i2 = query.getInt(query.getColumnIndex(aq.f14745d));
                    Uri parse = Uri.parse("content://media/external/video/media");
                    return Uri.withAppendedPath(parse, "" + i2);
                } else if (new File(str).exists()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_data", str);
                    return context.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                } else {
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T forceCast(Object obj, T t) {
        if (obj != 0) {
            try {
                if (obj instanceof Integer) {
                    return t instanceof Long ? (T) Long.valueOf(((Integer) obj).intValue()) : obj;
                }
                return obj;
            } catch (Throwable unused) {
            }
        }
        return t;
    }

    public static String getCacheRoot(Context context, boolean z) {
        String dataCache;
        if (z) {
            dataCache = null;
        } else {
            try {
                dataCache = getDataCache(context);
            } catch (Throwable th) {
                MobLog.getInstance().w(th);
                return null;
            }
        }
        String sandboxPath = DH.SyncMtd.getSandboxPath();
        if (sandboxPath != null) {
            dataCache = sandboxPath + k.a("001e") + "MobSDK";
        }
        if (TextUtils.isEmpty(dataCache)) {
            return null;
        }
        File file = new File(dataCache);
        if (!file.exists() || !file.isDirectory()) {
            file.delete();
            file.mkdirs();
        }
        return dataCache;
    }

    public static File getDataCacheFile(Context context, String str, boolean z) {
        File file = new File(getDataCache(context), str);
        if (z && !file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return file;
    }

    @Deprecated
    public static int parseInt(String str, int i2) throws Throwable {
        return Integer.parseInt(str, i2);
    }

    @Deprecated
    public static long parseLong(String str, int i2) throws Throwable {
        return Long.parseLong(str, i2);
    }

    public static ArrayList<HashMap<String, String>> readArrayListFromFile(String str, boolean z) {
        ArrayList<HashMap<String, String>> arrayList;
        BufferedReader bufferedReader;
        File dataCacheFile = getDataCacheFile(MobSDK.getContext(), str, true);
        if (dataCacheFile.exists()) {
            BufferedReader bufferedReader2 = null;
            try {
                arrayList = new ArrayList<>();
                bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream(dataCacheFile)), "utf-8"));
            } catch (Throwable th) {
                th = th;
            }
            try {
                String readLine = bufferedReader.readLine();
                while (readLine != null) {
                    if (z) {
                        readLine = new String(Base64.decode(readLine, 2), "utf-8");
                        continue;
                    }
                    arrayList.add(HashonHelper.fromJson(readLine));
                    readLine = bufferedReader.readLine();
                }
                closeIOs(bufferedReader);
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                try {
                    MobLog.getInstance().d(th);
                    closeIOs(bufferedReader2);
                    return new ArrayList<>();
                } catch (Throwable th3) {
                    closeIOs(bufferedReader2);
                    throw th3;
                }
            }
        }
        return new ArrayList<>();
    }

    public static void saveArrayListToFile(ArrayList<HashMap<String, String>> arrayList, String str, boolean z) {
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            outputStreamWriter = new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream(getDataCacheFile(MobSDK.getContext(), str, true))), "utf-8");
        } catch (Throwable th) {
            th = th;
        }
        try {
            Iterator<HashMap<String, String>> it = arrayList.iterator();
            while (it.hasNext()) {
                String fromHashMap = HashonHelper.fromHashMap(it.next());
                if (z) {
                    fromHashMap = new String(Base64.encode(fromHashMap.getBytes("utf-8"), 2), "utf-8");
                }
                outputStreamWriter.append((CharSequence) fromHashMap).append('\n');
            }
            closeIOs(outputStreamWriter);
        } catch (Throwable th2) {
            th = th2;
            outputStreamWriter2 = outputStreamWriter;
            try {
                MobLog.getInstance().d(th);
                closeIOs(outputStreamWriter2);
            } catch (Throwable th3) {
                closeIOs(outputStreamWriter2);
                throw th3;
            }
        }
    }

    @Deprecated
    public static long getFileSize(File file) throws Throwable {
        if (file.exists()) {
            if (file.isDirectory()) {
                int i2 = 0;
                for (String str : file.list()) {
                    i2 = (int) (i2 + getFileSize(new File(file, str)));
                }
                return i2;
            }
            return file.length();
        }
        return 0L;
    }

    public static int designToDevice(Context context, float f2, int i2) {
        if (f4523a <= 0.0f) {
            f4523a = context.getResources().getDisplayMetrics().density;
        }
        return (int) (((i2 * f4523a) / f2) + 0.5f);
    }

    public static void copyFile(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws Throwable {
        byte[] bArr = new byte[65536];
        int read = fileInputStream.read(bArr);
        while (read > 0) {
            fileOutputStream.write(bArr, 0, read);
            read = fileInputStream.read(bArr);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    @Deprecated
    public static String encodeUrl(ArrayList<KVPair<String>> arrayList) {
        if (arrayList == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        Iterator<KVPair<String>> it = arrayList.iterator();
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            if (i2 > 0) {
                sb.append(Typography.amp);
            }
            String str = next.name;
            String str2 = next.value;
            if (str != null) {
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(Data.urlEncode(str) + "=" + Data.urlEncode(str2));
                i2++;
            }
        }
        return sb.toString();
    }
}
