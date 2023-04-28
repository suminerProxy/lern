package com.tencent.imsdk.common;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.mobile.auth.BuildConfig;
import java.io.File;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SystemUtil {
    private static final String DEVICE_ID = "DeviceID";
    private static final String DEVICE_INFO = "DeviceInfo";
    private static final String TAG = "SystemUtil";
    private static final int TIME_INTERVAL = 15000;
    private static String buildBrand = "";
    private static String buildManufacturer = "";
    private static String buildModel = "";
    private static String buildVersionRelease = "";
    private static int buildVersionSDKInt = 0;
    private static String currentProcessName = "";
    private static float lastAppCpu = 0.0f;
    private static long lastAppCpuTime = 0;
    private static long lastMemCheckTimeStamps = 0;
    private static int lastMemUsage = 0;
    private static float lastSysCpu = 0.0f;
    private static long lastSysCpuTime = 0;
    private static boolean mFirstTimeRun = true;
    private static CpuUsageMeasurer sCpuUsageMeasurer;
    private static boolean sIsLoadLibrarySuccess;
    private static boolean sRunningMemCheck;

    public static float getAppCpuUsage() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - lastAppCpuTime < C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
            return lastAppCpu;
        }
        float f2 = (getProcessCPURate()[0] / 10) / 100.0f;
        lastAppCpu = f2;
        lastAppCpuTime = currentTimeMillis;
        return f2;
    }

    public static float getAppMemory() {
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (!sRunningMemCheck) {
            long j2 = lastMemCheckTimeStamps;
            if (j2 == 0 || currentTimeMillis - j2 >= C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
                sRunningMemCheck = true;
                AsyncTask.execute(new Runnable(currentTimeMillis) { // from class: com.tencent.imsdk.common.SystemUtil.1
                    public final /* synthetic */ long val$currentTimeMillis;

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                });
                i2 = lastMemUsage;
                return i2;
            }
        }
        i2 = lastMemUsage;
        return i2;
    }

    private static String getBuildBrand() {
        if (TextUtils.isEmpty(buildBrand)) {
            buildBrand = Build.BRAND;
        }
        return buildBrand;
    }

    private static String getBuildManufacturer() {
        if (TextUtils.isEmpty(buildManufacturer)) {
            buildManufacturer = Build.MANUFACTURER;
        }
        return buildManufacturer;
    }

    public static String getCurrentProcessName() {
        if (!TextUtils.isEmpty(currentProcessName)) {
            return currentProcessName;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            currentProcessName = processName;
            return processName;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                currentProcessName = (String) invoke;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return currentProcessName;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getDeviceID() {
        /*
            com.tencent.imsdk.common.IMContext r0 = com.tencent.imsdk.common.IMContext.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = ""
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.lang.String r2 = "DeviceInfo"
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)
            java.lang.String r2 = "DeviceID"
            boolean r4 = r0.contains(r2)
            r5 = 1
            if (r4 != 0) goto L27
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
        L25:
            r3 = r5
            goto L42
        L27:
            java.lang.String r1 = r0.getString(r2, r1)
            java.lang.String r4 = "\\w{8}(-\\w{4}){3}-\\w{12}"
            boolean r4 = java.util.regex.Pattern.matches(r4, r1)
            if (r4 == 0) goto L39
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L42
        L39:
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            goto L25
        L42:
            if (r3 == 0) goto L4e
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putString(r2, r1)
            r0.apply()
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.imsdk.common.SystemUtil.getDeviceID():java.lang.String");
    }

    public static String getDeviceType() {
        if (TextUtils.isEmpty(buildModel)) {
            buildModel = Build.MODEL;
        }
        return buildModel;
    }

    public static int getInstanceType() {
        if (isBrandXiaoMi()) {
            return 2000;
        }
        if (isBrandNewHonor()) {
            return 2006;
        }
        if (isBrandHuawei()) {
            return 2001;
        }
        if (isBrandMeizu()) {
            return 2003;
        }
        if (isBrandOppo()) {
            return 2004;
        }
        return isBrandVivo() ? 2005 : 2002;
    }

    public static int[] getProcessCPURate() {
        if (sCpuUsageMeasurer == null) {
            sCpuUsageMeasurer = new CpuUsageMeasurer();
        }
        if (mFirstTimeRun) {
            mFirstTimeRun = false;
            sCpuUsageMeasurer.getCpuUsage();
            return new int[]{0, 0};
        }
        return sCpuUsageMeasurer.getCpuUsage();
    }

    public static String getSDKInitPath() {
        Context applicationContext = IMContext.getInstance().getApplicationContext();
        if (applicationContext == null) {
            return "";
        }
        String file = applicationContext.getFilesDir().toString();
        String packageName = applicationContext.getPackageName();
        String currentProcessName2 = getCurrentProcessName();
        if (!TextUtils.isEmpty(currentProcessName2) && !packageName.equals(currentProcessName2)) {
            try {
                int lastIndexOf = currentProcessName2.lastIndexOf(":");
                if (lastIndexOf < 0) {
                    lastIndexOf = currentProcessName2.lastIndexOf(".");
                }
                if (lastIndexOf >= 0) {
                    currentProcessName2 = currentProcessName2.substring(lastIndexOf + 1);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(file);
                String str = File.separator;
                sb.append(str);
                sb.append(currentProcessName2);
                sb.append(str);
                file = sb.toString();
            } catch (Exception e2) {
                String str2 = "getSDKInitPath exception = " + e2;
            }
        }
        String str3 = "SDK Init Path: " + file;
        return file;
    }

    public static String getSDKLogPath() {
        String sb;
        Context applicationContext = IMContext.getInstance().getApplicationContext();
        if (applicationContext == null) {
            return "";
        }
        File externalFilesDir = applicationContext.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            sb = "/sdcard/Android/data/" + applicationContext.getPackageName() + "/log/tencent/imsdk";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(externalFilesDir.getAbsolutePath());
            String str = File.separator;
            sb2.append(str);
            sb2.append(BuildConfig.FLAVOR_type);
            sb2.append(str);
            sb2.append("tencent");
            sb2.append(str);
            sb2.append("imsdk");
            sb = sb2.toString();
        }
        File file = new File(sb);
        if (!file.exists() && !file.mkdirs()) {
            file = applicationContext.getFilesDir();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(file.getAbsolutePath());
        String str2 = File.separator;
        sb3.append(str2);
        String sb4 = sb3.toString();
        String packageName = applicationContext.getPackageName();
        String currentProcessName2 = getCurrentProcessName();
        if (!TextUtils.isEmpty(currentProcessName2) && !packageName.equals(currentProcessName2)) {
            try {
                int lastIndexOf = currentProcessName2.lastIndexOf(":");
                if (lastIndexOf < 0) {
                    lastIndexOf = currentProcessName2.lastIndexOf(".");
                }
                if (lastIndexOf >= 0) {
                    currentProcessName2 = currentProcessName2.substring(lastIndexOf + 1);
                }
                sb4 = sb4 + currentProcessName2 + str2;
            } catch (Exception e2) {
                String str3 = "getSDKLogPath exception = " + e2;
            }
        }
        String str4 = "SDK LOG Path: " + sb4;
        return sb4;
    }

    public static int getSDKVersion() {
        if (buildVersionSDKInt == 0) {
            buildVersionSDKInt = Build.VERSION.SDK_INT;
        }
        return buildVersionSDKInt;
    }

    public static float getSysCpuUsage() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - lastSysCpuTime < C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
            return lastSysCpu;
        }
        float f2 = (getProcessCPURate()[1] / 10) / 100.0f;
        lastSysCpu = f2;
        lastSysCpuTime = currentTimeMillis;
        return f2;
    }

    public static String getSystemVersion() {
        if (TextUtils.isEmpty(buildVersionRelease)) {
            buildVersionRelease = Build.VERSION.RELEASE;
        }
        return buildVersionRelease;
    }

    public static boolean isBrandHuawei() {
        return "huawei".equalsIgnoreCase(getBuildBrand()) || "huawei".equalsIgnoreCase(getBuildManufacturer()) || "honor".equalsIgnoreCase(getBuildBrand());
    }

    public static boolean isBrandMeizu() {
        return "meizu".equalsIgnoreCase(getBuildBrand()) || "meizu".equalsIgnoreCase(getBuildManufacturer());
    }

    public static boolean isBrandNewHonor() {
        return "honor".equalsIgnoreCase(getBuildBrand()) && "honor".equalsIgnoreCase(getBuildManufacturer());
    }

    public static boolean isBrandOppo() {
        return "oppo".equalsIgnoreCase(getBuildBrand()) || "oppo".equalsIgnoreCase(getBuildManufacturer()) || "realme".equalsIgnoreCase(getBuildBrand()) || "realme".equalsIgnoreCase(getBuildManufacturer()) || "oneplus".equalsIgnoreCase(getBuildBrand()) || "oneplus".equalsIgnoreCase(getBuildManufacturer());
    }

    public static boolean isBrandVivo() {
        return "vivo".equalsIgnoreCase(getBuildBrand()) || "vivo".equalsIgnoreCase(getBuildManufacturer());
    }

    public static boolean isBrandXiaoMi() {
        return "xiaomi".equalsIgnoreCase(getBuildBrand()) || "xiaomi".equalsIgnoreCase(getBuildManufacturer());
    }

    public static boolean isLibraryLoaded() {
        return sIsLoadLibrarySuccess;
    }

    public static boolean loadIMLibrary() {
        return loadIMLibrary(null);
    }

    public static String md5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b : MessageDigest.getInstance("MD5").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static void setBuildBrand(String str) {
        buildBrand = str;
    }

    public static void setBuildManufacturer(String str) {
        buildManufacturer = str;
    }

    public static void setBuildModel(String str) {
        buildModel = str;
    }

    public static void setBuildVersionRelease(String str) {
        buildVersionRelease = str;
    }

    public static void setBuildVersionSDKInt(int i2) {
        buildVersionSDKInt = i2;
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public static boolean loadIMLibrary(String str) {
        if (sIsLoadLibrarySuccess) {
            return true;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String str2 = str + File.separator + "libImSDK.so";
                System.load(str2);
                sIsLoadLibrarySuccess = true;
                String str3 = "system load so library success: " + str2;
            } else {
                System.loadLibrary("ImSDK");
                sIsLoadLibrarySuccess = true;
            }
        } catch (Exception e2) {
            sIsLoadLibrarySuccess = false;
            String str4 = "system load so library failed, " + e2.getMessage();
        } catch (UnsatisfiedLinkError e3) {
            sIsLoadLibrarySuccess = false;
            String str5 = "system load so library failed, " + e3.getMessage();
        }
        return sIsLoadLibrarySuccess;
    }
}
