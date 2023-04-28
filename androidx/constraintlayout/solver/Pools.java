package androidx.constraintlayout.solver;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Pools {
    private static final boolean DEBUG = false;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface Pool<T> {
        T acquire();

        boolean release(T t);

        void releaseAll(T[] tArr, int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int i2) {
        }

        private boolean isInPool(T t) {
        }

        @Override // androidx.constraintlayout.solver.Pools.Pool
        public T acquire() {
        }

        @Override // androidx.constraintlayout.solver.Pools.Pool
        public boolean release(T t) {
        }

        @Override // androidx.constraintlayout.solver.Pools.Pool
        public void releaseAll(T[] tArr, int i2) {
        }
    }

    private Pools() {
    }
}
