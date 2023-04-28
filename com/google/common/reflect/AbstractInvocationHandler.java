package com.google.common.reflect;

import com.google.common.annotations.Beta;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractInvocationHandler implements InvocationHandler {
    private static final Object[] NO_ARGS = null;

    private static boolean isProxyOfSameInterfaces(Object obj, Class<?> cls) {
    }

    public boolean equals(Object obj) {
    }

    public abstract Object handleInvocation(Object obj, Method method, Object[] objArr) throws Throwable;

    public int hashCode() {
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, @NullableDecl Object[] objArr) throws Throwable {
    }

    public String toString() {
    }
}
