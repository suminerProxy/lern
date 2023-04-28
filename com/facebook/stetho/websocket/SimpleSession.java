package com.facebook.stetho.websocket;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface SimpleSession {
    void close(int i2, String str);

    boolean isOpen();

    void sendBinary(byte[] bArr);

    void sendText(String str);
}
