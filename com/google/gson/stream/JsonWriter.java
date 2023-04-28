package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class JsonWriter implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS = null;
    private static final String[] REPLACEMENT_CHARS = null;
    private String deferredName;
    private boolean htmlSafe;
    private String indent;
    private boolean lenient;
    private final Writer out;
    private String separator;
    private boolean serializeNulls;
    private int[] stack;
    private int stackSize;

    public JsonWriter(Writer writer) {
    }

    private void beforeName() throws IOException {
    }

    private void beforeValue() throws IOException {
    }

    private JsonWriter close(int i2, int i3, char c) throws IOException {
    }

    private void newline() throws IOException {
    }

    private JsonWriter open(int i2, char c) throws IOException {
    }

    private int peek() {
    }

    private void push(int i2) {
    }

    private void replaceTop(int i2) {
    }

    private void string(String str) throws IOException {
    }

    private void writeDeferredName() throws IOException {
    }

    public JsonWriter beginArray() throws IOException {
    }

    public JsonWriter beginObject() throws IOException {
    }

    public JsonWriter endArray() throws IOException {
    }

    public JsonWriter endObject() throws IOException {
    }

    public void flush() throws IOException {
    }

    public final boolean getSerializeNulls() {
    }

    public final boolean isHtmlSafe() {
    }

    public boolean isLenient() {
    }

    public JsonWriter jsonValue(String str) throws IOException {
    }

    public JsonWriter name(String str) throws IOException {
    }

    public JsonWriter nullValue() throws IOException {
    }

    public final void setHtmlSafe(boolean z) {
    }

    public final void setIndent(String str) {
    }

    public final void setLenient(boolean z) {
    }

    public final void setSerializeNulls(boolean z) {
    }

    public JsonWriter value(String str) throws IOException {
    }

    public JsonWriter value(boolean z) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public JsonWriter value(Boolean bool) throws IOException {
    }

    public JsonWriter value(double d2) throws IOException {
    }

    public JsonWriter value(long j2) throws IOException {
    }

    public JsonWriter value(Number number) throws IOException {
    }
}
