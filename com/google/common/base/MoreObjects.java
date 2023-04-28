package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MoreObjects {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ToStringHelper {
        private final String className;
        private final ValueHolder holderHead;
        private ValueHolder holderTail;
        private boolean omitNullValues;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class ValueHolder {
            @NullableDecl
            public String name;
            @NullableDecl
            public ValueHolder next;
            @NullableDecl
            public Object value;

            private ValueHolder() {
            }

            public /* synthetic */ ValueHolder(AnonymousClass1 anonymousClass1) {
            }
        }

        public /* synthetic */ ToStringHelper(String str, AnonymousClass1 anonymousClass1) {
        }

        private ValueHolder addHolder() {
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, @NullableDecl Object obj) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(@NullableDecl Object obj) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper omitNullValues() {
        }

        public String toString() {
        }

        private ToStringHelper(String str) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, boolean z) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(boolean z) {
        }

        private ToStringHelper addHolder(@NullableDecl Object obj) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, char c) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(char c) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, double d2) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(double d2) {
        }

        private ToStringHelper addHolder(String str, @NullableDecl Object obj) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, float f2) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(float f2) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, int i2) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(int i2) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, long j2) {
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(long j2) {
        }
    }

    private MoreObjects() {
    }

    public static <T> T firstNonNull(@NullableDecl T t, @NullableDecl T t2) {
    }

    public static ToStringHelper toStringHelper(Object obj) {
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
    }

    public static ToStringHelper toStringHelper(String str) {
    }
}
