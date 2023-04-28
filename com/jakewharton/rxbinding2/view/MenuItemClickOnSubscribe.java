package com.jakewharton.rxbinding2.view;

import android.view.MenuItem;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;
import i.a.x0.r;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MenuItemClickOnSubscribe extends b0<Object> {
    private final r<? super MenuItem> handled;
    private final MenuItem menuItem;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements MenuItem.OnMenuItemClickListener {
        private final r<? super MenuItem> handled;
        private final MenuItem menuItem;
        private final i0<? super Object> observer;

        public Listener(MenuItem menuItem, r<? super MenuItem> rVar, i0<? super Object> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
        }
    }

    public MenuItemClickOnSubscribe(MenuItem menuItem, r<? super MenuItem> rVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super Object> i0Var) {
    }
}
