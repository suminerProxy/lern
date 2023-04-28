package com.tencent.qcloud.tuikit.tuisearch.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.imsdk.v2.V2TIMMessage;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SearchDataBean implements Parcelable {
    public static final Parcelable.Creator<SearchDataBean> CREATOR = null;
    private String conversationID;
    private String groupID;
    private String groupName;
    private String groupType;
    private String iconPath;
    private boolean isGroup;
    private int isSubTextMatch;
    private V2TIMMessage locateTimMessage;
    private String nickName;
    private String remark;
    private String subTitle;
    private String subTitleLabel;
    private String title;
    private int type;
    private String userID;

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.bean.SearchDataBean$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<SearchDataBean> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SearchDataBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SearchDataBean[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchDataBean createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchDataBean[] newArray(int i2) {
        }
    }

    public SearchDataBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getConversationID() {
    }

    public String getGroupID() {
    }

    public String getGroupName() {
    }

    public String getGroupType() {
    }

    public String getIconPath() {
    }

    public int getIsSubTextMatch() {
    }

    public V2TIMMessage getLocateTimMessage() {
    }

    public String getNickName() {
    }

    public String getRemark() {
    }

    public String getSubTitle() {
    }

    public String getSubTitleLabel() {
    }

    public String getTitle() {
    }

    public int getType() {
    }

    public String getUserID() {
    }

    public boolean isGroup() {
    }

    public void setConversationID(String str) {
    }

    public void setGroup(boolean z) {
    }

    public void setGroupID(String str) {
    }

    public void setGroupName(String str) {
    }

    public void setGroupType(String str) {
    }

    public void setIconPath(String str) {
    }

    public void setLocateTimMessage(V2TIMMessage v2TIMMessage) {
    }

    public void setNickName(String str) {
    }

    public void setRemark(String str) {
    }

    public void setSubTextMatch(int i2) {
    }

    public void setSubTitle(String str) {
    }

    public void setSubTitleLabel(String str) {
    }

    public void setTitle(String str) {
    }

    public void setType(int i2) {
    }

    public void setUserID(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public SearchDataBean(Parcel parcel) {
    }
}
