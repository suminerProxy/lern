package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = false;
    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private static final Logger logger = null;
    private boolean serializationDeterministic;
    public CodedOutputStreamWriter wrapper;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        public final byte[] buffer;
        public final int limit;
        public int position;
        public int totalBytesWritten;

        public AbstractBufferedEncoder(int i2) {
        }

        public final void buffer(byte b) {
        }

        public final void bufferFixed32NoTag(int i2) {
        }

        public final void bufferFixed64NoTag(long j2) {
        }

        public final void bufferInt32NoTag(int i2) {
        }

        public final void bufferTag(int i2, int i3) {
        }

        public final void bufferUInt32NoTag(int i2) {
        }

        public final void bufferUInt64NoTag(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ArrayEncoder extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        public ArrayEncoder(byte[] bArr, int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte b) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i2, boolean z) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i2, byte[] bArr) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i2, ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i2, long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i2, MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i2, MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i2, ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i2, String str) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i2, long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i2, byte[] bArr, int i3, int i4) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i2, MessageLite messageLite, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput out;

        public ByteOutputEncoder(ByteOutput byteOutput, int i2) {
        }

        private void doFlush() throws IOException {
        }

        private void flushIfNotAvailable(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i2, ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i2, MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i2, MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i2, ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr, int i3, int i4) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i2, MessageLite messageLite, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class HeapNioEncoder extends ArrayEncoder {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        public HeapNioEncoder(ByteBuffer byteBuffer) {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream.ArrayEncoder, androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
        }

        public OutOfSpaceException(String str) {
        }

        public OutOfSpaceException(Throwable th) {
        }

        public OutOfSpaceException(String str, Throwable th) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream out;

        public OutputStreamEncoder(OutputStream outputStream, int i2) {
        }

        private void doFlush() throws IOException {
        }

        private void flushIfNotAvailable(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i2, ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i2, MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i2, MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i2, ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr, int i3, int i4) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i2, MessageLite messageLite, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class SafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        public SafeDirectNioEncoder(ByteBuffer byteBuffer) {
        }

        private void encode(String str) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int spaceLeft() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i2, ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i2, MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i2, MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i2, ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr, int i3, int i4) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i2, MessageLite messageLite, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final ByteBuffer originalBuffer;
        private long position;

        public UnsafeDirectNioEncoder(ByteBuffer byteBuffer) {
        }

        private int bufferPos(long j2) {
        }

        public static boolean isSupported() {
        }

        private void repositionBuffer(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int spaceLeft() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i2, ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i2, MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i2, MessageLite messageLite) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i2, ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr, int i3, int i4) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i2, MessageLite messageLite, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
        }
    }

    public /* synthetic */ CodedOutputStream(AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ boolean access$100() {
    }

    public static int computeBoolSize(int i2, boolean z) {
    }

    public static int computeBoolSizeNoTag(boolean z) {
    }

    public static int computeByteArraySize(int i2, byte[] bArr) {
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
    }

    public static int computeByteBufferSize(int i2, ByteBuffer byteBuffer) {
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
    }

    public static int computeBytesSize(int i2, ByteString byteString) {
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
    }

    public static int computeDoubleSize(int i2, double d2) {
    }

    public static int computeDoubleSizeNoTag(double d2) {
    }

    public static int computeEnumSize(int i2, int i3) {
    }

    public static int computeEnumSizeNoTag(int i2) {
    }

    public static int computeFixed32Size(int i2, int i3) {
    }

    public static int computeFixed32SizeNoTag(int i2) {
    }

    public static int computeFixed64Size(int i2, long j2) {
    }

    public static int computeFixed64SizeNoTag(long j2) {
    }

    public static int computeFloatSize(int i2, float f2) {
    }

    public static int computeFloatSizeNoTag(float f2) {
    }

    @Deprecated
    public static int computeGroupSize(int i2, MessageLite messageLite) {
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
    }

    public static int computeInt32Size(int i2, int i3) {
    }

    public static int computeInt32SizeNoTag(int i2) {
    }

    public static int computeInt64Size(int i2, long j2) {
    }

    public static int computeInt64SizeNoTag(long j2) {
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i2, LazyFieldLite lazyFieldLite) {
    }

    public static int computeLazyFieldSize(int i2, LazyFieldLite lazyFieldLite) {
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
    }

    public static int computeLengthDelimitedFieldSize(int i2) {
    }

    public static int computeMessageSetExtensionSize(int i2, MessageLite messageLite) {
    }

    public static int computeMessageSize(int i2, MessageLite messageLite) {
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
    }

    public static int computePreferredBufferSize(int i2) {
    }

    public static int computeRawMessageSetExtensionSize(int i2, ByteString byteString) {
    }

    @Deprecated
    public static int computeRawVarint32Size(int i2) {
    }

    @Deprecated
    public static int computeRawVarint64Size(long j2) {
    }

    public static int computeSFixed32Size(int i2, int i3) {
    }

    public static int computeSFixed32SizeNoTag(int i2) {
    }

    public static int computeSFixed64Size(int i2, long j2) {
    }

    public static int computeSFixed64SizeNoTag(long j2) {
    }

    public static int computeSInt32Size(int i2, int i3) {
    }

    public static int computeSInt32SizeNoTag(int i2) {
    }

    public static int computeSInt64Size(int i2, long j2) {
    }

    public static int computeSInt64SizeNoTag(long j2) {
    }

    public static int computeStringSize(int i2, String str) {
    }

    public static int computeStringSizeNoTag(String str) {
    }

    public static int computeTagSize(int i2) {
    }

    public static int computeUInt32Size(int i2, int i3) {
    }

    public static int computeUInt32SizeNoTag(int i2) {
    }

    public static int computeUInt64Size(int i2, long j2) {
    }

    public static int computeUInt64SizeNoTag(long j2) {
    }

    public static int encodeZigZag32(int i2) {
    }

    public static long encodeZigZag64(long j2) {
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
    }

    public static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
    }

    public static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
    }

    public final void checkNoSpaceLeft() {
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
    }

    public boolean isSerializationDeterministic() {
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte b) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void writeBool(int i2, boolean z) throws IOException;

    public final void writeBoolNoTag(boolean z) throws IOException {
    }

    public abstract void writeByteArray(int i2, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i2, byte[] bArr, int i3, int i4) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i2, ByteString byteString) throws IOException;

    public abstract void writeBytesNoTag(ByteString byteString) throws IOException;

    public final void writeDouble(int i2, double d2) throws IOException {
    }

    public final void writeDoubleNoTag(double d2) throws IOException {
    }

    public final void writeEnum(int i2, int i3) throws IOException {
    }

    public final void writeEnumNoTag(int i2) throws IOException {
    }

    public abstract void writeFixed32(int i2, int i3) throws IOException;

    public abstract void writeFixed32NoTag(int i2) throws IOException;

    public abstract void writeFixed64(int i2, long j2) throws IOException;

    public abstract void writeFixed64NoTag(long j2) throws IOException;

    public final void writeFloat(int i2, float f2) throws IOException {
    }

    public final void writeFloatNoTag(float f2) throws IOException {
    }

    @Deprecated
    public final void writeGroup(int i2, MessageLite messageLite) throws IOException {
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) throws IOException {
    }

    public abstract void writeInt32(int i2, int i3) throws IOException;

    public abstract void writeInt32NoTag(int i2) throws IOException;

    public final void writeInt64(int i2, long j2) throws IOException {
    }

    public final void writeInt64NoTag(long j2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void writeMessage(int i2, MessageLite messageLite) throws IOException;

    public abstract void writeMessage(int i2, MessageLite messageLite, Schema schema) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException;

    public abstract void writeMessageSetExtension(int i2, MessageLite messageLite) throws IOException;

    public final void writeRawByte(byte b) throws IOException {
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i2) throws IOException {
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j2) throws IOException {
    }

    public abstract void writeRawMessageSetExtension(int i2, ByteString byteString) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i2) throws IOException {
    }

    @Deprecated
    public final void writeRawVarint64(long j2) throws IOException {
    }

    public final void writeSFixed32(int i2, int i3) throws IOException {
    }

    public final void writeSFixed32NoTag(int i2) throws IOException {
    }

    public final void writeSFixed64(int i2, long j2) throws IOException {
    }

    public final void writeSFixed64NoTag(long j2) throws IOException {
    }

    public final void writeSInt32(int i2, int i3) throws IOException {
    }

    public final void writeSInt32NoTag(int i2) throws IOException {
    }

    public final void writeSInt64(int i2, long j2) throws IOException {
    }

    public final void writeSInt64NoTag(long j2) throws IOException {
    }

    public abstract void writeString(int i2, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i2, int i3) throws IOException;

    public abstract void writeUInt32(int i2, int i3) throws IOException;

    public abstract void writeUInt32NoTag(int i2) throws IOException;

    public abstract void writeUInt64(int i2, long j2) throws IOException;

    public abstract void writeUInt64NoTag(long j2) throws IOException;

    private CodedOutputStream() {
    }

    @Deprecated
    public static int computeGroupSize(int i2, MessageLite messageLite, Schema schema) {
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite, Schema schema) {
    }

    public static int computeMessageSize(int i2, MessageLite messageLite, Schema schema) {
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite, Schema schema) {
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i2) {
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite, Schema schema) throws IOException {
    }

    public final void writeRawByte(int i2) throws IOException {
    }

    public final void writeRawBytes(byte[] bArr, int i2, int i3) throws IOException {
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i2, int i3) {
    }

    @Deprecated
    public final void writeGroup(int i2, MessageLite messageLite, Schema schema) throws IOException {
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i2) {
    }

    public static CodedOutputStream newInstance(ByteOutput byteOutput, int i2) {
    }
}
