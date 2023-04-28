package h.x.g.m;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.mobile.auth.gatewayauth.Constant;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SuperPlayUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/taihe/videoplayer/util/SuperPlayUtil;", "", "()V", "Companion", "module_video_player_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class a {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final C0416a f26059a = null;

    /* compiled from: SuperPlayUtil.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\"\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\bH\u0007J(\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\u0012\u0010\u001c\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u0014\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010!\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\"\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010#\u001a\u00020\u0004H\u0007J\u0012\u0010$\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010%\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010&\u001a\u0004\u0018\u00010\r2\u0006\u0010'\u001a\u00020(H\u0007J\u0012\u0010)\u001a\u0004\u0018\u00010\r2\u0006\u0010'\u001a\u00020(H\u0007¨\u0006*"}, d2 = {"Lcom/taihe/videoplayer/util/SuperPlayUtil$Companion;", "", "()V", "dip2px", "", "dipValue", "", "ctx", "Landroid/content/Context;", "getAppCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "context", "getImageUrl", "", "imgUrls", AnimatedPasterJsonConfig.CONFIG_WIDTH, AnimatedPasterJsonConfig.CONFIG_HEIGHT, "getWindow", "Landroid/view/Window;", "hideStatusBar", "", "hideSystemUI", "isWifiConnected", "", "loadImage", "image", "Lcom/facebook/drawee/view/SimpleDraweeView;", "url", "onlyHideSystemUI", "px2dip", "pxValue", "scanForActivity", "Landroid/app/Activity;", "screenBright", "setRequestedOrientation", Constant.PROTOCOL_WEBVIEW_ORIENTATION, "showStatusBar", "showSystemUI", "stringToTime", "timeMs", "", "stringToTimeStr", "module_video_player_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: h.x.g.m.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class C0416a {
        private C0416a() {
        }

        public /* synthetic */ C0416a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final int a(float f2, @NotNull Context context) {
        }

        @JvmStatic
        @Nullable
        public final AppCompatActivity b(@Nullable Context context) {
        }

        @JvmStatic
        @Nullable
        public final String c(@NotNull String str, int i2, int i3) {
        }

        @JvmStatic
        @Nullable
        public final Window d(@Nullable Context context) {
        }

        @JvmStatic
        @SuppressLint({"RestrictedApi"})
        public final void e(@Nullable Context context) {
        }

        @JvmStatic
        @SuppressLint({"NewApi"})
        public final void f(@Nullable Context context) {
        }

        @JvmStatic
        public final boolean g(@NotNull Context context) {
        }

        @JvmStatic
        public final void h(@NotNull SimpleDraweeView simpleDraweeView, @NotNull String str, int i2, int i3) {
        }

        @JvmStatic
        @SuppressLint({"NewApi"})
        public final void i(@Nullable Context context) {
        }

        @JvmStatic
        public final int j(float f2, @NotNull Context context) {
        }

        @JvmStatic
        @Nullable
        public final Activity k(@Nullable Context context) {
        }

        @JvmStatic
        public final void l(@Nullable Context context) {
        }

        @JvmStatic
        public final void m(@Nullable Context context, int i2) {
        }

        @JvmStatic
        @SuppressLint({"RestrictedApi"})
        public final void n(@Nullable Context context) {
        }

        @JvmStatic
        @SuppressLint({"NewApi"})
        public final void o(@Nullable Context context) {
        }

        @JvmStatic
        @Nullable
        public final String p(long j2) {
        }

        @JvmStatic
        @Nullable
        public final String q(long j2) {
        }
    }

    @JvmStatic
    public static final int a(float f2, @NotNull Context context) {
    }

    @JvmStatic
    @Nullable
    public static final AppCompatActivity b(@Nullable Context context) {
    }

    @JvmStatic
    @Nullable
    public static final String c(@NotNull String str, int i2, int i3) {
    }

    @JvmStatic
    @Nullable
    public static final Window d(@Nullable Context context) {
    }

    @JvmStatic
    @SuppressLint({"RestrictedApi"})
    public static final void e(@Nullable Context context) {
    }

    @JvmStatic
    @SuppressLint({"NewApi"})
    public static final void f(@Nullable Context context) {
    }

    @JvmStatic
    public static final boolean g(@NotNull Context context) {
    }

    @JvmStatic
    public static final void h(@NotNull SimpleDraweeView simpleDraweeView, @NotNull String str, int i2, int i3) {
    }

    @JvmStatic
    @SuppressLint({"NewApi"})
    public static final void i(@Nullable Context context) {
    }

    @JvmStatic
    public static final int j(float f2, @NotNull Context context) {
    }

    @JvmStatic
    @Nullable
    public static final Activity k(@Nullable Context context) {
    }

    @JvmStatic
    public static final void l(@Nullable Context context) {
    }

    @JvmStatic
    public static final void m(@Nullable Context context, int i2) {
    }

    @JvmStatic
    @SuppressLint({"RestrictedApi"})
    public static final void n(@Nullable Context context) {
    }

    @JvmStatic
    @SuppressLint({"NewApi"})
    public static final void o(@Nullable Context context) {
    }

    @JvmStatic
    @Nullable
    public static final String p(long j2) {
    }

    @JvmStatic
    @Nullable
    public static final String q(long j2) {
    }
}
