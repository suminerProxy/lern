package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PairwiseEquivalence<T> extends Equivalence<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;
    public final Equivalence<? super T> elementEquivalence;

    public PairwiseEquivalence(Equivalence<? super T> equivalence) {
    }

    @Override // com.google.common.base.Equivalence
    public /* bridge */ /* synthetic */ boolean doEquivalent(Object obj, Object obj2) {
    }

    @Override // com.google.common.base.Equivalence
    public /* bridge */ /* synthetic */ int doHash(Object obj) {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    public boolean doEquivalent(Iterable<T> iterable, Iterable<T> iterable2) {
    }

    public int doHash(Iterable<T> iterable) {
    }
}
