package kotlin.io;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.tencent.android.tpush.common.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.ByteIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* compiled from: IOStreams.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u000b\u001a\u00020\f*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\r\u001a\u00020\u000e*\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\r\u0010\u0013\u001a\u00020\u000e*\u00020\u0014H\u0087\b\u001a\u001d\u0010\u0013\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0018*\u00020\u0001H\u0086\u0002\u001a\f\u0010\u0019\u001a\u00020\u0014*\u00020\u0002H\u0007\u001a\u0016\u0010\u0019\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007\u001a\u0017\u0010\u001b\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u001d\u001a\u00020\u001e*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b¨\u0006\u001f"}, d2 = {"buffered", "Ljava/io/BufferedInputStream;", "Ljava/io/InputStream;", "bufferSize", "", "Ljava/io/BufferedOutputStream;", "Ljava/io/OutputStream;", "bufferedReader", "Ljava/io/BufferedReader;", "charset", "Ljava/nio/charset/Charset;", "bufferedWriter", "Ljava/io/BufferedWriter;", "byteInputStream", "Ljava/io/ByteArrayInputStream;", "", "copyTo", "", "out", "inputStream", "", Constants.FLAG_TAG_OFFSET, SessionDescription.ATTR_LENGTH, "iterator", "Lkotlin/collections/ByteIterator;", "readBytes", "estimatedSize", "reader", "Ljava/io/InputStreamReader;", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, k = 2, mv = {1, 6, 0}, xi = 48)
@JvmName(name = "ByteStreamsKt")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class ByteStreamsKt {
    @InlineOnly
    private static final BufferedInputStream buffered(InputStream inputStream, int i2) {
    }

    public static /* synthetic */ BufferedInputStream buffered$default(InputStream inputStream, int i2, int i3, Object obj) {
    }

    @InlineOnly
    private static final BufferedReader bufferedReader(InputStream inputStream, Charset charset) {
    }

    public static /* synthetic */ BufferedReader bufferedReader$default(InputStream inputStream, Charset charset, int i2, Object obj) {
    }

    @InlineOnly
    private static final BufferedWriter bufferedWriter(OutputStream outputStream, Charset charset) {
    }

    public static /* synthetic */ BufferedWriter bufferedWriter$default(OutputStream outputStream, Charset charset, int i2, Object obj) {
    }

    @InlineOnly
    private static final ByteArrayInputStream byteInputStream(String str, Charset charset) {
    }

    public static /* synthetic */ ByteArrayInputStream byteInputStream$default(String str, Charset charset, int i2, Object obj) {
    }

    public static final long copyTo(@NotNull InputStream inputStream, @NotNull OutputStream outputStream, int i2) {
    }

    public static /* synthetic */ long copyTo$default(InputStream inputStream, OutputStream outputStream, int i2, int i3, Object obj) {
    }

    @InlineOnly
    private static final ByteArrayInputStream inputStream(byte[] bArr) {
    }

    @NotNull
    public static final ByteIterator iterator(@NotNull BufferedInputStream bufferedInputStream) {
    }

    @Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @ReplaceWith(expression = "readBytes()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", warningSince = "1.3")
    @NotNull
    public static final byte[] readBytes(@NotNull InputStream inputStream, int i2) {
    }

    public static /* synthetic */ byte[] readBytes$default(InputStream inputStream, int i2, int i3, Object obj) {
    }

    @InlineOnly
    private static final InputStreamReader reader(InputStream inputStream, Charset charset) {
    }

    public static /* synthetic */ InputStreamReader reader$default(InputStream inputStream, Charset charset, int i2, Object obj) {
    }

    @InlineOnly
    private static final OutputStreamWriter writer(OutputStream outputStream, Charset charset) {
    }

    public static /* synthetic */ OutputStreamWriter writer$default(OutputStream outputStream, Charset charset, int i2, Object obj) {
    }

    @InlineOnly
    private static final BufferedOutputStream buffered(OutputStream outputStream, int i2) {
    }

    @InlineOnly
    private static final ByteArrayInputStream inputStream(byte[] bArr, int i2, int i3) {
    }

    public static /* synthetic */ BufferedOutputStream buffered$default(OutputStream outputStream, int i2, int i3, Object obj) {
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] readBytes(@NotNull InputStream inputStream) {
    }
}
