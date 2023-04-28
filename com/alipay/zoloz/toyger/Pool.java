package com.alipay.zoloz.toyger;

import java.util.ArrayDeque;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class Pool<T> {
    public final ArrayDeque<T> freeObjects;
    public final int max;
    public int peak;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface Poolable {
        void reset();
    }

    public Pool() {
    }

    public void clear() {
    }

    public void free(T t) {
    }

    public void freeAll(List<T> list) {
    }

    public int getFree() {
    }

    public abstract T newObject();

    public T obtain() {
    }

    public Pool(int i2) {
    }

    public Pool(int i2, int i3) {
    }
}
