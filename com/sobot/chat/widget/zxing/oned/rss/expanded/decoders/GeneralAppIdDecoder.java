package com.sobot.chat.widget.zxing.oned.rss.expanded.decoders;

import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.common.BitArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class GeneralAppIdDecoder {
    private final StringBuilder buffer;
    private final CurrentParsingState current;
    private final BitArray information;

    public GeneralAppIdDecoder(BitArray bitArray) {
    }

    private DecodedChar decodeAlphanumeric(int i2) {
    }

    private DecodedChar decodeIsoIec646(int i2) throws FormatException {
    }

    private DecodedNumeric decodeNumeric(int i2) throws FormatException {
    }

    private boolean isAlphaOr646ToNumericLatch(int i2) {
    }

    private boolean isAlphaTo646ToAlphaLatch(int i2) {
    }

    private boolean isNumericToAlphaNumericLatch(int i2) {
    }

    private boolean isStillAlpha(int i2) {
    }

    private boolean isStillIsoIec646(int i2) {
    }

    private boolean isStillNumeric(int i2) {
    }

    private BlockParsedResult parseAlphaBlock() {
    }

    private DecodedInformation parseBlocks() throws FormatException {
    }

    private BlockParsedResult parseIsoIec646Block() throws FormatException {
    }

    private BlockParsedResult parseNumericBlock() throws FormatException {
    }

    public String decodeAllCodes(StringBuilder sb, int i2) throws NotFoundException, FormatException {
    }

    public DecodedInformation decodeGeneralPurposeField(int i2, String str) throws FormatException {
    }

    public int extractNumericValueFromBitArray(int i2, int i3) {
    }

    public static int extractNumericValueFromBitArray(BitArray bitArray, int i2, int i3) {
    }
}
