package okhttp3.internal.platform.android;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CloseGuard.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B%\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/platform/android/CloseGuard;", "", "", "closer", "createAndOpen", "(Ljava/lang/String;)Ljava/lang/Object;", "closeGuardInstance", "", "warnIfOpen", "(Ljava/lang/Object;)Z", "Ljava/lang/reflect/Method;", "warnIfOpenMethod", "Ljava/lang/reflect/Method;", "getMethod", "openMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class CloseGuard {
    public static final Companion Companion = new Companion(null);
    private final Method getMethod;
    private final Method openMethod;
    private final Method warnIfOpenMethod;

    /* compiled from: CloseGuard.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/platform/android/CloseGuard$Companion;", "", "Lokhttp3/internal/platform/android/CloseGuard;", "get", "()Lokhttp3/internal/platform/android/CloseGuard;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final CloseGuard get() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod(TtmlNode.TEXT_EMPHASIS_MARK_OPEN, String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new CloseGuard(method3, method2, method);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CloseGuard(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
        this.getMethod = method;
        this.openMethod = method2;
        this.warnIfOpenMethod = method3;
    }

    @Nullable
    public final Object createAndOpen(@NotNull String str) {
        Method method = this.getMethod;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.openMethod;
                if (method2 == null) {
                    Intrinsics.throwNpe();
                }
                method2.invoke(invoke, str);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean warnIfOpen(@Nullable Object obj) {
        if (obj != null) {
            try {
                Method method = this.warnIfOpenMethod;
                if (method == null) {
                    Intrinsics.throwNpe();
                }
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }
}
