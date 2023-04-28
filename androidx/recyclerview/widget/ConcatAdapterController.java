package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.NestedAdapterWrapper;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ConcatAdapterController implements NestedAdapterWrapper.Callback {
    private List<WeakReference<RecyclerView>> mAttachedRecyclerViews;
    private final IdentityHashMap<RecyclerView.ViewHolder, NestedAdapterWrapper> mBinderLookup;
    private final ConcatAdapter mConcatAdapter;
    private WrapperAndLocalPosition mReusableHolder;
    @NonNull
    private final ConcatAdapter.Config.StableIdMode mStableIdMode;
    private final StableIdStorage mStableIdStorage;
    private final ViewTypeStorage mViewTypeStorage;
    private List<NestedAdapterWrapper> mWrappers;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class WrapperAndLocalPosition {
        public boolean mInUse;
        public int mLocalPosition;
        public NestedAdapterWrapper mWrapper;
    }

    public ConcatAdapterController(ConcatAdapter concatAdapter, ConcatAdapter.Config config) {
    }

    private void calculateAndUpdateStateRestorationPolicy() {
    }

    private RecyclerView.Adapter.StateRestorationPolicy computeStateRestorationPolicy() {
    }

    private int countItemsBefore(NestedAdapterWrapper nestedAdapterWrapper) {
    }

    @NonNull
    private WrapperAndLocalPosition findWrapperAndLocalPosition(int i2) {
    }

    @Nullable
    private NestedAdapterWrapper findWrapperFor(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
    }

    @NonNull
    private NestedAdapterWrapper getWrapper(RecyclerView.ViewHolder viewHolder) {
    }

    private int indexOfWrapper(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
    }

    private boolean isAttachedTo(RecyclerView recyclerView) {
    }

    private void releaseWrapperAndLocalPosition(WrapperAndLocalPosition wrapperAndLocalPosition) {
    }

    public boolean addAdapter(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
    }

    public boolean canRestoreState() {
    }

    @Nullable
    public RecyclerView.Adapter<? extends RecyclerView.ViewHolder> getBoundAdapter(RecyclerView.ViewHolder viewHolder) {
    }

    public List<RecyclerView.Adapter<? extends RecyclerView.ViewHolder>> getCopyOfAdapters() {
    }

    public long getItemId(int i2) {
    }

    public int getItemViewType(int i2) {
    }

    public int getLocalAdapterPosition(RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter, RecyclerView.ViewHolder viewHolder, int i2) {
    }

    public int getTotalCount() {
    }

    public boolean hasStableIds() {
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onChanged(@NonNull NestedAdapterWrapper nestedAdapterWrapper) {
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeChanged(@NonNull NestedAdapterWrapper nestedAdapterWrapper, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeInserted(@NonNull NestedAdapterWrapper nestedAdapterWrapper, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeMoved(@NonNull NestedAdapterWrapper nestedAdapterWrapper, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeRemoved(@NonNull NestedAdapterWrapper nestedAdapterWrapper, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onStateRestorationPolicyChanged(NestedAdapterWrapper nestedAdapterWrapper) {
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
    }

    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
    }

    public boolean removeAdapter(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
    }

    public boolean addAdapter(int i2, RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeChanged(@NonNull NestedAdapterWrapper nestedAdapterWrapper, int i2, int i3, @Nullable Object obj) {
    }
}
