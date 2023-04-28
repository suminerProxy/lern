package i.a.e1.h.g;

import i.a.e1.b.g;
import i.a.e1.h.c.p;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscArrayQueue.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b<E> extends AtomicReferenceArray<E> implements p<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = null;
    private static final long serialVersionUID = -1296597691183856449L;
    public final AtomicLong consumerIndex;
    public final int lookAheadStep;
    public final int mask;
    public final AtomicLong producerIndex;
    public long producerLookAhead;

    public b(int capacity) {
    }

    public int calcElementOffset(long index) {
    }

    public int calcElementOffset(long index, int mask) {
    }

    @Override // i.a.e1.h.c.q
    public void clear() {
    }

    @Override // i.a.e1.h.c.q
    public boolean isEmpty() {
    }

    public E lvElement(int offset) {
    }

    @Override // i.a.e1.h.c.q
    public boolean offer(E e2) {
    }

    @Override // i.a.e1.h.c.p, i.a.e1.h.c.q
    @g
    public E poll() {
    }

    public void soConsumerIndex(long newIndex) {
    }

    public void soElement(int offset, E value) {
    }

    public void soProducerIndex(long newIndex) {
    }

    @Override // i.a.e1.h.c.q
    public boolean offer(E v1, E v2) {
    }
}
