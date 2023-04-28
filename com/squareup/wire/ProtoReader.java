package com.squareup.wire;

import java.io.IOException;
import okio.BufferedSource;
import okio.ByteString;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ProtoReader {
    private static final int FIELD_ENCODING_MASK = 7;
    private static final int RECURSION_LIMIT = 65;
    private static final int STATE_END_GROUP = 4;
    private static final int STATE_FIXED32 = 5;
    private static final int STATE_FIXED64 = 1;
    private static final int STATE_LENGTH_DELIMITED = 2;
    private static final int STATE_PACKED_TAG = 7;
    private static final int STATE_START_GROUP = 3;
    private static final int STATE_TAG = 6;
    private static final int STATE_VARINT = 0;
    public static final int TAG_FIELD_ENCODING_BITS = 3;
    private long limit;
    private FieldEncoding nextFieldEncoding;
    private long pos;
    private long pushedLimit;
    private int recursionDepth;
    private final BufferedSource source;
    private int state;
    private int tag;

    public ProtoReader(BufferedSource bufferedSource) {
    }

    private void afterPackableScalar(int i2) throws IOException {
    }

    private long beforeLengthDelimitedScalar() throws IOException {
    }

    private int internalReadVarint32() throws IOException {
    }

    private void skipGroup(int i2) throws IOException {
    }

    public long beginMessage() throws IOException {
    }

    public void endMessage(long j2) throws IOException {
    }

    public int nextTag() throws IOException {
    }

    public FieldEncoding peekFieldEncoding() {
    }

    public ByteString readBytes() throws IOException {
    }

    public int readFixed32() throws IOException {
    }

    public long readFixed64() throws IOException {
    }

    public String readString() throws IOException {
    }

    public int readVarint32() throws IOException {
    }

    public long readVarint64() throws IOException {
    }

    public void skip() throws IOException {
    }
}
