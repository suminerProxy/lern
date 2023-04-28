package com.jakewharton.rxbinding2.view;

import android.view.View;
import android.view.ViewTreeObserver;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;
import java.util.concurrent.Callable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ViewTreeObserverPreDrawObservable extends b0<Object> {
    private final Callable<Boolean> proceedDrawingPass;
    private final View view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements ViewTreeObserver.OnPreDrawListener {
        private final i0<? super Object> observer;
        private final Callable<Boolean> proceedDrawingPass;
        private final View view;

        public Listener(View view, Callable<Boolean> callable, i0<? super Object> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    public ViewTreeObserverPreDrawObservable(View view, Callable<Boolean> callable) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super Object> i0Var) {
    }
}
