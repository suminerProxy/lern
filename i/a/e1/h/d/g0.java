package i.a.e1.h.d;

import i.a.e1.c.r0;
import i.a.e1.c.u0;
import i.a.e1.h.d.g;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;

/* compiled from: SingleFromCompletionStage.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class g0<T> extends r0<T> {
    public final CompletionStage<T> b;

    /* compiled from: SingleFromCompletionStage.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements i.a.e1.d.f, BiConsumer<T, Throwable> {
        public final u0<? super T> b;
        public final g.a<T> c;

        public a(u0<? super T> downstream, g.a<T> whenReference) {
        }

        public void a(T item, Throwable error) {
        }

        @Override // java.util.function.BiConsumer
        public /* bridge */ /* synthetic */ void accept(Object item, Throwable error) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    public g0(CompletionStage<T> stage) {
    }

    @Override // i.a.e1.c.r0
    public void M1(u0<? super T> observer) {
    }
}
