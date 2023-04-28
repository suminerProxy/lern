package okhttp3.internal.http2;

import com.baidu.platform.comapi.map.MapBundleKey;
import com.tencent.android.tpush.common.MessageKey;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import org.jetbrains.annotations.NotNull;

/* compiled from: Hpack.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR%\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0006R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "", "Lokio/ByteString;", "", "nameToFirstIndex", "()Ljava/util/Map;", "name", "checkLowercase", "(Lokio/ByteString;)Lokio/ByteString;", "PREFIX_6_BITS", "I", "PREFIX_7_BITS", "SETTINGS_HEADER_TABLE_SIZE", "NAME_TO_FIRST_INDEX", "Ljava/util/Map;", "getNAME_TO_FIRST_INDEX", "PREFIX_5_BITS", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "PREFIX_4_BITS", "", "Lokhttp3/internal/http2/Header;", "STATIC_HEADER_TABLE", "[Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "<init>", "()V", "Reader", "Writer", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Hpack {
    public static final Hpack INSTANCE = null;
    @NotNull
    private static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX = null;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    @NotNull
    private static final Header[] STATIC_HEADER_TABLE = null;

    private Hpack() {
    }

    private final Map<ByteString, Integer> nameToFirstIndex() {
    }

    @NotNull
    public final ByteString checkLowercase(@NotNull ByteString byteString) throws IOException {
    }

    @NotNull
    public final Map<ByteString, Integer> getNAME_TO_FIRST_INDEX() {
    }

    @NotNull
    public final Header[] getSTATIC_HEADER_TABLE() {
    }

    /* compiled from: Hpack.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010.\u001a\u000208\u0012\u0006\u00103\u001a\u00020\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u001eJ\r\u0010#\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\u0004J\u001d\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010+R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u0019048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010+¨\u0006;"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "", "adjustDynamicTableByteCount", "()V", "clearDynamicTable", "", "bytesToRecover", "evictToRecoverBytes", "(I)I", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "readIndexedHeader", "(I)V", "dynamicTableIndex", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", "nameIndex", "readLiteralHeaderWithIncrementalIndexingIndexedName", "readLiteralHeaderWithIncrementalIndexingNewName", "Lokio/ByteString;", "getName", "(I)Lokio/ByteString;", "", "isStaticHeader", "(I)Z", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "(ILokhttp3/internal/http2/Header;)V", "readByte", "()I", "", "getAndResetHeaderList", "()Ljava/util/List;", "maxDynamicTableByteCount", "readHeaders", "firstByte", "prefixMask", "readInt", "(II)I", "readByteString", "()Lokio/ByteString;", "dynamicTableByteCount", "I", "headerCount", "Lokio/BufferedSource;", MessageKey.MSG_SOURCE, "Lokio/BufferedSource;", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "headerTableSizeSetting", "", "headerList", "Ljava/util/List;", "nextHeaderIndex", "Lokio/Source;", "<init>", "(Lokio/Source;II)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Reader {
        @JvmField
        @NotNull
        public Header[] dynamicTable;
        @JvmField
        public int dynamicTableByteCount;
        @JvmField
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final BufferedSource source;

        @JvmOverloads
        public Reader(@NotNull Source source, int i2) {
        }

        @JvmOverloads
        public Reader(@NotNull Source source, int i2, int i3) {
        }

        private final void adjustDynamicTableByteCount() {
        }

        private final void clearDynamicTable() {
        }

        private final int dynamicTableIndex(int i2) {
        }

        private final int evictToRecoverBytes(int i2) {
        }

        private final ByteString getName(int i2) throws IOException {
        }

        private final void insertIntoDynamicTable(int i2, Header header) {
        }

        private final boolean isStaticHeader(int i2) {
        }

        private final int readByte() throws IOException {
        }

        private final void readIndexedHeader(int i2) throws IOException {
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i2) throws IOException {
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i2) throws IOException {
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
        }

        @NotNull
        public final List<Header> getAndResetHeaderList() {
        }

        public final int maxDynamicTableByteCount() {
        }

        @NotNull
        public final ByteString readByteString() throws IOException {
        }

        public final void readHeaders() throws IOException {
        }

        public final int readInt(int i2, int i3) throws IOException {
        }

        public /* synthetic */ Reader(Source source, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: Hpack.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b.\u0010/J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u001b\u0010\u0010\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010\u001b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0)8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001fR\u0016\u0010-\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010%¨\u00060"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "", "clearDynamicTable", "()V", "", "bytesToRecover", "evictToRecoverBytes", "(I)I", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "(Lokhttp3/internal/http2/Header;)V", "adjustDynamicTableByteCount", "", "headerBlock", "writeHeaders", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "writeInt", "(III)V", "Lokio/ByteString;", "data", "writeByteString", "(Lokio/ByteString;)V", "headerTableSizeSetting", "resizeHeaderTable", "(I)V", "dynamicTableByteCount", "I", "maxDynamicTableByteCount", "smallestHeaderTableSizeSetting", "nextHeaderIndex", "", "useCompression", "Z", "Lokio/Buffer;", "out", "Lokio/Buffer;", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "headerCount", "emitDynamicTableSizeUpdate", "<init>", "(IZLokio/Buffer;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Writer {
        @JvmField
        @NotNull
        public Header[] dynamicTable;
        @JvmField
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        @JvmField
        public int headerCount;
        @JvmField
        public int headerTableSizeSetting;
        @JvmField
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        @JvmOverloads
        public Writer(int i2, @NotNull Buffer buffer) {
        }

        @JvmOverloads
        public Writer(int i2, boolean z, @NotNull Buffer buffer) {
        }

        @JvmOverloads
        public Writer(@NotNull Buffer buffer) {
        }

        private final void adjustDynamicTableByteCount() {
        }

        private final void clearDynamicTable() {
        }

        private final int evictToRecoverBytes(int i2) {
        }

        private final void insertIntoDynamicTable(Header header) {
        }

        public final void resizeHeaderTable(int i2) {
        }

        public final void writeByteString(@NotNull ByteString byteString) throws IOException {
        }

        public final void writeHeaders(@NotNull List<Header> list) throws IOException {
        }

        public final void writeInt(int i2, int i3, int i4) {
        }

        public /* synthetic */ Writer(int i2, boolean z, Buffer buffer, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
