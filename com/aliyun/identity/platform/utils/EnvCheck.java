package com.aliyun.identity.platform.utils;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class EnvCheck {
    private static final int ANDROID_VERSION_4_3 = 18;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class EnvErrorType {
        private static final /* synthetic */ EnvErrorType[] $VALUES = null;
        public static final EnvErrorType ENV_ERROR_LOW_OS = null;
        public static final EnvErrorType ENV_ERROR_NO_FRONT_CAMERA = null;
        public static final EnvErrorType ENV_ERROR_NO_PERMISSION_OF_CAMERA = null;
        public static final EnvErrorType ENV_ERROR_UNSUPPORTED_CPU = null;
        public static final EnvErrorType ENV_SUCCESS = null;

        private EnvErrorType(String str, int i2) {
        }

        public static EnvErrorType valueOf(String str) {
        }

        public static EnvErrorType[] values() {
        }
    }

    public static EnvErrorType check() {
    }

    private static boolean isLowOS() {
    }
}
