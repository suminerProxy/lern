package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractIterator<T> extends UnmodifiableIterator<T> {
    @NullableDecl
    private T next;
    private State state;

    /* renamed from: com.google.common.collect.AbstractIterator$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$AbstractIterator$State = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES = null;
        public static final State DONE = null;
        public static final State FAILED = null;
        public static final State NOT_READY = null;
        public static final State READY = null;

        private State(String str, int i2) {
        }

        public static State valueOf(String str) {
        }

        public static State[] values() {
        }
    }

    private boolean tryToComputeNext() {
    }

    public abstract T computeNext();

    @CanIgnoreReturnValue
    public final T endOfData() {
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final boolean hasNext() {
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final T next() {
    }

    public final T peek() {
    }
}
