package okhttp3.internal.http;

import com.baidu.platform.comapi.map.MapBundleKey;
import com.sobot.network.http.model.SobotProgress;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealInterceptorChain.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u001a\u001a\u00020+\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b2\u00103JM\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0011J\u001f\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u001cR\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010\u001a\u001a\u00020+8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b-\u0010.R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u001c\u0010\b\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b/\u0010\u0011R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010#R\u001c\u0010\n\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b1\u0010\u0011¨\u00064"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/Request;", SobotProgress.REQUEST, "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "copy$okhttp", "(ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)Lokhttp3/internal/http/RealInterceptorChain;", "copy", "Lokhttp3/Connection;", "connection", "()Lokhttp3/Connection;", "()I", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "withConnectTimeout", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/Interceptor$Chain;", "withReadTimeout", "withWriteTimeout", "Lokhttp3/Call;", "call", "()Lokhttp3/Call;", "()Lokhttp3/Request;", "Lokhttp3/Response;", "proceed", "(Lokhttp3/Request;)Lokhttp3/Response;", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "I", "getReadTimeoutMillis$okhttp", "Lokhttp3/Request;", "getRequest$okhttp", "", "Lokhttp3/Interceptor;", "interceptors", "Ljava/util/List;", "Lokhttp3/internal/connection/RealCall;", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "getConnectTimeoutMillis$okhttp", "calls", "getWriteTimeoutMillis$okhttp", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    @NotNull
    private final RealCall call;
    private int calls;
    private final int connectTimeoutMillis;
    @Nullable
    private final Exchange exchange;
    private final int index;
    private final List<Interceptor> interceptors;
    private final int readTimeoutMillis;
    @NotNull
    private final Request request;
    private final int writeTimeoutMillis;

    public RealInterceptorChain(@NotNull RealCall realCall, @NotNull List<? extends Interceptor> list, int i2, @Nullable Exchange exchange, @NotNull Request request, int i3, int i4, int i5) {
    }

    public static /* synthetic */ RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int i2, Exchange exchange, Request request, int i3, int i4, int i5, int i6, Object obj) {
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Call call() {
    }

    @Override // okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
    }

    @Override // okhttp3.Interceptor.Chain
    @Nullable
    public Connection connection() {
    }

    @NotNull
    public final RealInterceptorChain copy$okhttp(int i2, @Nullable Exchange exchange, @NotNull Request request, int i3, int i4, int i5) {
    }

    @NotNull
    public final RealCall getCall$okhttp() {
    }

    public final int getConnectTimeoutMillis$okhttp() {
    }

    @Nullable
    public final Exchange getExchange$okhttp() {
    }

    public final int getReadTimeoutMillis$okhttp() {
    }

    @NotNull
    public final Request getRequest$okhttp() {
    }

    public final int getWriteTimeoutMillis$okhttp() {
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Response proceed(@NotNull Request request) throws IOException {
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Request request() {
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Interceptor.Chain withConnectTimeout(int i2, @NotNull TimeUnit timeUnit) {
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Interceptor.Chain withReadTimeout(int i2, @NotNull TimeUnit timeUnit) {
    }

    @Override // okhttp3.Interceptor.Chain
    @NotNull
    public Interceptor.Chain withWriteTimeout(int i2, @NotNull TimeUnit timeUnit) {
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
    }
}
