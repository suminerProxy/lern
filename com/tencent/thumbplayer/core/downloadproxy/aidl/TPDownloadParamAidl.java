package com.tencent.thumbplayer.core.downloadproxy.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPDownloadParamAidl implements Parcelable {
    public static final Parcelable.Creator<TPDownloadParamAidl> CREATOR = null;
    private int dlType;
    private Map<String, Object> extInfoMap;
    private ArrayList<String> urlList;

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<TPDownloadParamAidl> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TPDownloadParamAidl createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TPDownloadParamAidl[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TPDownloadParamAidl createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TPDownloadParamAidl[] newArray(int i2) {
        }
    }

    public TPDownloadParamAidl(ArrayList<String> arrayList, int i2, Map<String, Object> map) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getDlType() {
    }

    public Map<String, Object> getExtInfoMap() {
    }

    public ArrayList<String> getUrlList() {
    }

    public void setDlType(int i2) {
    }

    public void setExtInfoMap(Map<String, Object> map) {
    }

    public void setUrlList(ArrayList<String> arrayList) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TPDownloadParamAidl(Parcel parcel) {
    }
}
