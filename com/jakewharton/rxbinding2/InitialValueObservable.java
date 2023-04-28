package com.jakewharton.rxbinding2;

import i.a.b0;
import i.a.i0;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class InitialValueObservable<T> extends b0<T> {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class Skipped extends b0<T> {
        public final /* synthetic */ InitialValueObservable this$0;

        public Skipped(InitialValueObservable initialValueObservable) {
        }

        @Override // i.a.b0
        public void subscribeActual(i0<? super T> i0Var) {
        }
    }

    public abstract T getInitialValue();

    public final b0<T> skipInitialValue() {
    }

    @Override // i.a.b0
    public final void subscribeActual(i0<? super T> i0Var) {
    }

    public abstract void subscribeListener(i0<? super T> i0Var);
}
