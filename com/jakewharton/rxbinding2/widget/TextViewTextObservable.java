package com.jakewharton.rxbinding2.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding2.InitialValueObservable;
import i.a.i0;
import i.a.s0.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TextViewTextObservable extends InitialValueObservable<CharSequence> {
    private final TextView view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements TextWatcher {
        private final i0<? super CharSequence> observer;
        private final TextView view;

        public Listener(TextView textView, i0<? super CharSequence> i0Var) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public TextViewTextObservable(TextView textView) {
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public /* bridge */ /* synthetic */ CharSequence getInitialValue() {
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(i0<? super CharSequence> i0Var) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public CharSequence getInitialValue() {
    }
}
