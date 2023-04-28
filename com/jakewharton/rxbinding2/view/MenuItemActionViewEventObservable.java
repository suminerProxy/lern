package com.jakewharton.rxbinding2.view;

import android.view.MenuItem;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;
import i.a.x0.r;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MenuItemActionViewEventObservable extends b0<MenuItemActionViewEvent> {
    private final r<? super MenuItemActionViewEvent> handled;
    private final MenuItem menuItem;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements MenuItem.OnActionExpandListener {
        private final r<? super MenuItemActionViewEvent> handled;
        private final MenuItem menuItem;
        private final i0<? super MenuItemActionViewEvent> observer;

        public Listener(MenuItem menuItem, r<? super MenuItemActionViewEvent> rVar, i0<? super MenuItemActionViewEvent> i0Var) {
        }

        private boolean onEvent(MenuItemActionViewEvent menuItemActionViewEvent) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
        }
    }

    public MenuItemActionViewEventObservable(MenuItem menuItem, r<? super MenuItemActionViewEvent> rVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super MenuItemActionViewEvent> i0Var) {
    }
}
