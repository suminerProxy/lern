package com.tencent.tpns.baseapi.core.net;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.tpns.baseapi.base.util.ErrCode;
import com.tencent.tpns.baseapi.base.util.Logger;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f13704a;
    private Context b;

    private a(Context context) {
        this.b = null;
        if (context != null) {
            if (context.getApplicationContext() != null) {
                this.b = context.getApplicationContext();
            } else {
                this.b = context;
            }
        }
    }

    public static a a(Context context) {
        if (f13704a == null) {
            synchronized (a.class) {
                if (f13704a == null) {
                    f13704a = new a(context);
                }
            }
        }
        return f13704a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093 A[Catch: all -> 0x0257, SSLPeerUnverifiedException -> 0x025c, ConnectException -> 0x025e, SocketTimeoutException -> 0x0263, UnknownHostException -> 0x0268, TRY_ENTER, TryCatch #6 {ConnectException -> 0x025e, SocketTimeoutException -> 0x0263, UnknownHostException -> 0x0268, SSLPeerUnverifiedException -> 0x025c, all -> 0x0257, blocks: (B:6:0x0009, B:15:0x0060, B:18:0x0093, B:20:0x00aa, B:22:0x00c0, B:24:0x00e0, B:26:0x00e6, B:28:0x00ed, B:30:0x00f3, B:45:0x0151, B:47:0x0198, B:48:0x01a6, B:50:0x01ac, B:51:0x01bc, B:53:0x01d2, B:54:0x01d5, B:63:0x0250, B:55:0x01d9, B:56:0x0203, B:58:0x0209, B:59:0x0219, B:61:0x022f, B:62:0x024d, B:44:0x0139, B:21:0x00b7, B:14:0x0047), top: B:91:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7 A[Catch: all -> 0x0257, SSLPeerUnverifiedException -> 0x025c, ConnectException -> 0x025e, SocketTimeoutException -> 0x0263, UnknownHostException -> 0x0268, TryCatch #6 {ConnectException -> 0x025e, SocketTimeoutException -> 0x0263, UnknownHostException -> 0x0268, SSLPeerUnverifiedException -> 0x025c, all -> 0x0257, blocks: (B:6:0x0009, B:15:0x0060, B:18:0x0093, B:20:0x00aa, B:22:0x00c0, B:24:0x00e0, B:26:0x00e6, B:28:0x00ed, B:30:0x00f3, B:45:0x0151, B:47:0x0198, B:48:0x01a6, B:50:0x01ac, B:51:0x01bc, B:53:0x01d2, B:54:0x01d5, B:63:0x0250, B:55:0x01d9, B:56:0x0203, B:58:0x0209, B:59:0x0219, B:61:0x022f, B:62:0x024d, B:44:0x0139, B:21:0x00b7, B:14:0x0047), top: B:91:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0198 A[Catch: all -> 0x0257, SSLPeerUnverifiedException -> 0x025c, ConnectException -> 0x025e, SocketTimeoutException -> 0x0263, UnknownHostException -> 0x0268, TryCatch #6 {ConnectException -> 0x025e, SocketTimeoutException -> 0x0263, UnknownHostException -> 0x0268, SSLPeerUnverifiedException -> 0x025c, all -> 0x0257, blocks: (B:6:0x0009, B:15:0x0060, B:18:0x0093, B:20:0x00aa, B:22:0x00c0, B:24:0x00e0, B:26:0x00e6, B:28:0x00ed, B:30:0x00f3, B:45:0x0151, B:47:0x0198, B:48:0x01a6, B:50:0x01ac, B:51:0x01bc, B:53:0x01d2, B:54:0x01d5, B:63:0x0250, B:55:0x01d9, B:56:0x0203, B:58:0x0209, B:59:0x0219, B:61:0x022f, B:62:0x024d, B:44:0x0139, B:21:0x00b7, B:14:0x0047), top: B:91:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d9 A[Catch: all -> 0x0257, SSLPeerUnverifiedException -> 0x025c, ConnectException -> 0x025e, SocketTimeoutException -> 0x0263, UnknownHostException -> 0x0268, TryCatch #6 {ConnectException -> 0x025e, SocketTimeoutException -> 0x0263, UnknownHostException -> 0x0268, SSLPeerUnverifiedException -> 0x025c, all -> 0x0257, blocks: (B:6:0x0009, B:15:0x0060, B:18:0x0093, B:20:0x00aa, B:22:0x00c0, B:24:0x00e0, B:26:0x00e6, B:28:0x00ed, B:30:0x00f3, B:45:0x0151, B:47:0x0198, B:48:0x01a6, B:50:0x01ac, B:51:0x01bc, B:53:0x01d2, B:54:0x01d5, B:63:0x0250, B:55:0x01d9, B:56:0x0203, B:58:0x0209, B:59:0x0219, B:61:0x022f, B:62:0x024d, B:44:0x0139, B:21:0x00b7, B:14:0x0047), top: B:91:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(java.lang.String r9, java.lang.String r10, java.lang.String r11, com.tencent.tpns.baseapi.core.net.HttpRequestCallback r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tpns.baseapi.core.net.a.b(java.lang.String, java.lang.String, java.lang.String, com.tencent.tpns.baseapi.core.net.HttpRequestCallback, boolean):java.lang.String");
    }

    public String a(String str, String str2, String str3, String str4, HttpRequestCallback httpRequestCallback, boolean z) {
        try {
            try {
                return b(str, str3, str4, httpRequestCallback, z);
            } catch (SSLPeerUnverifiedException | Exception e2) {
                if (e2 != null) {
                    Logger.e("HttpRequest", "Http Request Error, Tr: " + e2.toString(), e2);
                    if (httpRequestCallback != null) {
                        try {
                            httpRequestCallback.onFailure(ErrCode.GUID_HTTP_REQ_ERROR_OTHER, "HttpRequest Throw Error:" + e2);
                            return null;
                        } catch (Throwable th) {
                            Logger.e("HttpRequest", "Callback Error, Tr:", th);
                            return null;
                        }
                    }
                    return null;
                }
                return null;
            }
        } catch (SSLPeerUnverifiedException | Exception unused) {
            Logger.e("HttpRequest", "use host url retry");
            return b(str2, str3, str4, httpRequestCallback, z);
        }
    }

    public String a(String str, String str2, String str3, HttpRequestCallback httpRequestCallback, boolean z) {
        try {
            return b(str, str2, str3, httpRequestCallback, z);
        } catch (Exception e2) {
            Logger.e("HttpRequest", "Http Request Error, Tr: " + e2.toString(), e2);
            if (httpRequestCallback != null) {
                try {
                    httpRequestCallback.onFailure(ErrCode.GUID_HTTP_REQ_ERROR_OTHER, "HttpRequest Throw Error:" + e2);
                    return null;
                } catch (Throwable th) {
                    Logger.e("HttpRequest", "Callback Error, Tr:", th);
                    return null;
                }
            }
            return null;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException e2) {
            Logger.e("HttpRequest", "getHostName Exception :", e2);
            return "";
        }
    }
}
