package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: TaskQueue.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "", "runOnce", "()J", "okhttp", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$synchronized$lambda$1"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$synchronized$lambda$1 extends Task {
    public final /* synthetic */ boolean $cancelable;
    public final /* synthetic */ boolean $clearPrevious$inlined;
    public final /* synthetic */ Ref.LongRef $delta$inlined;
    public final /* synthetic */ String $name;
    public final /* synthetic */ Ref.ObjectRef $newPeerSettings$inlined;
    public final /* synthetic */ Settings $settings$inlined;
    public final /* synthetic */ Ref.ObjectRef $streamsToNotify$inlined;
    public final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    public Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$synchronized$lambda$1(String str, boolean z, String str2, boolean z2, Http2Connection.ReaderRunnable readerRunnable, boolean z3, Ref.ObjectRef objectRef, Settings settings, Ref.LongRef longRef, Ref.ObjectRef objectRef2) {
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
    }
}
