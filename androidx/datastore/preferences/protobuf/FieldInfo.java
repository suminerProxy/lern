package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class FieldInfo implements Comparable<FieldInfo> {
    private final java.lang.reflect.Field cachedSizeField;
    private final boolean enforceUtf8;
    private final Internal.EnumVerifier enumVerifier;
    private final java.lang.reflect.Field field;
    private final int fieldNumber;
    private final Object mapDefaultEntry;
    private final Class<?> messageClass;
    private final OneofInfo oneof;
    private final Class<?> oneofStoredType;
    private final java.lang.reflect.Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final FieldType type;

    /* renamed from: androidx.datastore.preferences.protobuf.FieldInfo$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private Object mapDefaultEntry;
        private OneofInfo oneof;
        private Class<?> oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private FieldType type;

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public FieldInfo build() {
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
        }

        public Builder withEnforceUtf8(boolean z) {
        }

        public Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
        }

        public Builder withField(java.lang.reflect.Field field) {
        }

        public Builder withFieldNumber(int i2) {
        }

        public Builder withMapDefaultEntry(Object obj) {
        }

        public Builder withOneof(OneofInfo oneofInfo, Class<?> cls) {
        }

        public Builder withPresence(java.lang.reflect.Field field, int i2) {
        }

        public Builder withRequired(boolean z) {
        }

        public Builder withType(FieldType fieldType) {
        }

        private Builder() {
        }
    }

    private FieldInfo(java.lang.reflect.Field field, int i2, FieldType fieldType, Class<?> cls, java.lang.reflect.Field field2, int i3, boolean z, boolean z2, OneofInfo oneofInfo, Class<?> cls2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
    }

    private static void checkFieldNumber(int i2) {
    }

    public static FieldInfo forField(java.lang.reflect.Field field, int i2, FieldType fieldType, boolean z) {
    }

    public static FieldInfo forFieldWithEnumVerifier(java.lang.reflect.Field field, int i2, FieldType fieldType, Internal.EnumVerifier enumVerifier) {
    }

    public static FieldInfo forMapField(java.lang.reflect.Field field, int i2, Object obj, Internal.EnumVerifier enumVerifier) {
    }

    public static FieldInfo forOneofMemberField(int i2, FieldType fieldType, OneofInfo oneofInfo, Class<?> cls, boolean z, Internal.EnumVerifier enumVerifier) {
    }

    public static FieldInfo forPackedField(java.lang.reflect.Field field, int i2, FieldType fieldType, java.lang.reflect.Field field2) {
    }

    public static FieldInfo forPackedFieldWithEnumVerifier(java.lang.reflect.Field field, int i2, FieldType fieldType, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
    }

    public static FieldInfo forProto2OptionalField(java.lang.reflect.Field field, int i2, FieldType fieldType, java.lang.reflect.Field field2, int i3, boolean z, Internal.EnumVerifier enumVerifier) {
    }

    public static FieldInfo forProto2RequiredField(java.lang.reflect.Field field, int i2, FieldType fieldType, java.lang.reflect.Field field2, int i3, boolean z, Internal.EnumVerifier enumVerifier) {
    }

    public static FieldInfo forRepeatedMessageField(java.lang.reflect.Field field, int i2, FieldType fieldType, Class<?> cls) {
    }

    private static boolean isExactlyOneBitSet(int i2) {
    }

    public static Builder newBuilder() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(FieldInfo fieldInfo) {
    }

    public java.lang.reflect.Field getCachedSizeField() {
    }

    public Internal.EnumVerifier getEnumVerifier() {
    }

    public java.lang.reflect.Field getField() {
    }

    public int getFieldNumber() {
    }

    public Class<?> getListElementType() {
    }

    public Object getMapDefaultEntry() {
    }

    public Class<?> getMessageFieldClass() {
    }

    public OneofInfo getOneof() {
    }

    public Class<?> getOneofStoredType() {
    }

    public java.lang.reflect.Field getPresenceField() {
    }

    public int getPresenceMask() {
    }

    public FieldType getType() {
    }

    public boolean isEnforceUtf8() {
    }

    public boolean isRequired() {
    }

    /* renamed from: compareTo  reason: avoid collision after fix types in other method */
    public int compareTo2(FieldInfo fieldInfo) {
    }
}
