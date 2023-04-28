package com.facebook.imageutils;

import android.util.Pair;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class WebpUtil {
    private static final String VP8L_HEADER = "VP8L";
    private static final String VP8X_HEADER = "VP8X";
    private static final String VP8_HEADER = "VP8 ";

    private WebpUtil() {
    }

    private static boolean compare(byte[] what, String with) {
    }

    public static int get2BytesAsInt(InputStream is) throws IOException {
    }

    private static byte getByte(InputStream is) throws IOException {
    }

    private static String getHeader(byte[] header) {
    }

    private static int getInt(InputStream is) throws IOException {
    }

    private static short getShort(InputStream is) throws IOException {
    }

    @Nullable
    public static Pair<Integer, Integer> getSize(InputStream is) {
    }

    @Nullable
    private static Pair<Integer, Integer> getVP8Dimension(final InputStream is) throws IOException {
    }

    @Nullable
    private static Pair<Integer, Integer> getVP8LDimension(final InputStream is) throws IOException {
    }

    private static Pair<Integer, Integer> getVP8XDimension(final InputStream is) throws IOException {
    }

    private static boolean isBitOne(byte input, int bitIndex) {
    }

    private static int read3Bytes(InputStream is) throws IOException {
    }
}
