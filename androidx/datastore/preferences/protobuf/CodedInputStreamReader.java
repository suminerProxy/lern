package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class CodedInputStreamReader implements Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET = 0;
    private int endGroupTag;
    private final CodedInputStream input;
    private int nextTag;
    private int tag;

    /* renamed from: androidx.datastore.preferences.protobuf.CodedInputStreamReader$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
    }

    private CodedInputStreamReader(CodedInputStream codedInputStream) {
    }

    public static CodedInputStreamReader forCodedInput(CodedInputStream codedInputStream) {
    }

    private Object readField(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private void requirePosition(int i2) throws IOException {
    }

    private void requireWireType(int i2) throws IOException {
    }

    private void verifyPackedFixed32Length(int i2) throws IOException {
    }

    private void verifyPackedFixed64Length(int i2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int getFieldNumber() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int getTag() {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public boolean readBool() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readBoolList(List<Boolean> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public ByteString readBytes() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readBytesList(List<ByteString> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public double readDouble() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readDoubleList(List<Double> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readEnum() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readEnumList(List<Integer> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readFixed32() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFixed32List(List<Integer> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readFixed64() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFixed64List(List<Long> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public float readFloat() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFloatList(List<Float> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> T readGroup(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> T readGroupBySchemaWithCheck(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> void readGroupList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readInt32() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readInt32List(List<Integer> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readInt64() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readInt64List(List<Long> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <K, V> void readMap(Map<K, V> map, MapEntryLite.Metadata<K, V> metadata, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> T readMessage(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> T readMessageBySchemaWithCheck(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> void readMessageList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readSFixed32() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSFixed32List(List<Integer> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readSFixed64() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSFixed64List(List<Long> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readSInt32() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSInt32List(List<Integer> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readSInt64() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSInt64List(List<Long> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public String readString() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readStringList(List<String> list) throws IOException {
    }

    public void readStringListInternal(List<String> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readStringListRequireUtf8(List<String> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public String readStringRequireUtf8() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readUInt32() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readUInt32List(List<Integer> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readUInt64() throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readUInt64List(List<Long> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public boolean shouldDiscardUnknownFields() {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public boolean skipField() throws IOException {
    }

    private <T> T readGroup(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private <T> T readMessage(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> void readGroupList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> void readMessageList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
