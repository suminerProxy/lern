package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = null;
    public static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    public static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = null;
    private static final ByteArrayCopier byteArrayCopier = null;
    private int hash;

    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends AbstractByteIterator {
        private final int limit;
        private int position;
        public final /* synthetic */ ByteString this$0;

        public AnonymousClass1(ByteString byteString) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
        public byte nextByte() {
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 implements Comparator<ByteString> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(ByteString byteString, ByteString byteString2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(ByteString byteString, ByteString byteString2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class AbstractByteIterator implements ByteIterator {
        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Byte next() {
        }

        @Override // java.util.Iterator
        public final void remove() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final Byte next() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ArraysByteArrayCopier implements ByteArrayCopier {
        private ArraysByteArrayCopier() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bArr, int i2, int i3) {
        }

        public /* synthetic */ ArraysByteArrayCopier(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] bArr, int i2, int i3) {
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i2, int i3, int i4) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        public int getOffsetIntoBytes() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte internalByteAt(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public int size() {
        }

        public Object writeReplace() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ByteArrayCopier {
        byte[] copyFrom(byte[] bArr, int i2, int i3);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class CodedBuilder {
        private final byte[] buffer;
        private final CodedOutputStream output;

        public /* synthetic */ CodedBuilder(int i2, AnonymousClass1 anonymousClass1) {
        }

        public ByteString build() {
        }

        public CodedOutputStream getCodedOutput() {
        }

        private CodedBuilder(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class LeafByteString extends ByteString {
        public abstract boolean equalsRange(ByteString byteString, int i2, int i3);

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int getTreeDepth() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean isBalanced() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void writeToReverse(ByteOutput byteOutput) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        public final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i2, int i3, int i4) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public final boolean equalsRange(ByteString byteString, int i2, int i3) {
        }

        public int getOffsetIntoBytes() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte internalByteAt(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean isValidUtf8() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final CodedInputStream newCodedInput() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final InputStream newInput() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int partialHash(int i2, int i3, int i4) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int partialIsValidUtf8(int i2, int i3, int i4) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString substring(int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String toStringInternal(Charset charset) {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void writeToInternal(OutputStream outputStream, int i2, int i3) throws IOException {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void writeTo(ByteOutput byteOutput) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        private SystemByteArrayCopier() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bArr, int i2, int i3) {
        }

        public /* synthetic */ SystemByteArrayCopier(AnonymousClass1 anonymousClass1) {
        }
    }

    public static /* synthetic */ int access$200(byte b) {
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i2) {
    }

    public static void checkIndex(int i2, int i3) {
    }

    public static int checkRange(int i2, int i3, int i4) {
    }

    public static ByteString copyFrom(byte[] bArr, int i2, int i3) {
    }

    public static ByteString copyFromUtf8(String str) {
    }

    public static CodedBuilder newCodedBuilder(int i2) {
    }

    public static Output newOutput(int i2) {
    }

    private static ByteString readChunk(InputStream inputStream, int i2) throws IOException {
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
    }

    private static int toInt(byte b) {
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i2);

    public final ByteString concat(ByteString byteString) {
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i2) {
    }

    public abstract void copyToInternal(byte[] bArr, int i2, int i3, int i4);

    public final boolean endsWith(ByteString byteString) {
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
    }

    public abstract byte internalByteAt(int i2);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    /* renamed from: iterator  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Iterator<Byte> iterator2() {
    }

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i2, int i3, int i4);

    public abstract int partialIsValidUtf8(int i2, int i3, int i4);

    public final int peekCachedHashCode() {
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
    }

    public final ByteString substring(int i2) {
    }

    public abstract ByteString substring(int i2, int i3);

    public final byte[] toByteArray() {
    }

    public final String toString(String str) throws UnsupportedEncodingException {
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
    }

    public abstract void writeTo(ByteOutput byteOutput) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public final void writeTo(OutputStream outputStream, int i2, int i3) throws IOException {
    }

    public abstract void writeToInternal(OutputStream outputStream, int i2, int i3) throws IOException;

    public abstract void writeToReverse(ByteOutput byteOutput) throws IOException;

    public static Output newOutput() {
    }

    public static ByteString readFrom(InputStream inputStream, int i2) throws IOException {
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i2, int i3, int i4) {
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
    }

    public static ByteString copyFrom(byte[] bArr) {
    }

    public static ByteString readFrom(InputStream inputStream, int i2, int i3) throws IOException {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = null;
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        public Output(int i2) {
        }

        private byte[] copyArray(byte[] bArr, int i2) {
        }

        private void flushFullBuffer(int i2) {
        }

        private void flushLastBuffer() {
        }

        public synchronized void reset() {
        }

        public synchronized int size() {
        }

        public synchronized ByteString toByteString() {
        }

        public String toString() {
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i2) {
        }

        public void writeTo(OutputStream outputStream) throws IOException {
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i2, int i3) {
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i2) {
    }

    public static ByteString wrap(byte[] bArr) {
    }

    public final String toString(Charset charset) {
    }

    public static ByteString wrap(byte[] bArr, int i2, int i3) {
    }

    public final String toString() {
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
    }

    public static ByteString copyFrom(String str, Charset charset) {
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
    }
}
