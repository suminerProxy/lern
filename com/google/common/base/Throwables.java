package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Throwables {
    @GwtIncompatible
    private static final String JAVA_LANG_ACCESS_CLASSNAME = "sun.misc.JavaLangAccess";
    @VisibleForTesting
    @GwtIncompatible
    public static final String SHARED_SECRETS_CLASSNAME = "sun.misc.SharedSecrets";
    @NullableDecl
    @GwtIncompatible
    private static final Method getStackTraceDepthMethod = null;
    @NullableDecl
    @GwtIncompatible
    private static final Method getStackTraceElementMethod = null;
    @NullableDecl
    @GwtIncompatible
    private static final Object jla = null;

    /* renamed from: com.google.common.base.Throwables$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends AbstractList<StackTraceElement> {
        public final /* synthetic */ Throwable val$t;

        public AnonymousClass1(Throwable th) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public StackTraceElement get(int i2) {
        }
    }

    private Throwables() {
    }

    public static /* synthetic */ Method access$000() {
    }

    public static /* synthetic */ Object access$100() {
    }

    public static /* synthetic */ Object access$200(Method method, Object obj, Object[] objArr) {
    }

    public static /* synthetic */ Method access$300() {
    }

    @Beta
    public static List<Throwable> getCausalChain(Throwable th) {
    }

    @Beta
    @GwtIncompatible
    public static <X extends Throwable> X getCauseAs(Throwable th, Class<X> cls) {
    }

    @NullableDecl
    @GwtIncompatible
    private static Method getGetMethod() {
    }

    @NullableDecl
    @GwtIncompatible
    private static Object getJLA() {
    }

    @NullableDecl
    @GwtIncompatible
    private static Method getJlaMethod(String str, Class<?>... clsArr) throws ThreadDeath {
    }

    public static Throwable getRootCause(Throwable th) {
    }

    @NullableDecl
    @GwtIncompatible
    private static Method getSizeMethod() {
    }

    @GwtIncompatible
    public static String getStackTraceAsString(Throwable th) {
    }

    @GwtIncompatible
    private static Object invokeAccessibleNonThrowingMethod(Method method, Object obj, Object... objArr) {
    }

    @GwtIncompatible
    private static List<StackTraceElement> jlaStackTrace(Throwable th) {
    }

    @Beta
    @GwtIncompatible
    public static List<StackTraceElement> lazyStackTrace(Throwable th) {
    }

    @Beta
    @GwtIncompatible
    public static boolean lazyStackTraceIsLazy() {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    @Deprecated
    public static RuntimeException propagate(Throwable th) {
    }

    @GwtIncompatible
    @Deprecated
    public static <X extends Throwable> void propagateIfInstanceOf(@NullableDecl Throwable th, Class<X> cls) throws Throwable {
    }

    @GwtIncompatible
    @Deprecated
    public static void propagateIfPossible(@NullableDecl Throwable th) {
    }

    @GwtIncompatible
    public static <X extends Throwable> void throwIfInstanceOf(Throwable th, Class<X> cls) throws Throwable {
    }

    public static void throwIfUnchecked(Throwable th) {
    }

    @GwtIncompatible
    public static <X extends Throwable> void propagateIfPossible(@NullableDecl Throwable th, Class<X> cls) throws Throwable {
    }

    @GwtIncompatible
    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(@NullableDecl Throwable th, Class<X1> cls, Class<X2> cls2) throws Throwable, Throwable {
    }
}
