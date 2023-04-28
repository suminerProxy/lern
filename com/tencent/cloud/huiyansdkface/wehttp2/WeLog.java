package com.tencent.cloud.huiyansdkface.wehttp2;

import com.tencent.cloud.huiyansdkface.okhttp3.Headers;
import com.tencent.cloud.huiyansdkface.okhttp3.HttpUrl;
import com.tencent.cloud.huiyansdkface.okhttp3.Interceptor;
import com.tencent.cloud.huiyansdkface.okhttp3.MediaType;
import com.tencent.cloud.huiyansdkface.okhttp3.Response;
import com.tencent.cloud.huiyansdkface.okio.Buffer;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class WeLog implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f11295a = null;

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f11296e = null;
    public boolean b;
    public InnerLogger c;

    /* renamed from: d  reason: collision with root package name */
    public volatile Level f11297d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11298f;

    /* renamed from: g  reason: collision with root package name */
    private Logger f11299g;

    /* renamed from: h  reason: collision with root package name */
    private volatile Set<String> f11300h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11301i;

    /* renamed from: j  reason: collision with root package name */
    private int f11302j;

    /* renamed from: com.tencent.cloud.huiyansdkface.wehttp2.WeLog$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 implements Logger {
        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeLog.Logger
        public final void log(String str) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.wehttp2.WeLog$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends InnerLogger {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ WeLog f11303a;

        public AnonymousClass2(WeLog weLog) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeLog.InnerLogger
        public void log(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f11304a;
        public boolean b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public int f11305d;

        /* renamed from: e  reason: collision with root package name */
        public Level f11306e;

        /* renamed from: f  reason: collision with root package name */
        public ILogTag f11307f;

        /* renamed from: g  reason: collision with root package name */
        private Logger f11308g;

        public WeLog build() {
        }

        public Builder setCutLongStr(boolean z) {
        }

        public Builder setLevel(Level level) {
        }

        public Builder setLogTag(ILogTag iLogTag) {
        }

        public Builder setLogWithTag(boolean z) {
        }

        public Builder setLogger(Logger logger) {
        }

        public Builder setLongStrLength(int i2) {
        }

        public Builder setPrettyLog(boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface ILogTag {
        String tag(HttpUrl httpUrl, Object obj);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class InnerLogger {
        public abstract void log(String str);

        public void print(String str) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Level {
        private static final /* synthetic */ Level[] $VALUES = null;
        public static final Level BASIC = null;
        public static final Level BODY = null;
        public static final Level HEADERS = null;
        public static final Level NONE = null;

        private Level(String str, int i2) {
        }

        public static Level valueOf(String str) {
        }

        public static Level[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface Logger {
        void log(String str);
    }

    public WeLog() {
    }

    public WeLog(Logger logger) {
    }

    public static /* synthetic */ Logger a(WeLog weLog) {
    }

    public static /* synthetic */ void a(WeLog weLog, int i2) {
    }

    public static /* synthetic */ void a(WeLog weLog, boolean z) {
    }

    private void a(String str, Headers headers) {
    }

    private void a(String str, Headers headers, int i2) {
    }

    private void a(String str, String str2) {
    }

    private static boolean a(Headers headers) {
    }

    private static boolean a(MediaType mediaType) {
    }

    private static boolean a(Buffer buffer) {
    }

    private static boolean b(MediaType mediaType) {
    }

    public final Level getLevel() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
    }

    public final WeLog logTag(boolean z) {
    }

    public final WeLog prettyLog(boolean z) {
    }

    public final void redactHeader(String str) {
    }

    public final WeLog setLevel(Level level) {
    }

    public final void setLogger(Logger logger) {
    }
}
