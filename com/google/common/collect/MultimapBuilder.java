package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class MultimapBuilder<K0, V0> {
    private static final int DEFAULT_EXPECTED_KEYS = 8;

    /* renamed from: com.google.common.collect.MultimapBuilder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends MultimapBuilderWithKeys<Object> {
        public final /* synthetic */ int val$expectedKeys;

        public AnonymousClass1(int i2) {
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        public <K, V> Map<K, Collection<V>> createMap() {
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 extends MultimapBuilderWithKeys<Object> {
        public final /* synthetic */ int val$expectedKeys;

        public AnonymousClass2(int i2) {
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        public <K, V> Map<K, Collection<V>> createMap() {
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 extends MultimapBuilderWithKeys<K0> {
        public final /* synthetic */ Comparator val$comparator;

        public AnonymousClass3(Comparator comparator) {
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        public <K extends K0, V> Map<K, Collection<V>> createMap() {
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4 extends MultimapBuilderWithKeys<K0> {
        public final /* synthetic */ Class val$keyClass;

        public AnonymousClass4(Class cls) {
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        public <K extends K0, V> Map<K, Collection<V>> createMap() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ArrayListSupplier<V> implements Supplier<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        public ArrayListSupplier(int i2) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Object get() {
        }

        @Override // com.google.common.base.Supplier
        public List<V> get() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EnumSetSupplier<V extends Enum<V>> implements Supplier<Set<V>>, Serializable {
        private final Class<V> clazz;

        public EnumSetSupplier(Class<V> cls) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Object get() {
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class HashSetSupplier<V> implements Supplier<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        public HashSetSupplier(int i2) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Object get() {
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LinkedHashSetSupplier<V> implements Supplier<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        public LinkedHashSetSupplier(int i2) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Object get() {
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LinkedListSupplier implements Supplier<List<Object>> {
        private static final /* synthetic */ LinkedListSupplier[] $VALUES = null;
        public static final LinkedListSupplier INSTANCE = null;

        private LinkedListSupplier(String str, int i2) {
        }

        public static <V> Supplier<List<V>> instance() {
        }

        public static LinkedListSupplier valueOf(String str) {
        }

        public static LinkedListSupplier[] values() {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ List<Object> get() {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public List<Object> get2() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class ListMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> ListMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ Multimap build() {
        }

        @Override // com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ Multimap build(Multimap multimap) {
        }

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> ListMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class MultimapBuilderWithKeys<K0> {
        private static final int DEFAULT_EXPECTED_VALUES_PER_KEY = 2;

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends ListMultimapBuilder<K0, Object> {
            public final /* synthetic */ MultimapBuilderWithKeys this$0;
            public final /* synthetic */ int val$expectedValuesPerKey;

            public AnonymousClass1(MultimapBuilderWithKeys multimapBuilderWithKeys, int i2) {
            }

            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
            public /* bridge */ /* synthetic */ Multimap build() {
            }

            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V> ListMultimap<K, V> build() {
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends ListMultimapBuilder<K0, Object> {
            public final /* synthetic */ MultimapBuilderWithKeys this$0;

            public AnonymousClass2(MultimapBuilderWithKeys multimapBuilderWithKeys) {
            }

            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
            public /* bridge */ /* synthetic */ Multimap build() {
            }

            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V> ListMultimap<K, V> build() {
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass3 extends SetMultimapBuilder<K0, Object> {
            public final /* synthetic */ MultimapBuilderWithKeys this$0;
            public final /* synthetic */ int val$expectedValuesPerKey;

            public AnonymousClass3(MultimapBuilderWithKeys multimapBuilderWithKeys, int i2) {
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public /* bridge */ /* synthetic */ Multimap build() {
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V> SetMultimap<K, V> build() {
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass4 extends SetMultimapBuilder<K0, Object> {
            public final /* synthetic */ MultimapBuilderWithKeys this$0;
            public final /* synthetic */ int val$expectedValuesPerKey;

            public AnonymousClass4(MultimapBuilderWithKeys multimapBuilderWithKeys, int i2) {
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public /* bridge */ /* synthetic */ Multimap build() {
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V> SetMultimap<K, V> build() {
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$5  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass5 extends SortedSetMultimapBuilder<K0, V0> {
            public final /* synthetic */ MultimapBuilderWithKeys this$0;
            public final /* synthetic */ Comparator val$comparator;

            public AnonymousClass5(MultimapBuilderWithKeys multimapBuilderWithKeys, Comparator comparator) {
            }

            @Override // com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder, com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public /* bridge */ /* synthetic */ Multimap build() {
            }

            @Override // com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder, com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public /* bridge */ /* synthetic */ SetMultimap build() {
            }

            @Override // com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder, com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V extends V0> SortedSetMultimap<K, V> build() {
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$6  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass6 extends SetMultimapBuilder<K0, V0> {
            public final /* synthetic */ MultimapBuilderWithKeys this$0;
            public final /* synthetic */ Class val$valueClass;

            public AnonymousClass6(MultimapBuilderWithKeys multimapBuilderWithKeys, Class cls) {
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public /* bridge */ /* synthetic */ Multimap build() {
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V extends V0> SetMultimap<K, V> build() {
            }
        }

        public ListMultimapBuilder<K0, Object> arrayListValues() {
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> createMap();

        public <V0 extends Enum<V0>> SetMultimapBuilder<K0, V0> enumSetValues(Class<V0> cls) {
        }

        public SetMultimapBuilder<K0, Object> hashSetValues() {
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues() {
        }

        public ListMultimapBuilder<K0, Object> linkedListValues() {
        }

        public SortedSetMultimapBuilder<K0, Comparable> treeSetValues() {
        }

        public ListMultimapBuilder<K0, Object> arrayListValues(int i2) {
        }

        public SetMultimapBuilder<K0, Object> hashSetValues(int i2) {
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues(int i2) {
        }

        public <V0> SortedSetMultimapBuilder<K0, V0> treeSetValues(Comparator<V0> comparator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class SetMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        @Override // com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ Multimap build() {
        }

        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> SetMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ Multimap build(Multimap multimap) {
        }

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> SetMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class SortedSetMultimapBuilder<K0, V0> extends SetMultimapBuilder<K0, V0> {
        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ Multimap build() {
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> SortedSetMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ Multimap build(Multimap multimap) {
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ SetMultimap build() {
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ SetMultimap build(Multimap multimap) {
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> SortedSetMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TreeSetSupplier<V> implements Supplier<SortedSet<V>>, Serializable {
        private final Comparator<? super V> comparator;

        public TreeSetSupplier(Comparator<? super V> comparator) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Object get() {
        }

        @Override // com.google.common.base.Supplier
        public SortedSet<V> get() {
        }
    }

    public /* synthetic */ MultimapBuilder(AnonymousClass1 anonymousClass1) {
    }

    public static <K0 extends Enum<K0>> MultimapBuilderWithKeys<K0> enumKeys(Class<K0> cls) {
    }

    public static MultimapBuilderWithKeys<Object> hashKeys() {
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys() {
    }

    public static MultimapBuilderWithKeys<Comparable> treeKeys() {
    }

    public abstract <K extends K0, V extends V0> Multimap<K, V> build();

    public <K extends K0, V extends V0> Multimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
    }

    private MultimapBuilder() {
    }

    public static MultimapBuilderWithKeys<Object> hashKeys(int i2) {
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys(int i2) {
    }

    public static <K0> MultimapBuilderWithKeys<K0> treeKeys(Comparator<K0> comparator) {
    }
}
