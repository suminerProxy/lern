package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AtomicDouble extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLong value;

    public AtomicDouble(double d2) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @CanIgnoreReturnValue
    public final double addAndGet(double d2) {
    }

    public final boolean compareAndSet(double d2, double d3) {
    }

    @Override // java.lang.Number
    public double doubleValue() {
    }

    @Override // java.lang.Number
    public float floatValue() {
    }

    public final double get() {
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(double d2) {
    }

    public final double getAndSet(double d2) {
    }

    @Override // java.lang.Number
    public int intValue() {
    }

    public final void lazySet(double d2) {
    }

    @Override // java.lang.Number
    public long longValue() {
    }

    public final void set(double d2) {
    }

    public String toString() {
    }

    public final boolean weakCompareAndSet(double d2, double d3) {
    }

    public AtomicDouble() {
    }
}
