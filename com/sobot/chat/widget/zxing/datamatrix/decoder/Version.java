package com.sobot.chat.widget.zxing.datamatrix.decoder;

import com.sobot.chat.widget.zxing.FormatException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Version {
    private static final Version[] VERSIONS = null;
    private final int dataRegionSizeColumns;
    private final int dataRegionSizeRows;
    private final ECBlocks ecBlocks;
    private final int symbolSizeColumns;
    private final int symbolSizeRows;
    private final int totalCodewords;
    private final int versionNumber;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class ECB {
        private final int count;
        private final int dataCodewords;

        public /* synthetic */ ECB(int i2, int i3, AnonymousClass1 anonymousClass1) {
        }

        public int getCount() {
        }

        public int getDataCodewords() {
        }

        private ECB(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class ECBlocks {
        private final ECB[] ecBlocks;
        private final int ecCodewords;

        public /* synthetic */ ECBlocks(int i2, ECB ecb, AnonymousClass1 anonymousClass1) {
        }

        public ECB[] getECBlocks() {
        }

        public int getECCodewords() {
        }

        public /* synthetic */ ECBlocks(int i2, ECB ecb, ECB ecb2, AnonymousClass1 anonymousClass1) {
        }

        private ECBlocks(int i2, ECB ecb) {
        }

        private ECBlocks(int i2, ECB ecb, ECB ecb2) {
        }
    }

    private Version(int i2, int i3, int i4, int i5, int i6, ECBlocks eCBlocks) {
    }

    private static Version[] buildVersions() {
    }

    public static Version getVersionForDimensions(int i2, int i3) throws FormatException {
    }

    public int getDataRegionSizeColumns() {
    }

    public int getDataRegionSizeRows() {
    }

    public ECBlocks getECBlocks() {
    }

    public int getSymbolSizeColumns() {
    }

    public int getSymbolSizeRows() {
    }

    public int getTotalCodewords() {
    }

    public int getVersionNumber() {
    }

    public String toString() {
    }
}
