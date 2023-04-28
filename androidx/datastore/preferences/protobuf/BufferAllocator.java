package androidx.datastore.preferences.protobuf;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class BufferAllocator {
    private static final BufferAllocator UNPOOLED = null;

    /* renamed from: androidx.datastore.preferences.protobuf.BufferAllocator$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 extends BufferAllocator {
        @Override // androidx.datastore.preferences.protobuf.BufferAllocator
        public AllocatedBuffer allocateDirectBuffer(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.BufferAllocator
        public AllocatedBuffer allocateHeapBuffer(int i2) {
        }
    }

    public static BufferAllocator unpooled() {
    }

    public abstract AllocatedBuffer allocateDirectBuffer(int i2);

    public abstract AllocatedBuffer allocateHeapBuffer(int i2);
}
