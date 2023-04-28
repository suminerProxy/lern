package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;
import java.security.MessageDigest;
import javax.crypto.Mac;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class HashingSink extends ForwardingSink {
    private final Mac mac;
    private final MessageDigest messageDigest;

    private HashingSink(Sink sink, ByteString byteString, String str) {
    }

    private HashingSink(Sink sink, String str) {
    }

    public static HashingSink hmacSha1(Sink sink, ByteString byteString) {
    }

    public static HashingSink hmacSha256(Sink sink, ByteString byteString) {
    }

    public static HashingSink hmacSha512(Sink sink, ByteString byteString) {
    }

    public static HashingSink md5(Sink sink) {
    }

    public static HashingSink sha1(Sink sink) {
    }

    public static HashingSink sha256(Sink sink) {
    }

    public static HashingSink sha512(Sink sink) {
    }

    public final ByteString hash() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ForwardingSink, com.tencent.cloud.huiyansdkface.okio.Sink
    public final void write(Buffer buffer, long j2) throws IOException {
    }
}
