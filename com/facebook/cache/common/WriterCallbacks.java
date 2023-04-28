package com.facebook.cache.common;

import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WriterCallbacks {

    /* renamed from: com.facebook.cache.common.WriterCallbacks$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements WriterCallback {
        public final /* synthetic */ InputStream val$is;

        public AnonymousClass1(final InputStream val$is) {
        }

        @Override // com.facebook.cache.common.WriterCallback
        public void write(OutputStream os) throws IOException {
        }
    }

    /* renamed from: com.facebook.cache.common.WriterCallbacks$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 implements WriterCallback {
        public final /* synthetic */ byte[] val$data;

        public AnonymousClass2(final byte[] val$data) {
        }

        @Override // com.facebook.cache.common.WriterCallback
        public void write(OutputStream os) throws IOException {
        }
    }

    public static WriterCallback from(final InputStream is) {
    }

    public static WriterCallback from(final byte[] data) {
    }
}
