package com.tencent.android.tpns.mqtt.internal.websocket;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class WebSocketFrame {
    public static final int frameLengthOverhead = 6;
    private boolean closeFlag;
    private boolean fin;
    private byte opcode;
    private byte[] payload;

    public WebSocketFrame(byte b, boolean z, byte[] bArr) {
    }

    public static void appendFinAndOpCode(ByteBuffer byteBuffer, byte b, boolean z) {
    }

    private static void appendLength(ByteBuffer byteBuffer, int i2, boolean z) {
    }

    public static void appendLengthAndMask(ByteBuffer byteBuffer, int i2, byte[] bArr) {
    }

    public static byte[] generateMaskingKey() {
    }

    private void setFinAndOpCode(byte b) {
    }

    public byte[] encodeFrame() {
    }

    public byte getOpcode() {
    }

    public byte[] getPayload() {
    }

    public boolean isCloseFlag() {
    }

    public boolean isFin() {
    }

    public WebSocketFrame(byte[] bArr) {
    }

    public WebSocketFrame(InputStream inputStream) throws IOException {
    }
}
