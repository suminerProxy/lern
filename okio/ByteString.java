package okio;

import com.baidu.platform.comapi.map.MapBundleKey;
import com.tencent.android.tpush.common.Constants;
import h.a.a.a.a.i.g;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.internal.ByteStringKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteString.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0016\u0018\u0000 r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001rB\u0011\b\u0000\u0012\u0006\u0010i\u001a\u000209¢\u0006\u0004\bp\u0010qJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\fH\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0016¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010$\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010\u000eJ\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\u000eJ\u000f\u0010'\u001a\u00020\u0000H\u0016¢\u0006\u0004\b'\u0010\u0015J\u000f\u0010(\u001a\u00020\u0000H\u0016¢\u0006\u0004\b(\u0010\u0015J#\u0010,\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)H\u0017¢\u0006\u0004\b,\u0010-J\u0017\u00102\u001a\u00020/2\u0006\u0010.\u001a\u00020)H\u0010¢\u0006\u0004\b0\u00101J\u0018\u00105\u001a\u00020/2\u0006\u00103\u001a\u00020)H\u0087\u0002¢\u0006\u0004\b4\u00101J\u000f\u00108\u001a\u00020)H\u0010¢\u0006\u0004\b6\u00107J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u000209H\u0010¢\u0006\u0004\b<\u0010;J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ'\u0010B\u001a\u00020\u00052\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020)2\u0006\u0010G\u001a\u00020)H\u0010¢\u0006\u0004\bH\u0010IJ/\u0010M\u001a\u00020L2\u0006\u0010F\u001a\u00020)2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020)2\u0006\u0010G\u001a\u00020)H\u0016¢\u0006\u0004\bM\u0010NJ/\u0010M\u001a\u00020L2\u0006\u0010F\u001a\u00020)2\u0006\u0010J\u001a\u0002092\u0006\u0010K\u001a\u00020)2\u0006\u0010G\u001a\u00020)H\u0016¢\u0006\u0004\bM\u0010OJ\u0015\u0010Q\u001a\u00020L2\u0006\u0010P\u001a\u00020\u0000¢\u0006\u0004\bQ\u0010RJ\u0015\u0010Q\u001a\u00020L2\u0006\u0010P\u001a\u000209¢\u0006\u0004\bQ\u0010SJ\u0015\u0010U\u001a\u00020L2\u0006\u0010T\u001a\u00020\u0000¢\u0006\u0004\bU\u0010RJ\u0015\u0010U\u001a\u00020L2\u0006\u0010T\u001a\u000209¢\u0006\u0004\bU\u0010SJ!\u0010W\u001a\u00020)2\u0006\u0010J\u001a\u00020\u00002\b\b\u0002\u0010V\u001a\u00020)H\u0007¢\u0006\u0004\bW\u0010XJ!\u0010W\u001a\u00020)2\u0006\u0010J\u001a\u0002092\b\b\u0002\u0010V\u001a\u00020)H\u0017¢\u0006\u0004\bW\u0010YJ!\u0010Z\u001a\u00020)2\u0006\u0010J\u001a\u00020\u00002\b\b\u0002\u0010V\u001a\u00020)H\u0007¢\u0006\u0004\bZ\u0010XJ!\u0010Z\u001a\u00020)2\u0006\u0010J\u001a\u0002092\b\b\u0002\u0010V\u001a\u00020)H\u0017¢\u0006\u0004\bZ\u0010YJ\u001a\u0010\\\u001a\u00020L2\b\u0010J\u001a\u0004\u0018\u00010[H\u0096\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020)H\u0016¢\u0006\u0004\b^\u00107J\u0018\u0010_\u001a\u00020)2\u0006\u0010J\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\fH\u0016¢\u0006\u0004\ba\u0010\u000eJ\u0017\u00104\u001a\u00020/2\u0006\u00103\u001a\u00020)H\u0007¢\u0006\u0004\bb\u00101J\u000f\u0010d\u001a\u00020)H\u0007¢\u0006\u0004\bc\u00107R\"\u0010^\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u0010e\u001a\u0004\bf\u00107\"\u0004\bg\u0010hR\u001c\u0010i\u001a\u0002098\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010;R\u0013\u0010d\u001a\u00020)8G@\u0006¢\u0006\u0006\u001a\u0004\bd\u00107R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010l\u001a\u0004\bm\u0010\u000e\"\u0004\bn\u0010o¨\u0006s"}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "(Ljava/io/ObjectOutputStream;)V", "", "utf8", "()Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "string", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "base64", "md5", "()Lokio/ByteString;", "sha1", "sha256", "sha512", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "key", "hmacSha1", "(Lokio/ByteString;)Lokio/ByteString;", "hmacSha256", "hmacSha512", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmac", "base64Url", "hex", "toAsciiLowercase", "toAsciiUppercase", "", "beginIndex", "endIndex", "substring", "(II)Lokio/ByteString;", "pos", "", "internalGet$okio", "(I)B", "internalGet", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "getByte", "get", "getSize$okio", "()I", "getSize", "", "toByteArray", "()[B", "internalArray$okio", "internalArray", "Ljava/nio/ByteBuffer;", "asByteBuffer", "()Ljava/nio/ByteBuffer;", "Ljava/io/OutputStream;", "write", "(Ljava/io/OutputStream;)V", "Lokio/Buffer;", "buffer", Constants.FLAG_TAG_OFFSET, "byteCount", "write$okio", "(Lokio/Buffer;II)V", "other", "otherOffset", "", "rangeEquals", "(ILokio/ByteString;II)Z", "(I[BII)Z", g.f15702n, "startsWith", "(Lokio/ByteString;)Z", "([B)Z", "suffix", "endsWith", "fromIndex", "indexOf", "(Lokio/ByteString;I)I", "([BI)I", "lastIndexOf", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "compareTo", "(Lokio/ByteString;)I", "toString", "-deprecated_getByte", "-deprecated_size", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "I", "getHashCode$okio", "setHashCode$okio", "(I)V", "data", "[B", "getData$okio", "Ljava/lang/String;", "getUtf8$okio", "setUtf8$okio", "(Ljava/lang/String;)V", "<init>", "([B)V", "Companion", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    @NotNull
    private final byte[] data;
    private transient int hashCode;
    @Nullable
    private transient String utf8;

    /* compiled from: ByteString.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0006\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0005*\u00020\rH\u0007¢\u0006\u0004\b\u0006\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0005*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u0005*\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0005*\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0011J\u0013\u0010\u0018\u001a\u00020\u0005*\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0011J\u001b\u0010\u001c\u001a\u00020\u0005*\u00020\u00192\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001e\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001f\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b \u0010\u0015J\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000fH\u0007¢\u0006\u0004\b!\u0010\u0011J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\rH\u0007¢\u0006\u0004\b#\u0010\u000eJ'\u0010\u0006\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b#\u0010\u000bJ\u001f\u0010\u001a\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b&\u0010\u001bR\u0016\u0010'\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lokio/ByteString$Companion;", "", "", "", "data", "Lokio/ByteString;", MapBundleKey.MapObjKey.OBJ_OFFSET, "([B)Lokio/ByteString;", "", Constants.FLAG_TAG_OFFSET, "byteCount", "([BII)Lokio/ByteString;", "toByteString", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)Lokio/ByteString;", "", "encodeUtf8", "(Ljava/lang/String;)Lokio/ByteString;", "Ljava/nio/charset/Charset;", "charset", "encodeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/ByteString;", "encode", "decodeBase64", "decodeHex", "Ljava/io/InputStream;", "read", "(Ljava/io/InputStream;I)Lokio/ByteString;", "readByteString", "string", "-deprecated_decodeBase64", "-deprecated_decodeHex", "-deprecated_encodeString", "-deprecated_encodeUtf8", "buffer", "-deprecated_of", "array", "inputstream", "-deprecated_read", "EMPTY", "Lokio/ByteString;", "", "serialVersionUID", "J", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                charset = Charsets.UTF_8;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = bArr.length;
            }
            return companion.of(bArr, i2, i3);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @JvmName(name = "-deprecated_decodeBase64")
        @Nullable
        /* renamed from: -deprecated_decodeBase64  reason: not valid java name */
        public final ByteString m1616deprecated_decodeBase64(@NotNull String str) {
            return decodeBase64(str);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @JvmName(name = "-deprecated_decodeHex")
        @NotNull
        /* renamed from: -deprecated_decodeHex  reason: not valid java name */
        public final ByteString m1617deprecated_decodeHex(@NotNull String str) {
            return decodeHex(str);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @JvmName(name = "-deprecated_encodeString")
        @NotNull
        /* renamed from: -deprecated_encodeString  reason: not valid java name */
        public final ByteString m1618deprecated_encodeString(@NotNull String str, @NotNull Charset charset) {
            return encodeString(str, charset);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @JvmName(name = "-deprecated_encodeUtf8")
        @NotNull
        /* renamed from: -deprecated_encodeUtf8  reason: not valid java name */
        public final ByteString m1619deprecated_encodeUtf8(@NotNull String str) {
            return encodeUtf8(str);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @JvmName(name = "-deprecated_of")
        @NotNull
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final ByteString m1620deprecated_of(@NotNull ByteBuffer byteBuffer) {
            return of(byteBuffer);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @JvmName(name = "-deprecated_read")
        @NotNull
        /* renamed from: -deprecated_read  reason: not valid java name */
        public final ByteString m1622deprecated_read(@NotNull InputStream inputStream, int i2) {
            return read(inputStream, i2);
        }

        @JvmStatic
        @Nullable
        public final ByteString decodeBase64(@NotNull String str) {
            byte[] decodeBase64ToArray = Base64.decodeBase64ToArray(str);
            if (decodeBase64ToArray != null) {
                return new ByteString(decodeBase64ToArray);
            }
            return null;
        }

        @JvmStatic
        @NotNull
        public final ByteString decodeHex(@NotNull String str) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    bArr[i2] = (byte) ((ByteStringKt.access$decodeHexDigit(str.charAt(i3)) << 4) + ByteStringKt.access$decodeHexDigit(str.charAt(i3 + 1)));
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        @JvmStatic
        @JvmName(name = "encodeString")
        @NotNull
        public final ByteString encodeString(@NotNull String str, @NotNull Charset charset) {
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        @JvmStatic
        @NotNull
        public final ByteString encodeUtf8(@NotNull String str) {
            ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        @JvmStatic
        @JvmName(name = MapBundleKey.MapObjKey.OBJ_OFFSET)
        @NotNull
        public final ByteString of(@NotNull ByteBuffer byteBuffer) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        @JvmStatic
        @JvmName(name = "read")
        @NotNull
        public final ByteString read(@NotNull InputStream inputStream, int i2) throws IOException {
            int i3 = 0;
            if (i2 >= 0) {
                byte[] bArr = new byte[i2];
                while (i3 < i2) {
                    int read = inputStream.read(bArr, i3, i2 - i3);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    i3 += read;
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i2).toString());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @JvmName(name = "-deprecated_of")
        @NotNull
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final ByteString m1621deprecated_of(@NotNull byte[] bArr, int i2, int i3) {
            return of(bArr, i2, i3);
        }

        @JvmStatic
        @NotNull
        public final ByteString of(@NotNull byte... bArr) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new ByteString(copyOf);
        }

        @JvmStatic
        @JvmName(name = MapBundleKey.MapObjKey.OBJ_OFFSET)
        @NotNull
        public final ByteString of(@NotNull byte[] bArr, int i2, int i3) {
            Util.checkOffsetAndCount(bArr.length, i2, i3);
            return new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i2, i3 + i2));
        }
    }

    public ByteString(@NotNull byte[] bArr) {
        this.data = bArr;
    }

    @JvmStatic
    @Nullable
    public static final ByteString decodeBase64(@NotNull String str) {
        return Companion.decodeBase64(str);
    }

    @JvmStatic
    @NotNull
    public static final ByteString decodeHex(@NotNull String str) {
        return Companion.decodeHex(str);
    }

    @JvmStatic
    @JvmName(name = "encodeString")
    @NotNull
    public static final ByteString encodeString(@NotNull String str, @NotNull Charset charset) {
        return Companion.encodeString(str, charset);
    }

    @JvmStatic
    @NotNull
    public static final ByteString encodeUtf8(@NotNull String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return byteString.indexOf(byteString2, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return byteString.indexOf(bArr, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = byteString.size();
            }
            return byteString.lastIndexOf(byteString2, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = byteString.size();
            }
            return byteString.lastIndexOf(bArr, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    @JvmStatic
    @JvmName(name = MapBundleKey.MapObjKey.OBJ_OFFSET)
    @NotNull
    public static final ByteString of(@NotNull ByteBuffer byteBuffer) {
        return Companion.of(byteBuffer);
    }

    @JvmStatic
    @NotNull
    public static final ByteString of(@NotNull byte... bArr) {
        return Companion.of(bArr);
    }

    @JvmStatic
    @JvmName(name = MapBundleKey.MapObjKey.OBJ_OFFSET)
    @NotNull
    public static final ByteString of(@NotNull byte[] bArr, int i2, int i3) {
        return Companion.of(bArr, i2, i3);
    }

    @JvmStatic
    @JvmName(name = "read")
    @NotNull
    public static final ByteString read(@NotNull InputStream inputStream, int i2) throws IOException {
        return Companion.read(inputStream, i2);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        ByteString read = Companion.read(objectInputStream, objectInputStream.readInt());
        Field field = ByteString.class.getDeclaredField("data");
        Intrinsics.checkExpressionValueIsNotNull(field, "field");
        field.setAccessible(true);
        field.set(this, read.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = byteString.size();
            }
            return byteString.substring(i2, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}))
    @JvmName(name = "-deprecated_getByte")
    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m1614deprecated_getByte(int i2) {
        return getByte(i2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, imports = {}))
    @JvmName(name = "-deprecated_size")
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m1615deprecated_size() {
        return size();
    }

    @NotNull
    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        Intrinsics.checkExpressionValueIsNotNull(asReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    @NotNull
    public String base64() {
        return Base64.encodeBase64$default(getData$okio(), null, 1, null);
    }

    @NotNull
    public String base64Url() {
        return Base64.encodeBase64(getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    @NotNull
    public ByteString digest$okio(@NotNull String str) {
        byte[] digest = MessageDigest.getInstance(str).digest(this.data);
        Intrinsics.checkExpressionValueIsNotNull(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new ByteString(digest);
    }

    public final boolean endsWith(@NotNull ByteString byteString) {
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    @JvmName(name = "getByte")
    public final byte getByte(int i2) {
        return internalGet$okio(i2);
    }

    @NotNull
    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    @Nullable
    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(hashCode);
        return hashCode;
    }

    @NotNull
    public String hex() {
        byte[] data$okio;
        char[] cArr = new char[getData$okio().length * 2];
        int i2 = 0;
        for (byte b : getData$okio()) {
            int i3 = i2 + 1;
            cArr[i2] = ByteStringKt.getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = ByteStringKt.getHEX_DIGIT_CHARS()[b & 15];
        }
        return new String(cArr);
    }

    @NotNull
    public ByteString hmac$okio(@NotNull String str, @NotNull ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            byte[] doFinal = mac.doFinal(this.data);
            Intrinsics.checkExpressionValueIsNotNull(doFinal, "mac.doFinal(data)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @NotNull
    public ByteString hmacSha1(@NotNull ByteString byteString) {
        return hmac$okio("HmacSHA1", byteString);
    }

    @NotNull
    public ByteString hmacSha256(@NotNull ByteString byteString) {
        return hmac$okio("HmacSHA256", byteString);
    }

    @NotNull
    public ByteString hmacSha512(@NotNull ByteString byteString) {
        return hmac$okio("HmacSHA512", byteString);
    }

    @JvmOverloads
    public final int indexOf(@NotNull ByteString byteString) {
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    @JvmOverloads
    public final int indexOf(@NotNull ByteString byteString, int i2) {
        return indexOf(byteString.internalArray$okio(), i2);
    }

    @JvmOverloads
    public int indexOf(@NotNull byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    @NotNull
    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i2) {
        return getData$okio()[i2];
    }

    @JvmOverloads
    public final int lastIndexOf(@NotNull ByteString byteString) {
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    @JvmOverloads
    public final int lastIndexOf(@NotNull ByteString byteString, int i2) {
        return lastIndexOf(byteString.internalArray$okio(), i2);
    }

    @JvmOverloads
    public int lastIndexOf(@NotNull byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    @NotNull
    public ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i2, @NotNull ByteString byteString, int i3, int i4) {
        return byteString.rangeEquals(i3, getData$okio(), i2, i4);
    }

    public final void setHashCode$okio(int i2) {
        this.hashCode = i2;
    }

    public final void setUtf8$okio(@Nullable String str) {
        this.utf8 = str;
    }

    @NotNull
    public ByteString sha1() {
        return digest$okio("SHA-1");
    }

    @NotNull
    public ByteString sha256() {
        return digest$okio("SHA-256");
    }

    @NotNull
    public ByteString sha512() {
        return digest$okio("SHA-512");
    }

    @JvmName(name = MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE)
    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(@NotNull ByteString byteString) {
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    @NotNull
    public String string(@NotNull Charset charset) {
        return new String(this.data, charset);
    }

    @JvmOverloads
    @NotNull
    public ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    @JvmOverloads
    @NotNull
    public ByteString substring(int i2) {
        return substring$default(this, i2, 0, 2, null);
    }

    @JvmOverloads
    @NotNull
    public ByteString substring(int i2, int i3) {
        if (i2 >= 0) {
            if (i3 <= getData$okio().length) {
                if (i3 - i2 >= 0) {
                    return (i2 == 0 && i3 == getData$okio().length) ? this : new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(getData$okio(), i2, i3));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    @NotNull
    public ByteString toAsciiLowercase() {
        byte b;
        for (int i2 = 0; i2 < getData$okio().length; i2++) {
            byte b2 = getData$okio()[i2];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b4 = copyOf[i3];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i3] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    @NotNull
    public ByteString toAsciiUppercase() {
        byte b;
        for (int i2 = 0; i2 < getData$okio().length; i2++) {
            byte b2 = getData$okio()[i2];
            byte b3 = (byte) 97;
            if (b2 >= b3 && b2 <= (b = (byte) 122)) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i2] = (byte) (b2 - 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b4 = copyOf[i3];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i3] = (byte) (b4 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    @NotNull
    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public String toString() {
        if (getData$okio().length == 0) {
            return "[size=0]";
        }
        int access$codePointIndexToCharIndex = ByteStringKt.access$codePointIndexToCharIndex(getData$okio(), 64);
        if (access$codePointIndexToCharIndex == -1) {
            if (getData$okio().length <= 64) {
                return "[hex=" + hex() + ']';
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(getData$okio().length);
            sb.append(" hex=");
            if (64 <= getData$okio().length) {
                sb.append((64 == getData$okio().length ? this : new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(getData$okio(), 0, 64))).hex());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
        }
        String utf8 = utf8();
        if (utf8 != null) {
            String substring = utf8.substring(0, access$codePointIndexToCharIndex);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String replace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            if (access$codePointIndexToCharIndex < utf8.length()) {
                return "[size=" + getData$okio().length + " text=" + replace$default + "…]";
            }
            return "[text=" + replace$default + ']';
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio == null) {
            String utf8String = Platform.toUtf8String(internalArray$okio());
            setUtf8$okio(utf8String);
            return utf8String;
        }
        return utf8$okio;
    }

    public void write(@NotNull OutputStream outputStream) throws IOException {
        outputStream.write(this.data);
    }

    public void write$okio(@NotNull Buffer buffer, int i2, int i3) {
        ByteStringKt.commonWrite(this, buffer, i2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r0 < r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r7 < r8) goto L12;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(@org.jetbrains.annotations.NotNull okio.ByteString r10) {
        /*
            r9 = this;
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        Le:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L26
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L23
            int r4 = r4 + 1
            goto Le
        L23:
            if (r7 >= r8) goto L2d
            goto L2b
        L26:
            if (r0 != r1) goto L29
            goto L2e
        L29:
            if (r0 >= r1) goto L2d
        L2b:
            r3 = r5
            goto L2e
        L2d:
            r3 = r6
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public final boolean endsWith(@NotNull byte[] bArr) {
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    @JvmOverloads
    public int indexOf(@NotNull byte[] bArr, int i2) {
        int length = getData$okio().length - bArr.length;
        int max = Math.max(i2, 0);
        if (max <= length) {
            while (!Util.arrayRangeEquals(getData$okio(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    @JvmOverloads
    public int lastIndexOf(@NotNull byte[] bArr, int i2) {
        for (int min = Math.min(i2, getData$okio().length - bArr.length); min >= 0; min--) {
            if (Util.arrayRangeEquals(getData$okio(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean rangeEquals(int i2, @NotNull byte[] bArr, int i3, int i4) {
        return i2 >= 0 && i2 <= getData$okio().length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && Util.arrayRangeEquals(getData$okio(), i2, bArr, i3, i4);
    }

    public final boolean startsWith(@NotNull byte[] bArr) {
        return rangeEquals(0, bArr, 0, bArr.length);
    }
}
