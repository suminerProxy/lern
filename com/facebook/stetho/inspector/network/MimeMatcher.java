package com.facebook.stetho.inspector.network;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MimeMatcher<T> {
    private final ArrayList<MimeMatcher<T>.MimeMatcherRule> mRuleMap;

    /* JADX WARN: Field signature parse error: mResultIfMatched
    jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TT at position 1 ('T'), unexpected: T
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
    	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
     */
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class MimeMatcherRule {
        private final boolean mHasWildcard;
        private final String mMatchPrefix;
        private final Object mResultIfMatched;
        public final /* synthetic */ MimeMatcher this$0;

        public MimeMatcherRule(MimeMatcher mimeMatcher, String str, T t) {
        }

        public T getResultIfMatched() {
        }

        public boolean match(String str) {
        }
    }

    public void addRule(String str, T t) {
    }

    public void clear() {
    }

    @Nullable
    public T match(String str) {
    }
}
