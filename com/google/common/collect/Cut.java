package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.lang.Comparable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {
    private static final long serialVersionUID = 0;
    @NullableDecl
    public final C endpoint;

    /* renamed from: com.google.common.collect.Cut$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AboveAll extends Cut<Comparable<?>> {
        private static final AboveAll INSTANCE = null;
        private static final long serialVersionUID = 0;

        private AboveAll() {
        }

        public static /* synthetic */ AboveAll access$100() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.collect.Cut
        public int compareTo(Cut<Comparable<?>> cut) {
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        }

        @Override // com.google.common.collect.Cut
        public void describeAsLowerBound(StringBuilder sb) {
        }

        @Override // com.google.common.collect.Cut
        public void describeAsUpperBound(StringBuilder sb) {
        }

        @Override // com.google.common.collect.Cut
        public Comparable<?> endpoint() {
        }

        @Override // com.google.common.collect.Cut
        public Comparable<?> greatestValueBelow(DiscreteDomain<Comparable<?>> discreteDomain) {
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
        }

        @Override // com.google.common.collect.Cut
        public boolean isLessThan(Comparable<?> comparable) {
        }

        @Override // com.google.common.collect.Cut
        public Comparable<?> leastValueAbove(DiscreteDomain<Comparable<?>> discreteDomain) {
        }

        public String toString() {
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsLowerBound() {
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsUpperBound() {
        }

        @Override // com.google.common.collect.Cut
        public Cut<Comparable<?>> withLowerBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
        }

        @Override // com.google.common.collect.Cut
        public Cut<Comparable<?>> withUpperBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AboveValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        public AboveValue(C c) {
        }

        @Override // com.google.common.collect.Cut
        public Cut<C> canonical(DiscreteDomain<C> discreteDomain) {
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        }

        @Override // com.google.common.collect.Cut
        public void describeAsLowerBound(StringBuilder sb) {
        }

        @Override // com.google.common.collect.Cut
        public void describeAsUpperBound(StringBuilder sb) {
        }

        @Override // com.google.common.collect.Cut
        public C greatestValueBelow(DiscreteDomain<C> discreteDomain) {
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
        }

        @Override // com.google.common.collect.Cut
        public boolean isLessThan(C c) {
        }

        @Override // com.google.common.collect.Cut
        public C leastValueAbove(DiscreteDomain<C> discreteDomain) {
        }

        public String toString() {
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsLowerBound() {
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsUpperBound() {
        }

        @Override // com.google.common.collect.Cut
        public Cut<C> withLowerBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
        }

        @Override // com.google.common.collect.Cut
        public Cut<C> withUpperBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class BelowAll extends Cut<Comparable<?>> {
        private static final BelowAll INSTANCE = null;
        private static final long serialVersionUID = 0;

        private BelowAll() {
        }

        public static /* synthetic */ BelowAll access$000() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.collect.Cut
        public Cut<Comparable<?>> canonical(DiscreteDomain<Comparable<?>> discreteDomain) {
        }

        @Override // com.google.common.collect.Cut
        public int compareTo(Cut<Comparable<?>> cut) {
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        }

        @Override // com.google.common.collect.Cut
        public void describeAsLowerBound(StringBuilder sb) {
        }

        @Override // com.google.common.collect.Cut
        public void describeAsUpperBound(StringBuilder sb) {
        }

        @Override // com.google.common.collect.Cut
        public Comparable<?> endpoint() {
        }

        @Override // com.google.common.collect.Cut
        public Comparable<?> greatestValueBelow(DiscreteDomain<Comparable<?>> discreteDomain) {
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
        }

        @Override // com.google.common.collect.Cut
        public boolean isLessThan(Comparable<?> comparable) {
        }

        @Override // com.google.common.collect.Cut
        public Comparable<?> leastValueAbove(DiscreteDomain<Comparable<?>> discreteDomain) {
        }

        public String toString() {
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsLowerBound() {
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsUpperBound() {
        }

        @Override // com.google.common.collect.Cut
        public Cut<Comparable<?>> withLowerBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
        }

        @Override // com.google.common.collect.Cut
        public Cut<Comparable<?>> withUpperBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class BelowValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        public BelowValue(C c) {
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        }

        @Override // com.google.common.collect.Cut
        public void describeAsLowerBound(StringBuilder sb) {
        }

        @Override // com.google.common.collect.Cut
        public void describeAsUpperBound(StringBuilder sb) {
        }

        @Override // com.google.common.collect.Cut
        public C greatestValueBelow(DiscreteDomain<C> discreteDomain) {
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
        }

        @Override // com.google.common.collect.Cut
        public boolean isLessThan(C c) {
        }

        @Override // com.google.common.collect.Cut
        public C leastValueAbove(DiscreteDomain<C> discreteDomain) {
        }

        public String toString() {
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsLowerBound() {
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsUpperBound() {
        }

        @Override // com.google.common.collect.Cut
        public Cut<C> withLowerBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
        }

        @Override // com.google.common.collect.Cut
        public Cut<C> withUpperBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
        }
    }

    public Cut(@NullableDecl C c) {
    }

    public static <C extends Comparable> Cut<C> aboveAll() {
    }

    public static <C extends Comparable> Cut<C> aboveValue(C c) {
    }

    public static <C extends Comparable> Cut<C> belowAll() {
    }

    public static <C extends Comparable> Cut<C> belowValue(C c) {
    }

    public Cut<C> canonical(DiscreteDomain<C> discreteDomain) {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
    }

    public abstract void describeAsLowerBound(StringBuilder sb);

    public abstract void describeAsUpperBound(StringBuilder sb);

    public C endpoint() {
    }

    public boolean equals(Object obj) {
    }

    public abstract C greatestValueBelow(DiscreteDomain<C> discreteDomain);

    public abstract int hashCode();

    public abstract boolean isLessThan(C c);

    public abstract C leastValueAbove(DiscreteDomain<C> discreteDomain);

    public abstract BoundType typeAsLowerBound();

    public abstract BoundType typeAsUpperBound();

    public abstract Cut<C> withLowerBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain);

    public abstract Cut<C> withUpperBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain);

    public int compareTo(Cut<C> cut) {
    }
}
