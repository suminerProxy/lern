package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FocusStrategy {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface BoundsAdapter<T> {
        void obtainBounds(T t, Rect rect);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface CollectionAdapter<T, V> {
        V get(T t, int i2);

        int size(T t);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SequentialComparator<T> implements Comparator<T> {
        private final BoundsAdapter<T> mAdapter;
        private final boolean mIsLayoutRtl;
        private final Rect mTemp1;
        private final Rect mTemp2;

        public SequentialComparator(boolean z, BoundsAdapter<T> boundsAdapter) {
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
        }
    }

    private FocusStrategy() {
    }

    private static boolean beamBeats(int i2, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
    }

    private static boolean beamsOverlap(int i2, @NonNull Rect rect, @NonNull Rect rect2) {
    }

    public static <L, T> T findNextFocusInAbsoluteDirection(@NonNull L l2, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t, @NonNull Rect rect, int i2) {
    }

    public static <L, T> T findNextFocusInRelativeDirection(@NonNull L l2, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t, int i2, boolean z, boolean z2) {
    }

    private static <T> T getNextFocusable(T t, ArrayList<T> arrayList, boolean z) {
    }

    private static <T> T getPreviousFocusable(T t, ArrayList<T> arrayList, boolean z) {
    }

    private static int getWeightedDistanceFor(int i2, int i3) {
    }

    private static boolean isBetterCandidate(int i2, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
    }

    private static boolean isCandidate(@NonNull Rect rect, @NonNull Rect rect2, int i2) {
    }

    private static boolean isToDirectionOf(int i2, @NonNull Rect rect, @NonNull Rect rect2) {
    }

    private static int majorAxisDistance(int i2, @NonNull Rect rect, @NonNull Rect rect2) {
    }

    private static int majorAxisDistanceRaw(int i2, @NonNull Rect rect, @NonNull Rect rect2) {
    }

    private static int majorAxisDistanceToFarEdge(int i2, @NonNull Rect rect, @NonNull Rect rect2) {
    }

    private static int majorAxisDistanceToFarEdgeRaw(int i2, @NonNull Rect rect, @NonNull Rect rect2) {
    }

    private static int minorAxisDistance(int i2, @NonNull Rect rect, @NonNull Rect rect2) {
    }
}
