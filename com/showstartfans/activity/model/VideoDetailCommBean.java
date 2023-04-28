package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class VideoDetailCommBean implements Parcelable {
    public static final Parcelable.Creator<VideoDetailCommBean> CREATOR = null;
    private String content;
    private String createTime;
    private boolean creator;
    private boolean creatorPraise;
    private boolean delete;
    private String deleteContent;
    private String id;
    private String letterId;
    private String letterUserAvatar;
    private String letterUserId;
    public int letterUserLevel;
    private String letterUserName;
    private int letterUserType;
    private String mainLetterId;
    private String photos;
    private boolean praise;
    private int praiseNum;
    private int styleType;
    private int subCommentCount;
    private List<VideoDetailCommBean> subCommentVos;
    private String time;
    private String toLetterUserAvatar;
    private String toLetterUserId;
    private String toLetterUserName;
    private int toLetterUserType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<VideoDetailCommBean> {
        public VideoDetailCommBean a(Parcel parcel) {
        }

        public VideoDetailCommBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ VideoDetailCommBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ VideoDetailCommBean[] newArray(int i2) {
        }
    }

    public VideoDetailCommBean() {
    }

    public UserInfoBean converToUserInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getContent() {
    }

    public String getCreateTime() {
    }

    public String getDeleteContent() {
    }

    public String getId() {
    }

    public String getLetterId() {
    }

    public String getLetterUserAvatar() {
    }

    public String getLetterUserId() {
    }

    public String getLetterUserName() {
    }

    public int getLetterUserType() {
    }

    public String getMainLetterId() {
    }

    public String getPhotos() {
    }

    public int getPraiseNum() {
    }

    public int getStyleType() {
    }

    public int getSubCommentCount() {
    }

    public List<VideoDetailCommBean> getSubCommentVos() {
    }

    public String getTime() {
    }

    public String getToLetterUserAvatar() {
    }

    public String getToLetterUserId() {
    }

    public String getToLetterUserName() {
    }

    public int getToLetterUserType() {
    }

    public boolean isCreator() {
    }

    public boolean isCreatorPraise() {
    }

    public boolean isDelete() {
    }

    public boolean isPraise() {
    }

    public void setContent(String str) {
    }

    public void setCreateTime(String str) {
    }

    public void setCreator(boolean z) {
    }

    public void setCreatorPraise(boolean z) {
    }

    public void setDelete(boolean z) {
    }

    public void setDeleteContent(String str) {
    }

    public void setId(String str) {
    }

    public void setLetterId(String str) {
    }

    public void setLetterUserAvatar(String str) {
    }

    public void setLetterUserId(String str) {
    }

    public void setLetterUserName(String str) {
    }

    public void setLetterUserType(int i2) {
    }

    public void setMainLetterId(String str) {
    }

    public void setPhotos(String str) {
    }

    public void setPraise(boolean z) {
    }

    public void setPraiseNum(int i2) {
    }

    public void setStyleType(int i2) {
    }

    public void setSubCommentCount(int i2) {
    }

    public void setSubCommentVos(List<VideoDetailCommBean> list) {
    }

    public void setTime(String str) {
    }

    public void setToLetterUserAvatar(String str) {
    }

    public void setToLetterUserId(String str) {
    }

    public void setToLetterUserName(String str) {
    }

    public void setToLetterUserType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public VideoDetailCommBean(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, String str6, String str7, String str8, int i2, int i3, String str9, String str10, boolean z4, int i4, String str11, String str12, String str13, int i5, int i6) {
    }

    public VideoDetailCommBean(Parcel parcel) {
    }
}
