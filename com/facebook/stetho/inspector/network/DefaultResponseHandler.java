package com.facebook.stetho.inspector.network;

import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DefaultResponseHandler implements ResponseHandler {
    private int mBytesRead;
    private int mDecodedBytesRead;
    private final NetworkEventReporter mEventReporter;
    private final String mRequestId;

    public DefaultResponseHandler(NetworkEventReporter networkEventReporter, String str) {
    }

    private void reportDataReceived() {
    }

    @Override // com.facebook.stetho.inspector.network.ResponseHandler
    public void onEOF() {
    }

    @Override // com.facebook.stetho.inspector.network.ResponseHandler
    public void onError(IOException iOException) {
    }

    @Override // com.facebook.stetho.inspector.network.ResponseHandler
    public void onRead(int i2) {
    }

    @Override // com.facebook.stetho.inspector.network.ResponseHandler
    public void onReadDecoded(int i2) {
    }
}
