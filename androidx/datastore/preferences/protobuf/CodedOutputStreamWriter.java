package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class CodedOutputStreamWriter implements Writer {
    private final CodedOutputStream output;

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStreamWriter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
    }

    private CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
    }

    public static CodedOutputStreamWriter forCodedOutput(CodedOutputStream codedOutputStream) {
    }

    private <V> void writeDeterministicBooleanMapEntry(int i2, boolean z, V v, MapEntryLite.Metadata<Boolean, V> metadata) throws IOException {
    }

    private <V> void writeDeterministicIntegerMap(int i2, MapEntryLite.Metadata<Integer, V> metadata, Map<Integer, V> map) throws IOException {
    }

    private <V> void writeDeterministicLongMap(int i2, MapEntryLite.Metadata<Long, V> metadata, Map<Long, V> map) throws IOException {
    }

    private <K, V> void writeDeterministicMap(int i2, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
    }

    private <V> void writeDeterministicStringMap(int i2, MapEntryLite.Metadata<String, V> metadata, Map<String, V> map) throws IOException {
    }

    private void writeLazyString(int i2, Object obj) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public Writer.FieldOrder fieldOrder() {
    }

    public int getTotalBytesWritten() {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBool(int i2, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBoolList(int i2, List<Boolean> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytes(int i2, ByteString byteString) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytesList(int i2, List<ByteString> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDouble(int i2, double d2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDoubleList(int i2, List<Double> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEndGroup(int i2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnum(int i2, int i3) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnumList(int i2, List<Integer> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32(int i2, int i3) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32List(int i2, List<Integer> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64(int i2, long j2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64List(int i2, List<Long> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloat(int i2, float f2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloatList(int i2, List<Float> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroup(int i2, Object obj) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroupList(int i2, List<?> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32(int i2, int i3) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32List(int i2, List<Integer> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64(int i2, long j2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64List(int i2, List<Long> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public <K, V> void writeMap(int i2, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int i2, Object obj) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int i2, List<?> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int i2, Object obj) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32(int i2, int i3) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32List(int i2, List<Integer> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64(int i2, long j2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64List(int i2, List<Long> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32(int i2, int i3) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32List(int i2, List<Integer> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64(int i2, long j2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64List(int i2, List<Long> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeStartGroup(int i2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeString(int i2, String str) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeStringList(int i2, List<String> list) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32(int i2, int i3) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32List(int i2, List<Integer> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64(int i2, long j2) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64List(int i2, List<Long> list, boolean z) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroup(int i2, Object obj, Schema schema) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int i2, Object obj, Schema schema) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroupList(int i2, List<?> list, Schema schema) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int i2, List<?> list, Schema schema) throws IOException {
    }
}
