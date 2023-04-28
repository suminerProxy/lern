package androidx.coordinatorlayout.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class DirectedAcyclicGraph<T> {
    private final SimpleArrayMap<T, ArrayList<T>> mGraph;
    private final Pools.Pool<ArrayList<T>> mListPool;
    private final ArrayList<T> mSortResult;
    private final HashSet<T> mSortTmpMarked;

    private void dfs(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
    }

    @NonNull
    private ArrayList<T> getEmptyList() {
    }

    private void poolList(@NonNull ArrayList<T> arrayList) {
    }

    public void addEdge(@NonNull T t, @NonNull T t2) {
    }

    public void addNode(@NonNull T t) {
    }

    public void clear() {
    }

    public boolean contains(@NonNull T t) {
    }

    @Nullable
    public List getIncomingEdges(@NonNull T t) {
    }

    @Nullable
    public List<T> getOutgoingEdges(@NonNull T t) {
    }

    @NonNull
    public ArrayList<T> getSortedList() {
    }

    public boolean hasOutgoingEdges(@NonNull T t) {
    }

    public int size() {
    }
}
