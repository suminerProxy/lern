package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    public static final int COMPLETE = 0;
    public static final int MALFORMED = -1;
    public static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class DecodeUtil {
        private DecodeUtil() {
        }

        public static /* synthetic */ void access$1000(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) throws InvalidProtocolBufferException {
        }

        public static /* synthetic */ boolean access$400(byte b) {
        }

        public static /* synthetic */ void access$500(byte b, char[] cArr, int i2) {
        }

        public static /* synthetic */ boolean access$600(byte b) {
        }

        public static /* synthetic */ void access$700(byte b, byte b2, char[] cArr, int i2) throws InvalidProtocolBufferException {
        }

        public static /* synthetic */ boolean access$800(byte b) {
        }

        public static /* synthetic */ void access$900(byte b, byte b2, byte b3, char[] cArr, int i2) throws InvalidProtocolBufferException {
        }

        private static void handleFourBytes(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) throws InvalidProtocolBufferException {
        }

        private static void handleOneByte(byte b, char[] cArr, int i2) {
        }

        private static void handleThreeBytes(byte b, byte b2, byte b3, char[] cArr, int i2) throws InvalidProtocolBufferException {
        }

        private static void handleTwoBytes(byte b, byte b2, char[] cArr, int i2) throws InvalidProtocolBufferException {
        }

        private static char highSurrogate(int i2) {
        }

        private static boolean isNotTrailingByte(byte b) {
        }

        private static boolean isOneByte(byte b) {
        }

        private static boolean isThreeBytes(byte b) {
        }

        private static boolean isTwoBytes(byte b) {
        }

        private static char lowSurrogate(int i2) {
        }

        private static int trailingByteValue(byte b) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class Processor {
        public final String decodeUtf8(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
        }

        public abstract String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException;

        public final String decodeUtf8Default(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
        }

        public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException;

        public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i2, int i3);

        public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        }

        public final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
        }

        public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        public final boolean isValidUtf8(byte[] bArr, int i2, int i3) {
        }

        public final int partialIsValidUtf8(int i2, ByteBuffer byteBuffer, int i3, int i4) {
        }

        public abstract int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i4);

        public final int partialIsValidUtf8Default(int i2, ByteBuffer byteBuffer, int i3, int i4) {
        }

        public abstract int partialIsValidUtf8Direct(int i2, ByteBuffer byteBuffer, int i3, int i4);

        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i2, int i3) {
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class UnsafeProcessor extends Processor {
        public static boolean isAvailable() {
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j2, int i2) {
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i2, long j2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i4) {
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int partialIsValidUtf8Direct(int i2, ByteBuffer byteBuffer, int i3, int i4) {
        }

        private static int unsafeEstimateConsecutiveAscii(long j2, int i2) {
        }

        private static int unsafeIncompleteStateFor(long j2, int i2, int i3) {
        }

        private static int partialIsValidUtf8(byte[] bArr, long j2, int i2) {
        }

        private static int partialIsValidUtf8(long j2, int i2) {
        }
    }

    private Utf8() {
    }

    public static /* synthetic */ int access$000(int i2, int i3) {
    }

    public static /* synthetic */ int access$100(int i2, int i3, int i4) {
    }

    public static /* synthetic */ int access$1100(byte[] bArr, int i2, int i3) {
    }

    public static /* synthetic */ int access$1200(int i2) {
    }

    public static /* synthetic */ int access$200(ByteBuffer byteBuffer, int i2, int i3) {
    }

    public static /* synthetic */ int access$300(ByteBuffer byteBuffer, int i2, int i3, int i4) {
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
    }

    public static int encode(CharSequence charSequence, byte[] bArr, int i2, int i3) {
    }

    public static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
    }

    public static int encodedLength(CharSequence charSequence) {
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i2) {
    }

    private static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i2, int i3) {
    }

    private static int incompleteStateFor(int i2) {
    }

    private static int incompleteStateFor(int i2, int i3) {
    }

    private static int incompleteStateFor(int i2, int i3, int i4) {
    }

    private static int incompleteStateFor(byte[] bArr, int i2, int i3) {
    }

    public static boolean isValidUtf8(byte[] bArr) {
    }

    public static int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i4) {
    }

    public static String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
    }

    public static boolean isValidUtf8(byte[] bArr, int i2, int i3) {
    }

    public static int partialIsValidUtf8(int i2, ByteBuffer byteBuffer, int i3, int i4) {
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
    }

    private static int incompleteStateFor(ByteBuffer byteBuffer, int i2, int i3, int i4) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class SafeProcessor extends Processor {
        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i4) {
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int partialIsValidUtf8Direct(int i2, ByteBuffer byteBuffer, int i3, int i4) {
        }

        private static int partialIsValidUtf8(byte[] bArr, int i2, int i3) {
        }
    }
}
