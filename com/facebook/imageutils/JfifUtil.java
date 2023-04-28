package com.facebook.imageutils;

import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class JfifUtil {
    public static final int APP1_EXIF_MAGIC = 1165519206;
    public static final int MARKER_APP1 = 225;
    public static final int MARKER_EOI = 217;
    public static final int MARKER_ESCAPE_BYTE = 0;
    public static final int MARKER_FIRST_BYTE = 255;
    public static final int MARKER_RST0 = 208;
    public static final int MARKER_RST7 = 215;
    public static final int MARKER_SOFn = 192;
    public static final int MARKER_SOI = 216;
    public static final int MARKER_SOS = 218;
    public static final int MARKER_TEM = 1;

    private JfifUtil() {
    }

    public static int getAutoRotateAngleFromOrientation(int orientation) {
    }

    public static int getOrientation(byte[] jpeg) {
    }

    private static boolean isSOFn(int marker) {
    }

    private static int moveToAPP1EXIF(InputStream is) throws IOException {
    }

    public static boolean moveToMarker(InputStream is, int markerToFind) throws IOException {
    }

    public static int getOrientation(InputStream is) {
    }
}
