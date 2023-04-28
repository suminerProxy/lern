package com.google.common.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class TypeVisitor {
    private final Set<Type> visited;

    public final void visit(Type... typeArr) {
    }

    public void visitClass(Class<?> cls) {
    }

    public void visitGenericArrayType(GenericArrayType genericArrayType) {
    }

    public void visitParameterizedType(ParameterizedType parameterizedType) {
    }

    public void visitTypeVariable(TypeVariable<?> typeVariable) {
    }

    public void visitWildcardType(WildcardType wildcardType) {
    }
}
