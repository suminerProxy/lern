package okio;

import com.tencent.android.tpush.common.MessageKey;
import h.a.a.a.a.i.g;
import h.c.a.a.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmOkio.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\u0002\u0010\t\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\u0006\u0010\n\u001a\u001d\u0010\u0002\u001a\u00020\u0001*\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0002\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0001*\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u0011\u001a'\u0010\u0002\u001a\u00020\u0001*\u00020\u00122\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0004\b\u0002\u0010\u0016\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00122\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0004\b\u0006\u0010\u0017\"\u001e\u0010\u001a\u001a\u00020\f*\u00060\u0018j\u0002`\u00198@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ljava/io/OutputStream;", "Lokio/Sink;", "sink", "(Ljava/io/OutputStream;)Lokio/Sink;", "Ljava/io/InputStream;", "Lokio/Source;", MessageKey.MSG_SOURCE, "(Ljava/io/InputStream;)Lokio/Source;", "Ljava/net/Socket;", "(Ljava/net/Socket;)Lokio/Sink;", "(Ljava/net/Socket;)Lokio/Source;", "Ljava/io/File;", "", g.f15699k, "(Ljava/io/File;Z)Lokio/Sink;", "appendingSink", "(Ljava/io/File;)Lokio/Sink;", "(Ljava/io/File;)Lokio/Source;", "Ljava/nio/file/Path;", "", "Ljava/nio/file/OpenOption;", a.t, "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "isAndroidGetsocknameError", "(Ljava/lang/AssertionError;)Z", "okio"}, k = 5, mv = {1, 4, 0}, xs = "okio/Okio")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final /* synthetic */ class Okio__JvmOkioKt {
    @NotNull
    public static final Sink appendingSink(@NotNull File file) throws FileNotFoundException {
    }

    public static final boolean isAndroidGetsocknameError(@NotNull AssertionError assertionError) {
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file) throws FileNotFoundException {
    }

    @NotNull
    public static final Sink sink(@NotNull OutputStream outputStream) {
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z, int i2, Object obj) throws FileNotFoundException {
    }

    @NotNull
    public static final Source source(@NotNull InputStream inputStream) {
    }

    @NotNull
    public static final Sink sink(@NotNull Socket socket) throws IOException {
    }

    @NotNull
    public static final Source source(@NotNull Socket socket) throws IOException {
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file, boolean z) throws FileNotFoundException {
    }

    @NotNull
    public static final Source source(@NotNull File file) throws FileNotFoundException {
    }

    @IgnoreJRERequirement
    @NotNull
    public static final Sink sink(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
    }

    @IgnoreJRERequirement
    @NotNull
    public static final Source source(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
    }
}
