package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class GapWorker implements Runnable {
    public static final ThreadLocal<GapWorker> sGapWorker = null;
    public static Comparator<Task> sTaskComparator;
    public long mFrameIntervalNs;
    public long mPostTimeNs;
    public ArrayList<RecyclerView> mRecyclerViews;
    private ArrayList<Task> mTasks;

    /* renamed from: androidx.recyclerview.widget.GapWorker$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Comparator<Task> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Task task, Task task2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(Task task, Task task2) {
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LayoutPrefetchRegistryImpl implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {
        public int mCount;
        public int[] mPrefetchArray;
        public int mPrefetchDx;
        public int mPrefetchDy;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public void addPosition(int i2, int i3) {
        }

        public void clearPrefetchPositions() {
        }

        public void collectPrefetchPositionsFromView(RecyclerView recyclerView, boolean z) {
        }

        public boolean lastPrefetchIncludedPosition(int i2) {
        }

        public void setPrefetchVector(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Task {
        public int distanceToItem;
        public boolean immediate;
        public int position;
        public RecyclerView view;
        public int viewVelocity;

        public void clear() {
        }
    }

    private void buildTaskList() {
    }

    private void flushTaskWithDeadline(Task task, long j2) {
    }

    private void flushTasksWithDeadline(long j2) {
    }

    public static boolean isPrefetchPositionAttached(RecyclerView recyclerView, int i2) {
    }

    private void prefetchInnerRecyclerViewWithDeadline(@Nullable RecyclerView recyclerView, long j2) {
    }

    private RecyclerView.ViewHolder prefetchPositionWithDeadline(RecyclerView recyclerView, int i2, long j2) {
    }

    public void add(RecyclerView recyclerView) {
    }

    public void postFromTraversal(RecyclerView recyclerView, int i2, int i3) {
    }

    public void prefetch(long j2) {
    }

    public void remove(RecyclerView recyclerView) {
    }

    @Override // java.lang.Runnable
    public void run() {
    }
}
