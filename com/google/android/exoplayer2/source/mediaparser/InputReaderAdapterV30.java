package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.upstream.DataReader;
import java.io.IOException;

@RequiresApi(30)
@SuppressLint({"Override"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class InputReaderAdapterV30 implements MediaParser.SeekableInputReader {
    private long currentPosition;
    @Nullable
    private DataReader dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public long getAndResetSeekPosition() {
    }

    @Override // android.media.MediaParser.InputReader
    public long getLength() {
    }

    @Override // android.media.MediaParser.InputReader
    public long getPosition() {
    }

    @Override // android.media.MediaParser.InputReader
    public int read(byte[] bytes, int offset, int readLength) throws IOException {
    }

    @Override // android.media.MediaParser.SeekableInputReader
    public void seekToPosition(long position) {
    }

    public void setCurrentPosition(long position) {
    }

    public void setDataReader(DataReader dataReader, long length) {
    }
}
