package com.jakewharton.rxbinding2.widget;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding2.InitialValueObservable;
import i.a.i0;
import i.a.s0.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AdapterViewSelectionObservable extends InitialValueObservable<AdapterViewSelectionEvent> {
    private final AdapterView<?> view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements AdapterView.OnItemSelectedListener {
        private final i0<? super AdapterViewSelectionEvent> observer;
        private final AdapterView<?> view;

        public Listener(AdapterView<?> adapterView, i0<? super AdapterViewSelectionEvent> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public AdapterViewSelectionObservable(AdapterView<?> adapterView) {
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public /* bridge */ /* synthetic */ AdapterViewSelectionEvent getInitialValue() {
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(i0<? super AdapterViewSelectionEvent> i0Var) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public AdapterViewSelectionEvent getInitialValue() {
    }
}
