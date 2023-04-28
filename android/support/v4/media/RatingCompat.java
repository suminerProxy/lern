package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = null;
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final String TAG = "Rating";
    private Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;

    /* renamed from: android.support.v4.media.RatingCompat$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RatingCompat createFromParcel(Parcel p2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RatingCompat[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel p2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int size) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface Style {
    }

    public RatingCompat(int ratingStyle, float rating) {
    }

    public static RatingCompat fromRating(Object ratingObj) {
    }

    public static RatingCompat newHeartRating(boolean hasHeart) {
    }

    public static RatingCompat newPercentageRating(float percent) {
    }

    public static RatingCompat newStarRating(int starRatingStyle, float starRating) {
    }

    public static RatingCompat newThumbRating(boolean thumbIsUp) {
    }

    public static RatingCompat newUnratedRating(int ratingStyle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public float getPercentRating() {
    }

    public Object getRating() {
    }

    public int getRatingStyle() {
    }

    public float getStarRating() {
    }

    public boolean hasHeart() {
    }

    public boolean isRated() {
    }

    public boolean isThumbUp() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }
}
