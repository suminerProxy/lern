package com.sobot.chat.widget.zxing.aztec.encoder;

import com.sobot.chat.widget.zxing.common.BitArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class Token {
    public static final Token EMPTY = null;
    private final Token previous;

    public Token(Token token) {
    }

    public final Token add(int i2, int i3) {
    }

    public final Token addBinaryShift(int i2, int i3) {
    }

    public abstract void appendTo(BitArray bitArray, byte[] bArr);

    public final Token getPrevious() {
    }
}
