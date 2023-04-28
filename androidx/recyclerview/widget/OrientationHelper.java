package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class OrientationHelper {
    public static final int HORIZONTAL = 0;
    private static final int INVALID_SIZE = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;
    private int mLastTotalSpace;
    public final RecyclerView.LayoutManager mLayoutManager;
    public final Rect mTmpRect;

    /* renamed from: androidx.recyclerview.widget.OrientationHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends OrientationHelper {
        public AnonymousClass1(RecyclerView.LayoutManager layoutManager) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getDecoratedEnd(View view) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getDecoratedMeasurement(View view) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getDecoratedMeasurementInOther(View view) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getDecoratedStart(View view) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getEnd() {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getEndAfterPadding() {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getEndPadding() {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getMode() {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getModeInOther() {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getStartAfterPadding() {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getTotalSpace() {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getTransformedEndWithDecoration(View view) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getTransformedStartWithDecoration(View view) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public void offsetChild(View view, int i2) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public void offsetChildren(int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.OrientationHelper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends OrientationHelper {
        public AnonymousClass2(RecyclerView.LayoutManager layoutManager) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getDecoratedEnd(View view) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getDecoratedMeasurement(View view) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getDecoratedMeasurementInOther(View view) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getDecoratedStart(View view) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getEnd() {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getEndAfterPadding() {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getEndPadding() {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getMode() {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getModeInOther() {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getStartAfterPadding() {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getTotalSpace() {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getTransformedEndWithDecoration(View view) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public int getTransformedStartWithDecoration(View view) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public void offsetChild(View view, int i2) {
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public void offsetChildren(int i2) {
        }
    }

    public /* synthetic */ OrientationHelper(RecyclerView.LayoutManager layoutManager, AnonymousClass1 anonymousClass1) {
    }

    public static OrientationHelper createHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
    }

    public static OrientationHelper createOrientationHelper(RecyclerView.LayoutManager layoutManager, int i2) {
    }

    public static OrientationHelper createVerticalHelper(RecyclerView.LayoutManager layoutManager) {
    }

    public abstract int getDecoratedEnd(View view);

    public abstract int getDecoratedMeasurement(View view);

    public abstract int getDecoratedMeasurementInOther(View view);

    public abstract int getDecoratedStart(View view);

    public abstract int getEnd();

    public abstract int getEndAfterPadding();

    public abstract int getEndPadding();

    public RecyclerView.LayoutManager getLayoutManager() {
    }

    public abstract int getMode();

    public abstract int getModeInOther();

    public abstract int getStartAfterPadding();

    public abstract int getTotalSpace();

    public int getTotalSpaceChange() {
    }

    public abstract int getTransformedEndWithDecoration(View view);

    public abstract int getTransformedStartWithDecoration(View view);

    public abstract void offsetChild(View view, int i2);

    public abstract void offsetChildren(int i2);

    public void onLayoutComplete() {
    }

    private OrientationHelper(RecyclerView.LayoutManager layoutManager) {
    }
}
