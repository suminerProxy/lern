package com.airbnb.lottie;

import androidx.core.util.Pair;
import com.airbnb.lottie.utils.MeanCalculator;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PerformanceTracker {
    private boolean enabled;
    private final Comparator<Pair<String, Float>> floatComparator;
    private final Set<FrameListener> frameListeners;
    private final Map<String, MeanCalculator> layerRenderTimes;

    /* renamed from: com.airbnb.lottie.PerformanceTracker$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Comparator<Pair<String, Float>> {
        public final /* synthetic */ PerformanceTracker this$0;

        public AnonymousClass1(PerformanceTracker performanceTracker) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(Pair<String, Float> pair, Pair<String, Float> pair2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface FrameListener {
        void onFrameRendered(float f2);
    }

    public void addFrameListener(FrameListener frameListener) {
    }

    public void clearRenderTimes() {
    }

    public List<Pair<String, Float>> getSortedRenderTimes() {
    }

    public void logRenderTimes() {
    }

    public void recordRenderTime(String str, float f2) {
    }

    public void removeFrameListener(FrameListener frameListener) {
    }

    public void setEnabled(boolean z) {
    }
}
