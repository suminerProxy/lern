package com.facebook.imageformat;

import com.facebook.imageformat.ImageFormat;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DefaultImageFormatChecker implements ImageFormat.FormatChecker {
    private static final byte[] BMP_HEADER = null;
    private static final int BMP_HEADER_LENGTH = 0;
    private static final byte[] DNG_HEADER_II = null;
    private static final int DNG_HEADER_LENGTH = 0;
    private static final byte[] DNG_HEADER_MM = null;
    private static final int EXTENDED_WEBP_HEADER_LENGTH = 21;
    private static final byte[] GIF_HEADER_87A = null;
    private static final byte[] GIF_HEADER_89A = null;
    private static final int GIF_HEADER_LENGTH = 6;
    private static final int HEIF_HEADER_LENGTH = 12;
    private static final byte[] HEIF_HEADER_PREFIX = null;
    private static final byte[][] HEIF_HEADER_SUFFIXES = null;
    private static final byte[] ICO_HEADER = null;
    private static final int ICO_HEADER_LENGTH = 0;
    private static final byte[] JPEG_HEADER = null;
    private static final int JPEG_HEADER_LENGTH = 0;
    private static final byte[] PNG_HEADER = null;
    private static final int PNG_HEADER_LENGTH = 0;
    private static final int SIMPLE_WEBP_HEADER_LENGTH = 20;
    public final int MAX_HEADER_LENGTH;
    private boolean mUseNewOrder;

    private static ImageFormat getWebpFormat(final byte[] imageHeaderBytes, final int headerSize) {
    }

    private static boolean isBmpHeader(final byte[] imageHeaderBytes, final int headerSize) {
    }

    private static boolean isDngHeader(final byte[] imageHeaderBytes, final int headerSize) {
    }

    private static boolean isGifHeader(final byte[] imageHeaderBytes, final int headerSize) {
    }

    private static boolean isHeifHeader(final byte[] imageHeaderBytes, final int headerSize) {
    }

    private static boolean isIcoHeader(final byte[] imageHeaderBytes, final int headerSize) {
    }

    private static boolean isJpegHeader(final byte[] imageHeaderBytes, final int headerSize) {
    }

    private static boolean isPngHeader(final byte[] imageHeaderBytes, final int headerSize) {
    }

    @Override // com.facebook.imageformat.ImageFormat.FormatChecker
    @Nullable
    public final ImageFormat determineFormat(byte[] headerBytes, int headerSize) {
    }

    @Override // com.facebook.imageformat.ImageFormat.FormatChecker
    public int getHeaderSize() {
    }

    public void setUseNewOrder(boolean useNewOrder) {
    }
}
