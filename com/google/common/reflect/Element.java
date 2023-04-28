package com.google.common.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Element extends AccessibleObject implements Member {
    private final AccessibleObject accessibleObject;
    private final Member member;

    public <M extends AccessibleObject & Member> Element(M m2) {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
    }

    @Override // java.lang.reflect.Member
    public Class<?> getDeclaringClass() {
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
    }

    public TypeToken<?> getOwnerType() {
    }

    public int hashCode() {
    }

    public final boolean isAbstract() {
    }

    @Override // java.lang.reflect.AccessibleObject
    public final boolean isAccessible() {
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
    }

    public final boolean isFinal() {
    }

    public final boolean isNative() {
    }

    public final boolean isPackagePrivate() {
    }

    public final boolean isPrivate() {
    }

    public final boolean isProtected() {
    }

    public final boolean isPublic() {
    }

    public final boolean isStatic() {
    }

    public final boolean isSynchronized() {
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
    }

    public final boolean isTransient() {
    }

    public final boolean isVolatile() {
    }

    @Override // java.lang.reflect.AccessibleObject
    public final void setAccessible(boolean z) throws SecurityException {
    }

    public String toString() {
    }
}
