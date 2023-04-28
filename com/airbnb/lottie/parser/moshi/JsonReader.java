package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import okio.BufferedSink;
import okio.BufferedSource;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class JsonReader implements Closeable {
    private static final String[] REPLACEMENT_CHARS = null;
    public boolean failOnUnknown;
    public boolean lenient;
    public int[] pathIndices;
    public String[] pathNames;
    public int[] scopes;
    public int stackSize;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Options {
        public final okio.Options doubleQuoteSuffix;
        public final String[] strings;

        private Options(String[] strArr, okio.Options options) {
        }

        public static Options of(String... strArr) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Token {
        private static final /* synthetic */ Token[] $VALUES = null;
        public static final Token BEGIN_ARRAY = null;
        public static final Token BEGIN_OBJECT = null;
        public static final Token BOOLEAN = null;
        public static final Token END_ARRAY = null;
        public static final Token END_DOCUMENT = null;
        public static final Token END_OBJECT = null;
        public static final Token NAME = null;
        public static final Token NULL = null;
        public static final Token NUMBER = null;
        public static final Token STRING = null;

        private Token(String str, int i2) {
        }

        public static Token valueOf(String str) {
        }

        public static Token[] values() {
        }
    }

    public static /* synthetic */ void access$000(BufferedSink bufferedSink, String str) throws IOException {
    }

    public static JsonReader of(BufferedSource bufferedSource) {
    }

    private static void string(BufferedSink bufferedSink, String str) throws IOException {
    }

    public abstract void beginArray() throws IOException;

    public abstract void beginObject() throws IOException;

    public abstract void endArray() throws IOException;

    public abstract void endObject() throws IOException;

    public final String getPath() {
    }

    public abstract boolean hasNext() throws IOException;

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract String nextName() throws IOException;

    public abstract String nextString() throws IOException;

    public abstract Token peek() throws IOException;

    public final void pushScope(int i2) {
    }

    public abstract int selectName(Options options) throws IOException;

    public abstract void skipName() throws IOException;

    public abstract void skipValue() throws IOException;

    public final JsonEncodingException syntaxError(String str) throws JsonEncodingException {
    }
}
