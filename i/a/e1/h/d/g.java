package i.a.e1.h.d;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import org.reactivestreams.Subscriber;

/* compiled from: FlowableFromCompletionStage.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class g<T> extends i.a.e1.c.s<T> {
    public final CompletionStage<T> c;

    /* compiled from: FlowableFromCompletionStage.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<BiConsumer<T, Throwable>> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 45838553147237545L;

        @Override // java.util.function.BiConsumer
        public /* bridge */ /* synthetic */ void accept(Object t, Throwable u) {
        }

        /* renamed from: accept  reason: avoid collision after fix types in other method */
        public void accept2(T t, Throwable u) {
        }
    }

    /* compiled from: FlowableFromCompletionStage.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends i.a.e1.h.j.f<T> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 4665335664328839859L;
        public final a<T> whenReference;

        public b(Subscriber<? super T> downstream, a<T> whenReference) {
        }

        @Override // java.util.function.BiConsumer
        public /* bridge */ /* synthetic */ void accept(Object item, Throwable error) {
        }

        @Override // i.a.e1.h.j.f, org.reactivestreams.Subscription
        public void cancel() {
        }

        /* renamed from: accept  reason: avoid collision after fix types in other method */
        public void accept2(T item, Throwable error) {
        }
    }

    public g(CompletionStage<T> stage) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
