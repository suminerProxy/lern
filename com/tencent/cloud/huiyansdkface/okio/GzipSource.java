package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class GzipSource implements Source {
    private static final byte FCOMMENT = 4;
    private static final byte FEXTRA = 2;
    private static final byte FHCRC = 1;
    private static final byte FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;
    private final CRC32 crc;
    private final Inflater inflater;
    private final InflaterSource inflaterSource;
    private int section;
    private final BufferedSource source;

    public GzipSource(Source source) {
    }

    private void checkEqual(String str, int i2, int i3) throws IOException {
    }

    private void consumeHeader() throws IOException {
    }

    private void consumeTrailer() throws IOException {
    }

    private void updateCrc(Buffer buffer, long j2, long j3) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Source
    public final long read(Buffer buffer, long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Source
    public final Timeout timeout() {
    }
}
