package k.b.i4;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.thumbplayer.api.TPOptionalID;
import k.b.n2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\b\f\u001aM\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u0019\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0002*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u001cH\u0002¢\u0006\u0002\b\u001d\u001aS\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012-\u0010\u001f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\"\u0012\u0006\u0012\u0004\u0018\u00010#0 ¢\u0006\u0002\b$ø\u0001\u0000¢\u0006\u0002\u0010%\u001a6\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a/\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010)\u001a9\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0002¢\u0006\u0002\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"asSharedFlow", "Lkotlinx/coroutines/flow/SharedFlow;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/MutableSharedFlow;", "asStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "configureSharing", "Lkotlinx/coroutines/flow/SharingConfig;", "Lkotlinx/coroutines/flow/Flow;", "replay", "", "configureSharing$FlowKt__ShareKt", "launchSharing", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "upstream", "shared", "started", "Lkotlinx/coroutines/flow/SharingStarted;", "initialValue", "launchSharing$FlowKt__ShareKt", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/Job;", "launchSharingDeferred", "", com.alipay.sdk.util.l.c, "Lkotlinx/coroutines/CompletableDeferred;", "launchSharingDeferred$FlowKt__ShareKt", "onSubscription", "action", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/SharedFlow;", "shareIn", "scope", "stateIn", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final /* synthetic */ class z {

    /* compiled from: Share.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, TPOptionalID.OPTION_ID_BEFORE_BOOL_RELEASE_MEDIA_CODEC_WHEN_SET_SURFACE, 225}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends SuspendLambda implements Function2<k.b.v0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ T $initialValue;
        public final /* synthetic */ d0<T> $shared;
        public final /* synthetic */ o0 $started;
        public final /* synthetic */ i<T> $upstream;
        public int label;

        /* compiled from: Share.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: k.b.i4.z$a$a */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0641a extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {
            public /* synthetic */ int I$0;
            public int label;

            public C0641a(Continuation<? super C0641a> continuation) {
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            }

            @Nullable
            public final Object invoke(int i2, @Nullable Continuation<? super Boolean> continuation) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
            }
        }

        /* compiled from: Share.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class b extends SuspendLambda implements Function2<m0, Continuation<? super Unit>, Object> {
            public final /* synthetic */ T $initialValue;
            public final /* synthetic */ d0<T> $shared;
            public final /* synthetic */ i<T> $upstream;
            public /* synthetic */ Object L$0;
            public int label;

            /* compiled from: Share.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: k.b.i4.z$a$b$a */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
            public /* synthetic */ class C0642a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f29407a = null;
            }

            public b(i<? extends T> iVar, d0<T> d0Var, T t, Continuation<? super b> continuation) {
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(m0 m0Var, Continuation<? super Unit> continuation) {
            }

            @Nullable
            /* renamed from: invoke */
            public final Object invoke2(@NotNull m0 m0Var, @Nullable Continuation<? super Unit> continuation) {
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
            }
        }

        public a(o0 o0Var, i<? extends T> iVar, d0<T> d0Var, T t, Continuation<? super a> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(k.b.v0 v0Var, Continuation<? super Unit> continuation) {
        }

        @Nullable
        /* renamed from: invoke */
        public final Object invoke2(@NotNull k.b.v0 v0Var, @Nullable Continuation<? super Unit> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* compiled from: Share.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b extends SuspendLambda implements Function2<k.b.v0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ k.b.a0<t0<T>> $result;
        public final /* synthetic */ i<T> $upstream;
        private /* synthetic */ Object L$0;
        public int label;

        /* compiled from: Share.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class a<T> implements j, SuspendFunction {
            public final /* synthetic */ Ref.ObjectRef<e0<T>> b;
            public final /* synthetic */ k.b.v0 c;

            /* renamed from: d */
            public final /* synthetic */ k.b.a0<t0<T>> f29408d;

            public a(Ref.ObjectRef<e0<T>> objectRef, k.b.v0 v0Var, k.b.a0<t0<T>> a0Var) {
            }

            @Override // k.b.i4.j
            @Nullable
            public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            }
        }

        public b(i<? extends T> iVar, k.b.a0<t0<T>> a0Var, Continuation<? super b> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(k.b.v0 v0Var, Continuation<? super Unit> continuation) {
        }

        @Nullable
        /* renamed from: invoke */
        public final Object invoke2(@NotNull k.b.v0 v0Var, @Nullable Continuation<? super Unit> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    @NotNull
    public static final <T> i0<T> a(@NotNull d0<T> d0Var) {
        return new f0(d0Var, null);
    }

    @NotNull
    public static final <T> t0<T> b(@NotNull e0<T> e0Var) {
        return new g0(e0Var, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0047, code lost:
        if (r9 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> k.b.i4.n0<T> c(k.b.i4.i<? extends T> r8, int r9) {
        /*
            boolean r0 = k.b.z0.b()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            if (r9 < 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L10
            goto L16
        L10:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L16:
            k.b.g4.n$b r0 = k.b.g4.n.w0
            int r0 = r0.a()
            int r0 = kotlin.ranges.RangesKt___RangesKt.coerceAtLeast(r9, r0)
            int r0 = r0 - r9
            boolean r3 = r8 instanceof k.b.i4.a1.e
            if (r3 == 0) goto L53
            r3 = r8
            k.b.i4.a1.e r3 = (k.b.i4.a1.e) r3
            k.b.i4.i r4 = r3.j()
            if (r4 == 0) goto L53
            k.b.i4.n0 r8 = new k.b.i4.n0
            int r5 = r3.c
            r6 = -3
            if (r5 == r6) goto L3c
            r6 = -2
            if (r5 == r6) goto L3c
            if (r5 == 0) goto L3c
            r1 = r5
            goto L4b
        L3c:
            k.b.g4.m r6 = r3.f29356d
            k.b.g4.m r7 = k.b.g4.m.SUSPEND
            if (r6 != r7) goto L47
            if (r5 != 0) goto L45
            goto L4a
        L45:
            r1 = r0
            goto L4b
        L47:
            if (r9 != 0) goto L4a
            goto L4b
        L4a:
            r1 = r2
        L4b:
            k.b.g4.m r9 = r3.f29356d
            kotlin.coroutines.CoroutineContext r0 = r3.b
            r8.<init>(r4, r1, r9, r0)
            return r8
        L53:
            k.b.i4.n0 r9 = new k.b.i4.n0
            k.b.g4.m r1 = k.b.g4.m.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r9.<init>(r8, r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.i4.z.c(k.b.i4.i, int):k.b.i4.n0");
    }

    private static final <T> n2 d(k.b.v0 v0Var, CoroutineContext coroutineContext, i<? extends T> iVar, d0<T> d0Var, o0 o0Var, T t) {
        return k.b.k.d(v0Var, coroutineContext, Intrinsics.areEqual(o0Var, o0.f29397a.c()) ? k.b.x0.DEFAULT : k.b.x0.UNDISPATCHED, new a(o0Var, iVar, d0Var, t, null));
    }

    private static final <T> void e(k.b.v0 v0Var, CoroutineContext coroutineContext, i<? extends T> iVar, k.b.a0<t0<T>> a0Var) {
        k.b.m.f(v0Var, coroutineContext, null, new b(iVar, a0Var, null), 2, null);
    }

    @NotNull
    public static final <T> i0<T> f(@NotNull i0<? extends T> i0Var, @NotNull Function2<? super j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new y0(i0Var, function2);
    }

    @NotNull
    public static final <T> i0<T> g(@NotNull i<? extends T> iVar, @NotNull k.b.v0 v0Var, @NotNull o0 o0Var, int i2) {
        n0 c = c(iVar, i2);
        d0 a2 = k0.a(i2, c.b, c.c);
        return new f0(a2, d(v0Var, c.f29396d, c.f29395a, a2, o0Var, k0.f29393a));
    }

    public static /* synthetic */ i0 h(i iVar, k.b.v0 v0Var, o0 o0Var, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return k.F1(iVar, v0Var, o0Var, i2);
    }

    @Nullable
    public static final <T> Object i(@NotNull i<? extends T> iVar, @NotNull k.b.v0 v0Var, @NotNull Continuation<? super t0<? extends T>> continuation) {
        n0 c = c(iVar, 1);
        k.b.a0 c2 = k.b.c0.c(null, 1, null);
        e(v0Var, c.f29396d, c.f29395a, c2);
        return c2.o(continuation);
    }

    @NotNull
    public static final <T> t0<T> j(@NotNull i<? extends T> iVar, @NotNull k.b.v0 v0Var, @NotNull o0 o0Var, T t) {
        n0 c = c(iVar, 1);
        e0 a2 = v0.a(t);
        return new g0(a2, d(v0Var, c.f29396d, c.f29395a, a2, o0Var, t));
    }
}
