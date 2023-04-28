package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ArrayDecoders;
import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class MessageSchema<T> implements Schema<T> {
    private static final int[] EMPTY_INT_ARRAY = null;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    public static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private static final Unsafe UNSAFE = null;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;

    /* renamed from: androidx.datastore.preferences.protobuf.MessageSchema$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i2, int i3, MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i4, int i5, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
    }

    private boolean arePresentForEquals(T t, T t2, int i2) {
    }

    private static <T> boolean booleanAt(T t, long j2) {
    }

    private <K, V> int decodeMapEntry(byte[] bArr, int i2, int i3, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws IOException {
    }

    private int decodeMapEntryValue(byte[] bArr, int i2, int i3, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
    }

    private static <T> double doubleAt(T t, long j2) {
    }

    private final <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i2, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
    }

    private final <K, V, UT, UB> UB filterUnknownEnumMap(int i2, int i3, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
    }

    private static <T> float floatAt(T t, long j2) {
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i2) {
    }

    private Object getMapFieldDefaultEntry(int i2) {
    }

    private Schema getMessageFieldSchema(int i2) {
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
    }

    private int getSerializedSizeProto2(T t) {
    }

    private int getSerializedSizeProto3(T t) {
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t) {
    }

    private static <T> int intAt(T t, long j2) {
    }

    private static boolean isEnforceUtf8(int i2) {
    }

    private boolean isFieldPresent(T t, int i2, int i3, int i4) {
    }

    private <N> boolean isListInitialized(Object obj, int i2, int i3) {
    }

    private boolean isMapInitialized(T t, int i2, int i3) {
    }

    private boolean isOneofCaseEqual(T t, T t2, int i2) {
    }

    private boolean isOneofPresent(T t, int i2, int i3) {
    }

    private static boolean isRequired(int i2) {
    }

    private static List<?> listAt(Object obj, long j2) {
    }

    private static <T> long longAt(T t, long j2) {
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, ExtensionSchema<ET> extensionSchema, T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private final <K, V> void mergeMap(Object obj, int i2, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
    }

    private void mergeMessage(T t, T t2, int i2) {
    }

    private void mergeOneofMessage(T t, T t2, int i2) {
    }

    private void mergeSingleField(T t, T t2, int i2) {
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
    }

    public static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
    }

    private int numberAt(int i2) {
    }

    private static long offset(int i2) {
    }

    private static <T> boolean oneofBooleanAt(T t, long j2) {
    }

    private static <T> double oneofDoubleAt(T t, long j2) {
    }

    private static <T> float oneofFloatAt(T t, long j2) {
    }

    private static <T> int oneofIntAt(T t, long j2) {
    }

    private static <T> long oneofLongAt(T t, long j2) {
    }

    private <K, V> int parseMapField(T t, byte[] bArr, int i2, int i3, int i4, long j2, ArrayDecoders.Registers registers) throws IOException {
    }

    private int parseOneofField(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, ArrayDecoders.Registers registers) throws IOException {
    }

    private int parseProto3Message(T t, byte[] bArr, int i2, int i3, ArrayDecoders.Registers registers) throws IOException {
    }

    private int parseRepeatedField(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, ArrayDecoders.Registers registers) throws IOException {
    }

    private int positionForFieldNumber(int i2) {
    }

    private int presenceMaskAndOffsetAt(int i2) {
    }

    private <E> void readGroupList(Object obj, long j2, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private <E> void readMessageList(Object obj, int i2, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private void readString(Object obj, int i2, Reader reader) throws IOException {
    }

    private void readStringList(Object obj, int i2, Reader reader) throws IOException {
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
    }

    private void setFieldPresent(T t, int i2) {
    }

    private void setOneofPresent(T t, int i2, int i3) {
    }

    private int slowPositionForFieldNumber(int i2, int i3) {
    }

    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i2, boolean z, Object[] objArr) {
    }

    private static int type(int i2) {
    }

    private int typeAndOffsetAt(int i2) {
    }

    private void writeFieldsInAscendingOrderProto2(T t, Writer writer) throws IOException {
    }

    private void writeFieldsInAscendingOrderProto3(T t, Writer writer) throws IOException {
    }

    private void writeFieldsInDescendingOrder(T t, Writer writer) throws IOException {
    }

    private <K, V> void writeMapHelper(Writer writer, int i2, Object obj, int i3) throws IOException {
    }

    private void writeString(int i2, Object obj, Writer writer) throws IOException {
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, Writer writer) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(T t, T t2) {
    }

    public int getSchemaSize() {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(T t) {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(T t) {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(T t) {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(T t) {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t, T t2) {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
    }

    public int parseProto2Message(T t, byte[] bArr, int i2, int i3, int i4, ArrayDecoders.Registers registers) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T t, Writer writer) throws IOException {
    }

    private boolean isFieldPresent(T t, int i2) {
    }

    private int positionForFieldNumber(int i2, int i3) {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private boolean equals(T t, T t2, int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t, byte[] bArr, int i2, int i3, ArrayDecoders.Registers registers) throws IOException {
    }

    private static boolean isInitialized(Object obj, int i2, Schema schema) {
    }
}
