package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ByteArrayDataSink implements DataSink {
    private ByteArrayOutputStream stream;

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws IOException {
    }

    @Nullable
    public byte[] getData() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(DataSpec dataSpec) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] buffer, int offset, int length) {
    }
}
