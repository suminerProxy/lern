package com.google.android.exoplayer2.util;

import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SlidingPercentile {
    private static final Comparator<Sample> INDEX_COMPARATOR = null;
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private static final Comparator<Sample> VALUE_COMPARATOR = null;
    private int currentSortOrder;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private final Sample[] recycledSamples;
    private final ArrayList<Sample> samples;
    private int totalWeight;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
        }

        public /* synthetic */ Sample(AnonymousClass1 anonymousClass1) {
        }
    }

    public SlidingPercentile(int maxWeight) {
    }

    public static /* synthetic */ int a(Sample sample, Sample sample2) {
    }

    public static /* synthetic */ int b(Sample sample, Sample sample2) {
    }

    private void ensureSortedByIndex() {
    }

    private void ensureSortedByValue() {
    }

    public void addSample(int weight, float value) {
    }

    public float getPercentile(float percentile) {
    }

    public void reset() {
    }
}
