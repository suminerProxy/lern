package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface Writer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class FieldOrder {
        private static final /* synthetic */ FieldOrder[] $VALUES = null;
        public static final FieldOrder ASCENDING = null;
        public static final FieldOrder DESCENDING = null;

        private FieldOrder(String str, int i2) {
        }

        public static FieldOrder valueOf(String str) {
        }

        public static FieldOrder[] values() {
        }
    }

    FieldOrder fieldOrder();

    void writeBool(int i2, boolean z) throws IOException;

    void writeBoolList(int i2, List<Boolean> list, boolean z) throws IOException;

    void writeBytes(int i2, ByteString byteString) throws IOException;

    void writeBytesList(int i2, List<ByteString> list) throws IOException;

    void writeDouble(int i2, double d2) throws IOException;

    void writeDoubleList(int i2, List<Double> list, boolean z) throws IOException;

    @Deprecated
    void writeEndGroup(int i2) throws IOException;

    void writeEnum(int i2, int i3) throws IOException;

    void writeEnumList(int i2, List<Integer> list, boolean z) throws IOException;

    void writeFixed32(int i2, int i3) throws IOException;

    void writeFixed32List(int i2, List<Integer> list, boolean z) throws IOException;

    void writeFixed64(int i2, long j2) throws IOException;

    void writeFixed64List(int i2, List<Long> list, boolean z) throws IOException;

    void writeFloat(int i2, float f2) throws IOException;

    void writeFloatList(int i2, List<Float> list, boolean z) throws IOException;

    @Deprecated
    void writeGroup(int i2, Object obj) throws IOException;

    @Deprecated
    void writeGroup(int i2, Object obj, Schema schema) throws IOException;

    @Deprecated
    void writeGroupList(int i2, List<?> list) throws IOException;

    @Deprecated
    void writeGroupList(int i2, List<?> list, Schema schema) throws IOException;

    void writeInt32(int i2, int i3) throws IOException;

    void writeInt32List(int i2, List<Integer> list, boolean z) throws IOException;

    void writeInt64(int i2, long j2) throws IOException;

    void writeInt64List(int i2, List<Long> list, boolean z) throws IOException;

    <K, V> void writeMap(int i2, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException;

    void writeMessage(int i2, Object obj) throws IOException;

    void writeMessage(int i2, Object obj, Schema schema) throws IOException;

    void writeMessageList(int i2, List<?> list) throws IOException;

    void writeMessageList(int i2, List<?> list, Schema schema) throws IOException;

    void writeMessageSetItem(int i2, Object obj) throws IOException;

    void writeSFixed32(int i2, int i3) throws IOException;

    void writeSFixed32List(int i2, List<Integer> list, boolean z) throws IOException;

    void writeSFixed64(int i2, long j2) throws IOException;

    void writeSFixed64List(int i2, List<Long> list, boolean z) throws IOException;

    void writeSInt32(int i2, int i3) throws IOException;

    void writeSInt32List(int i2, List<Integer> list, boolean z) throws IOException;

    void writeSInt64(int i2, long j2) throws IOException;

    void writeSInt64List(int i2, List<Long> list, boolean z) throws IOException;

    @Deprecated
    void writeStartGroup(int i2) throws IOException;

    void writeString(int i2, String str) throws IOException;

    void writeStringList(int i2, List<String> list) throws IOException;

    void writeUInt32(int i2, int i3) throws IOException;

    void writeUInt32List(int i2, List<Integer> list, boolean z) throws IOException;

    void writeUInt64(int i2, long j2) throws IOException;

    void writeUInt64List(int i2, List<Long> list, boolean z) throws IOException;
}
