package com.google.android.exoplayer2.metadata.id3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    public static final FramePredicate NO_FRAMES_PREDICATE = null;
    private static final String TAG = "Id3Decoder";
    @Nullable
    private final FramePredicate framePredicate;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface FramePredicate {
        boolean evaluate(int majorVersion, int id0, int id1, int id2, int id3);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int majorVersion, boolean isUnsynchronized, int framesSize) {
        }

        public static /* synthetic */ int access$000(Id3Header id3Header) {
        }

        public static /* synthetic */ int access$100(Id3Header id3Header) {
        }

        public static /* synthetic */ boolean access$200(Id3Header id3Header) {
        }
    }

    public Id3Decoder() {
    }

    public static /* synthetic */ boolean a(int i2, int i3, int i4, int i5, int i6) {
    }

    private static byte[] copyOfRangeIfValid(byte[] data, int from, int to) {
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray id3Data, int frameSize, int majorVersion) throws UnsupportedEncodingException {
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray id3Data, int frameSize, String id) {
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray id3Data, int frameSize, int majorVersion, boolean unsignedIntFrameSizeHack, int frameHeaderSize, @Nullable FramePredicate framePredicate) throws UnsupportedEncodingException {
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray id3Data, int frameSize, int majorVersion, boolean unsignedIntFrameSizeHack, int frameHeaderSize, @Nullable FramePredicate framePredicate) throws UnsupportedEncodingException {
    }

    @Nullable
    private static CommentFrame decodeCommentFrame(ParsableByteArray id3Data, int frameSize) throws UnsupportedEncodingException {
    }

    @Nullable
    private static Id3Frame decodeFrame(int majorVersion, ParsableByteArray id3Data, boolean unsignedIntFrameSizeHack, int frameHeaderSize, @Nullable FramePredicate framePredicate) {
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray id3Data, int frameSize) throws UnsupportedEncodingException {
    }

    @Nullable
    private static Id3Header decodeHeader(ParsableByteArray data) {
    }

    private static MlltFrame decodeMlltFrame(ParsableByteArray id3Data, int frameSize) {
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray id3Data, int frameSize) throws UnsupportedEncodingException {
    }

    private static String decodeStringIfValid(byte[] data, int from, int to, String charsetName) throws UnsupportedEncodingException {
    }

    @Nullable
    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray id3Data, int frameSize, String id) throws UnsupportedEncodingException {
    }

    @Nullable
    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray id3Data, int frameSize) throws UnsupportedEncodingException {
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray id3Data, int frameSize, String id) throws UnsupportedEncodingException {
    }

    @Nullable
    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray id3Data, int frameSize) throws UnsupportedEncodingException {
    }

    private static int delimiterLength(int encodingByte) {
    }

    private static String getCharsetName(int encodingByte) {
    }

    private static String getFrameId(int majorVersion, int frameId0, int frameId1, int frameId2, int frameId3) {
    }

    private static int indexOfEos(byte[] data, int fromIndex, int encoding) {
    }

    private static int indexOfZeroByte(byte[] data, int fromIndex) {
    }

    private static int removeUnsynchronization(ParsableByteArray data, int length) {
    }

    private static boolean validateFrames(ParsableByteArray id3Data, int majorVersion, int frameHeaderSize, boolean unsignedIntFrameSizeHack) {
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    @Nullable
    public Metadata decode(MetadataInputBuffer inputBuffer, ByteBuffer buffer) {
    }

    public Id3Decoder(@Nullable FramePredicate framePredicate) {
    }

    @Nullable
    public Metadata decode(byte[] data, int size) {
    }
}
