package androidx.datastore.preferences.protobuf;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface MutabilityOracle {
    public static final MutabilityOracle IMMUTABLE = null;

    /* renamed from: androidx.datastore.preferences.protobuf.MutabilityOracle$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements MutabilityOracle {
        @Override // androidx.datastore.preferences.protobuf.MutabilityOracle
        public void ensureMutable() {
        }
    }

    void ensureMutable();
}
