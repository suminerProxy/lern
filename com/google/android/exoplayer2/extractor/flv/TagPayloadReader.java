package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class TagPayloadReader {
    public final TrackOutput output;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String msg) {
        }
    }

    public TagPayloadReader(TrackOutput output) {
    }

    public final boolean consume(ParsableByteArray data, long timeUs) throws ParserException {
    }

    public abstract boolean parseHeader(ParsableByteArray data) throws ParserException;

    public abstract boolean parsePayload(ParsableByteArray data, long timeUs) throws ParserException;

    public abstract void seek();
}
