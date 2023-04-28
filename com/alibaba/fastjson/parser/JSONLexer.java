package com.alibaba.fastjson.parser;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class JSONLexer {
    public static final char[] CA = null;
    public static final int END = 4;
    public static final char EOI = 26;
    public static final int[] IA = null;
    public static final int NOT_MATCH = -1;
    public static final int NOT_MATCH_NAME = -2;
    public static final int UNKNOWN = 0;
    private static boolean V6 = false;
    public static final int VALUE = 3;
    public static final int[] digits = null;
    public static final boolean[] firstIdentifierFlags = null;
    public static final boolean[] identifierFlags = null;
    private static final ThreadLocal<char[]> sbufLocal = null;
    public int bp;
    public Calendar calendar;
    public char ch;
    public boolean disableCircularReferenceDetect;
    public int eofPos;
    public boolean exp;
    public int features;
    public long fieldHash;
    public boolean hasSpecial;
    public boolean isDouble;
    public final int len;
    public Locale locale;
    public int matchStat;
    public int np;
    public int pos;
    public char[] sbuf;
    public int sp;
    public String stringDefaultValue;
    public final String text;
    public TimeZone timeZone;
    public int token;

    public JSONLexer(String str) {
    }

    public static boolean checkDate(char c, char c2, char c3, char c4, char c5, char c6, int i2, int i3) {
    }

    public static boolean checkTime(char c, char c2, char c3, char c4, char c5, char c6) {
    }

    public static final byte[] decodeFast(String str, int i2, int i3) {
    }

    private int matchFieldHash(long j2) {
    }

    private static String readString(char[] cArr, int i2) {
    }

    private void scanIdent() {
    }

    private void setCalendar(char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8) {
    }

    private final String subString(int i2, int i3) {
    }

    public byte[] bytesValue() {
    }

    public char charAt(int i2) {
    }

    public void close() {
    }

    public final void config(Feature feature, boolean z) {
    }

    public final Number decimalValue(boolean z) {
    }

    public String info() {
    }

    public final int intValue() {
    }

    public final Number integerValue() throws NumberFormatException {
    }

    public final boolean isBlankInput() {
    }

    public final boolean isEnabled(Feature feature) {
    }

    public final long longValue() throws NumberFormatException {
    }

    public boolean matchField(long j2) {
    }

    public char next() {
    }

    public final void nextIdent() {
    }

    public final void nextToken() {
    }

    public final void nextTokenWithChar(char c) {
    }

    public final String numberString() {
    }

    public boolean scanBoolean() {
    }

    public boolean scanFieldBoolean(long j2) {
    }

    public Date scanFieldDate(long j2) {
    }

    public final double scanFieldDouble(long j2) {
    }

    public final double[] scanFieldDoubleArray(long j2) {
    }

    public final double[][] scanFieldDoubleArray2(long j2) {
    }

    public final float scanFieldFloat(long j2) {
    }

    public final float[] scanFieldFloatArray(long j2) {
    }

    public final float[][] scanFieldFloatArray2(long j2) {
    }

    public int scanFieldInt(long j2) {
    }

    public final int[] scanFieldIntArray(long j2) {
    }

    public long scanFieldLong(long j2) {
    }

    public String scanFieldString(long j2) {
    }

    public long scanFieldSymbol(long j2) {
    }

    public boolean scanISO8601DateIfMatch(boolean z) {
    }

    public final long scanLongValue() {
    }

    public final void scanNumber() {
    }

    public final Number scanNumberValue() {
    }

    public final void scanString() {
    }

    public String scanStringValue(char c) {
    }

    public final String scanSymbol(SymbolTable symbolTable) {
    }

    public final String scanSymbolUnQuoted(SymbolTable symbolTable) {
    }

    public void setTime(char c, char c2, char c3, char c4, char c5, char c6) {
    }

    public void setTimeZone(char c, char c2, char c3) {
    }

    public void skipComment() {
    }

    public final void skipWhitespace() {
    }

    public final String stringVal() {
    }

    public final char[] sub_chars(int i2, int i3) {
    }

    public final int token() {
    }

    public JSONLexer(char[] cArr, int i2) {
    }

    public boolean scanISO8601DateIfMatch(boolean z, int i2) {
    }

    public JSONLexer(char[] cArr, int i2, int i3) {
    }

    public JSONLexer(String str, int i2) {
    }

    public String scanSymbol(SymbolTable symbolTable, char c) {
    }

    public final BigDecimal decimalValue() {
    }

    public final void nextToken(int i2) {
    }
}
