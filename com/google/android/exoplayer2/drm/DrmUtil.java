package com.google.android.exoplayer2.drm;

import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DrmUtil {
    public static final int ERROR_SOURCE_EXO_MEDIA_DRM = 1;
    public static final int ERROR_SOURCE_LICENSE_ACQUISITION = 2;
    public static final int ERROR_SOURCE_PROVISIONING = 3;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface ErrorSource {
    }

    @RequiresApi(18)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PlatformOperationsWrapperV18 {
        private PlatformOperationsWrapperV18() {
        }

        @DoNotInline
        public static boolean isDeniedByServerException(@Nullable Throwable throwable) {
        }

        @DoNotInline
        public static boolean isNotProvisionedException(@Nullable Throwable throwable) {
        }
    }

    @RequiresApi(21)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PlatformOperationsWrapperV21 {
        private PlatformOperationsWrapperV21() {
        }

        @DoNotInline
        public static boolean isMediaDrmStateException(@Nullable Throwable throwable) {
        }

        @DoNotInline
        public static int mediaDrmStateExceptionToErrorCode(Throwable throwable) {
        }
    }

    @RequiresApi(23)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PlatformOperationsWrapperV23 {
        private PlatformOperationsWrapperV23() {
        }

        @DoNotInline
        public static boolean isMediaDrmResetException(@Nullable Throwable throwable) {
        }
    }

    private DrmUtil() {
    }

    public static int getErrorCodeForMediaDrmException(Exception exception, int errorSource) {
    }
}
