package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator<FragmentManagerState>() { // from class: androidx.fragment.app.FragmentManagerState.1
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FragmentManagerState createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FragmentManagerState[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FragmentManagerState createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FragmentManagerState[] newArray(int i2) {
        }
    };
    public ArrayList<FragmentState> mActive;
    public ArrayList<String> mAdded;
    public BackStackState[] mBackStack;
    public int mNextFragmentIndex;
    public String mPrimaryNavActiveWho;

    public FragmentManagerState() {
        this.mPrimaryNavActiveWho = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.mActive);
        parcel.writeStringList(this.mAdded);
        parcel.writeTypedArray(this.mBackStack, i2);
        parcel.writeString(this.mPrimaryNavActiveWho);
        parcel.writeInt(this.mNextFragmentIndex);
    }

    public FragmentManagerState(Parcel parcel) {
        this.mPrimaryNavActiveWho = null;
        this.mActive = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.mAdded = parcel.createStringArrayList();
        this.mBackStack = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.mPrimaryNavActiveWho = parcel.readString();
        this.mNextFragmentIndex = parcel.readInt();
    }
}
