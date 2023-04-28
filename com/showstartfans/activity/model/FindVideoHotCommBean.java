package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FindVideoHotCommBean implements Parcelable {
    public static final Parcelable.Creator<FindVideoHotCommBean> CREATOR = null;
    private String content;
    private boolean creator;
    private String fromUser;
    private boolean hot;
    private String id;
    private String letterUserAvatar;
    private String letterUserId;
    private String letterUserName;
    private int letterUserType;
    private List<String> photos;
    private String toLetterUserName;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<FindVideoHotCommBean> {
        public FindVideoHotCommBean a(Parcel parcel) {
        }

        public FindVideoHotCommBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FindVideoHotCommBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FindVideoHotCommBean[] newArray(int i2) {
        }
    }

    public FindVideoHotCommBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getContent() {
    }

    public String getFromUser() {
    }

    public String getId() {
    }

    public String getLetterUserAvatar() {
    }

    public String getLetterUserId() {
    }

    public String getLetterUserName() {
    }

    public int getLetterUserType() {
    }

    public List<String> getPhotos() {
    }

    public String getToLetterUserName() {
    }

    public boolean isCreator() {
    }

    public boolean isHot() {
    }

    public void setContent(String str) {
    }

    public void setCreator(boolean z) {
    }

    public void setFromUser(String str) {
    }

    public void setHot(boolean z) {
    }

    public void setId(String str) {
    }

    public void setLetterUserAvatar(String str) {
    }

    public void setLetterUserId(String str) {
    }

    public void setLetterUserName(String str) {
    }

    public void setLetterUserType(int i2) {
    }

    public void setPhotos(List<String> list) {
    }

    public void setToLetterUserName(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public FindVideoHotCommBean(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
    }

    public FindVideoHotCommBean(Parcel parcel) {
    }
}
