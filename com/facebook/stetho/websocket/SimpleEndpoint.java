package com.facebook.stetho.websocket;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface SimpleEndpoint {
    void onClose(SimpleSession simpleSession, int i2, String str);

    void onError(SimpleSession simpleSession, Throwable th);

    void onMessage(SimpleSession simpleSession, String str);

    void onMessage(SimpleSession simpleSession, byte[] bArr, int i2);

    void onOpen(SimpleSession simpleSession);
}
