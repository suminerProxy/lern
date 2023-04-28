package okio;

import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp3.IndexSeeker;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedInts;
import com.sobot.network.http.SobotOkHttpUtils;
import com.sobot.network.http.model.SobotProgress;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.umeng.analytics.pro.am;
import h.c.a.a.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;
import okio.internal.BufferKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Buffer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Î\u0001B\b¢\u0006\u0005\bÍ\u0001\u0010jJ'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0001H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010&J+\u0010)\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b)\u0010*J'\u0010)\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b)\u0010+J\u001f\u0010)\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u0007¢\u0006\u0004\b)\u0010,J!\u0010-\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00182\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b-\u0010.J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010/J\u001d\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u00100J\r\u00101\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0018\u00109\u001a\u0002032\u0006\u00106\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b7\u00108J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0007H\u0016¢\u0006\u0004\b@\u00102J\u000f\u0010A\u001a\u00020:H\u0016¢\u0006\u0004\bA\u0010<J\u000f\u0010B\u001a\u00020=H\u0016¢\u0006\u0004\bB\u0010?J\u000f\u0010C\u001a\u00020\u0007H\u0016¢\u0006\u0004\bC\u00102J\u000f\u0010D\u001a\u00020\u0007H\u0016¢\u0006\u0004\bD\u00102J\u000f\u0010E\u001a\u00020\u0007H\u0016¢\u0006\u0004\bE\u00102J\u000f\u0010F\u001a\u00020\u0010H\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010F\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bF\u0010HJ\u0017\u0010K\u001a\u00020=2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00072\u0006\u0010M\u001a\u00020PH\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u000eH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010S\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bS\u0010UJ\u0017\u0010X\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YJ\u001f\u0010X\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010ZJ\u0011\u0010[\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b[\u0010TJ\u000f\u0010\\\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\\\u0010TJ\u0017\u0010\\\u001a\u00020\u000e2\u0006\u0010]\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\\\u0010UJ\u000f\u0010^\u001a\u00020=H\u0016¢\u0006\u0004\b^\u0010?J\u000f\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010`\u001a\u00020_2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b`\u0010bJ\u0017\u0010c\u001a\u00020=2\u0006\u0010M\u001a\u00020_H\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010N\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020_H\u0016¢\u0006\u0004\bN\u0010eJ'\u0010c\u001a\u00020=2\u0006\u0010M\u001a\u00020_2\u0006\u0010(\u001a\u00020=2\u0006\u0010\b\u001a\u00020=H\u0016¢\u0006\u0004\bc\u0010fJ\u0017\u0010c\u001a\u00020=2\u0006\u0010M\u001a\u00020gH\u0016¢\u0006\u0004\bc\u0010hJ\r\u0010i\u001a\u00020\u000b¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bk\u0010 J\u0017\u0010m\u001a\u00020\u00002\u0006\u0010l\u001a\u00020\u0010H\u0016¢\u0006\u0004\bm\u0010nJ'\u0010m\u001a\u00020\u00002\u0006\u0010l\u001a\u00020\u00102\u0006\u0010(\u001a\u00020=2\u0006\u0010\b\u001a\u00020=H\u0016¢\u0006\u0004\bm\u0010oJ\u0017\u0010q\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\u000eH\u0016¢\u0006\u0004\bq\u0010rJ'\u0010q\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\u000e2\u0006\u0010s\u001a\u00020=2\u0006\u0010t\u001a\u00020=H\u0016¢\u0006\u0004\bq\u0010uJ\u0017\u0010w\u001a\u00020\u00002\u0006\u0010v\u001a\u00020=H\u0016¢\u0006\u0004\bw\u0010xJ\u001f\u0010y\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\by\u0010zJ/\u0010y\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\u000e2\u0006\u0010s\u001a\u00020=2\u0006\u0010t\u001a\u00020=2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\by\u0010{J\u0017\u0010m\u001a\u00020\u00002\u0006\u0010|\u001a\u00020_H\u0016¢\u0006\u0004\bm\u0010}J'\u0010m\u001a\u00020\u00002\u0006\u0010|\u001a\u00020_2\u0006\u0010(\u001a\u00020=2\u0006\u0010\b\u001a\u00020=H\u0016¢\u0006\u0004\bm\u0010~J\u0017\u0010m\u001a\u00020=2\u0006\u0010|\u001a\u00020gH\u0016¢\u0006\u0004\bm\u0010hJ\u001a\u0010\u0080\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020\u007fH\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J \u0010m\u001a\u00020\u00002\u0006\u0010|\u001a\u00020\u007f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0005\bm\u0010\u0082\u0001J\u001a\u0010\u0084\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020=H\u0016¢\u0006\u0005\b\u0084\u0001\u0010xJ\u001a\u0010\u0086\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020=H\u0016¢\u0006\u0005\b\u0086\u0001\u0010xJ\u001a\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020=H\u0016¢\u0006\u0005\b\u0087\u0001\u0010xJ\u001a\u0010\u0089\u0001\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020=H\u0016¢\u0006\u0005\b\u0089\u0001\u0010xJ\u001a\u0010\u008a\u0001\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020=H\u0016¢\u0006\u0005\b\u008a\u0001\u0010xJ\u001b\u0010\u008c\u0001\u001a\u00020\u00002\u0007\u0010\u008b\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001b\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008b\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008d\u0001J\u001b\u0010\u008f\u0001\u001a\u00020\u00002\u0007\u0010\u008b\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u008d\u0001J\u001b\u0010\u0090\u0001\u001a\u00020\u00002\u0007\u0010\u008b\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u008d\u0001J\u001c\u0010\u0095\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0091\u0001\u001a\u00020=H\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001f\u0010m\u001a\u00020\u000b2\u0006\u0010|\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bm\u0010OJ \u0010c\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0005\bc\u0010\u0096\u0001J\u001b\u0010\u0097\u0001\u001a\u00020\u00072\u0007\u0010\u0083\u0001\u001a\u000203H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J$\u0010\u0097\u0001\u001a\u00020\u00072\u0007\u0010\u0083\u0001\u001a\u0002032\u0007\u0010\u0099\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u009a\u0001J-\u0010\u0097\u0001\u001a\u00020\u00072\u0007\u0010\u0083\u0001\u001a\u0002032\u0007\u0010\u0099\u0001\u001a\u00020\u00072\u0007\u0010\u009b\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u009c\u0001J\u001b\u0010\u0097\u0001\u001a\u00020\u00072\u0007\u0010\u009d\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u009e\u0001J$\u0010\u0097\u0001\u001a\u00020\u00072\u0007\u0010\u009d\u0001\u001a\u00020\u00102\u0007\u0010\u0099\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u009f\u0001J\u001b\u0010¡\u0001\u001a\u00020\u00072\u0007\u0010 \u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b¡\u0001\u0010\u009e\u0001J$\u0010¡\u0001\u001a\u00020\u00072\u0007\u0010 \u0001\u001a\u00020\u00102\u0007\u0010\u0099\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b¡\u0001\u0010\u009f\u0001J#\u0010¢\u0001\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u00072\u0007\u0010\u009d\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J4\u0010¢\u0001\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u00072\u0007\u0010\u009d\u0001\u001a\u00020\u00102\u0007\u0010¤\u0001\u001a\u00020=2\u0006\u0010\b\u001a\u00020=H\u0016¢\u0006\u0006\b¢\u0001\u0010¥\u0001J\u0011\u0010¦\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b¦\u0001\u0010jJ\u0011\u0010§\u0001\u001a\u00020\tH\u0016¢\u0006\u0005\b§\u0001\u0010\u001eJ\u0011\u0010¨\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b¨\u0001\u0010jJ\u0013\u0010ª\u0001\u001a\u00030©\u0001H\u0016¢\u0006\u0006\bª\u0001\u0010«\u0001J\u000f\u0010¬\u0001\u001a\u00020\u0010¢\u0006\u0005\b¬\u0001\u0010GJ\u000f\u0010\u00ad\u0001\u001a\u00020\u0010¢\u0006\u0005\b\u00ad\u0001\u0010GJ\u000f\u0010®\u0001\u001a\u00020\u0010¢\u0006\u0005\b®\u0001\u0010GJ\u000f\u0010¯\u0001\u001a\u00020\u0010¢\u0006\u0005\b¯\u0001\u0010GJ\u0018\u0010°\u0001\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0018\u0010²\u0001\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0006\b²\u0001\u0010±\u0001J\u0018\u0010³\u0001\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0006\b³\u0001\u0010±\u0001J\u001f\u0010¶\u0001\u001a\u00020\t2\n\u0010µ\u0001\u001a\u0005\u0018\u00010´\u0001H\u0096\u0002¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u0011\u0010¸\u0001\u001a\u00020=H\u0016¢\u0006\u0005\b¸\u0001\u0010?J\u0011\u0010¹\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b¹\u0001\u0010TJ\u000f\u0010º\u0001\u001a\u00020\u0000¢\u0006\u0005\bº\u0001\u0010\u0017J\u0011\u0010»\u0001\u001a\u00020\u0000H\u0016¢\u0006\u0005\b»\u0001\u0010\u0017J\u000f\u0010¼\u0001\u001a\u00020\u0010¢\u0006\u0005\b¼\u0001\u0010GJ\u0018\u0010¼\u0001\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020=¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001f\u0010À\u0001\u001a\u00030¾\u00012\n\b\u0002\u0010¿\u0001\u001a\u00030¾\u0001H\u0007¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u001f\u0010Â\u0001\u001a\u00030¾\u00012\n\b\u0002\u0010¿\u0001\u001a\u00030¾\u0001H\u0007¢\u0006\u0006\bÂ\u0001\u0010Á\u0001J\u0019\u00107\u001a\u0002032\u0007\u0010Ã\u0001\u001a\u00020\u0007H\u0007¢\u0006\u0005\bÄ\u0001\u00108J\u0011\u0010Æ\u0001\u001a\u00020\u0007H\u0007¢\u0006\u0005\bÅ\u0001\u00102R\u0017\u0010\u0016\u001a\u00020\u00008V@\u0016X\u0096\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010\u0017R\u001c\u0010È\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R0\u0010Æ\u0001\u001a\u00020\u00072\u0007\u0010Ê\u0001\u001a\u00020\u00078G@@X\u0086\u000e¢\u0006\u0016\n\u0006\bÆ\u0001\u0010Ë\u0001\u001a\u0005\bÆ\u0001\u00102\"\u0005\bÌ\u0001\u0010 ¨\u0006Ï\u0001"}, d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "Ljava/io/InputStream;", "input", "", "byteCount", "", "forever", "", "readFrom", "(Ljava/io/InputStream;JZ)V", "", "algorithm", "Lokio/ByteString;", "digest", "(Ljava/lang/String;)Lokio/ByteString;", "key", "hmac", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "buffer", "()Lokio/Buffer;", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "emitCompleteSegments", "emit", "exhausted", "()Z", "require", "(J)V", SobotProgress.REQUEST, "(J)Z", "peek", "()Lokio/BufferedSource;", "inputStream", "()Ljava/io/InputStream;", "out", Constants.FLAG_TAG_OFFSET, "copyTo", "(Ljava/io/OutputStream;JJ)Lokio/Buffer;", "(Lokio/Buffer;JJ)Lokio/Buffer;", "(Lokio/Buffer;J)Lokio/Buffer;", "writeTo", "(Ljava/io/OutputStream;J)Lokio/Buffer;", "(Ljava/io/InputStream;)Lokio/Buffer;", "(Ljava/io/InputStream;J)Lokio/Buffer;", "completeSegmentByteCount", "()J", "", "readByte", "()B", "pos", "getByte", "(J)B", "get", "", "readShort", "()S", "", "readInt", "()I", "readLong", "readShortLe", "readIntLe", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "readByteString", "()Lokio/ByteString;", "(J)Lokio/ByteString;", "Lokio/Options;", a.t, "select", "(Lokio/Options;)I", "sink", "readFully", "(Lokio/Buffer;J)V", "Lokio/Sink;", "readAll", "(Lokio/Sink;)J", "readUtf8", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "", "readByteArray", "()[B", "(J)[B", "read", "([B)I", "([B)V", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "clear", "()V", "skip", "byteString", "write", "(Lokio/ByteString;)Lokio/Buffer;", "(Lokio/ByteString;II)Lokio/Buffer;", "string", "writeUtf8", "(Ljava/lang/String;)Lokio/Buffer;", "beginIndex", "endIndex", "(Ljava/lang/String;II)Lokio/Buffer;", "codePoint", "writeUtf8CodePoint", "(I)Lokio/Buffer;", "writeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/Buffer;", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/Buffer;", MessageKey.MSG_SOURCE, "([B)Lokio/Buffer;", "([BII)Lokio/Buffer;", "Lokio/Source;", "writeAll", "(Lokio/Source;)J", "(Lokio/Source;J)Lokio/Buffer;", "b", "writeByte", am.aB, "writeShort", "writeShortLe", "i", "writeInt", "writeIntLe", am.aE, "writeLong", "(J)Lokio/Buffer;", "writeLongLe", "writeDecimalLong", "writeHexadecimalUnsignedLong", "minimumCapacity", "Lokio/Segment;", "writableSegment$okio", "(I)Lokio/Segment;", "writableSegment", "(Lokio/Buffer;J)J", "indexOf", "(B)J", "fromIndex", "(BJ)J", "toIndex", "(BJJ)J", "bytes", "(Lokio/ByteString;)J", "(Lokio/ByteString;J)J", "targetBytes", "indexOfElement", "rangeEquals", "(JLokio/ByteString;)Z", "bytesOffset", "(JLokio/ByteString;II)Z", "flush", "isOpen", "close", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "md5", "sha1", "sha256", "sha512", "hmacSha1", "(Lokio/ByteString;)Lokio/ByteString;", "hmacSha256", "hmacSha512", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "copy", "clone", "snapshot", "(I)Lokio/ByteString;", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readUnsafe", "(Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;", "readAndWriteUnsafe", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "-deprecated_getByte", "-deprecated_size", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "getBuffer", TtmlNode.TAG_HEAD, "Lokio/Segment;", "<set-?>", "J", "setSize$okio", "<init>", "UnsafeCursor", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    @JvmField
    @Nullable
    public Segment head;
    private long size;

    /* compiled from: Buffer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010\u0011J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "", "next", "()I", "", Constants.FLAG_TAG_OFFSET, "seek", "(J)I", "newSize", "resizeBuffer", "(J)J", "minByteCount", "expandBuffer", "(I)J", "", "close", "()V", "end", "I", "start", "", "data", "[B", "Lokio/Segment;", "segment", "Lokio/Segment;", "", "readWrite", "Z", "J", "Lokio/Buffer;", "buffer", "Lokio/Buffer;", "<init>", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class UnsafeCursor implements Closeable {
        @JvmField
        @Nullable
        public Buffer buffer;
        @JvmField
        @Nullable
        public byte[] data;
        @JvmField
        public boolean readWrite;
        private Segment segment;
        @JvmField
        public long offset = -1;
        @JvmField
        public int start = -1;
        @JvmField
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer != null) {
                this.buffer = null;
                this.segment = null;
                this.offset = -1L;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final long expandBuffer(int i2) {
            if (!(i2 > 0)) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i2).toString());
            }
            if (i2 <= 8192) {
                Buffer buffer = this.buffer;
                if (buffer != null) {
                    if (this.readWrite) {
                        long size = buffer.size();
                        Segment writableSegment$okio = buffer.writableSegment$okio(i2);
                        int i3 = 8192 - writableSegment$okio.limit;
                        writableSegment$okio.limit = 8192;
                        long j2 = i3;
                        buffer.setSize$okio(size + j2);
                        this.segment = writableSegment$okio;
                        this.offset = size;
                        this.data = writableSegment$okio.data;
                        this.start = 8192 - i3;
                        this.end = 8192;
                        return j2;
                    }
                    throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
                }
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i2).toString());
        }

        public final int next() {
            long j2 = this.offset;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                Intrinsics.throwNpe();
            }
            if (j2 != buffer.size()) {
                long j3 = this.offset;
                return seek(j3 == -1 ? 0L : j3 + (this.end - this.start));
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        public final long resizeBuffer(long j2) {
            Buffer buffer = this.buffer;
            if (buffer != null) {
                if (this.readWrite) {
                    long size = buffer.size();
                    int i2 = (j2 > size ? 1 : (j2 == size ? 0 : -1));
                    int i3 = 1;
                    if (i2 <= 0) {
                        if (j2 >= 0) {
                            long j3 = size - j2;
                            while (true) {
                                if (j3 > 0) {
                                    Segment segment = buffer.head;
                                    if (segment == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    Segment segment2 = segment.prev;
                                    if (segment2 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    int i4 = segment2.limit;
                                    long j4 = i4 - segment2.pos;
                                    if (j4 <= j3) {
                                        buffer.head = segment2.pop();
                                        SegmentPool.INSTANCE.recycle(segment2);
                                        j3 -= j4;
                                    } else {
                                        segment2.limit = i4 - ((int) j3);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            this.segment = null;
                            this.offset = j2;
                            this.data = null;
                            this.start = -1;
                            this.end = -1;
                        } else {
                            throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
                        }
                    } else if (i2 > 0) {
                        long j5 = j2 - size;
                        boolean z = true;
                        while (j5 > 0) {
                            Segment writableSegment$okio = buffer.writableSegment$okio(i3);
                            int min = (int) Math.min(j5, 8192 - writableSegment$okio.limit);
                            int i5 = writableSegment$okio.limit + min;
                            writableSegment$okio.limit = i5;
                            j5 -= min;
                            if (z) {
                                this.segment = writableSegment$okio;
                                this.offset = size;
                                this.data = writableSegment$okio.data;
                                this.start = i5 - min;
                                this.end = i5;
                                z = false;
                            }
                            i3 = 1;
                        }
                    }
                    buffer.setSize$okio(j2);
                    return size;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int seek(long j2) {
            Segment segment;
            Buffer buffer = this.buffer;
            if (buffer != null) {
                if (j2 >= -1 && j2 <= buffer.size()) {
                    if (j2 != -1 && j2 != buffer.size()) {
                        long j3 = 0;
                        long size = buffer.size();
                        Segment segment2 = buffer.head;
                        Segment segment3 = this.segment;
                        if (segment3 != null) {
                            long j4 = this.offset;
                            int i2 = this.start;
                            if (segment3 == null) {
                                Intrinsics.throwNpe();
                            }
                            long j5 = j4 - (i2 - segment3.pos);
                            if (j5 > j2) {
                                segment = segment2;
                                segment2 = this.segment;
                                size = j5;
                            } else {
                                segment = this.segment;
                                j3 = j5;
                            }
                        } else {
                            segment = segment2;
                        }
                        if (size - j2 > j2 - j3) {
                            while (true) {
                                if (segment == null) {
                                    Intrinsics.throwNpe();
                                }
                                int i3 = segment.limit;
                                int i4 = segment.pos;
                                if (j2 < (i3 - i4) + j3) {
                                    break;
                                }
                                j3 += i3 - i4;
                                segment = segment.next;
                            }
                        } else {
                            while (size > j2) {
                                if (segment2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                segment2 = segment2.prev;
                                if (segment2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                size -= segment2.limit - segment2.pos;
                            }
                            j3 = size;
                            segment = segment2;
                        }
                        if (this.readWrite) {
                            if (segment == null) {
                                Intrinsics.throwNpe();
                            }
                            if (segment.shared) {
                                Segment unsharedCopy = segment.unsharedCopy();
                                if (buffer.head == segment) {
                                    buffer.head = unsharedCopy;
                                }
                                segment = segment.push(unsharedCopy);
                                Segment segment4 = segment.prev;
                                if (segment4 == null) {
                                    Intrinsics.throwNpe();
                                }
                                segment4.pop();
                            }
                        }
                        this.segment = segment;
                        this.offset = j2;
                        if (segment == null) {
                            Intrinsics.throwNpe();
                        }
                        this.data = segment.data;
                        int i5 = segment.pos + ((int) (j2 - j3));
                        this.start = i5;
                        int i6 = segment.limit;
                        this.end = i6;
                        return i6 - i5;
                    }
                    this.segment = null;
                    this.offset = j2;
                    this.data = null;
                    this.start = -1;
                    this.end = -1;
                    return -1;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(buffer.size())}, 2));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(format);
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j2, long j3, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            j3 = buffer.size - j4;
        }
        return buffer.copyTo(outputStream, j4, j3);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        return buffer.copyTo(buffer2, j2);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j2, long j3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        return buffer.copyTo(buffer2, j2, j3);
    }

    private final ByteString digest(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i2 = segment.pos;
            messageDigest.update(bArr, i2, segment.limit - i2);
            Segment segment2 = segment.next;
            if (segment2 == null) {
                Intrinsics.throwNpe();
            }
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i3 = segment2.pos;
                messageDigest.update(bArr2, i3, segment2.limit - i3);
                segment2 = segment2.next;
                if (segment2 == null) {
                    Intrinsics.throwNpe();
                }
            }
        }
        byte[] digest = messageDigest.digest();
        Intrinsics.checkExpressionValueIsNotNull(digest, "messageDigest.digest()");
        return new ByteString(digest);
    }

    private final ByteString hmac(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i2 = segment.pos;
                mac.update(bArr, i2, segment.limit - i2);
                Segment segment2 = segment.next;
                if (segment2 == null) {
                    Intrinsics.throwNpe();
                }
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i3 = segment2.pos;
                    mac.update(bArr2, i3, segment2.limit - i3);
                    segment2 = segment2.next;
                    if (segment2 == null) {
                        Intrinsics.throwNpe();
                    }
                }
            }
            byte[] doFinal = mac.doFinal();
            Intrinsics.checkExpressionValueIsNotNull(doFinal, "mac.doFinal()");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            j2 = buffer.size;
        }
        return buffer.writeTo(outputStream, j2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}))
    @JvmName(name = "-deprecated_getByte")
    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m1611deprecated_getByte(long j2) {
        return getByte(j2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, imports = {}))
    @JvmName(name = "-deprecated_size")
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final long m1612deprecated_size() {
        return this.size;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer buffer() {
        return this;
    }

    public final void clear() {
        skip(size());
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.throwNpe();
        }
        Segment segment2 = segment.prev;
        if (segment2 == null) {
            Intrinsics.throwNpe();
        }
        int i2 = segment2.limit;
        if (i2 < 8192 && segment2.owner) {
            size -= i2 - segment2.pos;
        }
        return size;
    }

    @NotNull
    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            Segment segment = this.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            Segment sharedCopy = segment.sharedCopy();
            buffer.head = sharedCopy;
            sharedCopy.prev = sharedCopy;
            sharedCopy.next = sharedCopy;
            for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
                Segment segment3 = sharedCopy.prev;
                if (segment3 == null) {
                    Intrinsics.throwNpe();
                }
                if (segment2 == null) {
                    Intrinsics.throwNpe();
                }
                segment3.push(segment2.sharedCopy());
            }
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream outputStream) throws IOException {
        return copyTo$default(this, outputStream, 0L, 0L, 6, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream outputStream, long j2) throws IOException {
        return copyTo$default(this, outputStream, j2, 0L, 4, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream outputStream, long j2, long j3) throws IOException {
        int i2;
        Util.checkOffsetAndCount(this.size, j2, j3);
        if (j3 == 0) {
            return this;
        }
        Segment segment = this.head;
        while (true) {
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i3 = segment.limit;
            int i4 = segment.pos;
            if (j2 < i3 - i4) {
                break;
            }
            j2 -= i3 - i4;
            segment = segment.next;
        }
        while (j3 > 0) {
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int min = (int) Math.min(segment.limit - i2, j3);
            outputStream.write(segment.data, (int) (segment.pos + j2), min);
            j3 -= min;
            segment = segment.next;
            j2 = 0;
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof Buffer)) {
                return false;
            }
            Buffer buffer = (Buffer) obj;
            if (size() != buffer.size()) {
                return false;
            }
            if (size() != 0) {
                Segment segment = this.head;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                Segment segment2 = buffer.head;
                if (segment2 == null) {
                    Intrinsics.throwNpe();
                }
                int i2 = segment.pos;
                int i3 = segment2.pos;
                long j2 = 0;
                while (j2 < size()) {
                    long min = Math.min(segment.limit - i2, segment2.limit - i3);
                    long j3 = 0;
                    while (j3 < min) {
                        int i4 = i2 + 1;
                        int i5 = i3 + 1;
                        if (segment.data[i2] != segment2.data[i3]) {
                            return false;
                        }
                        j3++;
                        i2 = i4;
                        i3 = i5;
                    }
                    if (i2 == segment.limit) {
                        segment = segment.next;
                        if (segment == null) {
                            Intrinsics.throwNpe();
                        }
                        i2 = segment.pos;
                    }
                    if (i3 == segment2.limit) {
                        segment2 = segment2.next;
                        if (segment2 == null) {
                            Intrinsics.throwNpe();
                        }
                        i3 = segment2.pos;
                    }
                    j2 += min;
                }
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
        return this;
    }

    @JvmName(name = "getByte")
    public final byte getByte(long j2) {
        Util.checkOffsetAndCount(size(), j2, 1L);
        Segment segment = this.head;
        if (segment != null) {
            if (size() - j2 < j2) {
                long size = size();
                while (size > j2) {
                    segment = segment.prev;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    size -= segment.limit - segment.pos;
                }
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                return segment.data[(int) ((segment.pos + j2) - size)];
            }
            long j3 = 0;
            while (true) {
                long j4 = (segment.limit - segment.pos) + j3;
                if (j4 > j2) {
                    break;
                }
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                j3 = j4;
            }
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            return segment.data[(int) ((segment.pos + j2) - j3)];
        }
        Segment segment2 = null;
        Intrinsics.throwNpe();
        return segment2.data[(int) ((segment2.pos + j2) - (-1))];
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment != null) {
            int i2 = 1;
            do {
                int i3 = segment.limit;
                for (int i4 = segment.pos; i4 < i3; i4++) {
                    i2 = (i2 * 31) + segment.data[i4];
                }
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
            } while (segment != this.head);
            return i2;
        }
        return 0;
    }

    @NotNull
    public final ByteString hmacSha1(@NotNull ByteString byteString) {
        return hmac("HmacSHA1", byteString);
    }

    @NotNull
    public final ByteString hmacSha256(@NotNull ByteString byteString) {
        return hmac("HmacSHA256", byteString);
    }

    @NotNull
    public final ByteString hmacSha512(@NotNull ByteString byteString) {
        return hmac("HmacSHA512", byteString);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b) {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString byteString) {
        return indexOfElement(byteString, 0L);
    }

    @Override // okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.Buffer$inputStream$1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & 255;
                }
                return -1;
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(@NotNull byte[] bArr, int i2, int i3) {
                return Buffer.this.read(bArr, i2, i3);
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @NotNull
    public final ByteString md5() {
        return digest("MD5");
    }

    @Override // okio.BufferedSink
    @NotNull
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.Buffer$outputStream$1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i2) {
                Buffer.this.writeByte(i2);
            }

            @Override // java.io.OutputStream
            public void write(@NotNull byte[] bArr, int i2, int i3) {
                Buffer.this.write(bArr, i2, i3);
            }
        };
    }

    @Override // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j2, @NotNull ByteString byteString) {
        return rangeEquals(j2, byteString, 0, byteString.size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer byteBuffer) throws IOException {
        Segment segment = this.head;
        if (segment != null) {
            int min = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
            byteBuffer.put(segment.data, segment.pos, min);
            int i2 = segment.pos + min;
            segment.pos = i2;
            this.size -= min;
            if (i2 == segment.limit) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            }
            return min;
        }
        return -1;
    }

    @Override // okio.BufferedSource
    public long readAll(@NotNull Sink sink) throws IOException {
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readAndWriteUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        if (unsafeCursor.buffer == null) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = true;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() != 0) {
            Segment segment = this.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i2 = segment.pos;
            int i3 = segment.limit;
            int i4 = i2 + 1;
            byte b = segment.data[i2];
            setSize$okio(size() - 1);
            if (i4 == i3) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i4;
            }
            return b;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString() {
        return readByteString(size());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7 A[EDGE_INSN: B:51:0x00c7->B:44:0x00c7 ?: BREAK  , SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readDecimalLong():long");
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream inputStream) throws IOException {
        readFrom(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull Buffer buffer, long j2) throws EOFException {
        if (size() >= j2) {
            buffer.write(this, j2);
        } else {
            buffer.write(this, size());
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2 A[EDGE_INSN: B:45:0x00b2->B:40:0x00b2 ?: BREAK  , SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lbc
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L14
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L14:
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1a:
            if (r8 >= r9) goto L9c
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L2b
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L2b
            int r11 = r10 - r11
            goto L45
        L2b:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L3a
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L3a
        L35:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L45
        L3a:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7d
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7d
            goto L35
        L45:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L55
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1a
        L55:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7d:
            if (r0 == 0) goto L81
            r1 = 1
            goto L9c
        L81:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.Util.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9c:
            if (r8 != r9) goto Laa
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool r7 = okio.SegmentPool.INSTANCE
            r7.recycle(r6)
            goto Lac
        Laa:
            r6.pos = r8
        Lac:
            if (r1 != 0) goto Lb2
            okio.Segment r6 = r14.head
            if (r6 != 0) goto Ld
        Lb2:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lbc:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() >= 4) {
            Segment segment = this.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i2 = segment.pos;
            int i3 = segment.limit;
            if (i3 - i2 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = segment.data;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
            int i7 = i5 + 1;
            int i8 = i6 | ((bArr[i5] & 255) << 8);
            int i9 = i7 + 1;
            int i10 = i8 | (bArr[i7] & 255);
            setSize$okio(size() - 4);
            if (i9 == i3) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i9;
            }
            return i10;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        return Util.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() >= 8) {
            Segment segment = this.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i2 = segment.pos;
            int i3 = segment.limit;
            if (i3 - i2 < 8) {
                return ((readInt() & UnsignedInts.INT_MASK) << 32) | (UnsignedInts.INT_MASK & readInt());
            }
            byte[] bArr = segment.data;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int i9 = i8 + 1;
            long j2 = ((bArr[i2] & 255) << 56) | ((bArr[i4] & 255) << 48) | ((bArr[i5] & 255) << 40) | ((bArr[i6] & 255) << 32) | ((bArr[i7] & 255) << 24) | ((bArr[i8] & 255) << 16);
            int i10 = i9 + 1;
            int i11 = i10 + 1;
            long j3 = j2 | ((bArr[i9] & 255) << 8) | (bArr[i10] & 255);
            setSize$okio(size() - 8);
            if (i11 == i3) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i11;
            }
            return j3;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        return Util.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() >= 2) {
            Segment segment = this.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i2 = segment.pos;
            int i3 = segment.limit;
            if (i3 - i2 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = segment.data;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
            setSize$okio(size() - 2);
            if (i5 == i3) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i5;
            }
            return (short) i6;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        return Util.reverseBytes(readShort());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset) {
        return readString(this.size, charset);
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        if (unsafeCursor.buffer == null) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = false;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8() {
        return readString(this.size, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i2;
        int i3;
        int i4;
        if (size() != 0) {
            byte b = getByte(0L);
            if ((b & 128) == 0) {
                i2 = b & Byte.MAX_VALUE;
                i4 = 0;
                i3 = 1;
            } else if ((b & 224) == 192) {
                i2 = b & Ascii.US;
                i3 = 2;
                i4 = 128;
            } else if ((b & 240) == 224) {
                i2 = b & 15;
                i3 = 3;
                i4 = 2048;
            } else if ((b & 248) != 240) {
                skip(1L);
                return 65533;
            } else {
                i2 = b & 7;
                i3 = 4;
                i4 = 65536;
            }
            long j2 = i3;
            if (size() >= j2) {
                for (int i5 = 1; i5 < i3; i5++) {
                    long j3 = i5;
                    byte b2 = getByte(j3);
                    if ((b2 & 192) != 128) {
                        skip(j3);
                        return 65533;
                    }
                    i2 = (i2 << 6) | (b2 & Utf8.REPLACEMENT_BYTE);
                }
                skip(j2);
                if (i2 > 1114111) {
                    return 65533;
                }
                if ((55296 <= i2 && 57343 >= i2) || i2 < i4) {
                    return 65533;
                }
                return i2;
            }
            throw new EOFException("size < " + i3 + ": " + size() + " (to read code point prefixed 0x" + Util.toHexString(b) + ')');
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws EOFException {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return BufferKt.readUtf8Line(this, indexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public boolean request(long j2) {
        return this.size >= j2;
    }

    @Override // okio.BufferedSource
    public void require(long j2) throws EOFException {
        if (this.size < j2) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(@NotNull Options options) {
        int selectPrefix$default = BufferKt.selectPrefix$default(this, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public final void setSize$okio(long j2) {
        this.size = j2;
    }

    @NotNull
    public final ByteString sha1() {
        return digest("SHA-1");
    }

    @NotNull
    public final ByteString sha256() {
        return digest("SHA-256");
    }

    @NotNull
    public final ByteString sha512() {
        return digest("SHA-512");
    }

    @JvmName(name = MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE)
    public final long size() {
        return this.size;
    }

    @Override // okio.BufferedSource
    public void skip(long j2) throws EOFException {
        while (j2 > 0) {
            Segment segment = this.head;
            if (segment != null) {
                int min = (int) Math.min(j2, segment.limit - segment.pos);
                long j3 = min;
                setSize$okio(size() - j3);
                j2 -= j3;
                int i2 = segment.pos + min;
                segment.pos = i2;
                if (i2 == segment.limit) {
                    this.head = segment.pop();
                    SegmentPool.INSTANCE.recycle(segment);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @NotNull
    public final ByteString snapshot() {
        if (size() <= ((long) Integer.MAX_VALUE)) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @NotNull
    public String toString() {
        return snapshot().toString();
    }

    @NotNull
    public final Segment writableSegment$okio(int i2) {
        boolean z = true;
        if ((i2 < 1 || i2 > 8192) ? false : false) {
            Segment segment = this.head;
            if (segment == null) {
                Segment take = SegmentPool.INSTANCE.take();
                this.head = take;
                take.prev = take;
                take.next = take;
                return take;
            }
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            Segment segment2 = segment.prev;
            if (segment2 == null) {
                Intrinsics.throwNpe();
            }
            return (segment2.limit + i2 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.INSTANCE.take()) : segment2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @Override // okio.BufferedSink
    public long writeAll(@NotNull Source source) throws IOException {
        long j2 = 0;
        while (true) {
            long read = source.read(this, 8192);
            if (read == -1) {
                return j2;
            }
            j2 += read;
        }
    }

    @JvmOverloads
    @NotNull
    public final Buffer writeTo(@NotNull OutputStream outputStream) throws IOException {
        return writeTo$default(this, outputStream, 0L, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final Buffer writeTo(@NotNull OutputStream outputStream, long j2) throws IOException {
        Util.checkOffsetAndCount(this.size, 0L, j2);
        Segment segment = this.head;
        while (j2 > 0) {
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int min = (int) Math.min(j2, segment.limit - segment.pos);
            outputStream.write(segment.data, segment.pos, min);
            int i2 = segment.pos + min;
            segment.pos = i2;
            long j3 = min;
            this.size -= j3;
            j2 -= j3;
            if (i2 == segment.limit) {
                Segment pop = segment.pop();
                this.head = pop;
                SegmentPool.INSTANCE.recycle(segment);
                segment = pop;
            }
        }
        return this;
    }

    @NotNull
    public Buffer clone() {
        return copy();
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j2) {
        return indexOf(b, j2, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString byteString, long j2) {
        int i2;
        int i3;
        long j3 = 0;
        if (j2 >= 0) {
            Segment segment = this.head;
            if (segment != null) {
                if (size() - j2 < j2) {
                    j3 = size();
                    while (j3 > j2) {
                        segment = segment.prev;
                        if (segment == null) {
                            Intrinsics.throwNpe();
                        }
                        j3 -= segment.limit - segment.pos;
                    }
                    if (segment != null) {
                        if (byteString.size() == 2) {
                            byte b = byteString.getByte(0);
                            byte b2 = byteString.getByte(1);
                            while (j3 < size()) {
                                byte[] bArr = segment.data;
                                i2 = (int) ((segment.pos + j2) - j3);
                                int i4 = segment.limit;
                                while (i2 < i4) {
                                    byte b3 = bArr[i2];
                                    if (b3 != b && b3 != b2) {
                                        i2++;
                                    }
                                    i3 = segment.pos;
                                }
                                j3 += segment.limit - segment.pos;
                                segment = segment.next;
                                if (segment == null) {
                                    Intrinsics.throwNpe();
                                }
                                j2 = j3;
                            }
                            return -1L;
                        }
                        byte[] internalArray$okio = byteString.internalArray$okio();
                        while (j3 < size()) {
                            byte[] bArr2 = segment.data;
                            i2 = (int) ((segment.pos + j2) - j3);
                            int i5 = segment.limit;
                            while (i2 < i5) {
                                byte b4 = bArr2[i2];
                                for (byte b5 : internalArray$okio) {
                                    if (b4 == b5) {
                                        i3 = segment.pos;
                                    }
                                }
                                i2++;
                            }
                            j3 += segment.limit - segment.pos;
                            segment = segment.next;
                            if (segment == null) {
                                Intrinsics.throwNpe();
                            }
                            j2 = j3;
                        }
                        return -1L;
                    }
                    return -1L;
                }
                while (true) {
                    long j4 = (segment.limit - segment.pos) + j3;
                    if (j4 > j2) {
                        break;
                    }
                    segment = segment.next;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j3 = j4;
                }
                if (segment != null) {
                    if (byteString.size() == 2) {
                        byte b6 = byteString.getByte(0);
                        byte b7 = byteString.getByte(1);
                        while (j3 < size()) {
                            byte[] bArr3 = segment.data;
                            i2 = (int) ((segment.pos + j2) - j3);
                            int i6 = segment.limit;
                            while (i2 < i6) {
                                byte b8 = bArr3[i2];
                                if (b8 != b6 && b8 != b7) {
                                    i2++;
                                }
                                i3 = segment.pos;
                            }
                            j3 += segment.limit - segment.pos;
                            segment = segment.next;
                            if (segment == null) {
                                Intrinsics.throwNpe();
                            }
                            j2 = j3;
                        }
                        return -1L;
                    }
                    byte[] internalArray$okio2 = byteString.internalArray$okio();
                    while (j3 < size()) {
                        byte[] bArr4 = segment.data;
                        i2 = (int) ((segment.pos + j2) - j3);
                        int i7 = segment.limit;
                        while (i2 < i7) {
                            byte b9 = bArr4[i2];
                            for (byte b10 : internalArray$okio2) {
                                if (b9 == b10) {
                                    i3 = segment.pos;
                                }
                            }
                            i2++;
                        }
                        j3 += segment.limit - segment.pos;
                        segment = segment.next;
                        if (segment == null) {
                            Intrinsics.throwNpe();
                        }
                        j2 = j3;
                    }
                    return -1L;
                }
                return -1L;
                return (i2 - i3) + j3;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j2, @NotNull ByteString byteString, int i2, int i3) {
        if (j2 < 0 || i2 < 0 || i3 < 0 || size() - j2 < i3 || byteString.size() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (getByte(i4 + j2) != byteString.getByte(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long j2) throws EOFException {
        if (j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE)) {
            if (size() >= j2) {
                byte[] bArr = new byte[(int) j2];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j2).toString());
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString(long j2) throws EOFException {
        if (j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE)) {
            if (size() >= j2) {
                if (j2 >= 4096) {
                    ByteString snapshot = snapshot((int) j2);
                    skip(j2);
                    return snapshot;
                }
                return new ByteString(readByteArray(j2));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j2).toString());
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream inputStream, long j2) throws IOException {
        if (j2 >= 0) {
            readFrom(inputStream, j2, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(long j2, @NotNull Charset charset) throws EOFException {
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 >= 0 && j2 <= ((long) Integer.MAX_VALUE)) {
            if (this.size >= j2) {
                if (i2 == 0) {
                    return "";
                }
                Segment segment = this.head;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                int i3 = segment.pos;
                if (i3 + j2 > segment.limit) {
                    return new String(readByteArray(j2), charset);
                }
                int i4 = (int) j2;
                String str = new String(segment.data, i3, i4, charset);
                int i5 = segment.pos + i4;
                segment.pos = i5;
                this.size -= j2;
                if (i5 == segment.limit) {
                    this.head = segment.pop();
                    SegmentPool.INSTANCE.recycle(segment);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j2).toString());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8(long j2) throws EOFException {
        return readString(j2, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long j2) throws EOFException {
        if (j2 >= 0) {
            long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
            byte b = (byte) 10;
            long indexOf = indexOf(b, 0L, j3);
            if (indexOf != -1) {
                return BufferKt.readUtf8Line(this, indexOf);
            }
            if (j3 < size() && getByte(j3 - 1) == ((byte) 13) && getByte(j3) == b) {
                return BufferKt.readUtf8Line(this, j3);
            }
            Buffer buffer = new Buffer();
            copyTo(buffer, 0L, Math.min(32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j2) + " content=" + buffer.readByteString().hex() + Typography.ellipsis);
        }
        throw new IllegalArgumentException(("limit < 0: " + j2).toString());
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeByte(int i2) {
        Segment writableSegment$okio = writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        writableSegment$okio.limit = i3 + 1;
        bArr[i3] = (byte) i2;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeDecimalLong(long j2) {
        int i2;
        int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i3 == 0) {
            return writeByte(48);
        }
        boolean z = false;
        int i4 = 1;
        if (i3 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z = true;
        }
        if (j2 < 100000000) {
            if (j2 >= SobotOkHttpUtils.DEFAULT_MILLISECONDS) {
                i2 = j2 < 1000000 ? j2 < IndexSeeker.MIN_TIME_BETWEEN_POINTS_US ? 5 : 6 : j2 < 10000000 ? 7 : 8;
            } else if (j2 >= 100) {
                i2 = j2 < 1000 ? 3 : 4;
            } else if (j2 >= 10) {
                i4 = 2;
            }
            i4 = i2;
        } else if (j2 < 1000000000000L) {
            if (j2 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i4 = j2 < C.NANOS_PER_SECOND ? 9 : 10;
            } else {
                i2 = j2 < 100000000000L ? 11 : 12;
                i4 = i2;
            }
        } else if (j2 >= 1000000000000000L) {
            i4 = j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 < 10000000000000L) {
            i4 = 13;
        } else {
            i2 = j2 < 100000000000000L ? 14 : 15;
            i4 = i2;
        }
        if (z) {
            i4++;
        }
        Segment writableSegment$okio = writableSegment$okio(i4);
        byte[] bArr = writableSegment$okio.data;
        int i5 = writableSegment$okio.limit + i4;
        while (j2 != 0) {
            long j3 = 10;
            i5--;
            bArr[i5] = BufferKt.getHEX_DIGIT_BYTES()[(int) (j2 % j3)];
            j2 /= j3;
        }
        if (z) {
            bArr[i5 - 1] = (byte) 45;
        }
        writableSegment$okio.limit += i4;
        setSize$okio(size() + i4);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeHexadecimalUnsignedLong(long j2) {
        if (j2 == 0) {
            return writeByte(48);
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
        Segment writableSegment$okio = writableSegment$okio(i2);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            bArr[i4] = BufferKt.getHEX_DIGIT_BYTES()[(int) (15 & j2)];
            j2 >>>= 4;
        }
        writableSegment$okio.limit += i2;
        setSize$okio(size() + i2);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeInt(int i2) {
        Segment writableSegment$okio = writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        writableSegment$okio.limit = i6 + 1;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeIntLe(int i2) {
        return writeInt(Util.reverseBytes(i2));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLong(long j2) {
        Segment writableSegment$okio = writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j2 >>> 56) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j2 >>> 48) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j2 >>> 40) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j2 >>> 32) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j2 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j2 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j2 >>> 8) & 255);
        bArr[i9] = (byte) (j2 & 255);
        writableSegment$okio.limit = i9 + 1;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLongLe(long j2) {
        return writeLong(Util.reverseBytes(j2));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShort(int i2) {
        Segment writableSegment$okio = writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        writableSegment$okio.limit = i4 + 1;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShortLe(int i2) {
        return writeShort((int) Util.reverseBytes((short) i2));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8CodePoint(int i2) {
        if (i2 < 128) {
            writeByte(i2);
        } else if (i2 < 2048) {
            Segment writableSegment$okio = writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i3 = writableSegment$okio.limit;
            bArr[i3] = (byte) ((i2 >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            writableSegment$okio.limit = i3 + 2;
            setSize$okio(size() + 2);
        } else if (55296 <= i2 && 57343 >= i2) {
            writeByte(63);
        } else if (i2 < 65536) {
            Segment writableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i4 = writableSegment$okio2.limit;
            bArr2[i4] = (byte) ((i2 >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
            writableSegment$okio2.limit = i4 + 3;
            setSize$okio(size() + 3);
        } else if (i2 <= 1114111) {
            Segment writableSegment$okio3 = writableSegment$okio(4);
            byte[] bArr3 = writableSegment$okio3.data;
            int i5 = writableSegment$okio3.limit;
            bArr3[i5] = (byte) ((i2 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
            writableSegment$okio3.limit = i5 + 4;
            setSize$okio(size() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + Util.toHexString(i2));
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString byteString) throws IOException {
        return indexOf(byteString, 0L);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String str, @NotNull Charset charset) {
        return writeString(str, 0, str.length(), charset);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String str) {
        return writeUtf8(str, 0, str.length());
    }

    private final void readFrom(InputStream inputStream, long j2, boolean z) throws IOException {
        while (true) {
            if (j2 <= 0 && !z) {
                return;
            }
            Segment writableSegment$okio = writableSegment$okio(1);
            int read = inputStream.read(writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j2, 8192 - writableSegment$okio.limit));
            if (read == -1) {
                if (writableSegment$okio.pos == writableSegment$okio.limit) {
                    this.head = writableSegment$okio.pop();
                    SegmentPool.INSTANCE.recycle(writableSegment$okio);
                }
                if (!z) {
                    throw new EOFException();
                }
                return;
            }
            writableSegment$okio.limit += read;
            long j3 = read;
            this.size += j3;
            j2 -= j3;
        }
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j2, long j3) {
        Segment segment;
        int i2;
        long j4 = 0;
        if (0 <= j2 && j3 >= j2) {
            if (j3 > size()) {
                j3 = size();
            }
            if (j2 == j3 || (segment = this.head) == null) {
                return -1L;
            }
            if (size() - j2 < j2) {
                j4 = size();
                while (j4 > j2) {
                    segment = segment.prev;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j4 -= segment.limit - segment.pos;
                }
                if (segment != null) {
                    while (j4 < j3) {
                        byte[] bArr = segment.data;
                        int min = (int) Math.min(segment.limit, (segment.pos + j3) - j4);
                        i2 = (int) ((segment.pos + j2) - j4);
                        while (i2 < min) {
                            if (bArr[i2] != b) {
                                i2++;
                            }
                        }
                        j4 += segment.limit - segment.pos;
                        segment = segment.next;
                        if (segment == null) {
                            Intrinsics.throwNpe();
                        }
                        j2 = j4;
                    }
                    return -1L;
                }
                return -1L;
            }
            while (true) {
                long j5 = (segment.limit - segment.pos) + j4;
                if (j5 > j2) {
                    break;
                }
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                j4 = j5;
            }
            if (segment != null) {
                while (j4 < j3) {
                    byte[] bArr2 = segment.data;
                    int min2 = (int) Math.min(segment.limit, (segment.pos + j3) - j4);
                    i2 = (int) ((segment.pos + j2) - j4);
                    while (i2 < min2) {
                        if (bArr2[i2] != b) {
                            i2++;
                        }
                    }
                    j4 += segment.limit - segment.pos;
                    segment = segment.next;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j2 = j4;
                }
                return -1L;
            }
            return -1L;
            return (i2 - segment.pos) + j4;
        }
        throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j2 + " toIndex=" + j3).toString());
    }

    @NotNull
    public final ByteString snapshot(int i2) {
        if (i2 == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(size(), 0L, i2);
        Segment segment = this.head;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i6 = segment.limit;
            int i7 = segment.pos;
            if (i6 != i7) {
                i4 += i6 - i7;
                i5++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i5];
        int[] iArr = new int[i5 * 2];
        Segment segment2 = this.head;
        int i8 = 0;
        while (i3 < i2) {
            if (segment2 == null) {
                Intrinsics.throwNpe();
            }
            bArr[i8] = segment2.data;
            i3 += segment2.limit - segment2.pos;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = segment2.pos;
            segment2.shared = true;
            i8++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String str, int i2, int i3, @NotNull Charset charset) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (i3 >= i2) {
            if (i3 <= str.length()) {
                if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
                    return writeUtf8(str, i2, i3);
                }
                String substring = str.substring(i2, i3);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (substring != null) {
                    byte[] bytes = substring.getBytes(charset);
                    Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                    return write(bytes, 0, bytes.length);
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String str, int i2, int i3) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (i3 >= i2) {
            if (!(i3 <= str.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
            }
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    Segment writableSegment$okio = writableSegment$okio(1);
                    byte[] bArr = writableSegment$okio.data;
                    int i4 = writableSegment$okio.limit - i2;
                    int min = Math.min(i3, 8192 - i4);
                    int i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) charAt;
                    while (i5 < min) {
                        char charAt2 = str.charAt(i5);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i5 + i4] = (byte) charAt2;
                        i5++;
                    }
                    int i6 = writableSegment$okio.limit;
                    int i7 = (i4 + i5) - i6;
                    writableSegment$okio.limit = i6 + i7;
                    setSize$okio(size() + i7);
                    i2 = i5;
                } else {
                    if (charAt < 2048) {
                        Segment writableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = writableSegment$okio2.data;
                        int i8 = writableSegment$okio2.limit;
                        bArr2[i8] = (byte) ((charAt >> 6) | 192);
                        bArr2[i8 + 1] = (byte) ((charAt & '?') | 128);
                        writableSegment$okio2.limit = i8 + 2;
                        setSize$okio(size() + 2);
                    } else if (charAt >= 55296 && charAt <= 57343) {
                        int i9 = i2 + 1;
                        char charAt3 = i9 < i3 ? str.charAt(i9) : (char) 0;
                        if (charAt <= 56319 && 56320 <= charAt3 && 57343 >= charAt3) {
                            int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            Segment writableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = writableSegment$okio3.data;
                            int i11 = writableSegment$okio3.limit;
                            bArr3[i11] = (byte) ((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            bArr3[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr3[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr3[i11 + 3] = (byte) ((i10 & 63) | 128);
                            writableSegment$okio3.limit = i11 + 4;
                            setSize$okio(size() + 4);
                            i2 += 2;
                        } else {
                            writeByte(63);
                            i2 = i9;
                        }
                    } else {
                        Segment writableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = writableSegment$okio4.data;
                        int i12 = writableSegment$okio4.limit;
                        bArr4[i12] = (byte) ((charAt >> '\f') | 224);
                        bArr4[i12 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                        bArr4[i12 + 2] = (byte) ((charAt & '?') | 128);
                        writableSegment$okio4.limit = i12 + 3;
                        setSize$okio(size() + 3);
                    }
                    i2++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull byte[] bArr) throws EOFException {
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = read(bArr, i2, bArr.length - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i2, 8192 - writableSegment$okio.limit);
            byteBuffer.get(writableSegment$okio.data, writableSegment$okio.limit, min);
            i2 -= min;
            writableSegment$okio.limit += min;
        }
        this.size += remaining;
        return remaining;
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer buffer, long j2) {
        return copyTo(buffer, j2, this.size - j2);
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] bArr, int i2, int i3) {
        Util.checkOffsetAndCount(bArr.length, i2, i3);
        Segment segment = this.head;
        if (segment != null) {
            int min = Math.min(i3, segment.limit - segment.pos);
            byte[] bArr2 = segment.data;
            int i4 = segment.pos;
            ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr, i2, i4, i4 + min);
            segment.pos += min;
            setSize$okio(size() - min);
            if (segment.pos == segment.limit) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
                return min;
            }
            return min;
        }
        return -1;
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer buffer, long j2, long j3) {
        Util.checkOffsetAndCount(size(), j2, j3);
        if (j3 != 0) {
            buffer.setSize$okio(buffer.size() + j3);
            Segment segment = this.head;
            while (true) {
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                int i2 = segment.limit;
                int i3 = segment.pos;
                if (j2 < i2 - i3) {
                    break;
                }
                j2 -= i2 - i3;
                segment = segment.next;
            }
            while (j3 > 0) {
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                Segment sharedCopy = segment.sharedCopy();
                int i4 = sharedCopy.pos + ((int) j2);
                sharedCopy.pos = i4;
                sharedCopy.limit = Math.min(i4 + ((int) j3), sharedCopy.limit);
                Segment segment2 = buffer.head;
                if (segment2 == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy;
                    buffer.head = sharedCopy;
                } else {
                    if (segment2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Segment segment3 = segment2.prev;
                    if (segment3 == null) {
                        Intrinsics.throwNpe();
                    }
                    segment3.push(sharedCopy);
                }
                j3 -= sharedCopy.limit - sharedCopy.pos;
                segment = segment.next;
                j2 = 0;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString) {
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString, int i2, int i3) {
        byteString.write$okio(this, i2, i3);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] bArr) {
        return write(bArr, 0, bArr.length);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] bArr, int i2, int i3) {
        long j2 = i3;
        Util.checkOffsetAndCount(bArr.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i4 - i2, 8192 - writableSegment$okio.limit);
            int i5 = i2 + min;
            ArraysKt___ArraysJvmKt.copyInto(bArr, writableSegment$okio.data, writableSegment$okio.limit, i2, i5);
            writableSegment$okio.limit += min;
            i2 = i5;
        }
        setSize$okio(size() + j2);
        return this;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer buffer, long j2) {
        if (j2 >= 0) {
            if (size() == 0) {
                return -1L;
            }
            if (j2 > size()) {
                j2 = size();
            }
            buffer.write(this, j2);
            return j2;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull Source source, long j2) throws IOException {
        while (j2 > 0) {
            long read = source.read(this, j2);
            if (read == -1) {
                throw new EOFException();
            }
            j2 -= read;
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString byteString, long j2) throws IOException {
        long j3 = j2;
        if (byteString.size() > 0) {
            long j4 = 0;
            if (j3 >= 0) {
                Segment segment = this.head;
                if (segment != null) {
                    if (size() - j3 < j3) {
                        long size = size();
                        while (size > j3) {
                            segment = segment.prev;
                            if (segment == null) {
                                Intrinsics.throwNpe();
                            }
                            size -= segment.limit - segment.pos;
                        }
                        if (segment != null) {
                            byte[] internalArray$okio = byteString.internalArray$okio();
                            byte b = internalArray$okio[0];
                            int size2 = byteString.size();
                            long size3 = (size() - size2) + 1;
                            while (size < size3) {
                                byte[] bArr = segment.data;
                                long j5 = size;
                                int min = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                                for (int i2 = (int) ((segment.pos + j3) - j5); i2 < min; i2++) {
                                    if (bArr[i2] == b && BufferKt.rangeEquals(segment, i2 + 1, internalArray$okio, 1, size2)) {
                                        return (i2 - segment.pos) + j5;
                                    }
                                }
                                size = j5 + (segment.limit - segment.pos);
                                segment = segment.next;
                                if (segment == null) {
                                    Intrinsics.throwNpe();
                                }
                                j3 = size;
                            }
                        }
                    } else {
                        while (true) {
                            long j6 = (segment.limit - segment.pos) + j4;
                            if (j6 > j3) {
                                break;
                            }
                            segment = segment.next;
                            if (segment == null) {
                                Intrinsics.throwNpe();
                            }
                            j4 = j6;
                        }
                        if (segment != null) {
                            byte[] internalArray$okio2 = byteString.internalArray$okio();
                            byte b2 = internalArray$okio2[0];
                            int size4 = byteString.size();
                            long size5 = (size() - size4) + 1;
                            while (j4 < size5) {
                                byte[] bArr2 = segment.data;
                                long j7 = size5;
                                int min2 = (int) Math.min(segment.limit, (segment.pos + size5) - j4);
                                for (int i3 = (int) ((segment.pos + j3) - j4); i3 < min2; i3++) {
                                    if (bArr2[i3] == b2 && BufferKt.rangeEquals(segment, i3 + 1, internalArray$okio2, 1, size4)) {
                                        return (i3 - segment.pos) + j4;
                                    }
                                }
                                j4 += segment.limit - segment.pos;
                                segment = segment.next;
                                if (segment == null) {
                                    Intrinsics.throwNpe();
                                }
                                j3 = j4;
                                size5 = j7;
                            }
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer buffer, long j2) {
        Segment segment;
        Segment segment2;
        if (buffer != this) {
            Util.checkOffsetAndCount(buffer.size(), 0L, j2);
            while (j2 > 0) {
                Segment segment3 = buffer.head;
                if (segment3 == null) {
                    Intrinsics.throwNpe();
                }
                int i2 = segment3.limit;
                if (buffer.head == null) {
                    Intrinsics.throwNpe();
                }
                if (j2 < i2 - segment.pos) {
                    Segment segment4 = this.head;
                    if (segment4 != null) {
                        if (segment4 == null) {
                            Intrinsics.throwNpe();
                        }
                        segment2 = segment4.prev;
                    } else {
                        segment2 = null;
                    }
                    if (segment2 != null && segment2.owner) {
                        if ((segment2.limit + j2) - (segment2.shared ? 0 : segment2.pos) <= 8192) {
                            Segment segment5 = buffer.head;
                            if (segment5 == null) {
                                Intrinsics.throwNpe();
                            }
                            segment5.writeTo(segment2, (int) j2);
                            buffer.setSize$okio(buffer.size() - j2);
                            setSize$okio(size() + j2);
                            return;
                        }
                    }
                    Segment segment6 = buffer.head;
                    if (segment6 == null) {
                        Intrinsics.throwNpe();
                    }
                    buffer.head = segment6.split((int) j2);
                }
                Segment segment7 = buffer.head;
                if (segment7 == null) {
                    Intrinsics.throwNpe();
                }
                long j3 = segment7.limit - segment7.pos;
                buffer.head = segment7.pop();
                Segment segment8 = this.head;
                if (segment8 == null) {
                    this.head = segment7;
                    segment7.prev = segment7;
                    segment7.next = segment7;
                } else {
                    if (segment8 == null) {
                        Intrinsics.throwNpe();
                    }
                    Segment segment9 = segment8.prev;
                    if (segment9 == null) {
                        Intrinsics.throwNpe();
                    }
                    segment9.push(segment7).compact();
                }
                buffer.setSize$okio(buffer.size() - j3);
                setSize$okio(size() + j3);
                j2 -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }
}
