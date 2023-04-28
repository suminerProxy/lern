package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class UnsafeAllocator {

    /* renamed from: com.google.gson.internal.UnsafeAllocator$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends UnsafeAllocator {
        public final /* synthetic */ Method val$allocateInstance;
        public final /* synthetic */ Object val$unsafe;

        public AnonymousClass1(Method method, Object obj) {
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) throws Exception {
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends UnsafeAllocator {
        public final /* synthetic */ int val$constructorId;
        public final /* synthetic */ Method val$newInstance;

        public AnonymousClass2(Method method, int i2) {
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) throws Exception {
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends UnsafeAllocator {
        public final /* synthetic */ Method val$newInstance;

        public AnonymousClass3(Method method) {
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) throws Exception {
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 extends UnsafeAllocator {
        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) {
        }
    }

    public static void assertInstantiable(Class<?> cls) {
    }

    public static UnsafeAllocator create() {
    }

    public abstract <T> T newInstance(Class<T> cls) throws Exception;
}
