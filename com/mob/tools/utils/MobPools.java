package com.mob.tools.utils;

import com.mob.tools.proguard.PublicMemberKeeper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MobPools implements PublicMemberKeeper {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Pool<T> extends PublicMemberKeeper {
        T acquire();

        boolean release(T t);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SimplePool<T> implements Pool<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Object[] f4510a;
        private int b;

        public SimplePool(int i2) {
        }

        private boolean a(T t) {
        }

        @Override // com.mob.tools.utils.MobPools.Pool
        public T acquire() {
        }

        @Override // com.mob.tools.utils.MobPools.Pool
        public boolean release(T t) {
        }
    }

    private MobPools() {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedPool<T> extends SimplePool<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f4511a;

        public SynchronizedPool(int i2, Object obj) {
        }

        @Override // com.mob.tools.utils.MobPools.SimplePool, com.mob.tools.utils.MobPools.Pool
        public T acquire() {
        }

        @Override // com.mob.tools.utils.MobPools.SimplePool, com.mob.tools.utils.MobPools.Pool
        public boolean release(T t) {
        }

        public SynchronizedPool(int i2) {
        }
    }
}
