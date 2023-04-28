package com.jakewharton.rxbinding2.view;

import android.view.View;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ViewClickObservable extends b0<Object> {
    private final View view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements View.OnClickListener {
        private final i0<? super Object> observer;
        private final View view;

        public Listener(View view, i0<? super Object> i0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }
    }

    public ViewClickObservable(View view) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super Object> i0Var) {
    }
}
