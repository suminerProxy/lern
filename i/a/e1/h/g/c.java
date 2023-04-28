package i.a.e1.h.g;

import i.a.e1.b.g;
import i.a.e1.h.c.p;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscLinkedArrayQueue.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c<T> implements p<T> {

    /* renamed from: j  reason: collision with root package name */
    public static final int f27785j = 0;

    /* renamed from: k  reason: collision with root package name */
    private static final Object f27786k = null;
    public final AtomicLong b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public long f27787d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27788e;

    /* renamed from: f  reason: collision with root package name */
    public AtomicReferenceArray<Object> f27789f;

    /* renamed from: g  reason: collision with root package name */
    public final int f27790g;

    /* renamed from: h  reason: collision with root package name */
    public AtomicReferenceArray<Object> f27791h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicLong f27792i;

    public c(final int bufferSize) {
    }

    private void a(int capacity) {
    }

    private static int b(int index) {
    }

    private static int c(long index, int mask) {
    }

    private long d() {
    }

    private long e() {
    }

    private long f() {
    }

    private static Object g(AtomicReferenceArray<Object> buffer, int offset) {
    }

    private AtomicReferenceArray<Object> h(AtomicReferenceArray<Object> curr, int nextIndex) {
    }

    private long i() {
    }

    private T j(AtomicReferenceArray<Object> nextBuffer, final long index, final int mask) {
    }

    private T k(AtomicReferenceArray<Object> nextBuffer, final long index, final int mask) {
    }

    private void l(final AtomicReferenceArray<Object> oldBuffer, final long currIndex, final int offset, final T e2, final long mask) {
    }

    private void n(long v) {
    }

    private static void o(AtomicReferenceArray<Object> buffer, int offset, Object e2) {
    }

    private void p(AtomicReferenceArray<Object> curr, AtomicReferenceArray<Object> next) {
    }

    private void q(long v) {
    }

    private boolean r(final AtomicReferenceArray<Object> buffer, final T e2, final long index, final int offset) {
    }

    @Override // i.a.e1.h.c.q
    public void clear() {
    }

    @Override // i.a.e1.h.c.q
    public boolean isEmpty() {
    }

    public int m() {
    }

    @Override // i.a.e1.h.c.q
    public boolean offer(final T e2) {
    }

    public T peek() {
    }

    @Override // i.a.e1.h.c.p, i.a.e1.h.c.q
    @g
    public T poll() {
    }

    @Override // i.a.e1.h.c.q
    public boolean offer(T first, T second) {
    }
}
