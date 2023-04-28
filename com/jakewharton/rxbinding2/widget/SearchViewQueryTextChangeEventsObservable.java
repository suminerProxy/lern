package com.jakewharton.rxbinding2.widget;

import android.widget.SearchView;
import com.jakewharton.rxbinding2.InitialValueObservable;
import i.a.i0;
import i.a.s0.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SearchViewQueryTextChangeEventsObservable extends InitialValueObservable<SearchViewQueryTextEvent> {
    private final SearchView view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener extends a implements SearchView.OnQueryTextListener {
        private final i0<? super SearchViewQueryTextEvent> observer;
        private final SearchView view;

        public Listener(SearchView searchView, i0<? super SearchViewQueryTextEvent> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
        }
    }

    public SearchViewQueryTextChangeEventsObservable(SearchView searchView) {
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public /* bridge */ /* synthetic */ SearchViewQueryTextEvent getInitialValue() {
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(i0<? super SearchViewQueryTextEvent> i0Var) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public SearchViewQueryTextEvent getInitialValue() {
    }
}
