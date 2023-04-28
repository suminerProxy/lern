package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class LongAddables {
    private static final Supplier<LongAddable> SUPPLIER = null;

    /* renamed from: com.google.common.cache.LongAddables$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Supplier<LongAddable> {
        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ LongAddable get() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Supplier
        public LongAddable get() {
        }
    }

    /* renamed from: com.google.common.cache.LongAddables$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements Supplier<LongAddable> {
        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ LongAddable get() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Supplier
        public LongAddable get() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PureJavaLongAddable extends AtomicLong implements LongAddable {
        private PureJavaLongAddable() {
        }

        @Override // com.google.common.cache.LongAddable
        public void add(long j2) {
        }

        @Override // com.google.common.cache.LongAddable
        public void increment() {
        }

        @Override // com.google.common.cache.LongAddable
        public long sum() {
        }

        public /* synthetic */ PureJavaLongAddable(AnonymousClass1 anonymousClass1) {
        }
    }

    public static LongAddable create() {
    }
}
