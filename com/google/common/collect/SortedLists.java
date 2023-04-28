package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SortedLists {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class KeyAbsentBehavior {
        private static final /* synthetic */ KeyAbsentBehavior[] $VALUES = null;
        public static final KeyAbsentBehavior INVERTED_INSERTION_INDEX = null;
        public static final KeyAbsentBehavior NEXT_HIGHER = null;
        public static final KeyAbsentBehavior NEXT_LOWER = null;

        /* renamed from: com.google.common.collect.SortedLists$KeyAbsentBehavior$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends KeyAbsentBehavior {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i2) {
            }
        }

        /* renamed from: com.google.common.collect.SortedLists$KeyAbsentBehavior$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends KeyAbsentBehavior {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i2) {
            }
        }

        /* renamed from: com.google.common.collect.SortedLists$KeyAbsentBehavior$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass3 extends KeyAbsentBehavior {
            public AnonymousClass3(String str, int i2) {
            }

            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i2) {
            }
        }

        private KeyAbsentBehavior(String str, int i2) {
        }

        public static KeyAbsentBehavior valueOf(String str) {
        }

        public static KeyAbsentBehavior[] values() {
        }

        public abstract int resultIndex(int i2);

        public /* synthetic */ KeyAbsentBehavior(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class KeyPresentBehavior {
        private static final /* synthetic */ KeyPresentBehavior[] $VALUES = null;
        public static final KeyPresentBehavior ANY_PRESENT = null;
        public static final KeyPresentBehavior FIRST_AFTER = null;
        public static final KeyPresentBehavior FIRST_PRESENT = null;
        public static final KeyPresentBehavior LAST_BEFORE = null;
        public static final KeyPresentBehavior LAST_PRESENT = null;

        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends KeyPresentBehavior {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
            }
        }

        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends KeyPresentBehavior {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
            }
        }

        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass3 extends KeyPresentBehavior {
            public AnonymousClass3(String str, int i2) {
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
            }
        }

        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass4 extends KeyPresentBehavior {
            public AnonymousClass4(String str, int i2) {
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
            }
        }

        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$5  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass5 extends KeyPresentBehavior {
            public AnonymousClass5(String str, int i2) {
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
            }
        }

        private KeyPresentBehavior(String str, int i2) {
        }

        public static KeyPresentBehavior valueOf(String str) {
        }

        public static KeyPresentBehavior[] values() {
        }

        public abstract <E> int resultIndex(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2);

        public /* synthetic */ KeyPresentBehavior(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    private SortedLists() {
    }

    public static <E extends Comparable> int binarySearch(List<? extends E> list, E e2, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
    }

    public static <E, K extends Comparable> int binarySearch(List<E> list, Function<? super E, K> function, @NullableDecl K k2, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
    }

    public static <E, K> int binarySearch(List<E> list, Function<? super E, K> function, @NullableDecl K k2, Comparator<? super K> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
    }

    public static <E> int binarySearch(List<? extends E> list, @NullableDecl E e2, Comparator<? super E> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
    }
}
