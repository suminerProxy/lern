package okhttp3.internal.http2;

import com.tencent.android.tpush.common.MessageKey;
import java.io.IOException;
import kotlin.Metadata;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Huffman.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b \u0010!J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lokhttp3/internal/http2/Huffman;", "", "", "symbol", "code", "codeBitCount", "", "addCode", "(III)V", "Lokio/ByteString;", MessageKey.MSG_SOURCE, "Lokio/BufferedSink;", "sink", "encode", "(Lokio/ByteString;Lokio/BufferedSink;)V", "bytes", "encodedLength", "(Lokio/ByteString;)I", "Lokio/BufferedSource;", "", "byteCount", "decode", "(Lokio/BufferedSource;JLokio/BufferedSink;)V", "", "CODES", "[I", "Lokhttp3/internal/http2/Huffman$Node;", "root", "Lokhttp3/internal/http2/Huffman$Node;", "", "CODE_BIT_COUNTS", "[B", "<init>", "()V", "Node", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Huffman {
    private static final int[] CODES = null;
    private static final byte[] CODE_BIT_COUNTS = null;
    public static final Huffman INSTANCE = null;
    private static final Node root = null;

    private Huffman() {
    }

    private final void addCode(int i2, int i3, int i4) {
    }

    public final void decode(@NotNull BufferedSource bufferedSource, long j2, @NotNull BufferedSink bufferedSink) {
    }

    public final void encode(@NotNull ByteString byteString, @NotNull BufferedSink bufferedSink) throws IOException {
    }

    public final int encodedLength(@NotNull ByteString byteString) {
    }

    /* compiled from: Huffman.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http2/Huffman$Node;", "", "", "terminalBitCount", "I", "getTerminalBitCount", "()I", "", "children", "[Lokhttp3/internal/http2/Huffman$Node;", "getChildren", "()[Lokhttp3/internal/http2/Huffman$Node;", "symbol", "getSymbol", "<init>", "()V", "bits", "(II)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Node {
        @Nullable
        private final Node[] children;
        private final int symbol;
        private final int terminalBitCount;

        public Node() {
        }

        @Nullable
        public final Node[] getChildren() {
        }

        public final int getSymbol() {
        }

        public final int getTerminalBitCount() {
        }

        public Node(int i2, int i3) {
        }
    }
}
