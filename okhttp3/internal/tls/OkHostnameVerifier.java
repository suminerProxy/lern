package okhttp3.internal.tls;

import com.alipay.sdk.cons.c;
import com.umeng.analytics.pro.d;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

/* compiled from: OkHostnameVerifier.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ#\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\fJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\bJ\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "", "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", "", "verifyIpAddress", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "hostname", "verifyHostname", "pattern", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "type", "", "getSubjectAltNames", "(Ljava/security/cert/X509Certificate;I)Ljava/util/List;", c.f675f, "Ljavax/net/ssl/SSLSession;", d.aw, "verify", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "allSubjectAltNames", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "ALT_DNS_NAME", "I", "ALT_IPA_NAME", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i2) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && !(!Intrinsics.areEqual(list.get(0), Integer.valueOf(i2))) && (obj = list.get(1)) != null) {
                        if (obj == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                        }
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
            return CollectionsKt__CollectionsKt.emptyList();
        } catch (CertificateParsingException unused) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        Locale locale = Locale.US;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
            if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
                return false;
            }
            for (String str2 : subjectAltNames) {
                if (INSTANCE.verifyHostname(lowerCase, str2)) {
                    return true;
                }
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        for (String str2 : subjectAltNames) {
            if (Intrinsics.areEqual(canonicalHost, HostnamesKt.toCanonicalHost(str2))) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<String> allSubjectAltNames(@NotNull X509Certificate x509Certificate) {
        return CollectionsKt___CollectionsKt.plus((Collection) getSubjectAltNames(x509Certificate, 7), (Iterable) getSubjectAltNames(x509Certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@NotNull String str, @NotNull SSLSession sSLSession) {
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return verify(str, (X509Certificate) certificate);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(@NotNull String str, @NotNull X509Certificate x509Certificate) {
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        if (!(str == null || str.length() == 0) && !StringsKt__StringsJVMKt.startsWith$default(str, ".", false, 2, null) && !StringsKt__StringsJVMKt.endsWith$default(str, "..", false, 2, null)) {
            if (!(str2 == null || str2.length() == 0) && !StringsKt__StringsJVMKt.startsWith$default(str2, ".", false, 2, null) && !StringsKt__StringsJVMKt.endsWith$default(str2, "..", false, 2, null)) {
                if (!StringsKt__StringsJVMKt.endsWith$default(str, ".", false, 2, null)) {
                    str = str + ".";
                }
                String str3 = str;
                if (!StringsKt__StringsJVMKt.endsWith$default(str2, ".", false, 2, null)) {
                    str2 = str2 + ".";
                }
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                if (str2 != null) {
                    String lowerCase = str2.toLowerCase(locale);
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (!StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "*", false, 2, (Object) null)) {
                        return Intrinsics.areEqual(str3, lowerCase);
                    }
                    if (!StringsKt__StringsJVMKt.startsWith$default(lowerCase, "*.", false, 2, null) || StringsKt__StringsKt.indexOf$default((CharSequence) lowerCase, '*', 1, false, 4, (Object) null) != -1 || str3.length() < lowerCase.length() || Intrinsics.areEqual("*.", lowerCase)) {
                        return false;
                    }
                    if (lowerCase != null) {
                        String substring = lowerCase.substring(1);
                        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                        if (StringsKt__StringsJVMKt.endsWith$default(str3, substring, false, 2, null)) {
                            int length = str3.length() - substring.length();
                            return length <= 0 || StringsKt__StringsKt.lastIndexOf$default((CharSequence) str3, '.', length + (-1), false, 4, (Object) null) == -1;
                        }
                        return false;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }
}
