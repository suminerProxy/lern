package com.showstartfans.activity.model.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.BrilliantShowBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class NewYearHomeHeaderBean implements Parcelable {
    public static final Parcelable.Creator<NewYearHomeHeaderBean> CREATOR = null;
    public List<BrilliantShowBean> activityList;
    public List<HomeHeadClassificationBean> activityType;
    public List<ExclusiveTourBean> banner;
    public String couponUrl;
    public HomeFloatBean floatActivity;
    public String guessImage;
    public String guideUrl;
    public int messageCount;
    public String shareImage;
    public boolean showGuide;
    public int showQuickCheck;
    public int styleShowCount;
    public int stylesCount;
    public String telephone;
    public int ticketCount;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<NewYearHomeHeaderBean> {
        public NewYearHomeHeaderBean a(Parcel parcel) {
        }

        public NewYearHomeHeaderBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ NewYearHomeHeaderBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ NewYearHomeHeaderBean[] newArray(int i2) {
        }
    }

    public NewYearHomeHeaderBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public NewYearHomeHeaderBean(Parcel parcel) {
    }
}
