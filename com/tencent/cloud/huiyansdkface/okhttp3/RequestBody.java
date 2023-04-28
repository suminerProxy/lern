package com.tencent.cloud.huiyansdkface.okhttp3;

import com.tencent.cloud.huiyansdkface.okio.BufferedSink;
import com.tencent.cloud.huiyansdkface.okio.ByteString;
import java.io.File;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class RequestBody {

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.RequestBody$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 extends RequestBody {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ MediaType f10783a;
        private /* synthetic */ ByteString b;

        public AnonymousClass1(MediaType mediaType, ByteString byteString) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
        public final long contentLength() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
        public final MediaType contentType() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
        public final void writeTo(BufferedSink bufferedSink) throws IOException {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.RequestBody$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass2 extends RequestBody {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ MediaType f10784a;
        private /* synthetic */ int b;
        private /* synthetic */ byte[] c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ int f10785d;

        public AnonymousClass2(MediaType mediaType, int i2, byte[] bArr, int i3) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
        public final long contentLength() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
        public final MediaType contentType() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
        public final void writeTo(BufferedSink bufferedSink) throws IOException {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.RequestBody$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass3 extends RequestBody {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ MediaType f10786a;
        private /* synthetic */ File b;

        public AnonymousClass3(MediaType mediaType, File file) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
        public final long contentLength() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
        public final MediaType contentType() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
        public final void writeTo(BufferedSink bufferedSink) throws IOException {
        }
    }

    public static RequestBody create(MediaType mediaType, ByteString byteString) {
    }

    public static RequestBody create(MediaType mediaType, File file) {
    }

    public static RequestBody create(MediaType mediaType, String str) {
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr, int i2, int i3) {
    }

    public long contentLength() throws IOException {
    }

    public abstract MediaType contentType();

    public abstract void writeTo(BufferedSink bufferedSink) throws IOException;
}
