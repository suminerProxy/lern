package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RtspMessageUtil {
    private static final Pattern CONTENT_LENGTH_HEADER_PATTERN = null;
    private static final String CRLF = null;
    public static final long DEFAULT_RTSP_TIMEOUT_MS = 60000;
    private static final String LF = null;
    private static final Pattern REQUEST_LINE_PATTERN = null;
    private static final String RTSP_VERSION = "RTSP/1.0";
    private static final Pattern SESSION_HEADER_PATTERN = null;
    private static final Pattern STATUS_LINE_PATTERN = null;
    private static final Pattern WWW_AUTHENTICATION_HEADER_BASIC_PATTERN = null;
    private static final Pattern WWW_AUTHENTICATION_HEADER_DIGEST_PATTERN = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RtspAuthUserInfo {
        public final String password;
        public final String username;

        public RtspAuthUserInfo(String username, String password) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RtspSessionHeader {
        public final String sessionId;
        public final long timeoutMs;

        public RtspSessionHeader(String sessionId, long timeoutMs) {
        }
    }

    private RtspMessageUtil() {
    }

    public static byte[] convertMessageToByteArray(List<String> message) {
    }

    private static String getRtspStatusReasonPhrase(int statusCode) {
    }

    public static byte[] getStringBytes(String s) {
    }

    public static boolean isRtspStartLine(String line) {
    }

    public static long parseContentLengthHeader(String line) throws ParserException {
    }

    public static int parseInt(String intString) throws ParserException {
    }

    private static int parseMethodString(String method) {
    }

    public static ImmutableList<Integer> parsePublicHeader(@Nullable String publicHeader) {
    }

    public static RtspRequest parseRequest(List<String> lines) {
    }

    public static RtspResponse parseResponse(List<String> lines) {
    }

    public static RtspSessionHeader parseSessionHeader(String headerValue) throws ParserException {
    }

    @Nullable
    public static RtspAuthUserInfo parseUserInfo(Uri uri) {
    }

    public static RtspAuthenticationInfo parseWwwAuthenticateHeader(String headerValue) throws ParserException {
    }

    public static Uri removeUserInfo(Uri uri) {
    }

    public static ImmutableList<String> serializeRequest(RtspRequest request) {
    }

    public static ImmutableList<String> serializeResponse(RtspResponse response) {
    }

    public static String[] splitRtspMessageBody(String body) {
    }

    public static String toMethodString(int method) {
    }
}
