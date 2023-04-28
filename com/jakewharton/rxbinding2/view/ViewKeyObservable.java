package com.jakewharton.rxbinding2.view;

import android.view.KeyEvent;
import android.view.View;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;
import i.a.x0.r;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ViewKeyObservable extends b0<KeyEvent> {
    private final r<? super KeyEvent> handled;
    private final View view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements View.OnKeyListener {
        private final r<? super KeyEvent> handled;
        private final i0<? super KeyEvent> observer;
        private final View view;

        public Listener(View view, r<? super KeyEvent> rVar, i0<? super KeyEvent> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        }
    }

    public ViewKeyObservable(View view, r<? super KeyEvent> rVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super KeyEvent> i0Var) {
    }
}
