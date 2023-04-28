package k.b.m4;

import k.b.e2;
import k.b.n2;
import k.b.o0;
import k.b.v0;
import k.b.x0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RxCompletable.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\nø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aI\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\nH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"rxCompletable", "Lio/reactivex/rxjava3/core/Completable;", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/rxjava3/core/Completable;", "rxCompletableInternal", "scope", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/rxjava3/core/Completable;", "kotlinx-coroutines-rx3"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class n {
    @NotNull
    public static final i.a.e1.c.j b(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super v0, ? super Continuation<? super Unit>, ? extends Object> function2) {
        if (coroutineContext.get(n2.v0) == null) {
            return d(e2.b, coroutineContext, function2);
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Completable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ", coroutineContext).toString());
    }

    public static /* synthetic */ i.a.e1.c.j c(CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return b(coroutineContext, function2);
    }

    private static final i.a.e1.c.j d(v0 v0Var, CoroutineContext coroutineContext, Function2<? super v0, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return i.a.e1.c.j.E(new i.a.e1.c.n(v0Var, coroutineContext, function2) { // from class: k.b.m4.a

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ v0 f29513a;
            public final /* synthetic */ CoroutineContext b;
            public final /* synthetic */ Function2 c;

            @Override // i.a.e1.c.n
            public final void a(i.a.e1.c.l lVar) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(v0 v0Var, CoroutineContext coroutineContext, Function2 function2, i.a.e1.c.l lVar) {
        m mVar = new m(o0.c(v0Var, coroutineContext), lVar);
        lVar.setCancellable(new j(mVar));
        mVar.v1(x0.DEFAULT, mVar, function2);
    }
}
