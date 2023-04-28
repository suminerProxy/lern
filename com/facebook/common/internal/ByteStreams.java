package com.facebook.common.internal;

import com.facebook.infer.annotation.Nullsafe;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class ByteStreams {
    private static final int BUF_SIZE = 4096;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class FastByteArrayOutputStream extends ByteArrayOutputStream {
        private FastByteArrayOutputStream() {
        }

        public void writeTo(byte[] b, int off) {
        }

        public /* synthetic */ FastByteArrayOutputStream(AnonymousClass1 anonymousClass1) {
        }
    }

    private ByteStreams() {
    }

    public static long copy(InputStream from, OutputStream to) throws IOException {
    }

    public static int read(InputStream in, byte[] b, int off, int len) throws IOException {
    }

    public static void readFully(InputStream in, byte[] b, int off, int len) throws IOException {
    }

    public static byte[] toByteArray(InputStream in) throws IOException {
    }

    public static byte[] toByteArray(InputStream in, int expectedSize) throws IOException {
    }
}
