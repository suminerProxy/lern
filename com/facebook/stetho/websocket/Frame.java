package com.facebook.stetho.websocket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Frame {
    public static final byte OPCODE_BINARY_FRAME = 2;
    public static final byte OPCODE_CONNECTION_CLOSE = 8;
    public static final byte OPCODE_CONNECTION_PING = 9;
    public static final byte OPCODE_CONNECTION_PONG = 10;
    public static final byte OPCODE_TEXT_FRAME = 1;
    public boolean fin;
    public boolean hasMask;
    public byte[] maskingKey;
    public byte opcode;
    public byte[] payloadData;
    public long payloadLen;
    public boolean rsv1;
    public boolean rsv2;
    public boolean rsv3;

    private void decodeFirstByte(byte b) {
    }

    private long decodeLength(byte b, InputStream inputStream) throws IOException {
    }

    private static byte[] decodeMaskingKey(InputStream inputStream) throws IOException {
    }

    private byte encodeFirstByte() {
    }

    private static byte[] encodeLength(long j2) {
    }

    private static byte readByteOrThrow(InputStream inputStream) throws IOException {
    }

    private static void readBytesOrThrow(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
    }

    public void readFrom(BufferedInputStream bufferedInputStream) throws IOException {
    }

    public void writeTo(BufferedOutputStream bufferedOutputStream) throws IOException {
    }
}
