package k.b;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/ResumeAwaitOnCompletion;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/JobNode;", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "(Lkotlinx/coroutines/CancellableContinuationImpl;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class h3<T> extends u2 {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final s<T> f29305f;

    /* JADX WARN: Multi-variable type inference failed */
    public h3(@NotNull s<? super T> sVar) {
        this.f29305f = sVar;
    }

    @Override // k.b.h0
    public void f0(@Nullable Throwable th) {
        Object F0 = g0().F0();
        if (z0.b() && !(!(F0 instanceof g2))) {
            throw new AssertionError();
        }
        if (F0 instanceof f0) {
            s<T> sVar = this.f29305f;
            Result.Companion companion = Result.Companion;
            sVar.resumeWith(Result.m57constructorimpl(ResultKt.createFailure(((f0) F0).f29231a)));
            return;
        }
        s<T> sVar2 = this.f29305f;
        Result.Companion companion2 = Result.Companion;
        sVar2.resumeWith(Result.m57constructorimpl(w2.o(F0)));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        f0(th);
        return Unit.INSTANCE;
    }
}
