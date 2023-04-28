package i.a.y0.f;

import i.a.t0.g;
import i.a.y0.c.n;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscArrayQueue.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b<E> extends AtomicReferenceArray<E> implements n<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = null;
    private static final long serialVersionUID = -1296597691183856449L;
    public final AtomicLong consumerIndex;
    public final int lookAheadStep;
    public final int mask;
    public final AtomicLong producerIndex;
    public long producerLookAhead;

    public b(int i2) {
    }

    public int calcElementOffset(long j2) {
    }

    public int calcElementOffset(long j2, int i2) {
    }

    @Override // i.a.y0.c.o
    public void clear() {
    }

    @Override // i.a.y0.c.o
    public boolean isEmpty() {
    }

    public E lvElement(int i2) {
    }

    @Override // i.a.y0.c.o
    public boolean offer(E e2) {
    }

    @Override // i.a.y0.c.n, i.a.y0.c.o
    @g
    public E poll() {
    }

    public void soConsumerIndex(long j2) {
    }

    public void soElement(int i2, E e2) {
    }

    public void soProducerIndex(long j2) {
    }

    @Override // i.a.y0.c.o
    public boolean offer(E e2, E e3) {
    }
}
