package com.tencent.thumbplayer.core.common;

import android.content.Context;
import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Method;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPSystemInfo {
    public static final int CHIP_ARM_AARCH64 = 7;
    public static final int CHIP_ARM_LATER = 50;
    public static final int CHIP_ARM_V5 = 3;
    public static final int CHIP_ARM_V6 = 4;
    public static final int CHIP_ARM_V7_NENO = 6;
    public static final int CHIP_ARM_V7_NO_NENO = 5;
    public static final int CHIP_MIPS = 2;
    public static final int CHIP_UNKNOW = 0;
    public static final int CHIP_X86 = 1;
    public static final int CPU_HW_HISI = 2;
    public static final int CPU_HW_MTK = 1;
    public static final int CPU_HW_OTHER = -1;
    public static final int CPU_HW_QUALCOMM = 0;
    public static final int CPU_HW_SUMSUNG = 3;
    private static String DEVICE_MANUFACTURER = "";
    private static String DEVICE_NAME = "";
    private static String DEVICE_OS_VERSION = "";
    public static final String KEY_PROPERTY_BOARD = "ro.product.board";
    public static final String KEY_PROPERTY_DEVICE = "ro.product.device";
    public static final String KEY_PROPERTY_MANUFACTURER = "ro.product.manufacturer";
    public static final String KEY_PROPERTY_MODEL = "ro.product.model";
    public static final String KEY_PROPERTY_VERSION_RELEASE = "ro.build.version.release";
    private static String PRODUCT_BOARD = "";
    private static String PRODUCT_DEVICE = "";
    public static final int SDK_INT = 0;
    private static long sAppInstallTime = 0;
    private static int sAudioBestFramesPerBust = 0;
    private static int sAudioBestSampleRate = 0;
    private static int sCpuArch = -1;
    private static int sCpuArchitecture = 0;
    private static int sCpuHWProductIdx = -1;
    private static int sCpuHWProducter = -1;
    private static String sCpuHardware = "";
    private static final String[][] sCpuPerfList = null;
    private static long sCurrentCpuFreq = -1;
    private static String sFeature = "";
    private static Method sGetWlanMethod = null;
    private static long sMaxCpuFreq = -1;
    private static int sNumOfCores = -1;
    private static int sOpenGLVersion = 0;
    private static String sProcessorName = "N/A";
    public static int sScreenHeight;
    public static int sScreenWidth;

    /* renamed from: com.tencent.thumbplayer.core.common.TPSystemInfo$1CpuFilter  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class C1CpuFilter implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
        }
    }

    private static boolean checkPermission(Context context, String str) {
    }

    public static int getApiLevel() {
    }

    public static int getBestAudioFramesPerBust() {
    }

    public static int getBestAudioSampleRate() {
    }

    public static int getCpuArchFromId(int i2) {
    }

    public static int getCpuArchitecture() {
    }

    private static int getCpuHWProducer(String str) {
    }

    public static int getCpuHWProductIndex(String str) {
    }

    public static int getCpuHWProducter(String str) {
    }

    public static String getCpuHarewareName() {
    }

    public static void getCpuInfo() {
    }

    public static long getCurrentCpuFreq() {
    }

    public static String getDeviceManufacturer() {
    }

    public static String getDeviceName() {
    }

    public static long getMaxCpuFreq() {
    }

    public static int getNumCores() {
    }

    public static int getOpenGLSupportVersion(Context context) {
    }

    public static String getOsVersion() {
    }

    public static String getProductBoard() {
    }

    public static String getProductDevice() {
    }

    public static int getScreenHeight(Context context) {
    }

    public static int getScreenWidth(Context context) {
    }

    public static int getSystemCpuUsage(String str, String str2) {
    }

    public static long getSystemIdleTime(String[] strArr) {
    }

    public static long getSystemUptime(String[] strArr) {
    }

    private static boolean hasMarshmallow() {
    }

    public static synchronized void initAudioBestSettings(Context context) {
    }

    public static boolean isARMV5Whitelist() {
    }

    private static void parseCpuInfoLine(String str) {
    }

    private static String readStringFromFile(File file) {
    }

    public static String readSystemStat() {
    }

    public static void setProperty(String str, String str2) {
    }

    public static boolean supportInDeviceDolbyAudioEffect() {
    }

    private static void writeStringToFile(String str, String str2) {
    }
}
