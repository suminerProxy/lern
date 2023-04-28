package com.tencent.cloud.huiyansdkface.okhttp3;

import com.tencent.cloud.huiyansdkface.okio.BufferedSink;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class FormBody extends RequestBody {

    /* renamed from: a  reason: collision with root package name */
    private static final MediaType f10692a = null;
    private final List<String> b;
    private final List<String> c;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f10693a;
        private final List<String> b;
        private final Charset c;

        public Builder() {
        }

        public Builder(Charset charset) {
        }

        public final Builder add(String str, String str2) {
        }

        public final Builder addEncoded(String str, String str2) {
        }

        public final FormBody build() {
        }
    }

    public FormBody(List<String> list, List<String> list2) {
    }

    private long a(BufferedSink bufferedSink, boolean z) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
    public final long contentLength() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
    public final MediaType contentType() {
    }

    public final String encodedName(int i2) {
    }

    public final String encodedValue(int i2) {
    }

    public final String name(int i2) {
    }

    public final int size() {
    }

    public final String value(int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) throws IOException {
    }
}
