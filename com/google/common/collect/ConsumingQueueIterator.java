package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Queue;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ConsumingQueueIterator<T> extends AbstractIterator<T> {
    private final Queue<T> queue;

    public ConsumingQueueIterator(T... tArr) {
    }

    @Override // com.google.common.collect.AbstractIterator
    public T computeNext() {
    }

    public ConsumingQueueIterator(Queue<T> queue) {
    }
}
