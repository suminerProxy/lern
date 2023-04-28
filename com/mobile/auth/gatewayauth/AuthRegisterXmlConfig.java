package com.mobile.auth.gatewayauth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.LayoutRes;
import com.mobile.auth.gatewayauth.ui.AbstractPnsViewDelegate;

@Keep
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AuthRegisterXmlConfig implements Parcelable {
    public static final Parcelable.Creator<AuthRegisterXmlConfig> CREATOR = null;
    @LayoutRes
    private int layoutResId;
    private AbstractPnsViewDelegate viewDelegate;

    /* renamed from: com.mobile.auth.gatewayauth.AuthRegisterXmlConfig$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<AuthRegisterXmlConfig> {
        public AuthRegisterXmlConfig a(Parcel parcel) {
        }

        public AuthRegisterXmlConfig[] a(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AuthRegisterXmlConfig createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AuthRegisterXmlConfig[] newArray(int i2) {
        }
    }

    @Keep
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Builder {
        @LayoutRes
        private int layoutResId;
        private AbstractPnsViewDelegate viewDelegate;

        public static /* synthetic */ int access$000(Builder builder) {
        }

        public static /* synthetic */ AbstractPnsViewDelegate access$100(Builder builder) {
        }

        public AuthRegisterXmlConfig build() {
        }

        public Builder setLayout(@LayoutRes int i2, AbstractPnsViewDelegate abstractPnsViewDelegate) {
        }
    }

    public AuthRegisterXmlConfig(Parcel parcel) {
    }

    private AuthRegisterXmlConfig(Builder builder) {
    }

    public /* synthetic */ AuthRegisterXmlConfig(Builder builder, AnonymousClass1 anonymousClass1) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getLayoutResId() {
    }

    public AbstractPnsViewDelegate getViewDelegate() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }
}
