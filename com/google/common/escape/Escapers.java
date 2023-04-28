package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Escapers {
    private static final Escaper NULL_ESCAPER = null;

    /* renamed from: com.google.common.escape.Escapers$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends CharEscaper {
        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
        }

        @Override // com.google.common.escape.CharEscaper
        public char[] escape(char c) {
        }
    }

    /* renamed from: com.google.common.escape.Escapers$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 extends UnicodeEscaper {
        public final /* synthetic */ CharEscaper val$escaper;

        public AnonymousClass2(CharEscaper charEscaper) {
        }

        @Override // com.google.common.escape.UnicodeEscaper
        public char[] escape(int i2) {
        }
    }

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private final Map<Character, String> replacementMap;
        private char safeMax;
        private char safeMin;
        private String unsafeReplacement;

        /* renamed from: com.google.common.escape.Escapers$Builder$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends ArrayBasedCharEscaper {
            private final char[] replacementChars;
            public final /* synthetic */ Builder this$0;

            public AnonymousClass1(Builder builder, Map map, char c, char c2) {
            }

            @Override // com.google.common.escape.ArrayBasedCharEscaper
            public char[] escapeUnsafe(char c) {
            }
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ String access$100(Builder builder) {
        }

        @CanIgnoreReturnValue
        public Builder addEscape(char c, String str) {
        }

        public Escaper build() {
        }

        @CanIgnoreReturnValue
        public Builder setSafeRange(char c, char c2) {
        }

        @CanIgnoreReturnValue
        public Builder setUnsafeReplacement(@NullableDecl String str) {
        }

        private Builder() {
        }
    }

    private Escapers() {
    }

    public static UnicodeEscaper asUnicodeEscaper(Escaper escaper) {
    }

    public static Builder builder() {
    }

    public static String computeReplacement(CharEscaper charEscaper, char c) {
    }

    public static Escaper nullEscaper() {
    }

    private static String stringOrNull(char[] cArr) {
    }

    private static UnicodeEscaper wrap(CharEscaper charEscaper) {
    }

    public static String computeReplacement(UnicodeEscaper unicodeEscaper, int i2) {
    }
}
