package org.jsoup.parser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class TokeniserState {
    private static final /* synthetic */ TokeniserState[] $VALUES = null;
    public static final TokeniserState AfterAttributeName = null;
    public static final TokeniserState AfterAttributeValue_quoted = null;
    public static final TokeniserState AfterDoctypeName = null;
    public static final TokeniserState AfterDoctypePublicIdentifier = null;
    public static final TokeniserState AfterDoctypePublicKeyword = null;
    public static final TokeniserState AfterDoctypeSystemIdentifier = null;
    public static final TokeniserState AfterDoctypeSystemKeyword = null;
    public static final TokeniserState AttributeName = null;
    public static final TokeniserState AttributeValue_doubleQuoted = null;
    public static final TokeniserState AttributeValue_singleQuoted = null;
    public static final TokeniserState AttributeValue_unquoted = null;
    public static final TokeniserState BeforeAttributeName = null;
    public static final TokeniserState BeforeAttributeValue = null;
    public static final TokeniserState BeforeDoctypeName = null;
    public static final TokeniserState BeforeDoctypePublicIdentifier = null;
    public static final TokeniserState BeforeDoctypeSystemIdentifier = null;
    public static final TokeniserState BetweenDoctypePublicAndSystemIdentifiers = null;
    public static final TokeniserState BogusComment = null;
    public static final TokeniserState BogusDoctype = null;
    public static final TokeniserState CdataSection = null;
    public static final TokeniserState CharacterReferenceInData = null;
    public static final TokeniserState CharacterReferenceInRcdata = null;
    public static final TokeniserState Comment = null;
    public static final TokeniserState CommentEnd = null;
    public static final TokeniserState CommentEndBang = null;
    public static final TokeniserState CommentEndDash = null;
    public static final TokeniserState CommentStart = null;
    public static final TokeniserState CommentStartDash = null;
    public static final TokeniserState Data = null;
    public static final TokeniserState Doctype = null;
    public static final TokeniserState DoctypeName = null;
    public static final TokeniserState DoctypePublicIdentifier_doubleQuoted = null;
    public static final TokeniserState DoctypePublicIdentifier_singleQuoted = null;
    public static final TokeniserState DoctypeSystemIdentifier_doubleQuoted = null;
    public static final TokeniserState DoctypeSystemIdentifier_singleQuoted = null;
    public static final TokeniserState EndTagOpen = null;
    public static final TokeniserState MarkupDeclarationOpen = null;
    public static final TokeniserState PLAINTEXT = null;
    public static final TokeniserState RCDATAEndTagName = null;
    public static final TokeniserState RCDATAEndTagOpen = null;
    public static final TokeniserState Rawtext = null;
    public static final TokeniserState RawtextEndTagName = null;
    public static final TokeniserState RawtextEndTagOpen = null;
    public static final TokeniserState RawtextLessthanSign = null;
    public static final TokeniserState Rcdata = null;
    public static final TokeniserState RcdataLessthanSign = null;
    public static final TokeniserState ScriptData = null;
    public static final TokeniserState ScriptDataDoubleEscapeEnd = null;
    public static final TokeniserState ScriptDataDoubleEscapeStart = null;
    public static final TokeniserState ScriptDataDoubleEscaped = null;
    public static final TokeniserState ScriptDataDoubleEscapedDash = null;
    public static final TokeniserState ScriptDataDoubleEscapedDashDash = null;
    public static final TokeniserState ScriptDataDoubleEscapedLessthanSign = null;
    public static final TokeniserState ScriptDataEndTagName = null;
    public static final TokeniserState ScriptDataEndTagOpen = null;
    public static final TokeniserState ScriptDataEscapeStart = null;
    public static final TokeniserState ScriptDataEscapeStartDash = null;
    public static final TokeniserState ScriptDataEscaped = null;
    public static final TokeniserState ScriptDataEscapedDash = null;
    public static final TokeniserState ScriptDataEscapedDashDash = null;
    public static final TokeniserState ScriptDataEscapedEndTagName = null;
    public static final TokeniserState ScriptDataEscapedEndTagOpen = null;
    public static final TokeniserState ScriptDataEscapedLessthanSign = null;
    public static final TokeniserState ScriptDataLessthanSign = null;
    public static final TokeniserState SelfClosingStartTag = null;
    public static final TokeniserState TagName = null;
    public static final TokeniserState TagOpen = null;
    public static final char[] attributeDoubleValueCharsSorted = null;
    public static final char[] attributeNameCharsSorted = null;
    public static final char[] attributeSingleValueCharsSorted = null;
    public static final char[] attributeValueUnquoted = null;
    private static final char eof = 65535;
    public static final char nullChar = 0;
    private static final char replacementChar = 65533;
    private static final String replacementStr = null;

    /* renamed from: org.jsoup.parser.TokeniserState$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass1 extends TokeniserState {
        public AnonymousClass1(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass10 extends TokeniserState {
        public AnonymousClass10(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass11 extends TokeniserState {
        public AnonymousClass11(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass12 extends TokeniserState {
        public AnonymousClass12(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass13 extends TokeniserState {
        public AnonymousClass13(String str, int i2) {
        }

        private void anythingElse(Tokeniser tokeniser, CharacterReader characterReader) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass14 extends TokeniserState {
        public AnonymousClass14(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass15 extends TokeniserState {
        public AnonymousClass15(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass16 extends TokeniserState {
        public AnonymousClass16(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass17 extends TokeniserState {
        public AnonymousClass17(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass18 extends TokeniserState {
        public AnonymousClass18(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass19 extends TokeniserState {
        public AnonymousClass19(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass2 extends TokeniserState {
        public AnonymousClass2(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass20 extends TokeniserState {
        public AnonymousClass20(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$21  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass21 extends TokeniserState {
        public AnonymousClass21(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$22  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass22 extends TokeniserState {
        public AnonymousClass22(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$23  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass23 extends TokeniserState {
        public AnonymousClass23(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$24  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass24 extends TokeniserState {
        public AnonymousClass24(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$25  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass25 extends TokeniserState {
        public AnonymousClass25(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$26  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass26 extends TokeniserState {
        public AnonymousClass26(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$27  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass27 extends TokeniserState {
        public AnonymousClass27(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$28  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass28 extends TokeniserState {
        public AnonymousClass28(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$29  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass29 extends TokeniserState {
        public AnonymousClass29(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass3 extends TokeniserState {
        public AnonymousClass3(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$30  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass30 extends TokeniserState {
        public AnonymousClass30(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$31  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass31 extends TokeniserState {
        public AnonymousClass31(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$32  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass32 extends TokeniserState {
        public AnonymousClass32(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$33  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass33 extends TokeniserState {
        public AnonymousClass33(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$34  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass34 extends TokeniserState {
        public AnonymousClass34(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$35  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass35 extends TokeniserState {
        public AnonymousClass35(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$36  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass36 extends TokeniserState {
        public AnonymousClass36(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$37  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass37 extends TokeniserState {
        public AnonymousClass37(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$38  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass38 extends TokeniserState {
        public AnonymousClass38(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$39  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass39 extends TokeniserState {
        public AnonymousClass39(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass4 extends TokeniserState {
        public AnonymousClass4(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$40  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass40 extends TokeniserState {
        public AnonymousClass40(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$41  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass41 extends TokeniserState {
        public AnonymousClass41(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$42  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass42 extends TokeniserState {
        public AnonymousClass42(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$43  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass43 extends TokeniserState {
        public AnonymousClass43(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$44  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass44 extends TokeniserState {
        public AnonymousClass44(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$45  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass45 extends TokeniserState {
        public AnonymousClass45(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$46  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass46 extends TokeniserState {
        public AnonymousClass46(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$47  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass47 extends TokeniserState {
        public AnonymousClass47(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$48  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass48 extends TokeniserState {
        public AnonymousClass48(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$49  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass49 extends TokeniserState {
        public AnonymousClass49(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass5 extends TokeniserState {
        public AnonymousClass5(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$50  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass50 extends TokeniserState {
        public AnonymousClass50(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$51  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass51 extends TokeniserState {
        public AnonymousClass51(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$52  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass52 extends TokeniserState {
        public AnonymousClass52(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$53  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass53 extends TokeniserState {
        public AnonymousClass53(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$54  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass54 extends TokeniserState {
        public AnonymousClass54(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$55  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass55 extends TokeniserState {
        public AnonymousClass55(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$56  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass56 extends TokeniserState {
        public AnonymousClass56(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$57  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass57 extends TokeniserState {
        public AnonymousClass57(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$58  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass58 extends TokeniserState {
        public AnonymousClass58(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$59  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass59 extends TokeniserState {
        public AnonymousClass59(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass6 extends TokeniserState {
        public AnonymousClass6(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$60  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass60 extends TokeniserState {
        public AnonymousClass60(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$61  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass61 extends TokeniserState {
        public AnonymousClass61(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$62  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass62 extends TokeniserState {
        public AnonymousClass62(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$63  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass63 extends TokeniserState {
        public AnonymousClass63(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$64  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass64 extends TokeniserState {
        public AnonymousClass64(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$65  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass65 extends TokeniserState {
        public AnonymousClass65(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$66  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass66 extends TokeniserState {
        public AnonymousClass66(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$67  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass67 extends TokeniserState {
        public AnonymousClass67(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass7 extends TokeniserState {
        public AnonymousClass7(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass8 extends TokeniserState {
        public AnonymousClass8(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    /* renamed from: org.jsoup.parser.TokeniserState$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public enum AnonymousClass9 extends TokeniserState {
        public AnonymousClass9(String str, int i2) {
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
        }
    }

    private TokeniserState(String str, int i2) {
    }

    public static /* synthetic */ void access$100(Tokeniser tokeniser, TokeniserState tokeniserState) {
    }

    public static /* synthetic */ void access$200(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
    }

    public static /* synthetic */ String access$300() {
    }

    public static /* synthetic */ void access$400(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
    }

    public static /* synthetic */ void access$500(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState) {
    }

    public static /* synthetic */ void access$600(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
    }

    private static void handleDataDoubleEscapeTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
    }

    private static void handleDataEndTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState) {
    }

    private static void readCharRef(Tokeniser tokeniser, TokeniserState tokeniserState) {
    }

    private static void readData(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
    }

    private static void readEndTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
    }

    public static TokeniserState valueOf(String str) {
    }

    public static TokeniserState[] values() {
    }

    public abstract void read(Tokeniser tokeniser, CharacterReader characterReader);

    public /* synthetic */ TokeniserState(String str, int i2, AnonymousClass1 anonymousClass1) {
    }
}
