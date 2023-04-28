package k.b.l4;

import androidx.exifinterface.media.ExifInterface;
import com.umeng.analytics.pro.am;
import k.b.g4.g0;
import k.b.i2;
import k.b.v0;
import kotlin.BuilderInference;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* compiled from: Publish.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052/\b\u0001\u0010\f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0003¢\u0006\u0002\b\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001au\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00052\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032-\u0010\f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0003¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a[\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\u00020\u00142\b\b\u0002\u0010\u000b\u001a\u00020\u00052/\b\u0001\u0010\f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0003¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\" \u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"CLOSED", "", "DEFAULT_HANDLER", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext;", "", "SIGNALLED", "publish", "Lorg/reactivestreams/Publisher;", ExifInterface.GPS_DIRECTION_TRUE, "context", "block", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lorg/reactivestreams/Publisher;", "publishInternal", "scope", "Lkotlinx/coroutines/CoroutineScope;", "exceptionOnCancelHandler", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lorg/reactivestreams/Publisher;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lorg/reactivestreams/Publisher;", "kotlinx-coroutines-reactive"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final long f29496a = -1;
    private static final long b = -2;
    @NotNull
    private static final Function2<Throwable, CoroutineContext, Unit> c = null;

    /* compiled from: Publish.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", am.aI, "", "ctx", "Lkotlin/coroutines/CoroutineContext;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends Lambda implements Function2<Throwable, CoroutineContext, Unit> {
        public static final a INSTANCE = null;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th, CoroutineContext coroutineContext) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Throwable th, @NotNull CoroutineContext coroutineContext) {
        }
    }

    public static /* synthetic */ void a(v0 v0Var, CoroutineContext coroutineContext, Function2 function2, Function2 function22, Subscriber subscriber) {
    }

    @NotNull
    public static final <T> Publisher<T> b(@NotNull CoroutineContext coroutineContext, @BuilderInference @NotNull Function2<? super g0<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "CoroutineScope.publish is deprecated in favour of top-level publish", replaceWith = @ReplaceWith(expression = "publish(context, block)", imports = {}))
    public static final /* synthetic */ Publisher c(v0 v0Var, CoroutineContext coroutineContext, @BuilderInference Function2 function2) {
    }

    public static /* synthetic */ Publisher d(CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
    }

    public static /* synthetic */ Publisher e(v0 v0Var, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
    }

    @i2
    @NotNull
    public static final <T> Publisher<T> f(@NotNull v0 v0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super Throwable, ? super CoroutineContext, Unit> function2, @NotNull Function2<? super g0<? super T>, ? super Continuation<? super Unit>, ? extends Object> function22) {
    }

    private static final void g(v0 v0Var, CoroutineContext coroutineContext, Function2 function2, Function2 function22, Subscriber subscriber) {
    }
}
