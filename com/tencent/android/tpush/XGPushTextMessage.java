package com.tencent.android.tpush;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class XGPushTextMessage implements Parcelable {
    public static final Parcelable.Creator<XGPushTextMessage> CREATOR = new Parcelable.Creator<XGPushTextMessage>() { // from class: com.tencent.android.tpush.XGPushTextMessage.1
        public XGPushTextMessage a(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ XGPushTextMessage createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ XGPushTextMessage[] newArray(int i2) {
        }

        public XGPushTextMessage[] a(int i2) {
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public long f8596a;
    public String b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f8597d;

    /* renamed from: e  reason: collision with root package name */
    public int f8598e;

    /* renamed from: f  reason: collision with root package name */
    public String f8599f;

    /* renamed from: g  reason: collision with root package name */
    public String f8600g;

    /* renamed from: h  reason: collision with root package name */
    private Intent f8601h;

    public XGPushTextMessage() {
        this.f8596a = 0L;
        this.b = "";
        this.c = "";
        this.f8597d = "";
        this.f8598e = 100;
        this.f8599f = "";
        this.f8600g = "";
        this.f8601h = null;
    }

    public void a(Intent intent) {
        this.f8601h = intent;
        if (intent != null) {
            intent.removeExtra("content");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getContent() {
        return this.c;
    }

    public String getCustomContent() {
        return this.f8597d;
    }

    public long getMsgId() {
        return this.f8596a;
    }

    public int getPushChannel() {
        return this.f8598e;
    }

    public String getTemplateId() {
        return this.f8599f;
    }

    public String getTitle() {
        return this.b;
    }

    public String getTraceId() {
        return this.f8600g;
    }

    public String toString() {
        return "XGPushTextMessage [msgId = " + this.f8596a + ", title=" + this.b + ", content=" + this.c + ", customContent=" + this.f8597d + ", pushChannel = " + this.f8598e + ", templateId = " + this.f8599f + ", traceId = " + this.f8600g + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f8596a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f8597d);
        parcel.writeInt(this.f8598e);
        parcel.writeParcelable(this.f8601h, 1);
        parcel.writeString(this.f8599f);
        parcel.writeString(this.f8600g);
    }

    public Intent a() {
        return this.f8601h;
    }

    public XGPushTextMessage(Parcel parcel) {
        this.f8596a = 0L;
        this.b = "";
        this.c = "";
        this.f8597d = "";
        this.f8598e = 100;
        this.f8599f = "";
        this.f8600g = "";
        this.f8601h = null;
        this.f8596a = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.f8597d = parcel.readString();
        this.f8598e = parcel.readInt();
        this.f8601h = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f8599f = parcel.readString();
        this.f8600g = parcel.readString();
    }
}
