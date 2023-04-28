package com.showstartfans.activity.model.actdes;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.ParticipatingBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ParticipatingTitleBean implements Parcelable {
    public static final Parcelable.Creator<ParticipatingTitleBean> CREATOR = null;
    private String isEnd;
    private String selected;
    public String sessionId;
    private String title;
    private List<ParticipatingBean> userInfos;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ParticipatingTitleBean> {
        public ParticipatingTitleBean a(Parcel parcel) {
        }

        public ParticipatingTitleBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ParticipatingTitleBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ParticipatingTitleBean[] newArray(int i2) {
        }
    }

    public ParticipatingTitleBean(Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getIsEnd() {
    }

    public String getSelected() {
    }

    public String getTitle() {
    }

    public List<ParticipatingBean> getUserInfos() {
    }

    public void setIsEnd(String str) {
    }

    public void setSelected(String str) {
    }

    public void setTitle(String str) {
    }

    public void setUserInfos(List<ParticipatingBean> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ParticipatingTitleBean() {
    }
}
