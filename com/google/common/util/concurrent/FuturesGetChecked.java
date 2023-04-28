package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FuturesGetChecked {
    private static final Ordering<Constructor<?>> WITH_STRING_PARAM_FIRST = null;

    /* renamed from: com.google.common.util.concurrent.FuturesGetChecked$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Function<Constructor<?>, Boolean> {
        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Boolean apply(Constructor<?> constructor) {
        }

        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public Boolean apply2(Constructor<?> constructor) {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface GetCheckedTypeValidator {
        void validateClass(Class<? extends Exception> cls);
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class GetCheckedTypeValidatorHolder {
        public static final GetCheckedTypeValidator BEST_VALIDATOR = null;
        public static final String CLASS_VALUE_VALIDATOR_NAME = null;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        @IgnoreJRERequirement
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class ClassValueValidator implements GetCheckedTypeValidator {
            private static final /* synthetic */ ClassValueValidator[] $VALUES = null;
            public static final ClassValueValidator INSTANCE = null;
            private static final ClassValue<Boolean> isValidClass = null;

            /* renamed from: com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$ClassValueValidator$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public static class AnonymousClass1 extends ClassValue<Boolean> {
                /* renamed from: computeValue  reason: collision with other method in class */
                public /* bridge */ /* synthetic */ Object m9computeValue(Class cls) {
                }

                public Boolean computeValue(Class<?> cls) {
                }
            }

            private ClassValueValidator(String str, int i2) {
            }

            public static ClassValueValidator valueOf(String str) {
            }

            public static ClassValueValidator[] values() {
            }

            @Override // com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator
            public void validateClass(Class<? extends Exception> cls) {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class WeakSetValidator implements GetCheckedTypeValidator {
            private static final /* synthetic */ WeakSetValidator[] $VALUES = null;
            public static final WeakSetValidator INSTANCE = null;
            private static final Set<WeakReference<Class<? extends Exception>>> validClasses = null;

            private WeakSetValidator(String str, int i2) {
            }

            public static WeakSetValidator valueOf(String str) {
            }

            public static WeakSetValidator[] values() {
            }

            @Override // com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator
            public void validateClass(Class<? extends Exception> cls) {
            }
        }

        public static GetCheckedTypeValidator getBestValidator() {
        }
    }

    private FuturesGetChecked() {
    }

    private static GetCheckedTypeValidator bestGetCheckedTypeValidator() {
    }

    @VisibleForTesting
    public static void checkExceptionClassValidity(Class<? extends Exception> cls) {
    }

    @VisibleForTesting
    public static GetCheckedTypeValidator classValueValidator() {
    }

    @CanIgnoreReturnValue
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) throws Exception {
    }

    private static boolean hasConstructorUsableByGetChecked(Class<? extends Exception> cls) {
    }

    @VisibleForTesting
    public static boolean isCheckedException(Class<? extends Exception> cls) {
    }

    @NullableDecl
    private static <X> X newFromConstructor(Constructor<X> constructor, Throwable th) {
    }

    private static <X extends Exception> X newWithCause(Class<X> cls, Throwable th) {
    }

    private static <X extends Exception> List<Constructor<X>> preferringStrings(List<Constructor<X>> list) {
    }

    @VisibleForTesting
    public static GetCheckedTypeValidator weakSetValidator() {
    }

    private static <X extends Exception> void wrapAndThrowExceptionOrError(Throwable th, Class<X> cls) throws Exception {
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    public static <V, X extends Exception> V getChecked(GetCheckedTypeValidator getCheckedTypeValidator, Future<V> future, Class<X> cls) throws Exception {
    }

    @CanIgnoreReturnValue
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j2, TimeUnit timeUnit) throws Exception {
    }
}
