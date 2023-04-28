package com.facebook.stetho.websocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class WebSocketSession implements SimpleSession {
    private final SimpleEndpoint mEndpoint;
    private final WriteCallback mErrorForwardingWriteCallback;
    private AtomicBoolean mIsOpen;
    private final ReadCallback mReadCallback;
    private final ReadHandler mReadHandler;
    private volatile boolean mSentClose;
    private final WriteHandler mWriteHandler;

    /* renamed from: com.facebook.stetho.websocket.WebSocketSession$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements ReadCallback {
        public final /* synthetic */ WebSocketSession this$0;

        public AnonymousClass1(WebSocketSession webSocketSession) {
        }

        private void handleBinaryFrame(byte[] bArr, int i2) {
        }

        private void handleClose(byte[] bArr, int i2) {
        }

        private void handlePing(byte[] bArr, int i2) {
        }

        private void handlePong(byte[] bArr, int i2) {
        }

        private void handleTextFrame(byte[] bArr, int i2) {
        }

        @Override // com.facebook.stetho.websocket.ReadCallback
        public void onCompleteFrame(byte b, byte[] bArr, int i2) {
        }
    }

    /* renamed from: com.facebook.stetho.websocket.WebSocketSession$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements WriteCallback {
        public final /* synthetic */ WebSocketSession this$0;

        public AnonymousClass2(WebSocketSession webSocketSession) {
        }

        @Override // com.facebook.stetho.websocket.WriteCallback
        public void onFailure(IOException iOException) {
        }

        @Override // com.facebook.stetho.websocket.WriteCallback
        public void onSuccess() {
        }
    }

    public WebSocketSession(InputStream inputStream, OutputStream outputStream, SimpleEndpoint simpleEndpoint) {
    }

    public static /* synthetic */ void access$000(WebSocketSession webSocketSession, IOException iOException) {
    }

    public static /* synthetic */ boolean access$100(WebSocketSession webSocketSession) {
    }

    public static /* synthetic */ void access$200(WebSocketSession webSocketSession, int i2, String str) {
    }

    public static /* synthetic */ void access$300(WebSocketSession webSocketSession, Frame frame) {
    }

    public static /* synthetic */ SimpleEndpoint access$400(WebSocketSession webSocketSession) {
    }

    private void doWrite(Frame frame) {
    }

    private void sendClose(int i2, String str) {
    }

    private void signalError(IOException iOException) {
    }

    private boolean signalErrorIfNotOpen() {
    }

    @Override // com.facebook.stetho.websocket.SimpleSession
    public void close(int i2, String str) {
    }

    public void handle() throws IOException {
    }

    @Override // com.facebook.stetho.websocket.SimpleSession
    public boolean isOpen() {
    }

    public void markAndSignalClosed(int i2, String str) {
    }

    public void markAndSignalOpen() {
    }

    public void markSentClose() {
    }

    @Override // com.facebook.stetho.websocket.SimpleSession
    public void sendBinary(byte[] bArr) {
    }

    @Override // com.facebook.stetho.websocket.SimpleSession
    public void sendText(String str) {
    }
}
