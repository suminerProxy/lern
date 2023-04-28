package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.home.ListOfFansBean;
import com.showstartfans.activity.model.home.NavSitBean;
import com.showstartfans.activity.model.home.RecommendPerformersBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FindBean implements Parcelable {
    public static final Parcelable.Creator<FindBean> CREATOR = null;
    private List<GroupShowBean> chatGroupList;
    private List<ListOfFansBean> fansList;
    private String goodsURL;
    private int hasMoreGroup;
    private int hasMoreRaise;
    private int hasMoreSite;
    private List<RecommendPerformersBean> performerList;
    private List<CrowdDetailBean> raiseList;
    private List<ShareActivityBean> shareActivityList;
    private List<NavSitBean> siteList;
    private String teamURL;
    private List<RecommendTopicBean> topicList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<FindBean> {
        public FindBean a(Parcel parcel) {
        }

        public FindBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FindBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FindBean[] newArray(int i2) {
        }
    }

    public FindBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public List<GroupShowBean> getChatGroupList() {
    }

    public List<ListOfFansBean> getFansList() {
    }

    public String getGoodsURL() {
    }

    public int getHasMoreGroup() {
    }

    public int getHasMoreRaise() {
    }

    public int getHasMoreSite() {
    }

    public List<RecommendPerformersBean> getPerformerList() {
    }

    public List<CrowdDetailBean> getRaiseList() {
    }

    public List<ShareActivityBean> getShareActivityList() {
    }

    public List<NavSitBean> getSiteList() {
    }

    public String getTeamURL() {
    }

    public List<RecommendTopicBean> getTopicList() {
    }

    public void setChatGroupList(List<GroupShowBean> list) {
    }

    public void setFansList(List<ListOfFansBean> list) {
    }

    public void setGoodsURL(String str) {
    }

    public void setHasMoreGroup(int i2) {
    }

    public void setHasMoreRaise(int i2) {
    }

    public void setHasMoreSite(int i2) {
    }

    public void setPerformerList(List<RecommendPerformersBean> list) {
    }

    public void setRaiseList(List<CrowdDetailBean> list) {
    }

    public void setShareActivityList(List<ShareActivityBean> list) {
    }

    public void setSiteList(List<NavSitBean> list) {
    }

    public void setTeamURL(String str) {
    }

    public void setTopicList(List<RecommendTopicBean> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public FindBean(Parcel parcel) {
    }
}
