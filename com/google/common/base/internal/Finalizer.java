package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Finalizer implements Runnable {
    private static final String FINALIZABLE_REFERENCE = "com.google.common.base.FinalizableReference";
    @NullableDecl
    private static final Constructor<Thread> bigThreadConstructor = null;
    @NullableDecl
    private static final Field inheritableThreadLocals = null;
    private static final Logger logger = null;
    private final WeakReference<Class<?>> finalizableReferenceClassReference;
    private final PhantomReference<Object> frqReference;
    private final ReferenceQueue<Object> queue;

    private Finalizer(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
    }

    private boolean cleanUp(Reference<?> reference) {
    }

    @NullableDecl
    private static Constructor<Thread> getBigThreadConstructor() {
    }

    @NullableDecl
    private Method getFinalizeReferentMethod() {
    }

    @NullableDecl
    private static Field getInheritableThreadLocalsField() {
    }

    public static void startFinalizer(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
    }

    @Override // java.lang.Runnable
    public void run() {
    }
}
