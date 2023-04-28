package com.sobot.chat.widget.zxing.aztec.encoder;

import com.sobot.chat.widget.zxing.common.BitArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class State {
    public static final State INITIAL_STATE = null;
    private final int binaryShiftByteCount;
    private final int bitCount;
    private final int mode;
    private final Token token;

    private State(Token token, int i2, int i3, int i4) {
    }

    private static int calculateBinaryShiftCost(State state) {
    }

    public State addBinaryShiftChar(int i2) {
    }

    public State endBinaryShift(int i2) {
    }

    public int getBinaryShiftByteCount() {
    }

    public int getBitCount() {
    }

    public int getMode() {
    }

    public Token getToken() {
    }

    public boolean isBetterThanOrEqualTo(State state) {
    }

    public State latchAndAppend(int i2, int i3) {
    }

    public State shiftAndAppend(int i2, int i3) {
    }

    public BitArray toBitArray(byte[] bArr) {
    }

    public String toString() {
    }
}
