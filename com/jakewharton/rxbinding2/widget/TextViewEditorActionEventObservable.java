package com.jakewharton.rxbinding2.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;
import i.a.x0.r;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TextViewEditorActionEventObservable extends b0<TextViewEditorActionEvent> {
    private final r<? super TextViewEditorActionEvent> handled;
    private final TextView view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements TextView.OnEditorActionListener {
        private final r<? super TextViewEditorActionEvent> handled;
        private final i0<? super TextViewEditorActionEvent> observer;
        private final TextView view;

        public Listener(TextView textView, i0<? super TextViewEditorActionEvent> i0Var, r<? super TextViewEditorActionEvent> rVar) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        }
    }

    public TextViewEditorActionEventObservable(TextView textView, r<? super TextViewEditorActionEvent> rVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super TextViewEditorActionEvent> i0Var) {
    }
}
