package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConnectionSpec.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000 +2\u00020\u0001:\u0002,+B9\b\u0000\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010%\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0004\b)\u0010*J\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0019\u0010#\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0011R\u001b\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8G@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u001b\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b8G@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0012\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b\u0012\u0010\u0011¨\u0006-"}, d2 = {"Lokhttp3/ConnectionSpec;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "isFallback", "supportedSpec", "(Ljavax/net/ssl/SSLSocket;Z)Lokhttp3/ConnectionSpec;", "", "Lokhttp3/CipherSuite;", "-deprecated_cipherSuites", "()Ljava/util/List;", "cipherSuites", "Lokhttp3/TlsVersion;", "-deprecated_tlsVersions", "tlsVersions", "-deprecated_supportsTlsExtensions", "()Z", "supportsTlsExtensions", "", "apply$okhttp", "(Ljavax/net/ssl/SSLSocket;Z)V", "apply", "socket", "isCompatible", "(Ljavax/net/ssl/SSLSocket;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isTls", "Z", "", "tlsVersionsAsString", "[Ljava/lang/String;", "cipherSuitesAsString", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class ConnectionSpec {
    private static final CipherSuite[] APPROVED_CIPHER_SUITES;
    @JvmField
    @NotNull
    public static final ConnectionSpec CLEARTEXT;
    @JvmField
    @NotNull
    public static final ConnectionSpec COMPATIBLE_TLS;
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final ConnectionSpec MODERN_TLS;
    private static final CipherSuite[] RESTRICTED_CIPHER_SUITES;
    @JvmField
    @NotNull
    public static final ConnectionSpec RESTRICTED_TLS;
    private final String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    private final String[] tlsVersionsAsString;

    /* compiled from: ConnectionSpec.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b#\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0011¢\u0006\u0004\b#\u0010%J\r\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0004\"\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\r\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u0003J!\u0010\f\u001a\u00020\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0004\"\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0004\"\u00020\b¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001e¨\u0006&"}, d2 = {"Lokhttp3/ConnectionSpec$Builder;", "", "allEnabledCipherSuites", "()Lokhttp3/ConnectionSpec$Builder;", "", "Lokhttp3/CipherSuite;", "cipherSuites", "([Lokhttp3/CipherSuite;)Lokhttp3/ConnectionSpec$Builder;", "", "([Ljava/lang/String;)Lokhttp3/ConnectionSpec$Builder;", "allEnabledTlsVersions", "Lokhttp3/TlsVersion;", "tlsVersions", "([Lokhttp3/TlsVersion;)Lokhttp3/ConnectionSpec$Builder;", "", "supportsTlsExtensions", "(Z)Lokhttp3/ConnectionSpec$Builder;", "Lokhttp3/ConnectionSpec;", "build", "()Lokhttp3/ConnectionSpec;", "[Ljava/lang/String;", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "tls", "Z", "getTls$okhttp", "()Z", "setTls$okhttp", "(Z)V", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "getSupportsTlsExtensions$okhttp", "setSupportsTlsExtensions$okhttp", "<init>", "connectionSpec", "(Lokhttp3/ConnectionSpec;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Builder {
        @Nullable
        private String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        @Nullable
        private String[] tlsVersions;

        public Builder(boolean z) {
            this.tls = z;
        }

        @NotNull
        public final Builder allEnabledCipherSuites() {
            if (this.tls) {
                this.cipherSuites = null;
                return this;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @NotNull
        public final Builder allEnabledTlsVersions() {
            if (this.tls) {
                this.tlsVersions = null;
                return this;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        @NotNull
        public final ConnectionSpec build() {
            return new ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        @NotNull
        public final Builder cipherSuites(@NotNull CipherSuite... cipherSuiteArr) {
            if (this.tls) {
                ArrayList arrayList = new ArrayList(cipherSuiteArr.length);
                for (CipherSuite cipherSuite : cipherSuiteArr) {
                    arrayList.add(cipherSuite.javaName());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return cipherSuites((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @Nullable
        public final String[] getCipherSuites$okhttp() {
            return this.cipherSuites;
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
            return this.supportsTlsExtensions;
        }

        public final boolean getTls$okhttp() {
            return this.tls;
        }

        @Nullable
        public final String[] getTlsVersions$okhttp() {
            return this.tlsVersions;
        }

        public final void setCipherSuites$okhttp(@Nullable String[] strArr) {
            this.cipherSuites = strArr;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z) {
            this.supportsTlsExtensions = z;
        }

        public final void setTls$okhttp(boolean z) {
            this.tls = z;
        }

        public final void setTlsVersions$okhttp(@Nullable String[] strArr) {
            this.tlsVersions = strArr;
        }

        @Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @NotNull
        public final Builder supportsTlsExtensions(boolean z) {
            if (this.tls) {
                this.supportsTlsExtensions = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        @NotNull
        public final Builder tlsVersions(@NotNull TlsVersion... tlsVersionArr) {
            if (this.tls) {
                ArrayList arrayList = new ArrayList(tlsVersionArr.length);
                for (TlsVersion tlsVersion : tlsVersionArr) {
                    arrayList.add(tlsVersion.javaName());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return tlsVersions((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public Builder(@NotNull ConnectionSpec connectionSpec) {
            this.tls = connectionSpec.isTls();
            this.cipherSuites = connectionSpec.cipherSuitesAsString;
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions();
        }

        @NotNull
        public final Builder cipherSuites(@NotNull String... strArr) {
            if (this.tls) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.cipherSuites = (String[]) clone;
                        return this;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @NotNull
        public final Builder tlsVersions(@NotNull String... strArr) {
            if (this.tls) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.tlsVersions = (String[]) clone;
                        return this;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
    }

    /* compiled from: ConnectionSpec.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lokhttp3/ConnectionSpec$Companion;", "", "", "Lokhttp3/CipherSuite;", "APPROVED_CIPHER_SUITES", "[Lokhttp3/CipherSuite;", "Lokhttp3/ConnectionSpec;", "CLEARTEXT", "Lokhttp3/ConnectionSpec;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        CipherSuite cipherSuite = CipherSuite.TLS_AES_128_GCM_SHA256;
        CipherSuite cipherSuite2 = CipherSuite.TLS_AES_256_GCM_SHA384;
        CipherSuite cipherSuite3 = CipherSuite.TLS_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite4 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite5 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite6 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite7 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite8 = CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite9 = CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        RESTRICTED_CIPHER_SUITES = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        APPROVED_CIPHER_SUITES = cipherSuiteArr2;
        Builder cipherSuites = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        RESTRICTED_TLS = cipherSuites.tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
        MODERN_TLS = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
        COMPATIBLE_TLS = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
        CLEARTEXT = new Builder(false).build();
    }

    public ConnectionSpec(boolean z, boolean z2, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.isTls = z;
        this.supportsTlsExtensions = z2;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    private final ConnectionSpec supportedSpec(SSLSocket sSLSocket, boolean z) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.cipherSuitesAsString != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkExpressionValueIsNotNull(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = Util.intersect(enabledCipherSuites, this.cipherSuitesAsString, CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.checkExpressionValueIsNotNull(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = Util.intersect(enabledProtocols, this.tlsVersionsAsString, ComparisonsKt__ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkExpressionValueIsNotNull(supportedCipherSuites, "supportedCipherSuites");
        int indexOf = Util.indexOf(supportedCipherSuites, "TLS_FALLBACK_SCSV", CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        if (z && indexOf != -1) {
            Intrinsics.checkExpressionValueIsNotNull(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[indexOf];
            Intrinsics.checkExpressionValueIsNotNull(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = Util.concat(cipherSuitesIntersection, str);
        }
        Builder builder = new Builder(this);
        Intrinsics.checkExpressionValueIsNotNull(cipherSuitesIntersection, "cipherSuitesIntersection");
        Builder cipherSuites = builder.cipherSuites((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkExpressionValueIsNotNull(tlsVersionsIntersection, "tlsVersionsIntersection");
        return cipherSuites.tlsVersions((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).build();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cipherSuites", imports = {}))
    @JvmName(name = "-deprecated_cipherSuites")
    @Nullable
    /* renamed from: -deprecated_cipherSuites  reason: not valid java name */
    public final List<CipherSuite> m1502deprecated_cipherSuites() {
        return cipherSuites();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "supportsTlsExtensions", imports = {}))
    @JvmName(name = "-deprecated_supportsTlsExtensions")
    /* renamed from: -deprecated_supportsTlsExtensions  reason: not valid java name */
    public final boolean m1503deprecated_supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "tlsVersions", imports = {}))
    @JvmName(name = "-deprecated_tlsVersions")
    @Nullable
    /* renamed from: -deprecated_tlsVersions  reason: not valid java name */
    public final List<TlsVersion> m1504deprecated_tlsVersions() {
        return tlsVersions();
    }

    public final void apply$okhttp(@NotNull SSLSocket sSLSocket, boolean z) {
        ConnectionSpec supportedSpec = supportedSpec(sSLSocket, z);
        if (supportedSpec.tlsVersions() != null) {
            sSLSocket.setEnabledProtocols(supportedSpec.tlsVersionsAsString);
        }
        if (supportedSpec.cipherSuites() != null) {
            sSLSocket.setEnabledCipherSuites(supportedSpec.cipherSuitesAsString);
        }
    }

    @JvmName(name = "cipherSuites")
    @Nullable
    public final List<CipherSuite> cipherSuites() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(CipherSuite.Companion.forJavaName(str));
            }
            return CollectionsKt___CollectionsKt.toList(arrayList);
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ConnectionSpec) {
            if (obj == this) {
                return true;
            }
            boolean z = this.isTls;
            ConnectionSpec connectionSpec = (ConnectionSpec) obj;
            if (z != connectionSpec.isTls) {
                return false;
            }
            return !z || (Arrays.equals(this.cipherSuitesAsString, connectionSpec.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, connectionSpec.tlsVersionsAsString) && this.supportsTlsExtensions == connectionSpec.supportsTlsExtensions);
        }
        return false;
    }

    public int hashCode() {
        if (this.isTls) {
            String[] strArr = this.cipherSuitesAsString;
            int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
            String[] strArr2 = this.tlsVersionsAsString;
            return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
        }
        return 17;
    }

    public final boolean isCompatible(@NotNull SSLSocket sSLSocket) {
        if (this.isTls) {
            String[] strArr = this.tlsVersionsAsString;
            if (strArr == null || Util.hasIntersection(strArr, sSLSocket.getEnabledProtocols(), ComparisonsKt__ComparisonsKt.naturalOrder())) {
                String[] strArr2 = this.cipherSuitesAsString;
                return strArr2 == null || Util.hasIntersection(strArr2, sSLSocket.getEnabledCipherSuites(), CipherSuite.Companion.getORDER_BY_NAME$okhttp());
            }
            return false;
        }
        return false;
    }

    @JvmName(name = "isTls")
    public final boolean isTls() {
        return this.isTls;
    }

    @JvmName(name = "supportsTlsExtensions")
    public final boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    @JvmName(name = "tlsVersions")
    @Nullable
    public final List<TlsVersion> tlsVersions() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(TlsVersion.Companion.forJavaName(str));
            }
            return CollectionsKt___CollectionsKt.toList(arrayList);
        }
        return null;
    }

    @NotNull
    public String toString() {
        if (this.isTls) {
            return "ConnectionSpec(cipherSuites=" + Objects.toString(cipherSuites(), "[all enabled]") + ", tlsVersions=" + Objects.toString(tlsVersions(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
        }
        return "ConnectionSpec()";
    }
}
