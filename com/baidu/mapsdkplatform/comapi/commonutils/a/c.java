package com.baidu.mapsdkplatform.comapi.commonutils.a;

import java.io.File;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* compiled from: FileDownloadUtil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private ExecutorService f2284a;
    private int b;
    private List<com.baidu.mapsdkplatform.comapi.commonutils.a.b> c;

    /* renamed from: d  reason: collision with root package name */
    private InterfaceC0037c f2285d;

    /* compiled from: FileDownloadUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f2286a;
        private File b;

        public /* synthetic */ a(c cVar, File file, com.baidu.mapsdkplatform.comapi.commonutils.a.d dVar) {
        }

        @Override // com.baidu.mapsdkplatform.comapi.commonutils.a.c.b
        public void a(com.baidu.mapsdkplatform.comapi.commonutils.a.b bVar) {
        }

        @Override // com.baidu.mapsdkplatform.comapi.commonutils.a.c.b
        public void b(com.baidu.mapsdkplatform.comapi.commonutils.a.b bVar) {
        }

        private a(c cVar, File file) {
        }
    }

    /* compiled from: FileDownloadUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface b {
        void a(com.baidu.mapsdkplatform.comapi.commonutils.a.b bVar);

        void b(com.baidu.mapsdkplatform.comapi.commonutils.a.b bVar);
    }

    /* compiled from: FileDownloadUtil.java */
    /* renamed from: com.baidu.mapsdkplatform.comapi.commonutils.a.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface InterfaceC0037c {
        void a();

        void a(File file);
    }

    /* compiled from: FileDownloadUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class d implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
        }
    }

    public static /* synthetic */ List a(c cVar) {
    }

    public static /* synthetic */ InterfaceC0037c b(c cVar) {
    }

    public void a(String str, String str2, String str3, int i2, InterfaceC0037c interfaceC0037c) {
    }

    private void a(String str, String str2, String str3) {
    }

    private void a(String str, File file, int i2, int i3) {
    }

    private HttpURLConnection a(String str) {
    }
}
