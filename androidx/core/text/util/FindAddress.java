package androidx.core.text.util;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FindAddress {
    private static final String HOUSE_COMPONENT = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";
    private static final String HOUSE_END = "(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";
    private static final String HOUSE_POST_DELIM = ",\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final String HOUSE_PRE_DELIM = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final int MAX_ADDRESS_LINES = 5;
    private static final int MAX_ADDRESS_WORDS = 14;
    private static final int MAX_LOCATION_NAME_DISTANCE = 5;
    private static final int MIN_ADDRESS_WORDS = 4;
    private static final String NL = "\n\u000b\f\r\u0085\u2028\u2029";
    private static final String SP = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000";
    private static final String WORD_DELIM = ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final String WORD_END = "(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";
    private static final String WS = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final int kMaxAddressNameWordLength = 25;
    private static final Pattern sHouseNumberRe = null;
    private static final Pattern sLocationNameRe = null;
    private static final Pattern sStateRe = null;
    private static final ZipRange[] sStateZipCodeRanges = null;
    private static final Pattern sSuffixedNumberRe = null;
    private static final Pattern sWordRe = null;
    private static final Pattern sZipCodeRe = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ZipRange {
        public int mException1;
        public int mException2;
        public int mHigh;
        public int mLow;

        public ZipRange(int i2, int i3, int i4, int i5) {
        }

        public boolean matches(String str) {
        }
    }

    private FindAddress() {
    }

    private static int attemptMatch(String str, MatchResult matchResult) {
    }

    private static boolean checkHouseNumber(String str) {
    }

    public static String findAddress(String str) {
    }

    @VisibleForTesting
    public static boolean isValidLocationName(String str) {
    }

    private static boolean isValidZipCode(String str, MatchResult matchResult) {
    }

    @VisibleForTesting
    public static MatchResult matchHouseNumber(String str, int i2) {
    }

    @VisibleForTesting
    public static MatchResult matchState(String str, int i2) {
    }

    @VisibleForTesting
    public static boolean isValidZipCode(String str, String str2) {
    }

    @VisibleForTesting
    public static boolean isValidZipCode(String str) {
    }
}
