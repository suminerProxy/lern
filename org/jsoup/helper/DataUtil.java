package org.jsoup.helper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.regex.Pattern;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class DataUtil {
    public static final int boundaryLength = 32;
    public static final int bufferSize = 32768;
    private static final Pattern charsetPattern = null;
    public static final String defaultCharset = "UTF-8";
    private static final int firstReadBufferSize = 5120;
    private static final char[] mimeBoundaryChars = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class BomCharset {
        private final String charset;
        private final boolean offset;

        public BomCharset(String str, boolean z) {
        }

        public static /* synthetic */ String access$000(BomCharset bomCharset) {
        }

        public static /* synthetic */ boolean access$100(BomCharset bomCharset) {
        }
    }

    private DataUtil() {
    }

    public static void crossStreams(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    private static BomCharset detectCharsetFromBom(ByteBuffer byteBuffer) {
    }

    public static ByteBuffer emptyByteBuffer() {
    }

    public static String getCharsetFromContentType(String str) {
    }

    public static Document load(File file, String str, String str2) throws IOException {
    }

    public static String mimeBoundary() {
    }

    public static Document parseInputStream(InputStream inputStream, String str, String str2, Parser parser) throws IOException {
    }

    public static ByteBuffer readFileToByteBuffer(File file) throws IOException {
    }

    public static ByteBuffer readToByteBuffer(InputStream inputStream, int i2) throws IOException {
    }

    private static String validateCharset(String str) {
    }

    public static Document load(InputStream inputStream, String str, String str2) throws IOException {
    }

    public static Document load(InputStream inputStream, String str, String str2, Parser parser) throws IOException {
    }

    public static ByteBuffer readToByteBuffer(InputStream inputStream) throws IOException {
    }
}
