package com.google.common.hash;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class LongAdder extends Striped64 implements Serializable, LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // com.google.common.hash.LongAddable
    public void add(long j2) {
    }

    public void decrement() {
    }

    @Override // java.lang.Number
    public double doubleValue() {
    }

    @Override // java.lang.Number
    public float floatValue() {
    }

    @Override // com.google.common.hash.Striped64
    public final long fn(long j2, long j3) {
    }

    @Override // com.google.common.hash.LongAddable
    public void increment() {
    }

    @Override // java.lang.Number
    public int intValue() {
    }

    @Override // java.lang.Number
    public long longValue() {
    }

    public void reset() {
    }

    @Override // com.google.common.hash.LongAddable
    public long sum() {
    }

    public long sumThenReset() {
    }

    public String toString() {
    }
}
