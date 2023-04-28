package com.jakewharton.rxbinding2.widget;

import android.widget.AbsListView;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AbsListViewScrollEventObservable extends b0<AbsListViewScrollEvent> {
    private final AbsListView view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements AbsListView.OnScrollListener {
        private int currentScrollState;
        private final i0<? super AbsListViewScrollEvent> observer;
        private final AbsListView view;

        public Listener(AbsListView absListView, i0<? super AbsListViewScrollEvent> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    public AbsListViewScrollEventObservable(AbsListView absListView) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super AbsListViewScrollEvent> i0Var) {
    }
}
