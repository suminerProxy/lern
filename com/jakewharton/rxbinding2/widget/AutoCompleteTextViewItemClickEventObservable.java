package com.jakewharton.rxbinding2.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AutoCompleteTextViewItemClickEventObservable extends b0<AdapterViewItemClickEvent> {
    private final AutoCompleteTextView view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements AdapterView.OnItemClickListener {
        private final i0<? super AdapterViewItemClickEvent> observer;
        private final AutoCompleteTextView view;

        public Listener(AutoCompleteTextView autoCompleteTextView, i0<? super AdapterViewItemClickEvent> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    public AutoCompleteTextViewItemClickEventObservable(AutoCompleteTextView autoCompleteTextView) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super AdapterViewItemClickEvent> i0Var) {
    }
}
