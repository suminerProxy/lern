package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.CharMatcher;
import java.util.BitSet;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SmallCharMatcher extends CharMatcher.NamedFastMatcher {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final double DESIRED_LOAD_FACTOR = 0.5d;
    public static final int MAX_SIZE = 1023;
    private final boolean containsZero;
    private final long filter;
    private final char[] table;

    private SmallCharMatcher(char[] cArr, long j2, boolean z, String str) {
    }

    private boolean checkFilter(int i2) {
    }

    @VisibleForTesting
    public static int chooseTableSize(int i2) {
    }

    public static CharMatcher from(BitSet bitSet, String str) {
    }

    public static int smear(int i2) {
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char c) {
    }

    @Override // com.google.common.base.CharMatcher
    public void setBits(BitSet bitSet) {
    }
}
