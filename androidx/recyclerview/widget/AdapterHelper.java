package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class AdapterHelper implements OpReorderer.Callback {
    private static final boolean DEBUG = false;
    public static final int POSITION_TYPE_INVISIBLE = 0;
    public static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
    private static final String TAG = "AHT";
    public final Callback mCallback;
    public final boolean mDisableRecycler;
    private int mExistingUpdateTypes;
    public Runnable mOnItemProcessedCallback;
    public final OpReorderer mOpReorderer;
    public final ArrayList<UpdateOp> mPendingUpdates;
    public final ArrayList<UpdateOp> mPostponedList;
    private Pools.Pool<UpdateOp> mUpdateOpPool;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface Callback {
        RecyclerView.ViewHolder findViewHolder(int i2);

        void markViewHoldersUpdated(int i2, int i3, Object obj);

        void offsetPositionsForAdd(int i2, int i3);

        void offsetPositionsForMove(int i2, int i3);

        void offsetPositionsForRemovingInvisible(int i2, int i3);

        void offsetPositionsForRemovingLaidOutOrNewView(int i2, int i3);

        void onDispatchFirstPass(UpdateOp updateOp);

        void onDispatchSecondPass(UpdateOp updateOp);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class UpdateOp {
        public static final int ADD = 1;
        public static final int MOVE = 8;
        public static final int POOL_SIZE = 30;
        public static final int REMOVE = 2;
        public static final int UPDATE = 4;
        public int cmd;
        public int itemCount;
        public Object payload;
        public int positionStart;

        public UpdateOp(int i2, int i3, int i4, Object obj) {
        }

        public String cmdToString() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public AdapterHelper(Callback callback) {
    }

    private void applyAdd(UpdateOp updateOp) {
    }

    private void applyMove(UpdateOp updateOp) {
    }

    private void applyRemove(UpdateOp updateOp) {
    }

    private void applyUpdate(UpdateOp updateOp) {
    }

    private boolean canFindInPreLayout(int i2) {
    }

    private void dispatchAndUpdateViewHolders(UpdateOp updateOp) {
    }

    private void postponeAndUpdateViewHolders(UpdateOp updateOp) {
    }

    private int updatePositionWithPostponed(int i2, int i3) {
    }

    public AdapterHelper addUpdateOp(UpdateOp... updateOpArr) {
    }

    public int applyPendingUpdatesToPosition(int i2) {
    }

    public void consumePostponedUpdates() {
    }

    public void consumeUpdatesInOnePass() {
    }

    public void dispatchFirstPassAndUpdateViewHolders(UpdateOp updateOp, int i2) {
    }

    public int findPositionOffset(int i2) {
    }

    public boolean hasAnyUpdateTypes(int i2) {
    }

    public boolean hasPendingUpdates() {
    }

    public boolean hasUpdates() {
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public UpdateOp obtainUpdateOp(int i2, int i3, int i4, Object obj) {
    }

    public boolean onItemRangeChanged(int i2, int i3, Object obj) {
    }

    public boolean onItemRangeInserted(int i2, int i3) {
    }

    public boolean onItemRangeMoved(int i2, int i3, int i4) {
    }

    public boolean onItemRangeRemoved(int i2, int i3) {
    }

    public void preProcess() {
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public void recycleUpdateOp(UpdateOp updateOp) {
    }

    public void recycleUpdateOpsAndClearList(List<UpdateOp> list) {
    }

    public void reset() {
    }

    public AdapterHelper(Callback callback, boolean z) {
    }

    public int findPositionOffset(int i2, int i3) {
    }
}
