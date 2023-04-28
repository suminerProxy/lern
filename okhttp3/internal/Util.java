package okhttp3.internal;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.datepicker.UtcDates;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Util.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Æ\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0007*\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001c\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\"\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b$\u0010#\u001a%\u0010%\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010,\u001a\u0011\u0010-\u001a\u00020\u001b*\u00020\u0007¢\u0006\u0004\b-\u0010.\u001a\u0011\u0010/\u001a\u00020\t*\u00020\u0007¢\u0006\u0004\b/\u00100\u001a)\u00101\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u0002020\u000e\"\u000202¢\u0006\u0004\b1\u00104\u001a\u0019\u00108\u001a\u000206*\u0002052\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109\u001a'\u0010=\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b=\u0010>\u001a\u0011\u0010?\u001a\u00020\u001b*\u00020*¢\u0006\u0004\b?\u0010@\u001a\u0017\u0010D\u001a\u00020C*\b\u0012\u0004\u0012\u00020B0A¢\u0006\u0004\bD\u0010E\u001a\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020B0A*\u00020C¢\u0006\u0004\bF\u0010G\u001a\u0019\u0010H\u001a\u00020\t*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\bH\u0010I\u001a\u0011\u0010L\u001a\u00020K*\u00020J¢\u0006\u0004\bL\u0010M\u001a\u001c\u0010P\u001a\u00020\u001b*\u00020N2\u0006\u0010O\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bP\u0010Q\u001a\u001c\u0010P\u001a\u00020\u001b*\u00020R2\u0006\u0010O\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bP\u0010S\u001a\u001c\u0010P\u001a\u00020\u0000*\u00020\u001b2\u0006\u0010O\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\bP\u0010T\u001a\u0019\u0010W\u001a\u00020\u0004*\u00020U2\u0006\u0010V\u001a\u00020\u001b¢\u0006\u0004\bW\u0010X\u001a\u0011\u0010Y\u001a\u00020\u001b*\u000205¢\u0006\u0004\bY\u0010Z\u001a!\u0010]\u001a\u00020\t*\u00020[2\u0006\u0010:\u001a\u00020\u001b2\u0006\u0010\\\u001a\u00020;¢\u0006\u0004\b]\u0010^\u001a!\u0010`\u001a\u00020\t*\u00020[2\u0006\u0010_\u001a\u00020\u001b2\u0006\u0010\\\u001a\u00020;¢\u0006\u0004\b`\u0010^\u001a\u0011\u0010b\u001a\u00020\u0007*\u00020a¢\u0006\u0004\bb\u0010c\u001a\u0019\u0010e\u001a\u00020\t*\u00020a2\u0006\u0010d\u001a\u000205¢\u0006\u0004\be\u0010f\u001a\u001e\u0010i\u001a\u00020\u00042\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00040gH\u0086\b¢\u0006\u0004\bi\u0010j\u001a&\u0010k\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00040gH\u0086\b¢\u0006\u0004\bk\u0010l\u001a\u0019\u0010]\u001a\u00020\u001b*\u00020m2\u0006\u0010n\u001a\u00020N¢\u0006\u0004\b]\u0010o\u001a\u001b\u0010p\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\bp\u0010q\u001a\u0011\u0010s\u001a\u00020\u0000*\u00020r¢\u0006\u0004\bs\u0010t\u001a\u0019\u0010v\u001a\u00020\u0000*\u00020\u00072\u0006\u0010u\u001a\u00020\u0000¢\u0006\u0004\bv\u0010w\u001a\u001b\u0010x\u001a\u00020\u001b*\u0004\u0018\u00010\u00072\u0006\u0010u\u001a\u00020\u001b¢\u0006\u0004\bx\u0010q\u001a#\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010y*\b\u0012\u0004\u0012\u00028\u00000A¢\u0006\u0004\bz\u0010{\u001a/\u0010}\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010y2\u0012\u0010|\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H\u0007¢\u0006\u0004\b}\u0010~\u001a;\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0081\u0001\"\u0004\b\u0000\u0010\u007f\"\u0005\b\u0001\u0010\u0080\u0001*\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0081\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0015\u0010\u0085\u0001\u001a\u00020\u0004*\u00030\u0084\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0014\u0010\u0085\u0001\u001a\u00020\u0004*\u00020a¢\u0006\u0006\b\u0085\u0001\u0010\u0087\u0001\u001a\u0015\u0010\u0085\u0001\u001a\u00020\u0004*\u00030\u0088\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0089\u0001\u001a\u001f\u0010\u008d\u0001\u001a\u00020\t*\u00030\u008a\u00012\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0014\u0010\u008f\u0001\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0014\u0010\u008f\u0001\u001a\u00020\u0007*\u00020\u001b¢\u0006\u0006\b\u008f\u0001\u0010\u0091\u0001\u001a\u0017\u0010\u0092\u0001\u001a\u00020\u0004*\u000202H\u0086\b¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0017\u0010\u0094\u0001\u001a\u00020\u0004*\u000202H\u0086\b¢\u0006\u0006\b\u0094\u0001\u0010\u0093\u0001\u001a\u0017\u0010\u0095\u0001\u001a\u00020\u0004*\u000202H\u0086\b¢\u0006\u0006\b\u0095\u0001\u0010\u0093\u0001\u001a:\u0010\u009a\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010y2\u0007\u0010\u0096\u0001\u001a\u0002022\u000e\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0097\u00012\u0007\u0010\u0099\u0001\u001a\u00020\u0007¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a-\u0010\u009f\u0001\u001a\u00020\u0004\"\u0005\b\u0000\u0010\u009c\u0001*\t\u0012\u0004\u0012\u00028\u00000\u009d\u00012\u0007\u0010\u009e\u0001\u001a\u00028\u0000H\u0000¢\u0006\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0017\u0010¡\u0001\u001a\u00020\u0004*\u000202H\u0080\b¢\u0006\u0006\b¡\u0001\u0010\u0093\u0001\u001a\u0017\u0010¢\u0001\u001a\u00020\u0004*\u000202H\u0080\b¢\u0006\u0006\b¢\u0001\u0010\u0093\u0001\u001a0\u0010§\u0001\u001a\u00030¦\u0001*\b0£\u0001j\u0003`¤\u00012\u0013\u0010¥\u0001\u001a\u000e\u0012\n\u0012\b0£\u0001j\u0003`¤\u00010A¢\u0006\u0006\b§\u0001\u0010¨\u0001\u001aF\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010y*\t\u0012\u0004\u0012\u00028\u00000©\u00012\u001a\u0010¬\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0ª\u0001¢\u0006\u0003\b«\u0001H\u0086\b¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001\"\u001a\u0010°\u0001\u001a\u00030¯\u00018\u0006@\u0007X\u0087\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001\"\u001a\u0010³\u0001\u001a\u00030²\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001\"\u001a\u0010¶\u0001\u001a\u00030µ\u00018\u0006@\u0007X\u0087\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001\"\u0019\u0010¸\u0001\u001a\u00020\t8\u0000@\u0001X\u0081\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001\"\u001a\u0010»\u0001\u001a\u00030º\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001\"\u001a\u0010¾\u0001\u001a\u00030½\u00018\u0006@\u0007X\u0087\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001\"\u001a\u0010Á\u0001\u001a\u00030À\u00018\u0006@\u0007X\u0087\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001\"\u0019\u0010Ã\u0001\u001a\u00020C8\u0006@\u0007X\u0087\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001\"\u0019\u0010Å\u0001\u001a\u00020\u00078\u0000@\u0001X\u0081\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001¨\u0006Ç\u0001"}, d2 = {"", "arrayLength", Constants.FLAG_TAG_OFFSET, AnimatedPasterJsonConfig.CONFIG_COUNT, "", "checkOffsetAndCount", "(JJJ)V", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "", "other", "Ljava/util/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", "(Lokhttp3/HttpUrl;Z)Ljava/lang/String;", "value", "", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "indexOfFirstNonAsciiWhitespace", "(Ljava/lang/String;II)I", "indexOfLastNonAsciiWhitespace", "trimSubstring", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "delimiterOffset", "(Ljava/lang/String;Ljava/lang/String;II)I", "", "delimiter", "(Ljava/lang/String;CII)I", "indexOfControlOrNonAscii", "(Ljava/lang/String;)I", "canParseAsIpAddress", "(Ljava/lang/String;)Z", "format", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/BufferedSource;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "checkDuration", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "parseHexDigit", "(C)I", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "(Ljava/util/List;)Lokhttp3/Headers;", "toHeaderList", "(Lokhttp3/Headers;)Ljava/util/List;", "canReuseConnectionFor", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "(Lokhttp3/EventListener;)Lokhttp3/EventListener$Factory;", "", "mask", "and", "(BI)I", "", "(SI)I", "(IJ)J", "Lokio/BufferedSink;", "medium", "writeMedium", "(Lokio/BufferedSink;I)V", "readMedium", "(Lokio/BufferedSource;)I", "Lokio/Source;", "timeUnit", "skipAll", "(Lokio/Source;ILjava/util/concurrent/TimeUnit;)Z", "timeout", "discard", "Ljava/net/Socket;", "peerName", "(Ljava/net/Socket;)Ljava/lang/String;", MessageKey.MSG_SOURCE, "isHealthy", "(Ljava/net/Socket;Lokio/BufferedSource;)Z", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "(Lkotlin/jvm/functions/Function0;)V", "threadName", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lokio/Buffer;", "b", "(Lokio/Buffer;B)I", "indexOfNonWhitespace", "(Ljava/lang/String;I)I", "Lokhttp3/Response;", "headersContentLength", "(Lokhttp3/Response;)J", "defaultValue", "toLongOrDefault", "(Ljava/lang/String;J)J", "toNonNegativeInt", ExifInterface.GPS_DIRECTION_TRUE, "toImmutableList", "(Ljava/util/List;)Ljava/util/List;", MessageKey.CUSTOM_LAYOUT_ELEMENTS, "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "toImmutableMap", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/io/Closeable;", "closeQuietly", "(Ljava/io/Closeable;)V", "(Ljava/net/Socket;)V", "Ljava/net/ServerSocket;", "(Ljava/net/ServerSocket;)V", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "isCivilized", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;)Z", "toHexString", "(J)Ljava/lang/String;", "(I)Ljava/lang/String;", "wait", "(Ljava/lang/Object;)V", "notify", "notifyAll", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", ExifInterface.LONGITUDE_EAST, "", "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "assertThreadHoldsLock", "assertThreadDoesntHoldLock", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "withSuppressed", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "predicate", "filterList", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "Lokio/Options;", "UNICODE_BOMS", "Lokio/Options;", "Ljava/util/TimeZone;", UtcDates.UTC, "Ljava/util/TimeZone;", "assertionsEnabled", "Z", "Lkotlin/text/Regex;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/Regex;", "", "EMPTY_BYTE_ARRAY", "[B", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "EMPTY_HEADERS", "Lokhttp3/Headers;", "okHttpName", "Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 4, 0})
@JvmName(name = "Util")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Util {
    @JvmField
    @NotNull
    public static final byte[] EMPTY_BYTE_ARRAY;
    @JvmField
    @NotNull
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    @JvmField
    @NotNull
    public static final RequestBody EMPTY_REQUEST;
    @JvmField
    @NotNull
    public static final ResponseBody EMPTY_RESPONSE;
    private static final Options UNICODE_BOMS;
    @JvmField
    @NotNull
    public static final TimeZone UTC;
    private static final Regex VERIFY_AS_IP_ADDRESS;
    @JvmField
    public static final boolean assertionsEnabled;
    @JvmField
    @NotNull
    public static final String okHttpName;

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        Options.Companion companion = Options.Companion;
        ByteString.Companion companion2 = ByteString.Companion;
        UNICODE_BOMS = companion.of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        if (timeZone == null) {
            Intrinsics.throwNpe();
        }
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "OkHttpClient::class.java.name");
        okHttpName = StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    public static final <E> void addIfAbsent(@NotNull List<E> list, E e2) {
        if (list.contains(e2)) {
            return;
        }
        list.add(e2);
    }

    public static final int and(byte b, int i2) {
        return b & i2;
    }

    public static final int and(short s, int i2) {
        return s & i2;
    }

    public static final long and(int i2, long j2) {
        return i2 & j2;
    }

    @NotNull
    public static final EventListener.Factory asFactory(@NotNull final EventListener eventListener) {
        return new EventListener.Factory() { // from class: okhttp3.internal.Util$asFactory$1
            @Override // okhttp3.EventListener.Factory
            @NotNull
            public EventListener create(@NotNull Call call) {
                return EventListener.this;
            }
        };
    }

    public static final void assertThreadDoesntHoldLock(@NotNull Object obj) {
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    public static final void assertThreadHoldsLock(@NotNull Object obj) {
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(obj);
        throw new AssertionError(sb.toString());
    }

    public static final boolean canParseAsIpAddress(@NotNull String str) {
        return VERIFY_AS_IP_ADDRESS.matches(str);
    }

    public static final boolean canReuseConnectionFor(@NotNull HttpUrl httpUrl, @NotNull HttpUrl httpUrl2) {
        return Intrinsics.areEqual(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && Intrinsics.areEqual(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(@NotNull String str, long j2, @Nullable TimeUnit timeUnit) {
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        boolean z = true;
        if (!(i2 >= 0)) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j2);
            if (!(millis <= ((long) Integer.MAX_VALUE))) {
                throw new IllegalArgumentException((str + " too large.").toString());
            }
            if (millis == 0 && i2 > 0) {
                z = false;
            }
            if (z) {
                return (int) millis;
            }
            throw new IllegalArgumentException((str + " too small.").toString());
        }
        throw new IllegalStateException("unit == null".toString());
    }

    public static final void checkOffsetAndCount(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(@NotNull Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final String[] concat(@NotNull String[] strArr, @NotNull String str) {
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[ArraysKt___ArraysKt.getLastIndex(strArr2)] = str;
        if (strArr2 != null) {
            return strArr2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
    }

    public static final int delimiterOffset(@NotNull String str, @NotNull String str2, int i2, int i3) {
        while (i2 < i3) {
            if (StringsKt__StringsKt.contains$default((CharSequence) str2, str.charAt(i2), false, 2, (Object) null)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return delimiterOffset(str, str2, i2, i3);
    }

    public static final boolean discard(@NotNull Source source, int i2, @NotNull TimeUnit timeUnit) {
        try {
            return skipAll(source, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final <T> List<T> filterList(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        List<T> emptyList = CollectionsKt__CollectionsKt.emptyList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (function1.invoke(obj).booleanValue()) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                if (emptyList == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<T>");
                }
                TypeIntrinsics.asMutableList(emptyList).add(obj);
            }
        }
        return emptyList;
    }

    @NotNull
    public static final String format(@NotNull String str, @NotNull Object... objArr) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean hasIntersection(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(@NotNull Response response) {
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(@NotNull Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> immutableListOf(@NotNull T... tArr) {
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkExpressionValueIsNotNull(unmodifiableList, "Collections.unmodifiable…sList(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(@NotNull String[] strArr, @NotNull String str, @NotNull Comparator<String> comparator) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(@NotNull String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(@NotNull String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i2, i3);
    }

    public static final int indexOfLastNonAsciiWhitespace(@NotNull String str, int i2, int i3) {
        int i4 = i3 - 1;
        if (i4 >= i2) {
            while (true) {
                char charAt = str.charAt(i4);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4--;
            }
        }
        return i2;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i2, i3);
    }

    public static final int indexOfNonWhitespace(@NotNull String str, int i2) {
        int length = str.length();
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt != ' ' && charAt != '\t') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return indexOfNonWhitespace(str, i2);
    }

    @NotNull
    public static final String[] intersect(@NotNull String[] strArr, @NotNull String[] strArr2, @NotNull Comparator<? super String> comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean isCivilized(@NotNull FileSystem fileSystem, @NotNull File file) {
        Sink sink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                CloseableKt.closeFinally(sink, null);
                return true;
            } catch (IOException unused) {
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(sink, null);
                fileSystem.delete(file);
                return false;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(sink, th);
                throw th2;
            }
        }
    }

    public static final boolean isHealthy(@NotNull Socket socket, @NotNull BufferedSource bufferedSource) {
        try {
            int soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z = !bufferedSource.exhausted();
            socket.setSoTimeout(soTimeout);
            return z;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final void notify(@NotNull Object obj) {
        obj.notify();
    }

    public static final void notifyAll(@NotNull Object obj) {
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    @NotNull
    public static final String peerName(@NotNull Socket socket) {
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
            Intrinsics.checkExpressionValueIsNotNull(hostName, "address.hostName");
            return hostName;
        }
        return remoteSocketAddress.toString();
    }

    @NotNull
    public static final Charset readBomAsCharset(@NotNull BufferedSource bufferedSource, @NotNull Charset charset) throws IOException {
        int select = bufferedSource.select(UNICODE_BOMS);
        if (select != -1) {
            if (select == 0) {
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkExpressionValueIsNotNull(UTF_8, "UTF_8");
                return UTF_8;
            } else if (select == 1) {
                Charset UTF_16BE = StandardCharsets.UTF_16BE;
                Intrinsics.checkExpressionValueIsNotNull(UTF_16BE, "UTF_16BE");
                return UTF_16BE;
            } else if (select == 2) {
                Charset UTF_16LE = StandardCharsets.UTF_16LE;
                Intrinsics.checkExpressionValueIsNotNull(UTF_16LE, "UTF_16LE");
                return UTF_16LE;
            } else if (select != 3) {
                if (select == 4) {
                    return Charsets.INSTANCE.UTF32_LE();
                }
                throw new AssertionError();
            } else {
                return Charsets.INSTANCE.UTF32_BE();
            }
        }
        return charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
        return r4;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T readFieldOrNull(@org.jetbrains.annotations.NotNull java.lang.Object r6, @org.jetbrains.annotations.NotNull java.lang.Class<T> r7, @org.jetbrains.annotations.NotNull java.lang.String r8) {
        /*
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class r1 = r6.getClass()
        L6:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            r3 = 1
            r2 = r2 ^ r3
            r4 = 0
            if (r2 == 0) goto L35
            java.lang.reflect.Field r2 = r1.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L2b
            java.lang.String r5 = "field"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r5)     // Catch: java.lang.NoSuchFieldException -> L2b
            r2.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L2b
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.NoSuchFieldException -> L2b
            boolean r3 = r7.isInstance(r2)     // Catch: java.lang.NoSuchFieldException -> L2b
            if (r3 != 0) goto L26
            goto L2a
        L26:
            java.lang.Object r4 = r7.cast(r2)     // Catch: java.lang.NoSuchFieldException -> L2b
        L2a:
            return r4
        L2b:
            java.lang.Class r1 = r1.getSuperclass()
            java.lang.String r2 = "c.superclass"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            goto L6
        L35:
            java.lang.String r1 = "delegate"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r1)
            r2 = r2 ^ r3
            if (r2 == 0) goto L49
            java.lang.Object r6 = readFieldOrNull(r6, r0, r1)
            if (r6 == 0) goto L49
            java.lang.Object r6 = readFieldOrNull(r6, r7, r8)
            return r6
        L49:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.readFieldOrNull(java.lang.Object, java.lang.Class, java.lang.String):java.lang.Object");
    }

    public static final int readMedium(@NotNull BufferedSource bufferedSource) throws IOException {
        return and(bufferedSource.readByte(), 255) | (and(bufferedSource.readByte(), 255) << 16) | (and(bufferedSource.readByte(), 255) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r5 == Long.MAX_VALUE) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        r11.timeout().clearDeadline();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        r11.timeout().deadlineNanoTime(r0 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (r5 != Long.MAX_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean skipAll(@org.jetbrains.annotations.NotNull okio.Source r11, int r12, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            long r0 = java.lang.System.nanoTime()
            okio.Timeout r2 = r11.timeout()
            boolean r2 = r2.hasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L1d
            okio.Timeout r2 = r11.timeout()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L1e
        L1d:
            r5 = r3
        L1e:
            okio.Timeout r2 = r11.timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            okio.Buffer r12 = new okio.Buffer     // Catch: java.lang.Throwable -> L5a java.io.InterruptedIOException -> L70
            r12.<init>()     // Catch: java.lang.Throwable -> L5a java.io.InterruptedIOException -> L70
        L34:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch: java.lang.Throwable -> L5a java.io.InterruptedIOException -> L70
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L44
            r12.clear()     // Catch: java.lang.Throwable -> L5a java.io.InterruptedIOException -> L70
            goto L34
        L44:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L51
        L49:
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L76
        L51:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
            goto L76
        L5a:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L67
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L6f
        L67:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L6f:
            throw r12
        L70:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L51
            goto L49
        L76:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.skipAll(okio.Source, int, java.util.concurrent.TimeUnit):boolean");
    }

    @NotNull
    public static final ThreadFactory threadFactory(@NotNull final String str, final boolean z) {
        return new ThreadFactory() { // from class: okhttp3.internal.Util$threadFactory$1
            @Override // java.util.concurrent.ThreadFactory
            @NotNull
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static final void threadName(@NotNull String str, @NotNull Function0<Unit> function0) {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            currentThread.setName(name);
            InlineMarker.finallyEnd(1);
        }
    }

    @NotNull
    public static final List<Header> toHeaderList(@NotNull Headers headers) {
        IntRange until = RangesKt___RangesKt.until(0, headers.size());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            arrayList.add(new Header(headers.name(nextInt), headers.value(nextInt)));
        }
        return arrayList;
    }

    @NotNull
    public static final Headers toHeaders(@NotNull List<Header> list) {
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().utf8(), header.component2().utf8());
        }
        return builder.build();
    }

    @NotNull
    public static final String toHexString(long j2) {
        String hexString = Long.toHexString(j2);
        Intrinsics.checkExpressionValueIsNotNull(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    @NotNull
    public static final String toHostHeader(@NotNull HttpUrl httpUrl, boolean z) {
        String host;
        if (StringsKt__StringsKt.contains$default((CharSequence) httpUrl.host(), (CharSequence) ":", false, 2, (Object) null)) {
            host = '[' + httpUrl.host() + ']';
        } else {
            host = httpUrl.host();
        }
        if (z || httpUrl.port() != HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return host + ':' + httpUrl.port();
        }
        return host;
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    @NotNull
    public static final <T> List<T> toImmutableList(@NotNull List<? extends T> list) {
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt___CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkExpressionValueIsNotNull(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    @NotNull
    public static final <K, V> Map<K, V> toImmutableMap(@NotNull Map<K, ? extends V> map) {
        if (map.isEmpty()) {
            return MapsKt__MapsKt.emptyMap();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkExpressionValueIsNotNull(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(@NotNull String str, long j2) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j2;
        }
    }

    public static final int toNonNegativeInt(@Nullable String str, int i2) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    @NotNull
    public static final String trimSubstring(@NotNull String str, int i2, int i3) {
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i2, i3);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i3));
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return trimSubstring(str, i2, i3);
    }

    public static final void wait(@NotNull Object obj) {
        obj.wait();
    }

    @NotNull
    public static final Throwable withSuppressed(@NotNull Exception exc, @NotNull List<? extends Exception> list) {
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception exc2 : list) {
            exc.addSuppressed(exc2);
        }
        return exc;
    }

    public static final void writeMedium(@NotNull BufferedSink bufferedSink, int i2) throws IOException {
        bufferedSink.writeByte((i2 >>> 16) & 255);
        bufferedSink.writeByte((i2 >>> 8) & 255);
        bufferedSink.writeByte(i2 & 255);
    }

    public static final int delimiterOffset(@NotNull String str, char c, int i2, int i3) {
        while (i2 < i3) {
            if (str.charAt(i2) == c) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return delimiterOffset(str, c, i2, i3);
    }

    @NotNull
    public static final String toHexString(int i2) {
        String hexString = Integer.toHexString(i2);
        Intrinsics.checkExpressionValueIsNotNull(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    public static final void closeQuietly(@NotNull Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@NotNull ServerSocket serverSocket) {
        try {
            serverSocket.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(@NotNull Buffer buffer, byte b) {
        int i2 = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b) {
            i2++;
            buffer.readByte();
        }
        return i2;
    }
}
