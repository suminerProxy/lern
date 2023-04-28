package com.jakewharton.rxbinding2.widget;

import android.view.View;
import android.widget.AdapterView;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;
import java.util.concurrent.Callable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AdapterViewItemLongClickObservable extends b0<Integer> {
    private final Callable<Boolean> handled;
    private final AdapterView<?> view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements AdapterView.OnItemLongClickListener {
        private final Callable<Boolean> handled;
        private final i0<? super Integer> observer;
        private final AdapterView<?> view;

        public Listener(AdapterView<?> adapterView, i0<? super Integer> i0Var, Callable<Boolean> callable) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    public AdapterViewItemLongClickObservable(AdapterView<?> adapterView, Callable<Boolean> callable) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super Integer> i0Var) {
    }
}
