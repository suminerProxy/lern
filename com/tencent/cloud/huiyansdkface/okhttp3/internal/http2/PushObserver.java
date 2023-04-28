package com.tencent.cloud.huiyansdkface.okhttp3.internal.http2;

import com.tencent.cloud.huiyansdkface.okio.BufferedSource;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface PushObserver {

    /* renamed from: a  reason: collision with root package name */
    public static final PushObserver f11073a = null;

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.PushObserver$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 implements PushObserver {
        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.PushObserver
        public final boolean onData(int i2, BufferedSource bufferedSource, int i3, boolean z) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.PushObserver
        public final boolean onHeaders(int i2, List<Header> list, boolean z) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.PushObserver
        public final boolean onRequest(int i2, List<Header> list) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.PushObserver
        public final void onReset(int i2, ErrorCode errorCode) {
        }
    }

    boolean onData(int i2, BufferedSource bufferedSource, int i3, boolean z) throws IOException;

    boolean onHeaders(int i2, List<Header> list, boolean z);

    boolean onRequest(int i2, List<Header> list);

    void onReset(int i2, ErrorCode errorCode);
}
