package com.jakewharton.rxbinding2.widget;

import android.view.MenuItem;
import android.widget.PopupMenu;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PopupMenuItemClickObservable extends b0<MenuItem> {
    private final PopupMenu view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements PopupMenu.OnMenuItemClickListener {
        private final i0<? super MenuItem> observer;
        private final PopupMenu view;

        public Listener(PopupMenu popupMenu, i0<? super MenuItem> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
        }
    }

    public PopupMenuItemClickObservable(PopupMenu popupMenu) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super MenuItem> i0Var) {
    }
}
