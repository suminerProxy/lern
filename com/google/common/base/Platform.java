package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.ServiceConfigurationError;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Platform {
    private static final Logger logger = null;
    private static final PatternCompiler patternCompiler = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class JdkPatternCompiler implements PatternCompiler {
        private JdkPatternCompiler() {
        }

        @Override // com.google.common.base.PatternCompiler
        public CommonPattern compile(String str) {
        }

        @Override // com.google.common.base.PatternCompiler
        public boolean isPcreLike() {
        }

        public /* synthetic */ JdkPatternCompiler(AnonymousClass1 anonymousClass1) {
        }
    }

    private Platform() {
    }

    public static CommonPattern compilePattern(String str) {
    }

    public static String emptyToNull(@NullableDecl String str) {
    }

    public static String formatCompact4Digits(double d2) {
    }

    public static <T extends Enum<T>> Optional<T> getEnumIfPresent(Class<T> cls, String str) {
    }

    private static PatternCompiler loadPatternCompiler() {
    }

    private static void logPatternCompilerError(ServiceConfigurationError serviceConfigurationError) {
    }

    public static String nullToEmpty(@NullableDecl String str) {
    }

    public static boolean patternCompilerIsPcreLike() {
    }

    public static CharMatcher precomputeCharMatcher(CharMatcher charMatcher) {
    }

    public static boolean stringIsNullOrEmpty(@NullableDecl String str) {
    }

    public static long systemNanoTime() {
    }
}
