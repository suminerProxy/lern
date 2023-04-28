package com.google.android.exoplayer2.decoder;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CryptoInfo {
    public int clearBlocks;
    public int encryptedBlocks;
    private final MediaCodec.CryptoInfo frameworkCryptoInfo;
    @Nullable
    public byte[] iv;
    @Nullable
    public byte[] key;
    public int mode;
    @Nullable
    public int[] numBytesOfClearData;
    @Nullable
    public int[] numBytesOfEncryptedData;
    public int numSubSamples;
    @Nullable
    private final PatternHolderV24 patternHolder;

    @RequiresApi(24)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PatternHolderV24 {
        private final MediaCodec.CryptoInfo frameworkCryptoInfo;
        private final MediaCodec.CryptoInfo.Pattern pattern;

        public /* synthetic */ PatternHolderV24(MediaCodec.CryptoInfo cryptoInfo, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ void access$100(PatternHolderV24 patternHolderV24, int i2, int i3) {
        }

        private void set(int encryptedBlocks, int clearBlocks) {
        }

        private PatternHolderV24(MediaCodec.CryptoInfo frameworkCryptoInfo) {
        }
    }

    public MediaCodec.CryptoInfo getFrameworkCryptoInfo() {
    }

    public void increaseClearDataFirstSubSampleBy(int count) {
    }

    public void set(int numSubSamples, int[] numBytesOfClearData, int[] numBytesOfEncryptedData, byte[] key, byte[] iv, int mode, int encryptedBlocks, int clearBlocks) {
    }
}
