package com.facebook.stetho.inspector.network;

import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface ResponseHandler {
    void onEOF();

    void onError(IOException iOException);

    void onRead(int i2);

    void onReadDecoded(int i2);
}
