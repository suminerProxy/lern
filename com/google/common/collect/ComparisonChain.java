package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ComparisonChain {
    private static final ComparisonChain ACTIVE = null;
    private static final ComparisonChain GREATER = null;
    private static final ComparisonChain LESS = null;

    /* renamed from: com.google.common.collect.ComparisonChain$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends ComparisonChain {
        public ComparisonChain classify(int i2) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable comparable, Comparable comparable2) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z, boolean z2) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z, boolean z2) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i2, int i3) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j2, long j3) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f2, float f3) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d2, double d3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InactiveComparisonChain extends ComparisonChain {
        public final int result;

        public InactiveComparisonChain(int i2) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d2, double d3) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f2, float f3) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i2, int i3) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j2, long j3) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(@NullableDecl Comparable comparable, @NullableDecl Comparable comparable2) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@NullableDecl T t, @NullableDecl T t2, @NullableDecl Comparator<T> comparator) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z, boolean z2) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z, boolean z2) {
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
        }
    }

    public /* synthetic */ ComparisonChain(AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ ComparisonChain access$100() {
    }

    public static /* synthetic */ ComparisonChain access$200() {
    }

    public static /* synthetic */ ComparisonChain access$300() {
    }

    public static ComparisonChain start() {
    }

    public abstract ComparisonChain compare(double d2, double d3);

    public abstract ComparisonChain compare(float f2, float f3);

    public abstract ComparisonChain compare(int i2, int i3);

    public abstract ComparisonChain compare(long j2, long j3);

    @Deprecated
    public final ComparisonChain compare(Boolean bool, Boolean bool2) {
    }

    public abstract ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> ComparisonChain compare(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator);

    public abstract ComparisonChain compareFalseFirst(boolean z, boolean z2);

    public abstract ComparisonChain compareTrueFirst(boolean z, boolean z2);

    public abstract int result();

    private ComparisonChain() {
    }
}
