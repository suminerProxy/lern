package com.jakewharton.rxbinding2.view;

import android.view.View;
import androidx.annotation.RequiresApi;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;

@RequiresApi(23)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ViewScrollChangeEventObservable extends b0<ViewScrollChangeEvent> {
    private final View view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements View.OnScrollChangeListener {
        private final i0<? super ViewScrollChangeEvent> observer;
        private final View view;

        public Listener(View view, i0<? super ViewScrollChangeEvent> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i2, int i3, int i4, int i5) {
        }
    }

    public ViewScrollChangeEventObservable(View view) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super ViewScrollChangeEvent> i0Var) {
    }
}
