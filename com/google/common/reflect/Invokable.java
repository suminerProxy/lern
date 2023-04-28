package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Invokable<T, R> extends Element implements GenericDeclaration {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ConstructorInvokable<T> extends Invokable<T, T> {
        public final Constructor<?> constructor;

        public ConstructorInvokable(Constructor<?> constructor) {
        }

        private boolean mayNeedHiddenThis() {
        }

        @Override // com.google.common.reflect.Invokable
        public Type[] getGenericExceptionTypes() {
        }

        @Override // com.google.common.reflect.Invokable
        public Type[] getGenericParameterTypes() {
        }

        @Override // com.google.common.reflect.Invokable
        public Type getGenericReturnType() {
        }

        @Override // com.google.common.reflect.Invokable
        public final Annotation[][] getParameterAnnotations() {
        }

        @Override // java.lang.reflect.GenericDeclaration
        public final TypeVariable<?>[] getTypeParameters() {
        }

        @Override // com.google.common.reflect.Invokable
        public final Object invokeInternal(@NullableDecl Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException {
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class MethodInvokable<T> extends Invokable<T, Object> {
        public final Method method;

        public MethodInvokable(Method method) {
        }

        @Override // com.google.common.reflect.Invokable
        public Type[] getGenericExceptionTypes() {
        }

        @Override // com.google.common.reflect.Invokable
        public Type[] getGenericParameterTypes() {
        }

        @Override // com.google.common.reflect.Invokable
        public Type getGenericReturnType() {
        }

        @Override // com.google.common.reflect.Invokable
        public final Annotation[][] getParameterAnnotations() {
        }

        @Override // java.lang.reflect.GenericDeclaration
        public final TypeVariable<?>[] getTypeParameters() {
        }

        @Override // com.google.common.reflect.Invokable
        public final Object invokeInternal(@NullableDecl Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException {
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
        }
    }

    public <M extends AccessibleObject & Member> Invokable(M m2) {
    }

    public static Invokable<?, Object> from(Method method) {
    }

    @Override // com.google.common.reflect.Element
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
    }

    @Override // com.google.common.reflect.Element, java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
    }

    public final ImmutableList<TypeToken<? extends Throwable>> getExceptionTypes() {
    }

    public abstract Type[] getGenericExceptionTypes();

    public abstract Type[] getGenericParameterTypes();

    public abstract Type getGenericReturnType();

    @Override // com.google.common.reflect.Element
    public TypeToken<T> getOwnerType() {
    }

    public abstract Annotation[][] getParameterAnnotations();

    public final ImmutableList<Parameter> getParameters() {
    }

    public final TypeToken<? extends R> getReturnType() {
    }

    @Override // com.google.common.reflect.Element
    public /* bridge */ /* synthetic */ int hashCode() {
    }

    @CanIgnoreReturnValue
    public final R invoke(@NullableDecl T t, Object... objArr) throws InvocationTargetException, IllegalAccessException {
    }

    public abstract Object invokeInternal(@NullableDecl Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException;

    public abstract boolean isOverridable();

    public abstract boolean isVarArgs();

    public final <R1 extends R> Invokable<T, R1> returning(Class<R1> cls) {
    }

    @Override // com.google.common.reflect.Element
    public /* bridge */ /* synthetic */ String toString() {
    }

    public static <T> Invokable<T, T> from(Constructor<T> constructor) {
    }

    public final <R1 extends R> Invokable<T, R1> returning(TypeToken<R1> typeToken) {
    }
}
