package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* compiled from: ErrorCode.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/http2/ErrorCode;", "", "", "httpCode", "I", "getHttpCode", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "NO_ERROR", "PROTOCOL_ERROR", "INTERNAL_ERROR", "FLOW_CONTROL_ERROR", "SETTINGS_TIMEOUT", "STREAM_CLOSED", "FRAME_SIZE_ERROR", "REFUSED_STREAM", "CANCEL", "COMPRESSION_ERROR", "CONNECT_ERROR", "ENHANCE_YOUR_CALM", "INADEQUATE_SECURITY", "HTTP_1_1_REQUIRED", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class ErrorCode {
    private static final /* synthetic */ ErrorCode[] $VALUES = null;
    public static final ErrorCode CANCEL = null;
    public static final ErrorCode COMPRESSION_ERROR = null;
    public static final ErrorCode CONNECT_ERROR = null;
    public static final Companion Companion = null;
    public static final ErrorCode ENHANCE_YOUR_CALM = null;
    public static final ErrorCode FLOW_CONTROL_ERROR = null;
    public static final ErrorCode FRAME_SIZE_ERROR = null;
    public static final ErrorCode HTTP_1_1_REQUIRED = null;
    public static final ErrorCode INADEQUATE_SECURITY = null;
    public static final ErrorCode INTERNAL_ERROR = null;
    public static final ErrorCode NO_ERROR = null;
    public static final ErrorCode PROTOCOL_ERROR = null;
    public static final ErrorCode REFUSED_STREAM = null;
    public static final ErrorCode SETTINGS_TIMEOUT = null;
    public static final ErrorCode STREAM_CLOSED = null;
    private final int httpCode;

    /* compiled from: ErrorCode.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/internal/http2/ErrorCode$Companion;", "", "", "code", "Lokhttp3/internal/http2/ErrorCode;", "fromHttp2", "(I)Lokhttp3/internal/http2/ErrorCode;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final ErrorCode fromHttp2(int i2) {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private ErrorCode(String str, int i2, int i3) {
    }

    public static ErrorCode valueOf(String str) {
    }

    public static ErrorCode[] values() {
    }

    public final int getHttpCode() {
    }
}
