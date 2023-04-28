package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MessageDetailBean implements Parcelable {
    public static final Parcelable.Creator<MessageDetailBean> CREATOR = null;
    private CommentCrowdBean info;
    private ArrayList<MessageDetailLettersBean> letters;
    private int totalCount;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<MessageDetailBean> {
        public MessageDetailBean a(Parcel parcel) {
        }

        public MessageDetailBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageDetailBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageDetailBean[] newArray(int i2) {
        }
    }

    public MessageDetailBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public CommentCrowdBean getInfo() {
    }

    public ArrayList<MessageDetailLettersBean> getLetters() {
    }

    public int getTotalCount() {
    }

    public void setInfo(CommentCrowdBean commentCrowdBean) {
    }

    public void setLetters(ArrayList<MessageDetailLettersBean> arrayList) {
    }

    public void setTotalCount(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MessageDetailBean(Parcel parcel) {
    }
}
