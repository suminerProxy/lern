package org.jsoup.parser;

import org.jsoup.parser.Token;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Tokeniser {
    private static final char[] notCharRefCharsSorted = null;
    public static final char replacementChar = 65533;
    public static final int[] win1252Extensions = null;
    public static final int win1252ExtensionsStart = 128;
    public Token.Character charPending;
    private StringBuilder charsBuilder;
    private String charsString;
    private final int[] codepointHolder;
    public Token.Comment commentPending;
    public StringBuilder dataBuffer;
    public Token.Doctype doctypePending;
    private Token emitPending;
    public Token.EndTag endPending;
    private final ParseErrorList errors;
    private boolean isEmitPending;
    private String lastStartTag;
    private final int[] multipointHolder;
    private final CharacterReader reader;
    public Token.StartTag startPending;
    private TokeniserState state;
    public Token.Tag tagPending;

    public Tokeniser(CharacterReader characterReader, ParseErrorList parseErrorList) {
    }

    private void characterReferenceError(String str) {
    }

    public void advanceTransition(TokeniserState tokeniserState) {
    }

    public String appropriateEndTagName() {
    }

    public int[] consumeCharacterReference(Character ch, boolean z) {
    }

    public void createCommentPending() {
    }

    public void createDoctypePending() {
    }

    public Token.Tag createTagPending(boolean z) {
    }

    public void createTempBuffer() {
    }

    public boolean currentNodeInHtmlNS() {
    }

    public void emit(Token token) {
    }

    public void emitCommentPending() {
    }

    public void emitDoctypePending() {
    }

    public void emitTagPending() {
    }

    public void eofError(TokeniserState tokeniserState) {
    }

    public void error(TokeniserState tokeniserState) {
    }

    public TokeniserState getState() {
    }

    public boolean isAppropriateEndTagToken() {
    }

    public Token read() {
    }

    public void transition(TokeniserState tokeniserState) {
    }

    public String unescapeEntities(boolean z) {
    }

    public void error(String str) {
    }

    public void emit(String str) {
    }

    public void emit(char[] cArr) {
    }

    public void emit(int[] iArr) {
    }

    public void emit(char c) {
    }
}
