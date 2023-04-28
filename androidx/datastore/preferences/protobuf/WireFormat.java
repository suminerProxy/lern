package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class WireFormat {
    public static final int FIXED32_SIZE = 4;
    public static final int FIXED64_SIZE = 8;
    public static final int MAX_VARINT32_SIZE = 5;
    public static final int MAX_VARINT64_SIZE = 10;
    public static final int MAX_VARINT_SIZE = 10;
    public static final int MESSAGE_SET_ITEM = 1;
    public static final int MESSAGE_SET_ITEM_END_TAG = 0;
    public static final int MESSAGE_SET_ITEM_TAG = 0;
    public static final int MESSAGE_SET_MESSAGE = 3;
    public static final int MESSAGE_SET_MESSAGE_TAG = 0;
    public static final int MESSAGE_SET_TYPE_ID = 2;
    public static final int MESSAGE_SET_TYPE_ID_TAG = 0;
    public static final int TAG_TYPE_BITS = 3;
    public static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class FieldType {
        private static final /* synthetic */ FieldType[] $VALUES = null;
        public static final FieldType BOOL = null;
        public static final FieldType BYTES = null;
        public static final FieldType DOUBLE = null;
        public static final FieldType ENUM = null;
        public static final FieldType FIXED32 = null;
        public static final FieldType FIXED64 = null;
        public static final FieldType FLOAT = null;
        public static final FieldType GROUP = null;
        public static final FieldType INT32 = null;
        public static final FieldType INT64 = null;
        public static final FieldType MESSAGE = null;
        public static final FieldType SFIXED32 = null;
        public static final FieldType SFIXED64 = null;
        public static final FieldType SINT32 = null;
        public static final FieldType SINT64 = null;
        public static final FieldType STRING = null;
        public static final FieldType UINT32 = null;
        public static final FieldType UINT64 = null;
        private final JavaType javaType;
        private final int wireType;

        /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public enum AnonymousClass1 extends FieldType {
            public AnonymousClass1(String str, int i2, JavaType javaType, int i3) {
            }

            @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
            public boolean isPackable() {
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public enum AnonymousClass2 extends FieldType {
            public AnonymousClass2(String str, int i2, JavaType javaType, int i3) {
            }

            @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
            public boolean isPackable() {
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public enum AnonymousClass3 extends FieldType {
            public AnonymousClass3(String str, int i2, JavaType javaType, int i3) {
            }

            @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
            public boolean isPackable() {
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public enum AnonymousClass4 extends FieldType {
            public AnonymousClass4(String str, int i2, JavaType javaType, int i3) {
            }

            @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
            public boolean isPackable() {
            }
        }

        public /* synthetic */ FieldType(String str, int i2, JavaType javaType, int i3, AnonymousClass1 anonymousClass1) {
        }

        public static FieldType valueOf(String str) {
        }

        public static FieldType[] values() {
        }

        public JavaType getJavaType() {
        }

        public int getWireType() {
        }

        public boolean isPackable() {
        }

        private FieldType(String str, int i2, JavaType javaType, int i3) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class JavaType {
        private static final /* synthetic */ JavaType[] $VALUES = null;
        public static final JavaType BOOLEAN = null;
        public static final JavaType BYTE_STRING = null;
        public static final JavaType DOUBLE = null;
        public static final JavaType ENUM = null;
        public static final JavaType FLOAT = null;
        public static final JavaType INT = null;
        public static final JavaType LONG = null;
        public static final JavaType MESSAGE = null;
        public static final JavaType STRING = null;
        private final Object defaultDefault;

        private JavaType(String str, int i2, Object obj) {
        }

        public static JavaType valueOf(String str) {
        }

        public static JavaType[] values() {
        }

        public Object getDefaultDefault() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class Utf8Validation {
        private static final /* synthetic */ Utf8Validation[] $VALUES = null;
        public static final Utf8Validation LAZY = null;
        public static final Utf8Validation LOOSE = null;
        public static final Utf8Validation STRICT = null;

        /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$Utf8Validation$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public enum AnonymousClass1 extends Utf8Validation {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation
            public Object readString(CodedInputStream codedInputStream) throws IOException {
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$Utf8Validation$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public enum AnonymousClass2 extends Utf8Validation {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation
            public Object readString(CodedInputStream codedInputStream) throws IOException {
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$Utf8Validation$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public enum AnonymousClass3 extends Utf8Validation {
            public AnonymousClass3(String str, int i2) {
            }

            @Override // androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation
            public Object readString(CodedInputStream codedInputStream) throws IOException {
            }
        }

        private Utf8Validation(String str, int i2) {
        }

        public static Utf8Validation valueOf(String str) {
        }

        public static Utf8Validation[] values() {
        }

        public abstract Object readString(CodedInputStream codedInputStream) throws IOException;

        public /* synthetic */ Utf8Validation(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    private WireFormat() {
    }

    public static int getTagFieldNumber(int i2) {
    }

    public static int getTagWireType(int i2) {
    }

    public static int makeTag(int i2, int i3) {
    }

    public static Object readPrimitiveField(CodedInputStream codedInputStream, FieldType fieldType, Utf8Validation utf8Validation) throws IOException {
    }
}
