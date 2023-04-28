package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class PagerAdapter {
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    private final DataSetObservable mObservable;
    private DataSetObserver mViewPagerObserver;

    public void destroyItem(@NonNull ViewGroup viewGroup, int i2, @NonNull Object obj) {
    }

    @Deprecated
    public void finishUpdate(@NonNull View view) {
    }

    public void finishUpdate(@NonNull ViewGroup viewGroup) {
    }

    public abstract int getCount();

    public int getItemPosition(@NonNull Object obj) {
    }

    @Nullable
    public CharSequence getPageTitle(int i2) {
    }

    public float getPageWidth(int i2) {
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i2) {
    }

    public abstract boolean isViewFromObject(@NonNull View view, @NonNull Object obj);

    public void notifyDataSetChanged() {
    }

    public void registerDataSetObserver(@NonNull DataSetObserver dataSetObserver) {
    }

    public void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
    }

    @Nullable
    public Parcelable saveState() {
    }

    @Deprecated
    public void setPrimaryItem(@NonNull View view, int i2, @NonNull Object obj) {
    }

    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i2, @NonNull Object obj) {
    }

    public void setViewPagerObserver(DataSetObserver dataSetObserver) {
    }

    @Deprecated
    public void startUpdate(@NonNull View view) {
    }

    public void startUpdate(@NonNull ViewGroup viewGroup) {
    }

    public void unregisterDataSetObserver(@NonNull DataSetObserver dataSetObserver) {
    }

    @Deprecated
    public void destroyItem(@NonNull View view, int i2, @NonNull Object obj) {
    }

    @NonNull
    @Deprecated
    public Object instantiateItem(@NonNull View view, int i2) {
    }
}
