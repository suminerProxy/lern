package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Predicate;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Ordering;
import com.google.common.reflect.Invokable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class TypeToken<T> extends TypeCapture<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    @MonotonicNonNullDecl
    private transient TypeResolver covariantTypeResolver;
    @MonotonicNonNullDecl
    private transient TypeResolver invariantTypeResolver;
    private final Type runtimeType;

    /* renamed from: com.google.common.reflect.TypeToken$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends Invokable.MethodInvokable<T> {
        public final /* synthetic */ TypeToken this$0;

        public AnonymousClass1(TypeToken typeToken, Method method) {
        }

        @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
        public Type[] getGenericExceptionTypes() {
        }

        @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
        public Type[] getGenericParameterTypes() {
        }

        @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
        public Type getGenericReturnType() {
        }

        @Override // com.google.common.reflect.Invokable, com.google.common.reflect.Element
        public TypeToken<T> getOwnerType() {
        }

        @Override // com.google.common.reflect.Invokable, com.google.common.reflect.Element
        public String toString() {
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends Invokable.ConstructorInvokable<T> {
        public final /* synthetic */ TypeToken this$0;

        public AnonymousClass2(TypeToken typeToken, Constructor constructor) {
        }

        @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
        public Type[] getGenericExceptionTypes() {
        }

        @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
        public Type[] getGenericParameterTypes() {
        }

        @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
        public Type getGenericReturnType() {
        }

        @Override // com.google.common.reflect.Invokable, com.google.common.reflect.Element
        public TypeToken<T> getOwnerType() {
        }

        @Override // com.google.common.reflect.Invokable, com.google.common.reflect.Element
        public String toString() {
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends TypeVisitor {
        public final /* synthetic */ TypeToken this$0;

        public AnonymousClass3(TypeToken typeToken) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitGenericArrayType(GenericArrayType genericArrayType) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitParameterizedType(ParameterizedType parameterizedType) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitTypeVariable(TypeVariable<?> typeVariable) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitWildcardType(WildcardType wildcardType) {
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 extends TypeVisitor {
        public final /* synthetic */ TypeToken this$0;
        public final /* synthetic */ ImmutableSet.Builder val$builder;

        public AnonymousClass4(TypeToken typeToken, ImmutableSet.Builder builder) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitClass(Class<?> cls) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitGenericArrayType(GenericArrayType genericArrayType) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitParameterizedType(ParameterizedType parameterizedType) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitTypeVariable(TypeVariable<?> typeVariable) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitWildcardType(WildcardType wildcardType) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Bounds {
        private final Type[] bounds;
        private final boolean target;

        public Bounds(Type[] typeArr, boolean z) {
        }

        public boolean isSubtypeOf(Type type) {
        }

        public boolean isSupertypeOf(Type type) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ClassSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        private transient ImmutableSet<TypeToken<? super T>> classes;
        public final /* synthetic */ TypeToken this$0;

        private ClassSet(TypeToken typeToken) {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet classes() {
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
        }

        public /* synthetic */ ClassSet(TypeToken typeToken, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<TypeToken<? super T>> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class InterfaceSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;
        private final transient TypeToken<T>.TypeSet allTypes;
        @MonotonicNonNullDecl
        private transient ImmutableSet<TypeToken<? super T>> interfaces;
        public final /* synthetic */ TypeToken this$0;

        /* renamed from: com.google.common.reflect.TypeToken$InterfaceSet$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Predicate<Class<?>> {
            public final /* synthetic */ InterfaceSet this$1;

            public AnonymousClass1(InterfaceSet interfaceSet) {
            }

            @Override // com.google.common.base.Predicate
            public /* bridge */ /* synthetic */ boolean apply(Class<?> cls) {
            }

            /* renamed from: apply  reason: avoid collision after fix types in other method */
            public boolean apply2(Class<?> cls) {
            }
        }

        public InterfaceSet(TypeToken typeToken, TypeToken<T>.TypeSet typeSet) {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet classes() {
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<TypeToken<? super T>> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SimpleTypeToken<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;

        public SimpleTypeToken(Type type) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class TypeCollector<K> {
        public static final TypeCollector<TypeToken<?>> FOR_GENERIC_TYPE = null;
        public static final TypeCollector<Class<?>> FOR_RAW_TYPE = null;

        /* renamed from: com.google.common.reflect.TypeToken$TypeCollector$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 extends TypeCollector<TypeToken<?>> {
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public /* bridge */ /* synthetic */ Iterable<? extends TypeToken<?>> getInterfaces(TypeToken<?> typeToken) {
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public /* bridge */ /* synthetic */ Class getRawType(TypeToken<?> typeToken) {
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            @NullableDecl
            public /* bridge */ /* synthetic */ TypeToken<?> getSuperclass(TypeToken<?> typeToken) {
            }

            /* renamed from: getInterfaces  reason: avoid collision after fix types in other method */
            public Iterable<? extends TypeToken<?>> getInterfaces2(TypeToken<?> typeToken) {
            }

            /* renamed from: getRawType  reason: avoid collision after fix types in other method */
            public Class<?> getRawType2(TypeToken<?> typeToken) {
            }

            @NullableDecl
            /* renamed from: getSuperclass  reason: avoid collision after fix types in other method */
            public TypeToken<?> getSuperclass2(TypeToken<?> typeToken) {
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$TypeCollector$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass2 extends TypeCollector<Class<?>> {
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public /* bridge */ /* synthetic */ Iterable<? extends Class<?>> getInterfaces(Class<?> cls) {
            }

            /* renamed from: getRawType  reason: avoid collision after fix types in other method */
            public Class<?> getRawType2(Class<?> cls) {
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public /* bridge */ /* synthetic */ Class getRawType(Class<?> cls) {
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            @NullableDecl
            public /* bridge */ /* synthetic */ Class<?> getSuperclass(Class<?> cls) {
            }

            /* renamed from: getInterfaces  reason: avoid collision after fix types in other method */
            public Iterable<? extends Class<?>> getInterfaces2(Class<?> cls) {
            }

            @NullableDecl
            /* renamed from: getSuperclass  reason: avoid collision after fix types in other method */
            public Class<?> getSuperclass2(Class<?> cls) {
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$TypeCollector$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass3 extends ForwardingTypeCollector<K> {
            public final /* synthetic */ TypeCollector this$0;

            public AnonymousClass3(TypeCollector typeCollector, TypeCollector typeCollector2) {
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public ImmutableList<K> collectTypes(Iterable<? extends K> iterable) {
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector.ForwardingTypeCollector, com.google.common.reflect.TypeToken.TypeCollector
            public Iterable<? extends K> getInterfaces(K k2) {
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$TypeCollector$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass4 extends Ordering<K> {
            public final /* synthetic */ Map val$map;
            public final /* synthetic */ Comparator val$valueComparator;

            public AnonymousClass4(Comparator comparator, Map map) {
            }

            @Override // com.google.common.collect.Ordering, java.util.Comparator
            public int compare(K k2, K k3) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class ForwardingTypeCollector<K> extends TypeCollector<K> {
            private final TypeCollector<K> delegate;

            public ForwardingTypeCollector(TypeCollector<K> typeCollector) {
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public Iterable<? extends K> getInterfaces(K k2) {
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public Class<?> getRawType(K k2) {
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public K getSuperclass(K k2) {
            }
        }

        private TypeCollector() {
        }

        private static <K, V> ImmutableList<K> sortKeysByValue(Map<K, V> map, Comparator<? super V> comparator) {
        }

        public final TypeCollector<K> classesOnly() {
        }

        public final ImmutableList<K> collectTypes(K k2) {
        }

        public abstract Iterable<? extends K> getInterfaces(K k2);

        public abstract Class<?> getRawType(K k2);

        @NullableDecl
        public abstract K getSuperclass(K k2);

        public /* synthetic */ TypeCollector(AnonymousClass1 anonymousClass1) {
        }

        public ImmutableList<K> collectTypes(Iterable<? extends K> iterable) {
        }

        @CanIgnoreReturnValue
        private int collectTypes(K k2, Map<? super K, Integer> map) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class TypeFilter implements Predicate<TypeToken<?>> {
        private static final /* synthetic */ TypeFilter[] $VALUES = null;
        public static final TypeFilter IGNORE_TYPE_VARIABLE_OR_WILDCARD = null;
        public static final TypeFilter INTERFACE_ONLY = null;

        /* renamed from: com.google.common.reflect.TypeToken$TypeFilter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends TypeFilter {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.base.Predicate
            public /* bridge */ /* synthetic */ boolean apply(TypeToken<?> typeToken) {
            }

            /* renamed from: apply  reason: avoid collision after fix types in other method */
            public boolean apply2(TypeToken<?> typeToken) {
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$TypeFilter$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends TypeFilter {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.base.Predicate
            public /* bridge */ /* synthetic */ boolean apply(TypeToken<?> typeToken) {
            }

            /* renamed from: apply  reason: avoid collision after fix types in other method */
            public boolean apply2(TypeToken<?> typeToken) {
            }
        }

        private TypeFilter(String str, int i2) {
        }

        public static TypeFilter valueOf(String str) {
        }

        public static TypeFilter[] values() {
        }

        public /* synthetic */ TypeFilter(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class TypeSet extends ForwardingSet<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;
        public final /* synthetic */ TypeToken this$0;
        @MonotonicNonNullDecl
        private transient ImmutableSet<TypeToken<? super T>> types;

        public TypeSet(TypeToken typeToken) {
        }

        public TypeToken<T>.TypeSet classes() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        public TypeToken<T>.TypeSet interfaces() {
        }

        public Set<Class<? super T>> rawTypes() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<TypeToken<? super T>> delegate() {
        }
    }

    public /* synthetic */ TypeToken(Type type, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ TypeResolver access$000(TypeToken typeToken) {
    }

    public static /* synthetic */ TypeResolver access$100(TypeToken typeToken) {
    }

    public static /* synthetic */ ImmutableSet access$300(TypeToken typeToken) {
    }

    public static /* synthetic */ Type access$500(TypeToken typeToken) {
    }

    private static Bounds any(Type[] typeArr) {
    }

    @NullableDecl
    private TypeToken<? super T> boundAsSuperclass(Type type) {
    }

    private ImmutableList<TypeToken<? super T>> boundsAsInterfaces(Type[] typeArr) {
    }

    private static Type canonicalizeTypeArg(TypeVariable<?> typeVariable, Type type) {
    }

    private static WildcardType canonicalizeWildcardType(TypeVariable<?> typeVariable, WildcardType wildcardType) {
    }

    private static ParameterizedType canonicalizeWildcardsInParameterizedType(ParameterizedType parameterizedType) {
    }

    private static Type canonicalizeWildcardsInType(Type type) {
    }

    private static Bounds every(Type[] typeArr) {
    }

    private TypeToken<? extends T> getArraySubtype(Class<?> cls) {
    }

    private TypeToken<? super T> getArraySupertype(Class<? super T> cls) {
    }

    private TypeResolver getCovariantTypeResolver() {
    }

    private TypeResolver getInvariantTypeResolver() {
    }

    @NullableDecl
    private Type getOwnerTypeIfPresent() {
    }

    private ImmutableSet<Class<? super T>> getRawTypes() {
    }

    private TypeToken<? extends T> getSubtypeFromLowerBounds(Class<?> cls, Type[] typeArr) {
    }

    private TypeToken<? super T> getSupertypeFromUpperBounds(Class<? super T> cls, Type[] typeArr) {
    }

    private boolean is(Type type, TypeVariable<?> typeVariable) {
    }

    private boolean isOwnedBySubtypeOf(Type type) {
    }

    private boolean isSubtypeOfArrayType(GenericArrayType genericArrayType) {
    }

    private boolean isSubtypeOfParameterizedType(ParameterizedType parameterizedType) {
    }

    private boolean isSupertypeOfArray(GenericArrayType genericArrayType) {
    }

    private boolean isWrapper() {
    }

    private static Type newArrayClassOrGenericArrayType(Type type) {
    }

    public static <T> TypeToken<T> of(Class<T> cls) {
    }

    private TypeToken<?> resolveSupertype(Type type) {
    }

    private Type resolveTypeArgsForSubclass(Class<?> cls) {
    }

    private boolean someRawTypeIsSubclassOf(Class<?> cls) {
    }

    @VisibleForTesting
    public static <T> TypeToken<? extends T> toGenericType(Class<T> cls) {
    }

    public final Invokable<T, T> constructor(Constructor<?> constructor) {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    @NullableDecl
    public final TypeToken<?> getComponentType() {
    }

    public final ImmutableList<TypeToken<? super T>> getGenericInterfaces() {
    }

    @NullableDecl
    public final TypeToken<? super T> getGenericSuperclass() {
    }

    public final Class<? super T> getRawType() {
    }

    public final TypeToken<? extends T> getSubtype(Class<?> cls) {
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
    }

    public final Type getType() {
    }

    public final TypeToken<T>.TypeSet getTypes() {
    }

    public int hashCode() {
    }

    public final boolean isArray() {
    }

    public final boolean isPrimitive() {
    }

    public final boolean isSubtypeOf(TypeToken<?> typeToken) {
    }

    public final boolean isSupertypeOf(TypeToken<?> typeToken) {
    }

    public final Invokable<T, Object> method(Method method) {
    }

    @CanIgnoreReturnValue
    public final TypeToken<T> rejectTypeVariables() {
    }

    public final TypeToken<?> resolveType(Type type) {
    }

    public String toString() {
    }

    public final TypeToken<T> unwrap() {
    }

    public final <X> TypeToken<T> where(TypeParameter<X> typeParameter, TypeToken<X> typeToken) {
    }

    public final TypeToken<T> wrap() {
    }

    public Object writeReplace() {
    }

    public TypeToken() {
    }

    public static TypeToken<?> of(Type type) {
    }

    public final boolean isSubtypeOf(Type type) {
    }

    public final boolean isSupertypeOf(Type type) {
    }

    public TypeToken(Class<?> cls) {
    }

    public final <X> TypeToken<T> where(TypeParameter<X> typeParameter, Class<X> cls) {
    }

    private TypeToken(Type type) {
    }
}
