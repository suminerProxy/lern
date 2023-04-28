package com.sobot.chat.widget.zxing.datamatrix.decoder;

import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.common.BitSource;
import com.sobot.chat.widget.zxing.common.DecoderResult;
import java.util.Collection;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class DecodedBitStreamParser {
    private static final char[] C40_BASIC_SET_CHARS = null;
    private static final char[] C40_SHIFT2_SET_CHARS = null;
    private static final char[] TEXT_BASIC_SET_CHARS = null;
    private static final char[] TEXT_SHIFT2_SET_CHARS = null;
    private static final char[] TEXT_SHIFT3_SET_CHARS = null;

    /* renamed from: com.sobot.chat.widget.zxing.datamatrix.decoder.DecodedBitStreamParser$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$sobot$chat$widget$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class Mode {
        private static final /* synthetic */ Mode[] $VALUES = null;
        public static final Mode ANSIX12_ENCODE = null;
        public static final Mode ASCII_ENCODE = null;
        public static final Mode BASE256_ENCODE = null;
        public static final Mode C40_ENCODE = null;
        public static final Mode EDIFACT_ENCODE = null;
        public static final Mode PAD_ENCODE = null;
        public static final Mode TEXT_ENCODE = null;

        private Mode(String str, int i2) {
        }

        public static Mode valueOf(String str) {
        }

        public static Mode[] values() {
        }
    }

    private DecodedBitStreamParser() {
    }

    public static DecoderResult decode(byte[] bArr) throws FormatException {
    }

    private static void decodeAnsiX12Segment(BitSource bitSource, StringBuilder sb) throws FormatException {
    }

    private static Mode decodeAsciiSegment(BitSource bitSource, StringBuilder sb, StringBuilder sb2) throws FormatException {
    }

    private static void decodeBase256Segment(BitSource bitSource, StringBuilder sb, Collection<byte[]> collection) throws FormatException {
    }

    private static void decodeC40Segment(BitSource bitSource, StringBuilder sb) throws FormatException {
    }

    private static void decodeEdifactSegment(BitSource bitSource, StringBuilder sb) {
    }

    private static void decodeTextSegment(BitSource bitSource, StringBuilder sb) throws FormatException {
    }

    private static void parseTwoBytes(int i2, int i3, int[] iArr) {
    }

    private static int unrandomize255State(int i2, int i3) {
    }
}
