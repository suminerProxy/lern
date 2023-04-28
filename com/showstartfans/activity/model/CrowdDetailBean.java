package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.actdes.AnnouncementBean;
import com.showstartfans.activity.model.actdes.MusicBean;
import com.showstartfans.activity.model.actdes.PerformersBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CrowdDetailBean implements Parcelable {
    public static final Parcelable.Creator<CrowdDetailBean> CREATOR = null;
    private String hadRaisedMoneny;
    private String helpUrl;
    private String id;
    private String introduce;
    private int leftDay;
    private int letterNum;
    private List<MusicBean> musicList;
    private List<AnnouncementBean> notices;
    private int percent;
    private String poster;
    private PerformersBean promoterInfo;
    private String raiseModel;
    private int raiseModelStatus;
    private String raiseMoney;
    private int raiseType;
    private String raiseTypeView;
    private boolean showLetter;
    private int status;
    private int supportButton;
    private String supportButtonView;
    private int supportNum;
    private String title;
    private boolean whetherWantTo;
    private int wishNum;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<CrowdDetailBean> {
        public CrowdDetailBean a(Parcel parcel) {
        }

        public CrowdDetailBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CrowdDetailBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CrowdDetailBean[] newArray(int i2) {
        }
    }

    public CrowdDetailBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getHadRaisedMoneny() {
    }

    public String getHelpUrl() {
    }

    public String getId() {
    }

    public String getIntroduce() {
    }

    public int getLeftDay() {
    }

    public int getLetterNum() {
    }

    public List<MusicBean> getMusicList() {
    }

    public List<AnnouncementBean> getNotices() {
    }

    public int getPercent() {
    }

    public String getPoster() {
    }

    public PerformersBean getPromoterInfo() {
    }

    public String getRaiseModel() {
    }

    public int getRaiseModelStatus() {
    }

    public String getRaiseMoney() {
    }

    public int getRaiseType() {
    }

    public String getRaiseTypeView() {
    }

    public int getStatus() {
    }

    public int getSupportButton() {
    }

    public String getSupportButtonView() {
    }

    public int getSupportNum() {
    }

    public String getTitle() {
    }

    public int getWishNum() {
    }

    public boolean isShowLetter() {
    }

    public boolean isWhetherWantTo() {
    }

    public void setHadRaisedMoneny(String str) {
    }

    public void setHelpUrl(String str) {
    }

    public void setId(String str) {
    }

    public void setIntroduce(String str) {
    }

    public void setLeftDay(int i2) {
    }

    public void setLetterNum(int i2) {
    }

    public void setMusicList(List<MusicBean> list) {
    }

    public void setNotices(List<AnnouncementBean> list) {
    }

    public void setPercent(int i2) {
    }

    public void setPoster(String str) {
    }

    public void setPromoterInfo(PerformersBean performersBean) {
    }

    public void setRaiseModel(String str) {
    }

    public void setRaiseModelStatus(int i2) {
    }

    public void setRaiseMoney(String str) {
    }

    public void setRaiseType(int i2) {
    }

    public void setRaiseTypeView(String str) {
    }

    public void setShowLetter(boolean z) {
    }

    public void setStatus(int i2) {
    }

    public void setSupportButton(int i2) {
    }

    public void setSupportButtonView(String str) {
    }

    public void setSupportNum(int i2) {
    }

    public void setTitle(String str) {
    }

    public void setWhetherWantTo(boolean z) {
    }

    public void setWishNum(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CrowdDetailBean(Parcel parcel) {
    }
}
