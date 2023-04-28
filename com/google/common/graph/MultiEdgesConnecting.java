package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class MultiEdgesConnecting<E> extends AbstractSet<E> {
    private final Map<E, ?> outEdgeToNode;
    private final Object targetNode;

    /* renamed from: com.google.common.graph.MultiEdgesConnecting$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AbstractIterator<E> {
        public final /* synthetic */ MultiEdgesConnecting this$0;
        public final /* synthetic */ Iterator val$entries;

        public AnonymousClass1(MultiEdgesConnecting multiEdgesConnecting, Iterator it) {
        }

        @Override // com.google.common.collect.AbstractIterator
        public E computeNext() {
        }
    }

    public MultiEdgesConnecting(Map<E, ?> map, Object obj) {
    }

    public static /* synthetic */ Object access$000(MultiEdgesConnecting multiEdgesConnecting) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public UnmodifiableIterator<E> iterator() {
    }
}
