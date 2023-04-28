package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class Timeout {
    public static final Timeout NONE = null;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* renamed from: com.tencent.cloud.huiyansdkface.okio.Timeout$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 extends Timeout {
        @Override // com.tencent.cloud.huiyansdkface.okio.Timeout
        public final Timeout deadlineNanoTime(long j2) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Timeout
        public final void throwIfReached() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Timeout
        public final Timeout timeout(long j2, TimeUnit timeUnit) {
        }
    }

    public Timeout clearDeadline() {
    }

    public Timeout clearTimeout() {
    }

    public final Timeout deadline(long j2, TimeUnit timeUnit) {
    }

    public long deadlineNanoTime() {
    }

    public Timeout deadlineNanoTime(long j2) {
    }

    public boolean hasDeadline() {
    }

    public void throwIfReached() throws IOException {
    }

    public Timeout timeout(long j2, TimeUnit timeUnit) {
    }

    public long timeoutNanos() {
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
    }
}
