package h.y.a.n;

import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RSAUtils.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fJ\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0007J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0007J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0002J\u0014\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Lcom/taihebase/activity/utils/RSAUtils;", "", "()V", "ciperLocal", "Ljava/lang/ThreadLocal;", "Ljavax/crypto/Cipher;", "forCipher", "getForCipher", "()Ljavax/crypto/Cipher;", "forKeyFactory", "Ljava/security/KeyFactory;", "getForKeyFactory", "()Ljava/security/KeyFactory;", "keyFactoryLocal", "keys", "", "getKeys", "()Ljava/lang/String;", "decryptDataByPrivatekey", "text", "privateKey", "decryptDataByPublickey", "publicKey", "doFinalData", "", "cipher", "bytes", "encryptDataByPrivatekey", "encryptDataByPublickey", "getRSAPrivateKey", "Ljava/security/interfaces/RSAPrivateKey;", "getRSAPublicKey", "Ljava/security/interfaces/RSAPublicKey;", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class r0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f26358a = null;
    @NotNull
    private static final String b = null;
    @NotNull
    private static final ThreadLocal<Cipher> c = null;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<KeyFactory> f26359d = null;

    private r0() {
    }

    @JvmStatic
    @NotNull
    public static final String b(@NotNull String str, @NotNull String str2) {
    }

    private final byte[] c(Cipher cipher, byte[] bArr) {
    }

    @JvmStatic
    @Nullable
    public static final String d(@NotNull String str, @NotNull String str2) {
    }

    @JvmStatic
    @Nullable
    public static final String e(@NotNull String str, @NotNull String str2) {
    }

    private final Cipher f() {
    }

    private final KeyFactory g() {
    }

    private final RSAPrivateKey i(String str) {
    }

    private final RSAPublicKey j(String str) {
    }

    @NotNull
    public final String a(@NotNull String str, @NotNull String str2) {
    }

    @NotNull
    public final String h() {
    }
}
