package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class JsonReader implements Closeable {
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final char[] buffer;
    private final Reader in;
    private boolean lenient;
    private int limit;
    private int lineNumber;
    private int lineStart;
    private int[] pathIndices;
    private String[] pathNames;
    public int peeked;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int pos;
    private int[] stack;
    private int stackSize;

    /* renamed from: com.google.gson.stream.JsonReader$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends JsonReaderInternalAccess {
        @Override // com.google.gson.internal.JsonReaderInternalAccess
        public void promoteNameToValue(JsonReader jsonReader) throws IOException {
        }
    }

    public JsonReader(Reader reader) {
    }

    private void checkLenient() throws IOException {
    }

    private void consumeNonExecutePrefix() throws IOException {
    }

    private boolean fillBuffer(int i2) throws IOException {
    }

    private boolean isLiteral(char c) throws IOException {
    }

    private int nextNonWhitespace(boolean z) throws IOException {
    }

    private String nextQuotedValue(char c) throws IOException {
    }

    private String nextUnquotedValue() throws IOException {
    }

    private int peekKeyword() throws IOException {
    }

    private int peekNumber() throws IOException {
    }

    private void push(int i2) {
    }

    private char readEscapeCharacter() throws IOException {
    }

    private void skipQuotedValue(char c) throws IOException {
    }

    private boolean skipTo(String str) throws IOException {
    }

    private void skipToEndOfLine() throws IOException {
    }

    private void skipUnquotedValue() throws IOException {
    }

    private IOException syntaxError(String str) throws IOException {
    }

    public void beginArray() throws IOException {
    }

    public void beginObject() throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public int doPeek() throws IOException {
    }

    public void endArray() throws IOException {
    }

    public void endObject() throws IOException {
    }

    public String getPath() {
    }

    public boolean hasNext() throws IOException {
    }

    public final boolean isLenient() {
    }

    public String locationString() {
    }

    public boolean nextBoolean() throws IOException {
    }

    public double nextDouble() throws IOException {
    }

    public int nextInt() throws IOException {
    }

    public long nextLong() throws IOException {
    }

    public String nextName() throws IOException {
    }

    public void nextNull() throws IOException {
    }

    public String nextString() throws IOException {
    }

    public JsonToken peek() throws IOException {
    }

    public final void setLenient(boolean z) {
    }

    public void skipValue() throws IOException {
    }

    public String toString() {
    }
}
