package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Function<F, ? extends T> function;
    private final Equivalence<T> resultEquivalence;

    public FunctionalEquivalence(Function<F, ? extends T> function, Equivalence<T> equivalence) {
    }

    @Override // com.google.common.base.Equivalence
    public boolean doEquivalent(F f2, F f3) {
    }

    @Override // com.google.common.base.Equivalence
    public int doHash(F f2) {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
