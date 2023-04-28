package i.a;

import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import i.a.y0.e.b.a2;
import i.a.y0.e.b.a3;
import i.a.y0.e.b.a4;
import i.a.y0.e.b.a5;
import i.a.y0.e.b.b1;
import i.a.y0.e.b.b2;
import i.a.y0.e.b.b3;
import i.a.y0.e.b.b4;
import i.a.y0.e.b.c1;
import i.a.y0.e.b.c2;
import i.a.y0.e.b.c3;
import i.a.y0.e.b.c4;
import i.a.y0.e.b.d3;
import i.a.y0.e.b.d4;
import i.a.y0.e.b.e1;
import i.a.y0.e.b.e2;
import i.a.y0.e.b.e3;
import i.a.y0.e.b.f1;
import i.a.y0.e.b.f2;
import i.a.y0.e.b.f3;
import i.a.y0.e.b.f4;
import i.a.y0.e.b.g1;
import i.a.y0.e.b.g2;
import i.a.y0.e.b.g3;
import i.a.y0.e.b.g4;
import i.a.y0.e.b.h1;
import i.a.y0.e.b.h2;
import i.a.y0.e.b.h3;
import i.a.y0.e.b.h4;
import i.a.y0.e.b.i1;
import i.a.y0.e.b.i2;
import i.a.y0.e.b.i3;
import i.a.y0.e.b.i4;
import i.a.y0.e.b.j1;
import i.a.y0.e.b.j2;
import i.a.y0.e.b.j3;
import i.a.y0.e.b.j4;
import i.a.y0.e.b.k2;
import i.a.y0.e.b.k3;
import i.a.y0.e.b.k4;
import i.a.y0.e.b.l1;
import i.a.y0.e.b.l2;
import i.a.y0.e.b.l3;
import i.a.y0.e.b.l4;
import i.a.y0.e.b.m1;
import i.a.y0.e.b.m2;
import i.a.y0.e.b.m4;
import i.a.y0.e.b.n1;
import i.a.y0.e.b.n3;
import i.a.y0.e.b.n4;
import i.a.y0.e.b.o1;
import i.a.y0.e.b.o2;
import i.a.y0.e.b.o3;
import i.a.y0.e.b.p1;
import i.a.y0.e.b.p2;
import i.a.y0.e.b.p4;
import i.a.y0.e.b.q1;
import i.a.y0.e.b.q2;
import i.a.y0.e.b.q3;
import i.a.y0.e.b.q4;
import i.a.y0.e.b.r1;
import i.a.y0.e.b.r2;
import i.a.y0.e.b.r3;
import i.a.y0.e.b.r4;
import i.a.y0.e.b.s0;
import i.a.y0.e.b.s1;
import i.a.y0.e.b.s2;
import i.a.y0.e.b.s3;
import i.a.y0.e.b.s4;
import i.a.y0.e.b.t1;
import i.a.y0.e.b.t2;
import i.a.y0.e.b.t3;
import i.a.y0.e.b.t4;
import i.a.y0.e.b.u0;
import i.a.y0.e.b.u1;
import i.a.y0.e.b.u2;
import i.a.y0.e.b.u3;
import i.a.y0.e.b.u4;
import i.a.y0.e.b.v0;
import i.a.y0.e.b.v1;
import i.a.y0.e.b.v3;
import i.a.y0.e.b.v4;
import i.a.y0.e.b.w0;
import i.a.y0.e.b.w1;
import i.a.y0.e.b.w2;
import i.a.y0.e.b.w3;
import i.a.y0.e.b.w4;
import i.a.y0.e.b.x0;
import i.a.y0.e.b.x1;
import i.a.y0.e.b.x2;
import i.a.y0.e.b.x3;
import i.a.y0.e.b.x4;
import i.a.y0.e.b.y0;
import i.a.y0.e.b.y1;
import i.a.y0.e.b.y2;
import i.a.y0.e.b.y3;
import i.a.y0.e.b.y4;
import i.a.y0.e.b.z0;
import i.a.y0.e.b.z1;
import i.a.y0.e.b.z3;
import i.a.y0.e.b.z4;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: Flowable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class l<T> implements Publisher<T> {
    public static final int b = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> A0(Publisher<? extends T>... publisherArr) {
        if (publisherArr.length == 0) {
            return g2();
        }
        if (publisherArr.length == 1) {
            return U2(publisherArr[0]);
        }
        return i.a.c1.a.P(new i.a.y0.e.b.v(publisherArr, false));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> A3(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        i.a.y0.b.b.g(t, "The first item is null");
        i.a.y0.b.b.g(t2, "The second item is null");
        i.a.y0.b.b.g(t3, "The third item is null");
        i.a.y0.b.b.g(t4, "The fourth item is null");
        i.a.y0.b.b.g(t5, "The fifth item is null");
        i.a.y0.b.b.g(t6, "The sixth item is null");
        i.a.y0.b.b.g(t7, "The seventh item is null");
        i.a.y0.b.b.g(t8, "The eighth item is null");
        i.a.y0.b.b.g(t9, "The ninth item is null");
        i.a.y0.b.b.g(t10, "The tenth item is null");
        return N2(t, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> k0<Boolean> A5(Publisher<? extends T> publisher, Publisher<? extends T> publisher2) {
        return D5(publisher, publisher2, i.a.y0.b.b.d(), U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l<R> A8(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, Publisher<? extends T4> publisher4, Publisher<? extends T5> publisher5, Publisher<? extends T6> publisher6, Publisher<? extends T7> publisher7, Publisher<? extends T8> publisher8, i.a.x0.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        i.a.y0.b.b.g(publisher5, "source5 is null");
        i.a.y0.b.b.g(publisher6, "source6 is null");
        i.a.y0.b.b.g(publisher7, "source7 is null");
        i.a.y0.b.b.g(publisher8, "source8 is null");
        return C8(i.a.y0.b.a.D(mVar), false, U(), publisher, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7, publisher8);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> B0(Publisher<? extends T>... publisherArr) {
        if (publisherArr.length == 0) {
            return g2();
        }
        if (publisherArr.length == 1) {
            return U2(publisherArr[0]);
        }
        return i.a.c1.a.P(new i.a.y0.e.b.v(publisherArr, true));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> k0<Boolean> B5(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, int i2) {
        return D5(publisher, publisher2, i.a.y0.b.b.d(), i2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l<R> B8(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, Publisher<? extends T4> publisher4, Publisher<? extends T5> publisher5, Publisher<? extends T6> publisher6, Publisher<? extends T7> publisher7, Publisher<? extends T8> publisher8, Publisher<? extends T9> publisher9, i.a.x0.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        i.a.y0.b.b.g(publisher5, "source5 is null");
        i.a.y0.b.b.g(publisher6, "source6 is null");
        i.a.y0.b.b.g(publisher7, "source7 is null");
        i.a.y0.b.b.g(publisher8, "source8 is null");
        i.a.y0.b.b.g(publisher9, "source9 is null");
        return C8(i.a.y0.b.a.E(nVar), false, U(), publisher, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7, publisher8, publisher9);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> C0(int i2, int i3, Publisher<? extends T>... publisherArr) {
        i.a.y0.b.b.g(publisherArr, "sources is null");
        i.a.y0.b.b.h(i2, "maxConcurrency");
        i.a.y0.b.b.h(i3, "prefetch");
        return i.a.c1.a.P(new i.a.y0.e.b.x(new g1(publisherArr), i.a.y0.b.a.k(), i2, i3, i.a.y0.j.j.IMMEDIATE));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> k0<Boolean> C5(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, i.a.x0.d<? super T, ? super T> dVar) {
        return D5(publisher, publisher2, dVar, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T, R> l<R> C8(i.a.x0.o<? super Object[], ? extends R> oVar, boolean z, int i2, Publisher<? extends T>... publisherArr) {
        if (publisherArr.length == 0) {
            return g2();
        }
        i.a.y0.b.b.g(oVar, "zipper is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.P(new z4(publisherArr, null, oVar, i2, z));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> D0(Publisher<? extends T>... publisherArr) {
        return C0(U(), U(), publisherArr);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> k0<Boolean> D5(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, i.a.x0.d<? super T, ? super T> dVar, int i2) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(dVar, "isEqual is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.S(new n3(publisher, publisher2, dVar, i2));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T, R> l<R> D8(Iterable<? extends Publisher<? extends T>> iterable, i.a.x0.o<? super Object[], ? extends R> oVar, boolean z, int i2) {
        i.a.y0.b.b.g(oVar, "zipper is null");
        i.a.y0.b.b.g(iterable, "sources is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.P(new z4(null, iterable, oVar, i2, z));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> E0(int i2, int i3, Publisher<? extends T>... publisherArr) {
        return N2(publisherArr).Y0(i.a.y0.b.a.k(), i2, i3, true);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> F0(Publisher<? extends T>... publisherArr) {
        return E0(U(), U(), publisherArr);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> G0(Iterable<? extends Publisher<? extends T>> iterable) {
        i.a.y0.b.b.g(iterable, "sources is null");
        return T2(iterable).U0(i.a.y0.b.a.k());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> H0(Publisher<? extends Publisher<? extends T>> publisher) {
        return I0(publisher, U(), true);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> I0(Publisher<? extends Publisher<? extends T>> publisher, int i2, boolean z) {
        return U2(publisher).V0(i.a.y0.b.a.k(), i2, z);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> I3(Iterable<? extends Publisher<? extends T>> iterable) {
        return T2(iterable).n2(i.a.y0.b.a.k());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> J0(Iterable<? extends Publisher<? extends T>> iterable) {
        return K0(iterable, U(), U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> J3(Iterable<? extends Publisher<? extends T>> iterable, int i2) {
        return T2(iterable).o2(i.a.y0.b.a.k(), i2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static l<Integer> J4(int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i3);
        } else if (i3 == 0) {
            return g2();
        } else {
            if (i3 == 1) {
                return r3(Integer.valueOf(i2));
            }
            if (i2 + (i3 - 1) <= 2147483647L) {
                return i.a.c1.a.P(new t2(i2, i3));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> K0(Iterable<? extends Publisher<? extends T>> iterable, int i2, int i3) {
        i.a.y0.b.b.g(iterable, "sources is null");
        i.a.y0.b.b.h(i2, "maxConcurrency");
        i.a.y0.b.b.h(i3, "prefetch");
        return i.a.c1.a.P(new i.a.y0.e.b.x(new j1(iterable), i.a.y0.b.a.k(), i2, i3, i.a.y0.j.j.IMMEDIATE));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> K3(Iterable<? extends Publisher<? extends T>> iterable, int i2, int i3) {
        return T2(iterable).y2(i.a.y0.b.a.k(), false, i2, i3);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static l<Long> K4(long j2, long j3) {
        int i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j3);
        } else if (i2 == 0) {
            return g2();
        } else {
            if (j3 == 1) {
                return r3(Long.valueOf(j2));
            }
            long j4 = (j3 - 1) + j2;
            if (j2 > 0 && j4 < 0) {
                throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
            }
            return i.a.c1.a.P(new u2(j2, j3));
        }
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> L0(Publisher<? extends Publisher<? extends T>> publisher) {
        return M0(publisher, U(), U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> L3(Publisher<? extends Publisher<? extends T>> publisher) {
        return M3(publisher, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> M0(Publisher<? extends Publisher<? extends T>> publisher, int i2, int i3) {
        i.a.y0.b.b.g(publisher, "sources is null");
        i.a.y0.b.b.h(i2, "maxConcurrency");
        i.a.y0.b.b.h(i3, "prefetch");
        return i.a.c1.a.P(new i.a.y0.e.b.y(publisher, i.a.y0.b.a.k(), i2, i3, i.a.y0.j.j.IMMEDIATE));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> M3(Publisher<? extends Publisher<? extends T>> publisher, int i2) {
        return U2(publisher).o2(i.a.y0.b.a.k(), i2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> N2(T... tArr) {
        i.a.y0.b.b.g(tArr, "items is null");
        if (tArr.length == 0) {
            return g2();
        }
        if (tArr.length == 1) {
            return r3(tArr[0]);
        }
        return i.a.c1.a.P(new g1(tArr));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> N3(Publisher<? extends T> publisher, Publisher<? extends T> publisher2) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        return N2(publisher, publisher2).x2(i.a.y0.b.a.k(), false, 2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.NONE)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> N7(Publisher<T> publisher) {
        i.a.y0.b.b.g(publisher, "onSubscribe is null");
        if (!(publisher instanceof l)) {
            return i.a.c1.a.P(new l1(publisher));
        }
        throw new IllegalArgumentException("unsafeCreate(Flowable) should be upgraded");
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> O2(Callable<? extends T> callable) {
        i.a.y0.b.b.g(callable, "supplier is null");
        return i.a.c1.a.P(new h1(callable));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> O3(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, Publisher<? extends T> publisher3) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        return N2(publisher, publisher2, publisher3).x2(i.a.y0.b.a.k(), false, 3);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> P2(Future<? extends T> future) {
        i.a.y0.b.b.g(future, "future is null");
        return i.a.c1.a.P(new i1(future, 0L, null));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> P3(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, Publisher<? extends T> publisher3, Publisher<? extends T> publisher4) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        return N2(publisher, publisher2, publisher3, publisher4).x2(i.a.y0.b.a.k(), false, 4);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public static <T, D> l<T> P7(Callable<? extends D> callable, i.a.x0.o<? super D, ? extends Publisher<? extends T>> oVar, i.a.x0.g<? super D> gVar) {
        return Q7(callable, oVar, gVar, true);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> Q2(Future<? extends T> future, long j2, TimeUnit timeUnit) {
        i.a.y0.b.b.g(future, "future is null");
        i.a.y0.b.b.g(timeUnit, "unit is null");
        return i.a.c1.a.P(new i1(future, j2, timeUnit));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> Q3(int i2, int i3, Publisher<? extends T>... publisherArr) {
        return N2(publisherArr).y2(i.a.y0.b.a.k(), false, i2, i3);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public static <T, D> l<T> Q7(Callable<? extends D> callable, i.a.x0.o<? super D, ? extends Publisher<? extends T>> oVar, i.a.x0.g<? super D> gVar, boolean z) {
        i.a.y0.b.b.g(callable, "resourceSupplier is null");
        i.a.y0.b.b.g(oVar, "sourceSupplier is null");
        i.a.y0.b.b.g(gVar, "disposer is null");
        return i.a.c1.a.P(new r4(callable, oVar, gVar, z));
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> R2(Future<? extends T> future, long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return Q2(future, j2, timeUnit).h6(j0Var);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> R3(Publisher<? extends T>... publisherArr) {
        return N2(publisherArr).o2(i.a.y0.b.a.k(), publisherArr.length);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> S2(Future<? extends T> future, j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return P2(future).h6(j0Var);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> S3(int i2, int i3, Publisher<? extends T>... publisherArr) {
        return N2(publisherArr).y2(i.a.y0.b.a.k(), true, i2, i3);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> T2(Iterable<? extends T> iterable) {
        i.a.y0.b.b.g(iterable, "source is null");
        return i.a.c1.a.P(new j1(iterable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> T3(Publisher<? extends T>... publisherArr) {
        return N2(publisherArr).x2(i.a.y0.b.a.k(), true, publisherArr.length);
    }

    public static int U() {
        return b;
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> U2(Publisher<? extends T> publisher) {
        if (publisher instanceof l) {
            return i.a.c1.a.P((l) publisher);
        }
        i.a.y0.b.b.g(publisher, "publisher is null");
        return i.a.c1.a.P(new l1(publisher));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> U3(Iterable<? extends Publisher<? extends T>> iterable) {
        return T2(iterable).w2(i.a.y0.b.a.k(), true);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    private l<T> V1(i.a.x0.g<? super T> gVar, i.a.x0.g<? super Throwable> gVar2, i.a.x0.a aVar, i.a.x0.a aVar2) {
        i.a.y0.b.b.g(gVar, "onNext is null");
        i.a.y0.b.b.g(gVar2, "onError is null");
        i.a.y0.b.b.g(aVar, "onComplete is null");
        i.a.y0.b.b.g(aVar2, "onAfterTerminate is null");
        return i.a.c1.a.P(new i.a.y0.e.b.r0(this, gVar, gVar2, aVar, aVar2));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> V2(i.a.x0.g<k<T>> gVar) {
        i.a.y0.b.b.g(gVar, "generator is null");
        return Z2(i.a.y0.b.a.u(), s1.j(gVar), i.a.y0.b.a.h());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> V3(Iterable<? extends Publisher<? extends T>> iterable, int i2) {
        return T2(iterable).x2(i.a.y0.b.a.k(), true, i2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T, S> l<T> W2(Callable<S> callable, i.a.x0.b<S, k<T>> bVar) {
        i.a.y0.b.b.g(bVar, "generator is null");
        return Z2(callable, s1.i(bVar), i.a.y0.b.a.h());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> W3(Iterable<? extends Publisher<? extends T>> iterable, int i2, int i3) {
        return T2(iterable).y2(i.a.y0.b.a.k(), true, i2, i3);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T, S> l<T> X2(Callable<S> callable, i.a.x0.b<S, k<T>> bVar, i.a.x0.g<? super S> gVar) {
        i.a.y0.b.b.g(bVar, "generator is null");
        return Z2(callable, s1.i(bVar), gVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> X3(Publisher<? extends Publisher<? extends T>> publisher) {
        return Y3(publisher, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T, S> l<T> Y2(Callable<S> callable, i.a.x0.c<S, k<T>, S> cVar) {
        return Z2(callable, cVar, i.a.y0.b.a.h());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> Y3(Publisher<? extends Publisher<? extends T>> publisher, int i2) {
        return U2(publisher).x2(i.a.y0.b.a.k(), true, i2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T, S> l<T> Z2(Callable<S> callable, i.a.x0.c<S, k<T>, S> cVar, i.a.x0.g<? super S> gVar) {
        i.a.y0.b.b.g(callable, "initialState is null");
        i.a.y0.b.b.g(cVar, "generator is null");
        i.a.y0.b.b.g(gVar, "disposeState is null");
        return i.a.c1.a.P(new m1(callable, cVar, gVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> Z3(Publisher<? extends T> publisher, Publisher<? extends T> publisher2) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        return N2(publisher, publisher2).x2(i.a.y0.b.a.k(), true, 2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T, R> l<R> a0(i.a.x0.o<? super Object[], ? extends R> oVar, Publisher<? extends T>... publisherArr) {
        return m0(publisherArr, oVar, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> a4(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, Publisher<? extends T> publisher3) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        return N2(publisher, publisher2, publisher3).x2(i.a.y0.b.a.k(), true, 3);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T, R> l<R> b0(Iterable<? extends Publisher<? extends T>> iterable, i.a.x0.o<? super Object[], ? extends R> oVar) {
        return c0(iterable, oVar, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> b4(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, Publisher<? extends T> publisher3, Publisher<? extends T> publisher4) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        return N2(publisher, publisher2, publisher3, publisher4).x2(i.a.y0.b.a.k(), true, 4);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> c(Iterable<? extends Publisher<? extends T>> iterable) {
        i.a.y0.b.b.g(iterable, "sources is null");
        return i.a.c1.a.P(new i.a.y0.e.b.h(null, iterable));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T, R> l<R> c0(Iterable<? extends Publisher<? extends T>> iterable, i.a.x0.o<? super Object[], ? extends R> oVar, int i2) {
        i.a.y0.b.b.g(iterable, "sources is null");
        i.a.y0.b.b.g(oVar, "combiner is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.P(new i.a.y0.e.b.u((Iterable) iterable, (i.a.x0.o) oVar, i2, false));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> d(Publisher<? extends T>... publisherArr) {
        i.a.y0.b.b.g(publisherArr, "sources is null");
        int length = publisherArr.length;
        if (length == 0) {
            return g2();
        }
        if (length == 1) {
            return U2(publisherArr[0]);
        }
        return i.a.c1.a.P(new i.a.y0.e.b.h(publisherArr, null));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T1, T2, R> l<R> d0(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, i.a.x0.c<? super T1, ? super T2, ? extends R> cVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        return a0(i.a.y0.b.a.x(cVar), publisher, publisher2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, T3, R> l<R> e0(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, i.a.x0.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        return a0(i.a.y0.b.a.y(hVar), publisher, publisher2, publisher3);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, T3, T4, R> l<R> f0(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, Publisher<? extends T4> publisher4, i.a.x0.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        return a0(i.a.y0.b.a.z(iVar), publisher, publisher2, publisher3, publisher4);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, R> l<R> g0(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, Publisher<? extends T4> publisher4, Publisher<? extends T5> publisher5, i.a.x0.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        i.a.y0.b.b.g(publisher5, "source5 is null");
        return a0(i.a.y0.b.a.A(jVar), publisher, publisher2, publisher3, publisher4, publisher5);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public static <T> l<T> g2() {
        return i.a.c1.a.P(w0.c);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public static <T> l<T> g4() {
        return i.a.c1.a.P(i2.c);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, R> l<R> h0(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, Publisher<? extends T4> publisher4, Publisher<? extends T5> publisher5, Publisher<? extends T6> publisher6, i.a.x0.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        i.a.y0.b.b.g(publisher5, "source5 is null");
        i.a.y0.b.b.g(publisher6, "source6 is null");
        return a0(i.a.y0.b.a.B(kVar), publisher, publisher2, publisher3, publisher4, publisher5, publisher6);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> h2(Throwable th) {
        i.a.y0.b.b.g(th, "throwable is null");
        return i2(i.a.y0.b.a.m(th));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, T7, R> l<R> i0(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, Publisher<? extends T4> publisher4, Publisher<? extends T5> publisher5, Publisher<? extends T6> publisher6, Publisher<? extends T7> publisher7, i.a.x0.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        i.a.y0.b.b.g(publisher5, "source5 is null");
        i.a.y0.b.b.g(publisher6, "source6 is null");
        i.a.y0.b.b.g(publisher7, "source7 is null");
        return a0(i.a.y0.b.a.C(lVar), publisher, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> i2(Callable<? extends Throwable> callable) {
        i.a.y0.b.b.g(callable, "errorSupplier is null");
        return i.a.c1.a.P(new x0(callable));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l<R> j0(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, Publisher<? extends T4> publisher4, Publisher<? extends T5> publisher5, Publisher<? extends T6> publisher6, Publisher<? extends T7> publisher7, Publisher<? extends T8> publisher8, i.a.x0.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        i.a.y0.b.b.g(publisher5, "source5 is null");
        i.a.y0.b.b.g(publisher6, "source6 is null");
        i.a.y0.b.b.g(publisher7, "source7 is null");
        i.a.y0.b.b.g(publisher8, "source8 is null");
        return a0(i.a.y0.b.a.D(mVar), publisher, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7, publisher8);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public static l<Long> j3(long j2, long j3, TimeUnit timeUnit) {
        return k3(j2, j3, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l<R> k0(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, Publisher<? extends T4> publisher4, Publisher<? extends T5> publisher5, Publisher<? extends T6> publisher6, Publisher<? extends T7> publisher7, Publisher<? extends T8> publisher8, Publisher<? extends T9> publisher9, i.a.x0.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        i.a.y0.b.b.g(publisher5, "source5 is null");
        i.a.y0.b.b.g(publisher6, "source6 is null");
        i.a.y0.b.b.g(publisher7, "source7 is null");
        i.a.y0.b.b.g(publisher8, "source8 is null");
        i.a.y0.b.b.g(publisher9, "source9 is null");
        return a0(i.a.y0.b.a.E(nVar), publisher, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7, publisher8, publisher9);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public static l<Long> k3(long j2, long j3, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.P(new t1(Math.max(0L, j2), Math.max(0L, j3), timeUnit, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T, R> l<R> l0(Publisher<? extends T>[] publisherArr, i.a.x0.o<? super Object[], ? extends R> oVar) {
        return m0(publisherArr, oVar, U());
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public static l<Long> l3(long j2, TimeUnit timeUnit) {
        return k3(j2, j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T, R> l<R> m0(Publisher<? extends T>[] publisherArr, i.a.x0.o<? super Object[], ? extends R> oVar, int i2) {
        i.a.y0.b.b.g(publisherArr, "sources is null");
        if (publisherArr.length == 0) {
            return g2();
        }
        i.a.y0.b.b.g(oVar, "combiner is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.P(new i.a.y0.e.b.u((Publisher[]) publisherArr, (i.a.x0.o) oVar, i2, false));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public static l<Long> m3(long j2, TimeUnit timeUnit, j0 j0Var) {
        return k3(j2, j2, timeUnit, j0Var);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T, R> l<R> n0(i.a.x0.o<? super Object[], ? extends R> oVar, int i2, Publisher<? extends T>... publisherArr) {
        return s0(publisherArr, oVar, i2);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public static l<Long> n3(long j2, long j3, long j4, long j5, TimeUnit timeUnit) {
        return o3(j2, j3, j4, j5, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T, R> l<R> o0(i.a.x0.o<? super Object[], ? extends R> oVar, Publisher<? extends T>... publisherArr) {
        return s0(publisherArr, oVar, U());
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public static l<Long> o3(long j2, long j3, long j4, long j5, TimeUnit timeUnit, j0 j0Var) {
        int i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j3);
        } else if (i2 == 0) {
            return g2().z1(j4, timeUnit, j0Var);
        } else {
            long j6 = j2 + (j3 - 1);
            if (j2 > 0 && j6 < 0) {
                throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
            }
            i.a.y0.b.b.g(timeUnit, "unit is null");
            i.a.y0.b.b.g(j0Var, "scheduler is null");
            return i.a.c1.a.P(new u1(j2, j6, Math.max(0L, j4), Math.max(0L, j5), timeUnit, j0Var));
        }
    }

    private l<T> o7(long j2, TimeUnit timeUnit, Publisher<? extends T> publisher, j0 j0Var) {
        i.a.y0.b.b.g(timeUnit, "timeUnit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.P(new m4(this, j2, timeUnit, j0Var, publisher));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T, R> l<R> p0(Iterable<? extends Publisher<? extends T>> iterable, i.a.x0.o<? super Object[], ? extends R> oVar) {
        return q0(iterable, oVar, U());
    }

    private <U, V> l<T> p7(Publisher<U> publisher, i.a.x0.o<? super T, ? extends Publisher<V>> oVar, Publisher<? extends T> publisher2) {
        i.a.y0.b.b.g(oVar, "itemTimeoutIndicator is null");
        return i.a.c1.a.P(new l4(this, publisher, oVar, publisher2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T, R> l<R> q0(Iterable<? extends Publisher<? extends T>> iterable, i.a.x0.o<? super Object[], ? extends R> oVar, int i2) {
        i.a.y0.b.b.g(iterable, "sources is null");
        i.a.y0.b.b.g(oVar, "combiner is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.P(new i.a.y0.e.b.u((Iterable) iterable, (i.a.x0.o) oVar, i2, true));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public static l<Long> q7(long j2, TimeUnit timeUnit) {
        return r7(j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T, R> l<R> q8(Iterable<? extends Publisher<? extends T>> iterable, i.a.x0.o<? super Object[], ? extends R> oVar) {
        i.a.y0.b.b.g(oVar, "zipper is null");
        i.a.y0.b.b.g(iterable, "sources is null");
        return i.a.c1.a.P(new z4(null, iterable, oVar, U(), false));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T, R> l<R> r0(Publisher<? extends T>[] publisherArr, i.a.x0.o<? super Object[], ? extends R> oVar) {
        return s0(publisherArr, oVar, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> r3(T t) {
        i.a.y0.b.b.g(t, "item is null");
        return i.a.c1.a.P(new w1(t));
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public static l<Long> r7(long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.P(new n4(Math.max(0L, j2), timeUnit, j0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T, R> l<R> r8(Publisher<? extends Publisher<? extends T>> publisher, i.a.x0.o<? super Object[], ? extends R> oVar) {
        i.a.y0.b.b.g(oVar, "zipper is null");
        return U2(publisher).y7().e0(s1.n(oVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T, R> l<R> s0(Publisher<? extends T>[] publisherArr, i.a.x0.o<? super Object[], ? extends R> oVar, int i2) {
        i.a.y0.b.b.g(publisherArr, "sources is null");
        i.a.y0.b.b.g(oVar, "combiner is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        if (publisherArr.length == 0) {
            return g2();
        }
        return i.a.c1.a.P(new i.a.y0.e.b.u((Publisher[]) publisherArr, (i.a.x0.o) oVar, i2, true));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> s1(o<T> oVar, b bVar) {
        i.a.y0.b.b.g(oVar, "source is null");
        i.a.y0.b.b.g(bVar, "mode is null");
        return i.a.c1.a.P(new i.a.y0.e.b.f0(oVar, bVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> s3(T t, T t2) {
        i.a.y0.b.b.g(t, "The first item is null");
        i.a.y0.b.b.g(t2, "The second item is null");
        return N2(t, t2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, R> l<R> s8(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, i.a.x0.c<? super T1, ? super T2, ? extends R> cVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        return C8(i.a.y0.b.a.x(cVar), false, U(), publisher, publisher2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> t3(T t, T t2, T t3) {
        i.a.y0.b.b.g(t, "The first item is null");
        i.a.y0.b.b.g(t2, "The second item is null");
        i.a.y0.b.b.g(t3, "The third item is null");
        return N2(t, t2, t3);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, R> l<R> t8(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, i.a.x0.c<? super T1, ? super T2, ? extends R> cVar, boolean z) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        return C8(i.a.y0.b.a.x(cVar), z, U(), publisher, publisher2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> u0(Iterable<? extends Publisher<? extends T>> iterable) {
        i.a.y0.b.b.g(iterable, "sources is null");
        return T2(iterable).V0(i.a.y0.b.a.k(), 2, false);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> u3(T t, T t2, T t3, T t4) {
        i.a.y0.b.b.g(t, "The first item is null");
        i.a.y0.b.b.g(t2, "The second item is null");
        i.a.y0.b.b.g(t3, "The third item is null");
        i.a.y0.b.b.g(t4, "The fourth item is null");
        return N2(t, t2, t3, t4);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, R> l<R> u8(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, i.a.x0.c<? super T1, ? super T2, ? extends R> cVar, boolean z, int i2) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        return C8(i.a.y0.b.a.x(cVar), z, i2, publisher, publisher2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> v0(Publisher<? extends Publisher<? extends T>> publisher) {
        return w0(publisher, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> v3(T t, T t2, T t3, T t4, T t5) {
        i.a.y0.b.b.g(t, "The first item is null");
        i.a.y0.b.b.g(t2, "The second item is null");
        i.a.y0.b.b.g(t3, "The third item is null");
        i.a.y0.b.b.g(t4, "The fourth item is null");
        i.a.y0.b.b.g(t5, "The fifth item is null");
        return N2(t, t2, t3, t4, t5);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, T3, R> l<R> v8(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, i.a.x0.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        return C8(i.a.y0.b.a.y(hVar), false, U(), publisher, publisher2, publisher3);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> w0(Publisher<? extends Publisher<? extends T>> publisher, int i2) {
        return U2(publisher).O0(i.a.y0.b.a.k(), i2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> w3(T t, T t2, T t3, T t4, T t5, T t6) {
        i.a.y0.b.b.g(t, "The first item is null");
        i.a.y0.b.b.g(t2, "The second item is null");
        i.a.y0.b.b.g(t3, "The third item is null");
        i.a.y0.b.b.g(t4, "The fourth item is null");
        i.a.y0.b.b.g(t5, "The fifth item is null");
        i.a.y0.b.b.g(t6, "The sixth item is null");
        return N2(t, t2, t3, t4, t5, t6);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> w6(Publisher<? extends Publisher<? extends T>> publisher) {
        return U2(publisher).l6(i.a.y0.b.a.k());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, T3, T4, R> l<R> w8(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, Publisher<? extends T4> publisher4, i.a.x0.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        return C8(i.a.y0.b.a.z(iVar), false, U(), publisher, publisher2, publisher3, publisher4);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> x0(Publisher<? extends T> publisher, Publisher<? extends T> publisher2) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        return A0(publisher, publisher2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> x1(Callable<? extends Publisher<? extends T>> callable) {
        i.a.y0.b.b.g(callable, "supplier is null");
        return i.a.c1.a.P(new i.a.y0.e.b.i0(callable));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> x3(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        i.a.y0.b.b.g(t, "The first item is null");
        i.a.y0.b.b.g(t2, "The second item is null");
        i.a.y0.b.b.g(t3, "The third item is null");
        i.a.y0.b.b.g(t4, "The fourth item is null");
        i.a.y0.b.b.g(t5, "The fifth item is null");
        i.a.y0.b.b.g(t6, "The sixth item is null");
        i.a.y0.b.b.g(t7, "The seventh item is null");
        return N2(t, t2, t3, t4, t5, t6, t7);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> x6(Publisher<? extends Publisher<? extends T>> publisher, int i2) {
        return U2(publisher).m6(i.a.y0.b.a.k(), i2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, R> l<R> x8(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, Publisher<? extends T4> publisher4, Publisher<? extends T5> publisher5, i.a.x0.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        i.a.y0.b.b.g(publisher5, "source5 is null");
        return C8(i.a.y0.b.a.A(jVar), false, U(), publisher, publisher2, publisher3, publisher4, publisher5);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> y0(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, Publisher<? extends T> publisher3) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        return A0(publisher, publisher2, publisher3);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> y3(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        i.a.y0.b.b.g(t, "The first item is null");
        i.a.y0.b.b.g(t2, "The second item is null");
        i.a.y0.b.b.g(t3, "The third item is null");
        i.a.y0.b.b.g(t4, "The fourth item is null");
        i.a.y0.b.b.g(t5, "The fifth item is null");
        i.a.y0.b.b.g(t6, "The sixth item is null");
        i.a.y0.b.b.g(t7, "The seventh item is null");
        i.a.y0.b.b.g(t8, "The eighth item is null");
        return N2(t, t2, t3, t4, t5, t6, t7, t8);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> y6(Publisher<? extends Publisher<? extends T>> publisher) {
        return z6(publisher, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, R> l<R> y8(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, Publisher<? extends T4> publisher4, Publisher<? extends T5> publisher5, Publisher<? extends T6> publisher6, i.a.x0.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        i.a.y0.b.b.g(publisher5, "source5 is null");
        i.a.y0.b.b.g(publisher6, "source6 is null");
        return C8(i.a.y0.b.a.B(kVar), false, U(), publisher, publisher2, publisher3, publisher4, publisher5, publisher6);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> z0(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, Publisher<? extends T> publisher3, Publisher<? extends T> publisher4) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        return A0(publisher, publisher2, publisher3, publisher4);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> z3(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        i.a.y0.b.b.g(t, "The first item is null");
        i.a.y0.b.b.g(t2, "The second item is null");
        i.a.y0.b.b.g(t3, "The third item is null");
        i.a.y0.b.b.g(t4, "The fourth item is null");
        i.a.y0.b.b.g(t5, "The fifth item is null");
        i.a.y0.b.b.g(t6, "The sixth item is null");
        i.a.y0.b.b.g(t7, "The seventh item is null");
        i.a.y0.b.b.g(t8, "The eighth item is null");
        i.a.y0.b.b.g(t9, "The ninth is null");
        return N2(t, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> z6(Publisher<? extends Publisher<? extends T>> publisher, int i2) {
        return U2(publisher).r6(i.a.y0.b.a.k(), i2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, T7, R> l<R> z8(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, Publisher<? extends T4> publisher4, Publisher<? extends T5> publisher5, Publisher<? extends T6> publisher6, Publisher<? extends T7> publisher7, i.a.x0.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        i.a.y0.b.b.g(publisher5, "source5 is null");
        i.a.y0.b.b.g(publisher6, "source6 is null");
        i.a.y0.b.b.g(publisher7, "source7 is null");
        return C8(i.a.y0.b.a.C(lVar), false, U(), publisher, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    public final void A(Subscriber<? super T> subscriber) {
        i.a.y0.e.b.l.d(this, subscriber);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> A1(long j2, TimeUnit timeUnit, j0 j0Var, boolean z) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.P(new i.a.y0.e.b.j0(this, Math.max(0L, j2), timeUnit, j0Var, z));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final c A2(i.a.x0.o<? super T, ? extends i> oVar, boolean z, int i2) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "maxConcurrency");
        return i.a.c1.a.O(new b1(this, oVar, z, i2));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> A4(Publisher<? extends T> publisher) {
        i.a.y0.b.b.g(publisher, "next is null");
        return i.a.c1.a.P(new p2(this, i.a.y0.b.a.n(publisher), true));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    public final l<T> A6(long j2) {
        if (j2 >= 0) {
            return i.a.c1.a.P(new a4(this, j2));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final <U extends Collection<? super T>> k0<U> A7(Callable<U> callable) {
        i.a.y0.b.b.g(callable, "collectionSupplier is null");
        return i.a.c1.a.S(new p4(this, callable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<List<T>> B(int i2) {
        return C(i2, i2);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> B1(long j2, TimeUnit timeUnit, boolean z) {
        return A1(j2, timeUnit, i.a.f1.b.a(), z);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <U> l<U> B2(i.a.x0.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return C2(oVar, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final k0<T> B3(T t) {
        i.a.y0.b.b.g(t, "defaultItem");
        return i.a.c1.a.S(new y1(this, t));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> B4() {
        return i.a.c1.a.P(new i.a.y0.e.b.m0(this));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> B6(long j2, TimeUnit timeUnit) {
        return N6(q7(j2, timeUnit));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <K> k0<Map<K, T>> B7(i.a.x0.o<? super T, ? extends K> oVar) {
        i.a.y0.b.b.g(oVar, "keySelector is null");
        return (k0<Map<K, T>>) Y(i.a.y0.j.m.asCallable(), i.a.y0.b.a.F(oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<List<T>> C(int i2, int i3) {
        return (l<List<T>>) D(i2, i3, i.a.y0.j.b.asCallable());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> l<T> C1(i.a.x0.o<? super T, ? extends Publisher<U>> oVar) {
        i.a.y0.b.b.g(oVar, "itemDelayIndicator is null");
        return (l<T>) n2(s1.c(oVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> l<U> C2(i.a.x0.o<? super T, ? extends Iterable<? extends U>> oVar, int i2) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.P(new f1(this, oVar, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final s<T> C3() {
        return i.a.c1.a.Q(new x1(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.b1.b<T> C4() {
        return i.a.b1.b.y(this);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> C6(long j2, TimeUnit timeUnit, j0 j0Var) {
        return N6(r7(j2, timeUnit, j0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <K, V> k0<Map<K, V>> C7(i.a.x0.o<? super T, ? extends K> oVar, i.a.x0.o<? super T, ? extends V> oVar2) {
        i.a.y0.b.b.g(oVar, "keySelector is null");
        i.a.y0.b.b.g(oVar2, "valueSelector is null");
        return (k0<Map<K, V>>) Y(i.a.y0.j.m.asCallable(), i.a.y0.b.a.G(oVar, oVar2));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U extends Collection<? super T>> l<U> D(int i2, int i3, Callable<U> callable) {
        i.a.y0.b.b.h(i2, AnimatedPasterJsonConfig.CONFIG_COUNT);
        i.a.y0.b.b.h(i3, "skip");
        i.a.y0.b.b.g(callable, "bufferSupplier is null");
        return i.a.c1.a.P(new i.a.y0.e.b.m(this, i2, i3, callable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <U, V> l<T> D1(Publisher<U> publisher, i.a.x0.o<? super T, ? extends Publisher<V>> oVar) {
        return G1(publisher).C1(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U, V> l<V> D2(i.a.x0.o<? super T, ? extends Iterable<? extends U>> oVar, i.a.x0.c<? super T, ? super U, ? extends V> cVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.g(cVar, "resultSelector is null");
        return (l<V>) t2(s1.a(oVar), cVar, false, U(), U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final k0<T> D3() {
        return i.a.c1.a.S(new y1(this, null));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.b1.b<T> D4(int i2) {
        i.a.y0.b.b.h(i2, "parallelism");
        return i.a.b1.b.z(this, i2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> D6(int i2) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("count >= 0 required but it was " + i2);
        } else if (i2 == 0) {
            return i.a.c1.a.P(new q1(this));
        } else {
            if (i2 == 1) {
                return i.a.c1.a.P(new c4(this));
            }
            return i.a.c1.a.P(new b4(this, i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <K, V> k0<Map<K, V>> D7(i.a.x0.o<? super T, ? extends K> oVar, i.a.x0.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, V>> callable) {
        i.a.y0.b.b.g(oVar, "keySelector is null");
        i.a.y0.b.b.g(oVar2, "valueSelector is null");
        return (k0<Map<K, V>>) Y(callable, i.a.y0.b.a.G(oVar, oVar2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <U extends Collection<? super T>> l<U> E(int i2, Callable<U> callable) {
        return D(i2, i2, callable);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> E1(long j2, TimeUnit timeUnit) {
        return F1(j2, timeUnit, i.a.f1.b.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U, V> l<V> E2(i.a.x0.o<? super T, ? extends Iterable<? extends U>> oVar, i.a.x0.c<? super T, ? super U, ? extends V> cVar, int i2) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.g(cVar, "resultSelector is null");
        return (l<V>) t2(s1.a(oVar), cVar, false, U(), i2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> E3(p<? extends R, ? super T> pVar) {
        i.a.y0.b.b.g(pVar, "lifter is null");
        return i.a.c1.a.P(new z1(this, pVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.b1.b<T> E4(int i2, int i3) {
        i.a.y0.b.b.h(i2, "parallelism");
        i.a.y0.b.b.h(i3, "prefetch");
        return i.a.b1.b.A(this, i2, i3);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> E5() {
        return i.a.c1.a.P(new o3(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> E6(long j2, long j3, TimeUnit timeUnit) {
        return G6(j2, j3, timeUnit, i.a.f1.b.a(), false, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final <K> k0<Map<K, Collection<T>>> E7(i.a.x0.o<? super T, ? extends K> oVar) {
        return (k0<Map<K, Collection<T>>>) H7(oVar, i.a.y0.b.a.k(), i.a.y0.j.m.asCallable(), i.a.y0.j.b.asFunction());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U, R> l<R> E8(Iterable<U> iterable, i.a.x0.c<? super T, ? super U, ? extends R> cVar) {
        i.a.y0.b.b.g(iterable, "other is null");
        i.a.y0.b.b.g(cVar, "zipper is null");
        return i.a.c1.a.P(new a5(this, iterable, cVar));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<List<T>> F(long j2, long j3, TimeUnit timeUnit) {
        return (l<List<T>>) H(j2, j3, timeUnit, i.a.f1.b.a(), i.a.y0.j.b.asCallable());
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> F1(long j2, TimeUnit timeUnit, j0 j0Var) {
        return G1(r7(j2, timeUnit, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final <R> l<R> F2(i.a.x0.o<? super T, ? extends y<? extends R>> oVar) {
        return G2(oVar, false, Integer.MAX_VALUE);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    public final l<T> F3(long j2) {
        if (j2 >= 0) {
            return i.a.c1.a.P(new a2(this, j2));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> F4(i.a.x0.o<? super l<T>, ? extends Publisher<R>> oVar) {
        return G4(oVar, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> F5() {
        return H4().N8();
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> F6(long j2, long j3, TimeUnit timeUnit, j0 j0Var) {
        return G6(j2, j3, timeUnit, j0Var, false, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final <K, V> k0<Map<K, Collection<V>>> F7(i.a.x0.o<? super T, ? extends K> oVar, i.a.x0.o<? super T, ? extends V> oVar2) {
        return H7(oVar, oVar2, i.a.y0.j.m.asCallable(), i.a.y0.j.b.asFunction());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U, R> l<R> F8(Publisher<? extends U> publisher, i.a.x0.c<? super T, ? super U, ? extends R> cVar) {
        i.a.y0.b.b.g(publisher, "other is null");
        return s8(this, publisher, cVar);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<List<T>> G(long j2, long j3, TimeUnit timeUnit, j0 j0Var) {
        return (l<List<T>>) H(j2, j3, timeUnit, j0Var, i.a.y0.j.b.asCallable());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> l<T> G1(Publisher<U> publisher) {
        i.a.y0.b.b.g(publisher, "subscriptionIndicator is null");
        return i.a.c1.a.P(new i.a.y0.e.b.k0(this, publisher));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> G2(i.a.x0.o<? super T, ? extends y<? extends R>> oVar, boolean z, int i2) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "maxConcurrency");
        return i.a.c1.a.P(new c1(this, oVar, z, i2));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> G3(i.a.x0.o<? super T, ? extends R> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.P(new b2(this, oVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> G4(i.a.x0.o<? super l<T>, ? extends Publisher<? extends R>> oVar, int i2) {
        i.a.y0.b.b.g(oVar, "selector is null");
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.P(new s2(this, oVar, i2, false));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final k0<T> G5(T t) {
        i.a.y0.b.b.g(t, "defaultItem is null");
        return i.a.c1.a.S(new r3(this, t));
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> G6(long j2, long j3, TimeUnit timeUnit, j0 j0Var, boolean z, int i2) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        if (j2 >= 0) {
            return i.a.c1.a.P(new d4(this, j2, j3, timeUnit, j0Var, i2, z));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + j2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final <K, V> k0<Map<K, Collection<V>>> G7(i.a.x0.o<? super T, ? extends K> oVar, i.a.x0.o<? super T, ? extends V> oVar2, Callable<Map<K, Collection<V>>> callable) {
        return H7(oVar, oVar2, callable, i.a.y0.j.b.asFunction());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <U, R> l<R> G8(Publisher<? extends U> publisher, i.a.x0.c<? super T, ? super U, ? extends R> cVar, boolean z) {
        return t8(this, publisher, cVar, z);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final <U extends Collection<? super T>> l<U> H(long j2, long j3, TimeUnit timeUnit, j0 j0Var, Callable<U> callable) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        i.a.y0.b.b.g(callable, "bufferSupplier is null");
        return i.a.c1.a.P(new i.a.y0.e.b.q(this, j2, j3, timeUnit, j0Var, callable, Integer.MAX_VALUE, false));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @Deprecated
    @i.a.t0.d
    public final <T2> l<T2> H1() {
        return i.a.c1.a.P(new i.a.y0.e.b.l0(this, i.a.y0.b.a.k()));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final <R> l<R> H2(i.a.x0.o<? super T, ? extends q0<? extends R>> oVar) {
        return I2(oVar, false, Integer.MAX_VALUE);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<a0<T>> H3() {
        return i.a.c1.a.P(new e2(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.w0.a<T> H4() {
        return I4(U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final s<T> H5() {
        return i.a.c1.a.Q(new q3(this));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> H6(long j2, TimeUnit timeUnit) {
        return K6(j2, timeUnit, i.a.f1.b.a(), false, U());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <K, V> k0<Map<K, Collection<V>>> H7(i.a.x0.o<? super T, ? extends K> oVar, i.a.x0.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, Collection<V>>> callable, i.a.x0.o<? super K, ? extends Collection<? super V>> oVar3) {
        i.a.y0.b.b.g(oVar, "keySelector is null");
        i.a.y0.b.b.g(oVar2, "valueSelector is null");
        i.a.y0.b.b.g(callable, "mapSupplier is null");
        i.a.y0.b.b.g(oVar3, "collectionFactory is null");
        return (k0<Map<K, Collection<V>>>) Y(callable, i.a.y0.b.a.H(oVar, oVar2, oVar3));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <U, R> l<R> H8(Publisher<? extends U> publisher, i.a.x0.c<? super T, ? super U, ? extends R> cVar, boolean z, int i2) {
        return u8(this, publisher, cVar, z, i2);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<List<T>> I(long j2, TimeUnit timeUnit) {
        return L(j2, timeUnit, i.a.f1.b.a(), Integer.MAX_VALUE);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.e
    @i.a.t0.f
    public final <R> l<R> I1(i.a.x0.o<? super T, a0<R>> oVar) {
        i.a.y0.b.b.g(oVar, "selector is null");
        return i.a.c1.a.P(new i.a.y0.e.b.l0(this, oVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> I2(i.a.x0.o<? super T, ? extends q0<? extends R>> oVar, boolean z, int i2) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "maxConcurrency");
        return i.a.c1.a.P(new e1(this, oVar, z, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.w0.a<T> I4(int i2) {
        i.a.y0.b.b.h(i2, "bufferSize");
        return r2.T8(this, i2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final k0<T> I5() {
        return i.a.c1.a.S(new r3(this, null));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> I6(long j2, TimeUnit timeUnit, j0 j0Var) {
        return K6(j2, timeUnit, j0Var, false, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final b0<T> I7() {
        return i.a.c1.a.R(new i.a.y0.e.e.g1(this));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<List<T>> J(long j2, TimeUnit timeUnit, int i2) {
        return L(j2, timeUnit, i.a.f1.b.a(), i2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> J1() {
        return L1(i.a.y0.b.a.k(), i.a.y0.b.a.g());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.NONE)
    public final i.a.u0.c J2(i.a.x0.g<? super T> gVar) {
        return b6(gVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> J5(long j2) {
        if (j2 <= 0) {
            return i.a.c1.a.P(this);
        }
        return i.a.c1.a.P(new s3(this, j2));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> J6(long j2, TimeUnit timeUnit, j0 j0Var, boolean z) {
        return K6(j2, timeUnit, j0Var, z, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final k0<List<T>> J7() {
        return L7(i.a.y0.b.a.p());
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<List<T>> K(long j2, TimeUnit timeUnit, j0 j0Var) {
        return (l<List<T>>) M(j2, timeUnit, j0Var, Integer.MAX_VALUE, i.a.y0.j.b.asCallable(), false);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <K> l<T> K1(i.a.x0.o<? super T, K> oVar) {
        return L1(oVar, i.a.y0.b.a.g());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.NONE)
    public final i.a.u0.c K2(i.a.x0.r<? super T> rVar) {
        return M2(rVar, i.a.y0.b.a.f28142f, i.a.y0.b.a.c);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> K5(long j2, TimeUnit timeUnit) {
        return S5(q7(j2, timeUnit));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> K6(long j2, TimeUnit timeUnit, j0 j0Var, boolean z, int i2) {
        return G6(Long.MAX_VALUE, j2, timeUnit, j0Var, z, i2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final k0<List<T>> K7(int i2) {
        return M7(i.a.y0.b.a.p(), i2);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<List<T>> L(long j2, TimeUnit timeUnit, j0 j0Var, int i2) {
        return (l<List<T>>) M(j2, timeUnit, j0Var, i2, i.a.y0.j.b.asCallable(), false);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <K> l<T> L1(i.a.x0.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        i.a.y0.b.b.g(oVar, "keySelector is null");
        i.a.y0.b.b.g(callable, "collectionSupplier is null");
        return i.a.c1.a.P(new i.a.y0.e.b.n0(this, oVar, callable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.NONE)
    public final i.a.u0.c L2(i.a.x0.r<? super T> rVar, i.a.x0.g<? super Throwable> gVar) {
        return M2(rVar, gVar, i.a.y0.b.a.c);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> L4(int i2) {
        return j4(i.a.y0.g.e.c, true, i2);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> L5(long j2, TimeUnit timeUnit, j0 j0Var) {
        return S5(r7(j2, timeUnit, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> L6(long j2, TimeUnit timeUnit, boolean z) {
        return K6(j2, timeUnit, i.a.f1.b.a(), z, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final k0<List<T>> L7(Comparator<? super T> comparator) {
        i.a.y0.b.b.g(comparator, "comparator is null");
        return (k0<List<T>>) y7().s0(i.a.y0.b.a.o(comparator));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final <U extends Collection<? super T>> l<U> M(long j2, TimeUnit timeUnit, j0 j0Var, int i2, Callable<U> callable, boolean z) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        i.a.y0.b.b.g(callable, "bufferSupplier is null");
        i.a.y0.b.b.h(i2, AnimatedPasterJsonConfig.CONFIG_COUNT);
        return i.a.c1.a.P(new i.a.y0.e.b.q(this, j2, j2, timeUnit, j0Var, callable, i2, z));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> M1() {
        return O1(i.a.y0.b.a.k());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.NONE)
    @i.a.t0.d
    @i.a.t0.f
    public final i.a.u0.c M2(i.a.x0.r<? super T> rVar, i.a.x0.g<? super Throwable> gVar, i.a.x0.a aVar) {
        i.a.y0.b.b.g(rVar, "onNext is null");
        i.a.y0.b.b.g(gVar, "onError is null");
        i.a.y0.b.b.g(aVar, "onComplete is null");
        i.a.y0.h.i iVar = new i.a.y0.h.i(rVar, gVar, aVar);
        f6(iVar);
        return iVar;
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final s<T> M4(i.a.x0.c<T, T, T> cVar) {
        i.a.y0.b.b.g(cVar, "reducer is null");
        return i.a.c1.a.Q(new w2(this, cVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> M5(int i2) {
        if (i2 >= 0) {
            if (i2 == 0) {
                return i.a.c1.a.P(this);
            }
            return i.a.c1.a.P(new t3(this, i2));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> M6(i.a.x0.r<? super T> rVar) {
        i.a.y0.b.b.g(rVar, "stopPredicate is null");
        return i.a.c1.a.P(new g4(this, rVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final k0<List<T>> M7(Comparator<? super T> comparator, int i2) {
        i.a.y0.b.b.g(comparator, "comparator is null");
        return (k0<List<T>>) z7(i2).s0(i.a.y0.b.a.o(comparator));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final <TOpening, TClosing> l<List<T>> N(l<? extends TOpening> lVar, i.a.x0.o<? super TOpening, ? extends Publisher<? extends TClosing>> oVar) {
        return (l<List<T>>) O(lVar, oVar, i.a.y0.j.b.asCallable());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> N0(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar) {
        return O0(oVar, 2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> N1(i.a.x0.d<? super T, ? super T> dVar) {
        i.a.y0.b.b.g(dVar, "comparer is null");
        return i.a.c1.a.P(new i.a.y0.e.b.o0(this, i.a.y0.b.a.k(), dVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> k0<R> N4(R r, i.a.x0.c<R, ? super T, R> cVar) {
        i.a.y0.b.b.g(r, "seed is null");
        i.a.y0.b.b.g(cVar, "reducer is null");
        return i.a.c1.a.S(new x2(this, r, cVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final l<T> N5(long j2, TimeUnit timeUnit) {
        return Q5(j2, timeUnit, i.a.f1.b.a(), false, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> l<T> N6(Publisher<U> publisher) {
        i.a.y0.b.b.g(publisher, "other is null");
        return i.a.c1.a.P(new f4(this, publisher));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final <TOpening, TClosing, U extends Collection<? super T>> l<U> O(l<? extends TOpening> lVar, i.a.x0.o<? super TOpening, ? extends Publisher<? extends TClosing>> oVar, Callable<U> callable) {
        i.a.y0.b.b.g(lVar, "openingIndicator is null");
        i.a.y0.b.b.g(oVar, "closingIndicator is null");
        i.a.y0.b.b.g(callable, "bufferSupplier is null");
        return i.a.c1.a.P(new i.a.y0.e.b.n(this, lVar, oVar, callable));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> O0(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "prefetch");
        if (this instanceof i.a.y0.c.m) {
            Object call = ((i.a.y0.c.m) this).call();
            if (call == null) {
                return g2();
            }
            return j3.a(call, oVar);
        }
        return i.a.c1.a.P(new i.a.y0.e.b.w(this, oVar, i2, i.a.y0.j.j.IMMEDIATE));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <K> l<T> O1(i.a.x0.o<? super T, K> oVar) {
        i.a.y0.b.b.g(oVar, "keySelector is null");
        return i.a.c1.a.P(new i.a.y0.e.b.o0(this, oVar, i.a.y0.b.b.d()));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> k0<R> O4(Callable<R> callable, i.a.x0.c<R, ? super T, R> cVar) {
        i.a.y0.b.b.g(callable, "seedSupplier is null");
        i.a.y0.b.b.g(cVar, "reducer is null");
        return i.a.c1.a.S(new y2(this, callable, cVar));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final l<T> O5(long j2, TimeUnit timeUnit, j0 j0Var) {
        return Q5(j2, timeUnit, j0Var, false, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> O6(i.a.x0.r<? super T> rVar) {
        i.a.y0.b.b.g(rVar, "predicate is null");
        return i.a.c1.a.P(new h4(this, rVar));
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> O7(j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.P(new q4(this, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final <B> l<List<T>> P(Callable<? extends Publisher<B>> callable) {
        return (l<List<T>>) Q(callable, i.a.y0.j.b.asCallable());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final c P0(i.a.x0.o<? super T, ? extends i> oVar) {
        return Q0(oVar, 2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> P1(i.a.x0.g<? super T> gVar) {
        i.a.y0.b.b.g(gVar, "onAfterNext is null");
        return i.a.c1.a.P(new i.a.y0.e.b.p0(this, gVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> P4() {
        return Q4(Long.MAX_VALUE);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final l<T> P5(long j2, TimeUnit timeUnit, j0 j0Var, boolean z) {
        return Q5(j2, timeUnit, j0Var, z, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final i.a.h1.f<T> P6() {
        i.a.h1.f<T> fVar = new i.a.h1.f<>();
        f6(fVar);
        return fVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final <B, U extends Collection<? super T>> l<U> Q(Callable<? extends Publisher<B>> callable, Callable<U> callable2) {
        i.a.y0.b.b.g(callable, "boundaryIndicatorSupplier is null");
        i.a.y0.b.b.g(callable2, "bufferSupplier is null");
        return i.a.c1.a.P(new i.a.y0.e.b.o(this, callable, callable2));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final c Q0(i.a.x0.o<? super T, ? extends i> oVar, int i2) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.O(new i.a.y0.e.d.c(this, oVar, i.a.y0.j.j.IMMEDIATE, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> Q1(i.a.x0.a aVar) {
        return V1(i.a.y0.b.a.h(), i.a.y0.b.a.h(), i.a.y0.b.a.c, aVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> Q4(long j2) {
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 >= 0) {
            if (i2 == 0) {
                return g2();
            }
            return i.a.c1.a.P(new a3(this, j2));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j2);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> Q5(long j2, TimeUnit timeUnit, j0 j0Var, boolean z, int i2) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.P(new u3(this, j2, timeUnit, j0Var, i2 << 1, z));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.h1.f<T> Q6(long j2) {
        i.a.h1.f<T> fVar = new i.a.h1.f<>(j2);
        f6(fVar);
        return fVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final <B> l<List<T>> R(Publisher<B> publisher) {
        return (l<List<T>>) T(publisher, i.a.y0.j.b.asCallable());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final c R0(i.a.x0.o<? super T, ? extends i> oVar) {
        return T0(oVar, true, 2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> R1(i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "onFinally is null");
        return i.a.c1.a.P(new i.a.y0.e.b.q0(this, aVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> R4(i.a.x0.e eVar) {
        i.a.y0.b.b.g(eVar, "stop is null");
        return i.a.c1.a.P(new b3(this, eVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final l<T> R5(long j2, TimeUnit timeUnit, boolean z) {
        return Q5(j2, timeUnit, i.a.f1.b.a(), z, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.h1.f<T> R6(long j2, boolean z) {
        i.a.h1.f<T> fVar = new i.a.h1.f<>(j2);
        if (z) {
            fVar.cancel();
        }
        f6(fVar);
        return fVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<l<T>> R7(long j2) {
        return T7(j2, j2, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final <B> l<List<T>> S(Publisher<B> publisher, int i2) {
        i.a.y0.b.b.h(i2, "initialCapacity");
        return (l<List<T>>) T(publisher, i.a.y0.b.a.f(i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final c S0(i.a.x0.o<? super T, ? extends i> oVar, boolean z) {
        return T0(oVar, z, 2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> S1(i.a.x0.a aVar) {
        return Y1(i.a.y0.b.a.h(), i.a.y0.b.a.f28143g, aVar);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> S4(i.a.x0.o<? super l<Object>, ? extends Publisher<?>> oVar) {
        i.a.y0.b.b.g(oVar, "handler is null");
        return i.a.c1.a.P(new c3(this, oVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> l<T> S5(Publisher<U> publisher) {
        i.a.y0.b.b.g(publisher, "other is null");
        return i.a.c1.a.P(new v3(this, publisher));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<T> S6(long j2, TimeUnit timeUnit) {
        return T6(j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<l<T>> S7(long j2, long j3) {
        return T7(j2, j3, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final <B, U extends Collection<? super T>> l<U> T(Publisher<B> publisher, Callable<U> callable) {
        i.a.y0.b.b.g(publisher, "boundaryIndicator is null");
        i.a.y0.b.b.g(callable, "bufferSupplier is null");
        return i.a.c1.a.P(new i.a.y0.e.b.p(this, publisher, callable));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final c T0(i.a.x0.o<? super T, ? extends i> oVar, boolean z, int i2) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.O(new i.a.y0.e.d.c(this, oVar, z ? i.a.y0.j.j.END : i.a.y0.j.j.BOUNDARY, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> T1(i.a.x0.a aVar) {
        return V1(i.a.y0.b.a.h(), i.a.y0.b.a.h(), aVar, i.a.y0.b.a.c);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> T4(i.a.x0.o<? super l<T>, ? extends Publisher<R>> oVar) {
        i.a.y0.b.b.g(oVar, "selector is null");
        return d3.Y8(s1.d(this), oVar);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> T5(i.a.x0.r<? super T> rVar) {
        i.a.y0.b.b.g(rVar, "predicate is null");
        return i.a.c1.a.P(new w3(this, rVar));
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> T6(long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.P(new i4(this, j2, timeUnit, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<l<T>> T7(long j2, long j3, int i2) {
        i.a.y0.b.b.i(j3, "skip");
        i.a.y0.b.b.i(j2, AnimatedPasterJsonConfig.CONFIG_COUNT);
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.P(new s4(this, j2, j3, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> U0(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar) {
        return V0(oVar, 2, true);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> U1(i.a.x0.g<? super a0<T>> gVar) {
        i.a.y0.b.b.g(gVar, "consumer is null");
        return V1(i.a.y0.b.a.t(gVar), i.a.y0.b.a.s(gVar), i.a.y0.b.a.r(gVar), i.a.y0.b.a.c);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> U4(i.a.x0.o<? super l<T>, ? extends Publisher<R>> oVar, int i2) {
        i.a.y0.b.b.g(oVar, "selector is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return d3.Y8(s1.e(this, i2), oVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> U5() {
        return y7().s1().G3(i.a.y0.b.a.o(i.a.y0.b.a.p())).B2(i.a.y0.b.a.k());
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<T> U6(long j2, TimeUnit timeUnit) {
        return r5(j2, timeUnit);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<l<T>> U7(long j2, long j3, TimeUnit timeUnit) {
        return W7(j2, j3, timeUnit, i.a.f1.b.a(), U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> V() {
        return W(16);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> V0(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2, boolean z) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "prefetch");
        if (this instanceof i.a.y0.c.m) {
            Object call = ((i.a.y0.c.m) this).call();
            if (call == null) {
                return g2();
            }
            return j3.a(call, oVar);
        }
        return i.a.c1.a.P(new i.a.y0.e.b.w(this, oVar, i2, z ? i.a.y0.j.j.END : i.a.y0.j.j.BOUNDARY));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> V4(i.a.x0.o<? super l<T>, ? extends Publisher<R>> oVar, int i2, long j2, TimeUnit timeUnit) {
        return W4(oVar, i2, j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> V5(Comparator<? super T> comparator) {
        i.a.y0.b.b.g(comparator, "sortFunction");
        return y7().s1().G3(i.a.y0.b.a.o(comparator)).B2(i.a.y0.b.a.k());
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<T> V6(long j2, TimeUnit timeUnit, j0 j0Var) {
        return s5(j2, timeUnit, j0Var);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<l<T>> V7(long j2, long j3, TimeUnit timeUnit, j0 j0Var) {
        return W7(j2, j3, timeUnit, j0Var, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> W(int i2) {
        i.a.y0.b.b.h(i2, "initialCapacity");
        return i.a.c1.a.P(new i.a.y0.e.b.r(this, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> W0(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar) {
        return X0(oVar, U(), U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> W1(Subscriber<? super T> subscriber) {
        i.a.y0.b.b.g(subscriber, "subscriber is null");
        return V1(s1.m(subscriber), s1.l(subscriber), s1.k(subscriber), i.a.y0.b.a.c);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> W4(i.a.x0.o<? super l<T>, ? extends Publisher<R>> oVar, int i2, long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(oVar, "selector is null");
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return d3.Y8(s1.f(this, i2, j2, timeUnit, j0Var), oVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> W5(Iterable<? extends T> iterable) {
        return A0(T2(iterable), this);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<T> W6(long j2, TimeUnit timeUnit) {
        return Y6(j2, timeUnit, i.a.f1.b.a(), false);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final l<l<T>> W7(long j2, long j3, TimeUnit timeUnit, j0 j0Var, int i2) {
        i.a.y0.b.b.h(i2, "bufferSize");
        i.a.y0.b.b.i(j2, "timespan");
        i.a.y0.b.b.i(j3, "timeskip");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        i.a.y0.b.b.g(timeUnit, "unit is null");
        return i.a.c1.a.P(new w4(this, j2, j3, timeUnit, j0Var, Long.MAX_VALUE, i2, false));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> l<U> X(Class<U> cls) {
        i.a.y0.b.b.g(cls, "clazz is null");
        return (l<U>) G3(i.a.y0.b.a.e(cls));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> X0(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2, int i3) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "maxConcurrency");
        i.a.y0.b.b.h(i3, "prefetch");
        return i.a.c1.a.P(new i.a.y0.e.b.x(this, oVar, i2, i3, i.a.y0.j.j.IMMEDIATE));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> X1(i.a.x0.g<? super Throwable> gVar) {
        i.a.x0.g<? super T> h2 = i.a.y0.b.a.h();
        i.a.x0.a aVar = i.a.y0.b.a.c;
        return V1(h2, gVar, aVar, aVar);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> X4(i.a.x0.o<? super l<T>, ? extends Publisher<R>> oVar, int i2, j0 j0Var) {
        i.a.y0.b.b.g(oVar, "selector is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return d3.Y8(s1.e(this, i2), s1.h(oVar, j0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> X5(T t) {
        i.a.y0.b.b.g(t, "item is null");
        return A0(r3(t), this);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<T> X6(long j2, TimeUnit timeUnit, j0 j0Var) {
        return Y6(j2, timeUnit, j0Var, false);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<l<T>> X7(long j2, TimeUnit timeUnit) {
        return c8(j2, timeUnit, i.a.f1.b.a(), Long.MAX_VALUE, false);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> k0<U> Y(Callable<? extends U> callable, i.a.x0.b<? super U, ? super T> bVar) {
        i.a.y0.b.b.g(callable, "initialItemSupplier is null");
        i.a.y0.b.b.g(bVar, "collector is null");
        return i.a.c1.a.S(new i.a.y0.e.b.t(this, callable, bVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> Y0(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2, int i3, boolean z) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "maxConcurrency");
        i.a.y0.b.b.h(i3, "prefetch");
        return i.a.c1.a.P(new i.a.y0.e.b.x(this, oVar, i2, i3, z ? i.a.y0.j.j.END : i.a.y0.j.j.BOUNDARY));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> Y1(i.a.x0.g<? super Subscription> gVar, i.a.x0.q qVar, i.a.x0.a aVar) {
        i.a.y0.b.b.g(gVar, "onSubscribe is null");
        i.a.y0.b.b.g(qVar, "onRequest is null");
        i.a.y0.b.b.g(aVar, "onCancel is null");
        return i.a.c1.a.P(new s0(this, gVar, qVar, aVar));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> Y4(i.a.x0.o<? super l<T>, ? extends Publisher<R>> oVar, long j2, TimeUnit timeUnit) {
        return Z4(oVar, j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> Y5(Publisher<? extends T> publisher) {
        i.a.y0.b.b.g(publisher, "other is null");
        return A0(publisher, this);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> Y6(long j2, TimeUnit timeUnit, j0 j0Var, boolean z) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.P(new j4(this, j2, timeUnit, j0Var, z));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<l<T>> Y7(long j2, TimeUnit timeUnit, long j3) {
        return c8(j2, timeUnit, i.a.f1.b.a(), j3, false);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> k0<U> Z(U u, i.a.x0.b<? super U, ? super T> bVar) {
        i.a.y0.b.b.g(u, "initialItem is null");
        return Y(i.a.y0.b.a.m(u), bVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> Z0(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, boolean z) {
        return Y0(oVar, U(), U(), z);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> Z1(i.a.x0.g<? super T> gVar) {
        i.a.x0.g<? super Throwable> h2 = i.a.y0.b.a.h();
        i.a.x0.a aVar = i.a.y0.b.a.c;
        return V1(gVar, h2, aVar, aVar);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> Z4(i.a.x0.o<? super l<T>, ? extends Publisher<R>> oVar, long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(oVar, "selector is null");
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return d3.Y8(s1.g(this, j2, timeUnit, j0Var), oVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> Z5(T... tArr) {
        l N2 = N2(tArr);
        if (N2 == g2()) {
            return i.a.c1.a.P(this);
        }
        return A0(N2, this);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<T> Z6(long j2, TimeUnit timeUnit, boolean z) {
        return Y6(j2, timeUnit, i.a.f1.b.a(), z);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<l<T>> Z7(long j2, TimeUnit timeUnit, long j3, boolean z) {
        return c8(j2, timeUnit, i.a.f1.b.a(), j3, z);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <U> l<U> a1(i.a.x0.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return b1(oVar, 2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> a2(i.a.x0.q qVar) {
        return Y1(i.a.y0.b.a.h(), qVar, i.a.y0.b.a.c);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <K> l<i.a.w0.b<K, T>> a3(i.a.x0.o<? super T, ? extends K> oVar) {
        return (l<i.a.w0.b<K, T>>) d3(oVar, i.a.y0.b.a.k(), false, U());
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> a5(i.a.x0.o<? super l<T>, ? extends Publisher<R>> oVar, j0 j0Var) {
        i.a.y0.b.b.g(oVar, "selector is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return d3.Y8(s1.d(this), s1.h(oVar, j0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final i.a.u0.c a6() {
        return e6(i.a.y0.b.a.h(), i.a.y0.b.a.f28142f, i.a.y0.b.a.c, s1.i.INSTANCE);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<T> a7(long j2, TimeUnit timeUnit) {
        return t1(j2, timeUnit);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<l<T>> a8(long j2, TimeUnit timeUnit, j0 j0Var) {
        return c8(j2, timeUnit, j0Var, Long.MAX_VALUE, false);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final k0<Boolean> b(i.a.x0.r<? super T> rVar) {
        i.a.y0.b.b.g(rVar, "predicate is null");
        return i.a.c1.a.S(new i.a.y0.e.b.g(this, rVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> l<U> b1(i.a.x0.o<? super T, ? extends Iterable<? extends U>> oVar, int i2) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.P(new f1(this, oVar, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> b2(i.a.x0.g<? super Subscription> gVar) {
        return Y1(gVar, i.a.y0.b.a.f28143g, i.a.y0.b.a.c);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <K, V> l<i.a.w0.b<K, V>> b3(i.a.x0.o<? super T, ? extends K> oVar, i.a.x0.o<? super T, ? extends V> oVar2) {
        return d3(oVar, oVar2, false, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.w0.a<T> b5() {
        return d3.X8(this);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final i.a.u0.c b6(i.a.x0.g<? super T> gVar) {
        return e6(gVar, i.a.y0.b.a.f28142f, i.a.y0.b.a.c, s1.i.INSTANCE);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<T> b7(long j2, TimeUnit timeUnit, j0 j0Var) {
        return u1(j2, timeUnit, j0Var);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<l<T>> b8(long j2, TimeUnit timeUnit, j0 j0Var, long j3) {
        return c8(j2, timeUnit, j0Var, j3, false);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> c1(i.a.x0.o<? super T, ? extends y<? extends R>> oVar) {
        return d1(oVar, 2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> c2(i.a.x0.a aVar) {
        return V1(i.a.y0.b.a.h(), i.a.y0.b.a.a(aVar), aVar, i.a.y0.b.a.c);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <K, V> l<i.a.w0.b<K, V>> c3(i.a.x0.o<? super T, ? extends K> oVar, i.a.x0.o<? super T, ? extends V> oVar2, boolean z) {
        return d3(oVar, oVar2, z, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> c4(@i.a.t0.f i iVar) {
        i.a.y0.b.b.g(iVar, "other is null");
        return i.a.c1.a.P(new f2(this, iVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.w0.a<T> c5(int i2) {
        i.a.y0.b.b.h(i2, "bufferSize");
        return d3.T8(this, i2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final i.a.u0.c c6(i.a.x0.g<? super T> gVar, i.a.x0.g<? super Throwable> gVar2) {
        return e6(gVar, gVar2, i.a.y0.b.a.c, s1.i.INSTANCE);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<i.a.f1.d<T>> c7() {
        return f7(TimeUnit.MILLISECONDS, i.a.f1.b.a());
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<l<T>> c8(long j2, TimeUnit timeUnit, j0 j0Var, long j3, boolean z) {
        return d8(j2, timeUnit, j0Var, j3, z, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> d1(i.a.x0.o<? super T, ? extends y<? extends R>> oVar, int i2) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.P(new i.a.y0.e.d.d(this, oVar, i.a.y0.j.j.IMMEDIATE, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final s<T> d2(long j2) {
        if (j2 >= 0) {
            return i.a.c1.a.Q(new u0(this, j2));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <K, V> l<i.a.w0.b<K, V>> d3(i.a.x0.o<? super T, ? extends K> oVar, i.a.x0.o<? super T, ? extends V> oVar2, boolean z, int i2) {
        i.a.y0.b.b.g(oVar, "keySelector is null");
        i.a.y0.b.b.g(oVar2, "valueSelector is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.P(new n1(this, oVar, oVar2, i2, z, null));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> d4(@i.a.t0.f y<? extends T> yVar) {
        i.a.y0.b.b.g(yVar, "other is null");
        return i.a.c1.a.P(new g2(this, yVar));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.w0.a<T> d5(int i2, long j2, TimeUnit timeUnit) {
        return e5(i2, j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final i.a.u0.c d6(i.a.x0.g<? super T> gVar, i.a.x0.g<? super Throwable> gVar2, i.a.x0.a aVar) {
        return e6(gVar, gVar2, aVar, s1.i.INSTANCE);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<i.a.f1.d<T>> d7(j0 j0Var) {
        return f7(TimeUnit.MILLISECONDS, j0Var);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final l<l<T>> d8(long j2, TimeUnit timeUnit, j0 j0Var, long j3, boolean z, int i2) {
        i.a.y0.b.b.h(i2, "bufferSize");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.i(j3, AnimatedPasterJsonConfig.CONFIG_COUNT);
        return i.a.c1.a.P(new w4(this, j2, j2, timeUnit, j0Var, j3, i2, z));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> e(Publisher<? extends T> publisher) {
        i.a.y0.b.b.g(publisher, "other is null");
        return d(this, publisher);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> e1(i.a.x0.o<? super T, ? extends y<? extends R>> oVar) {
        return g1(oVar, true, 2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final k0<T> e2(long j2, T t) {
        if (j2 >= 0) {
            i.a.y0.b.b.g(t, "defaultItem is null");
            return i.a.c1.a.S(new v0(this, j2, t));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <K, V> l<i.a.w0.b<K, V>> e3(i.a.x0.o<? super T, ? extends K> oVar, i.a.x0.o<? super T, ? extends V> oVar2, boolean z, int i2, i.a.x0.o<? super i.a.x0.g<Object>, ? extends Map<K, Object>> oVar3) {
        i.a.y0.b.b.g(oVar, "keySelector is null");
        i.a.y0.b.b.g(oVar2, "valueSelector is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        i.a.y0.b.b.g(oVar3, "evictingMapFactory is null");
        return i.a.c1.a.P(new n1(this, oVar, oVar2, i2, z, oVar3));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> e4(@i.a.t0.f q0<? extends T> q0Var) {
        i.a.y0.b.b.g(q0Var, "other is null");
        return i.a.c1.a.P(new h2(this, q0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.w0.a<T> e5(int i2, long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.h(i2, "bufferSize");
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return d3.V8(this, j2, timeUnit, j0Var, i2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    @i.a.t0.d
    @i.a.t0.f
    public final i.a.u0.c e6(i.a.x0.g<? super T> gVar, i.a.x0.g<? super Throwable> gVar2, i.a.x0.a aVar, i.a.x0.g<? super Subscription> gVar3) {
        i.a.y0.b.b.g(gVar, "onNext is null");
        i.a.y0.b.b.g(gVar2, "onError is null");
        i.a.y0.b.b.g(aVar, "onComplete is null");
        i.a.y0.b.b.g(gVar3, "onSubscribe is null");
        i.a.y0.h.m mVar = new i.a.y0.h.m(gVar, gVar2, aVar, gVar3);
        f6(mVar);
        return mVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<i.a.f1.d<T>> e7(TimeUnit timeUnit) {
        return f7(timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final <B> l<l<T>> e8(Callable<? extends Publisher<B>> callable) {
        return f8(callable, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final k0<Boolean> f(i.a.x0.r<? super T> rVar) {
        i.a.y0.b.b.g(rVar, "predicate is null");
        return i.a.c1.a.S(new i.a.y0.e.b.j(this, rVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> f1(i.a.x0.o<? super T, ? extends y<? extends R>> oVar, boolean z) {
        return g1(oVar, z, 2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final k0<T> f2(long j2) {
        if (j2 >= 0) {
            return i.a.c1.a.S(new v0(this, j2, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <K> l<i.a.w0.b<K, T>> f3(i.a.x0.o<? super T, ? extends K> oVar, boolean z) {
        return (l<i.a.w0.b<K, T>>) d3(oVar, i.a.y0.b.a.k(), z, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> f4(Publisher<? extends T> publisher) {
        i.a.y0.b.b.g(publisher, "other is null");
        return N3(this, publisher);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.w0.a<T> f5(int i2, j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return d3.Z8(c5(i2), j0Var);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    public final void f6(q<? super T> qVar) {
        i.a.y0.b.b.g(qVar, "s is null");
        try {
            Subscriber<? super T> h0 = i.a.c1.a.h0(this, qVar);
            i.a.y0.b.b.g(h0, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            g6(h0);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            i.a.v0.b.b(th);
            i.a.c1.a.Y(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<i.a.f1.d<T>> f7(TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.P(new k4(this, timeUnit, j0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final <B> l<l<T>> f8(Callable<? extends Publisher<B>> callable, int i2) {
        i.a.y0.b.b.g(callable, "boundaryIndicatorSupplier is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.P(new v4(this, callable, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    public final <R> R g(@i.a.t0.f m<T, ? extends R> mVar) {
        return (R) ((m) i.a.y0.b.b.g(mVar, "converter is null")).a(this);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> g1(i.a.x0.o<? super T, ? extends y<? extends R>> oVar, boolean z, int i2) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.P(new i.a.y0.e.d.d(this, oVar, z ? i.a.y0.j.j.END : i.a.y0.j.j.BOUNDARY, i2));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final <TRight, TLeftEnd, TRightEnd, R> l<R> g3(Publisher<? extends TRight> publisher, i.a.x0.o<? super T, ? extends Publisher<TLeftEnd>> oVar, i.a.x0.o<? super TRight, ? extends Publisher<TRightEnd>> oVar2, i.a.x0.c<? super T, ? super l<TRight>, ? extends R> cVar) {
        i.a.y0.b.b.g(publisher, "other is null");
        i.a.y0.b.b.g(oVar, "leftEnd is null");
        i.a.y0.b.b.g(oVar2, "rightEnd is null");
        i.a.y0.b.b.g(cVar, "resultSelector is null");
        return i.a.c1.a.P(new o1(this, publisher, oVar, oVar2, cVar));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.w0.a<T> g5(long j2, TimeUnit timeUnit) {
        return h5(j2, timeUnit, i.a.f1.b.a());
    }

    public abstract void g6(Subscriber<? super T> subscriber);

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> g7(long j2, TimeUnit timeUnit) {
        return o7(j2, timeUnit, null, i.a.f1.b.a());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final <B> l<l<T>> g8(Publisher<B> publisher) {
        return h8(publisher, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final T h() {
        i.a.y0.h.d dVar = new i.a.y0.h.d();
        f6(dVar);
        T a2 = dVar.a();
        if (a2 != null) {
            return a2;
        }
        throw new NoSuchElementException();
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> h1(i.a.x0.o<? super T, ? extends q0<? extends R>> oVar) {
        return i1(oVar, 2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> h3() {
        return i.a.c1.a.P(new p1(this));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> h4(j0 j0Var) {
        return j4(j0Var, false, U());
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.w0.a<T> h5(long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return d3.U8(this, j2, timeUnit, j0Var);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> h6(@i.a.t0.f j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i6(j0Var, !(this instanceof i.a.y0.e.b.f0));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> h7(long j2, TimeUnit timeUnit, j0 j0Var) {
        return o7(j2, timeUnit, null, j0Var);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final <B> l<l<T>> h8(Publisher<B> publisher, int i2) {
        i.a.y0.b.b.g(publisher, "boundaryIndicator is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.P(new t4(this, publisher, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final T i(T t) {
        i.a.y0.h.d dVar = new i.a.y0.h.d();
        f6(dVar);
        T a2 = dVar.a();
        return a2 != null ? a2 : t;
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> i1(i.a.x0.o<? super T, ? extends q0<? extends R>> oVar, int i2) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.P(new i.a.y0.e.d.e(this, oVar, i.a.y0.j.j.IMMEDIATE, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final c i3() {
        return i.a.c1.a.O(new r1(this));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> i4(j0 j0Var, boolean z) {
        return j4(j0Var, z, U());
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final i.a.w0.a<T> i5(j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return d3.Z8(b5(), j0Var);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> i6(@i.a.t0.f j0 j0Var, boolean z) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.P(new x3(this, j0Var, z));
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> i7(long j2, TimeUnit timeUnit, j0 j0Var, Publisher<? extends T> publisher) {
        i.a.y0.b.b.g(publisher, "other is null");
        return o7(j2, timeUnit, publisher, j0Var);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final <U, V> l<l<T>> i8(Publisher<U> publisher, i.a.x0.o<? super U, ? extends Publisher<V>> oVar) {
        return j8(publisher, oVar, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final void j(i.a.x0.g<? super T> gVar) {
        Iterator<T> it = k().iterator();
        while (it.hasNext()) {
            try {
                gVar.accept(it.next());
            } catch (Throwable th) {
                i.a.v0.b.b(th);
                ((i.a.u0.c) it).dispose();
                throw i.a.y0.j.k.f(th);
            }
        }
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> j1(i.a.x0.o<? super T, ? extends q0<? extends R>> oVar) {
        return l1(oVar, true, 2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> j2(i.a.x0.r<? super T> rVar) {
        i.a.y0.b.b.g(rVar, "predicate is null");
        return i.a.c1.a.P(new y0(this, rVar));
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> j4(j0 j0Var, boolean z, int i2) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.P(new j2(this, j0Var, z, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> j5() {
        return l5(Long.MAX_VALUE, i.a.y0.b.a.c());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    public final <E extends Subscriber<? super T>> E j6(E e2) {
        subscribe(e2);
        return e2;
    }

    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> j7(long j2, TimeUnit timeUnit, Publisher<? extends T> publisher) {
        i.a.y0.b.b.g(publisher, "other is null");
        return o7(j2, timeUnit, publisher, i.a.f1.b.a());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final <U, V> l<l<T>> j8(Publisher<U> publisher, i.a.x0.o<? super U, ? extends Publisher<V>> oVar, int i2) {
        i.a.y0.b.b.g(publisher, "openingIndicator is null");
        i.a.y0.b.b.g(oVar, "closingIndicator is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.P(new u4(this, publisher, oVar, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final Iterable<T> k() {
        return l(U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> k1(i.a.x0.o<? super T, ? extends q0<? extends R>> oVar, boolean z) {
        return l1(oVar, z, 2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    public final k0<T> k2(T t) {
        return e2(0L, t);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> l<U> k4(Class<U> cls) {
        i.a.y0.b.b.g(cls, "clazz is null");
        return j2(i.a.y0.b.a.l(cls)).X(cls);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> k5(long j2) {
        return l5(j2, i.a.y0.b.a.c());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> k6(Publisher<? extends T> publisher) {
        i.a.y0.b.b.g(publisher, "other is null");
        return i.a.c1.a.P(new y3(this, publisher));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final <V> l<T> k7(i.a.x0.o<? super T, ? extends Publisher<V>> oVar) {
        return p7(null, oVar, null);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> k8(Iterable<? extends Publisher<?>> iterable, i.a.x0.o<? super Object[], R> oVar) {
        i.a.y0.b.b.g(iterable, "others is null");
        i.a.y0.b.b.g(oVar, "combiner is null");
        return i.a.c1.a.P(new y4(this, iterable, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final Iterable<T> l(int i2) {
        i.a.y0.b.b.h(i2, "bufferSize");
        return new i.a.y0.e.b.b(this, i2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> l1(i.a.x0.o<? super T, ? extends q0<? extends R>> oVar, boolean z, int i2) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.P(new i.a.y0.e.d.e(this, oVar, z ? i.a.y0.j.j.END : i.a.y0.j.j.BOUNDARY, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    public final s<T> l2() {
        return d2(0L);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final l<T> l4() {
        return p4(U(), false, true);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> l5(long j2, i.a.x0.r<? super Throwable> rVar) {
        if (j2 >= 0) {
            i.a.y0.b.b.g(rVar, "predicate is null");
            return i.a.c1.a.P(new f3(this, j2, rVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> l6(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar) {
        return m6(oVar, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <V> l<T> l7(i.a.x0.o<? super T, ? extends Publisher<V>> oVar, l<? extends T> lVar) {
        i.a.y0.b.b.g(lVar, "other is null");
        return p7(null, oVar, lVar);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final <U, R> l<R> l8(Publisher<? extends U> publisher, i.a.x0.c<? super T, ? super U, ? extends R> cVar) {
        i.a.y0.b.b.g(publisher, "other is null");
        i.a.y0.b.b.g(cVar, "combiner is null");
        return i.a.c1.a.P(new x4(this, cVar, publisher));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final T m() {
        i.a.y0.h.e eVar = new i.a.y0.h.e();
        f6(eVar);
        T a2 = eVar.a();
        if (a2 != null) {
            return a2;
        }
        throw new NoSuchElementException();
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> m1(@i.a.t0.f i iVar) {
        i.a.y0.b.b.g(iVar, "other is null");
        return i.a.c1.a.P(new i.a.y0.e.b.a0(this, iVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    public final k0<T> m2() {
        return f2(0L);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<T> m4(int i2) {
        return p4(i2, false, false);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> m5(i.a.x0.d<? super Integer, ? super Throwable> dVar) {
        i.a.y0.b.b.g(dVar, "predicate is null");
        return i.a.c1.a.P(new e3(this, dVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> m6(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2) {
        return n6(oVar, i2, false);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final <U, V> l<T> m7(Publisher<U> publisher, i.a.x0.o<? super T, ? extends Publisher<V>> oVar) {
        i.a.y0.b.b.g(publisher, "firstTimeoutIndicator is null");
        return p7(publisher, oVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final <T1, T2, R> l<R> m8(Publisher<T1> publisher, Publisher<T2> publisher2, i.a.x0.h<? super T, ? super T1, ? super T2, R> hVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        return p8(new Publisher[]{publisher, publisher2}, i.a.y0.b.a.y(hVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final T n(T t) {
        i.a.y0.h.e eVar = new i.a.y0.h.e();
        f6(eVar);
        T a2 = eVar.a();
        return a2 != null ? a2 : t;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> n1(@i.a.t0.f y<? extends T> yVar) {
        i.a.y0.b.b.g(yVar, "other is null");
        return i.a.c1.a.P(new i.a.y0.e.b.b0(this, yVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> n2(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar) {
        return y2(oVar, false, U(), U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<T> n4(int i2, i.a.x0.a aVar) {
        return q4(i2, false, false, aVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> n5(i.a.x0.r<? super Throwable> rVar) {
        return l5(Long.MAX_VALUE, rVar);
    }

    public <R> l<R> n6(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2, boolean z) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "bufferSize");
        if (this instanceof i.a.y0.c.m) {
            Object call = ((i.a.y0.c.m) this).call();
            if (call == null) {
                return g2();
            }
            return j3.a(call, oVar);
        }
        return i.a.c1.a.P(new z3(this, oVar, i2, z));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U, V> l<T> n7(Publisher<U> publisher, i.a.x0.o<? super T, ? extends Publisher<V>> oVar, Publisher<? extends T> publisher2) {
        i.a.y0.b.b.g(publisher, "firstTimeoutSelector is null");
        i.a.y0.b.b.g(publisher2, "other is null");
        return p7(publisher, oVar, publisher2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final <T1, T2, T3, R> l<R> n8(Publisher<T1> publisher, Publisher<T2> publisher2, Publisher<T3> publisher3, i.a.x0.i<? super T, ? super T1, ? super T2, ? super T3, R> iVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        return p8(new Publisher[]{publisher, publisher2, publisher3}, i.a.y0.b.a.z(iVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final Iterable<T> o() {
        return new i.a.y0.e.b.c(this);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> o1(@i.a.t0.f q0<? extends T> q0Var) {
        i.a.y0.b.b.g(q0Var, "other is null");
        return i.a.c1.a.P(new i.a.y0.e.b.c0(this, q0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> o2(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2) {
        return y2(oVar, false, i2, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<T> o4(int i2, boolean z) {
        return p4(i2, z, false);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> o5(i.a.x0.e eVar) {
        i.a.y0.b.b.g(eVar, "stop is null");
        return l5(Long.MAX_VALUE, i.a.y0.b.a.v(eVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final c o6(@i.a.t0.f i.a.x0.o<? super T, ? extends i> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.O(new i.a.y0.e.d.f(this, oVar, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final <T1, T2, T3, T4, R> l<R> o8(Publisher<T1> publisher, Publisher<T2> publisher2, Publisher<T3> publisher3, Publisher<T4> publisher4, i.a.x0.j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> jVar) {
        i.a.y0.b.b.g(publisher, "source1 is null");
        i.a.y0.b.b.g(publisher2, "source2 is null");
        i.a.y0.b.b.g(publisher3, "source3 is null");
        i.a.y0.b.b.g(publisher4, "source4 is null");
        return p8(new Publisher[]{publisher, publisher2, publisher3, publisher4}, i.a.y0.b.a.A(jVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final Iterable<T> p(T t) {
        return new i.a.y0.e.b.d(this, t);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> p1(Publisher<? extends T> publisher) {
        i.a.y0.b.b.g(publisher, "other is null");
        return x0(this, publisher);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <U, R> l<R> p2(i.a.x0.o<? super T, ? extends Publisher<? extends U>> oVar, i.a.x0.c<? super T, ? super U, ? extends R> cVar) {
        return t2(oVar, cVar, false, U(), U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final k0<Boolean> p3() {
        return b(i.a.y0.b.a.b());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    public final l<T> p4(int i2, boolean z, boolean z2) {
        i.a.y0.b.b.h(i2, "bufferSize");
        return i.a.c1.a.P(new k2(this, i2, z2, z, i.a.y0.b.a.c));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> p5(i.a.x0.o<? super l<Throwable>, ? extends Publisher<?>> oVar) {
        i.a.y0.b.b.g(oVar, "handler is null");
        return i.a.c1.a.P(new g3(this, oVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final c p6(@i.a.t0.f i.a.x0.o<? super T, ? extends i> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.O(new i.a.y0.e.d.f(this, oVar, true));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> p8(Publisher<?>[] publisherArr, i.a.x0.o<? super Object[], R> oVar) {
        i.a.y0.b.b.g(publisherArr, "others is null");
        i.a.y0.b.b.g(oVar, "combiner is null");
        return i.a.c1.a.P(new y4(this, publisherArr, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final Iterable<T> q() {
        return new i.a.y0.e.b.e(this);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final k0<Boolean> q1(Object obj) {
        i.a.y0.b.b.g(obj, "item is null");
        return f(i.a.y0.b.a.i(obj));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <U, R> l<R> q2(i.a.x0.o<? super T, ? extends Publisher<? extends U>> oVar, i.a.x0.c<? super T, ? super U, ? extends R> cVar, int i2) {
        return t2(oVar, cVar, false, i2, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final <TRight, TLeftEnd, TRightEnd, R> l<R> q3(Publisher<? extends TRight> publisher, i.a.x0.o<? super T, ? extends Publisher<TLeftEnd>> oVar, i.a.x0.o<? super TRight, ? extends Publisher<TRightEnd>> oVar2, i.a.x0.c<? super T, ? super TRight, ? extends R> cVar) {
        i.a.y0.b.b.g(publisher, "other is null");
        i.a.y0.b.b.g(oVar, "leftEnd is null");
        i.a.y0.b.b.g(oVar2, "rightEnd is null");
        i.a.y0.b.b.g(cVar, "resultSelector is null");
        return i.a.c1.a.P(new v1(this, publisher, oVar, oVar2, cVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> q4(int i2, boolean z, boolean z2, i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "onOverflow is null");
        i.a.y0.b.b.h(i2, "capacity");
        return i.a.c1.a.P(new k2(this, i2, z2, z, aVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final void q5(Subscriber<? super T> subscriber) {
        i.a.y0.b.b.g(subscriber, "s is null");
        if (subscriber instanceof i.a.h1.d) {
            f6((i.a.h1.d) subscriber);
        } else {
            f6(new i.a.h1.d(subscriber));
        }
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    public final <R> l<R> q6(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar) {
        return r6(oVar, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final T r() {
        return I5().i();
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final k0<Long> r1() {
        return i.a.c1.a.S(new i.a.y0.e.b.e0(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <U, R> l<R> r2(i.a.x0.o<? super T, ? extends Publisher<? extends U>> oVar, i.a.x0.c<? super T, ? super U, ? extends R> cVar, boolean z) {
        return t2(oVar, cVar, z, U(), U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> r4(long j2, i.a.x0.a aVar, a aVar2) {
        i.a.y0.b.b.g(aVar2, "strategy is null");
        i.a.y0.b.b.i(j2, "capacity");
        return i.a.c1.a.P(new l2(this, j2, aVar, aVar2));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<T> r5(long j2, TimeUnit timeUnit) {
        return s5(j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    public final <R> l<R> r6(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2) {
        return n6(oVar, i2, true);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final T s(T t) {
        return G5(t).i();
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <U, R> l<R> s2(i.a.x0.o<? super T, ? extends Publisher<? extends U>> oVar, i.a.x0.c<? super T, ? super U, ? extends R> cVar, boolean z, int i2) {
        return t2(oVar, cVar, z, i2, U());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final l<T> s4(boolean z) {
        return p4(U(), z, true);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> s5(long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.P(new i3(this, j2, timeUnit, j0Var, false));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> s6(@i.a.t0.f i.a.x0.o<? super T, ? extends y<? extends R>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.P(new i.a.y0.e.d.g(this, oVar, false));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<i.a.f1.d<T>> s7() {
        return v7(TimeUnit.MILLISECONDS, i.a.f1.b.a());
    }

    @Override // org.reactivestreams.Publisher
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    public final void subscribe(Subscriber<? super T> subscriber) {
        if (subscriber instanceof q) {
            f6((q) subscriber);
            return;
        }
        i.a.y0.b.b.g(subscriber, "s is null");
        f6(new i.a.y0.h.u(subscriber));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final void t() {
        i.a.y0.e.b.l.a(this);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final <R> l<R> t0(r<? super T, ? extends R> rVar) {
        return U2(((r) i.a.y0.b.b.g(rVar, "composer is null")).a(this));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<T> t1(long j2, TimeUnit timeUnit) {
        return u1(j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U, R> l<R> t2(i.a.x0.o<? super T, ? extends Publisher<? extends U>> oVar, i.a.x0.c<? super T, ? super U, ? extends R> cVar, boolean z, int i2, int i3) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.g(cVar, "combiner is null");
        i.a.y0.b.b.h(i2, "maxConcurrency");
        i.a.y0.b.b.h(i3, "bufferSize");
        return y2(s1.b(oVar, cVar), z, i2, i3);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final l<T> t4() {
        return i.a.c1.a.P(new m2(this));
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> t5(long j2, TimeUnit timeUnit, j0 j0Var, boolean z) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.P(new i3(this, j2, timeUnit, j0Var, z));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> t6(@i.a.t0.f i.a.x0.o<? super T, ? extends y<? extends R>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.P(new i.a.y0.e.d.g(this, oVar, true));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<i.a.f1.d<T>> t7(j0 j0Var) {
        return v7(TimeUnit.MILLISECONDS, j0Var);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final void u(i.a.x0.g<? super T> gVar) {
        i.a.y0.e.b.l.b(this, gVar, i.a.y0.b.a.f28142f, i.a.y0.b.a.c);
    }

    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> u1(long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.P(new i.a.y0.e.b.h0(this, j2, timeUnit, j0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> u2(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, i.a.x0.o<? super Throwable, ? extends Publisher<? extends R>> oVar2, Callable<? extends Publisher<? extends R>> callable) {
        i.a.y0.b.b.g(oVar, "onNextMapper is null");
        i.a.y0.b.b.g(oVar2, "onErrorMapper is null");
        i.a.y0.b.b.g(callable, "onCompleteSupplier is null");
        return L3(new c2(this, oVar, oVar2, callable));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> u4(i.a.x0.g<? super T> gVar) {
        i.a.y0.b.b.g(gVar, "onDrop is null");
        return i.a.c1.a.P(new m2(this, gVar));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.ERROR)
    public final l<T> u5(long j2, TimeUnit timeUnit, boolean z) {
        return t5(j2, timeUnit, i.a.f1.b.a(), z);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> u6(@i.a.t0.f i.a.x0.o<? super T, ? extends q0<? extends R>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.P(new i.a.y0.e.d.h(this, oVar, false));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<i.a.f1.d<T>> u7(TimeUnit timeUnit) {
        return v7(timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final void v(i.a.x0.g<? super T> gVar, int i2) {
        i.a.y0.e.b.l.c(this, gVar, i.a.y0.b.a.f28142f, i.a.y0.b.a.c, i2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> l<T> v1(i.a.x0.o<? super T, ? extends Publisher<U>> oVar) {
        i.a.y0.b.b.g(oVar, "debounceIndicator is null");
        return i.a.c1.a.P(new i.a.y0.e.b.g0(this, oVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> v2(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, i.a.x0.o<Throwable, ? extends Publisher<? extends R>> oVar2, Callable<? extends Publisher<? extends R>> callable, int i2) {
        i.a.y0.b.b.g(oVar, "onNextMapper is null");
        i.a.y0.b.b.g(oVar2, "onErrorMapper is null");
        i.a.y0.b.b.g(callable, "onCompleteSupplier is null");
        return M3(new c2(this, oVar, oVar2, callable), i2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final l<T> v4() {
        return i.a.c1.a.P(new o2(this));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> l<T> v5(Publisher<U> publisher) {
        i.a.y0.b.b.g(publisher, "sampler is null");
        return i.a.c1.a.P(new h3(this, publisher, false));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> v6(@i.a.t0.f i.a.x0.o<? super T, ? extends q0<? extends R>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.P(new i.a.y0.e.d.h(this, oVar, true));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @i.a.t0.d
    @i.a.t0.f
    public final l<i.a.f1.d<T>> v7(TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return (l<i.a.f1.d<T>>) G3(i.a.y0.b.a.w(timeUnit, j0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final void w(i.a.x0.g<? super T> gVar, i.a.x0.g<? super Throwable> gVar2) {
        i.a.y0.e.b.l.b(this, gVar, gVar2, i.a.y0.b.a.c);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> w1(T t) {
        i.a.y0.b.b.g(t, "item is null");
        return k6(r3(t));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> w2(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, boolean z) {
        return y2(oVar, z, U(), U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> w4(i.a.x0.o<? super Throwable, ? extends Publisher<? extends T>> oVar) {
        i.a.y0.b.b.g(oVar, "resumeFunction is null");
        return i.a.c1.a.P(new p2(this, oVar, false));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.ERROR)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> l<T> w5(Publisher<U> publisher, boolean z) {
        i.a.y0.b.b.g(publisher, "sampler is null");
        return i.a.c1.a.P(new h3(this, publisher, z));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.SPECIAL)
    public final <R> R w7(i.a.x0.o<? super l<T>, R> oVar) {
        try {
            return (R) ((i.a.x0.o) i.a.y0.b.b.g(oVar, "converter is null")).apply(this);
        } catch (Throwable th) {
            i.a.v0.b.b(th);
            throw i.a.y0.j.k.f(th);
        }
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final void x(i.a.x0.g<? super T> gVar, i.a.x0.g<? super Throwable> gVar2, int i2) {
        i.a.y0.e.b.l.c(this, gVar, gVar2, i.a.y0.b.a.c, i2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <R> l<R> x2(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, boolean z, int i2) {
        return y2(oVar, z, i2, U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> x4(Publisher<? extends T> publisher) {
        i.a.y0.b.b.g(publisher, "next is null");
        return w4(i.a.y0.b.a.n(publisher));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> x5(i.a.x0.c<T, T, T> cVar) {
        i.a.y0.b.b.g(cVar, "accumulator is null");
        return i.a.c1.a.P(new k3(this, cVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final Future<T> x7() {
        return (Future) j6(new i.a.y0.h.j());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final void y(i.a.x0.g<? super T> gVar, i.a.x0.g<? super Throwable> gVar2, i.a.x0.a aVar) {
        i.a.y0.e.b.l.b(this, gVar, gVar2, aVar);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> y1(long j2, TimeUnit timeUnit) {
        return A1(j2, timeUnit, i.a.f1.b.a(), false);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> y2(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, boolean z, int i2, int i3) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "maxConcurrency");
        i.a.y0.b.b.h(i3, "bufferSize");
        if (this instanceof i.a.y0.c.m) {
            Object call = ((i.a.y0.c.m) this).call();
            if (call == null) {
                return g2();
            }
            return j3.a(call, oVar);
        }
        return i.a.c1.a.P(new z0(this, oVar, z, i2, i3));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> y4(i.a.x0.o<? super Throwable, ? extends T> oVar) {
        i.a.y0.b.b.g(oVar, "valueSupplier is null");
        return i.a.c1.a.P(new q2(this, oVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> y5(R r, i.a.x0.c<R, ? super T, R> cVar) {
        i.a.y0.b.b.g(r, "seed is null");
        return z5(i.a.y0.b.a.m(r), cVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final k0<List<T>> y7() {
        return i.a.c1.a.S(new p4(this));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final void z(i.a.x0.g<? super T> gVar, i.a.x0.g<? super Throwable> gVar2, i.a.x0.a aVar, int i2) {
        i.a.y0.e.b.l.c(this, gVar, gVar2, aVar, i2);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> z1(long j2, TimeUnit timeUnit, j0 j0Var) {
        return A1(j2, timeUnit, j0Var, false);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final c z2(i.a.x0.o<? super T, ? extends i> oVar) {
        return A2(oVar, false, Integer.MAX_VALUE);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> z4(T t) {
        i.a.y0.b.b.g(t, "item is null");
        return y4(i.a.y0.b.a.n(t));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> z5(Callable<R> callable, i.a.x0.c<R, ? super T, R> cVar) {
        i.a.y0.b.b.g(callable, "seedSupplier is null");
        i.a.y0.b.b.g(cVar, "accumulator is null");
        return i.a.c1.a.P(new l3(this, callable, cVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public final k0<List<T>> z7(int i2) {
        i.a.y0.b.b.h(i2, "capacityHint");
        return i.a.c1.a.S(new p4(this, i.a.y0.b.a.f(i2)));
    }
}
