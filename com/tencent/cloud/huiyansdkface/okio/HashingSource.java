package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;
import java.security.MessageDigest;
import javax.crypto.Mac;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class HashingSource extends ForwardingSource {
    private final Mac mac;
    private final MessageDigest messageDigest;

    private HashingSource(Source source, ByteString byteString, String str) {
    }

    private HashingSource(Source source, String str) {
    }

    public static HashingSource hmacSha1(Source source, ByteString byteString) {
    }

    public static HashingSource hmacSha256(Source source, ByteString byteString) {
    }

    public static HashingSource md5(Source source) {
    }

    public static HashingSource sha1(Source source) {
    }

    public static HashingSource sha256(Source source) {
    }

    public final ByteString hash() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ForwardingSource, com.tencent.cloud.huiyansdkface.okio.Source
    public final long read(Buffer buffer, long j2) throws IOException {
    }
}
