package h.y.a.n;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.app.NotificationManagerCompat;
import com.sina.weibo.BuildConfig;
import com.taihebase.activity.R;
import java.io.File;
import java.io.FileFilter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;

/* compiled from: MyTools.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class m0 {

    /* renamed from: a  reason: collision with root package name */
    private static final FileFilter f26340a = new a();

    /* compiled from: MyTools.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
        }
    }

    public static String A(Context context) {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return "" + (statFs.getBlockSize() * statFs.getBlockCount());
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String B() {
        String Z = u0.L().Z();
        return TextUtils.isEmpty(Z) ? "400-188-6980" : Z;
    }

    public static String C() {
        return "ANDROID";
    }

    public static String D() {
        return Build.VERSION.RELEASE;
    }

    public static int E(int i2) {
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 5) {
                    return 0;
                }
                return R.drawable.icon_organizer_tag;
            }
            return R.drawable.icon_livehouse;
        }
        return R.drawable.icon_artist_tag;
    }

    private static String F() {
        String uuid = UUID.randomUUID().toString();
        return uuid.substring(0, 8) + uuid.substring(9, 13) + uuid.substring(14, 18) + uuid.substring(19, 23) + uuid.substring(24);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String G(android.content.Context r5) {
        /*
            h.y.a.n.u0 r0 = h.y.a.n.u0.L()
            java.lang.String r1 = r0.z0()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L4d
            h.z.a.f r2 = h.z.a.f.e(r5)     // Catch: java.lang.Exception -> L38
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            boolean r2 = r2.f(r3)     // Catch: java.lang.Exception -> L38
            if (r2 == 0) goto L40
            java.lang.String r2 = "phone"
            java.lang.Object r5 = r5.getSystemService(r2)     // Catch: java.lang.Exception -> L38
            android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5     // Catch: java.lang.Exception -> L38
            java.lang.String r5 = r5.getDeviceId()     // Catch: java.lang.Exception -> L38
            if (r5 == 0) goto L40
            java.lang.String r2 = r5.trim()     // Catch: java.lang.Exception -> L38
            int r2 = r2.length()     // Catch: java.lang.Exception -> L38
            if (r2 <= 0) goto L40
            r0.V1(r5)     // Catch: java.lang.Exception -> L36
            goto L3f
        L36:
            r1 = move-exception
            goto L3c
        L38:
            r5 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
        L3c:
            r1.printStackTrace()
        L3f:
            r1 = r5
        L40:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 == 0) goto L4d
            java.lang.String r1 = F()
            r0.V1(r1)
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.y.a.n.m0.G(android.content.Context):java.lang.String");
    }

    public static int H(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static float I(String str) {
        String[] split = str.split("\\.");
        String str2 = "";
        for (int i2 = 0; i2 < split.length; i2++) {
            str2 = i2 == 0 ? split[i2] + "." : str2 + split[i2];
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        return Float.parseFloat(str2);
    }

    public static String J(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "0.0";
        }
    }

    public static boolean K(Context context, String str) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        if (installedPackages != null) {
            for (int i2 = 0; i2 < installedPackages.size(); i2++) {
                String str2 = installedPackages.get(i2).packageName;
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean L(String str) {
        return Pattern.compile("[一-龥]").matcher(str).find();
    }

    public static boolean M(String str) {
        return Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$").matcher(str).matches();
    }

    public static boolean N(Context context) {
        try {
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        return context.getPackageManager().getPackageInfo(BuildConfig.APPLICATION_ID, 0) != null;
    }

    public static boolean O() {
        return NotificationManagerCompat.from(h.y.a.f.k.b()).areNotificationsEnabled();
    }

    public static String P(int i2) {
        if (i2 <= 0) {
            return "0";
        }
        try {
            if (i2 > 9999) {
                int i3 = i2 / 10000;
                int i4 = i2 % 10000;
                if (i4 >= 1000) {
                    return i3 + "." + String.valueOf(i4).substring(0, 1) + "万";
                }
                return i3 + "万";
            }
            return String.valueOf(i2);
        } catch (Exception unused) {
            return "0";
        }
    }

    public static String Q(int i2) {
        try {
            if (i2 > 9999) {
                int i3 = i2 / 10000;
                int i4 = i2 % 10000;
                if (i4 >= 1000) {
                    return i3 + "." + String.valueOf(i4).substring(0, 1) + "w在看";
                }
                return i3 + "w在看";
            }
            return String.valueOf(i2) + "在看";
        } catch (Exception unused) {
            return "0在看";
        }
    }

    public static String R(int i2) {
        if (i2 <= 0) {
            return "0";
        }
        try {
            if (i2 > 9999) {
                int i3 = i2 / 10000;
                int i4 = i2 % 10000;
                if (i4 >= 1000) {
                    return i3 + "." + String.valueOf(i4).substring(0, 1) + "w";
                }
                return i3 + "w";
            } else if (i2 > 999) {
                int i5 = i2 / 1000;
                int i6 = i2 % 1000;
                if (i6 >= 100) {
                    return i5 + "." + String.valueOf(i6).substring(0, 1) + "k";
                }
                return i5 + "k";
            } else {
                return String.valueOf(i2);
            }
        } catch (Exception unused) {
            return "0";
        }
    }

    public static void S(ImageView imageView, int i2) {
        int E = E(i2);
        if (E != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(E);
            return;
        }
        imageView.setVisibility(8);
    }

    public static String T(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Pattern.compile("[^a-zA-Z0-9一-龥]").matcher(str).group();
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static void a(Context context) {
        ((Vibrator) context.getSystemService("vibrator")).vibrate(50L);
    }

    public static void b(String str, String str2) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) h.y.a.f.k.b().getSystemService("clipboard");
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, str));
            if (clipboardManager.hasPrimaryClip()) {
                clipboardManager.getPrimaryClip().getItemAt(0);
            }
            f1.d(str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static String c() {
        return UUID.randomUUID().toString().trim().replaceAll(HelpFormatter.DEFAULT_OPT_PREFIX, "");
    }

    public static boolean d(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            if (str2 != null && !str2.isEmpty()) {
                Pattern.compile(str2).matcher(str).replaceFirst("$");
                return true;
            }
            arrayList.add(str);
        }
        return false;
    }

    public static String e(String str) {
        if (str == null || str.trim().length() == 0) {
            return "热";
        }
        char charAt = str.trim().substring(0, 1).charAt(0);
        Pattern compile = Pattern.compile("^[A-Za-z]+$");
        if (compile.matcher(charAt + "").matches()) {
            return (charAt + "").toUpperCase();
        }
        return "热";
    }

    public static String f(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo != null ? packageInfo.versionName : "1.0.0";
        } catch (Exception unused) {
            return "1.0.0";
        }
    }

    public static String g() {
        return Build.CPU_ABI;
    }

    public static int h() {
        if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        }
        try {
            return new File("/sys/devices/system/cpu/").listFiles(f26340a).length;
        } catch (NullPointerException | SecurityException unused) {
            return 0;
        }
    }

    public static String i() {
        return Build.HARDWARE;
    }

    public static String j(Context context) {
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (myPid == runningAppProcessInfo.pid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    public static long k() {
        return System.currentTimeMillis();
    }

    public static String l() {
        return Build.BRAND;
    }

    public static String m() {
        return Build.MODEL;
    }

    public static String n() {
        return Build.DEVICE;
    }

    public static String o(String str) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        } catch (NoSuchAlgorithmException unused) {
        }
        byte[] digest = messageDigest.digest();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < digest.length; i2++) {
            if (Integer.toHexString(digest[i2] & 255).length() == 1) {
                stringBuffer.append("0");
                stringBuffer.append(Integer.toHexString(digest[i2] & 255));
            } else {
                stringBuffer.append(Integer.toHexString(digest[i2] & 255));
            }
        }
        return stringBuffer.toString();
    }

    public static String p(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j2 = memoryInfo.availMem / 1000000;
        long j3 = memoryInfo.threshold / 1000000;
        long j4 = memoryInfo.totalMem;
        return j4 + "";
    }

    public static String q(double d2) {
        return r(d2, true);
    }

    public static String r(double d2, boolean z) {
        String valueOf = String.valueOf(new BigDecimal(d2).setScale(2, 4));
        if (Integer.parseInt(valueOf.substring(valueOf.lastIndexOf(".") + 1)) == 0) {
            valueOf = valueOf.substring(0, valueOf.lastIndexOf("."));
        } else if (valueOf.substring(valueOf.length() - 1).equals("0")) {
            valueOf = valueOf.substring(0, valueOf.length() - 1);
        }
        if (z) {
            return "¥" + valueOf;
        }
        return valueOf;
    }

    public static String s(String str) {
        try {
            return r(Double.parseDouble(str), true);
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static String t(String str, boolean z) {
        if (z) {
            return "¥" + str;
        }
        return str;
    }

    public static String u(double d2, boolean z) {
        return r(d2, z);
    }

    public static String v(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting()) {
                int type = activeNetworkInfo.getType();
                int subtype = activeNetworkInfo.getSubtype();
                if (type == 1) {
                    return "WIFI";
                }
                if (type == 0 && subtype == 3) {
                    if (!telephonyManager.isNetworkRoaming()) {
                        return n0.f26349g;
                    }
                }
            }
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String w(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.substring(0, 3) + "****" + str.substring(7, str.length());
    }

    public static String x(Context context) {
        try {
            return z.f((Activity) context).widthPixels + "x" + z.f((Activity) context).heightPixels;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String y(int i2) {
        char[] charArray = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        String str = "";
        int i3 = 0;
        while (i3 < i2) {
            char c = charArray[(int) (Math.random() * 36.0d)];
            if (str.contains(String.valueOf(c))) {
                i3--;
            } else {
                str = str + c;
            }
            i3++;
        }
        return str;
    }

    public static int z() {
        try {
            return Integer.valueOf(Build.VERSION.SDK).intValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
