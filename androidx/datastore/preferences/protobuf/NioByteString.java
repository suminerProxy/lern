package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class NioByteString extends ByteString.LeafByteString {
    private final ByteBuffer buffer;

    public NioByteString(ByteBuffer byteBuffer) {
    }

    public static /* synthetic */ ByteBuffer access$000(NioByteString nioByteString) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
    }

    private ByteBuffer slice(int i2, int i3) {
    }

    private Object writeReplace() {
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

    @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
    public boolean equalsRange(ByteString byteString, int i2, int i3) {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte internalByteAt(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean isValidUtf8() {
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

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i2, int i3) throws IOException {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.NioByteString$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends InputStream {
        private final ByteBuffer buf;
        public final /* synthetic */ NioByteString this$0;

        public AnonymousClass1(NioByteString nioByteString) {
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
        public int read() throws IOException {
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(ByteOutput byteOutput) throws IOException {
    }
}
