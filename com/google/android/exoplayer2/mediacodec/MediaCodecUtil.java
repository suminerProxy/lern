package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@SuppressLint({"InlinedApi"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MediaCodecUtil {
    private static final String CODEC_ID_AV01 = "av01";
    private static final String CODEC_ID_AVC1 = "avc1";
    private static final String CODEC_ID_AVC2 = "avc2";
    private static final String CODEC_ID_HEV1 = "hev1";
    private static final String CODEC_ID_HVC1 = "hvc1";
    private static final String CODEC_ID_MP4A = "mp4a";
    private static final String CODEC_ID_VP09 = "vp09";
    private static final Pattern PROFILE_PATTERN = null;
    private static final String TAG = "MediaCodecUtil";
    @GuardedBy("MediaCodecUtil.class")
    private static final HashMap<CodecKey, List<MediaCodecInfo>> decoderInfosCache = null;
    private static int maxH264DecodableFrameSize;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CodecKey {
        public final String mimeType;
        public final boolean secure;
        public final boolean tunneling;

        public CodecKey(String mimeType, boolean secure, boolean tunneling) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public int hashCode() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DecoderQueryException extends Exception {
        public /* synthetic */ DecoderQueryException(Throwable th, AnonymousClass1 anonymousClass1) {
        }

        private DecoderQueryException(Throwable cause) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int index);

        boolean isFeatureRequired(String feature, String mimeType, MediaCodecInfo.CodecCapabilities capabilities);

        boolean isFeatureSupported(String feature, String mimeType, MediaCodecInfo.CodecCapabilities capabilities);

        boolean secureDecodersExplicit();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        private MediaCodecListCompatV16() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int index) {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(String feature, String mimeType, MediaCodecInfo.CodecCapabilities capabilities) {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(String feature, String mimeType, MediaCodecInfo.CodecCapabilities capabilities) {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
        }

        public /* synthetic */ MediaCodecListCompatV16(AnonymousClass1 anonymousClass1) {
        }
    }

    @RequiresApi(21)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MediaCodecListCompatV21 implements MediaCodecListCompat {
        private final int codecKind;
        @Nullable
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        public MediaCodecListCompatV21(boolean includeSecure, boolean includeTunneling) {
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        private void ensureMediaCodecInfosInitialized() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int index) {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(String feature, String mimeType, MediaCodecInfo.CodecCapabilities capabilities) {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(String feature, String mimeType, MediaCodecInfo.CodecCapabilities capabilities) {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface ScoreProvider<T> {
        int getScore(T t);
    }

    private MediaCodecUtil() {
    }

    public static /* synthetic */ int a(MediaCodecInfo mediaCodecInfo) {
    }

    private static void applyWorkarounds(String mimeType, List<MediaCodecInfo> decoderInfos) {
    }

    private static int av1LevelNumberToConst(int levelNumber) {
    }

    private static int avcLevelNumberToConst(int levelNumber) {
    }

    private static int avcLevelToMaxFrameSize(int avcLevel) {
    }

    private static int avcProfileNumberToConst(int profileNumber) {
    }

    public static /* synthetic */ int b(MediaCodecInfo mediaCodecInfo) {
    }

    public static /* synthetic */ int c(Format format, MediaCodecInfo mediaCodecInfo) {
    }

    public static synchronized void clearDecoderInfoCache() {
    }

    public static /* synthetic */ int d(ScoreProvider scoreProvider, Object obj, Object obj2) {
    }

    @Nullable
    private static Integer dolbyVisionStringToLevel(@Nullable String levelString) {
    }

    @Nullable
    private static Integer dolbyVisionStringToProfile(@Nullable String profileString) {
    }

    @Nullable
    private static Pair<Integer, Integer> getAacCodecProfileAndLevel(String codec, String[] parts) {
    }

    @Nullable
    private static Pair<Integer, Integer> getAv1ProfileAndLevel(String codec, String[] parts, @Nullable ColorInfo colorInfo) {
    }

    @Nullable
    private static Pair<Integer, Integer> getAvcProfileAndLevel(String codec, String[] parts) {
    }

    @Nullable
    private static String getCodecMimeType(android.media.MediaCodecInfo info, String name, String mimeType) {
    }

    @Nullable
    public static Pair<Integer, Integer> getCodecProfileAndLevel(Format format) {
    }

    @Nullable
    public static MediaCodecInfo getDecoderInfo(String mimeType, boolean secure, boolean tunneling) throws DecoderQueryException {
    }

    public static synchronized List<MediaCodecInfo> getDecoderInfos(String mimeType, boolean secure, boolean tunneling) throws DecoderQueryException {
    }

    private static ArrayList<MediaCodecInfo> getDecoderInfosInternal(CodecKey key, MediaCodecListCompat mediaCodecList) throws DecoderQueryException {
    }

    @CheckResult
    public static List<MediaCodecInfo> getDecoderInfosSortedByFormatSupport(List<MediaCodecInfo> decoderInfos, Format format) {
    }

    @Nullable
    public static MediaCodecInfo getDecryptOnlyDecoderInfo() throws DecoderQueryException {
    }

    @Nullable
    private static Pair<Integer, Integer> getDolbyVisionProfileAndLevel(String codec, String[] parts) {
    }

    @Nullable
    private static Pair<Integer, Integer> getHevcProfileAndLevel(String codec, String[] parts) {
    }

    @Nullable
    private static Pair<Integer, Integer> getVp9ProfileAndLevel(String codec, String[] parts) {
    }

    @Nullable
    private static Integer hevcCodecStringToProfileLevel(@Nullable String codecString) {
    }

    private static boolean isAlias(android.media.MediaCodecInfo info) {
    }

    @RequiresApi(29)
    private static boolean isAliasV29(android.media.MediaCodecInfo info) {
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo info, String name, boolean secureDecodersExplicit, String mimeType) {
    }

    private static boolean isHardwareAccelerated(android.media.MediaCodecInfo codecInfo) {
    }

    @RequiresApi(29)
    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo codecInfo) {
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo codecInfo) {
    }

    @RequiresApi(29)
    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo codecInfo) {
    }

    private static boolean isVendor(android.media.MediaCodecInfo codecInfo) {
    }

    @RequiresApi(29)
    private static boolean isVendorV29(android.media.MediaCodecInfo codecInfo) {
    }

    public static int maxH264DecodableFrameSize() throws DecoderQueryException {
    }

    private static int mp4aAudioObjectTypeToProfile(int profileNumber) {
    }

    private static <T> void sortByScore(List<T> list, ScoreProvider<T> scoreProvider) {
    }

    private static int vp9LevelNumberToConst(int levelNumber) {
    }

    private static int vp9ProfileNumberToConst(int profileNumber) {
    }

    public static void warmDecoderInfoCache(String mimeType, boolean secure, boolean tunneling) {
    }
}
