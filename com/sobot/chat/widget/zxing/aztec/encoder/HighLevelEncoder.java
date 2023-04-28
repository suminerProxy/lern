package com.sobot.chat.widget.zxing.aztec.encoder;

import com.sobot.chat.widget.zxing.common.BitArray;
import java.util.Collection;
import java.util.Comparator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HighLevelEncoder {
    private static final int[][] CHAR_MAP = null;
    public static final int[][] LATCH_TABLE = null;
    public static final int MODE_DIGIT = 2;
    public static final int MODE_LOWER = 1;
    public static final int MODE_MIXED = 3;
    public static final String[] MODE_NAMES = null;
    public static final int MODE_PUNCT = 4;
    public static final int MODE_UPPER = 0;
    public static final int[][] SHIFT_TABLE = null;
    private final byte[] text;

    /* renamed from: com.sobot.chat.widget.zxing.aztec.encoder.HighLevelEncoder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements Comparator<State> {
        public final /* synthetic */ HighLevelEncoder this$0;

        public AnonymousClass1(HighLevelEncoder highLevelEncoder) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(State state, State state2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(State state, State state2) {
        }
    }

    public HighLevelEncoder(byte[] bArr) {
    }

    private static Collection<State> simplifyStates(Iterable<State> iterable) {
    }

    private void updateStateForChar(State state, int i2, Collection<State> collection) {
    }

    private static void updateStateForPair(State state, int i2, int i3, Collection<State> collection) {
    }

    private Collection<State> updateStateListForChar(Iterable<State> iterable, int i2) {
    }

    private static Collection<State> updateStateListForPair(Iterable<State> iterable, int i2, int i3) {
    }

    public BitArray encode() {
    }
}
