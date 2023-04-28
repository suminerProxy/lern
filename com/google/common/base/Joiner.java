package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Joiner {
    private final String separator;

    /* renamed from: com.google.common.base.Joiner$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends Joiner {
        public final /* synthetic */ Joiner this$0;
        public final /* synthetic */ String val$nullText;

        public AnonymousClass1(Joiner joiner, Joiner joiner2, String str) {
        }

        @Override // com.google.common.base.Joiner
        public Joiner skipNulls() {
        }

        @Override // com.google.common.base.Joiner
        public CharSequence toString(@NullableDecl Object obj) {
        }

        @Override // com.google.common.base.Joiner
        public Joiner useForNull(String str) {
        }
    }

    /* renamed from: com.google.common.base.Joiner$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends Joiner {
        public final /* synthetic */ Joiner this$0;

        public AnonymousClass2(Joiner joiner, Joiner joiner2) {
        }

        @Override // com.google.common.base.Joiner
        public <A extends Appendable> A appendTo(A a2, Iterator<?> it) throws IOException {
        }

        @Override // com.google.common.base.Joiner
        public Joiner useForNull(String str) {
        }

        @Override // com.google.common.base.Joiner
        public MapJoiner withKeyValueSeparator(String str) {
        }
    }

    /* renamed from: com.google.common.base.Joiner$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 extends AbstractList<Object> {
        public final /* synthetic */ Object val$first;
        public final /* synthetic */ Object[] val$rest;
        public final /* synthetic */ Object val$second;

        public AnonymousClass3(Object[] objArr, Object obj, Object obj2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MapJoiner {
        private final Joiner joiner;
        private final String keyValueSeparator;

        public /* synthetic */ MapJoiner(Joiner joiner, String str, AnonymousClass1 anonymousClass1) {
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a2, Map<?, ?> map) throws IOException {
        }

        public String join(Map<?, ?> map) {
        }

        public MapJoiner useForNull(String str) {
        }

        private MapJoiner(Joiner joiner, String str) {
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb, Map<?, ?> map) {
        }

        @Beta
        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
        }

        @CanIgnoreReturnValue
        @Beta
        public <A extends Appendable> A appendTo(A a2, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
        }

        @Beta
        public String join(Iterator<? extends Map.Entry<?, ?>> it) {
        }

        @CanIgnoreReturnValue
        @Beta
        public <A extends Appendable> A appendTo(A a2, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
        }

        @CanIgnoreReturnValue
        @Beta
        public StringBuilder appendTo(StringBuilder sb, Iterable<? extends Map.Entry<?, ?>> iterable) {
        }

        @CanIgnoreReturnValue
        @Beta
        public StringBuilder appendTo(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
        }
    }

    public /* synthetic */ Joiner(Joiner joiner, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ String access$100(Joiner joiner) {
    }

    private static Iterable<Object> iterable(Object obj, Object obj2, Object[] objArr) {
    }

    public static Joiner on(String str) {
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a2, Iterable<?> iterable) throws IOException {
    }

    public final String join(Iterable<?> iterable) {
    }

    public Joiner skipNulls() {
    }

    public CharSequence toString(Object obj) {
    }

    public Joiner useForNull(String str) {
    }

    public MapJoiner withKeyValueSeparator(char c) {
    }

    private Joiner(String str) {
    }

    public static Joiner on(char c) {
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a2, Iterator<?> it) throws IOException {
    }

    public final String join(Iterator<?> it) {
    }

    public MapJoiner withKeyValueSeparator(String str) {
    }

    public final String join(Object[] objArr) {
    }

    private Joiner(Joiner joiner) {
    }

    public final String join(@NullableDecl Object obj, @NullableDecl Object obj2, Object... objArr) {
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a2, Object[] objArr) throws IOException {
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a2, @NullableDecl Object obj, @NullableDecl Object obj2, Object... objArr) throws IOException {
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Iterable<?> iterable) {
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Iterator<?> it) {
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Object[] objArr) {
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, @NullableDecl Object obj, @NullableDecl Object obj2, Object... objArr) {
    }
}
