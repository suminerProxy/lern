package org.jsoup.parser;

import org.jsoup.nodes.Attributes;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class Token {
    public TokenType type;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class CData extends Character {
        public CData(String str) {
        }

        @Override // org.jsoup.parser.Token.Character
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class Character extends Token {
        private String data;

        public Character data(String str) {
        }

        public String getData() {
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Comment extends Token {
        public boolean bogus;
        public final StringBuilder data;

        public String getData() {
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Doctype extends Token {
        public boolean forceQuirks;
        public final StringBuilder name;
        public String pubSysKey;
        public final StringBuilder publicIdentifier;
        public final StringBuilder systemIdentifier;

        public String getName() {
        }

        public String getPubSysKey() {
        }

        public String getPublicIdentifier() {
        }

        public String getSystemIdentifier() {
        }

        public boolean isForceQuirks() {
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class EOF extends Token {
        @Override // org.jsoup.parser.Token
        public Token reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class EndTag extends Tag {
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class StartTag extends Tag {
        public StartTag nameAttr(String str, Attributes attributes) {
        }

        @Override // org.jsoup.parser.Token.Tag, org.jsoup.parser.Token
        public /* bridge */ /* synthetic */ Token reset() {
        }

        public String toString() {
        }

        @Override // org.jsoup.parser.Token.Tag, org.jsoup.parser.Token
        public Tag reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class Tag extends Token {
        public Attributes attributes;
        private boolean hasEmptyAttributeValue;
        private boolean hasPendingAttributeValue;
        public String normalName;
        private String pendingAttributeName;
        private StringBuilder pendingAttributeValue;
        private String pendingAttributeValueS;
        public boolean selfClosing;
        public String tagName;

        private void ensureAttributeValue() {
        }

        public final void appendAttributeName(String str) {
        }

        public final void appendAttributeValue(String str) {
        }

        public final void appendTagName(String str) {
        }

        public final void finaliseTag() {
        }

        public final Attributes getAttributes() {
        }

        public final boolean isSelfClosing() {
        }

        public final String name() {
        }

        public final void newAttribute() {
        }

        public final String normalName() {
        }

        @Override // org.jsoup.parser.Token
        public /* bridge */ /* synthetic */ Token reset() {
        }

        public final void setEmptyAttributeValue() {
        }

        public final void appendAttributeName(char c) {
        }

        @Override // org.jsoup.parser.Token
        public Tag reset() {
        }

        public final void appendTagName(char c) {
        }

        public final Tag name(String str) {
        }

        public final void appendAttributeValue(char c) {
        }

        public final void appendAttributeValue(char[] cArr) {
        }

        public final void appendAttributeValue(int[] iArr) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class TokenType {
        private static final /* synthetic */ TokenType[] $VALUES = null;
        public static final TokenType Character = null;
        public static final TokenType Comment = null;
        public static final TokenType Doctype = null;
        public static final TokenType EOF = null;
        public static final TokenType EndTag = null;
        public static final TokenType StartTag = null;

        private TokenType(String str, int i2) {
        }

        public static TokenType valueOf(String str) {
        }

        public static TokenType[] values() {
        }
    }

    public /* synthetic */ Token(AnonymousClass1 anonymousClass1) {
    }

    public static void reset(StringBuilder sb) {
    }

    public final Character asCharacter() {
    }

    public final Comment asComment() {
    }

    public final Doctype asDoctype() {
    }

    public final EndTag asEndTag() {
    }

    public final StartTag asStartTag() {
    }

    public final boolean isCData() {
    }

    public final boolean isCharacter() {
    }

    public final boolean isComment() {
    }

    public final boolean isDoctype() {
    }

    public final boolean isEOF() {
    }

    public final boolean isEndTag() {
    }

    public final boolean isStartTag() {
    }

    public abstract Token reset();

    public String tokenType() {
    }

    private Token() {
    }
}
