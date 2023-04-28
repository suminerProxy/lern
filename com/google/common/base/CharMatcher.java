package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.BitSet;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class CharMatcher implements Predicate<Character> {
    private static final int DISTINCT_CHARS = 65536;

    /* renamed from: com.google.common.base.CharMatcher$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends NegatedFastMatcher {
        public final /* synthetic */ CharMatcher this$0;
        public final /* synthetic */ String val$description;

        public AnonymousClass1(CharMatcher charMatcher, CharMatcher charMatcher2, String str) {
        }

        @Override // com.google.common.base.CharMatcher.Negated, com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class And extends CharMatcher {
        public final CharMatcher first;
        public final CharMatcher second;

        public And(CharMatcher charMatcher, CharMatcher charMatcher2) {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Any extends NamedFastMatcher {
        public static final Any INSTANCE = null;

        private Any() {
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
        }

        @Override // com.google.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i2) {
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AnyOf extends CharMatcher {
        private final char[] chars;

        public AnyOf(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Ascii extends NamedFastMatcher {
        public static final Ascii INSTANCE = null;

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class BitSetMatcher extends NamedFastMatcher {
        private final BitSet table;

        public /* synthetic */ BitSetMatcher(BitSet bitSet, String str, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
        }

        private BitSetMatcher(BitSet bitSet, String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class BreakingWhitespace extends CharMatcher {
        public static final CharMatcher INSTANCE = null;

        private BreakingWhitespace() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Digit extends RangesMatcher {
        public static final Digit INSTANCE = null;
        private static final String ZEROES = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";

        private Digit() {
        }

        private static char[] nines() {
        }

        private static char[] zeroes() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class FastMatcher extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher precomputed() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ForPredicate extends CharMatcher {
        private final Predicate<? super Character> predicate;

        public ForPredicate(Predicate<? super Character> predicate) {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.CharMatcher
        public boolean apply(Character ch) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InRange extends FastMatcher {
        private final char endInclusive;
        private final char startInclusive;

        public InRange(char c, char c2) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Invisible extends RangesMatcher {
        public static final Invisible INSTANCE = null;
        private static final String RANGE_ENDS = "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb";
        private static final String RANGE_STARTS = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9";

        private Invisible() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Is extends FastMatcher {
        private final char match;

        public Is(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class IsEither extends FastMatcher {
        private final char match1;
        private final char match2;

        public IsEither(char c, char c2) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class IsNot extends FastMatcher {
        private final char match;

        public IsNot(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class JavaDigit extends CharMatcher {
        public static final JavaDigit INSTANCE = null;

        private JavaDigit() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class JavaIsoControl extends NamedFastMatcher {
        public static final JavaIsoControl INSTANCE = null;

        private JavaIsoControl() {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class JavaLetter extends CharMatcher {
        public static final JavaLetter INSTANCE = null;

        private JavaLetter() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class JavaLetterOrDigit extends CharMatcher {
        public static final JavaLetterOrDigit INSTANCE = null;

        private JavaLetterOrDigit() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class JavaLowerCase extends CharMatcher {
        public static final JavaLowerCase INSTANCE = null;

        private JavaLowerCase() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class JavaUpperCase extends CharMatcher {
        public static final JavaUpperCase INSTANCE = null;

        private JavaUpperCase() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class NamedFastMatcher extends FastMatcher {
        private final String description;

        public NamedFastMatcher(String str) {
        }

        @Override // com.google.common.base.CharMatcher
        public final String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Negated extends CharMatcher {
        public final CharMatcher original;

        public Negated(CharMatcher charMatcher) {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class NegatedFastMatcher extends Negated {
        public NegatedFastMatcher(CharMatcher charMatcher) {
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher precomputed() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class None extends NamedFastMatcher {
        public static final None INSTANCE = null;

        private None() {
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
        }

        @Override // com.google.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public String trimLeadingFrom(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public String trimTrailingFrom(CharSequence charSequence) {
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i2) {
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Or extends CharMatcher {
        public final CharMatcher first;
        public final CharMatcher second;

        public Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class RangesMatcher extends CharMatcher {
        private final String description;
        private final char[] rangeEnds;
        private final char[] rangeStarts;

        public RangesMatcher(String str, char[] cArr, char[] cArr2) {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SingleWidth extends RangesMatcher {
        public static final SingleWidth INSTANCE = null;

        private SingleWidth() {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Whitespace extends NamedFastMatcher {
        public static final Whitespace INSTANCE = null;
        public static final int MULTIPLIER = 1682554634;
        public static final int SHIFT = 0;
        public static final String TABLE = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000";

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
        }
    }

    public static /* synthetic */ String access$100(char c) {
    }

    public static CharMatcher any() {
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
    }

    public static CharMatcher ascii() {
    }

    public static CharMatcher breakingWhitespace() {
    }

    @Deprecated
    public static CharMatcher digit() {
    }

    private String finishCollapseFrom(CharSequence charSequence, int i2, int i3, char c, StringBuilder sb, boolean z) {
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
    }

    public static CharMatcher inRange(char c, char c2) {
    }

    @Deprecated
    public static CharMatcher invisible() {
    }

    public static CharMatcher is(char c) {
    }

    private static IsEither isEither(char c, char c2) {
    }

    public static CharMatcher isNot(char c) {
    }

    @GwtIncompatible
    private static boolean isSmall(int i2, int i3) {
    }

    @Deprecated
    public static CharMatcher javaDigit() {
    }

    public static CharMatcher javaIsoControl() {
    }

    @Deprecated
    public static CharMatcher javaLetter() {
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
    }

    public static CharMatcher none() {
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
    }

    @GwtIncompatible
    private static CharMatcher precomputedPositive(int i2, BitSet bitSet, String str) {
    }

    private static String showCharacter(char c) {
    }

    @Deprecated
    public static CharMatcher singleWidth() {
    }

    public static CharMatcher whitespace() {
    }

    public CharMatcher and(CharMatcher charMatcher) {
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public /* bridge */ /* synthetic */ boolean apply(Character ch) {
    }

    public String collapseFrom(CharSequence charSequence, char c) {
    }

    public int countIn(CharSequence charSequence) {
    }

    public int indexIn(CharSequence charSequence) {
    }

    public int lastIndexIn(CharSequence charSequence) {
    }

    public abstract boolean matches(char c);

    public boolean matchesAllOf(CharSequence charSequence) {
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
    }

    public CharMatcher negate() {
    }

    public CharMatcher or(CharMatcher charMatcher) {
    }

    public CharMatcher precomputed() {
    }

    @GwtIncompatible
    public CharMatcher precomputedInternal() {
    }

    public String removeFrom(CharSequence charSequence) {
    }

    public String replaceFrom(CharSequence charSequence, char c) {
    }

    public String retainFrom(CharSequence charSequence) {
    }

    @GwtIncompatible
    public void setBits(BitSet bitSet) {
    }

    public String toString() {
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c) {
    }

    public String trimFrom(CharSequence charSequence) {
    }

    public String trimLeadingFrom(CharSequence charSequence) {
    }

    public String trimTrailingFrom(CharSequence charSequence) {
    }

    @Deprecated
    /* renamed from: apply  reason: avoid collision after fix types in other method */
    public boolean apply2(Character ch) {
    }

    public int indexIn(CharSequence charSequence, int i2) {
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
    }
}
