package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class RemovalCause {
    private static final /* synthetic */ RemovalCause[] $VALUES = null;
    public static final RemovalCause COLLECTED = null;
    public static final RemovalCause EXPIRED = null;
    public static final RemovalCause EXPLICIT = null;
    public static final RemovalCause REPLACED = null;
    public static final RemovalCause SIZE = null;

    /* renamed from: com.google.common.cache.RemovalCause$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum AnonymousClass1 extends RemovalCause {
        public AnonymousClass1(String str, int i2) {
        }

        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
        }
    }

    /* renamed from: com.google.common.cache.RemovalCause$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum AnonymousClass2 extends RemovalCause {
        public AnonymousClass2(String str, int i2) {
        }

        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
        }
    }

    /* renamed from: com.google.common.cache.RemovalCause$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum AnonymousClass3 extends RemovalCause {
        public AnonymousClass3(String str, int i2) {
        }

        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
        }
    }

    /* renamed from: com.google.common.cache.RemovalCause$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum AnonymousClass4 extends RemovalCause {
        public AnonymousClass4(String str, int i2) {
        }

        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
        }
    }

    /* renamed from: com.google.common.cache.RemovalCause$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum AnonymousClass5 extends RemovalCause {
        public AnonymousClass5(String str, int i2) {
        }

        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
        }
    }

    private RemovalCause(String str, int i2) {
    }

    public static RemovalCause valueOf(String str) {
    }

    public static RemovalCause[] values() {
    }

    public abstract boolean wasEvicted();

    public /* synthetic */ RemovalCause(String str, int i2, AnonymousClass1 anonymousClass1) {
    }
}
