package com.facebook.imageutils;

import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TiffUtil {
    private static final Class<?> TAG = null;
    public static final int TIFF_BYTE_ORDER_BIG_END = 1296891946;
    public static final int TIFF_BYTE_ORDER_LITTLE_END = 1229531648;
    public static final int TIFF_TAG_ORIENTATION = 274;
    public static final int TIFF_TYPE_SHORT = 3;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class TiffHeader {
        public int byteOrder;
        public int firstIfdOffset;
        public boolean isLittleEndian;

        private TiffHeader() {
        }

        public /* synthetic */ TiffHeader(AnonymousClass1 anonymousClass1) {
        }
    }

    public static int getAutoRotateAngleFromOrientation(int orientation) {
    }

    private static int getOrientationFromTiffEntry(InputStream is, int length, boolean isLittleEndian) throws IOException {
    }

    private static int moveToTiffEntryWithTag(InputStream is, int length, boolean isLittleEndian, int tagToFind) throws IOException {
    }

    public static int readOrientationFromTIFF(InputStream is, int length) throws IOException {
    }

    private static int readTiffHeader(InputStream is, int length, TiffHeader tiffHeader) throws IOException {
    }
}
