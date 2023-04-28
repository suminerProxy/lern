package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CartesianList<E> extends AbstractList<List<E>> implements RandomAccess {
    private final transient ImmutableList<List<E>> axes;
    private final transient int[] axesSizeProduct;

    /* renamed from: com.google.common.collect.CartesianList$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends ImmutableList<E> {
        public final /* synthetic */ CartesianList this$0;
        public final /* synthetic */ int val$index;

        public AnonymousClass1(CartesianList cartesianList, int i2) {
        }

        @Override // java.util.List
        public E get(int i2) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    public CartesianList(ImmutableList<List<E>> immutableList) {
    }

    public static /* synthetic */ ImmutableList access$000(CartesianList cartesianList) {
    }

    public static /* synthetic */ int access$100(CartesianList cartesianList, int i2, int i3) {
    }

    public static <E> List<List<E>> create(List<? extends List<? extends E>> list) {
    }

    private int getAxisIndexForProductIndex(int i2, int i3) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@NullableDecl Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i2) {
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    @Override // java.util.AbstractList, java.util.List
    public ImmutableList<E> get(int i2) {
    }
}
