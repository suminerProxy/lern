package com.sobot.chat.widget.zxing.qrcode.decoder;

import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.common.BitMatrix;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Version {
    private static final Version[] VERSIONS = null;
    private static final int[] VERSION_DECODE_INFO = null;
    private final int[] alignmentPatternCenters;
    private final ECBlocks[] ecBlocks;
    private final int totalCodewords;
    private final int versionNumber;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class ECB {
        private final int count;
        private final int dataCodewords;

        public ECB(int i2, int i3) {
        }

        public int getCount() {
        }

        public int getDataCodewords() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class ECBlocks {
        private final ECB[] ecBlocks;
        private final int ecCodewordsPerBlock;

        public ECBlocks(int i2, ECB... ecbArr) {
        }

        public ECB[] getECBlocks() {
        }

        public int getECCodewordsPerBlock() {
        }

        public int getNumBlocks() {
        }

        public int getTotalECCodewords() {
        }
    }

    private Version(int i2, int[] iArr, ECBlocks... eCBlocksArr) {
    }

    private static Version[] buildVersions() {
    }

    public static Version decodeVersionInformation(int i2) {
    }

    public static Version getProvisionalVersionForDimension(int i2) throws FormatException {
    }

    public static Version getVersionForNumber(int i2) {
    }

    public BitMatrix buildFunctionPattern() {
    }

    public int[] getAlignmentPatternCenters() {
    }

    public int getDimensionForVersion() {
    }

    public ECBlocks getECBlocksForLevel(ErrorCorrectionLevel errorCorrectionLevel) {
    }

    public int getTotalCodewords() {
    }

    public int getVersionNumber() {
    }

    public String toString() {
    }
}
