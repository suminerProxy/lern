package com.facebook.common.util;

import com.facebook.infer.annotation.Nullsafe;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class StreamUtil {

    /* renamed from: com.facebook.common.util.StreamUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 extends ByteArrayOutputStream {
        public AnonymousClass1(int x0) {
        }

        @Override // java.io.ByteArrayOutputStream
        public byte[] toByteArray() {
        }
    }

    public static byte[] getBytesFromStream(final InputStream is) throws IOException {
    }

    public static long skip(final InputStream inputStream, final long bytesCount) throws IOException {
    }

    public static byte[] getBytesFromStream(InputStream inputStream, int hint) throws IOException {
    }
}
