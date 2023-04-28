package com.sobot.chat.widget.zxing.client.result;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class ParsedResult {
    private final ParsedResultType type;

    public ParsedResult(ParsedResultType parsedResultType) {
    }

    public static void maybeAppend(String str, StringBuilder sb) {
    }

    public abstract String getDisplayResult();

    public final ParsedResultType getType() {
    }

    public final String toString() {
    }

    public static void maybeAppend(String[] strArr, StringBuilder sb) {
    }
}
