package com.sobot.chat.widget.zxing.client.result;

import com.sobot.chat.widget.zxing.Result;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class URIResultParser extends ResultParser {
    private static final Pattern ALLOWED_URI_CHARS_PATTERN = null;
    private static final Pattern URL_WITHOUT_PROTOCOL_PATTERN = null;
    private static final Pattern URL_WITH_PROTOCOL_PATTERN = null;
    private static final Pattern USER_IN_HOST = null;

    public static boolean isBasicallyValidURI(String str) {
    }

    public static boolean isPossiblyMaliciousURI(String str) {
    }

    @Override // com.sobot.chat.widget.zxing.client.result.ResultParser
    public /* bridge */ /* synthetic */ ParsedResult parse(Result result) {
    }

    @Override // com.sobot.chat.widget.zxing.client.result.ResultParser
    public URIParsedResult parse(Result result) {
    }
}
