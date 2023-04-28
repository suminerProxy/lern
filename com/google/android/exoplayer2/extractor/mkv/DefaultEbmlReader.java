package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultEbmlReader implements EbmlReader {
    private static final int ELEMENT_STATE_READ_CONTENT = 2;
    private static final int ELEMENT_STATE_READ_CONTENT_SIZE = 1;
    private static final int ELEMENT_STATE_READ_ID = 0;
    private static final int MAX_ID_BYTES = 4;
    private static final int MAX_INTEGER_ELEMENT_SIZE_BYTES = 8;
    private static final int MAX_LENGTH_BYTES = 8;
    private static final int VALID_FLOAT32_ELEMENT_SIZE_BYTES = 4;
    private static final int VALID_FLOAT64_ELEMENT_SIZE_BYTES = 8;
    private long elementContentSize;
    private int elementId;
    private int elementState;
    private final ArrayDeque<MasterElement> masterElementsStack;
    private EbmlProcessor processor;
    private final byte[] scratch;
    private final VarintReader varintReader;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MasterElement {
        private final long elementEndPosition;
        private final int elementId;

        public /* synthetic */ MasterElement(int i2, long j2, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ long access$000(MasterElement masterElement) {
        }

        public static /* synthetic */ int access$100(MasterElement masterElement) {
        }

        private MasterElement(int elementId, long elementEndPosition) {
        }
    }

    @RequiresNonNull({"processor"})
    private long maybeResyncToNextLevel1Element(ExtractorInput input) throws IOException {
    }

    private double readFloat(ExtractorInput input, int byteLength) throws IOException {
    }

    private long readInteger(ExtractorInput input, int byteLength) throws IOException {
    }

    private static String readString(ExtractorInput input, int byteLength) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlReader
    public void init(EbmlProcessor processor) {
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlReader
    public boolean read(ExtractorInput input) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlReader
    public void reset() {
    }
}
