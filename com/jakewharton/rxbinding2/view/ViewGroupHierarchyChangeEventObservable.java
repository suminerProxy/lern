package com.jakewharton.rxbinding2.view;

import android.view.View;
import android.view.ViewGroup;
import i.a.b0;
import i.a.i0;
import i.a.s0.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ViewGroupHierarchyChangeEventObservable extends b0<ViewGroupHierarchyChangeEvent> {
    private final ViewGroup viewGroup;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements ViewGroup.OnHierarchyChangeListener {
        private final i0<? super ViewGroupHierarchyChangeEvent> observer;
        private final ViewGroup viewGroup;

        public Listener(ViewGroup viewGroup, i0<? super ViewGroupHierarchyChangeEvent> i0Var) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }
    }

    public ViewGroupHierarchyChangeEventObservable(ViewGroup viewGroup) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super ViewGroupHierarchyChangeEvent> i0Var) {
    }
}
