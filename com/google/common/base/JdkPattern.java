package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class JdkPattern extends CommonPattern implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern pattern;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class JdkMatcher extends CommonMatcher {
        public final Matcher matcher;

        public JdkMatcher(Matcher matcher) {
        }

        @Override // com.google.common.base.CommonMatcher
        public int end() {
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean find() {
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean matches() {
        }

        @Override // com.google.common.base.CommonMatcher
        public String replaceAll(String str) {
        }

        @Override // com.google.common.base.CommonMatcher
        public int start() {
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean find(int i2) {
        }
    }

    public JdkPattern(Pattern pattern) {
    }

    @Override // com.google.common.base.CommonPattern
    public int flags() {
    }

    @Override // com.google.common.base.CommonPattern
    public CommonMatcher matcher(CharSequence charSequence) {
    }

    @Override // com.google.common.base.CommonPattern
    public String pattern() {
    }

    @Override // com.google.common.base.CommonPattern
    public String toString() {
    }
}
