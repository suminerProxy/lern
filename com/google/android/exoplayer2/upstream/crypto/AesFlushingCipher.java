package com.google.android.exoplayer2.upstream.crypto;

import javax.crypto.Cipher;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AesFlushingCipher {
    private final int blockSize;
    private final Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int mode, byte[] secretKey, long nonce, long offset) {
    }

    private byte[] getInitializationVector(long nonce, long counter) {
    }

    private int nonFlushingUpdate(byte[] in, int inOffset, int length, byte[] out, int outOffset) {
    }

    public void update(byte[] in, int inOffset, int length, byte[] out, int outOffset) {
    }

    public void updateInPlace(byte[] data, int offset, int length) {
    }
}
