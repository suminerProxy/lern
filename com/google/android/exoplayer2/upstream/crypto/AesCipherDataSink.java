package com.google.android.exoplayer2.upstream.crypto;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AesCipherDataSink implements DataSink {
    @Nullable
    private AesFlushingCipher cipher;
    @Nullable
    private final byte[] scratch;
    private final byte[] secretKey;
    private final DataSink wrappedDataSink;

    public AesCipherDataSink(byte[] secretKey, DataSink wrappedDataSink) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(DataSpec dataSpec) throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] buffer, int offset, int length) throws IOException {
    }

    public AesCipherDataSink(byte[] secretKey, DataSink wrappedDataSink, @Nullable byte[] scratch) {
    }
}
