package com.jakewharton.rxbinding2.widget;

import android.widget.SeekBar;
import com.jakewharton.rxbinding2.InitialValueObservable;
import i.a.i0;
import i.a.s0.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SeekBarChangeEventObservable extends InitialValueObservable<SeekBarChangeEvent> {
    private final SeekBar view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements SeekBar.OnSeekBarChangeListener {
        private final i0<? super SeekBarChangeEvent> observer;
        private final SeekBar view;

        public Listener(SeekBar seekBar, i0<? super SeekBarChangeEvent> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public SeekBarChangeEventObservable(SeekBar seekBar) {
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public /* bridge */ /* synthetic */ SeekBarChangeEvent getInitialValue() {
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(i0<? super SeekBarChangeEvent> i0Var) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public SeekBarChangeEvent getInitialValue() {
    }
}
