package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLongArray longs;

    public AtomicDoubleArray(int i2) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @CanIgnoreReturnValue
    public double addAndGet(int i2, double d2) {
    }

    public final boolean compareAndSet(int i2, double d2, double d3) {
    }

    public final double get(int i2) {
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(int i2, double d2) {
    }

    public final double getAndSet(int i2, double d2) {
    }

    public final void lazySet(int i2, double d2) {
    }

    public final int length() {
    }

    public final void set(int i2, double d2) {
    }

    public String toString() {
    }

    public final boolean weakCompareAndSet(int i2, double d2, double d3) {
    }

    public AtomicDoubleArray(double[] dArr) {
    }
}
