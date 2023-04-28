package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ChildHelper {
    private static final boolean DEBUG = false;
    private static final String TAG = "ChildrenHelper";
    public final Bucket mBucket;
    public final Callback mCallback;
    public final List<View> mHiddenViews;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Bucket {
        public static final int BITS_PER_WORD = 64;
        public static final long LAST_BIT = Long.MIN_VALUE;
        public long mData;
        public Bucket mNext;

        private void ensureNext() {
        }

        public void clear(int i2) {
        }

        public int countOnesBefore(int i2) {
        }

        public boolean get(int i2) {
        }

        public void insert(int i2, boolean z) {
        }

        public boolean remove(int i2) {
        }

        public void reset() {
        }

        public void set(int i2) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface Callback {
        void addView(View view, int i2);

        void attachViewToParent(View view, int i2, ViewGroup.LayoutParams layoutParams);

        void detachViewFromParent(int i2);

        View getChildAt(int i2);

        int getChildCount();

        RecyclerView.ViewHolder getChildViewHolder(View view);

        int indexOfChild(View view);

        void onEnteredHiddenState(View view);

        void onLeftHiddenState(View view);

        void removeAllViews();

        void removeViewAt(int i2);
    }

    public ChildHelper(Callback callback) {
    }

    private int getOffset(int i2) {
    }

    private void hideViewInternal(View view) {
    }

    private boolean unhideViewInternal(View view) {
    }

    public void addView(View view, boolean z) {
    }

    public void attachViewToParent(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
    }

    public void detachViewFromParent(int i2) {
    }

    public View findHiddenNonRemovedView(int i2) {
    }

    public View getChildAt(int i2) {
    }

    public int getChildCount() {
    }

    public View getUnfilteredChildAt(int i2) {
    }

    public int getUnfilteredChildCount() {
    }

    public void hide(View view) {
    }

    public int indexOfChild(View view) {
    }

    public boolean isHidden(View view) {
    }

    public void removeAllViewsUnfiltered() {
    }

    public void removeView(View view) {
    }

    public void removeViewAt(int i2) {
    }

    public boolean removeViewIfHidden(View view) {
    }

    public String toString() {
    }

    public void unhide(View view) {
    }

    public void addView(View view, int i2, boolean z) {
    }
}
