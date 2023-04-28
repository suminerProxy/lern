package k.b.j4;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import k.b.i2;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StackTraceRecovery.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0014\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\u0001H\u0007\u001a9\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000b2\u0006\u0010\u000e\u001a\u0002H\u000b2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00102\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002\u001a1\u0010\u0016\u001a\u00020\u00172\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u001a\u001a\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\fH\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a+\u0010\u001f\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0002\u0010 \u001a\u001f\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a,\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030#H\u0080\b¢\u0006\u0002\u0010$\u001a!\u0010%\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\u001a \u0010&\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0080\b¢\u0006\u0002\u0010\"\u001a\u001f\u0010'\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a1\u0010(\u001a\u0018\u0012\u0004\u0012\u0002H\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00190)\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010*\u001a\u001c\u0010+\u001a\u00020,*\u00060\u0007j\u0002`\b2\n\u0010-\u001a\u00060\u0007j\u0002`\bH\u0002\u001a#\u0010.\u001a\u00020/*\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0006\u00100\u001a\u00020\u0001H\u0002¢\u0006\u0002\u00101\u001a\u0014\u00102\u001a\u00020\u0017*\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0010\u00103\u001a\u00020,*\u00060\u0007j\u0002`\bH\u0000\u001a\u001b\u00104\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\f\b\u0000\u00105\"\u00020\u00142\u00020\u0014*\f\b\u0000\u00106\"\u00020\u00072\u00020\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"baseContinuationImplClass", "", "baseContinuationImplClassName", "kotlin.jvm.PlatformType", "stackTraceRecoveryClass", "stackTraceRecoveryClassName", "artificialFrame", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "message", "createFinalException", ExifInterface.LONGITUDE_EAST, "", "cause", com.alipay.sdk.util.l.c, "resultStackTrace", "Ljava/util/ArrayDeque;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "createStackTrace", "continuation", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "mergeRecoveredTraces", "", "recoveredStacktrace", "", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", "exception", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "tryCopyAndVerify", "unwrap", "unwrapImpl", "causeAndStacktrace", "Lkotlin/Pair;", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "elementWiseEquals", "", "e", "frameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "initCause", "isArtificial", "sanitizeStackTrace", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class p0 {
    @NotNull

    /* renamed from: a */
    private static final String f29457a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    @NotNull
    private static final String b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String c;

    /* renamed from: d */
    private static final String f29458d;

    static {
        Object m57constructorimpl;
        Object m57constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            m57constructorimpl = Result.m57constructorimpl(Class.forName(f29457a).getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m57constructorimpl = Result.m57constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m60exceptionOrNullimpl(m57constructorimpl) != null) {
            m57constructorimpl = f29457a;
        }
        c = (String) m57constructorimpl;
        try {
            Result.Companion companion3 = Result.Companion;
            m57constructorimpl2 = Result.m57constructorimpl(Class.forName("k.b.j4.p0").getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            m57constructorimpl2 = Result.m57constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m60exceptionOrNullimpl(m57constructorimpl2) != null) {
            m57constructorimpl2 = b;
        }
        f29458d = (String) m57constructorimpl2;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    @i2
    @NotNull
    public static final StackTraceElement d(@NotNull String str) {
        return new StackTraceElement(Intrinsics.stringPlus("\b\b\b(", str), "\b", "\b", -1);
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> e(E e2) {
        boolean z;
        Throwable cause = e2.getCause();
        if (cause != null && Intrinsics.areEqual(cause.getClass(), e2.getClass())) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                i2++;
                if (k(stackTraceElement)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return TuplesKt.to(cause, stackTrace);
            }
            return TuplesKt.to(e2, new StackTraceElement[0]);
        }
        return TuplesKt.to(e2, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E f(E e2, E e3, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(d("Coroutine boundary"));
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int i2 = i(stackTrace, c);
        int i3 = 0;
        if (i2 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            e3.setStackTrace((StackTraceElement[]) array);
            return e3;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + i2];
        for (int i4 = 0; i4 < i2; i4++) {
            stackTraceElementArr[i4] = stackTrace[i4];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i3 + i2] = it.next();
            i3++;
        }
        e3.setStackTrace(stackTraceElementArr);
        return e3;
    }

    private static final ArrayDeque<StackTraceElement> g(CoroutineStackFrame coroutineStackFrame) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (!(coroutineStackFrame instanceof CoroutineStackFrame)) {
                coroutineStackFrame = null;
            }
            coroutineStackFrame = coroutineStackFrame == null ? null : coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean h(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && Intrinsics.areEqual(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && Intrinsics.areEqual(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && Intrinsics.areEqual(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int i(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (Intrinsics.areEqual(str, stackTraceElementArr[i2].getClassName())) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final void j(@NotNull Throwable th, @NotNull Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean k(@NotNull StackTraceElement stackTraceElement) {
        return StringsKt__StringsJVMKt.startsWith$default(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
    }

    private static final void l(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            int i3 = i2 + 1;
            if (k(stackTraceElementArr[i2])) {
                break;
            }
            i2 = i3;
        }
        int i4 = i2 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i4 > length2) {
            return;
        }
        while (true) {
            int i5 = length2 - 1;
            if (h(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i4) {
                return;
            }
            length2 = i5;
        }
    }

    @Nullable
    public static final Object m(@NotNull Throwable th, @NotNull Continuation<?> continuation) {
        if (k.b.z0.e()) {
            if (continuation instanceof CoroutineStackFrame) {
                throw o(th, (CoroutineStackFrame) continuation);
            }
            throw th;
        }
        throw th;
    }

    private static final Object n(Throwable th, Continuation<?> continuation) {
        if (k.b.z0.e()) {
            InlineMarker.mark(0);
            if (continuation instanceof CoroutineStackFrame) {
                throw o(th, (CoroutineStackFrame) continuation);
            }
            throw th;
        }
        throw th;
    }

    public static final <E extends Throwable> E o(E e2, CoroutineStackFrame coroutineStackFrame) {
        Pair e3 = e(e2);
        Throwable th = (Throwable) e3.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) e3.component2();
        Throwable s = s(th);
        if (s == null) {
            return e2;
        }
        ArrayDeque<StackTraceElement> g2 = g(coroutineStackFrame);
        if (g2.isEmpty()) {
            return e2;
        }
        if (th != e2) {
            l(stackTraceElementArr, g2);
        }
        return (E) f(th, s, g2);
    }

    @NotNull
    public static final <E extends Throwable> E p(@NotNull E e2) {
        Throwable s;
        return (k.b.z0.e() && (s = s(e2)) != null) ? (E) r(s) : e2;
    }

    @NotNull
    public static final <E extends Throwable> E q(@NotNull E e2, @NotNull Continuation<?> continuation) {
        return (k.b.z0.e() && (continuation instanceof CoroutineStackFrame)) ? (E) o(e2, (CoroutineStackFrame) continuation) : e2;
    }

    private static final <E extends Throwable> E r(E e2) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int i2 = i(stackTrace, f29458d);
        int i3 = i2 + 1;
        int i4 = i(stackTrace, c);
        int i5 = (length - i2) - (i4 == -1 ? 0 : length - i4);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 == 0) {
                stackTraceElement = d("Coroutine boundary");
            } else {
                stackTraceElement = stackTrace[(i3 + i6) - 1];
            }
            stackTraceElementArr[i6] = stackTraceElement;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    private static final <E extends Throwable> E s(E e2) {
        E e3 = (E) n.h(e2);
        if (e3 == null) {
            return null;
        }
        if ((e2 instanceof k.b.n0) || Intrinsics.areEqual(e3.getMessage(), e2.getMessage())) {
            return e3;
        }
        return null;
    }

    @NotNull
    public static final <E extends Throwable> E t(@NotNull E e2) {
        return !k.b.z0.e() ? e2 : (E) u(e2);
    }

    @NotNull
    public static final <E extends Throwable> E u(@NotNull E e2) {
        E e3 = (E) e2.getCause();
        if (e3 != null && Intrinsics.areEqual(e3.getClass(), e2.getClass())) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                i2++;
                if (k(stackTraceElement)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return e3;
            }
        }
        return e2;
    }
}
