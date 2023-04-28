package com.sobot.chat.widget.zxing.client.result;

import com.sobot.chat.widget.zxing.Result;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class ResultParser {
    private static final Pattern AMPERSAND = null;
    private static final String BYTE_ORDER_MARK = "\ufeff";
    private static final Pattern DIGITS = null;
    public static final String[] EMPTY_STR_ARRAY = null;
    private static final Pattern EQUALS = null;
    private static final ResultParser[] PARSERS = null;

    private static void appendKeyValue(CharSequence charSequence, Map<String, String> map) {
    }

    private static int countPrecedingBackslashes(CharSequence charSequence, int i2) {
    }

    public static String getMassagedText(Result result) {
    }

    public static boolean isStringOfDigits(CharSequence charSequence, int i2) {
    }

    public static boolean isSubstringOfDigits(CharSequence charSequence, int i2, int i3) {
    }

    public static String[] matchPrefixedField(String str, String str2, char c, boolean z) {
    }

    public static String matchSinglePrefixedField(String str, String str2, char c, boolean z) {
    }

    public static void maybeAppend(String str, StringBuilder sb) {
    }

    public static String[] maybeWrap(String str) {
    }

    public static int parseHexDigit(char c) {
    }

    public static Map<String, String> parseNameValuePairs(String str) {
    }

    public static ParsedResult parseResult(Result result) {
    }

    public static String unescapeBackslash(String str) {
    }

    public static String urlDecode(String str) {
    }

    public abstract ParsedResult parse(Result result);

    public static void maybeAppend(String[] strArr, StringBuilder sb) {
    }
}
