package com.jakewharton.rxbinding2.view;

import android.view.View;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ViewAttachesObservable extends b0<Object> {
    private final boolean callOnAttach;
    private final View view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements View.OnAttachStateChangeListener {
        private final boolean callOnAttach;
        private final i0<? super Object> observer;
        private final View view;

        public Listener(View view, boolean z, i0<? super Object> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public ViewAttachesObservable(View view, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super Object> i0Var) {
    }
}
