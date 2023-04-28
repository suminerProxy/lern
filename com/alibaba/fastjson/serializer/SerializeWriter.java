package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.Charset;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class SerializeWriter extends Writer {
    public static final char[] DIGITS = null;
    public static final char[] DigitOnes = null;
    public static final char[] DigitTens = null;
    public static final char[] ascii_chars = null;
    private static final ThreadLocal<char[]> bufLocal = null;
    public static final char[] digits = null;
    public static final char[] replaceChars = null;
    public static final int[] sizeTable = null;
    public static final byte[] specicalFlags_doubleQuotes = null;
    public static final byte[] specicalFlags_singleQuotes = null;
    public char[] buf;
    public int count;
    public int features;
    public final Writer writer;

    public SerializeWriter() {
    }

    public static void getChars(long j2, int i2, char[] cArr) {
    }

    private void writeKeyWithDoubleQuoteIfHasSpecial(String str) {
    }

    private void writeKeyWithSingleQuoteIfHasSpecial(String str) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Writer append(char c) throws IOException {
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void config(SerializerFeature serializerFeature, boolean z) {
    }

    public void expandCapacity(int i2) {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public boolean isEnabled(SerializerFeature serializerFeature) {
    }

    public byte[] toBytes(String str) {
    }

    public String toString() {
    }

    @Override // java.io.Writer
    public void write(int i2) {
    }

    public void writeByteArray(byte[] bArr) {
    }

    public void writeFieldName(String str, boolean z) {
    }

    public void writeInt(int i2) {
    }

    public void writeLong(long j2) {
    }

    public void writeNull() {
    }

    public void writeString(String str) {
    }

    public void writeStringWithDoubleQuote(String str, char c, boolean z) {
    }

    public void writeStringWithSingleQuote(String str) {
    }

    public void writeTo(Writer writer) throws IOException {
    }

    public SerializeWriter(Writer writer) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Writer append(CharSequence charSequence) throws IOException {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Writer append(CharSequence charSequence, int i2, int i3) throws IOException {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(char c) throws IOException {
    }

    public void writeTo(OutputStream outputStream, String str) throws IOException {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
    }

    public void writeTo(OutputStream outputStream, Charset charset) throws IOException {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i2, int i3) throws IOException {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(CharSequence charSequence) {
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
    }

    public SerializeWriter(SerializerFeature... serializerFeatureArr) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(CharSequence charSequence, int i2, int i3) {
    }

    public SerializeWriter(Writer writer, int i2, SerializerFeature[] serializerFeatureArr) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(char c) {
    }

    public SerializeWriter(int i2) {
    }

    public SerializeWriter(Writer writer, int i2) {
    }

    @Override // java.io.Writer
    public void write(String str, int i2, int i3) {
    }

    @Override // java.io.Writer
    public void write(String str) {
    }

    public void write(boolean z) {
    }
}
