package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ViewInfoStore {
    private static final boolean DEBUG = false;
    @VisibleForTesting
    public final SimpleArrayMap<RecyclerView.ViewHolder, InfoRecord> mLayoutHolderMap;
    @VisibleForTesting
    public final LongSparseArray<RecyclerView.ViewHolder> mOldChangedHolders;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class InfoRecord {
        public static final int FLAG_APPEAR = 2;
        public static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
        public static final int FLAG_APPEAR_PRE_AND_POST = 14;
        public static final int FLAG_DISAPPEARED = 1;
        public static final int FLAG_POST = 8;
        public static final int FLAG_PRE = 4;
        public static final int FLAG_PRE_AND_POST = 12;
        public static Pools.Pool<InfoRecord> sPool;
        public int flags;
        @Nullable
        public RecyclerView.ItemAnimator.ItemHolderInfo postInfo;
        @Nullable
        public RecyclerView.ItemAnimator.ItemHolderInfo preInfo;

        private InfoRecord() {
        }

        public static void drainCache() {
        }

        public static InfoRecord obtain() {
        }

        public static void recycle(InfoRecord infoRecord) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ProcessCallback {
        void processAppeared(RecyclerView.ViewHolder viewHolder, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processDisappeared(RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processPersistent(RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void unused(RecyclerView.ViewHolder viewHolder);
    }

    private RecyclerView.ItemAnimator.ItemHolderInfo popFromLayoutStep(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    public void addToAppearedInPreLayoutHolders(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
    }

    public void addToDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
    }

    public void addToOldChangeHolders(long j2, RecyclerView.ViewHolder viewHolder) {
    }

    public void addToPostLayout(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
    }

    public void addToPreLayout(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
    }

    public void clear() {
    }

    public RecyclerView.ViewHolder getFromOldChangeHolders(long j2) {
    }

    public boolean isDisappearing(RecyclerView.ViewHolder viewHolder) {
    }

    public boolean isInPreLayout(RecyclerView.ViewHolder viewHolder) {
    }

    public void onDetach() {
    }

    public void onViewDetached(RecyclerView.ViewHolder viewHolder) {
    }

    @Nullable
    public RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(RecyclerView.ViewHolder viewHolder) {
    }

    @Nullable
    public RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(RecyclerView.ViewHolder viewHolder) {
    }

    public void process(ProcessCallback processCallback) {
    }

    public void removeFromDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
    }

    public void removeViewHolder(RecyclerView.ViewHolder viewHolder) {
    }
}
