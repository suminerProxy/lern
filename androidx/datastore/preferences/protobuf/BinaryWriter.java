package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class BinaryWriter extends ByteOutput implements Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final BufferAllocator alloc;
    public final ArrayDeque<AllocatedBuffer> buffers;
    private final int chunkSize;
    public int totalDoneBytes;

    /* renamed from: androidx.datastore.preferences.protobuf.BinaryWriter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class SafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;

        public SafeDirectWriter(BufferAllocator bufferAllocator, int i2) {
        }

        private int bytesWrittenToCurrentBuffer() {
        }

        private void nextBuffer() {
        }

        private int spaceLeft() {
        }

        private void writeVarint32FiveBytes(int i2) {
        }

        private void writeVarint32FourBytes(int i2) {
        }

        private void writeVarint32OneByte(int i2) {
        }

        private void writeVarint32ThreeBytes(int i2) {
        }

        private void writeVarint32TwoBytes(int i2) {
        }

        private void writeVarint64EightBytes(long j2) {
        }

        private void writeVarint64EightBytesWithSign(long j2) {
        }

        private void writeVarint64FiveBytes(long j2) {
        }

        private void writeVarint64FourBytes(long j2) {
        }

        private void writeVarint64NineBytes(long j2) {
        }

        private void writeVarint64OneByte(long j2) {
        }

        private void writeVarint64SevenBytes(long j2) {
        }

        private void writeVarint64SixBytes(long j2) {
        }

        private void writeVarint64TenBytes(long j2) {
        }

        private void writeVarint64ThreeBytes(long j2) {
        }

        private void writeVarint64TwoBytes(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void finishCurrentBuffer() {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void requireSpace(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i2, boolean z) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int i2, ByteString byteString) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeEndGroup(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int i2, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int i2, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeStartGroup(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int i2, String str) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeTag(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int i2, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint64(long j2) {
        }

        private void nextBuffer(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) {
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeBool(boolean z) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed64(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeInt32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt64(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeString(String str) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class SafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int limit;
        private int limitMinusOne;
        private int offset;
        private int offsetMinusOne;
        private int pos;

        public SafeHeapWriter(BufferAllocator bufferAllocator, int i2) {
        }

        private void nextBuffer() {
        }

        private void writeVarint32FiveBytes(int i2) {
        }

        private void writeVarint32FourBytes(int i2) {
        }

        private void writeVarint32OneByte(int i2) {
        }

        private void writeVarint32ThreeBytes(int i2) {
        }

        private void writeVarint32TwoBytes(int i2) {
        }

        private void writeVarint64EightBytes(long j2) {
        }

        private void writeVarint64FiveBytes(long j2) {
        }

        private void writeVarint64FourBytes(long j2) {
        }

        private void writeVarint64NineBytes(long j2) {
        }

        private void writeVarint64OneByte(long j2) {
        }

        private void writeVarint64SevenBytes(long j2) {
        }

        private void writeVarint64SixBytes(long j2) {
        }

        private void writeVarint64TenBytes(long j2) {
        }

        private void writeVarint64ThreeBytes(long j2) {
        }

        private void writeVarint64TwoBytes(long j2) {
        }

        public int bytesWrittenToCurrentBuffer() {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void finishCurrentBuffer() {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void requireSpace(int i2) {
        }

        public int spaceLeft() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i2, boolean z) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int i2, ByteString byteString) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeEndGroup(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int i2, long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int i2, long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeStartGroup(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int i2, String str) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeTag(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int i2, long j2) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint64(long j2) {
        }

        private void nextBuffer(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) {
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeBool(boolean z) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed64(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeInt32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt64(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeString(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class UnsafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;

        public UnsafeDirectWriter(BufferAllocator bufferAllocator, int i2) {
        }

        public static /* synthetic */ boolean access$000() {
        }

        private int bufferPos() {
        }

        private int bytesWrittenToCurrentBuffer() {
        }

        private static boolean isSupported() {
        }

        private void nextBuffer() {
        }

        private int spaceLeft() {
        }

        private void writeVarint32FiveBytes(int i2) {
        }

        private void writeVarint32FourBytes(int i2) {
        }

        private void writeVarint32OneByte(int i2) {
        }

        private void writeVarint32ThreeBytes(int i2) {
        }

        private void writeVarint32TwoBytes(int i2) {
        }

        private void writeVarint64EightBytes(long j2) {
        }

        private void writeVarint64FiveBytes(long j2) {
        }

        private void writeVarint64FourBytes(long j2) {
        }

        private void writeVarint64NineBytes(long j2) {
        }

        private void writeVarint64OneByte(long j2) {
        }

        private void writeVarint64SevenBytes(long j2) {
        }

        private void writeVarint64SixBytes(long j2) {
        }

        private void writeVarint64TenBytes(long j2) {
        }

        private void writeVarint64ThreeBytes(long j2) {
        }

        private void writeVarint64TwoBytes(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void finishCurrentBuffer() {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void requireSpace(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i2, boolean z) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int i2, ByteString byteString) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeEndGroup(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int i2, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int i2, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeStartGroup(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int i2, String str) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeTag(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int i2, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint64(long j2) {
        }

        private void nextBuffer(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) {
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeBool(boolean z) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed64(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeInt32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt64(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeString(String str) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class UnsafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private long limit;
        private long limitMinusOne;
        private long offset;
        private long offsetMinusOne;
        private long pos;

        public UnsafeHeapWriter(BufferAllocator bufferAllocator, int i2) {
        }

        private int arrayPos() {
        }

        public static boolean isSupported() {
        }

        private void nextBuffer() {
        }

        private void writeVarint32FiveBytes(int i2) {
        }

        private void writeVarint32FourBytes(int i2) {
        }

        private void writeVarint32OneByte(int i2) {
        }

        private void writeVarint32ThreeBytes(int i2) {
        }

        private void writeVarint32TwoBytes(int i2) {
        }

        private void writeVarint64EightBytes(long j2) {
        }

        private void writeVarint64FiveBytes(long j2) {
        }

        private void writeVarint64FourBytes(long j2) {
        }

        private void writeVarint64NineBytes(long j2) {
        }

        private void writeVarint64OneByte(long j2) {
        }

        private void writeVarint64SevenBytes(long j2) {
        }

        private void writeVarint64SixBytes(long j2) {
        }

        private void writeVarint64TenBytes(long j2) {
        }

        private void writeVarint64ThreeBytes(long j2) {
        }

        private void writeVarint64TwoBytes(long j2) {
        }

        public int bytesWrittenToCurrentBuffer() {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void finishCurrentBuffer() {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void requireSpace(int i2) {
        }

        public int spaceLeft() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i2, boolean z) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int i2, ByteString byteString) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeEndGroup(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int i2, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int i2, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeStartGroup(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int i2, String str) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeTag(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int i2, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint64(long j2) {
        }

        private void nextBuffer(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) {
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeBool(boolean z) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed64(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i2, Object obj, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeInt32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt32(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt64(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj, Schema schema) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeString(String str) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
        }
    }

    public /* synthetic */ BinaryWriter(BufferAllocator bufferAllocator, int i2, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ byte access$200(long j2) {
    }

    private static byte computeUInt64SizeNoTag(long j2) {
    }

    public static boolean isUnsafeDirectSupported() {
    }

    public static boolean isUnsafeHeapSupported() {
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator) {
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator) {
    }

    public static BinaryWriter newSafeDirectInstance(BufferAllocator bufferAllocator, int i2) {
    }

    public static BinaryWriter newSafeHeapInstance(BufferAllocator bufferAllocator, int i2) {
    }

    public static BinaryWriter newUnsafeDirectInstance(BufferAllocator bufferAllocator, int i2) {
    }

    public static BinaryWriter newUnsafeHeapInstance(BufferAllocator bufferAllocator, int i2) {
    }

    private final void writeBoolList_Internal(int i2, List<Boolean> list, boolean z) throws IOException {
    }

    private final void writeDoubleList_Internal(int i2, List<Double> list, boolean z) throws IOException {
    }

    private final void writeFixed32List_Internal(int i2, List<Integer> list, boolean z) throws IOException {
    }

    private final void writeFixed64List_Internal(int i2, List<Long> list, boolean z) throws IOException {
    }

    private final void writeFloatList_Internal(int i2, List<Float> list, boolean z) throws IOException {
    }

    private final void writeInt32List_Internal(int i2, List<Integer> list, boolean z) throws IOException {
    }

    private void writeLazyString(int i2, Object obj) throws IOException {
    }

    public static final void writeMapEntryField(Writer writer, int i2, WireFormat.FieldType fieldType, Object obj) throws IOException {
    }

    private final void writeSInt32List_Internal(int i2, List<Integer> list, boolean z) throws IOException {
    }

    private final void writeSInt64List_Internal(int i2, List<Long> list, boolean z) throws IOException {
    }

    private final void writeUInt32List_Internal(int i2, List<Integer> list, boolean z) throws IOException {
    }

    private final void writeUInt64List_Internal(int i2, List<Long> list, boolean z) throws IOException {
    }

    public final Queue<AllocatedBuffer> complete() {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
    }

    public abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    public final AllocatedBuffer newDirectBuffer() {
    }

    public final AllocatedBuffer newHeapBuffer() {
    }

    public abstract void requireSpace(int i2);

    public abstract void writeBool(boolean z);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBoolList(int i2, List<Boolean> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBytesList(int i2, List<ByteString> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDouble(int i2, double d2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDoubleList(int i2, List<Double> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnum(int i2, int i3) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnumList(int i2, List<Integer> list, boolean z) throws IOException {
    }

    public abstract void writeFixed32(int i2);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed32List(int i2, List<Integer> list, boolean z) throws IOException {
    }

    public abstract void writeFixed64(long j2);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed64List(int i2, List<Long> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloat(int i2, float f2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloatList(int i2, List<Float> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeGroupList(int i2, List<?> list) throws IOException {
    }

    public abstract void writeInt32(int i2);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt32List(int i2, List<Integer> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64(int i2, long j2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64List(int i2, List<Long> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public <K, V> void writeMap(int i2, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageList(int i2, List<?> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int i2, Object obj) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32(int i2, int i3) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32List(int i2, List<Integer> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64(int i2, long j2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64List(int i2, List<Long> list, boolean z) throws IOException {
    }

    public abstract void writeSInt32(int i2);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt32List(int i2, List<Integer> list, boolean z) throws IOException {
    }

    public abstract void writeSInt64(long j2);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt64List(int i2, List<Long> list, boolean z) throws IOException {
    }

    public abstract void writeString(String str);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeStringList(int i2, List<String> list) throws IOException {
    }

    public abstract void writeTag(int i2, int i3);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt32List(int i2, List<Integer> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt64List(int i2, List<Long> list, boolean z) throws IOException {
    }

    public abstract void writeVarint32(int i2);

    public abstract void writeVarint64(long j2);

    private BinaryWriter(BufferAllocator bufferAllocator, int i2) {
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator, int i2) {
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator, int i2) {
    }

    public final AllocatedBuffer newDirectBuffer(int i2) {
    }

    public final AllocatedBuffer newHeapBuffer(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeGroupList(int i2, List<?> list, Schema schema) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageList(int i2, List<?> list, Schema schema) throws IOException {
    }

    private final void writeBoolList_Internal(int i2, BooleanArrayList booleanArrayList, boolean z) throws IOException {
    }

    private final void writeDoubleList_Internal(int i2, DoubleArrayList doubleArrayList, boolean z) throws IOException {
    }

    private final void writeFixed32List_Internal(int i2, IntArrayList intArrayList, boolean z) throws IOException {
    }

    private final void writeFixed64List_Internal(int i2, LongArrayList longArrayList, boolean z) throws IOException {
    }

    private final void writeFloatList_Internal(int i2, FloatArrayList floatArrayList, boolean z) throws IOException {
    }

    private final void writeInt32List_Internal(int i2, IntArrayList intArrayList, boolean z) throws IOException {
    }

    private final void writeSInt32List_Internal(int i2, IntArrayList intArrayList, boolean z) throws IOException {
    }

    private final void writeSInt64List_Internal(int i2, LongArrayList longArrayList, boolean z) throws IOException {
    }

    private final void writeUInt32List_Internal(int i2, IntArrayList intArrayList, boolean z) throws IOException {
    }

    private final void writeUInt64List_Internal(int i2, LongArrayList longArrayList, boolean z) throws IOException {
    }
}
