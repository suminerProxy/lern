package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FansHomePagerInfoBean implements Parcelable {
    public static final Parcelable.Creator<FansHomePagerInfoBean> CREATOR = null;
    private String avatar;
    private String backgroundPic;
    private String birthday;
    private boolean canSeeHomePage;
    private int cityCode;
    private String cityName;
    public FansAlbumsBaseVOBean fansAlbumsBaseVO;
    private String fansId;
    private String fansName;
    private int fansNum;
    private boolean follow;
    private int followNum;
    private boolean isBlack;
    private List<String> labels;
    private PrivateSettingBean privacySetting;
    private int relationship;
    private String roleImageUrl;
    private String roleName;
    private int sex;
    private String signature;
    private int status;
    public int userLevel;
    private int userType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<FansHomePagerInfoBean> {
        public FansHomePagerInfoBean a(Parcel parcel) {
        }

        public FansHomePagerInfoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FansHomePagerInfoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FansHomePagerInfoBean[] newArray(int i2) {
        }
    }

    public FansHomePagerInfoBean() {
    }

    public UserInfoBean converToUserInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAvatar() {
    }

    public String getBackgroundPic() {
    }

    public String getBirthday() {
    }

    public int getCityCode() {
    }

    public String getCityName() {
    }

    public String getFansId() {
    }

    public String getFansName() {
    }

    public int getFansNum() {
    }

    public int getFollowNum() {
    }

    public boolean getIsFollow() {
    }

    public List<String> getLabels() {
    }

    public PrivateSettingBean getPrivacy() {
    }

    public PrivateSettingBean getPrivacySetting() {
    }

    public int getRelationship() {
    }

    public String getRoleImageUrl() {
    }

    public String getRoleName() {
    }

    public int getSex() {
    }

    public String getSignature() {
    }

    public int getStatus() {
    }

    public int getUserType() {
    }

    public boolean isBlack() {
    }

    public boolean isCanSeeHomePage() {
    }

    public boolean isFollow() {
    }

    public void setAvatar(String str) {
    }

    public void setBackgroundPic(String str) {
    }

    public void setBirthday(String str) {
    }

    public void setBlack(boolean z) {
    }

    public void setCanSeeHomePage(boolean z) {
    }

    public void setCityCode(int i2) {
    }

    public void setCityName(String str) {
    }

    public void setFansId(String str) {
    }

    public void setFansName(String str) {
    }

    public void setFansNum(int i2) {
    }

    public void setFollow(boolean z) {
    }

    public void setFollowNum(int i2) {
    }

    public void setLabels(List<String> list) {
    }

    public void setPrivacy(PrivateSettingBean privateSettingBean) {
    }

    public void setPrivacySetting(PrivateSettingBean privateSettingBean) {
    }

    public void setRelationship(int i2) {
    }

    public void setRoleImageUrl(String str) {
    }

    public void setRoleName(String str) {
    }

    public void setSex(int i2) {
    }

    public void setSignature(String str) {
    }

    public void setStatus(int i2) {
    }

    public void setUserType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public FansHomePagerInfoBean(Parcel parcel) {
    }
}
