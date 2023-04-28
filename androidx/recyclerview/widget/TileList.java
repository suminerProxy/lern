package androidx.recyclerview.widget;

import android.util.SparseArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TileList<T> {
    public Tile<T> mLastAccessedTile;
    public final int mTileSize;
    private final SparseArray<Tile<T>> mTiles;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Tile<T> {
        public int mItemCount;
        public final T[] mItems;
        public Tile<T> mNext;
        public int mStartPosition;

        public Tile(Class<T> cls, int i2) {
        }

        public boolean containsPosition(int i2) {
        }

        public T getByPosition(int i2) {
        }
    }

    public TileList(int i2) {
    }

    public Tile<T> addOrReplace(Tile<T> tile) {
    }

    public void clear() {
    }

    public Tile<T> getAtIndex(int i2) {
    }

    public T getItemAt(int i2) {
    }

    public Tile<T> removeAtPos(int i2) {
    }

    public int size() {
    }
}
