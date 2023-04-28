package com.tencent.liteav.txcplayer.b;

import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class a {
    public static final String TAG = "com.tencent.liteav.txcplayer.b.a";
    public InterfaceC0195a mDownloadListener;
    public String mDownloadPath;
    public Map<String, String> mHeaders;

    /* renamed from: com.tencent.liteav.txcplayer.b.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface InterfaceC0195a {
        void a(b bVar);

        void a(b bVar, int i2, String str);

        void b(b bVar);

        void c(b bVar);

        void d(b bVar);
    }

    public abstract boolean deleteDownloadFile(String str);

    public abstract int downloadHls(String str, String str2);

    public abstract String makePlayPath(String str);

    public String makePlayPathDir(String str) {
    }

    public void setDownloadPath(String str) {
    }

    public void setHeaders(Map<String, String> map) {
    }

    public void setListener(InterfaceC0195a interfaceC0195a) {
    }

    public abstract void stop(int i2);
}
