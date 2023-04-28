package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class SegmentedByteString extends ByteString {
    public final transient int[] directory;
    public final transient byte[][] segments;

    public SegmentedByteString(Buffer buffer, int i2) {
    }

    private int segment(int i2) {
    }

    private ByteString toByteString() {
    }

    private Object writeReplace() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final ByteBuffer asByteBuffer() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final String base64() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final String base64Url() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final boolean equals(Object obj) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final byte getByte(int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final int hashCode() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final String hex() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final ByteString hmacSha1(ByteString byteString) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final ByteString hmacSha256(ByteString byteString) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final int indexOf(byte[] bArr, int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final byte[] internalArray() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final int lastIndexOf(byte[] bArr, int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final ByteString md5() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final boolean rangeEquals(int i2, ByteString byteString, int i3, int i4) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final boolean rangeEquals(int i2, byte[] bArr, int i3, int i4) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final ByteString sha1() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final ByteString sha256() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final int size() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final String string(Charset charset) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final ByteString substring(int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final ByteString substring(int i2, int i3) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final ByteString toAsciiLowercase() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final ByteString toAsciiUppercase() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final byte[] toByteArray() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final String toString() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final String utf8() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final void write(Buffer buffer) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ByteString
    public final void write(OutputStream outputStream) throws IOException {
    }
}
