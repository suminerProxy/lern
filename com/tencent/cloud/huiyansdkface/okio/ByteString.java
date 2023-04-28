package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final ByteString EMPTY = null;
    public static final char[] HEX_DIGITS = null;
    private static final long serialVersionUID = 1;
    public final byte[] data;
    public transient int hashCode;
    public transient String utf8;

    public ByteString(byte[] bArr) {
    }

    public static int codePointIndexToCharIndex(String str, int i2) {
    }

    public static ByteString decodeBase64(String str) {
    }

    public static ByteString decodeHex(String str) {
    }

    private static int decodeHexDigit(char c) {
    }

    private ByteString digest(String str) {
    }

    public static ByteString encodeString(String str, Charset charset) {
    }

    public static ByteString encodeUtf8(String str) {
    }

    private ByteString hmac(String str, ByteString byteString) {
    }

    public static ByteString of(ByteBuffer byteBuffer) {
    }

    public static ByteString of(byte... bArr) {
    }

    public static ByteString of(byte[] bArr, int i2, int i3) {
    }

    public static ByteString read(InputStream inputStream, int i2) throws IOException {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    public ByteBuffer asByteBuffer() {
    }

    public String base64() {
    }

    public String base64Url() {
    }

    /* renamed from: compareTo  reason: avoid collision after fix types in other method */
    public int compareTo2(ByteString byteString) {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ByteString byteString) {
    }

    public final boolean endsWith(ByteString byteString) {
    }

    public final boolean endsWith(byte[] bArr) {
    }

    public boolean equals(Object obj) {
    }

    public byte getByte(int i2) {
    }

    public int hashCode() {
    }

    public String hex() {
    }

    public ByteString hmacSha1(ByteString byteString) {
    }

    public ByteString hmacSha256(ByteString byteString) {
    }

    public ByteString hmacSha512(ByteString byteString) {
    }

    public final int indexOf(ByteString byteString) {
    }

    public final int indexOf(ByteString byteString, int i2) {
    }

    public final int indexOf(byte[] bArr) {
    }

    public int indexOf(byte[] bArr, int i2) {
    }

    public byte[] internalArray() {
    }

    public final int lastIndexOf(ByteString byteString) {
    }

    public final int lastIndexOf(ByteString byteString, int i2) {
    }

    public final int lastIndexOf(byte[] bArr) {
    }

    public int lastIndexOf(byte[] bArr, int i2) {
    }

    public ByteString md5() {
    }

    public boolean rangeEquals(int i2, ByteString byteString, int i3, int i4) {
    }

    public boolean rangeEquals(int i2, byte[] bArr, int i3, int i4) {
    }

    public ByteString sha1() {
    }

    public ByteString sha256() {
    }

    public ByteString sha512() {
    }

    public int size() {
    }

    public final boolean startsWith(ByteString byteString) {
    }

    public final boolean startsWith(byte[] bArr) {
    }

    public String string(Charset charset) {
    }

    public ByteString substring(int i2) {
    }

    public ByteString substring(int i2, int i3) {
    }

    public ByteString toAsciiLowercase() {
    }

    public ByteString toAsciiUppercase() {
    }

    public byte[] toByteArray() {
    }

    public String toString() {
    }

    public String utf8() {
    }

    public void write(Buffer buffer) {
    }

    public void write(OutputStream outputStream) throws IOException {
    }
}
