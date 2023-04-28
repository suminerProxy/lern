package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ForwardingTimeout extends Timeout {
    private Timeout delegate;

    public ForwardingTimeout(Timeout timeout) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Timeout
    public Timeout clearDeadline() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Timeout
    public Timeout clearTimeout() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Timeout
    public long deadlineNanoTime() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Timeout
    public Timeout deadlineNanoTime(long j2) {
    }

    public final Timeout delegate() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Timeout
    public boolean hasDeadline() {
    }

    public final ForwardingTimeout setDelegate(Timeout timeout) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Timeout
    public void throwIfReached() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Timeout
    public Timeout timeout(long j2, TimeUnit timeUnit) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Timeout
    public long timeoutNanos() {
    }
}
