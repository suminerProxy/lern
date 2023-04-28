package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final Strategy strategy;
    private final CharMatcher trimmer;

    /* renamed from: com.google.common.base.Splitter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Strategy {
        public final /* synthetic */ CharMatcher val$separatorMatcher;

        /* renamed from: com.google.common.base.Splitter$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C00631 extends SplittingIterator {
            public final /* synthetic */ AnonymousClass1 this$0;

            public C00631(AnonymousClass1 anonymousClass1, Splitter splitter, CharSequence charSequence) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int i2) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int i2) {
            }
        }

        public AnonymousClass1(CharMatcher charMatcher) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public /* bridge */ /* synthetic */ Iterator iterator(Splitter splitter, CharSequence charSequence) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
        }
    }

    /* renamed from: com.google.common.base.Splitter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements Strategy {
        public final /* synthetic */ String val$separator;

        /* renamed from: com.google.common.base.Splitter$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends SplittingIterator {
            public final /* synthetic */ AnonymousClass2 this$0;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, Splitter splitter, CharSequence charSequence) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int i2) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int i2) {
            }
        }

        public AnonymousClass2(String str) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public /* bridge */ /* synthetic */ Iterator iterator(Splitter splitter, CharSequence charSequence) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
        }
    }

    /* renamed from: com.google.common.base.Splitter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 implements Strategy {
        public final /* synthetic */ CommonPattern val$separatorPattern;

        /* renamed from: com.google.common.base.Splitter$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends SplittingIterator {
            public final /* synthetic */ AnonymousClass3 this$0;
            public final /* synthetic */ CommonMatcher val$matcher;

            public AnonymousClass1(AnonymousClass3 anonymousClass3, Splitter splitter, CharSequence charSequence, CommonMatcher commonMatcher) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int i2) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int i2) {
            }
        }

        public AnonymousClass3(CommonPattern commonPattern) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public /* bridge */ /* synthetic */ Iterator iterator(Splitter splitter, CharSequence charSequence) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
        }
    }

    /* renamed from: com.google.common.base.Splitter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4 implements Strategy {
        public final /* synthetic */ int val$length;

        /* renamed from: com.google.common.base.Splitter$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends SplittingIterator {
            public final /* synthetic */ AnonymousClass4 this$0;

            public AnonymousClass1(AnonymousClass4 anonymousClass4, Splitter splitter, CharSequence charSequence) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int i2) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int i2) {
            }
        }

        public AnonymousClass4(int i2) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public /* bridge */ /* synthetic */ Iterator iterator(Splitter splitter, CharSequence charSequence) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
        }
    }

    /* renamed from: com.google.common.base.Splitter$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 implements Iterable<String> {
        public final /* synthetic */ Splitter this$0;
        public final /* synthetic */ CharSequence val$sequence;

        public AnonymousClass5(Splitter splitter, CharSequence charSequence) {
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
        }

        public String toString() {
        }
    }

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MapSplitter {
        private static final String INVALID_ENTRY_MESSAGE = "Chunk [%s] is not a valid entry";
        private final Splitter entrySplitter;
        private final Splitter outerSplitter;

        public /* synthetic */ MapSplitter(Splitter splitter, Splitter splitter2, AnonymousClass1 anonymousClass1) {
        }

        public Map<String, String> split(CharSequence charSequence) {
        }

        private MapSplitter(Splitter splitter, Splitter splitter2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class SplittingIterator extends AbstractIterator<String> {
        public int limit;
        public int offset;
        public final boolean omitEmptyStrings;
        public final CharSequence toSplit;
        public final CharMatcher trimmer;

        public SplittingIterator(Splitter splitter, CharSequence charSequence) {
        }

        @Override // com.google.common.base.AbstractIterator
        public /* bridge */ /* synthetic */ String computeNext() {
        }

        public abstract int separatorEnd(int i2);

        public abstract int separatorStart(int i2);

        @Override // com.google.common.base.AbstractIterator
        /* renamed from: computeNext  reason: avoid collision after fix types in other method */
        public String computeNext2() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Strategy {
        Iterator<String> iterator(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(Strategy strategy) {
    }

    public static /* synthetic */ Iterator access$000(Splitter splitter, CharSequence charSequence) {
    }

    public static /* synthetic */ CharMatcher access$200(Splitter splitter) {
    }

    public static /* synthetic */ boolean access$300(Splitter splitter) {
    }

    public static /* synthetic */ int access$400(Splitter splitter) {
    }

    public static Splitter fixedLength(int i2) {
    }

    public static Splitter on(char c) {
    }

    @GwtIncompatible
    public static Splitter onPattern(String str) {
    }

    private Iterator<String> splittingIterator(CharSequence charSequence) {
    }

    public Splitter limit(int i2) {
    }

    public Splitter omitEmptyStrings() {
    }

    public Iterable<String> split(CharSequence charSequence) {
    }

    public List<String> splitToList(CharSequence charSequence) {
    }

    public Splitter trimResults() {
    }

    @Beta
    public MapSplitter withKeyValueSeparator(String str) {
    }

    private Splitter(Strategy strategy, boolean z, CharMatcher charMatcher, int i2) {
    }

    public static Splitter on(CharMatcher charMatcher) {
    }

    public Splitter trimResults(CharMatcher charMatcher) {
    }

    @Beta
    public MapSplitter withKeyValueSeparator(char c) {
    }

    @Beta
    public MapSplitter withKeyValueSeparator(Splitter splitter) {
    }

    public static Splitter on(String str) {
    }

    @GwtIncompatible
    public static Splitter on(Pattern pattern) {
    }

    private static Splitter on(CommonPattern commonPattern) {
    }
}
