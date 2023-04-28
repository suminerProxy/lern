package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Syntax implements Internal.EnumLite {
    private static final /* synthetic */ Syntax[] $VALUES = null;
    public static final Syntax SYNTAX_PROTO2 = null;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final Syntax SYNTAX_PROTO3 = null;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    public static final Syntax UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<Syntax> internalValueMap = null;
    private final int value;

    /* renamed from: androidx.datastore.preferences.protobuf.Syntax$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements Internal.EnumLiteMap<Syntax> {
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
        public /* bridge */ /* synthetic */ Syntax findValueByNumber(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
        /* renamed from: findValueByNumber  reason: avoid collision after fix types in other method */
        public Syntax findValueByNumber2(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class SyntaxVerifier implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier INSTANCE = null;

        private SyntaxVerifier() {
        }

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i2) {
        }
    }

    private Syntax(String str, int i2, int i3) {
    }

    public static Syntax forNumber(int i2) {
    }

    public static Internal.EnumLiteMap<Syntax> internalGetValueMap() {
    }

    public static Internal.EnumVerifier internalGetVerifier() {
    }

    public static Syntax valueOf(String str) {
    }

    public static Syntax[] values() {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
    }

    @Deprecated
    public static Syntax valueOf(int i2) {
    }
}
