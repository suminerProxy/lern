package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Predicates {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AndPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends Predicate<? super T>> components;

        public /* synthetic */ AndPredicate(List list, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private AndPredicate(List<? extends Predicate<? super T>> list) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CompositionPredicate<A, B> implements Predicate<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: f  reason: collision with root package name */
        public final Function<A, ? extends B> f3359f;

        /* renamed from: p  reason: collision with root package name */
        public final Predicate<B> f3360p;

        public /* synthetic */ CompositionPredicate(Predicate predicate, Function function, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl A a2) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private CompositionPredicate(Predicate<B> predicate, Function<A, ? extends B> function) {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        private static final long serialVersionUID = 0;

        public ContainsPatternFromStringPredicate(String str) {
        }

        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public String toString() {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ContainsPatternPredicate implements Predicate<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;
        public final CommonPattern pattern;

        public ContainsPatternPredicate(CommonPattern commonPattern) {
        }

        @Override // com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(CharSequence charSequence) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public boolean apply2(CharSequence charSequence) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class InPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Collection<?> target;

        public /* synthetic */ InPredicate(Collection collection, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private InPredicate(Collection<?> collection) {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class InstanceOfPredicate implements Predicate<Object>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        public /* synthetic */ InstanceOfPredicate(Class cls, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl Object obj) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private InstanceOfPredicate(Class<?> cls) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class IsEqualToPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final T target;

        public /* synthetic */ IsEqualToPredicate(Object obj, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(T t) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private IsEqualToPredicate(T t) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class NotPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Predicate<T> predicate;

        public NotPredicate(Predicate<T> predicate) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class ObjectPredicate implements Predicate<Object> {
        private static final /* synthetic */ ObjectPredicate[] $VALUES = null;
        public static final ObjectPredicate ALWAYS_FALSE = null;
        public static final ObjectPredicate ALWAYS_TRUE = null;
        public static final ObjectPredicate IS_NULL = null;
        public static final ObjectPredicate NOT_NULL = null;

        /* renamed from: com.google.common.base.Predicates$ObjectPredicate$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends ObjectPredicate {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
            }

            @Override // java.lang.Enum
            public String toString() {
            }
        }

        /* renamed from: com.google.common.base.Predicates$ObjectPredicate$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends ObjectPredicate {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
            }

            @Override // java.lang.Enum
            public String toString() {
            }
        }

        /* renamed from: com.google.common.base.Predicates$ObjectPredicate$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass3 extends ObjectPredicate {
            public AnonymousClass3(String str, int i2) {
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
            }

            @Override // java.lang.Enum
            public String toString() {
            }
        }

        /* renamed from: com.google.common.base.Predicates$ObjectPredicate$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass4 extends ObjectPredicate {
            public AnonymousClass4(String str, int i2) {
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
            }

            @Override // java.lang.Enum
            public String toString() {
            }
        }

        private ObjectPredicate(String str, int i2) {
        }

        public static ObjectPredicate valueOf(String str) {
        }

        public static ObjectPredicate[] values() {
        }

        public <T> Predicate<T> withNarrowedType() {
        }

        public /* synthetic */ ObjectPredicate(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class OrPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends Predicate<? super T>> components;

        public /* synthetic */ OrPredicate(List list, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private OrPredicate(List<? extends Predicate<? super T>> list) {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SubtypeOfPredicate implements Predicate<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        public /* synthetic */ SubtypeOfPredicate(Class cls, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Class<?> cls) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private SubtypeOfPredicate(Class<?> cls) {
        }

        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public boolean apply2(Class<?> cls) {
        }
    }

    private Predicates() {
    }

    public static /* synthetic */ String access$800(String str, Iterable iterable) {
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> alwaysFalse() {
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> alwaysTrue() {
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
    }

    private static <T> List<Predicate<? super T>> asList(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
    }

    @GwtIncompatible("java.util.regex.Pattern")
    public static Predicate<CharSequence> contains(Pattern pattern) {
    }

    @GwtIncompatible
    public static Predicate<CharSequence> containsPattern(String str) {
    }

    private static <T> List<T> defensiveCopy(T... tArr) {
    }

    public static <T> Predicate<T> equalTo(@NullableDecl T t) {
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
    }

    @GwtIncompatible
    public static Predicate<Object> instanceOf(Class<?> cls) {
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> isNull() {
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> notNull() {
    }

    public static <T> Predicate<T> or(Iterable<? extends Predicate<? super T>> iterable) {
    }

    @Beta
    @GwtIncompatible
    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
    }

    private static String toStringHelper(String str, Iterable<?> iterable) {
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
    }

    public static <T> List<T> defensiveCopy(Iterable<T> iterable) {
    }

    @SafeVarargs
    public static <T> Predicate<T> or(Predicate<? super T>... predicateArr) {
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
    }

    public static <T> Predicate<T> or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
    }
}
