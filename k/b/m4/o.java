package k.b.m4;

import androidx.exifinterface.media.ExifInterface;
import com.umeng.analytics.pro.am;
import i.a.e1.c.i0;
import i.a.e1.c.k0;
import i.a.e1.c.l0;
import i.a.e1.c.n0;
import i.a.e1.c.p0;
import i.a.e1.c.r0;
import i.a.e1.c.z;
import java.util.concurrent.atomic.AtomicReference;
import k.b.d1;
import k.b.e2;
import k.b.g4.g0;
import k.b.m1;
import k.b.n2;
import k.b.v0;
import k.b.x0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RxConvert.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a1\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0007\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0007\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006\u001a \u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u000e\u001a*\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006\u001a*\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a(\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0016"}, d2 = {"_asFlowable", "Lio/reactivex/rxjava3/core/Flowable;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "from", "_asObservable", "Lio/reactivex/rxjava3/core/Observable;", "asCompletable", "Lio/reactivex/rxjava3/core/Completable;", "Lkotlinx/coroutines/Job;", "asFlow", "Lio/reactivex/rxjava3/core/ObservableSource;", "asFlowable", "asMaybe", "Lio/reactivex/rxjava3/core/Maybe;", "Lkotlinx/coroutines/Deferred;", "asObservable", "asSingle", "Lio/reactivex/rxjava3/core/Single;", "kotlinx-coroutines-rx3"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class o {

    /* compiled from: RxConvert.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxConvertKt$asCompletable$1", f = "RxConvert.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends SuspendLambda implements Function2<v0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ n2 $this_asCompletable;
        public int label;

        public a(n2 n2Var, Continuation<? super a> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(v0 v0Var, Continuation<? super Unit> continuation) {
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull v0 v0Var, @Nullable Continuation<? super Unit> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxConvert.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxConvertKt$asFlow$1", f = "RxConvert.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends SuspendLambda implements Function2<g0<? super T>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ n0<T> $this_asFlow;
        private /* synthetic */ Object L$0;
        public int label;

        /* compiled from: RxConvert.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AtomicReference<i.a.e1.d.f> $disposableRef;

            public a(AtomicReference<i.a.e1.d.f> atomicReference) {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        /* compiled from: RxConvert.kt */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0015\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"kotlinx/coroutines/rx3/RxConvertKt$asFlow$1$observer$1", "Lio/reactivex/rxjava3/core/Observer;", "onComplete", "", "onError", "e", "", "onNext", am.aI, "(Ljava/lang/Object;)V", "onSubscribe", "d", "Lio/reactivex/rxjava3/disposables/Disposable;", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: k.b.m4.o$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0645b implements p0<T> {
            public final /* synthetic */ g0<T> b;
            public final /* synthetic */ AtomicReference<i.a.e1.d.f> c;

            public C0645b(g0<? super T> g0Var, AtomicReference<i.a.e1.d.f> atomicReference) {
            }

            @Override // i.a.e1.c.p0
            public void onComplete() {
            }

            @Override // i.a.e1.c.p0
            public void onError(@NotNull Throwable th) {
            }

            @Override // i.a.e1.c.p0
            public void onNext(@NotNull T t) {
            }

            @Override // i.a.e1.c.p0
            public void onSubscribe(@NotNull i.a.e1.d.f fVar) {
            }
        }

        public b(n0<T> n0Var, Continuation<? super b> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        }

        @Nullable
        public final Object invoke(@NotNull g0<? super T> g0Var, @Nullable Continuation<? super Unit> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxConvert.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxConvertKt$asMaybe$1", f = "RxConvert.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends SuspendLambda implements Function2<v0, Continuation<? super T>, Object> {
        public final /* synthetic */ d1<T> $this_asMaybe;
        public int label;

        public c(d1<? extends T> d1Var, Continuation<? super c> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(v0 v0Var, Object obj) {
        }

        @Nullable
        public final Object invoke(@NotNull v0 v0Var, @Nullable Continuation<? super T> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* compiled from: RxConvert.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxConvertKt$asObservable$1$job$1", f = "RxConvert.kt", i = {0}, l = {114}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d extends SuspendLambda implements Function2<v0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ k0<T> $emitter;
        public final /* synthetic */ k.b.i4.i<T> $this_asObservable;
        private /* synthetic */ Object L$0;
        public int label;

        /* compiled from: RxConvert.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class a<T> implements k.b.i4.j, SuspendFunction {
            public final /* synthetic */ k0<T> b;

            public a(k0<T> k0Var) {
            }

            @Override // k.b.i4.j
            @Nullable
            public final Object emit(@NotNull T t, @NotNull Continuation<? super Unit> continuation) {
            }
        }

        public d(k.b.i4.i<? extends T> iVar, k0<T> k0Var, Continuation<? super d> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(v0 v0Var, Continuation<? super Unit> continuation) {
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull v0 v0Var, @Nullable Continuation<? super Unit> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxConvert.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxConvertKt$asSingle$1", f = "RxConvert.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e<T> extends SuspendLambda implements Function2<v0, Continuation<? super T>, Object> {
        public final /* synthetic */ d1<T> $this_asSingle;
        public int label;

        public e(d1<? extends T> d1Var, Continuation<? super e> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(v0 v0Var, Object obj) {
        }

        @Nullable
        public final Object invoke(@NotNull v0 v0Var, @Nullable Continuation<? super T> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    @NotNull
    public static final i.a.e1.c.j a(@NotNull n2 n2Var, @NotNull CoroutineContext coroutineContext) {
        return n.b(coroutineContext, new a(n2Var, null));
    }

    @NotNull
    public static final <T> k.b.i4.i<T> b(@NotNull n0<T> n0Var) {
        return k.b.i4.k.s(new b(n0Var, null));
    }

    @NotNull
    public static final <T> i.a.e1.c.s<T> c(@NotNull k.b.i4.i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        return i.a.e1.c.s.g3(k.b.l4.n.c(iVar, coroutineContext));
    }

    public static /* synthetic */ i.a.e1.c.s d(k.b.i4.i iVar, CoroutineContext coroutineContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return c(iVar, coroutineContext);
    }

    @NotNull
    public static final <T> z<T> e(@NotNull d1<? extends T> d1Var, @NotNull CoroutineContext coroutineContext) {
        return r.b(coroutineContext, new c(d1Var, null));
    }

    @NotNull
    public static final <T> i0<T> f(@NotNull k.b.i4.i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        return i0.s1(new l0(coroutineContext, iVar) { // from class: k.b.m4.b

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CoroutineContext f29514a;
            public final /* synthetic */ k.b.i4.i b;

            @Override // i.a.e1.c.l0
            public final void a(k0 k0Var) {
            }
        });
    }

    public static /* synthetic */ i0 g(k.b.i4.i iVar, CoroutineContext coroutineContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return f(iVar, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(CoroutineContext coroutineContext, k.b.i4.i iVar, k0 k0Var) {
        k0Var.setCancellable(new j(k.b.k.d(e2.b, m1.g().plus(coroutineContext), x0.ATOMIC, new d(iVar, k0Var, null))));
    }

    @NotNull
    public static final <T> r0<T> i(@NotNull d1<? extends T> d1Var, @NotNull CoroutineContext coroutineContext) {
        return w.b(coroutineContext, new e(d1Var, null));
    }

    public static /* synthetic */ i.a.e1.c.s n(k.b.i4.i iVar, CoroutineContext coroutineContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return c(iVar, coroutineContext);
    }

    public static /* synthetic */ i0 o(k.b.i4.i iVar, CoroutineContext coroutineContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return f(iVar, coroutineContext);
    }
}
