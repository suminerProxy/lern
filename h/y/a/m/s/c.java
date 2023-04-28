package h.y.a.m.s;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* compiled from: ProgressResponseBody.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class c extends ResponseBody {
    private final ResponseBody b;
    private final b c;

    /* renamed from: d  reason: collision with root package name */
    private BufferedSource f26264d;

    /* compiled from: ProgressResponseBody.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends ForwardingSource {
        public long b;
        public final /* synthetic */ c c;

        public a(c cVar, Source source) {
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
        }
    }

    public c(ResponseBody responseBody, b bVar) {
        this.b = responseBody;
        this.c = bVar;
    }

    private Source c(Source source) {
        return new a(this, source);
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.b.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.b.contentType();
    }

    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
        if (this.f26264d == null) {
            this.f26264d = Okio.buffer(c(this.b.source()));
        }
        return this.f26264d;
    }
}
