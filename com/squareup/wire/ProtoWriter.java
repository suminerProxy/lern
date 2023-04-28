package com.squareup.wire;

import java.io.IOException;
import okio.BufferedSink;
import okio.ByteString;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ProtoWriter {
    private final BufferedSink sink;

    public ProtoWriter(BufferedSink bufferedSink) {
    }

    public static int decodeZigZag32(int i2) {
    }

    public static long decodeZigZag64(long j2) {
    }

    public static int encodeZigZag32(int i2) {
    }

    public static long encodeZigZag64(long j2) {
    }

    public static int int32Size(int i2) {
    }

    private static int makeTag(int i2, FieldEncoding fieldEncoding) {
    }

    public static int tagSize(int i2) {
    }

    public static int utf8Length(String str) {
    }

    public static int varint32Size(int i2) {
    }

    public static int varint64Size(long j2) {
    }

    public void writeBytes(ByteString byteString) throws IOException {
    }

    public void writeFixed32(int i2) throws IOException {
    }

    public void writeFixed64(long j2) throws IOException {
    }

    public void writeSignedVarint32(int i2) throws IOException {
    }

    public void writeString(String str) throws IOException {
    }

    public void writeTag(int i2, FieldEncoding fieldEncoding) throws IOException {
    }

    public void writeVarint32(int i2) throws IOException {
    }

    public void writeVarint64(long j2) throws IOException {
    }
}
