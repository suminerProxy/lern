package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class AllocatedBuffer {

    /* renamed from: androidx.datastore.preferences.protobuf.AllocatedBuffer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 extends AllocatedBuffer {
        public final /* synthetic */ ByteBuffer val$buffer;

        public AnonymousClass1(ByteBuffer byteBuffer) {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public byte[] array() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public int arrayOffset() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public boolean hasArray() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public boolean hasNioBuffer() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public int limit() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public ByteBuffer nioBuffer() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public int position() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public int remaining() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public AllocatedBuffer position(int i2) {
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.AllocatedBuffer$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 extends AllocatedBuffer {
        private int position;
        public final /* synthetic */ byte[] val$bytes;
        public final /* synthetic */ int val$length;
        public final /* synthetic */ int val$offset;

        public AnonymousClass2(byte[] bArr, int i2, int i3) {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public byte[] array() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public int arrayOffset() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public boolean hasArray() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public boolean hasNioBuffer() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public int limit() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public ByteBuffer nioBuffer() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public int position() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public int remaining() {
        }

        @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
        public AllocatedBuffer position(int i2) {
        }
    }

    public static AllocatedBuffer wrap(byte[] bArr) {
    }

    private static AllocatedBuffer wrapNoCheck(byte[] bArr, int i2, int i3) {
    }

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract ByteBuffer nioBuffer();

    public abstract int position();

    public abstract AllocatedBuffer position(int i2);

    public abstract int remaining();

    public static AllocatedBuffer wrap(byte[] bArr, int i2, int i3) {
    }

    public static AllocatedBuffer wrap(ByteBuffer byteBuffer) {
    }
}
