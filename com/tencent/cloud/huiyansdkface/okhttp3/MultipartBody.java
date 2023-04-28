package com.tencent.cloud.huiyansdkface.okhttp3;

import com.tencent.cloud.huiyansdkface.okio.BufferedSink;
import com.tencent.cloud.huiyansdkface.okio.ByteString;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class MultipartBody extends RequestBody {

    /* renamed from: a  reason: collision with root package name */
    public static final MediaType f10724a = null;
    public static final MediaType b = null;
    private static final byte[] c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f10725d = null;

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f10726e = null;

    /* renamed from: f  reason: collision with root package name */
    private final ByteString f10727f;

    /* renamed from: g  reason: collision with root package name */
    private final MediaType f10728g;

    /* renamed from: h  reason: collision with root package name */
    private final MediaType f10729h;

    /* renamed from: i  reason: collision with root package name */
    private final List<Part> f10730i;

    /* renamed from: j  reason: collision with root package name */
    private long f10731j;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final ByteString f10732a;
        private MediaType b;
        private final List<Part> c;

        public Builder() {
        }

        public Builder(String str) {
        }

        public final Builder addFormDataPart(String str, String str2) {
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
        }

        public final Builder addPart(Part part) {
        }

        public final Builder addPart(RequestBody requestBody) {
        }

        public final MultipartBody build() {
        }

        public final Builder setType(MediaType mediaType) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Part {

        /* renamed from: a  reason: collision with root package name */
        public final Headers f10733a;
        public final RequestBody b;

        private Part(Headers headers, RequestBody requestBody) {
        }

        public static Part create(Headers headers, RequestBody requestBody) {
        }

        public static Part create(RequestBody requestBody) {
        }

        public static Part createFormData(String str, String str2) {
        }

        public static Part createFormData(String str, String str2, RequestBody requestBody) {
        }

        public final RequestBody body() {
        }

        public final Headers headers() {
        }
    }

    public MultipartBody(ByteString byteString, MediaType mediaType, List<Part> list) {
    }

    private long a(BufferedSink bufferedSink, boolean z) throws IOException {
    }

    public static StringBuilder a(StringBuilder sb, String str) {
    }

    public final String boundary() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
    public final long contentLength() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
    public final MediaType contentType() {
    }

    public final Part part(int i2) {
    }

    public final List<Part> parts() {
    }

    public final int size() {
    }

    public final MediaType type() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) throws IOException {
    }
}
