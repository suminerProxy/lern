package i.a.e1.h.f.a;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CompletableConcatIterable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class f extends i.a.e1.c.j {
    public final Iterable<? extends i.a.e1.c.p> b;

    /* compiled from: CompletableConcatIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends AtomicInteger implements i.a.e1.c.m {
        private static final long serialVersionUID = -7965400327305809232L;
        public final i.a.e1.c.m downstream;
        public final i.a.e1.h.a.f sd;
        public final Iterator<? extends i.a.e1.c.p> sources;

        public a(i.a.e1.c.m actual, Iterator<? extends i.a.e1.c.p> sources) {
        }

        public void next() {
        }

        @Override // i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    public f(Iterable<? extends i.a.e1.c.p> sources) {
    }

    @Override // i.a.e1.c.j
    public void Y0(i.a.e1.c.m observer) {
    }
}
