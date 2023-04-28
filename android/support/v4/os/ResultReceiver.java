package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.IResultReceiver;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = null;
    public final Handler mHandler;
    public final boolean mLocal;
    public IResultReceiver mReceiver;

    /* renamed from: android.support.v4.os.ResultReceiver$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ResultReceiver createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ResultReceiver[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultReceiver createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultReceiver[] newArray(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class MyResultReceiver extends IResultReceiver.Stub {
        public final /* synthetic */ ResultReceiver this$0;

        public MyResultReceiver(ResultReceiver resultReceiver) {
        }

        @Override // android.support.v4.os.IResultReceiver
        public void send(int i2, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class MyRunnable implements Runnable {
        public final int mResultCode;
        public final Bundle mResultData;
        public final /* synthetic */ ResultReceiver this$0;

        public MyRunnable(ResultReceiver resultReceiver, int i2, Bundle bundle) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public ResultReceiver(Handler handler) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public void onReceiveResult(int i2, Bundle bundle) {
    }

    public void send(int i2, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ResultReceiver(Parcel parcel) {
    }
}
