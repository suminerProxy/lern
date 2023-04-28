package com.google.android.exoplayer2.source;

import java.util.Random;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface ShuffleOrder {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DefaultShuffleOrder implements ShuffleOrder {
        private final int[] indexInShuffled;
        private final Random random;
        private final int[] shuffled;

        public DefaultShuffleOrder(int length) {
        }

        private static int[] createShuffledList(int length, Random random) {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int insertionIndex, int insertionCount) {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int indexFrom, int indexToExclusive) {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getFirstIndex() {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLastIndex() {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLength() {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getNextIndex(int index) {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getPreviousIndex(int index) {
        }

        public DefaultShuffleOrder(int length, long randomSeed) {
        }

        public DefaultShuffleOrder(int[] shuffledIndices, long randomSeed) {
        }

        private DefaultShuffleOrder(int length, Random random) {
        }

        private DefaultShuffleOrder(int[] shuffled, Random random) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class UnshuffledShuffleOrder implements ShuffleOrder {
        private final int length;

        public UnshuffledShuffleOrder(int length) {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int insertionIndex, int insertionCount) {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int indexFrom, int indexToExclusive) {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getFirstIndex() {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLastIndex() {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLength() {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getNextIndex(int index) {
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getPreviousIndex(int index) {
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int insertionIndex, int insertionCount);

    ShuffleOrder cloneAndRemove(int indexFrom, int indexToExclusive);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int index);

    int getPreviousIndex(int index);
}
