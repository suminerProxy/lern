package com.tencent.tpns.mqttchannel.core.common.data;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class Request implements Parcelable {
    public static final Parcelable.Creator<Request> CREATOR = null;
    public static final int TYPE_EXPAND = 4;
    public static final int TYPE_PUBLISH = 2;
    public static final int TYPE_SEND_PUBLISH_DATA = 5;
    public static final int TYPE_SEND_REQUST = 6;
    public static final int TYPE_SUBSCRIBE = 1;
    public static final int TYPE_UNSUBSCRIBE = 3;

    /* renamed from: a  reason: collision with root package name */
    private long f13756a;
    private String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private String f13757d;

    /* renamed from: e  reason: collision with root package name */
    private int f13758e;
    public volatile boolean isSent;
    public int type;

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.common.data.Request$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Parcelable.Creator<Request> {
        public Request a(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Request createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Request[] newArray(int i2) {
        }

        public Request[] a(int i2) {
        }
    }

    public Request(Parcel parcel) {
    }

    public void addRetryCount() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public String getContent() {
    }

    public long getId() {
    }

    public String getParamsMd5() {
    }

    public int getRetryCount() {
    }

    public String getTopic() {
    }

    public int hashCode() {
    }

    public void setContent(String str) {
    }

    public void setId(long j2) {
    }

    public void setToken(String str) {
    }

    public void setTopic(String str) {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public Request(long j2, String str, String str2) {
    }
}
