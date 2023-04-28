package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.collect.ImmutableMap;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TypeResolver {
    private final TypeTable typeTable;

    /* renamed from: com.google.common.reflect.TypeResolver$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends TypeVisitor {
        public final /* synthetic */ Map val$mappings;
        public final /* synthetic */ Type val$to;

        public AnonymousClass1(Map map, Type type) {
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
    public static final class TypeMappingIntrospector extends TypeVisitor {
        private final Map<TypeVariableKey, Type> mappings;

        private TypeMappingIntrospector() {
        }

        public static ImmutableMap<TypeVariableKey, Type> getTypeMappings(Type type) {
        }

        private void map(TypeVariableKey typeVariableKey, Type type) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitClass(Class<?> cls) {
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
    public static final class TypeVariableKey {
        private final TypeVariable<?> var;

        public TypeVariableKey(TypeVariable<?> typeVariable) {
        }

        private boolean equalsTypeVariable(TypeVariable<?> typeVariable) {
        }

        public static TypeVariableKey forLookup(Type type) {
        }

        public boolean equals(Object obj) {
        }

        public boolean equalsType(Type type) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WildcardCapturer {
        public static final WildcardCapturer INSTANCE = null;
        private final AtomicInteger id;

        /* renamed from: com.google.common.reflect.TypeResolver$WildcardCapturer$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends WildcardCapturer {
            public final /* synthetic */ WildcardCapturer this$0;
            public final /* synthetic */ TypeVariable val$typeParam;

            public AnonymousClass1(WildcardCapturer wildcardCapturer, AtomicInteger atomicInteger, TypeVariable typeVariable) {
            }

            @Override // com.google.common.reflect.TypeResolver.WildcardCapturer
            public TypeVariable<?> captureAsTypeVariable(Type[] typeArr) {
            }
        }

        public /* synthetic */ WildcardCapturer(AtomicInteger atomicInteger, AnonymousClass1 anonymousClass1) {
        }

        private Type captureNullable(@NullableDecl Type type) {
        }

        private WildcardCapturer forTypeVariable(TypeVariable<?> typeVariable) {
        }

        private WildcardCapturer notForTypeVariable() {
        }

        public final Type capture(Type type) {
        }

        public TypeVariable<?> captureAsTypeVariable(Type[] typeArr) {
        }

        private WildcardCapturer() {
        }

        private WildcardCapturer(AtomicInteger atomicInteger) {
        }
    }

    public /* synthetic */ TypeResolver(TypeTable typeTable, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ void access$000(Map map, Type type, Type type2) {
    }

    public static /* synthetic */ Object access$100(Class cls, Object obj) {
    }

    public static /* synthetic */ Type[] access$300(TypeResolver typeResolver, Type[] typeArr) {
    }

    public static TypeResolver covariantly(Type type) {
    }

    private static <T> T expectArgument(Class<T> cls, Object obj) {
    }

    public static TypeResolver invariantly(Type type) {
    }

    private static void populateTypeMappings(Map<TypeVariableKey, Type> map, Type type, Type type2) {
    }

    private Type resolveGenericArrayType(GenericArrayType genericArrayType) {
    }

    private ParameterizedType resolveParameterizedType(ParameterizedType parameterizedType) {
    }

    private Type[] resolveTypes(Type[] typeArr) {
    }

    private WildcardType resolveWildcardType(WildcardType wildcardType) {
    }

    public Type resolveType(Type type) {
    }

    public Type[] resolveTypesInPlace(Type[] typeArr) {
    }

    public TypeResolver where(Type type, Type type2) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class TypeTable {
        private final ImmutableMap<TypeVariableKey, Type> map;

        /* renamed from: com.google.common.reflect.TypeResolver$TypeTable$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends TypeTable {
            public final /* synthetic */ TypeTable this$0;
            public final /* synthetic */ TypeTable val$unguarded;
            public final /* synthetic */ TypeVariable val$var;

            public AnonymousClass1(TypeTable typeTable, TypeVariable typeVariable, TypeTable typeTable2) {
            }

            @Override // com.google.common.reflect.TypeResolver.TypeTable
            public Type resolveInternal(TypeVariable<?> typeVariable, TypeTable typeTable) {
            }
        }

        public TypeTable() {
        }

        public final Type resolve(TypeVariable<?> typeVariable) {
        }

        public Type resolveInternal(TypeVariable<?> typeVariable, TypeTable typeTable) {
        }

        public final TypeTable where(Map<TypeVariableKey, ? extends Type> map) {
        }

        private TypeTable(ImmutableMap<TypeVariableKey, Type> immutableMap) {
        }
    }

    public TypeResolver() {
    }

    private TypeResolver(TypeTable typeTable) {
    }

    public TypeResolver where(Map<TypeVariableKey, ? extends Type> map) {
    }
}
