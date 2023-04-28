package i.a.e1.h.d;

import i.a.e1.h.d.g;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;

/* compiled from: MaybeFromCompletionStage.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class o<T> extends i.a.e1.c.z<T> {
    public final CompletionStage<T> b;

    /* compiled from: MaybeFromCompletionStage.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements i.a.e1.d.f, BiConsumer<T, Throwable> {
        public final i.a.e1.c.c0<? super T> b;
        public final g.a<T> c;

        public a(i.a.e1.c.c0<? super T> downstream, g.a<T> whenReference) {
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

    public o(CompletionStage<T> stage) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super T> observer) {
    }
}
