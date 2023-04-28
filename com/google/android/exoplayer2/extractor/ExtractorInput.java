package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataReader;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface ExtractorInput extends DataReader {
    void advancePeekPosition(int length) throws IOException;

    boolean advancePeekPosition(int length, boolean allowEndOfInput) throws IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(byte[] target, int offset, int length) throws IOException;

    void peekFully(byte[] target, int offset, int length) throws IOException;

    boolean peekFully(byte[] target, int offset, int length, boolean allowEndOfInput) throws IOException;

    @Override // com.google.android.exoplayer2.upstream.DataReader
    int read(byte[] buffer, int offset, int length) throws IOException;

    void readFully(byte[] target, int offset, int length) throws IOException;

    boolean readFully(byte[] target, int offset, int length, boolean allowEndOfInput) throws IOException;

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long position, E e2) throws Throwable;

    int skip(int length) throws IOException;

    void skipFully(int length) throws IOException;

    boolean skipFully(int length, boolean allowEndOfInput) throws IOException;
}
