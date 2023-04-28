package com.jakewharton.rxbinding2.widget;

import android.view.MenuItem;
import android.widget.Toolbar;
import androidx.annotation.RequiresApi;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;

@RequiresApi(21)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ToolbarItemClickObservable extends b0<MenuItem> {
    private final Toolbar view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements Toolbar.OnMenuItemClickListener {
        private final i0<? super MenuItem> observer;
        private final Toolbar view;

        public Listener(Toolbar toolbar, i0<? super MenuItem> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.widget.Toolbar.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
        }
    }

    public ToolbarItemClickObservable(Toolbar toolbar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super MenuItem> i0Var) {
    }
}
