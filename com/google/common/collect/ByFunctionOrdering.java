package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Function<F, ? extends T> function;
    public final Ordering<T> ordering;

    public ByFunctionOrdering(Function<F, ? extends T> function, Ordering<T> ordering) {
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(F f2, F f3) {
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
