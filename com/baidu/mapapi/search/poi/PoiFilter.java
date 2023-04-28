package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class PoiFilter implements Parcelable {
    public static final Parcelable.Creator<PoiFilter> CREATOR = null;

    /* renamed from: f  reason: collision with root package name */
    private static Map<SortName, String> f2028f;

    /* renamed from: a  reason: collision with root package name */
    private String f2029a;
    private String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private String f2030d;

    /* renamed from: e  reason: collision with root package name */
    private String f2031e;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f2032a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private String f2033d;

        /* renamed from: e  reason: collision with root package name */
        private String f2034e;

        public PoiFilter build() {
        }

        public Builder industryType(IndustryType industryType) {
        }

        public Builder isDiscount(boolean z) {
        }

        public Builder isGroupon(boolean z) {
        }

        public Builder sortName(SortName sortName) {
        }

        public Builder sortRule(int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class IndustryType {
        public static final IndustryType CATER = null;
        public static final IndustryType HOTEL = null;
        public static final IndustryType LIFE = null;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ IndustryType[] f2035a = null;

        private IndustryType(String str, int i2) {
        }

        public static IndustryType valueOf(String str) {
        }

        public static IndustryType[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface SortName {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class CaterSortName implements SortName {
            public static final CaterSortName CATER_DISTANCE = null;
            public static final CaterSortName CATER_OVERALL_RATING = null;
            public static final CaterSortName CATER_PRICE = null;
            public static final CaterSortName CATER_SERVICE_RATING = null;
            public static final CaterSortName CATER_TASTE_RATING = null;
            public static final CaterSortName DEFAULT = null;

            /* renamed from: a  reason: collision with root package name */
            private static final /* synthetic */ CaterSortName[] f2036a = null;

            private CaterSortName(String str, int i2) {
            }

            public static CaterSortName valueOf(String str) {
            }

            public static CaterSortName[] values() {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class HotelSortName implements SortName {
            public static final HotelSortName DEFAULT = null;
            public static final HotelSortName HOTEL_DISTANCE = null;
            public static final HotelSortName HOTEL_HEALTH_SCORE = null;
            public static final HotelSortName HOTEL_LEVEL = null;
            public static final HotelSortName HOTEL_PRICE = null;
            public static final HotelSortName HOTEL_TOTAL_SCORE = null;

            /* renamed from: a  reason: collision with root package name */
            private static final /* synthetic */ HotelSortName[] f2037a = null;

            private HotelSortName(String str, int i2) {
            }

            public static HotelSortName valueOf(String str) {
            }

            public static HotelSortName[] values() {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class LifeSortName implements SortName {
            public static final LifeSortName DEFAULT = null;
            public static final LifeSortName DISTANCE = null;
            public static final LifeSortName LIFE_COMMENT_RATING = null;
            public static final LifeSortName LIFE_OVERALL_RATING = null;
            public static final LifeSortName PRICE = null;

            /* renamed from: a  reason: collision with root package name */
            private static final /* synthetic */ LifeSortName[] f2038a = null;

            private LifeSortName(String str, int i2) {
            }

            public static LifeSortName valueOf(String str) {
            }

            public static LifeSortName[] values() {
            }
        }
    }

    public PoiFilter(String str, String str2, String str3, String str4, String str5) {
    }

    public static /* synthetic */ Map a() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PoiFilter(Parcel parcel) {
    }
}
