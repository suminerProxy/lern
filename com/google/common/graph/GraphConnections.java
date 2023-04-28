package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface GraphConnections<N, V> {
    void addPredecessor(N n2, V v);

    @CanIgnoreReturnValue
    V addSuccessor(N n2, V v);

    Set<N> adjacentNodes();

    Set<N> predecessors();

    void removePredecessor(N n2);

    @CanIgnoreReturnValue
    V removeSuccessor(N n2);

    Set<N> successors();

    @NullableDecl
    V value(N n2);
}
