package okhttp3;

import com.sobot.network.http.model.SobotProgress;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Interceptor.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0002\b\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/Interceptor;", "", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Companion", "Chain", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: Interceptor.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH&¢\u0006\u0004\b\u0016\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u000eH&¢\u0006\u0004\b\u0018\u0010\u0010J\u001f\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lokhttp3/Interceptor$Chain;", "", "Lokhttp3/Request;", SobotProgress.REQUEST, "()Lokhttp3/Request;", "Lokhttp3/Response;", "proceed", "(Lokhttp3/Request;)Lokhttp3/Response;", "Lokhttp3/Connection;", "connection", "()Lokhttp3/Connection;", "Lokhttp3/Call;", "call", "()Lokhttp3/Call;", "", "connectTimeoutMillis", "()I", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "withConnectTimeout", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/Interceptor$Chain;", "readTimeoutMillis", "withReadTimeout", "writeTimeoutMillis", "withWriteTimeout", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface Chain {
        @NotNull
        Call call();

        int connectTimeoutMillis();

        @Nullable
        Connection connection();

        @NotNull
        Response proceed(@NotNull Request request) throws IOException;

        int readTimeoutMillis();

        @NotNull
        Request request();

        @NotNull
        Chain withConnectTimeout(int i2, @NotNull TimeUnit timeUnit);

        @NotNull
        Chain withReadTimeout(int i2, @NotNull TimeUnit timeUnit);

        @NotNull
        Chain withWriteTimeout(int i2, @NotNull TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    /* compiled from: Interceptor.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ5\u0010\n\u001a\u00020\t2#\b\u0004\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H\u0086\n¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lokhttp3/Interceptor$Companion;", "", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lkotlin/ParameterName;", "name", "chain", "Lokhttp3/Response;", "block", "Lokhttp3/Interceptor;", "invoke", "(Lkotlin/jvm/functions/Function1;)Lokhttp3/Interceptor;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final Interceptor invoke(@NotNull Function1<? super Chain, Response> function1) {
            return new Interceptor(function1) { // from class: okhttp3.Interceptor$Companion$invoke$1
                public final /* synthetic */ Function1 $block;

                @Override // okhttp3.Interceptor
                @NotNull
                public Response intercept(@NotNull Interceptor.Chain chain) {
                }
            };
        }
    }

    @NotNull
    Response intercept(@NotNull Chain chain) throws IOException;
}
