package i.a.e1.h.f.b;

import java.util.Iterator;

/* compiled from: BlockingFlowableMostRecent.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d<T> implements Iterable<T> {
    public final i.a.e1.c.s<T> b;
    public final T c;

    /* compiled from: BlockingFlowableMostRecent.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.p.a<T> {
        public volatile Object c;

        /* compiled from: BlockingFlowableMostRecent.java */
        /* renamed from: i.a.e1.h.f.b.d$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class C0443a implements Iterator<T> {
            private Object b;
            public final /* synthetic */ a c;

            public C0443a(final a this$0) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public T next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }
        }

        public a(T value) {
        }

        public a<T>.C0443a d() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable e2) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T args) {
        }
    }

    public d(i.a.e1.c.s<T> source, T initialValue) {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
    }
}
