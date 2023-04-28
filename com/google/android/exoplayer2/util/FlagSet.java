package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FlagSet {
    private final SparseBooleanArray flags;

    public /* synthetic */ FlagSet(SparseBooleanArray sparseBooleanArray, AnonymousClass1 anonymousClass1) {
    }

    public boolean contains(int flag) {
    }

    public boolean containsAny(int... flags) {
    }

    public boolean equals(@Nullable Object o2) {
    }

    public int get(int index) {
    }

    public int hashCode() {
    }

    public int size() {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private boolean buildCalled;
        private final SparseBooleanArray flags;

        public Builder add(int flag) {
        }

        public Builder addAll(int... flags) {
        }

        public Builder addIf(int flag, boolean condition) {
        }

        public FlagSet build() {
        }

        public Builder remove(int flag) {
        }

        public Builder removeAll(int... flags) {
        }

        public Builder removeIf(int flag, boolean condition) {
        }

        public Builder addAll(FlagSet flags) {
        }
    }

    private FlagSet(SparseBooleanArray flags) {
    }
}
