package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class RopeByteString extends ByteString {
    public static final int[] minLengthByDepth = null;
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* renamed from: androidx.datastore.preferences.protobuf.RopeByteString$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends ByteString.AbstractByteIterator {
        public ByteString.ByteIterator current;
        public final PieceIterator pieces;
        public final /* synthetic */ RopeByteString this$0;

        public AnonymousClass1(RopeByteString ropeByteString) {
        }

        private ByteString.ByteIterator nextPiece() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
        public byte nextByte() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class PieceIterator implements Iterator<ByteString.LeafByteString> {
        private final ArrayDeque<RopeByteString> breadCrumbs;
        private ByteString.LeafByteString next;

        public /* synthetic */ PieceIterator(ByteString byteString, AnonymousClass1 anonymousClass1) {
        }

        private ByteString.LeafByteString getLeafByLeft(ByteString byteString) {
        }

        private ByteString.LeafByteString getNextNonEmptyLeaf() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ ByteString.LeafByteString next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        private PieceIterator(ByteString byteString) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public ByteString.LeafByteString next() {
        }
    }

    public /* synthetic */ RopeByteString(ByteString byteString, ByteString byteString2, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ ByteString access$400(RopeByteString ropeByteString) {
    }

    public static /* synthetic */ ByteString access$500(RopeByteString ropeByteString) {
    }

    public static ByteString concatenate(ByteString byteString, ByteString byteString2) {
    }

    private static ByteString concatenateBytes(ByteString byteString, ByteString byteString2) {
    }

    private boolean equalsFragments(ByteString byteString) {
    }

    public static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte byteAt(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i2, int i3, int i4) {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean equals(Object obj) {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int getTreeDepth() {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte internalByteAt(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean isBalanced() {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean isValidUtf8() {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Iterator<Byte> iterator2() {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public CodedInputStream newCodedInput() {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public InputStream newInput() {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int partialHash(int i2, int i3, int i4) {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int partialIsValidUtf8(int i2, int i3, int i4) {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int size() {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteString substring(int i2, int i3) {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public String toStringInternal(Charset charset) {
    }

    public Object writeReplace() {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i2, int i3) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeToReverse(ByteOutput byteOutput) throws IOException {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Balancer {
        private final ArrayDeque<ByteString> prefixesStack;

        private Balancer() {
        }

        public static /* synthetic */ ByteString access$100(Balancer balancer, ByteString byteString, ByteString byteString2) {
        }

        private ByteString balance(ByteString byteString, ByteString byteString2) {
        }

        private void doBalance(ByteString byteString) {
        }

        private int getDepthBinForLength(int i2) {
        }

        private void insert(ByteString byteString) {
        }

        public /* synthetic */ Balancer(AnonymousClass1 anonymousClass1) {
        }
    }

    private RopeByteString(ByteString byteString, ByteString byteString2) {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(ByteOutput byteOutput) throws IOException {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class RopeInputStream extends InputStream {
        private ByteString.LeafByteString currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private PieceIterator pieceIterator;
        public final /* synthetic */ RopeByteString this$0;

        public RopeInputStream(RopeByteString ropeByteString) {
        }

        private void advanceIfCurrentPieceFullyRead() {
        }

        private void initialize() {
        }

        private int readSkipInternal(byte[] bArr, int i2, int i3) {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
        }

        @Override // java.io.InputStream
        public long skip(long j2) {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
        }
    }
}
