package h.a.a.a.a.m;

import h.a.a.a.a.l.l1;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Source;

/* compiled from: ProgressTouchableResponseBody.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class f<T extends l1> extends ResponseBody {
    private final ResponseBody b;
    private h.a.a.a.a.h.b c;

    /* renamed from: d  reason: collision with root package name */
    private BufferedSource f16058d;

    /* renamed from: e  reason: collision with root package name */
    private T f16059e;

    /* compiled from: ProgressTouchableResponseBody.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a extends ForwardingSource {
        private long b;
        public final /* synthetic */ f c;

        public a(f fVar, Source source) {
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
        }
    }

    public f(ResponseBody responseBody, b bVar) {
    }

    public static /* synthetic */ h.a.a.a.a.h.b a(f fVar) {
    }

    public static /* synthetic */ l1 b(f fVar) {
    }

    public static /* synthetic */ ResponseBody c(f fVar) {
    }

    private Source d(Source source) {
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
    }

    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
    }
}
