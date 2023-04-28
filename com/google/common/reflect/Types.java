package com.google.common.reflect;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Types {
    private static final Joiner COMMA_JOINER = null;
    private static final Function<Type, String> TYPE_NAME = null;

    /* renamed from: com.google.common.reflect.Types$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Function<Type, String> {
        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ String apply(Type type) {
        }

        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public String apply2(Type type) {
        }
    }

    /* renamed from: com.google.common.reflect.Types$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 extends TypeVisitor {
        public final /* synthetic */ AtomicReference val$result;

        public AnonymousClass2(AtomicReference atomicReference) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitClass(Class<?> cls) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitGenericArrayType(GenericArrayType genericArrayType) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitTypeVariable(TypeVariable<?> typeVariable) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitWildcardType(WildcardType wildcardType) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class ClassOwnership {
        private static final /* synthetic */ ClassOwnership[] $VALUES = null;
        public static final ClassOwnership JVM_BEHAVIOR = null;
        public static final ClassOwnership LOCAL_CLASS_HAS_NO_OWNER = null;
        public static final ClassOwnership OWNED_BY_ENCLOSING_CLASS = null;

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends ClassOwnership {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.reflect.Types.ClassOwnership
            @NullableDecl
            public Class<?> getOwnerType(Class<?> cls) {
            }
        }

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$1LocalClass  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C1LocalClass<T> {
        }

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends ClassOwnership {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.reflect.Types.ClassOwnership
            @NullableDecl
            public Class<?> getOwnerType(Class<?> cls) {
            }
        }

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass3 extends C1LocalClass<String> {
        }

        private ClassOwnership(String str, int i2) {
        }

        private static ClassOwnership detectJvmBehavior() {
        }

        public static ClassOwnership valueOf(String str) {
        }

        public static ClassOwnership[] values() {
        }

        @NullableDecl
        public abstract Class<?> getOwnerType(Class<?> cls);

        public /* synthetic */ ClassOwnership(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
        }

        public boolean equals(Object obj) {
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class JavaVersion {
        private static final /* synthetic */ JavaVersion[] $VALUES = null;
        public static final JavaVersion CURRENT = null;
        public static final JavaVersion JAVA6 = null;
        public static final JavaVersion JAVA7 = null;
        public static final JavaVersion JAVA8 = null;
        public static final JavaVersion JAVA9 = null;

        /* renamed from: com.google.common.reflect.Types$JavaVersion$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends JavaVersion {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public /* bridge */ /* synthetic */ Type newArrayType(Type type) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public GenericArrayType newArrayType(Type type) {
            }
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends JavaVersion {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type type) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
            }
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass3 extends JavaVersion {
            public AnonymousClass3(String str, int i2) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type type) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public String typeName(Type type) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
            }
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass4 extends JavaVersion {
            public AnonymousClass4(String str, int i2) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public boolean jdkTypeDuplicatesOwnerName() {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type type) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public String typeName(Type type) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
            }
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$5  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass5 extends TypeCapture<Map.Entry<String, int[][]>> {
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$6  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass6 extends TypeCapture<int[]> {
        }

        private JavaVersion(String str, int i2) {
        }

        public static JavaVersion valueOf(String str) {
        }

        public static JavaVersion[] values() {
        }

        public boolean jdkTypeDuplicatesOwnerName() {
        }

        public abstract Type newArrayType(Type type);

        public String typeName(Type type) {
        }

        public final ImmutableList<Type> usedInGenericType(Type[] typeArr) {
        }

        public abstract Type usedInGenericType(Type type);

        public /* synthetic */ JavaVersion(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class NativeTypeVariableEquals<X> {
        public static final boolean NATIVE_TYPE_VARIABLE_ONLY = false;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> argumentsList;
        @NullableDecl
        private final Type ownerType;
        private final Class<?> rawType;

        public ParameterizedTypeImpl(@NullableDecl Type type, Class<?> cls, Type[] typeArr) {
        }

        public boolean equals(Object obj) {
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TypeVariableImpl<D extends GenericDeclaration> {
        private final ImmutableList<Type> bounds;
        private final D genericDeclaration;
        private final String name;

        public TypeVariableImpl(D d2, String str, Type[] typeArr) {
        }

        public boolean equals(Object obj) {
        }

        public Type[] getBounds() {
        }

        public D getGenericDeclaration() {
        }

        public String getName() {
        }

        public String getTypeName() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TypeVariableInvocationHandler implements InvocationHandler {
        private static final ImmutableMap<String, Method> typeVariableMethods = null;
        private final TypeVariableImpl<?> typeVariableImpl;

        public TypeVariableInvocationHandler(TypeVariableImpl<?> typeVariableImpl) {
        }

        public static /* synthetic */ TypeVariableImpl access$600(TypeVariableInvocationHandler typeVariableInvocationHandler) {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> lowerBounds;
        private final ImmutableList<Type> upperBounds;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
        }

        public boolean equals(Object obj) {
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    private Types() {
    }

    public static /* synthetic */ Type access$100(Type[] typeArr) {
    }

    public static /* synthetic */ void access$200(Type[] typeArr, String str) {
    }

    public static /* synthetic */ Type[] access$300(Collection collection) {
    }

    public static /* synthetic */ Function access$400() {
    }

    public static /* synthetic */ Joiner access$500() {
    }

    public static /* synthetic */ Iterable access$700(Iterable iterable) {
    }

    private static void disallowPrimitiveType(Type[] typeArr, String str) {
    }

    private static Iterable<Type> filterUpperBounds(Iterable<Type> iterable) {
    }

    public static Class<?> getArrayClass(Class<?> cls) {
    }

    @NullableDecl
    public static Type getComponentType(Type type) {
    }

    public static Type newArrayType(Type type) {
    }

    public static <D extends GenericDeclaration> TypeVariable<D> newArtificialTypeVariable(D d2, String str, Type... typeArr) {
    }

    public static ParameterizedType newParameterizedType(Class<?> cls, Type... typeArr) {
    }

    public static ParameterizedType newParameterizedTypeWithOwner(@NullableDecl Type type, Class<?> cls, Type... typeArr) {
    }

    private static <D extends GenericDeclaration> TypeVariable<D> newTypeVariableImpl(D d2, String str, Type[] typeArr) {
    }

    @VisibleForTesting
    public static WildcardType subtypeOf(Type type) {
    }

    @NullableDecl
    private static Type subtypeOfComponentType(Type[] typeArr) {
    }

    @VisibleForTesting
    public static WildcardType supertypeOf(Type type) {
    }

    private static Type[] toArray(Collection<Type> collection) {
    }

    public static String toString(Type type) {
    }
}
