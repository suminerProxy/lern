package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.OutputBuffer;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SimpleOutputBuffer extends OutputBuffer {
    @Nullable
    public ByteBuffer data;
    private final OutputBuffer.Owner<SimpleOutputBuffer> owner;

    public SimpleOutputBuffer(OutputBuffer.Owner<SimpleOutputBuffer> owner) {
    }

    @Override // com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
    }

    public ByteBuffer init(long timeUs, int size) {
    }

    @Override // com.google.android.exoplayer2.decoder.OutputBuffer
    public void release() {
    }
}
