package com.google.android.exoplayer2.text;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.OutputBuffer;
import com.google.android.exoplayer2.decoder.SimpleDecoder;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class SimpleSubtitleDecoder extends SimpleDecoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> implements SubtitleDecoder {
    private final String name;

    public SimpleSubtitleDecoder(String name) {
    }

    public static /* synthetic */ void a(SimpleSubtitleDecoder simpleSubtitleDecoder, OutputBuffer outputBuffer) {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public /* bridge */ /* synthetic */ SubtitleInputBuffer createInputBuffer() {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public /* bridge */ /* synthetic */ SubtitleOutputBuffer createOutputBuffer() {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public /* bridge */ /* synthetic */ SubtitleDecoderException createUnexpectedDecodeException(Throwable error) {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleDecoderException decode(SubtitleInputBuffer inputBuffer, SubtitleOutputBuffer outputBuffer, boolean reset) {
    }

    public abstract Subtitle decode(byte[] data, int size, boolean reset) throws SubtitleDecoderException;

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final String getName() {
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long positionUs) {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    /* renamed from: createInputBuffer  reason: avoid collision after fix types in other method */
    public final SubtitleInputBuffer createInputBuffer2() {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    /* renamed from: createOutputBuffer  reason: avoid collision after fix types in other method */
    public final SubtitleOutputBuffer createOutputBuffer2() {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    /* renamed from: createUnexpectedDecodeException  reason: avoid collision after fix types in other method */
    public final SubtitleDecoderException createUnexpectedDecodeException2(Throwable error) {
    }

    @Nullable
    /* renamed from: decode  reason: avoid collision after fix types in other method */
    public final SubtitleDecoderException decode2(SubtitleInputBuffer inputBuffer, SubtitleOutputBuffer outputBuffer, boolean reset) {
    }
}
