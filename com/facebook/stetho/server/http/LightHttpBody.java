package com.facebook.stetho.server.http;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class LightHttpBody {

    /* renamed from: com.facebook.stetho.server.http.LightHttpBody$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends LightHttpBody {
        public final /* synthetic */ byte[] val$body;
        public final /* synthetic */ String val$contentType;

        public AnonymousClass1(String str, byte[] bArr) {
        }

        @Override // com.facebook.stetho.server.http.LightHttpBody
        public int contentLength() {
        }

        @Override // com.facebook.stetho.server.http.LightHttpBody
        public String contentType() {
        }

        @Override // com.facebook.stetho.server.http.LightHttpBody
        public void writeTo(OutputStream outputStream) throws IOException {
        }
    }

    public static LightHttpBody create(String str, String str2) {
    }

    public abstract int contentLength();

    public abstract String contentType();

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public static LightHttpBody create(byte[] bArr, String str) {
    }
}
