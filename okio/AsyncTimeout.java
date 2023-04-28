package okio;

import androidx.exifinterface.media.ExifInterface;
import com.alipay.sdk.widget.j;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.tencent.android.tpush.common.MessageKey;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AsyncTimeout.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b#\u0010\bJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001c\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "", "now", "remainingNanos", "(J)J", "", "enter", "()V", "", j.f854o, "()Z", "timedOut", "Lokio/Sink;", "sink", "(Lokio/Sink;)Lokio/Sink;", "Lokio/Source;", MessageKey.MSG_SOURCE, "(Lokio/Source;)Lokio/Source;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "block", "withTimeout", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "newTimeoutException", "next", "Lokio/AsyncTimeout;", "timeoutAt", "J", "inQueue", "Z", "<init>", "Companion", "Watchdog", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class AsyncTimeout extends Timeout {
    public static final Companion Companion = null;
    private static final long IDLE_TIMEOUT_MILLIS = 0;
    private static final long IDLE_TIMEOUT_NANOS = 0;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static AsyncTimeout head;
    private boolean inQueue;
    private AsyncTimeout next;
    private long timeoutAt;

    /* compiled from: AsyncTimeout.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokio/AsyncTimeout$Companion;", "", "Lokio/AsyncTimeout;", "node", "", "timeoutNanos", "", "hasDeadline", "", "scheduleTimeout", "(Lokio/AsyncTimeout;JZ)V", "cancelScheduledTimeout", "(Lokio/AsyncTimeout;)Z", "awaitTimeout$okio", "()Lokio/AsyncTimeout;", "awaitTimeout", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", "I", TtmlNode.TAG_HEAD, "Lokio/AsyncTimeout;", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ boolean access$cancelScheduledTimeout(Companion companion, AsyncTimeout asyncTimeout) {
        }

        public static final /* synthetic */ void access$scheduleTimeout(Companion companion, AsyncTimeout asyncTimeout, long j2, boolean z) {
        }

        private final boolean cancelScheduledTimeout(AsyncTimeout asyncTimeout) {
        }

        private final void scheduleTimeout(AsyncTimeout asyncTimeout, long j2, boolean z) {
        }

        @Nullable
        public final AsyncTimeout awaitTimeout$okio() throws InterruptedException {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "", "run", "()V", "<init>", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Watchdog extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    public static final /* synthetic */ AsyncTimeout access$getHead$cp() {
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_MILLIS$cp() {
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_NANOS$cp() {
    }

    public static final /* synthetic */ AsyncTimeout access$getNext$p(AsyncTimeout asyncTimeout) {
    }

    public static final /* synthetic */ long access$getTimeoutAt$p(AsyncTimeout asyncTimeout) {
    }

    public static final /* synthetic */ long access$remainingNanos(AsyncTimeout asyncTimeout, long j2) {
    }

    public static final /* synthetic */ void access$setHead$cp(AsyncTimeout asyncTimeout) {
    }

    public static final /* synthetic */ void access$setNext$p(AsyncTimeout asyncTimeout, AsyncTimeout asyncTimeout2) {
    }

    public static final /* synthetic */ void access$setTimeoutAt$p(AsyncTimeout asyncTimeout, long j2) {
    }

    private final long remainingNanos(long j2) {
    }

    @PublishedApi
    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException iOException) {
    }

    public final void enter() {
    }

    public final boolean exit() {
    }

    @NotNull
    public IOException newTimeoutException(@Nullable IOException iOException) {
    }

    @NotNull
    public final Sink sink(@NotNull Sink sink) {
    }

    @NotNull
    public final Source source(@NotNull Source source) {
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(@NotNull Function0<? extends T> function0) {
    }
}
