package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Comparator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class AnimateLayoutChangeDetector {
    private static final ViewGroup.MarginLayoutParams ZERO_MARGIN_LAYOUT_PARAMS = null;
    private LinearLayoutManager mLayoutManager;

    /* renamed from: androidx.viewpager2.widget.AnimateLayoutChangeDetector$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Comparator<int[]> {
        public final /* synthetic */ AnimateLayoutChangeDetector this$0;

        public AnonymousClass1(AnimateLayoutChangeDetector animateLayoutChangeDetector) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(int[] iArr, int[] iArr2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(int[] iArr, int[] iArr2) {
        }
    }

    public AnimateLayoutChangeDetector(@NonNull LinearLayoutManager linearLayoutManager) {
    }

    private boolean arePagesLaidOutContiguously() {
    }

    private boolean hasRunningChangingLayoutTransition() {
    }

    public boolean mayHaveInterferingAnimations() {
    }

    private static boolean hasRunningChangingLayoutTransition(View view) {
    }
}
