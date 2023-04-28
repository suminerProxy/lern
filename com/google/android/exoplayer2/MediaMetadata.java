package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MediaMetadata implements Bundleable {
    public static final Bundleable.Creator<MediaMetadata> CREATOR = null;
    public static final MediaMetadata EMPTY = null;
    private static final int FIELD_ALBUM_ARTIST = 3;
    private static final int FIELD_ALBUM_TITLE = 2;
    private static final int FIELD_ARTIST = 1;
    private static final int FIELD_ARTWORK_DATA = 10;
    private static final int FIELD_ARTWORK_DATA_TYPE = 29;
    private static final int FIELD_ARTWORK_URI = 11;
    private static final int FIELD_COMPILATION = 28;
    private static final int FIELD_COMPOSER = 23;
    private static final int FIELD_CONDUCTOR = 24;
    private static final int FIELD_DESCRIPTION = 6;
    private static final int FIELD_DISC_NUMBER = 25;
    private static final int FIELD_DISPLAY_TITLE = 4;
    private static final int FIELD_EXTRAS = 1000;
    private static final int FIELD_FOLDER_TYPE = 14;
    private static final int FIELD_GENRE = 27;
    private static final int FIELD_IS_PLAYABLE = 15;
    private static final int FIELD_MEDIA_URI = 7;
    private static final int FIELD_OVERALL_RATING = 9;
    private static final int FIELD_RECORDING_DAY = 18;
    private static final int FIELD_RECORDING_MONTH = 17;
    private static final int FIELD_RECORDING_YEAR = 16;
    private static final int FIELD_RELEASE_DAY = 21;
    private static final int FIELD_RELEASE_MONTH = 20;
    private static final int FIELD_RELEASE_YEAR = 19;
    private static final int FIELD_SUBTITLE = 5;
    private static final int FIELD_TITLE = 0;
    private static final int FIELD_TOTAL_DISC_COUNT = 26;
    private static final int FIELD_TOTAL_TRACK_COUNT = 13;
    private static final int FIELD_TRACK_NUMBER = 12;
    private static final int FIELD_USER_RATING = 8;
    private static final int FIELD_WRITER = 22;
    public static final int FOLDER_TYPE_ALBUMS = 2;
    public static final int FOLDER_TYPE_ARTISTS = 3;
    public static final int FOLDER_TYPE_GENRES = 4;
    public static final int FOLDER_TYPE_MIXED = 0;
    public static final int FOLDER_TYPE_NONE = -1;
    public static final int FOLDER_TYPE_PLAYLISTS = 5;
    public static final int FOLDER_TYPE_TITLES = 1;
    public static final int FOLDER_TYPE_YEARS = 6;
    public static final int PICTURE_TYPE_ARTIST_PERFORMER = 8;
    public static final int PICTURE_TYPE_A_BRIGHT_COLORED_FISH = 17;
    public static final int PICTURE_TYPE_BACK_COVER = 4;
    public static final int PICTURE_TYPE_BAND_ARTIST_LOGO = 19;
    public static final int PICTURE_TYPE_BAND_ORCHESTRA = 10;
    public static final int PICTURE_TYPE_COMPOSER = 11;
    public static final int PICTURE_TYPE_CONDUCTOR = 9;
    public static final int PICTURE_TYPE_DURING_PERFORMANCE = 15;
    public static final int PICTURE_TYPE_DURING_RECORDING = 14;
    public static final int PICTURE_TYPE_FILE_ICON = 1;
    public static final int PICTURE_TYPE_FILE_ICON_OTHER = 2;
    public static final int PICTURE_TYPE_FRONT_COVER = 3;
    public static final int PICTURE_TYPE_ILLUSTRATION = 18;
    public static final int PICTURE_TYPE_LEAD_ARTIST_PERFORMER = 7;
    public static final int PICTURE_TYPE_LEAFLET_PAGE = 5;
    public static final int PICTURE_TYPE_LYRICIST = 12;
    public static final int PICTURE_TYPE_MEDIA = 6;
    public static final int PICTURE_TYPE_MOVIE_VIDEO_SCREEN_CAPTURE = 16;
    public static final int PICTURE_TYPE_OTHER = 0;
    public static final int PICTURE_TYPE_PUBLISHER_STUDIO_LOGO = 20;
    public static final int PICTURE_TYPE_RECORDING_LOCATION = 13;
    @Nullable
    public final CharSequence albumArtist;
    @Nullable
    public final CharSequence albumTitle;
    @Nullable
    public final CharSequence artist;
    @Nullable
    public final byte[] artworkData;
    @Nullable
    public final Integer artworkDataType;
    @Nullable
    public final Uri artworkUri;
    @Nullable
    public final CharSequence compilation;
    @Nullable
    public final CharSequence composer;
    @Nullable
    public final CharSequence conductor;
    @Nullable
    public final CharSequence description;
    @Nullable
    public final Integer discNumber;
    @Nullable
    public final CharSequence displayTitle;
    @Nullable
    public final Bundle extras;
    @Nullable
    public final Integer folderType;
    @Nullable
    public final CharSequence genre;
    @Nullable
    public final Boolean isPlayable;
    @Nullable
    public final Uri mediaUri;
    @Nullable
    public final Rating overallRating;
    @Nullable
    public final Integer recordingDay;
    @Nullable
    public final Integer recordingMonth;
    @Nullable
    public final Integer recordingYear;
    @Nullable
    public final Integer releaseDay;
    @Nullable
    public final Integer releaseMonth;
    @Nullable
    public final Integer releaseYear;
    @Nullable
    public final CharSequence subtitle;
    @Nullable
    public final CharSequence title;
    @Nullable
    public final Integer totalDiscCount;
    @Nullable
    public final Integer totalTrackCount;
    @Nullable
    public final Integer trackNumber;
    @Nullable
    public final Rating userRating;
    @Nullable
    public final CharSequence writer;
    @Nullable
    @Deprecated
    public final Integer year;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        @Nullable
        private CharSequence albumArtist;
        @Nullable
        private CharSequence albumTitle;
        @Nullable
        private CharSequence artist;
        @Nullable
        private byte[] artworkData;
        @Nullable
        private Integer artworkDataType;
        @Nullable
        private Uri artworkUri;
        @Nullable
        private CharSequence compilation;
        @Nullable
        private CharSequence composer;
        @Nullable
        private CharSequence conductor;
        @Nullable
        private CharSequence description;
        @Nullable
        private Integer discNumber;
        @Nullable
        private CharSequence displayTitle;
        @Nullable
        private Bundle extras;
        @Nullable
        private Integer folderType;
        @Nullable
        private CharSequence genre;
        @Nullable
        private Boolean isPlayable;
        @Nullable
        private Uri mediaUri;
        @Nullable
        private Rating overallRating;
        @Nullable
        private Integer recordingDay;
        @Nullable
        private Integer recordingMonth;
        @Nullable
        private Integer recordingYear;
        @Nullable
        private Integer releaseDay;
        @Nullable
        private Integer releaseMonth;
        @Nullable
        private Integer releaseYear;
        @Nullable
        private CharSequence subtitle;
        @Nullable
        private CharSequence title;
        @Nullable
        private Integer totalDiscCount;
        @Nullable
        private Integer totalTrackCount;
        @Nullable
        private Integer trackNumber;
        @Nullable
        private Rating userRating;
        @Nullable
        private CharSequence writer;

        public /* synthetic */ Builder(MediaMetadata mediaMetadata, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ CharSequence access$100(Builder builder) {
        }

        public static /* synthetic */ Rating access$1000(Builder builder) {
        }

        public static /* synthetic */ byte[] access$1100(Builder builder) {
        }

        public static /* synthetic */ Integer access$1200(Builder builder) {
        }

        public static /* synthetic */ Uri access$1300(Builder builder) {
        }

        public static /* synthetic */ Integer access$1400(Builder builder) {
        }

        public static /* synthetic */ Integer access$1500(Builder builder) {
        }

        public static /* synthetic */ Integer access$1600(Builder builder) {
        }

        public static /* synthetic */ Boolean access$1700(Builder builder) {
        }

        public static /* synthetic */ Integer access$1800(Builder builder) {
        }

        public static /* synthetic */ Integer access$1900(Builder builder) {
        }

        public static /* synthetic */ CharSequence access$200(Builder builder) {
        }

        public static /* synthetic */ Integer access$2000(Builder builder) {
        }

        public static /* synthetic */ Integer access$2100(Builder builder) {
        }

        public static /* synthetic */ Integer access$2200(Builder builder) {
        }

        public static /* synthetic */ Integer access$2300(Builder builder) {
        }

        public static /* synthetic */ CharSequence access$2400(Builder builder) {
        }

        public static /* synthetic */ CharSequence access$2500(Builder builder) {
        }

        public static /* synthetic */ CharSequence access$2600(Builder builder) {
        }

        public static /* synthetic */ Integer access$2700(Builder builder) {
        }

        public static /* synthetic */ Integer access$2800(Builder builder) {
        }

        public static /* synthetic */ CharSequence access$2900(Builder builder) {
        }

        public static /* synthetic */ CharSequence access$300(Builder builder) {
        }

        public static /* synthetic */ CharSequence access$3000(Builder builder) {
        }

        public static /* synthetic */ Bundle access$3100(Builder builder) {
        }

        public static /* synthetic */ CharSequence access$400(Builder builder) {
        }

        public static /* synthetic */ CharSequence access$500(Builder builder) {
        }

        public static /* synthetic */ CharSequence access$600(Builder builder) {
        }

        public static /* synthetic */ CharSequence access$700(Builder builder) {
        }

        public static /* synthetic */ Uri access$800(Builder builder) {
        }

        public static /* synthetic */ Rating access$900(Builder builder) {
        }

        public MediaMetadata build() {
        }

        public Builder maybeSetArtworkData(byte[] artworkData, int artworkDataType) {
        }

        public Builder populateFromMetadata(Metadata metadata) {
        }

        public Builder setAlbumArtist(@Nullable CharSequence albumArtist) {
        }

        public Builder setAlbumTitle(@Nullable CharSequence albumTitle) {
        }

        public Builder setArtist(@Nullable CharSequence artist) {
        }

        @Deprecated
        public Builder setArtworkData(@Nullable byte[] artworkData) {
        }

        public Builder setArtworkUri(@Nullable Uri artworkUri) {
        }

        public Builder setCompilation(@Nullable CharSequence compilation) {
        }

        public Builder setComposer(@Nullable CharSequence composer) {
        }

        public Builder setConductor(@Nullable CharSequence conductor) {
        }

        public Builder setDescription(@Nullable CharSequence description) {
        }

        public Builder setDiscNumber(@Nullable Integer discNumber) {
        }

        public Builder setDisplayTitle(@Nullable CharSequence displayTitle) {
        }

        public Builder setExtras(@Nullable Bundle extras) {
        }

        public Builder setFolderType(@Nullable Integer folderType) {
        }

        public Builder setGenre(@Nullable CharSequence genre) {
        }

        public Builder setIsPlayable(@Nullable Boolean isPlayable) {
        }

        public Builder setMediaUri(@Nullable Uri mediaUri) {
        }

        public Builder setOverallRating(@Nullable Rating overallRating) {
        }

        public Builder setRecordingDay(@IntRange(from = 1, to = 31) @Nullable Integer recordingDay) {
        }

        public Builder setRecordingMonth(@IntRange(from = 1, to = 12) @Nullable Integer recordingMonth) {
        }

        public Builder setRecordingYear(@Nullable Integer recordingYear) {
        }

        public Builder setReleaseDay(@IntRange(from = 1, to = 31) @Nullable Integer releaseDay) {
        }

        public Builder setReleaseMonth(@IntRange(from = 1, to = 12) @Nullable Integer releaseMonth) {
        }

        public Builder setReleaseYear(@Nullable Integer releaseYear) {
        }

        public Builder setSubtitle(@Nullable CharSequence subtitle) {
        }

        public Builder setTitle(@Nullable CharSequence title) {
        }

        public Builder setTotalDiscCount(@Nullable Integer totalDiscCount) {
        }

        public Builder setTotalTrackCount(@Nullable Integer totalTrackCount) {
        }

        public Builder setTrackNumber(@Nullable Integer trackNumber) {
        }

        public Builder setUserRating(@Nullable Rating userRating) {
        }

        public Builder setWriter(@Nullable CharSequence writer) {
        }

        @Deprecated
        public Builder setYear(@Nullable Integer year) {
        }

        public Builder() {
        }

        public Builder setArtworkData(@Nullable byte[] artworkData, @Nullable Integer artworkDataType) {
        }

        private Builder(MediaMetadata mediaMetadata) {
        }

        public Builder populateFromMetadata(List<Metadata> metadataList) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface FolderType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface PictureType {
    }

    public /* synthetic */ MediaMetadata(Builder builder, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ MediaMetadata a(Bundle bundle) {
    }

    private static MediaMetadata fromBundle(Bundle bundle) {
    }

    private static String keyForField(int field) {
    }

    public Builder buildUpon() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    private MediaMetadata(Builder builder) {
    }
}
