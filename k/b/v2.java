package k.b;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k.b.j4.y;
import k.b.n2;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020X2\u00020\u00172\u00020\u007f2\u00030Ã\u0001:\u0006Ò\u0001Ó\u0001Ô\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b!\u0010\"J\u001f\u0010!\u001a\u00020\u00112\u000e\u0010 \u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b!\u0010%J\u0017\u0010&\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010\"J\u0019\u0010)\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010\"J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b2\u0010\"J!\u00105\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b5\u00106J)\u0010;\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002072\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b=\u0010>J(\u0010C\u001a\u00020@2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\rH\u0080\b¢\u0006\u0004\bA\u0010BJ#\u0010D\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u0004\u0018\u0001082\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bF\u0010GJ\u0011\u0010H\u001a\u00060#j\u0002`$¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00060#j\u0002`$H\u0016¢\u0006\u0004\bJ\u0010IJ\u0011\u0010M\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bN\u0010OJ'\u0010P\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u0002072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\rH\u0014¢\u0006\u0004\bU\u0010\"J\u0017\u0010W\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0010¢\u0006\u0004\bV\u0010+J\u0019\u0010Z\u001a\u00020\u00112\b\u0010Y\u001a\u0004\u0018\u00010XH\u0004¢\u0006\u0004\bZ\u0010[JF\u0010d\u001a\u00020c2\u0006\u0010\\\u001a\u00020\u00012\u0006\u0010]\u001a\u00020\u00012'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a¢\u0006\u0004\bd\u0010eJ6\u0010d\u001a\u00020c2'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a¢\u0006\u0004\bd\u0010fJ\u0013\u0010g\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\bg\u0010\u001dJ\u000f\u0010h\u001a\u00020\u0001H\u0002¢\u0006\u0004\bh\u0010iJ\u0013\u0010j\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\bj\u0010\u001dJ&\u0010m\u001a\u00020l2\u0014\u0010k\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110^H\u0082\b¢\u0006\u0004\bm\u0010nJ\u001b\u0010o\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bo\u0010-J\u0019\u0010q\u001a\u00020\u00012\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bp\u0010(J\u001b\u0010s\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\br\u0010-J@\u0010t\u001a\u00020\t2'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a2\u0006\u0010\\\u001a\u00020\u0001H\u0002¢\u0006\u0004\bt\u0010uJ\u000f\u0010w\u001a\u00020/H\u0010¢\u0006\u0004\bv\u00101J\u001f\u0010x\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\bx\u0010yJ.\u0010{\u001a\u00020\u0011\"\n\b\u0000\u0010z\u0018\u0001*\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0082\b¢\u0006\u0004\b{\u0010yJ\u0019\u0010\\\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\\\u0010+J\u0019\u0010|\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b|\u0010\u0016J\u000f\u0010}\u001a\u00020\u0011H\u0014¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0081\u0001\u001a\u00020\u00112\u0007\u0010\u0080\u0001\u001a\u00020\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0084\u0001\u001a\u00020\u00112\u0007\u0010\u0014\u001a\u00030\u0083\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001JI\u0010\u008c\u0001\u001a\u00020\u0011\"\u0005\b\u0000\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0089\u00012\u001d\u0010k\u001a\u0019\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050^ø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001JX\u0010\u0091\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010z\"\u0005\b\u0001\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0089\u00012$\u0010k\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u008e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0093\u0001\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0087\u0001JX\u0010\u0095\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010z\"\u0005\b\u0001\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0089\u00012$\u0010k\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u008e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0090\u0001J\u000f\u0010\u0096\u0001\u001a\u00020\u0001¢\u0006\u0005\b\u0096\u0001\u0010iJ\u001d\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001c\u0010\u009a\u0001\u001a\u00020/2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0011\u0010\u009c\u0001\u001a\u00020/H\u0007¢\u0006\u0005\b\u009c\u0001\u00101J\u0011\u0010\u009d\u0001\u001a\u00020/H\u0016¢\u0006\u0005\b\u009d\u0001\u00101J$\u0010\u009e\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\"\u0010 \u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J(\u0010¢\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J&\u0010¤\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J-\u0010¦\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002072\u0006\u0010\u0018\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0082\u0010¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0019\u0010©\u0001\u001a\u0004\u0018\u000108*\u00030¨\u0001H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001f\u0010«\u0001\u001a\u00020\u0011*\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0005\b«\u0001\u0010yJ&\u0010¬\u0001\u001a\u00060#j\u0002`$*\u00020\r2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/H\u0004¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020X0®\u00018F¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010³\u0001\u001a\u0004\u0018\u00010\r8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010OR\u0016\u0010µ\u0001\u001a\u00020\u00018DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010iR\u0016\u0010·\u0001\u001a\u00020\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010iR\u0016\u0010¸\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010iR\u0013\u0010¹\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010iR\u0013\u0010º\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010iR\u0013\u0010»\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\b»\u0001\u0010iR\u0016\u0010¼\u0001\u001a\u00020\u00018TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010iR\u0019\u0010À\u0001\u001a\u0007\u0012\u0002\b\u00030½\u00018F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010Â\u0001\u001a\u00020\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010iR\u0015\u0010Æ\u0001\u001a\u00030Ã\u00018F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R.\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00192\t\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00198@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00058@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010LR\u001e\u0010Ï\u0001\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010>R\u001b\u0010Ð\u0001\u001a\u00020\u0001*\u0002038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Õ\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "", "active", "<init>", "(Z)V", "", "expect", "Lkotlinx/coroutines/NodeList;", "list", "Lkotlinx/coroutines/JobNode;", "node", "addLastAtomic", "(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z", "", "rootCause", "", "exceptions", "", "addSuppressedExceptions", "(Ljava/lang/Throwable;Ljava/util/List;)V", "state", "afterCompletion", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/ChildJob;", MapBundleKey.OfflineMapKey.OFFLINE_CHILD, "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "awaitInternal$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitInternal", "awaitSuspend", "cause", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelCoroutine", "cancelImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "cancelImpl", "cancelInternal", "(Ljava/lang/Throwable;)V", "cancelMakeCompleting", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancelParent", "", "cancellationExceptionMessage", "()Ljava/lang/String;", "childCancelled", "Lkotlinx/coroutines/Incomplete;", "update", "completeStateFinalization", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)V", "Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/ChildHandleNode;", "lastChild", "proposedUpdate", "continueCompleting", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "createCauseException", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "message", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException", "finalizeFinishingState", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/lang/Object;)Ljava/lang/Object;", "firstChild", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/ChildHandleNode;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "getChildJobCancellationCause", "getCompletedInternal$kotlinx_coroutines_core", "()Ljava/lang/Object;", "getCompletedInternal", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "getFinalRootCause", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/util/List;)Ljava/lang/Throwable;", "getOrPromoteCancellingList", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;", "exception", "handleJobException", "handleOnCompletionException$kotlinx_coroutines_core", "handleOnCompletionException", "Lkotlinx/coroutines/Job;", "parent", "initParentJob", "(Lkotlinx/coroutines/Job;)V", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "joinInternal", "()Z", "joinSuspend", "block", "", "loopOnState", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "makeCancelling", "makeCompleting$kotlinx_coroutines_core", "makeCompleting", "makeCompletingOnce$kotlinx_coroutines_core", "makeCompletingOnce", "makeNode", "(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;", "nameString$kotlinx_coroutines_core", "nameString", "notifyCancelling", "(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V", ExifInterface.GPS_DIRECTION_TRUE, "notifyHandlers", "onCompletionInternal", "onStart", "()V", "Lkotlinx/coroutines/ParentJob;", "parentJob", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "Lkotlinx/coroutines/Empty;", "promoteEmptyToNodeList", "(Lkotlinx/coroutines/Empty;)V", "promoteSingleToNodeList", "(Lkotlinx/coroutines/JobNode;)V", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/coroutines/Continuation;", "registerSelectClause0", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "registerSelectClause1Internal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "registerSelectClause1Internal", "removeNode$kotlinx_coroutines_core", "removeNode", "selectAwaitCompletion$kotlinx_coroutines_core", "selectAwaitCompletion", "start", "", "startInternal", "(Ljava/lang/Object;)I", "stateString", "(Ljava/lang/Object;)Ljava/lang/String;", "toDebugString", "toString", "tryFinalizeSimpleState", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Z", "tryMakeCancelling", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Throwable;)Z", "tryMakeCompleting", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "tryMakeCompletingSlowPath", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Ljava/lang/Object;", "tryWaitForChild", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "nextChild", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;", "notifyCompletion", "toCancellationException", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "getCompletionCause", "completionCause", "getCompletionCauseHandled", "completionCauseHandled", "getHandlesException$kotlinx_coroutines_core", "handlesException", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "getOnCancelComplete$kotlinx_coroutines_core", "onCancelComplete", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "value", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parentHandle", "getState$kotlinx_coroutines_core", "getExceptionOrNull", "exceptionOrNull", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class v2 implements n2, z, f3, k.b.o4.c {
    private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(v2.class, Object.class, "_state");
    @NotNull
    private volatile /* synthetic */ Object _parentHandle;
    @NotNull
    private volatile /* synthetic */ Object _state;

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CancellableContinuationImpl;", "delegate", "Lkotlin/coroutines/Continuation;", "job", "Lkotlinx/coroutines/JobSupport;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "getContinuationCancellationCause", "", "parent", "Lkotlinx/coroutines/Job;", "nameString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends s<T> {
        @NotNull

        /* renamed from: j  reason: collision with root package name */
        private final v2 f29657j;

        public a(@NotNull Continuation<? super T> continuation, @NotNull v2 v2Var) {
            super(continuation, 1);
            this.f29657j = v2Var;
        }

        @Override // k.b.s
        @NotNull
        public String F() {
            return "AwaitContinuation";
        }

        @Override // k.b.s
        @NotNull
        public Throwable w(@NotNull n2 n2Var) {
            Throwable d2;
            Object F0 = this.f29657j.F0();
            return (!(F0 instanceof c) || (d2 = ((c) F0).d()) == null) ? F0 instanceof f0 ? ((f0) F0).f29231a : n2Var.m() : d2;
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", MapBundleKey.OfflineMapKey.OFFLINE_CHILD, "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b extends u2 {
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final v2 f29658f;
        @NotNull

        /* renamed from: g  reason: collision with root package name */
        private final c f29659g;
        @NotNull

        /* renamed from: h  reason: collision with root package name */
        private final y f29660h;
        @Nullable

        /* renamed from: i  reason: collision with root package name */
        private final Object f29661i;

        public b(@NotNull v2 v2Var, @NotNull c cVar, @NotNull y yVar, @Nullable Object obj) {
            this.f29658f = v2Var;
            this.f29659g = cVar;
            this.f29660h = yVar;
            this.f29661i = obj;
        }

        @Override // k.b.h0
        public void f0(@Nullable Throwable th) {
            this.f29658f.q0(this.f29659g, this.f29660h, this.f29661i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            f0(th);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00060\u0018j\u0002`,2\u00020-B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010 \"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001a\u0010\u0002\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0002\u0010%\u001a\u0004\b&\u0010'R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/NodeList;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "exception", "", "addExceptionLocked", "(Ljava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "allocateList", "()Ljava/util/ArrayList;", "proposedException", "", "sealLocked", "(Ljava/lang/Throwable;)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "value", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "exceptionsHolder", "isActive", "()Z", "isCancelling", "setCompleting", "(Z)V", "isSealed", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c implements g2 {
        @NotNull
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        @NotNull
        private volatile /* synthetic */ int _isCompleting;
        @NotNull
        private volatile /* synthetic */ Object _rootCause;
        @NotNull
        private final a3 b;

        public c(@NotNull a3 a3Var, boolean z, @Nullable Throwable th) {
            this.b = a3Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        private final Object c() {
            return this._exceptionsHolder;
        }

        private final void k(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(@NotNull Throwable th) {
            Throwable d2 = d();
            if (d2 == null) {
                l(th);
            } else if (th == d2) {
            } else {
                Object c = c();
                if (c == null) {
                    k(th);
                } else if (!(c instanceof Throwable)) {
                    if (!(c instanceof ArrayList)) {
                        throw new IllegalStateException(Intrinsics.stringPlus("State is ", c).toString());
                    }
                    ((ArrayList) c).add(th);
                } else if (th == c) {
                } else {
                    ArrayList<Throwable> b = b();
                    b.add(c);
                    b.add(th);
                    k(b);
                }
            }
        }

        @Nullable
        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        public final boolean e() {
            return d() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean f() {
            return this._isCompleting;
        }

        @Override // k.b.g2
        @NotNull
        public a3 g() {
            return this.b;
        }

        public final boolean h() {
            k.b.j4.q0 q0Var;
            Object c = c();
            q0Var = w2.f29671h;
            return c == q0Var;
        }

        @NotNull
        public final List<Throwable> i(@Nullable Throwable th) {
            ArrayList<Throwable> arrayList;
            k.b.j4.q0 q0Var;
            Object c = c();
            if (c == null) {
                arrayList = b();
            } else if (c instanceof Throwable) {
                ArrayList<Throwable> b = b();
                b.add(c);
                arrayList = b;
            } else if (!(c instanceof ArrayList)) {
                throw new IllegalStateException(Intrinsics.stringPlus("State is ", c).toString());
            } else {
                arrayList = (ArrayList) c;
            }
            Throwable d2 = d();
            if (d2 != null) {
                arrayList.add(0, d2);
            }
            if (th != null && !Intrinsics.areEqual(th, d2)) {
                arrayList.add(th);
            }
            q0Var = w2.f29671h;
            k(q0Var);
            return arrayList;
        }

        @Override // k.b.g2
        public boolean isActive() {
            return d() == null;
        }

        public final void j(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        public final void l(@Nullable Throwable th) {
            this._rootCause = th;
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + g() + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d extends y.c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k.b.j4.y f29662d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ v2 f29663e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f29664f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k.b.j4.y yVar, v2 v2Var, Object obj) {
            super(yVar);
            this.f29662d = yVar;
            this.f29663e = v2Var;
            this.f29664f = obj;
        }

        @Override // k.b.j4.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull k.b.j4.y yVar) {
            if (this.f29663e.F0() == this.f29664f) {
                return null;
            }
            return k.b.j4.x.a();
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lkotlinx/coroutines/Job;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {952, 954}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e extends RestrictedSuspendLambda implements Function2<SequenceScope<? super n2>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = new e(continuation);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super n2> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0069 -> B:28:0x007f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007c -> B:28:0x007f). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.L$2
                k.b.j4.y r1 = (k.b.j4.y) r1
                java.lang.Object r3 = r7.L$1
                k.b.j4.w r3 = (k.b.j4.w) r3
                java.lang.Object r4 = r7.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.ResultKt.throwOnFailure(r8)
                r8 = r7
                goto L7f
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L84
            L2b:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                kotlin.sequences.SequenceScope r8 = (kotlin.sequences.SequenceScope) r8
                k.b.v2 r1 = k.b.v2.this
                java.lang.Object r1 = r1.F0()
                boolean r4 = r1 instanceof k.b.y
                if (r4 == 0) goto L49
                k.b.y r1 = (k.b.y) r1
                k.b.z r1 = r1.f29684f
                r7.label = r3
                java.lang.Object r8 = r8.yield(r1, r7)
                if (r8 != r0) goto L84
                return r0
            L49:
                boolean r3 = r1 instanceof k.b.g2
                if (r3 == 0) goto L84
                k.b.g2 r1 = (k.b.g2) r1
                k.b.a3 r1 = r1.g()
                if (r1 != 0) goto L56
                goto L84
            L56:
                java.lang.Object r3 = r1.M()
                k.b.j4.y r3 = (k.b.j4.y) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L61:
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r5 != 0) goto L84
                boolean r5 = r1 instanceof k.b.y
                if (r5 == 0) goto L7f
                r5 = r1
                k.b.y r5 = (k.b.y) r5
                k.b.z r5 = r5.f29684f
                r8.L$0 = r4
                r8.L$1 = r3
                r8.L$2 = r1
                r8.label = r2
                java.lang.Object r5 = r4.yield(r5, r8)
                if (r5 != r0) goto L7f
                return r0
            L7f:
                k.b.j4.y r1 = r1.Q()
                goto L61
            L84:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: k.b.v2.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public v2(boolean z) {
        this._state = z ? w2.f29673j : w2.f29672i;
        this._parentHandle = null;
    }

    private final Throwable A0(c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.e()) {
                return new o2(n0(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof x3) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 == th2 || !(th3 instanceof x3)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final a3 D0(g2 g2Var) {
        a3 g2 = g2Var.g();
        if (g2 == null) {
            if (g2Var instanceof s1) {
                return new a3();
            }
            if (g2Var instanceof u2) {
                c1((u2) g2Var);
                return null;
            }
            throw new IllegalStateException(Intrinsics.stringPlus("State should have list: ", g2Var).toString());
        }
        return g2;
    }

    private final boolean J0(g2 g2Var) {
        return (g2Var instanceof c) && ((c) g2Var).e();
    }

    private final boolean M0() {
        Object F0;
        do {
            F0 = F0();
            if (!(F0 instanceof g2)) {
                return false;
            }
        } while (h1(F0) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N0(Continuation<? super Unit> continuation) {
        s sVar = new s(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        sVar.P();
        u.a(sVar, v(new i3(sVar)));
        Object x = sVar.x();
        if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? x : Unit.INSTANCE;
    }

    private final Void O0(Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(F0());
        }
    }

    private final Object P0(Object obj) {
        k.b.j4.q0 q0Var;
        k.b.j4.q0 q0Var2;
        k.b.j4.q0 q0Var3;
        k.b.j4.q0 q0Var4;
        k.b.j4.q0 q0Var5;
        k.b.j4.q0 q0Var6;
        Throwable th = null;
        while (true) {
            Object F0 = F0();
            if (F0 instanceof c) {
                synchronized (F0) {
                    if (((c) F0).h()) {
                        q0Var2 = w2.f29667d;
                        return q0Var2;
                    }
                    boolean e2 = ((c) F0).e();
                    if (obj != null || !e2) {
                        if (th == null) {
                            th = r0(obj);
                        }
                        ((c) F0).a(th);
                    }
                    Throwable d2 = e2 ^ true ? ((c) F0).d() : null;
                    if (d2 != null) {
                        V0(((c) F0).g(), d2);
                    }
                    q0Var = w2.f29666a;
                    return q0Var;
                }
            } else if (!(F0 instanceof g2)) {
                q0Var3 = w2.f29667d;
                return q0Var3;
            } else {
                if (th == null) {
                    th = r0(obj);
                }
                g2 g2Var = (g2) F0;
                if (g2Var.isActive()) {
                    if (n1(g2Var, th)) {
                        q0Var4 = w2.f29666a;
                        return q0Var4;
                    }
                } else {
                    Object o1 = o1(F0, new f0(th, false, 2, null));
                    q0Var5 = w2.f29666a;
                    if (o1 != q0Var5) {
                        q0Var6 = w2.c;
                        if (o1 != q0Var6) {
                            return o1;
                        }
                    } else {
                        throw new IllegalStateException(Intrinsics.stringPlus("Cannot happen in ", F0).toString());
                    }
                }
            }
        }
    }

    private final u2 S0(Function1<? super Throwable, Unit> function1, boolean z) {
        if (z) {
            r0 = function1 instanceof p2 ? (p2) function1 : null;
            if (r0 == null) {
                r0 = new l2(function1);
            }
        } else {
            u2 u2Var = function1 instanceof u2 ? (u2) function1 : null;
            if (u2Var != null) {
                if (z0.b() && !(!(u2Var instanceof p2))) {
                    throw new AssertionError();
                }
                r0 = u2Var;
            }
            if (r0 == null) {
                r0 = new m2(function1);
            }
        }
        r0.h0(this);
        return r0;
    }

    private final y U0(k.b.j4.y yVar) {
        while (yVar.U()) {
            yVar = yVar.R();
        }
        while (true) {
            yVar = yVar.Q();
            if (!yVar.U()) {
                if (yVar instanceof y) {
                    return (y) yVar;
                }
                if (yVar instanceof a3) {
                    return null;
                }
            }
        }
    }

    private final void V0(a3 a3Var, Throwable th) {
        i0 i0Var;
        Y0(th);
        i0 i0Var2 = null;
        for (k.b.j4.y yVar = (k.b.j4.y) a3Var.M(); !Intrinsics.areEqual(yVar, a3Var); yVar = yVar.Q()) {
            if (yVar instanceof p2) {
                u2 u2Var = (u2) yVar;
                try {
                    u2Var.f0(th);
                } catch (Throwable th2) {
                    if (i0Var2 == null) {
                        i0Var = null;
                    } else {
                        ExceptionsKt__ExceptionsKt.addSuppressed(i0Var2, th2);
                        i0Var = i0Var2;
                    }
                    if (i0Var == null) {
                        i0Var2 = new i0("Exception in completion handler " + u2Var + " for " + this, th2);
                    }
                }
            }
        }
        if (i0Var2 != null) {
            H0(i0Var2);
        }
        m0(th);
    }

    private final void W0(a3 a3Var, Throwable th) {
        i0 i0Var;
        i0 i0Var2 = null;
        for (k.b.j4.y yVar = (k.b.j4.y) a3Var.M(); !Intrinsics.areEqual(yVar, a3Var); yVar = yVar.Q()) {
            if (yVar instanceof u2) {
                u2 u2Var = (u2) yVar;
                try {
                    u2Var.f0(th);
                } catch (Throwable th2) {
                    if (i0Var2 == null) {
                        i0Var = null;
                    } else {
                        ExceptionsKt__ExceptionsKt.addSuppressed(i0Var2, th2);
                        i0Var = i0Var2;
                    }
                    if (i0Var == null) {
                        i0Var2 = new i0("Exception in completion handler " + u2Var + " for " + this, th2);
                    }
                }
            }
        }
        if (i0Var2 == null) {
            return;
        }
        H0(i0Var2);
    }

    private final /* synthetic */ <T extends u2> void X0(a3 a3Var, Throwable th) {
        i0 i0Var;
        i0 i0Var2 = null;
        for (k.b.j4.y yVar = (k.b.j4.y) a3Var.M(); !Intrinsics.areEqual(yVar, a3Var); yVar = yVar.Q()) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (yVar instanceof k.b.j4.y) {
                u2 u2Var = (u2) yVar;
                try {
                    u2Var.f0(th);
                } catch (Throwable th2) {
                    if (i0Var2 == null) {
                        i0Var = null;
                    } else {
                        ExceptionsKt__ExceptionsKt.addSuppressed(i0Var2, th2);
                        i0Var = i0Var2;
                    }
                    if (i0Var == null) {
                        i0Var2 = new i0("Exception in completion handler " + u2Var + " for " + this, th2);
                    }
                }
            }
        }
        if (i0Var2 == null) {
            return;
        }
        H0(i0Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [k.b.f2] */
    private final void b1(s1 s1Var) {
        a3 a3Var = new a3();
        if (!s1Var.isActive()) {
            a3Var = new f2(a3Var);
        }
        b.compareAndSet(this, s1Var, a3Var);
    }

    private final void c1(u2 u2Var) {
        u2Var.G(new a3());
        b.compareAndSet(this, u2Var, u2Var.Q());
    }

    private final boolean d0(Object obj, a3 a3Var, u2 u2Var) {
        int d0;
        d dVar = new d(u2Var, this, obj);
        do {
            d0 = a3Var.R().d0(u2Var, a3Var, dVar);
            if (d0 == 1) {
                return true;
            }
        } while (d0 != 2);
        return false;
    }

    private final void e0(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable u = !z0.e() ? th : k.b.j4.p0.u(th);
        for (Throwable th2 : list) {
            if (z0.e()) {
                th2 = k.b.j4.p0.u(th2);
            }
            if (th2 != th && th2 != u && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h0(Continuation<Object> continuation) {
        a aVar = new a(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), this);
        aVar.P();
        u.a(aVar, v(new h3(aVar)));
        Object x = aVar.x();
        if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x;
    }

    private final int h1(Object obj) {
        s1 s1Var;
        if (obj instanceof s1) {
            if (((s1) obj).isActive()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            s1Var = w2.f29673j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, s1Var)) {
                a1();
                return 1;
            }
            return -1;
        } else if (obj instanceof f2) {
            if (b.compareAndSet(this, obj, ((f2) obj).g())) {
                a1();
                return 1;
            }
            return -1;
        } else {
            return 0;
        }
    }

    private final String i1(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof g2 ? ((g2) obj).isActive() ? "Active" : "New" : obj instanceof f0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.e() ? "Cancelling" : cVar.f() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException k1(v2 v2Var, Throwable th, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            return v2Var.j1(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final Object l0(Object obj) {
        k.b.j4.q0 q0Var;
        Object o1;
        k.b.j4.q0 q0Var2;
        do {
            Object F0 = F0();
            if (!(F0 instanceof g2) || ((F0 instanceof c) && ((c) F0).f())) {
                q0Var = w2.f29666a;
                return q0Var;
            }
            o1 = o1(F0, new f0(r0(obj), false, 2, null));
            q0Var2 = w2.c;
        } while (o1 == q0Var2);
        return o1;
    }

    private final boolean m0(Throwable th) {
        if (L0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        x E0 = E0();
        return (E0 == null || E0 == c3.b) ? z : E0.d(th) || z;
    }

    private final boolean m1(g2 g2Var, Object obj) {
        if (z0.b()) {
            if (!((g2Var instanceof s1) || (g2Var instanceof u2))) {
                throw new AssertionError();
            }
        }
        if (!z0.b() || (!(obj instanceof f0))) {
            if (b.compareAndSet(this, g2Var, w2.g(obj))) {
                Y0(null);
                Z0(obj);
                p0(g2Var, obj);
                return true;
            }
            return false;
        }
        throw new AssertionError();
    }

    private final boolean n1(g2 g2Var, Throwable th) {
        if (!z0.b() || (!(g2Var instanceof c))) {
            if (!z0.b() || g2Var.isActive()) {
                a3 D0 = D0(g2Var);
                if (D0 == null) {
                    return false;
                }
                if (b.compareAndSet(this, g2Var, new c(D0, false, th))) {
                    V0(D0, th);
                    return true;
                }
                return false;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private final Object o1(Object obj, Object obj2) {
        k.b.j4.q0 q0Var;
        k.b.j4.q0 q0Var2;
        if (!(obj instanceof g2)) {
            q0Var2 = w2.f29666a;
            return q0Var2;
        } else if (((obj instanceof s1) || (obj instanceof u2)) && !(obj instanceof y) && !(obj2 instanceof f0)) {
            if (m1((g2) obj, obj2)) {
                return obj2;
            }
            q0Var = w2.c;
            return q0Var;
        } else {
            return p1((g2) obj, obj2);
        }
    }

    private final void p0(g2 g2Var, Object obj) {
        x E0 = E0();
        if (E0 != null) {
            E0.dispose();
            g1(c3.b);
        }
        f0 f0Var = obj instanceof f0 ? (f0) obj : null;
        Throwable th = f0Var != null ? f0Var.f29231a : null;
        if (g2Var instanceof u2) {
            try {
                ((u2) g2Var).f0(th);
                return;
            } catch (Throwable th2) {
                H0(new i0("Exception in completion handler " + g2Var + " for " + this, th2));
                return;
            }
        }
        a3 g2 = g2Var.g();
        if (g2 == null) {
            return;
        }
        W0(g2, th);
    }

    private final Object p1(g2 g2Var, Object obj) {
        k.b.j4.q0 q0Var;
        k.b.j4.q0 q0Var2;
        k.b.j4.q0 q0Var3;
        a3 D0 = D0(g2Var);
        if (D0 == null) {
            q0Var3 = w2.c;
            return q0Var3;
        }
        c cVar = g2Var instanceof c ? (c) g2Var : null;
        if (cVar == null) {
            cVar = new c(D0, false, null);
        }
        synchronized (cVar) {
            if (cVar.f()) {
                q0Var2 = w2.f29666a;
                return q0Var2;
            }
            cVar.j(true);
            if (cVar != g2Var && !b.compareAndSet(this, g2Var, cVar)) {
                q0Var = w2.c;
                return q0Var;
            }
            if (z0.b() && !(!cVar.h())) {
                throw new AssertionError();
            }
            boolean e2 = cVar.e();
            f0 f0Var = obj instanceof f0 ? (f0) obj : null;
            if (f0Var != null) {
                cVar.a(f0Var.f29231a);
            }
            Throwable d2 = true ^ e2 ? cVar.d() : null;
            Unit unit = Unit.INSTANCE;
            if (d2 != null) {
                V0(D0, d2);
            }
            y v0 = v0(g2Var);
            if (v0 != null && q1(cVar, v0, obj)) {
                return w2.b;
            }
            return u0(cVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(c cVar, y yVar, Object obj) {
        if (z0.b()) {
            if (!(F0() == cVar)) {
                throw new AssertionError();
            }
        }
        y U0 = U0(yVar);
        if (U0 == null || !q1(cVar, U0, obj)) {
            f0(u0(cVar, obj));
        }
    }

    private final boolean q1(c cVar, y yVar, Object obj) {
        while (n2.a.f(yVar.f29684f, false, false, new b(this, cVar, yVar, obj), 1, null) == c3.b) {
            yVar = U0(yVar);
            if (yVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable r0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new o2(n0(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((f3) obj).C();
    }

    public static /* synthetic */ o2 t0(v2 v2Var, String str, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            if ((i2 & 2) != 0) {
                th = null;
            }
            if (str == null) {
                str = v2Var.n0();
            }
            return new o2(str, th, v2Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    private final Object u0(c cVar, Object obj) {
        boolean e2;
        Throwable A0;
        boolean z = true;
        if (z0.b()) {
            if (!(F0() == cVar)) {
                throw new AssertionError();
            }
        }
        if (!z0.b() || (!cVar.h())) {
            if (!z0.b() || cVar.f()) {
                f0 f0Var = obj instanceof f0 ? (f0) obj : null;
                Throwable th = f0Var == null ? null : f0Var.f29231a;
                synchronized (cVar) {
                    e2 = cVar.e();
                    List<Throwable> i2 = cVar.i(th);
                    A0 = A0(cVar, i2);
                    if (A0 != null) {
                        e0(A0, i2);
                    }
                }
                if (A0 != null && A0 != th) {
                    obj = new f0(A0, false, 2, null);
                }
                if (A0 != null) {
                    if (!m0(A0) && !G0(A0)) {
                        z = false;
                    }
                    if (z) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                        ((f0) obj).b();
                    }
                }
                if (!e2) {
                    Y0(A0);
                }
                Z0(obj);
                boolean compareAndSet = b.compareAndSet(this, cVar, w2.g(obj));
                if (!z0.b() || compareAndSet) {
                    p0(cVar, obj);
                    return obj;
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private final y v0(g2 g2Var) {
        y yVar = g2Var instanceof y ? (y) g2Var : null;
        if (yVar == null) {
            a3 g2 = g2Var.g();
            if (g2 == null) {
                return null;
            }
            return U0(g2);
        }
        return yVar;
    }

    private final Throwable z0(Object obj) {
        f0 f0Var = obj instanceof f0 ? (f0) obj : null;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f29231a;
    }

    public boolean B0() {
        return true;
    }

    @Override // k.b.f3
    @NotNull
    public CancellationException C() {
        Throwable th;
        Object F0 = F0();
        if (F0 instanceof c) {
            th = ((c) F0).d();
        } else if (F0 instanceof f0) {
            th = ((f0) F0).f29231a;
        } else if (F0 instanceof g2) {
            throw new IllegalStateException(Intrinsics.stringPlus("Cannot be cancelling child in this state: ", F0).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        return cancellationException == null ? new o2(Intrinsics.stringPlus("Parent job is ", i1(F0)), th, this) : cancellationException;
    }

    public boolean C0() {
        return false;
    }

    @Nullable
    public final x E0() {
        return (x) this._parentHandle;
    }

    @Nullable
    public final Object F0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof k.b.j4.j0)) {
                return obj;
            }
            ((k.b.j4.j0) obj).c(this);
        }
    }

    @Override // k.b.n2
    @Nullable
    public final Object G(@NotNull Continuation<? super Unit> continuation) {
        if (!M0()) {
            r2.z(continuation.getContext());
            return Unit.INSTANCE;
        }
        Object N0 = N0(continuation);
        return N0 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? N0 : Unit.INSTANCE;
    }

    public boolean G0(@NotNull Throwable th) {
        return false;
    }

    public void H0(@NotNull Throwable th) {
        throw th;
    }

    public final void I0(@Nullable n2 n2Var) {
        if (z0.b()) {
            if (!(E0() == null)) {
                throw new AssertionError();
            }
        }
        if (n2Var == null) {
            g1(c3.b);
            return;
        }
        n2Var.start();
        x X = n2Var.X(this);
        g1(X);
        if (e()) {
            X.dispose();
            g1(c3.b);
        }
    }

    public final boolean K0() {
        return F0() instanceof f0;
    }

    public boolean L0() {
        return false;
    }

    public final boolean Q0(@Nullable Object obj) {
        Object o1;
        k.b.j4.q0 q0Var;
        k.b.j4.q0 q0Var2;
        do {
            o1 = o1(F0(), obj);
            q0Var = w2.f29666a;
            if (o1 == q0Var) {
                return false;
            }
            if (o1 == w2.b) {
                return true;
            }
            q0Var2 = w2.c;
        } while (o1 == q0Var2);
        f0(o1);
        return true;
    }

    @Nullable
    public final Object R0(@Nullable Object obj) {
        Object o1;
        k.b.j4.q0 q0Var;
        k.b.j4.q0 q0Var2;
        do {
            o1 = o1(F0(), obj);
            q0Var = w2.f29666a;
            if (o1 != q0Var) {
                q0Var2 = w2.c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, z0(obj));
            }
        } while (o1 == q0Var2);
        return o1;
    }

    @Override // k.b.n2
    @NotNull
    public final k.b.o4.c T() {
        return this;
    }

    @NotNull
    public String T0() {
        return a1.a(this);
    }

    @Override // k.b.n2
    @NotNull
    public final x X(@NotNull z zVar) {
        return (x) n2.a.f(this, true, false, new y(zVar), 2, null);
    }

    public void Y0(@Nullable Throwable th) {
    }

    public void Z0(@Nullable Object obj) {
    }

    @Override // k.b.n2
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(Throwable th) {
        CancellationException k1 = th == null ? null : k1(this, th, null, 1, null);
        if (k1 == null) {
            k1 = new o2(n0(), null, this);
        }
        k0(k1);
        return true;
    }

    public void a1() {
    }

    @Override // k.b.n2
    public void b(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new o2(n0(), null, this);
        }
        k0(cancellationException);
    }

    @Override // k.b.n2
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        n2.a.a(this);
    }

    public final <T, R> void d1(@NotNull k.b.o4.f<? super R> fVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        Object F0;
        do {
            F0 = F0();
            if (fVar.i()) {
                return;
            }
            if (!(F0 instanceof g2)) {
                if (fVar.o()) {
                    if (F0 instanceof f0) {
                        fVar.t(((f0) F0).f29231a);
                        return;
                    } else {
                        k.b.k4.b.d(function2, w2.o(F0), fVar.p());
                        return;
                    }
                }
                return;
            }
        } while (h1(F0) != 0);
        fVar.l(v(new m3(fVar, function2)));
    }

    @Override // k.b.n2
    public final boolean e() {
        return !(F0() instanceof g2);
    }

    public final void e1(@NotNull u2 u2Var) {
        Object F0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        s1 s1Var;
        do {
            F0 = F0();
            if (!(F0 instanceof u2)) {
                if (!(F0 instanceof g2) || ((g2) F0).g() == null) {
                    return;
                }
                u2Var.X();
                return;
            } else if (F0 != u2Var) {
                return;
            } else {
                atomicReferenceFieldUpdater = b;
                s1Var = w2.f29673j;
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, F0, s1Var));
    }

    public void f0(@Nullable Object obj) {
    }

    public final <T, R> void f1(@NotNull k.b.o4.f<? super R> fVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        Object F0 = F0();
        if (F0 instanceof f0) {
            fVar.t(((f0) F0).f29231a);
        } else {
            k.b.k4.a.f(function2, w2.o(F0), fVar.p(), null, 4, null);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) n2.a.d(this, r, function2);
    }

    @Nullable
    public final Object g0(@NotNull Continuation<Object> continuation) {
        Object F0;
        do {
            F0 = F0();
            if (!(F0 instanceof g2)) {
                if (F0 instanceof f0) {
                    Throwable th = ((f0) F0).f29231a;
                    if (z0.e()) {
                        if (continuation instanceof CoroutineStackFrame) {
                            throw k.b.j4.p0.o(th, (CoroutineStackFrame) continuation);
                        }
                        throw th;
                    }
                    throw th;
                }
                return w2.o(F0);
            }
        } while (h1(F0) < 0);
        return h0(continuation);
    }

    public final void g1(@Nullable x xVar) {
        this._parentHandle = xVar;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) n2.a.e(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.Key<?> getKey() {
        return n2.v0;
    }

    public final boolean i0(@Nullable Throwable th) {
        return j0(th);
    }

    @Override // k.b.n2
    public boolean isActive() {
        Object F0 = F0();
        return (F0 instanceof g2) && ((g2) F0).isActive();
    }

    @Override // k.b.n2
    public final boolean isCancelled() {
        Object F0 = F0();
        return (F0 instanceof f0) || ((F0 instanceof c) && ((c) F0).e());
    }

    @Override // k.b.n2
    @NotNull
    public final Sequence<n2> j() {
        return SequencesKt__SequenceBuilderKt.sequence(new e(null));
    }

    public final boolean j0(@Nullable Object obj) {
        Object obj2;
        k.b.j4.q0 q0Var;
        k.b.j4.q0 q0Var2;
        k.b.j4.q0 q0Var3;
        obj2 = w2.f29666a;
        if (C0() && (obj2 = l0(obj)) == w2.b) {
            return true;
        }
        q0Var = w2.f29666a;
        if (obj2 == q0Var) {
            obj2 = P0(obj);
        }
        q0Var2 = w2.f29666a;
        if (obj2 == q0Var2 || obj2 == w2.b) {
            return true;
        }
        q0Var3 = w2.f29667d;
        if (obj2 == q0Var3) {
            return false;
        }
        f0(obj2);
        return true;
    }

    @NotNull
    public final CancellationException j1(@NotNull Throwable th, @Nullable String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = n0();
            }
            cancellationException = new o2(str, th, this);
        }
        return cancellationException;
    }

    @Nullable
    public final Throwable k() {
        Object F0 = F0();
        if (!(F0 instanceof g2)) {
            return z0(F0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public void k0(@NotNull Throwable th) {
        j0(th);
    }

    @Override // k.b.n2
    @NotNull
    public final p1 l(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1) {
        u2 S0 = S0(function1, z);
        while (true) {
            Object F0 = F0();
            if (F0 instanceof s1) {
                s1 s1Var = (s1) F0;
                if (s1Var.isActive()) {
                    if (b.compareAndSet(this, F0, S0)) {
                        return S0;
                    }
                } else {
                    b1(s1Var);
                }
            } else {
                if (F0 instanceof g2) {
                    a3 g2 = ((g2) F0).g();
                    if (g2 == null) {
                        Objects.requireNonNull(F0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        c1((u2) F0);
                    } else {
                        p1 p1Var = c3.b;
                        if (z && (F0 instanceof c)) {
                            synchronized (F0) {
                                r3 = ((c) F0).d();
                                if (r3 == null || ((function1 instanceof y) && !((c) F0).f())) {
                                    if (d0(F0, g2, S0)) {
                                        if (r3 == null) {
                                            return S0;
                                        }
                                        p1Var = S0;
                                    }
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                        if (r3 != null) {
                            if (z2) {
                                function1.invoke(r3);
                            }
                            return p1Var;
                        } else if (d0(F0, g2, S0)) {
                            return S0;
                        }
                    }
                } else {
                    if (z2) {
                        f0 f0Var = F0 instanceof f0 ? (f0) F0 : null;
                        function1.invoke(f0Var != null ? f0Var.f29231a : null);
                    }
                    return c3.b;
                }
            }
        }
    }

    @i2
    @NotNull
    public final String l1() {
        return T0() + '{' + i1(F0()) + '}';
    }

    @Override // k.b.n2
    @NotNull
    public final CancellationException m() {
        Object F0 = F0();
        if (!(F0 instanceof c)) {
            if (F0 instanceof g2) {
                throw new IllegalStateException(Intrinsics.stringPlus("Job is still new or active: ", this).toString());
            }
            return F0 instanceof f0 ? k1(this, ((f0) F0).f29231a, null, 1, null) : new o2(Intrinsics.stringPlus(a1.a(this), " has completed normally"), null, this);
        }
        Throwable d2 = ((c) F0).d();
        CancellationException j1 = d2 != null ? j1(d2, Intrinsics.stringPlus(a1.a(this), " is cancelling")) : null;
        if (j1 != null) {
            return j1;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Job is still new or active: ", this).toString());
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return n2.a.g(this, key);
    }

    @Override // k.b.o4.c
    public final <R> void n(@NotNull k.b.o4.f<? super R> fVar, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        Object F0;
        do {
            F0 = F0();
            if (fVar.i()) {
                return;
            }
            if (!(F0 instanceof g2)) {
                if (fVar.o()) {
                    k.b.k4.b.c(function1, fVar.p());
                    return;
                }
                return;
            }
        } while (h1(F0) != 0);
        fVar.l(v(new n3(fVar, function1)));
    }

    @NotNull
    public String n0() {
        return "Job was cancelled";
    }

    public boolean o0(@NotNull Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return j0(th) && B0();
    }

    @Override // k.b.z
    public final void p(@NotNull f3 f3Var) {
        j0(f3Var);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return n2.a.h(this, coroutineContext);
    }

    @NotNull
    public final o2 s0(@Nullable String str, @Nullable Throwable th) {
        if (str == null) {
            str = n0();
        }
        return new o2(str, th, this);
    }

    @Override // k.b.n2
    public final boolean start() {
        int h1;
        do {
            h1 = h1(F0());
            if (h1 == 0) {
                return false;
            }
        } while (h1 != 1);
        return true;
    }

    @NotNull
    public String toString() {
        return l1() + '@' + a1.b(this);
    }

    @Override // k.b.n2
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public n2 u(@NotNull n2 n2Var) {
        return n2.a.i(this, n2Var);
    }

    @Override // k.b.n2
    @NotNull
    public final p1 v(@NotNull Function1<? super Throwable, Unit> function1) {
        return l(false, true, function1);
    }

    @Nullable
    public final Object w0() {
        Object F0 = F0();
        if (!(F0 instanceof g2)) {
            if (!(F0 instanceof f0)) {
                return w2.o(F0);
            }
            throw ((f0) F0).f29231a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Nullable
    public final Throwable x0() {
        Object F0 = F0();
        if (F0 instanceof c) {
            Throwable d2 = ((c) F0).d();
            if (d2 != null) {
                return d2;
            }
            throw new IllegalStateException(Intrinsics.stringPlus("Job is still new or active: ", this).toString());
        } else if (!(F0 instanceof g2)) {
            if (F0 instanceof f0) {
                return ((f0) F0).f29231a;
            }
            return null;
        } else {
            throw new IllegalStateException(Intrinsics.stringPlus("Job is still new or active: ", this).toString());
        }
    }

    public final boolean y0() {
        Object F0 = F0();
        return (F0 instanceof f0) && ((f0) F0).a();
    }
}
