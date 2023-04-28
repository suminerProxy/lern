package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class ByteBufferWriter {
    private static final ThreadLocal<SoftReference<byte[]>> BUFFER = null;
    private static final float BUFFER_REALLOCATION_THRESHOLD = 0.5f;
    private static final long CHANNEL_FIELD_OFFSET = 0;
    private static final Class<?> FILE_OUTPUT_STREAM_CLASS = null;
    private static final int MAX_CACHED_BUFFER_SIZE = 16384;
    private static final int MIN_CACHED_BUFFER_SIZE = 1024;

    private ByteBufferWriter() {
    }

    public static void clearCachedBuffer() {
    }

    private static byte[] getBuffer() {
    }

    private static long getChannelFieldOffset(Class<?> cls) {
    }

    private static byte[] getOrCreateBuffer(int i2) {
    }

    private static boolean needToReallocate(int i2, int i3) {
    }

    private static Class<?> safeGetClass(String str) {
    }

    private static void setBuffer(byte[] bArr) {
    }

    public static void write(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
    }

    private static boolean writeToChannel(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
    }
}
