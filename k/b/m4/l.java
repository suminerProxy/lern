package k.b.m4;

import androidx.exifinterface.media.ExifInterface;
import i.a.e1.c.f0;
import i.a.e1.c.n0;
import k.b.g4.i0;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RxChannel.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a5\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a5\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0001\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"collect", "", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/rxjava3/core/MaybeSource;", "action", "Lkotlin/Function1;", "(Lio/reactivex/rxjava3/core/MaybeSource;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/rxjava3/core/ObservableSource;", "(Lio/reactivex/rxjava3/core/ObservableSource;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openSubscription", "Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-rx3"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class l {

    /* compiled from: RxChannel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxChannelKt", f = "RxChannel.kt", i = {0, 0}, l = {101}, m = "collect", n = {"action", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public a(Continuation<? super a> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* compiled from: RxChannel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxChannelKt", f = "RxChannel.kt", i = {0, 0}, l = {101}, m = "collect", n = {"action", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public b(Continuation<? super b> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull f0<T> f0Var, @NotNull Function1<? super T, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
    }

    @Nullable
    public static final <T> Object b(@NotNull n0<T> n0Var, @NotNull Function1<? super T, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
    }

    private static final <T> Object c(f0<T> f0Var, Function1<? super T, Unit> function1, Continuation<? super Unit> continuation) {
    }

    private static final <T> Object d(n0<T> n0Var, Function1<? super T, Unit> function1, Continuation<? super Unit> continuation) {
    }

    @PublishedApi
    @NotNull
    public static final <T> i0<T> e(@NotNull f0<T> f0Var) {
    }

    @PublishedApi
    @NotNull
    public static final <T> i0<T> f(@NotNull n0<T> n0Var) {
    }
}
