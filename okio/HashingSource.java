package okio;

import com.tencent.android.tpush.common.MessageKey;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import java.io.IOException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: HashingSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B!\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0019J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u00020\b8G@\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lokio/HashingSource;", "Lokio/ForwardingSource;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/ByteString;", "-deprecated_hash", "()Lokio/ByteString;", "hash", "Ljava/security/MessageDigest;", "messageDigest", "Ljava/security/MessageDigest;", "Ljavax/crypto/Mac;", TPDownloadProxyEnum.USER_MAC, "Ljavax/crypto/Mac;", "Lokio/Source;", MessageKey.MSG_SOURCE, "", "algorithm", "<init>", "(Lokio/Source;Ljava/lang/String;)V", "key", "(Lokio/Source;Lokio/ByteString;Ljava/lang/String;)V", "Companion", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class HashingSource extends ForwardingSource {
    public static final Companion Companion = null;
    private final Mac mac;
    private final MessageDigest messageDigest;

    /* compiled from: HashingSource.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lokio/HashingSource$Companion;", "", "Lokio/Source;", MessageKey.MSG_SOURCE, "Lokio/HashingSource;", "md5", "(Lokio/Source;)Lokio/HashingSource;", "sha1", "sha256", "sha512", "Lokio/ByteString;", "key", "hmacSha1", "(Lokio/Source;Lokio/ByteString;)Lokio/HashingSource;", "hmacSha256", "hmacSha512", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final HashingSource hmacSha1(@NotNull Source source, @NotNull ByteString byteString) {
        }

        @JvmStatic
        @NotNull
        public final HashingSource hmacSha256(@NotNull Source source, @NotNull ByteString byteString) {
        }

        @JvmStatic
        @NotNull
        public final HashingSource hmacSha512(@NotNull Source source, @NotNull ByteString byteString) {
        }

        @JvmStatic
        @NotNull
        public final HashingSource md5(@NotNull Source source) {
        }

        @JvmStatic
        @NotNull
        public final HashingSource sha1(@NotNull Source source) {
        }

        @JvmStatic
        @NotNull
        public final HashingSource sha256(@NotNull Source source) {
        }

        @JvmStatic
        @NotNull
        public final HashingSource sha512(@NotNull Source source) {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public HashingSource(@NotNull Source source, @NotNull String str) {
    }

    @JvmStatic
    @NotNull
    public static final HashingSource hmacSha1(@NotNull Source source, @NotNull ByteString byteString) {
    }

    @JvmStatic
    @NotNull
    public static final HashingSource hmacSha256(@NotNull Source source, @NotNull ByteString byteString) {
    }

    @JvmStatic
    @NotNull
    public static final HashingSource hmacSha512(@NotNull Source source, @NotNull ByteString byteString) {
    }

    @JvmStatic
    @NotNull
    public static final HashingSource md5(@NotNull Source source) {
    }

    @JvmStatic
    @NotNull
    public static final HashingSource sha1(@NotNull Source source) {
    }

    @JvmStatic
    @NotNull
    public static final HashingSource sha256(@NotNull Source source) {
    }

    @JvmStatic
    @NotNull
    public static final HashingSource sha512(@NotNull Source source) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hash", imports = {}))
    @JvmName(name = "-deprecated_hash")
    @NotNull
    /* renamed from: -deprecated_hash  reason: not valid java name */
    public final ByteString m1628deprecated_hash() {
    }

    @JvmName(name = "hash")
    @NotNull
    public final ByteString hash() {
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(@NotNull Buffer buffer, long j2) throws IOException {
    }

    public HashingSource(@NotNull Source source, @NotNull ByteString byteString, @NotNull String str) {
    }
}
