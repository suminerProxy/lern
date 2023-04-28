package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Map;

@Beta
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ArrayBasedEscaperMap {
    private static final char[][] EMPTY_REPLACEMENT_ARRAY = null;
    private final char[][] replacementArray;

    private ArrayBasedEscaperMap(char[][] cArr) {
    }

    public static ArrayBasedEscaperMap create(Map<Character, String> map) {
    }

    @VisibleForTesting
    public static char[][] createReplacementArray(Map<Character, String> map) {
    }

    public char[][] getReplacementArray() {
    }
}
