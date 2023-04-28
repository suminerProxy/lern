package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.Internal;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = null;
    private static final UnknownFieldSchema<?, ?> PROTO2_UNKNOWN_FIELD_SET_SCHEMA = null;
    private static final UnknownFieldSchema<?, ?> PROTO3_UNKNOWN_FIELD_SET_SCHEMA = null;
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = null;

    private SchemaUtil() {
    }

    public static int computeSizeBoolList(int i2, List<?> list, boolean z) {
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
    }

    public static int computeSizeByteStringList(int i2, List<ByteString> list) {
    }

    public static int computeSizeEnumList(int i2, List<Integer> list, boolean z) {
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
    }

    public static int computeSizeFixed32List(int i2, List<?> list, boolean z) {
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
    }

    public static int computeSizeFixed64List(int i2, List<?> list, boolean z) {
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
    }

    public static int computeSizeGroupList(int i2, List<MessageLite> list) {
    }

    public static int computeSizeInt32List(int i2, List<Integer> list, boolean z) {
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
    }

    public static int computeSizeInt64List(int i2, List<Long> list, boolean z) {
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
    }

    public static int computeSizeMessage(int i2, Object obj, Schema schema) {
    }

    public static int computeSizeMessageList(int i2, List<?> list) {
    }

    public static int computeSizeSInt32List(int i2, List<Integer> list, boolean z) {
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
    }

    public static int computeSizeSInt64List(int i2, List<Long> list, boolean z) {
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
    }

    public static int computeSizeStringList(int i2, List<?> list) {
    }

    public static int computeSizeUInt32List(int i2, List<Integer> list, boolean z) {
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
    }

    public static int computeSizeUInt64List(int i2, List<Long> list, boolean z) {
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
    }

    public static <UT, UB> UB filterUnknownEnumList(int i2, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
    }

    private static Class<?> getGeneratedMessageClass() {
    }

    public static Object getMapDefaultEntry(Class<?> cls, String str) {
    }

    private static UnknownFieldSchema<?, ?> getUnknownFieldSetSchema(boolean z) {
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
    }

    public static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(ExtensionSchema<FT> extensionSchema, T t, T t2) {
    }

    public static <T> void mergeMap(MapFieldSchema mapFieldSchema, T t, T t2, long j2) {
    }

    public static <T, UT, UB> void mergeUnknownFields(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, T t2) {
    }

    public static UnknownFieldSchema<?, ?> proto2UnknownFieldSetSchema() {
    }

    public static UnknownFieldSchema<?, ?> proto3UnknownFieldSetSchema() {
    }

    public static void requireGeneratedMessage(Class<?> cls) {
    }

    public static boolean safeEquals(Object obj, Object obj2) {
    }

    public static boolean shouldUseTableSwitch(int i2, int i3, int i4) {
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fieldInfoArr) {
    }

    public static <UT, UB> UB storeUnknownEnum(int i2, int i3, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
    }

    public static String toCamelCase(String str, boolean z) {
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
    }

    public static void writeBool(int i2, boolean z, Writer writer) throws IOException {
    }

    public static void writeBoolList(int i2, List<Boolean> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeBytes(int i2, ByteString byteString, Writer writer) throws IOException {
    }

    public static void writeBytesList(int i2, List<ByteString> list, Writer writer) throws IOException {
    }

    public static void writeDouble(int i2, double d2, Writer writer) throws IOException {
    }

    public static void writeDoubleList(int i2, List<Double> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeEnum(int i2, int i3, Writer writer) throws IOException {
    }

    public static void writeEnumList(int i2, List<Integer> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeFixed32(int i2, int i3, Writer writer) throws IOException {
    }

    public static void writeFixed32List(int i2, List<Integer> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeFixed64(int i2, long j2, Writer writer) throws IOException {
    }

    public static void writeFixed64List(int i2, List<Long> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeFloat(int i2, float f2, Writer writer) throws IOException {
    }

    public static void writeFloatList(int i2, List<Float> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeGroupList(int i2, List<?> list, Writer writer) throws IOException {
    }

    public static void writeInt32(int i2, int i3, Writer writer) throws IOException {
    }

    public static void writeInt32List(int i2, List<Integer> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeInt64(int i2, long j2, Writer writer) throws IOException {
    }

    public static void writeInt64List(int i2, List<Long> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeLazyFieldList(int i2, List<?> list, Writer writer) throws IOException {
    }

    public static void writeMessage(int i2, Object obj, Writer writer) throws IOException {
    }

    public static void writeMessageList(int i2, List<?> list, Writer writer) throws IOException {
    }

    public static void writeSFixed32(int i2, int i3, Writer writer) throws IOException {
    }

    public static void writeSFixed32List(int i2, List<Integer> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeSFixed64(int i2, long j2, Writer writer) throws IOException {
    }

    public static void writeSFixed64List(int i2, List<Long> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeSInt32(int i2, int i3, Writer writer) throws IOException {
    }

    public static void writeSInt32List(int i2, List<Integer> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeSInt64(int i2, long j2, Writer writer) throws IOException {
    }

    public static void writeSInt64List(int i2, List<Long> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeString(int i2, Object obj, Writer writer) throws IOException {
    }

    private static void writeStringInternal(int i2, String str, Writer writer) throws IOException {
    }

    public static void writeStringList(int i2, List<String> list, Writer writer) throws IOException {
    }

    public static void writeUInt32(int i2, int i3, Writer writer) throws IOException {
    }

    public static void writeUInt32List(int i2, List<Integer> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeUInt64(int i2, long j2, Writer writer) throws IOException {
    }

    public static void writeUInt64List(int i2, List<Long> list, Writer writer, boolean z) throws IOException {
    }

    public static int computeSizeGroupList(int i2, List<MessageLite> list, Schema schema) {
    }

    public static void writeGroupList(int i2, List<?> list, Writer writer, Schema schema) throws IOException {
    }

    public static void writeMessageList(int i2, List<?> list, Writer writer, Schema schema) throws IOException {
    }

    public static int computeSizeMessageList(int i2, List<?> list, Schema schema) {
    }

    public static <UT, UB> UB filterUnknownEnumList(int i2, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
    }
}
