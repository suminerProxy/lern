package okio;

import com.tencent.android.tpush.common.MessageKey;
import h.c.a.a.a;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* compiled from: -DeprecatedOkio.kt */
@Deprecated(message = "changed in Okio 2.x")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0007\u0010\u0011J+\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0007¢\u0006\u0004\b\u0007\u0010\u0017J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0007\u0010\u001aJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\u001bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\f\u0010\u001eJ+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0007¢\u0006\u0004\b\f\u0010\u001fJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lokio/-DeprecatedOkio;", "", "Ljava/io/File;", "file", "Lokio/Sink;", "appendingSink", "(Ljava/io/File;)Lokio/Sink;", "sink", "Lokio/BufferedSink;", "buffer", "(Lokio/Sink;)Lokio/BufferedSink;", "Lokio/Source;", MessageKey.MSG_SOURCE, "Lokio/BufferedSource;", "(Lokio/Source;)Lokio/BufferedSource;", "Ljava/io/OutputStream;", "outputStream", "(Ljava/io/OutputStream;)Lokio/Sink;", "Ljava/nio/file/Path;", "path", "", "Ljava/nio/file/OpenOption;", a.t, "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "Ljava/net/Socket;", "socket", "(Ljava/net/Socket;)Lokio/Sink;", "(Ljava/io/File;)Lokio/Source;", "Ljava/io/InputStream;", "inputStream", "(Ljava/io/InputStream;)Lokio/Source;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "(Ljava/net/Socket;)Lokio/Source;", "blackhole", "()Lokio/Sink;", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
/* renamed from: okio.-DeprecatedOkio  reason: invalid class name */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = null;

    private DeprecatedOkio() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    @NotNull
    public final Sink appendingSink(@NotNull File file) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    @NotNull
    public final Sink blackhole() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "sink.buffer()", imports = {"okio.buffer"}))
    @NotNull
    public final BufferedSink buffer(@NotNull Sink sink) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "file.sink()", imports = {"okio.sink"}))
    @NotNull
    public final Sink sink(@NotNull File file) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "file.source()", imports = {"okio.source"}))
    @NotNull
    public final Source source(@NotNull File file) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "source.buffer()", imports = {"okio.buffer"}))
    @NotNull
    public final BufferedSource buffer(@NotNull Source source) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "outputStream.sink()", imports = {"okio.sink"}))
    @NotNull
    public final Sink sink(@NotNull OutputStream outputStream) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "inputStream.source()", imports = {"okio.source"}))
    @NotNull
    public final Source source(@NotNull InputStream inputStream) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "path.sink(*options)", imports = {"okio.sink"}))
    @NotNull
    public final Sink sink(@NotNull Path path, @NotNull OpenOption... openOptionArr) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "path.source(*options)", imports = {"okio.source"}))
    @NotNull
    public final Source source(@NotNull Path path, @NotNull OpenOption... openOptionArr) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "socket.sink()", imports = {"okio.sink"}))
    @NotNull
    public final Sink sink(@NotNull Socket socket) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "socket.source()", imports = {"okio.source"}))
    @NotNull
    public final Source source(@NotNull Socket socket) {
    }
}
