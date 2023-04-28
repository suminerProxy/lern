package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class LongSerializationPolicy {
    private static final /* synthetic */ LongSerializationPolicy[] $VALUES = null;
    public static final LongSerializationPolicy DEFAULT = null;
    public static final LongSerializationPolicy STRING = null;

    /* renamed from: com.google.gson.LongSerializationPolicy$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum AnonymousClass1 extends LongSerializationPolicy {
        public AnonymousClass1(String str, int i2) {
        }

        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l2) {
        }
    }

    /* renamed from: com.google.gson.LongSerializationPolicy$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum AnonymousClass2 extends LongSerializationPolicy {
        public AnonymousClass2(String str, int i2) {
        }

        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l2) {
        }
    }

    private LongSerializationPolicy(String str, int i2) {
    }

    public static LongSerializationPolicy valueOf(String str) {
    }

    public static LongSerializationPolicy[] values() {
    }

    public abstract JsonElement serialize(Long l2);

    public /* synthetic */ LongSerializationPolicy(String str, int i2, AnonymousClass1 anonymousClass1) {
    }
}
