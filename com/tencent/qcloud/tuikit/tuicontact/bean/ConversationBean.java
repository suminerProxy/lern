package com.tencent.qcloud.tuikit.tuicontact.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ConversationBean implements Parcelable {
    public static final Parcelable.Creator<ConversationBean> CREATOR = null;
    private String conversationID;
    private int isGroup;
    private String title;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.bean.ConversationBean$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<ConversationBean> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ConversationBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ConversationBean[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationBean createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationBean[] newArray(int i2) {
        }
    }

    public ConversationBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getConversationID() {
    }

    public int getIsGroup() {
    }

    public String getTitle() {
    }

    public void setConversationID(String str) {
    }

    public void setIsGroup(int i2) {
    }

    public void setTitle(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ConversationBean(String str, int i2, String str2) {
    }
}
