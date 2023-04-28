package com.sobot.chat.widget.zxing.oned;

import com.sobot.chat.widget.zxing.BarcodeFormat;
import com.sobot.chat.widget.zxing.ChecksumException;
import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.Result;
import com.sobot.chat.widget.zxing.common.BitArray;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class UPCEANReader extends OneDReader {
    public static final int[] END_PATTERN = null;
    public static final int[][] L_AND_G_PATTERNS = null;
    public static final int[][] L_PATTERNS = null;
    private static final float MAX_AVG_VARIANCE = 0.48f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;
    public static final int[] MIDDLE_PATTERN = null;
    public static final int[] START_END_PATTERN = null;
    private final StringBuilder decodeRowStringBuffer;
    private final EANManufacturerOrgSupport eanManSupport;
    private final UPCEANExtensionSupport extensionReader;

    public static boolean checkStandardUPCEANChecksum(CharSequence charSequence) throws FormatException {
    }

    public static int decodeDigit(BitArray bitArray, int[] iArr, int i2, int[][] iArr2) throws NotFoundException {
    }

    public static int[] findGuardPattern(BitArray bitArray, int i2, boolean z, int[] iArr) throws NotFoundException {
    }

    public static int[] findStartGuardPattern(BitArray bitArray) throws NotFoundException {
    }

    public static int getStandardUPCEANChecksum(CharSequence charSequence) throws FormatException {
    }

    public boolean checkChecksum(String str) throws FormatException {
    }

    public int[] decodeEnd(BitArray bitArray, int i2) throws NotFoundException {
    }

    public abstract int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) throws NotFoundException;

    @Override // com.sobot.chat.widget.zxing.oned.OneDReader
    public Result decodeRow(int i2, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
    }

    public abstract BarcodeFormat getBarcodeFormat();

    private static int[] findGuardPattern(BitArray bitArray, int i2, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
    }

    public Result decodeRow(int i2, BitArray bitArray, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
    }
}
