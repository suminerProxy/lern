package com.jakewharton.rxbinding2.widget;

import android.database.DataSetObserver;
import android.widget.Adapter;
import com.jakewharton.rxbinding2.InitialValueObservable;
import i.a.i0;
import i.a.s0.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AdapterDataChangeObservable<T extends Adapter> extends InitialValueObservable<T> {
    private final T adapter;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ObserverDisposable<T extends Adapter> extends a {
        private final T adapter;
        public final DataSetObserver dataSetObserver;

        /* renamed from: com.jakewharton.rxbinding2.widget.AdapterDataChangeObservable$ObserverDisposable$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends DataSetObserver {
            public final /* synthetic */ ObserverDisposable this$0;
            public final /* synthetic */ Adapter val$adapter;
            public final /* synthetic */ i0 val$observer;

            public AnonymousClass1(ObserverDisposable observerDisposable, i0 i0Var, Adapter adapter) {
            }

            @Override // android.database.DataSetObserver
            public void onChanged() {
            }
        }

        public ObserverDisposable(T t, i0<? super T> i0Var) {
        }

        @Override // i.a.s0.a
        public void onDispose() {
        }
    }

    public AdapterDataChangeObservable(T t) {
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public /* bridge */ /* synthetic */ Object getInitialValue() {
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(i0<? super T> i0Var) {
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public T getInitialValue() {
    }
}
