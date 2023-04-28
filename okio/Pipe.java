package okio;

import com.tencent.android.tpush.common.MessageKey;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Pipe.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b+\u0010,J-\u0010\u0007\u001a\u00020\u0004*\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0082\b¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u00020\u00198\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0011\u001a\u00020\u000e8G@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\t\u001a\u00020\u00028G@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\t\u0010\rR\"\u0010 \u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R$\u0010#\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u000bR\u001c\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lokio/Pipe;", "", "Lokio/Sink;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "forward", "(Lokio/Sink;Lkotlin/jvm/functions/Function1;)V", "sink", "fold", "(Lokio/Sink;)V", "-deprecated_sink", "()Lokio/Sink;", "Lokio/Source;", "-deprecated_source", "()Lokio/Source;", MessageKey.MSG_SOURCE, "", "sinkClosed", "Z", "getSinkClosed$okio", "()Z", "setSinkClosed$okio", "(Z)V", "", "maxBufferSize", "J", "getMaxBufferSize$okio", "()J", "Lokio/Source;", "Lokio/Sink;", "sourceClosed", "getSourceClosed$okio", "setSourceClosed$okio", "foldedSink", "getFoldedSink$okio", "setFoldedSink$okio", "Lokio/Buffer;", "buffer", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", "<init>", "(J)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Pipe {
    @NotNull
    private final Buffer buffer;
    @Nullable
    private Sink foldedSink;
    private final long maxBufferSize;
    @NotNull
    private final Sink sink;
    private boolean sinkClosed;
    @NotNull
    private final Source source;
    private boolean sourceClosed;

    public Pipe(long j2) {
    }

    public static final /* synthetic */ void access$forward(Pipe pipe, Sink sink, Function1 function1) {
    }

    private final void forward(@NotNull Sink sink, Function1<? super Sink, Unit> function1) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sink", imports = {}))
    @JvmName(name = "-deprecated_sink")
    @NotNull
    /* renamed from: -deprecated_sink  reason: not valid java name */
    public final Sink m1629deprecated_sink() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = MessageKey.MSG_SOURCE, imports = {}))
    @JvmName(name = "-deprecated_source")
    @NotNull
    /* renamed from: -deprecated_source  reason: not valid java name */
    public final Source m1630deprecated_source() {
    }

    public final void fold(@NotNull Sink sink) throws IOException {
    }

    @NotNull
    public final Buffer getBuffer$okio() {
    }

    @Nullable
    public final Sink getFoldedSink$okio() {
    }

    public final long getMaxBufferSize$okio() {
    }

    public final boolean getSinkClosed$okio() {
    }

    public final boolean getSourceClosed$okio() {
    }

    public final void setFoldedSink$okio(@Nullable Sink sink) {
    }

    public final void setSinkClosed$okio(boolean z) {
    }

    public final void setSourceClosed$okio(boolean z) {
    }

    @JvmName(name = "sink")
    @NotNull
    public final Sink sink() {
    }

    @JvmName(name = MessageKey.MSG_SOURCE)
    @NotNull
    public final Source source() {
    }
}
