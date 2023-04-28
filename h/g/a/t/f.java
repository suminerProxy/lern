package h.g.a.t;

/* compiled from: RequestCoordinator.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: RequestCoordinator.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a CLEARED = null;
        public static final a FAILED = null;
        public static final a PAUSED = null;
        public static final a RUNNING = null;
        public static final a SUCCESS = null;
        private final boolean isComplete;

        private a(String str, int i2, boolean z) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }

        public boolean isComplete() {
        }
    }

    boolean a();

    boolean b(e eVar);

    boolean c(e eVar);

    void d(e eVar);

    void f(e eVar);

    f getRoot();

    boolean i(e eVar);
}
