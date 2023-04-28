package com.jakewharton.rxbinding2.view;

import android.view.MotionEvent;
import android.view.View;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;
import i.a.x0.r;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ViewTouchObservable extends b0<MotionEvent> {
    private final r<? super MotionEvent> handled;
    private final View view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements View.OnTouchListener {
        private final r<? super MotionEvent> handled;
        private final i0<? super MotionEvent> observer;
        private final View view;

        public Listener(View view, r<? super MotionEvent> rVar, i0<? super MotionEvent> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    public ViewTouchObservable(View view, r<? super MotionEvent> rVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super MotionEvent> i0Var) {
    }
}
