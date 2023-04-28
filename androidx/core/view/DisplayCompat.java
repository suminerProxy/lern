package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class DisplayCompat {
    private static final int DISPLAY_SIZE_4K_HEIGHT = 2160;
    private static final int DISPLAY_SIZE_4K_WIDTH = 3840;

    private DisplayCompat() {
    }

    private static Point getPhysicalDisplaySize(@NonNull Context context, @NonNull Display display) {
    }

    @NonNull
    @SuppressLint({"ArrayReturn"})
    public static ModeCompat[] getSupportedModes(@NonNull Context context, @NonNull Display display) {
    }

    @Nullable
    private static String getSystemProperty(String str) {
    }

    private static boolean isSonyBravia4kTv(@NonNull Context context) {
    }

    private static boolean isTv(@NonNull Context context) {
    }

    private static Point parseDisplaySize(@NonNull String str) throws NumberFormatException {
    }

    @Nullable
    private static Point parsePhysicalDisplaySizeFromSystemProperties(@NonNull String str, @NonNull Display display) {
    }

    @RequiresApi(23)
    private static boolean physicalSizeEquals(Display.Mode mode, Point point) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ModeCompat {
        private final boolean mIsNative;
        private final Display.Mode mMode;
        private final Point mPhysicalDisplaySize;

        public ModeCompat(@NonNull Point point) {
        }

        public int getPhysicalHeight() {
        }

        public int getPhysicalWidth() {
        }

        public boolean isNative() {
        }

        @Nullable
        @RequiresApi(23)
        public Display.Mode toMode() {
        }

        @RequiresApi(23)
        public ModeCompat(@NonNull Display.Mode mode, boolean z) {
        }
    }
}
