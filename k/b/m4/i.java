package k.b.m4;

import androidx.exifinterface.media.ExifInterface;
import com.umeng.analytics.pro.am;
import i.a.e1.c.c0;
import i.a.e1.c.f0;
import i.a.e1.c.n0;
import i.a.e1.c.p0;
import i.a.e1.c.u0;
import i.a.e1.c.x0;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
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
/* compiled from: RxAwait.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a#\u0010\u0000\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a!\u0010\u0000\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a!\u0010\t\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a)\u0010\f\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\n2\u0006\u0010\r\u001a\u0002H\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a/\u0010\u000f\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a#\u0010\u0013\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a!\u0010\u0014\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a5\u0010\u0015\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\n2\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\r\u001a\u0004\u0018\u0001H\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a)\u0010\u0019\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u0002H\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a!\u0010\u001b\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a!\u0010\u001b\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a#\u0010\u001c\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a\u0018\u0010\u001d\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"await", "", "Lio/reactivex/rxjava3/core/CompletableSource;", "(Lio/reactivex/rxjava3/core/CompletableSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/rxjava3/core/MaybeSource;", "(Lio/reactivex/rxjava3/core/MaybeSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/rxjava3/core/SingleSource;", "(Lio/reactivex/rxjava3/core/SingleSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFirst", "Lio/reactivex/rxjava3/core/ObservableSource;", "(Lio/reactivex/rxjava3/core/ObservableSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFirstOrDefault", "default", "(Lio/reactivex/rxjava3/core/ObservableSource;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFirstOrElse", "defaultValue", "Lkotlin/Function0;", "(Lio/reactivex/rxjava3/core/ObservableSource;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFirstOrNull", "awaitLast", "awaitOne", h.c.a.a.a.f16081l, "Lkotlinx/coroutines/rx3/Mode;", "(Lio/reactivex/rxjava3/core/ObservableSource;Lkotlinx/coroutines/rx3/Mode;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitOrDefault", "(Lio/reactivex/rxjava3/core/MaybeSource;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSingle", "awaitSingleOrNull", "disposeOnCancellation", "Lkotlinx/coroutines/CancellableContinuation;", "d", "Lio/reactivex/rxjava3/disposables/Disposable;", "kotlinx-coroutines-rx3"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class i {

    /* compiled from: RxAwait.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"kotlinx/coroutines/rx3/RxAwaitKt$await$2$1", "Lio/reactivex/rxjava3/core/CompletableObserver;", "onComplete", "", "onError", "e", "", "onSubscribe", "d", "Lio/reactivex/rxjava3/disposables/Disposable;", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a implements i.a.e1.c.m {
        public final /* synthetic */ k.b.r<Unit> b;

        public a(k.b.r<? super Unit> rVar) {
        }

        @Override // i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.m
        public void onError(@NotNull Throwable th) {
        }

        @Override // i.a.e1.c.m
        public void onSubscribe(@NotNull i.a.e1.d.f fVar) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxAwait.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0015\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"kotlinx/coroutines/rx3/RxAwaitKt$await$5$1", "Lio/reactivex/rxjava3/core/SingleObserver;", "onError", "", "error", "", "onSubscribe", "d", "Lio/reactivex/rxjava3/disposables/Disposable;", "onSuccess", am.aI, "(Ljava/lang/Object;)V", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> implements u0<T> {
        public final /* synthetic */ k.b.r<T> b;

        public b(k.b.r<? super T> rVar) {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onError(@NotNull Throwable th) {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(@NotNull i.a.e1.d.f fVar) {
        }

        @Override // i.a.e1.c.u0
        public void onSuccess(T t) {
        }
    }

    /* compiled from: RxAwait.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxAwaitKt", f = "RxAwait.kt", i = {0}, l = {176}, m = "awaitFirstOrElse", n = {"defaultValue"}, s = {"L$0"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public c(Continuation<? super c> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxAwait.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0012"}, d2 = {"kotlinx/coroutines/rx3/RxAwaitKt$awaitOne$2$1", "Lio/reactivex/rxjava3/core/Observer;", "seenValue", "", "subscription", "Lio/reactivex/rxjava3/disposables/Disposable;", "value", "Ljava/lang/Object;", "onComplete", "", "onError", "e", "", "onNext", am.aI, "(Ljava/lang/Object;)V", "onSubscribe", "sub", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T> implements p0<T> {
        private i.a.e1.d.f b;
        @Nullable
        private T c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f29518d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ k.b.r<T> f29519e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ k.b.m4.h f29520f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ T f29521g;

        /* compiled from: RxAwait.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f29522a = null;
        }

        /* compiled from: RxAwait.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class b extends Lambda implements Function1<Throwable, Unit> {
            public final /* synthetic */ i.a.e1.d.f $sub;

            public b(i.a.e1.d.f fVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
            }
        }

        public d(k.b.r<? super T> rVar, k.b.m4.h hVar, T t) {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(@NotNull Throwable th) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(@NotNull i.a.e1.d.f fVar) {
        }
    }

    /* compiled from: RxAwait.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxAwaitKt", f = "RxAwait.kt", i = {0}, l = {110}, m = "awaitOrDefault", n = {"default"}, s = {"L$0"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e<T> extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public e(Continuation<? super e> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* compiled from: RxAwait.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxAwaitKt", f = "RxAwait.kt", i = {}, l = {64}, m = "awaitSingle", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class f<T> extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public f(Continuation<? super f> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxAwait.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0015\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"kotlinx/coroutines/rx3/RxAwaitKt$awaitSingleOrNull$2$1", "Lio/reactivex/rxjava3/core/MaybeObserver;", "onComplete", "", "onError", "error", "", "onSubscribe", "d", "Lio/reactivex/rxjava3/disposables/Disposable;", "onSuccess", am.aI, "(Ljava/lang/Object;)V", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class g<T> implements c0<T> {
        public final /* synthetic */ k.b.r<T> b;

        public g(k.b.r<? super T> rVar) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onError(@NotNull Throwable th) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(@NotNull i.a.e1.d.f fVar) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0
        public void onSuccess(T t) {
        }
    }

    /* compiled from: RxAwait.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class h extends Lambda implements Function1<Throwable, Unit> {
        public final /* synthetic */ i.a.e1.d.f $d;

        public h(i.a.e1.d.f fVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
        }
    }

    @Nullable
    public static final Object b(@NotNull i.a.e1.c.p pVar, @NotNull Continuation<? super Unit> continuation) {
        k.b.s sVar = new k.b.s(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        sVar.P();
        pVar.d(new a(sVar));
        Object x = sVar.x();
        if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? x : Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of awaitSingleOrNull()", replaceWith = @ReplaceWith(expression = "this.awaitSingleOrNull()", imports = {}))
    @Nullable
    public static final <T> Object c(@NotNull f0<T> f0Var, @NotNull Continuation<? super T> continuation) {
        return o(f0Var, continuation);
    }

    @Nullable
    public static final <T> Object d(@NotNull x0<T> x0Var, @NotNull Continuation<? super T> continuation) {
        k.b.s sVar = new k.b.s(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        sVar.P();
        x0Var.d(new b(sVar));
        Object x = sVar.x();
        if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x;
    }

    @Nullable
    public static final <T> Object e(@NotNull n0<T> n0Var, @NotNull Continuation<? super T> continuation) {
        return k(n0Var, k.b.m4.h.FIRST, null, continuation, 2, null);
    }

    @Nullable
    public static final <T> Object f(@NotNull n0<T> n0Var, T t, @NotNull Continuation<? super T> continuation) {
        return j(n0Var, k.b.m4.h.FIRST_OR_DEFAULT, t, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object g(@org.jetbrains.annotations.NotNull i.a.e1.c.n0<T> r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r9) {
        /*
            boolean r0 = r9 instanceof k.b.m4.i.c
            if (r0 == 0) goto L13
            r0 = r9
            k.b.m4.i$c r0 = (k.b.m4.i.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            k.b.m4.i$c r0 = new k.b.m4.i$c
            r0.<init>(r9)
        L18:
            r4 = r0
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.L$0
            r8 = r7
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L4c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.throwOnFailure(r9)
            k.b.m4.h r9 = k.b.m4.h.FIRST_OR_DEFAULT
            r3 = 0
            r5 = 2
            r6 = 0
            r4.L$0 = r8
            r4.label = r2
            r1 = r7
            r2 = r9
            java.lang.Object r9 = k(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L4c
            return r0
        L4c:
            if (r9 != 0) goto L52
            java.lang.Object r9 = r8.invoke()
        L52:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.m4.i.g(i.a.e1.c.n0, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final <T> Object h(@NotNull n0<T> n0Var, @NotNull Continuation<? super T> continuation) {
        return k(n0Var, k.b.m4.h.FIRST_OR_DEFAULT, null, continuation, 2, null);
    }

    @Nullable
    public static final <T> Object i(@NotNull n0<T> n0Var, @NotNull Continuation<? super T> continuation) {
        return k(n0Var, k.b.m4.h.LAST, null, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object j(n0<T> n0Var, k.b.m4.h hVar, T t, Continuation<? super T> continuation) {
        k.b.s sVar = new k.b.s(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        sVar.P();
        n0Var.subscribe(new d(sVar, hVar, t));
        Object x = sVar.x();
        if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x;
    }

    public static /* synthetic */ Object k(n0 n0Var, k.b.m4.h hVar, Object obj, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            obj = null;
        }
        return j(n0Var, hVar, obj, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of awaitSingleOrNull()", replaceWith = @kotlin.ReplaceWith(expression = "this.awaitSingleOrNull() ?: default", imports = {}))
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object l(@org.jetbrains.annotations.NotNull i.a.e1.c.f0<T> r4, T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r6) {
        /*
            boolean r0 = r6 instanceof k.b.m4.i.e
            if (r0 == 0) goto L13
            r0 = r6
            k.b.m4.i$e r0 = (k.b.m4.i.e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            k.b.m4.i$e r0 = new k.b.m4.i$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = o(r4, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            if (r6 != 0) goto L44
            goto L45
        L44:
            r5 = r6
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.m4.i.l(i.a.e1.c.f0, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m(@org.jetbrains.annotations.NotNull i.a.e1.c.f0<T> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof k.b.m4.i.f
            if (r0 == 0) goto L13
            r0 = r5
            k.b.m4.i$f r0 = (k.b.m4.i.f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            k.b.m4.i$f r0 = new k.b.m4.i$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.label = r3
            java.lang.Object r5 = o(r4, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            if (r5 == 0) goto L40
            return r5
        L40:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.m4.i.m(i.a.e1.c.f0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final <T> Object n(@NotNull n0<T> n0Var, @NotNull Continuation<? super T> continuation) {
        return k(n0Var, k.b.m4.h.SINGLE, null, continuation, 2, null);
    }

    @Nullable
    public static final <T> Object o(@NotNull f0<T> f0Var, @NotNull Continuation<? super T> continuation) {
        k.b.s sVar = new k.b.s(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        sVar.P();
        f0Var.b(new g(sVar));
        Object x = sVar.x();
        if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x;
    }

    public static final void p(@NotNull k.b.r<?> rVar, @NotNull i.a.e1.d.f fVar) {
        rVar.q(new h(fVar));
    }
}
