package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataReader;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultExtractorInput implements ExtractorInput {
    private static final int PEEK_MAX_FREE_SPACE = 524288;
    private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
    private static final int SCRATCH_SPACE_SIZE = 4096;
    private final DataReader dataReader;
    private byte[] peekBuffer;
    private int peekBufferLength;
    private int peekBufferPosition;
    private long position;
    private final byte[] scratchSpace;
    private final long streamLength;

    public DefaultExtractorInput(DataReader dataReader, long position, long length) {
    }

    private void commitBytesRead(int bytesRead) {
    }

    private void ensureSpaceForPeek(int length) {
    }

    private int readFromPeekBuffer(byte[] target, int offset, int length) {
    }

    private int readFromUpstream(byte[] target, int offset, int length, int bytesAlreadyRead, boolean allowEndOfInput) throws IOException {
    }

    private int skipFromPeekBuffer(int length) {
    }

    private void updatePeekBuffer(int bytesConsumed) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean advancePeekPosition(int length, boolean allowEndOfInput) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int peek(byte[] target, int offset, int length) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean peekFully(byte[] target, int offset, int length, boolean allowEndOfInput) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean readFully(byte[] target, int offset, int length, boolean allowEndOfInput) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void resetPeekPosition() {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long position, E e2) throws Throwable {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int skip(int length) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean skipFully(int length, boolean allowEndOfInput) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void peekFully(byte[] target, int offset, int length) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] target, int offset, int length) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void skipFully(int length) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void advancePeekPosition(int length) throws IOException {
    }
}
