package com.sobot.chat.widget.zxing.client.result;

import com.sobot.chat.widget.zxing.Result;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class VCardResultParser extends ResultParser {
    private static final Pattern BEGIN_VCARD = null;
    private static final Pattern COMMA = null;
    private static final Pattern CR_LF_SPACE_TAB = null;
    private static final Pattern EQUALS = null;
    private static final Pattern NEWLINE_ESCAPE = null;
    private static final Pattern SEMICOLON = null;
    private static final Pattern SEMICOLON_OR_COMMA = null;
    private static final Pattern UNESCAPED_SEMICOLONS = null;
    private static final Pattern VCARD_ESCAPES = null;
    private static final Pattern VCARD_LIKE_DATE = null;

    private static String decodeQuotedPrintable(CharSequence charSequence, String str) {
    }

    private static void formatNames(Iterable<List<String>> iterable) {
    }

    private static boolean isLikeVCardDate(CharSequence charSequence) {
    }

    public static List<String> matchSingleVCardPrefixedField(CharSequence charSequence, String str, boolean z, boolean z2) {
    }

    public static List<List<String>> matchVCardPrefixedField(CharSequence charSequence, String str, boolean z, boolean z2) {
    }

    private static void maybeAppendComponent(String[] strArr, int i2, StringBuilder sb) {
    }

    private static void maybeAppendFragment(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb) {
    }

    private static String toPrimaryValue(List<String> list) {
    }

    private static String[] toPrimaryValues(Collection<List<String>> collection) {
    }

    private static String[] toTypes(Collection<List<String>> collection) {
    }

    @Override // com.sobot.chat.widget.zxing.client.result.ResultParser
    public /* bridge */ /* synthetic */ ParsedResult parse(Result result) {
    }

    @Override // com.sobot.chat.widget.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
    }
}
