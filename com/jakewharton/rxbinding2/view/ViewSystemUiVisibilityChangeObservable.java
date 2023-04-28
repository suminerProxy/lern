package com.jakewharton.rxbinding2.view;

import android.view.View;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ViewSystemUiVisibilityChangeObservable extends b0<Integer> {
    private final View view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements View.OnSystemUiVisibilityChangeListener {
        private final i0<? super Integer> observer;
        private final View view;

        public Listener(View view, i0<? super Integer> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i2) {
        }
    }

    public ViewSystemUiVisibilityChangeObservable(View view) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super Integer> i0Var) {
    }
}
