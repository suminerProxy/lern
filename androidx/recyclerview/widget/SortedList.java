package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Comparator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SortedList<T> {
    private static final int CAPACITY_GROWTH = 10;
    private static final int DELETION = 2;
    private static final int INSERTION = 1;
    public static final int INVALID_POSITION = -1;
    private static final int LOOKUP = 4;
    private static final int MIN_CAPACITY = 10;
    private BatchedCallback mBatchedCallback;
    private Callback mCallback;
    public T[] mData;
    private int mNewDataStart;
    private T[] mOldData;
    private int mOldDataSize;
    private int mOldDataStart;
    private int mSize;
    private final Class<T> mTClass;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class BatchedCallback<T2> extends Callback<T2> {
        private final BatchingListUpdateCallback mBatchingListUpdateCallback;
        public final Callback<T2> mWrappedCallback;

        public BatchedCallback(Callback<T2> callback) {
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areContentsTheSame(T2 t2, T2 t22) {
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areItemsTheSame(T2 t2, T2 t22) {
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, java.util.Comparator
        public int compare(T2 t2, T2 t22) {
        }

        public void dispatchLastEvent() {
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        @Nullable
        public Object getChangePayload(T2 t2, T2 t22) {
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public void onChanged(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i2, int i3, Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        public abstract boolean areContentsTheSame(T2 t2, T2 t22);

        public abstract boolean areItemsTheSame(T2 t2, T2 t22);

        @Override // java.util.Comparator
        public abstract int compare(T2 t2, T2 t22);

        @Nullable
        public Object getChangePayload(T2 t2, T2 t22) {
        }

        public abstract void onChanged(int i2, int i3);

        public void onChanged(int i2, int i3, Object obj) {
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback) {
    }

    private void addAllInternal(T[] tArr) {
    }

    private void addToData(int i2, T t) {
    }

    private T[] copyArray(T[] tArr) {
    }

    private int findIndexOf(T t, T[] tArr, int i2, int i3, int i4) {
    }

    private int findSameItem(T t, T[] tArr, int i2, int i3) {
    }

    private int linearEqualitySearch(T t, int i2, int i3, int i4) {
    }

    private void merge(T[] tArr, int i2) {
    }

    private void removeItemAtIndex(int i2, boolean z) {
    }

    private void replaceAllInsert(T t) {
    }

    private void replaceAllInternal(@NonNull T[] tArr) {
    }

    private void replaceAllRemove() {
    }

    private int sortAndDedup(@NonNull T[] tArr) {
    }

    private void throwIfInMutationOperation() {
    }

    public int add(T t) {
    }

    public void addAll(@NonNull T[] tArr, boolean z) {
    }

    public void beginBatchedUpdates() {
    }

    public void clear() {
    }

    public void endBatchedUpdates() {
    }

    public T get(int i2) throws IndexOutOfBoundsException {
    }

    public int indexOf(T t) {
    }

    public void recalculatePositionOfItemAt(int i2) {
    }

    public boolean remove(T t) {
    }

    public T removeItemAt(int i2) {
    }

    public void replaceAll(@NonNull T[] tArr, boolean z) {
    }

    public int size() {
    }

    public void updateItemAt(int i2, T t) {
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback, int i2) {
    }

    private int add(T t, boolean z) {
    }

    private boolean remove(T t, boolean z) {
    }

    public void replaceAll(@NonNull T... tArr) {
    }

    public void addAll(@NonNull T... tArr) {
    }

    public void replaceAll(@NonNull Collection<T> collection) {
    }

    public void addAll(@NonNull Collection<T> collection) {
    }
}
