package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class EnumMultiset<E extends Enum<E>> extends AbstractMultiset<E> implements Serializable {
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    private transient int[] counts;
    private transient int distinctElements;
    private transient E[] enumConstants;
    private transient long size;
    private transient Class<E> type;

    /* renamed from: com.google.common.collect.EnumMultiset$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends EnumMultiset<E>.Itr<E> {
        public final /* synthetic */ EnumMultiset this$0;

        public AnonymousClass1(EnumMultiset enumMultiset) {
        }

        @Override // com.google.common.collect.EnumMultiset.Itr
        public /* bridge */ /* synthetic */ Object output(int i2) {
        }

        @Override // com.google.common.collect.EnumMultiset.Itr
        public E output(int i2) {
        }
    }

    /* renamed from: com.google.common.collect.EnumMultiset$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends EnumMultiset<E>.Itr<Multiset.Entry<E>> {
        public final /* synthetic */ EnumMultiset this$0;

        /* renamed from: com.google.common.collect.EnumMultiset$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends Multisets.AbstractEntry<E> {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ int val$index;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, int i2) {
            }

            @Override // com.google.common.collect.Multiset.Entry
            public int getCount() {
            }

            @Override // com.google.common.collect.Multiset.Entry
            public /* bridge */ /* synthetic */ Object getElement() {
            }

            @Override // com.google.common.collect.Multiset.Entry
            public E getElement() {
            }
        }

        public AnonymousClass2(EnumMultiset enumMultiset) {
        }

        @Override // com.google.common.collect.EnumMultiset.Itr
        public /* bridge */ /* synthetic */ Object output(int i2) {
        }

        @Override // com.google.common.collect.EnumMultiset.Itr
        public Multiset.Entry<E> output(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class Itr<T> implements Iterator<T> {
        public int index;
        public final /* synthetic */ EnumMultiset this$0;
        public int toRemove;

        public Itr(EnumMultiset enumMultiset) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        public abstract T output(int i2);

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    private EnumMultiset(Class<E> cls) {
    }

    public static /* synthetic */ Enum[] access$000(EnumMultiset enumMultiset) {
    }

    public static /* synthetic */ int[] access$100(EnumMultiset enumMultiset) {
    }

    public static /* synthetic */ int access$210(EnumMultiset enumMultiset) {
    }

    public static /* synthetic */ long access$300(EnumMultiset enumMultiset) {
    }

    public static /* synthetic */ long access$302(EnumMultiset enumMultiset, long j2) {
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Class<E> cls) {
    }

    private boolean isActuallyE(@NullableDecl Object obj) {
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ int add(Object obj, int i2) {
    }

    public void checkIsE(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.Multiset
    public int count(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public int distinctElements() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<E> elementIterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set elementSet() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<Multiset.Entry<E>> entryIterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i2) {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ int setCount(Object obj, int i2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable) {
    }

    @CanIgnoreReturnValue
    public int add(E e2, int i2) {
    }

    @CanIgnoreReturnValue
    public int setCount(E e2, int i2) {
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable, Class<E> cls) {
    }
}
