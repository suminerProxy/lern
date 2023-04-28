package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = null;
    public static final AbsSavedState EMPTY_STATE = null;
    private final Parcelable mSuperState;

    /* renamed from: androidx.customview.view.AbsSavedState$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 extends AbsSavedState {
    }

    /* renamed from: androidx.customview.view.AbsSavedState$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* bridge */ /* synthetic */ AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        }

        @Override // android.os.Parcelable.Creator
        public AbsSavedState[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        }

        @Override // android.os.Parcelable.Creator
        public AbsSavedState createFromParcel(Parcel parcel) {
        }
    }

    public /* synthetic */ AbsSavedState(AnonymousClass1 anonymousClass1) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Nullable
    public final Parcelable getSuperState() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    private AbsSavedState() {
    }

    public AbsSavedState(@NonNull Parcelable parcelable) {
    }

    public AbsSavedState(@NonNull Parcel parcel) {
    }

    public AbsSavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
    }
}
