package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class CaseFormat {
    private static final /* synthetic */ CaseFormat[] $VALUES = null;
    public static final CaseFormat LOWER_CAMEL = null;
    public static final CaseFormat LOWER_HYPHEN = null;
    public static final CaseFormat LOWER_UNDERSCORE = null;
    public static final CaseFormat UPPER_CAMEL = null;
    public static final CaseFormat UPPER_UNDERSCORE = null;
    private final CharMatcher wordBoundary;
    private final String wordSeparator;

    /* renamed from: com.google.common.base.CaseFormat$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum AnonymousClass1 extends CaseFormat {
        public AnonymousClass1(String str, int i2, CharMatcher charMatcher, String str2) {
        }

        @Override // com.google.common.base.CaseFormat
        public String convert(CaseFormat caseFormat, String str) {
        }

        @Override // com.google.common.base.CaseFormat
        public String normalizeWord(String str) {
        }
    }

    /* renamed from: com.google.common.base.CaseFormat$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum AnonymousClass2 extends CaseFormat {
        public AnonymousClass2(String str, int i2, CharMatcher charMatcher, String str2) {
        }

        @Override // com.google.common.base.CaseFormat
        public String convert(CaseFormat caseFormat, String str) {
        }

        @Override // com.google.common.base.CaseFormat
        public String normalizeWord(String str) {
        }
    }

    /* renamed from: com.google.common.base.CaseFormat$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum AnonymousClass3 extends CaseFormat {
        public AnonymousClass3(String str, int i2, CharMatcher charMatcher, String str2) {
        }

        @Override // com.google.common.base.CaseFormat
        public String normalizeWord(String str) {
        }
    }

    /* renamed from: com.google.common.base.CaseFormat$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum AnonymousClass4 extends CaseFormat {
        public AnonymousClass4(String str, int i2, CharMatcher charMatcher, String str2) {
        }

        @Override // com.google.common.base.CaseFormat
        public String normalizeWord(String str) {
        }
    }

    /* renamed from: com.google.common.base.CaseFormat$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum AnonymousClass5 extends CaseFormat {
        public AnonymousClass5(String str, int i2, CharMatcher charMatcher, String str2) {
        }

        @Override // com.google.common.base.CaseFormat
        public String convert(CaseFormat caseFormat, String str) {
        }

        @Override // com.google.common.base.CaseFormat
        public String normalizeWord(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StringConverter extends Converter<String, String> implements Serializable {
        private static final long serialVersionUID = 0;
        private final CaseFormat sourceFormat;
        private final CaseFormat targetFormat;

        public StringConverter(CaseFormat caseFormat, CaseFormat caseFormat2) {
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ String doBackward(String str) {
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ String doForward(String str) {
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        /* renamed from: doBackward  reason: avoid collision after fix types in other method */
        public String doBackward2(String str) {
        }

        /* renamed from: doForward  reason: avoid collision after fix types in other method */
        public String doForward2(String str) {
        }
    }

    public /* synthetic */ CaseFormat(String str, int i2, CharMatcher charMatcher, String str2, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ String access$100(String str) {
    }

    private static String firstCharOnlyToUpper(String str) {
    }

    private String normalizeFirstWord(String str) {
    }

    public static CaseFormat valueOf(String str) {
    }

    public static CaseFormat[] values() {
    }

    public String convert(CaseFormat caseFormat, String str) {
    }

    public Converter<String, String> converterTo(CaseFormat caseFormat) {
    }

    public abstract String normalizeWord(String str);

    public final String to(CaseFormat caseFormat, String str) {
    }

    private CaseFormat(String str, int i2, CharMatcher charMatcher, String str2) {
    }
}
