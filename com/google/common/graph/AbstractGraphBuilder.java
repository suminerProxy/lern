package com.google.common.graph;

import com.google.common.base.Optional;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractGraphBuilder<N> {
    public boolean allowsSelfLoops;
    public final boolean directed;
    public Optional<Integer> expectedNodeCount;
    public ElementOrder<N> nodeOrder;

    public AbstractGraphBuilder(boolean z) {
    }
}
