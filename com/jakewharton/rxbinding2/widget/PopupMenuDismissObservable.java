package com.jakewharton.rxbinding2.widget;

import android.widget.PopupMenu;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PopupMenuDismissObservable extends b0<Object> {
    private final PopupMenu view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements PopupMenu.OnDismissListener {
        private final i0<? super Object> observer;
        private final PopupMenu view;

        public Listener(PopupMenu popupMenu, i0<? super Object> i0Var) {
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public void onDismiss(PopupMenu popupMenu) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }
    }

    public PopupMenuDismissObservable(PopupMenu popupMenu) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super Object> i0Var) {
    }
}
