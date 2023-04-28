package com.sobot.chat.notchlib.utils;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class RomUtils {
    private static final String HUAWEI = "huawei";
    private static final String OPPO = "oppo";
    private static final String UNKNOWN = "unknown";
    private static final String VERSION_PROPERTY_HUAWEI = "ro.build.version.emui";
    private static final String VERSION_PROPERTY_OPPO = "ro.build.version.opporom";
    private static final String VERSION_PROPERTY_VIVO = "ro.vivo.os.build.display.id";
    private static final String VERSION_PROPERTY_XIAOMI = "ro.build.version.incremental";
    private static final String VIVO = "vivo";
    private static final String XIAOMI = "xiaomi";
    private static RomInfo bean;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class RomInfo {
        private String name;
        private String version;

        public static /* synthetic */ String access$000(RomInfo romInfo) {
        }

        public static /* synthetic */ String access$002(RomInfo romInfo, String str) {
        }

        public static /* synthetic */ String access$102(RomInfo romInfo, String str) {
        }

        public String getName() {
        }

        public String getVersion() {
        }

        public String toString() {
        }
    }

    private RomUtils() {
    }

    private static String getBrand() {
    }

    private static String getManufacturer() {
    }

    public static RomInfo getRomInfo() {
    }

    private static String getRomVersion(String str) {
    }

    private static String getSystemProperty(String str) {
    }

    private static String getSystemPropertyByReflect(String str) {
    }

    private static String getSystemPropertyByShell(String str) {
    }

    private static String getSystemPropertyByStream(String str) {
    }

    public static boolean isHuawei() {
    }

    public static boolean isOppo() {
    }

    private static boolean isRightRom(String str, String str2, String... strArr) {
    }

    public static boolean isVivo() {
    }

    public static boolean isXiaomi() {
    }
}
