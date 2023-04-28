package com.tencent.liteav.base;

import com.tencent.liteav.base.annotations.UsedByReflection;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class PiiElider {
    private static final String[] APP_NAMESPACE = null;
    private static final String CONSOLE_ELISION = "[ELIDED:CONSOLE(0)] ELIDED CONSOLE MESSAGE";
    private static final Pattern CONSOLE_MSG = null;
    private static final Pattern DOMAIN_NAME = null;
    private static final String EMAIL_ELISION = "XXX@EMAIL.ELIDED";
    private static final String GOOD_GTLD_CHAR = "a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef";
    private static final String GOOD_IRI_CHAR = "a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef";
    private static final String GTLD = "[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}";
    private static final String HOST_NAME = "([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}";
    private static final Pattern IP_ADDRESS = null;
    private static final String IP_ELISION = "1.2.3.4";
    private static final String IRI = "[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}";
    private static final Pattern LIKELY_EXCEPTION_LOG = null;
    private static final Pattern MAC_ADDRESS = null;
    private static final String MAC_ELISION = "01:23:45:67:89:AB";
    private static final String[] SYSTEM_NAMESPACE = null;
    private static final String URL_ELISION = "HTTP://WEBADDRESS.ELIDED";
    private static final Pattern WEB_URL = null;

    public static String elideConsole(String str) {
    }

    public static String elideEmail(String str) {
    }

    public static String elideIp(String str) {
    }

    public static String elideMac(String str) {
    }

    public static String elideUrl(String str) {
    }

    private static boolean likelyToBeAppNamespace(String str) {
    }

    private static boolean likelyToBeSystemNamespace(String str) {
    }

    @UsedByReflection("jni_android.cc")
    public static String sanitizeStacktrace(String str) {
    }
}
