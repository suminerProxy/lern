package org.jsoup.parser;

import java.io.Reader;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class CharacterReader {
    public static final char EOF = 65535;
    public static final int maxBufferLen = 32768;
    private static final int maxStringCacheLen = 12;
    private static final int readAheadLimit = 24576;
    private int bufLength;
    private int bufMark;
    private int bufPos;
    private int bufSplitPoint;
    private final char[] charBuf;
    private final Reader reader;
    private int readerPos;
    private final String[] stringCache;

    public CharacterReader(Reader reader, int i2) {
    }

    private void bufferUp() {
    }

    private static String cacheString(char[] cArr, String[] strArr, int i2, int i3) {
    }

    private boolean isEmptyNoBufferUp() {
    }

    public static boolean rangeEquals(char[] cArr, int i2, int i3, String str) {
    }

    public void advance() {
    }

    public char consume() {
    }

    public String consumeData() {
    }

    public String consumeDigitSequence() {
    }

    public String consumeHexSequence() {
    }

    public String consumeLetterSequence() {
    }

    public String consumeLetterThenDigitSequence() {
    }

    public String consumeTagName() {
    }

    public String consumeTo(char c) {
    }

    public String consumeToAny(char... cArr) {
    }

    public String consumeToAnySorted(char... cArr) {
    }

    public String consumeToEnd() {
    }

    public boolean containsIgnoreCase(String str) {
    }

    public char current() {
    }

    public boolean isEmpty() {
    }

    public void mark() {
    }

    public boolean matchConsume(String str) {
    }

    public boolean matchConsumeIgnoreCase(String str) {
    }

    public boolean matches(char c) {
    }

    public boolean matchesAny(char... cArr) {
    }

    public boolean matchesAnySorted(char[] cArr) {
    }

    public boolean matchesDigit() {
    }

    public boolean matchesIgnoreCase(String str) {
    }

    public boolean matchesLetter() {
    }

    public int nextIndexOf(char c) {
    }

    public int pos() {
    }

    public void rewindToMark() {
    }

    public String toString() {
    }

    public void unconsume() {
    }

    public boolean matches(String str) {
    }

    public boolean rangeEquals(int i2, int i3, String str) {
    }

    public String consumeTo(String str) {
    }

    public int nextIndexOf(CharSequence charSequence) {
    }

    public CharacterReader(Reader reader) {
    }

    public CharacterReader(String str) {
    }
}
