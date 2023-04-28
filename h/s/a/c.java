package h.s.a;

import android.content.Context;
import com.umeng.analytics.pro.am;
import java.io.File;
import java.net.URL;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SVGACache.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!¨\u0006%"}, d2 = {"Lh/s/a/c;", "", "Landroid/content/Context;", "context", "", "i", "(Landroid/content/Context;)V", "Lh/s/a/c$a;", "type", "j", "(Landroid/content/Context;Lh/s/a/c$a;)V", "", "h", "()Z", "g", "", "cacheKey", "f", "(Ljava/lang/String;)Z", "str", am.aF, "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/net/URL;", "url", "d", "(Ljava/net/URL;)Ljava/lang/String;", "Ljava/io/File;", "b", "(Ljava/lang/String;)Ljava/io/File;", "e", "audio", "a", "Lh/s/a/c$a;", "Ljava/lang/String;", "cacheDir", "<init>", "()V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static a f17771a;
    private static String b;
    public static final c c = null;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: SVGACache.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"h/s/a/c$a", "", "Lh/s/a/c$a;", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "FILE", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a DEFAULT = null;
        public static final a FILE = null;

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    private c() {
    }

    @NotNull
    public final File a(@NotNull String str) {
    }

    @NotNull
    public final File b(@NotNull String str) {
    }

    @NotNull
    public final String c(@NotNull String str) {
    }

    @NotNull
    public final String d(@NotNull URL url) {
    }

    @NotNull
    public final File e(@NotNull String str) {
    }

    public final boolean f(@NotNull String str) {
    }

    public final boolean g() {
    }

    public final boolean h() {
    }

    public final void i(@Nullable Context context) {
    }

    public final void j(@Nullable Context context, @NotNull a aVar) {
    }
}
