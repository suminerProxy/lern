package androidx.recyclerview.widget;

import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AsyncListUtil<T> {
    public static final boolean DEBUG = false;
    public static final String TAG = "AsyncListUtil";
    public boolean mAllowScrollHints;
    private final ThreadUtil.BackgroundCallback<T> mBackgroundCallback;
    public final ThreadUtil.BackgroundCallback<T> mBackgroundProxy;
    public final DataCallback<T> mDataCallback;
    public int mDisplayedGeneration;
    public int mItemCount;
    private final ThreadUtil.MainThreadCallback<T> mMainThreadCallback;
    public final ThreadUtil.MainThreadCallback<T> mMainThreadProxy;
    public final SparseIntArray mMissingPositions;
    public final int[] mPrevRange;
    public int mRequestedGeneration;
    private int mScrollHint;
    public final Class<T> mTClass;
    public final TileList<T> mTileList;
    public final int mTileSize;
    public final int[] mTmpRange;
    public final int[] mTmpRangeExtended;
    public final ViewCallback mViewCallback;

    /* renamed from: androidx.recyclerview.widget.AsyncListUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ThreadUtil.MainThreadCallback<T> {
        public final /* synthetic */ AsyncListUtil this$0;

        public AnonymousClass1(AsyncListUtil asyncListUtil) {
        }

        private boolean isRequestedGeneration(int i2) {
        }

        private void recycleAllTiles() {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int i2, TileList.Tile<T> tile) {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int i2, int i3) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.AsyncListUtil$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements ThreadUtil.BackgroundCallback<T> {
        private int mFirstRequiredTileStart;
        private int mGeneration;
        private int mItemCount;
        private int mLastRequiredTileStart;
        public final SparseBooleanArray mLoadedTiles;
        private TileList.Tile<T> mRecycledRoot;
        public final /* synthetic */ AsyncListUtil this$0;

        public AnonymousClass2(AsyncListUtil asyncListUtil) {
        }

        private TileList.Tile<T> acquireTile() {
        }

        private void addTile(TileList.Tile<T> tile) {
        }

        private void flushTileCache(int i2) {
        }

        private int getTileStart(int i2) {
        }

        private boolean isTileLoaded(int i2) {
        }

        private void log(String str, Object... objArr) {
        }

        private void removeTile(int i2) {
        }

        private void requestTiles(int i2, int i3, int i4, boolean z) {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(TileList.Tile<T> tile) {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int i2) {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int i2, int i3, int i4, int i5, int i6) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class DataCallback<T> {
        @WorkerThread
        public abstract void fillData(@NonNull T[] tArr, int i2, int i3);

        @WorkerThread
        public int getMaxCachedTiles() {
        }

        @WorkerThread
        public void recycleData(@NonNull T[] tArr, int i2) {
        }

        @WorkerThread
        public abstract int refreshData();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        @UiThread
        public void extendRangeInto(@NonNull int[] iArr, @NonNull int[] iArr2, int i2) {
        }

        @UiThread
        public abstract void getItemRangeInto(@NonNull int[] iArr);

        @UiThread
        public abstract void onDataRefresh();

        @UiThread
        public abstract void onItemLoaded(int i2);
    }

    public AsyncListUtil(@NonNull Class<T> cls, int i2, @NonNull DataCallback<T> dataCallback, @NonNull ViewCallback viewCallback) {
    }

    private boolean isRefreshPending() {
    }

    @Nullable
    public T getItem(int i2) {
    }

    public int getItemCount() {
    }

    public void log(String str, Object... objArr) {
    }

    public void onRangeChanged() {
    }

    public void refresh() {
    }

    public void updateRange() {
    }
}
