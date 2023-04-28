package com.sobot.chat.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import com.sobot.chat.core.HttpUtils;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class HtmlTools {
    public static final Pattern EMAIL_ADDRESS = null;
    public static final Pattern EMOJI = null;
    public static final Pattern EMOJI_NUMBERS = null;
    public static final String GOOD_IRI_CHAR = "a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef";
    public static Pattern PHONE_NUMBER = null;
    public static final String TOP_LEVEL_DOMAIN_STR_FOR_WEB_URL = "(?:(?:aero|arpa|asia|a[cdefgilmnoqrstuwxz])|(?:biz|b[abdefghijmnorstvwyz])|(?:cat|com|coop|c[acdfghiklmnoruvxyz])|d[ejkmoz]|(?:edu|e[cegrstu])|f[ijkmor]|(?:gov|g[abdefghilmnpqrstuwy])|h[kmnrtu]|(?:info|int|i[delmnoqrst])|(?:jobs|j[emop])|k[eghimnprwyz]|l[abcikrstuvy]|(?:mil|mobi|museum|m[acdeghklmnopqrstuvwxyz])|(?:name|net|n[acefgilopruz])|(?:org|om)|(?:pro|p[aefghklmnrstwy])|qa|r[eosuw]|s[abcdeghijklmnortuvyz]|(?:tel|travel|t[cdfghjklmnoprtvwz])|u[agksyz]|v[aceginu]|w[fs]|(?:δοκιμή|испытание|рф|срб|טעסט|آزمایشی|إختبار|الاردن|الجزائر|السعودية|المغرب|امارات|بھارت|تونس|سورية|فلسطين|قطر|مصر|परीक्षा|भारत|ভারত|ਭਾਰਤ|ભારત|இந்தியா|இலங்கை|சிங்கப்பூர்|பரிட்சை|భారత్|ලංකා|ไทย|テスト|中国|中國|台湾|台灣|新加坡|测试|測試|香港|테스트|한국|xn\\-\\-0zwm56d|xn\\-\\-11b5bs3a9aj6g|xn\\-\\-3e0b707e|xn\\-\\-45brj9c|xn\\-\\-80akhbyknj4f|xn\\-\\-90a3ac|xn\\-\\-9t4b11yi5a|xn\\-\\-clchc0ea0b2g2a9gcd|xn\\-\\-deba0ad|xn\\-\\-fiqs8s|xn\\-\\-fiqz9s|xn\\-\\-fpcrj9c3d|xn\\-\\-fzc2c9e2c|xn\\-\\-g6w251d|xn\\-\\-gecrj9c|xn\\-\\-h2brj9c|xn\\-\\-hgbk6aj7f53bba|xn\\-\\-hlcj6aya9esc7a|xn\\-\\-j6w193g|xn\\-\\-jxalpdlp|xn\\-\\-kgbechtv|xn\\-\\-kprw13d|xn\\-\\-kpry57d|xn\\-\\-lgbbat1ad8j|xn\\-\\-mgbaam7a8h|xn\\-\\-mgbayh7gpa|xn\\-\\-mgbbh1a71e|xn\\-\\-mgbc0a9azcg|xn\\-\\-mgberp4a5d4ar|xn\\-\\-o3cw4h|xn\\-\\-ogbpf8fl|xn\\-\\-p1ai|xn\\-\\-pgbs0dh|xn\\-\\-s9brj9c|xn\\-\\-wgbh1c|xn\\-\\-wgbl6a|xn\\-\\-xkc2al3hye2a|xn\\-\\-xkc2dl3a5ee0h|xn\\-\\-yfro4i67o|xn\\-\\-ygbi2ammx|xn\\-\\-zckzah|xxx)|y[et]|z[amw]))";
    public static final Pattern WEB_URL = null;
    public static final Pattern WEB_URL2 = null;
    public static Pattern WEB_URL3;
    private static HtmlTools instance;
    private Context context;
    private String textImagePath;

    /* renamed from: com.sobot.chat.utils.HtmlTools$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements HttpUtils.FileCallBack {
        public final /* synthetic */ HtmlTools this$0;
        public final /* synthetic */ int val$color;
        public final /* synthetic */ String val$htmlContent;
        public final /* synthetic */ TextView val$textView;

        public AnonymousClass1(HtmlTools htmlTools, TextView textView, String str, int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void inProgress(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void onError(Exception exc, String str, int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void onResponse(File file) {
        }
    }

    /* renamed from: com.sobot.chat.utils.HtmlTools$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements Html.ImageGetter {
        public final /* synthetic */ HtmlTools this$0;
        public final /* synthetic */ int val$color;
        public final /* synthetic */ String val$htmlContent;
        public final /* synthetic */ TextView val$textView;

        public AnonymousClass2(HtmlTools htmlTools, TextView textView, String str, int i2) {
        }

        @Override // android.text.Html.ImageGetter
        public Drawable getDrawable(String str) {
        }
    }

    private HtmlTools(Context context) {
    }

    public static /* synthetic */ String access$000(HtmlTools htmlTools) {
    }

    public static HtmlTools getInstance(Context context) {
    }

    public static Pattern getPhoneNumberPattern() {
    }

    public static Pattern getWebUrl() {
    }

    public static boolean isHasPatterns(String str) {
    }

    public static void parseLinkText(Context context, TextView textView, Spanned spanned, int i2, boolean z) {
    }

    public static void setPhoneNumberPattern(Pattern pattern) {
    }

    public static void setWebUrl(Pattern pattern) {
    }

    public Spanned formatRichTextWithPic(TextView textView, String str, int i2) {
    }

    public String getHTMLStr(String str) {
    }

    public void loadPic(TextView textView, String str, String str2, String str3, int i2) {
    }

    public void setRichText(TextView textView, String str, int i2, boolean z) {
    }

    public void setRichTextViewText(TextView textView, String str, int i2) {
    }

    public void setRichText(TextView textView, String str, int i2) {
    }
}
