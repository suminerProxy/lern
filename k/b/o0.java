package k.b;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00070\rH\u0080\b¢\u0006\u0002\u0010\u000e\u001a4\u0010\u000f\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00070\rH\u0080\b¢\u0006\u0002\u0010\u0011\u001a\f\u0010\u0012\u001a\u00020\u0003*\u00020\u0003H\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u0003*\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0003H\u0007\u001a\u0013\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016*\u00020\u0017H\u0080\u0010\u001a(\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u001a"}, d2 = {"DEBUG_THREAD_NAME_SEPARATOR", "", "coroutineName", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "withContinuationContext", ExifInterface.GPS_DIRECTION_TRUE, "continuation", "Lkotlin/coroutines/Continuation;", "countOrElement", "", "block", "Lkotlin/Function0;", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withCoroutineContext", "context", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "foldCopiesForChildCoroutine", "newCoroutineContext", "Lkotlinx/coroutines/CoroutineScope;", "undispatchedCompletion", "Lkotlinx/coroutines/UndispatchedCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateUndispatchedCompletion", "oldValue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class o0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private static final String f29592a = " @";

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "combined", "it", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends Lambda implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {
        public static final a INSTANCE = null;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        }

        @NotNull
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final CoroutineContext invoke2(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext.Element element) {
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", com.alipay.sdk.util.l.c, "it", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(ZLkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b extends Lambda implements Function2<Boolean, CoroutineContext.Element, Boolean> {
        public static final b INSTANCE = null;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, CoroutineContext.Element element) {
        }

        @NotNull
        public final Boolean invoke(boolean z, @NotNull CoroutineContext.Element element) {
        }
    }

    private static final CoroutineContext a(CoroutineContext coroutineContext) {
    }

    @Nullable
    public static final String b(@NotNull CoroutineContext coroutineContext) {
    }

    @c2
    @NotNull
    public static final CoroutineContext c(@NotNull v0 v0Var, @NotNull CoroutineContext coroutineContext) {
    }

    @Nullable
    public static final b4<?> d(@NotNull CoroutineStackFrame coroutineStackFrame) {
    }

    @Nullable
    public static final b4<?> e(@NotNull Continuation<?> continuation, @NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
    }

    public static final <T> T f(@NotNull Continuation<?> continuation, @Nullable Object obj, @NotNull Function0<? extends T> function0) {
    }

    public static final <T> T g(@NotNull CoroutineContext coroutineContext, @Nullable Object obj, @NotNull Function0<? extends T> function0) {
    }
}
