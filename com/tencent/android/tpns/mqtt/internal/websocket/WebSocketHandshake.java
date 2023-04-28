package com.tencent.android.tpns.mqtt.internal.websocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class WebSocketHandshake {
    private static final String ACCEPT_SALT = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    private static final String EMPTY = "";
    private static final String HTTP_HEADER_CONNECTION = "connection";
    private static final String HTTP_HEADER_CONNECTION_VALUE = "upgrade";
    private static final String HTTP_HEADER_SEC_WEBSOCKET_ACCEPT = "sec-websocket-accept";
    private static final String HTTP_HEADER_SEC_WEBSOCKET_PROTOCOL = "sec-websocket-protocol";
    private static final String HTTP_HEADER_UPGRADE = "upgrade";
    private static final String HTTP_HEADER_UPGRADE_WEBSOCKET = "websocket";
    private static final String LINE_SEPARATOR = "\r\n";
    private static final String SHA1_PROTOCOL = "SHA1";
    public String host;
    public InputStream input;
    public OutputStream output;
    public int port;
    public String uri;

    public WebSocketHandshake(InputStream inputStream, OutputStream outputStream, String str, String str2, int i2) {
    }

    private Map getHeaders(ArrayList arrayList) {
    }

    private void receiveHandshakeResponse(String str) throws IOException {
    }

    private void sendHandshakeRequest(String str) throws IOException {
    }

    private byte[] sha1(String str) throws NoSuchAlgorithmException {
    }

    private void verifyWebSocketKey(String str, String str2) throws NoSuchAlgorithmException, HandshakeFailedException {
    }

    public void execute() throws IOException {
    }
}
