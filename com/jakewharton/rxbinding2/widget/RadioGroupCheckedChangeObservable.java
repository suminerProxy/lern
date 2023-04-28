package com.jakewharton.rxbinding2.widget;

import android.widget.RadioGroup;
import com.jakewharton.rxbinding2.InitialValueObservable;
import i.a.i0;
import i.a.s0.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RadioGroupCheckedChangeObservable extends InitialValueObservable<Integer> {
    private final RadioGroup view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements RadioGroup.OnCheckedChangeListener {
        private int lastChecked;
        private final i0<? super Integer> observer;
        private final RadioGroup view;

        public Listener(RadioGroup radioGroup, i0<? super Integer> i0Var) {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i2) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }
    }

    public RadioGroupCheckedChangeObservable(RadioGroup radioGroup) {
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public /* bridge */ /* synthetic */ Integer getInitialValue() {
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(i0<? super Integer> i0Var) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public Integer getInitialValue() {
    }
}
