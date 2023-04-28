package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Parameter implements AnnotatedElement {
    private final ImmutableList<Annotation> annotations;
    private final Invokable<?, ?> declaration;
    private final int position;
    private final TypeToken<?> type;

    public Parameter(Invokable<?, ?> invokable, int i2, TypeToken<?> typeToken, Annotation[] annotationArr) {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // java.lang.reflect.AnnotatedElement
    @NullableDecl
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getAnnotationsByType(Class<A> cls) {
    }

    @Override // java.lang.reflect.AnnotatedElement
    @NullableDecl
    public <A extends Annotation> A getDeclaredAnnotation(Class<A> cls) {
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> cls) {
    }

    public Invokable<?, ?> getDeclaringInvokable() {
    }

    public TypeToken<?> getType() {
    }

    public int hashCode() {
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
    }

    public String toString() {
    }
}
