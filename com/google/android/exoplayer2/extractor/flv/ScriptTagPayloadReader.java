package com.google.android.exoplayer2.extractor.flv;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ScriptTagPayloadReader extends TagPayloadReader {
    private static final int AMF_TYPE_BOOLEAN = 1;
    private static final int AMF_TYPE_DATE = 11;
    private static final int AMF_TYPE_ECMA_ARRAY = 8;
    private static final int AMF_TYPE_END_MARKER = 9;
    private static final int AMF_TYPE_NUMBER = 0;
    private static final int AMF_TYPE_OBJECT = 3;
    private static final int AMF_TYPE_STRICT_ARRAY = 10;
    private static final int AMF_TYPE_STRING = 2;
    private static final String KEY_DURATION = "duration";
    private static final String KEY_FILE_POSITIONS = "filepositions";
    private static final String KEY_KEY_FRAMES = "keyframes";
    private static final String KEY_TIMES = "times";
    private static final String NAME_METADATA = "onMetaData";
    private long durationUs;
    private long[] keyFrameTagPositions;
    private long[] keyFrameTimesUs;

    private static Boolean readAmfBoolean(ParsableByteArray data) {
    }

    @Nullable
    private static Object readAmfData(ParsableByteArray data, int type) {
    }

    private static Date readAmfDate(ParsableByteArray data) {
    }

    private static Double readAmfDouble(ParsableByteArray data) {
    }

    private static HashMap<String, Object> readAmfEcmaArray(ParsableByteArray data) {
    }

    private static HashMap<String, Object> readAmfObject(ParsableByteArray data) {
    }

    private static ArrayList<Object> readAmfStrictArray(ParsableByteArray data) {
    }

    private static String readAmfString(ParsableByteArray data) {
    }

    private static int readAmfType(ParsableByteArray data) {
    }

    public long getDurationUs() {
    }

    public long[] getKeyFrameTagPositions() {
    }

    public long[] getKeyFrameTimesUs() {
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean parseHeader(ParsableByteArray data) {
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean parsePayload(ParsableByteArray data, long timeUs) {
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void seek() {
    }
}
