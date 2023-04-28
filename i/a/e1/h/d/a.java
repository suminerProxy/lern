package i.a.e1.h.d;

import i.a.e1.h.d.g;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;

/* compiled from: CompletableFromCompletionStage.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a<T> extends i.a.e1.c.j {
    public final CompletionStage<T> b;

    /* compiled from: CompletableFromCompletionStage.java */
    /* renamed from: i.a.e1.h.d.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class C0431a<T> implements i.a.e1.d.f, BiConsumer<T, Throwable> {
        public final i.a.e1.c.m b;
        public final g.a<T> c;

        public C0431a(i.a.e1.c.m downstream, g.a<T> whenReference) {
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

    public a(CompletionStage<T> stage) {
    }

    @Override // i.a.e1.c.j
    public void Y0(i.a.e1.c.m observer) {
    }
}
