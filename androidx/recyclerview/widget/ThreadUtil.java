package androidx.recyclerview.widget;

import androidx.recyclerview.widget.TileList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface ThreadUtil<T> {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface BackgroundCallback<T> {
        void loadTile(int i2, int i3);

        void recycleTile(TileList.Tile<T> tile);

        void refresh(int i2);

        void updateRange(int i2, int i3, int i4, int i5, int i6);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface MainThreadCallback<T> {
        void addTile(int i2, TileList.Tile<T> tile);

        void removeTile(int i2, int i3);

        void updateItemCount(int i2, int i3);
    }

    BackgroundCallback<T> getBackgroundProxy(BackgroundCallback<T> backgroundCallback);

    MainThreadCallback<T> getMainThreadProxy(MainThreadCallback<T> mainThreadCallback);
}
