package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.common.collect.Ordering;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DefaultTrackSelector extends MappingTrackSelector {
    private static final Ordering<Integer> FORMAT_VALUE_ORDERING = null;
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    private static final Ordering<Integer> NO_ORDER = null;
    private static final int[] NO_TRACKS = null;
    private final AtomicReference<Parameters> parametersReference;
    private final ExoTrackSelection.Factory trackSelectionFactory;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AudioTrackScore implements Comparable<AudioTrackScore> {
        private final int bitrate;
        private final int channelCount;
        private final boolean isDefaultSelectionFlag;
        public final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;
        @Nullable
        private final String language;
        private final int localeLanguageMatchIndex;
        private final int localeLanguageScore;
        private final Parameters parameters;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int sampleRate;

        public AudioTrackScore(Format format, Parameters parameters, int formatSupport) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(AudioTrackScore other) {
        }

        /* renamed from: compareTo  reason: avoid collision after fix types in other method */
        public int compareTo2(AudioTrackScore other) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class OtherTrackScore implements Comparable<OtherTrackScore> {
        private final boolean isDefault;
        private final boolean isWithinRendererCapabilities;

        public OtherTrackScore(Format format, int trackFormatSupport) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(OtherTrackScore other) {
        }

        /* renamed from: compareTo  reason: avoid collision after fix types in other method */
        public int compareTo2(OtherTrackScore other) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Parameters extends TrackSelectionParameters implements Parcelable {
        public static final Parcelable.Creator<Parameters> CREATOR = null;
        @Deprecated
        public static final Parameters DEFAULT = null;
        public static final Parameters DEFAULT_WITHOUT_CONTEXT = null;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final int disabledTextTrackSelectionFlags;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        private final SparseBooleanArray rendererDisabledFlags;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;

        /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Parcelable.Creator<Parameters> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Parameters createFromParcel(Parcel in) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Parameters[] newArray(int size) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Parameters createFromParcel(Parcel in) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Parameters[] newArray(int size) {
            }
        }

        public /* synthetic */ Parameters(ParametersBuilder parametersBuilder, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ SparseArray access$000(Parameters parameters) {
        }

        public static /* synthetic */ SparseBooleanArray access$100(Parameters parameters) {
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray first, SparseBooleanArray second) {
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> first, SparseArray<Map<TrackGroupArray, SelectionOverride>> second) {
        }

        public static Parameters getDefaults(Context context) {
        }

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> readSelectionOverrides(Parcel in) {
        }

        private static void writeSelectionOverridesToParcel(Parcel dest, SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder buildUpon() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public int describeContents() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public boolean equals(@Nullable Object obj) {
        }

        public final boolean getRendererDisabled(int rendererIndex) {
        }

        @Nullable
        public final SelectionOverride getSelectionOverride(int rendererIndex, TrackGroupArray groups) {
        }

        public final boolean hasSelectionOverride(int rendererIndex, TrackGroupArray groups) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public int hashCode() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
        }

        private Parameters(ParametersBuilder builder) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public ParametersBuilder buildUpon() {
        }

        private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, SelectionOverride> first, Map<TrackGroupArray, SelectionOverride> second) {
        }

        public Parameters(Parcel in) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {
        private boolean allowAudioMixedChannelCountAdaptiveness;
        private boolean allowAudioMixedMimeTypeAdaptiveness;
        private boolean allowAudioMixedSampleRateAdaptiveness;
        private boolean allowMultipleAdaptiveSelections;
        private boolean allowVideoMixedMimeTypeAdaptiveness;
        private boolean allowVideoNonSeamlessAdaptiveness;
        private int disabledTextTrackSelectionFlags;
        private boolean exceedAudioConstraintsIfNecessary;
        private boolean exceedRendererCapabilitiesIfNecessary;
        private boolean exceedVideoConstraintsIfNecessary;
        private final SparseBooleanArray rendererDisabledFlags;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        private boolean tunnelingEnabled;

        public /* synthetic */ ParametersBuilder(Parameters parameters, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ int access$1000(ParametersBuilder parametersBuilder) {
        }

        public static /* synthetic */ boolean access$1100(ParametersBuilder parametersBuilder) {
        }

        public static /* synthetic */ boolean access$1200(ParametersBuilder parametersBuilder) {
        }

        public static /* synthetic */ boolean access$1300(ParametersBuilder parametersBuilder) {
        }

        public static /* synthetic */ SparseArray access$1400(ParametersBuilder parametersBuilder) {
        }

        public static /* synthetic */ SparseBooleanArray access$1500(ParametersBuilder parametersBuilder) {
        }

        public static /* synthetic */ boolean access$300(ParametersBuilder parametersBuilder) {
        }

        public static /* synthetic */ boolean access$400(ParametersBuilder parametersBuilder) {
        }

        public static /* synthetic */ boolean access$500(ParametersBuilder parametersBuilder) {
        }

        public static /* synthetic */ boolean access$600(ParametersBuilder parametersBuilder) {
        }

        public static /* synthetic */ boolean access$700(ParametersBuilder parametersBuilder) {
        }

        public static /* synthetic */ boolean access$800(ParametersBuilder parametersBuilder) {
        }

        public static /* synthetic */ boolean access$900(ParametersBuilder parametersBuilder) {
        }

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides) {
        }

        private void init() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters build() {
        }

        public final ParametersBuilder clearSelectionOverride(int rendererIndex, TrackGroupArray groups) {
        }

        public final ParametersBuilder clearSelectionOverrides(int rendererIndex) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder clearVideoSizeConstraints() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder clearViewportSizeConstraints() {
        }

        public ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean allowAudioMixedChannelCountAdaptiveness) {
        }

        public ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean allowAudioMixedMimeTypeAdaptiveness) {
        }

        public ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean allowAudioMixedSampleRateAdaptiveness) {
        }

        public ParametersBuilder setAllowMultipleAdaptiveSelections(boolean allowMultipleAdaptiveSelections) {
        }

        public ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean allowVideoMixedMimeTypeAdaptiveness) {
        }

        public ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean allowVideoNonSeamlessAdaptiveness) {
        }

        public ParametersBuilder setDisabledTextTrackSelectionFlags(int disabledTextTrackSelectionFlags) {
        }

        public ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean exceedAudioConstraintsIfNecessary) {
        }

        public ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean exceedRendererCapabilitiesIfNecessary) {
        }

        public ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean exceedVideoConstraintsIfNecessary) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setForceHighestSupportedBitrate(boolean forceHighestSupportedBitrate) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setForceLowestBitrate(boolean forceLowestBitrate) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxAudioBitrate(int maxAudioBitrate) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxAudioChannelCount(int maxAudioChannelCount) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxVideoBitrate(int maxVideoBitrate) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxVideoFrameRate(int maxVideoFrameRate) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxVideoSize(int maxVideoWidth, int maxVideoHeight) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxVideoSizeSd() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMinVideoBitrate(int minVideoBitrate) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMinVideoFrameRate(int minVideoFrameRate) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMinVideoSize(int minVideoWidth, int minVideoHeight) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioLanguage(@Nullable String preferredAudioLanguage) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioLanguages(String[] preferredAudioLanguages) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioMimeType(@Nullable String mimeType) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioMimeTypes(String[] mimeTypes) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioRoleFlags(int preferredAudioRoleFlags) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredTextLanguage(@Nullable String preferredTextLanguage) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredTextLanguages(String[] preferredTextLanguages) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredTextRoleFlags(int preferredTextRoleFlags) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredVideoMimeType(@Nullable String mimeType) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredVideoMimeTypes(String[] mimeTypes) {
        }

        public final ParametersBuilder setRendererDisabled(int rendererIndex, boolean disabled) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setSelectUndeterminedTextLanguage(boolean selectUndeterminedTextLanguage) {
        }

        public final ParametersBuilder setSelectionOverride(int rendererIndex, TrackGroupArray groups, @Nullable SelectionOverride override) {
        }

        public ParametersBuilder setTunnelingEnabled(boolean tunnelingEnabled) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setViewportSize(int viewportWidth, int viewportHeight, boolean viewportOrientationMayChange) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setViewportSizeToPhysicalDisplaySize(Context context, boolean viewportOrientationMayChange) {
        }

        @Deprecated
        public ParametersBuilder() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public Parameters build() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder clearVideoSizeConstraints() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder clearViewportSizeConstraints() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setForceHighestSupportedBitrate(boolean forceHighestSupportedBitrate) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setForceLowestBitrate(boolean forceLowestBitrate) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxAudioBitrate(int maxAudioBitrate) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxAudioChannelCount(int maxAudioChannelCount) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoBitrate(int maxVideoBitrate) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoFrameRate(int maxVideoFrameRate) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoSize(int maxVideoWidth, int maxVideoHeight) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoSizeSd() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoBitrate(int minVideoBitrate) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoFrameRate(int minVideoFrameRate) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoSize(int minVideoWidth, int minVideoHeight) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLanguage(@Nullable String preferredAudioLanguage) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLanguages(String... preferredAudioLanguages) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioMimeType(@Nullable String mimeType) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioMimeTypes(String... mimeTypes) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioRoleFlags(int preferredAudioRoleFlags) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguage(@Nullable String preferredTextLanguage) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguages(String... preferredTextLanguages) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextRoleFlags(int preferredTextRoleFlags) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoMimeType(@Nullable String mimeType) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoMimeTypes(String... mimeTypes) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setSelectUndeterminedTextLanguage(boolean selectUndeterminedTextLanguage) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setViewportSize(int viewportWidth, int viewportHeight, boolean viewportOrientationMayChange) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean viewportOrientationMayChange) {
        }

        public final ParametersBuilder clearSelectionOverrides() {
        }

        public ParametersBuilder(Context context) {
        }

        private ParametersBuilder(Parameters initialValues) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = null;
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Parcelable.Creator<SelectionOverride> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SelectionOverride createFromParcel(Parcel in) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SelectionOverride[] newArray(int size) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SelectionOverride createFromParcel(Parcel in) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SelectionOverride[] newArray(int size) {
            }
        }

        public SelectionOverride(int groupIndex, int... tracks) {
        }

        public boolean containsTrack(int track) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public int hashCode() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
        }

        public SelectionOverride(int groupIndex, int[] tracks, int type) {
        }

        public SelectionOverride(Parcel in) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TextTrackScore implements Comparable<TextTrackScore> {
        private final boolean hasCaptionRoleFlags;
        private final boolean isDefault;
        private final boolean isForced;
        public final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredRoleFlagsScore;
        private final int selectedAudioLanguageScore;

        public TextTrackScore(Format format, Parameters parameters, int trackFormatSupport, @Nullable String selectedAudioLanguage) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(TextTrackScore other) {
        }

        /* renamed from: compareTo  reason: avoid collision after fix types in other method */
        public int compareTo2(TextTrackScore other) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class VideoTrackScore implements Comparable<VideoTrackScore> {
        private final int bitrate;
        public final boolean isWithinMaxConstraints;
        private final boolean isWithinMinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final Parameters parameters;
        private final int pixelCount;
        private final int preferredMimeTypeMatchIndex;

        public VideoTrackScore(Format format, Parameters parameters, int formatSupport, boolean isSuitableForViewport) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(VideoTrackScore other) {
        }

        /* renamed from: compareTo  reason: avoid collision after fix types in other method */
        public int compareTo2(VideoTrackScore other) {
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
    }

    public static /* synthetic */ int a(Integer num, Integer num2) {
    }

    public static /* synthetic */ Ordering access$1700() {
    }

    public static /* synthetic */ Ordering access$1800() {
    }

    public static /* synthetic */ int b(Integer num, Integer num2) {
    }

    private static void filterAdaptiveVideoTrackCountForMimeType(TrackGroup group, int[] formatSupport, int requiredAdaptiveSupport, @Nullable String mimeType, int maxVideoWidth, int maxVideoHeight, int maxVideoFrameRate, int maxVideoBitrate, int minVideoWidth, int minVideoHeight, int minVideoFrameRate, int minVideoBitrate, List<Integer> selectedTrackIndices) {
    }

    private static int[] getAdaptiveAudioTracks(TrackGroup group, int[] formatSupport, int primaryTrackIndex, int maxAudioBitrate, boolean allowMixedMimeTypeAdaptiveness, boolean allowMixedSampleRateAdaptiveness, boolean allowAudioMixedChannelCountAdaptiveness) {
    }

    private static int getAdaptiveVideoTrackCountForMimeType(TrackGroup group, int[] formatSupport, int requiredAdaptiveSupport, @Nullable String mimeType, int maxVideoWidth, int maxVideoHeight, int maxVideoFrameRate, int maxVideoBitrate, int minVideoWidth, int minVideoHeight, int minVideoFrameRate, int minVideoBitrate, List<Integer> selectedTrackIndices) {
    }

    private static int[] getAdaptiveVideoTracksForGroup(TrackGroup group, int[] formatSupport, boolean allowMixedMimeTypes, int requiredAdaptiveSupport, int maxVideoWidth, int maxVideoHeight, int maxVideoFrameRate, int maxVideoBitrate, int minVideoWidth, int minVideoHeight, int minVideoFrameRate, int minVideoBitrate, int viewportWidth, int viewportHeight, boolean viewportOrientationMayChange) {
    }

    public static int getFormatLanguageScore(Format format, @Nullable String language, boolean allowUndeterminedFormatLanguage) {
    }

    private static Point getMaxVideoSizeInViewport(boolean orientationMayChange, int viewportWidth, int viewportHeight, int videoWidth, int videoHeight) {
    }

    private static List<Integer> getViewportFilteredTrackIndices(TrackGroup group, int viewportWidth, int viewportHeight, boolean orientationMayChange) {
    }

    public static boolean isSupported(int formatSupport, boolean allowExceedsCapabilities) {
    }

    private static boolean isSupportedAdaptiveAudioTrack(Format format, int formatSupport, Format primaryFormat, int maxAudioBitrate, boolean allowMixedMimeTypeAdaptiveness, boolean allowMixedSampleRateAdaptiveness, boolean allowAudioMixedChannelCountAdaptiveness) {
    }

    private static boolean isSupportedAdaptiveVideoTrack(Format format, @Nullable String mimeType, int formatSupport, int requiredAdaptiveSupport, int maxVideoWidth, int maxVideoHeight, int maxVideoFrameRate, int maxVideoBitrate, int minVideoWidth, int minVideoHeight, int minVideoFrameRate, int minVideoBitrate) {
    }

    private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] renderererFormatSupports, RendererConfiguration[] rendererConfigurations, ExoTrackSelection[] trackSelections) {
    }

    @Nullable
    public static String normalizeUndeterminedLanguageToNull(@Nullable String language) {
    }

    private static boolean rendererSupportsTunneling(int[][] formatSupport, TrackGroupArray trackGroups, ExoTrackSelection selection) {
    }

    @Nullable
    private static ExoTrackSelection.Definition selectAdaptiveVideoTrack(TrackGroupArray groups, int[][] formatSupport, int mixedMimeTypeAdaptationSupports, Parameters params) {
    }

    @Nullable
    private static ExoTrackSelection.Definition selectFixedVideoTrack(TrackGroupArray groups, int[][] formatSupport, Parameters params) {
    }

    public ParametersBuilder buildUponParameters() {
    }

    public Parameters getParameters() {
    }

    public ExoTrackSelection.Definition[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] rendererFormatSupports, int[] rendererMixedMimeTypeAdaptationSupports, Parameters params) throws ExoPlaybackException {
    }

    @Nullable
    public Pair<ExoTrackSelection.Definition, AudioTrackScore> selectAudioTrack(TrackGroupArray groups, int[][] formatSupport, int mixedMimeTypeAdaptationSupports, Parameters params, boolean enableAdaptiveTrackSelection) throws ExoPlaybackException {
    }

    @Nullable
    public ExoTrackSelection.Definition selectOtherTrack(int trackType, TrackGroupArray groups, int[][] formatSupport, Parameters params) throws ExoPlaybackException {
    }

    @Nullable
    public Pair<ExoTrackSelection.Definition, TextTrackScore> selectTextTrack(TrackGroupArray groups, int[][] formatSupport, Parameters params, @Nullable String selectedAudioLanguage) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.trackselection.MappingTrackSelector
    public final Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] rendererFormatSupports, int[] rendererMixedMimeTypeAdaptationSupports, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException {
    }

    @Nullable
    public ExoTrackSelection.Definition selectVideoTrack(TrackGroupArray groups, int[][] formatSupport, int mixedMimeTypeAdaptationSupports, Parameters params, boolean enableAdaptiveTrackSelection) throws ExoPlaybackException {
    }

    public void setParameters(Parameters parameters) {
    }

    @Deprecated
    public DefaultTrackSelector(ExoTrackSelection.Factory trackSelectionFactory) {
    }

    public DefaultTrackSelector(Context context) {
    }

    public DefaultTrackSelector(Context context, ExoTrackSelection.Factory trackSelectionFactory) {
    }

    public void setParameters(ParametersBuilder parametersBuilder) {
    }

    public DefaultTrackSelector(Parameters parameters, ExoTrackSelection.Factory trackSelectionFactory) {
    }
}
