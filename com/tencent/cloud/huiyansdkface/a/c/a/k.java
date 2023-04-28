package com.tencent.cloud.huiyansdkface.a.c.a;

import android.hardware.Camera;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class k implements com.tencent.cloud.huiyansdkface.a.e.c {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f10117a;
    private Camera b;
    private com.tencent.cloud.huiyansdkface.a.c.a c;

    /* renamed from: d  reason: collision with root package name */
    private List<com.tencent.cloud.huiyansdkface.a.e.d> f10118d;

    /* renamed from: e  reason: collision with root package name */
    private com.tencent.cloud.huiyansdkface.a.a.a.d f10119e;

    /* renamed from: f  reason: collision with root package name */
    private int f10120f;

    /* renamed from: g  reason: collision with root package name */
    private com.tencent.cloud.huiyansdkface.a.e.b f10121g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f10122h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10123i;

    /* renamed from: com.tencent.cloud.huiyansdkface.a.c.a.k$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.a.c.a.k$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Camera.PreviewCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f10124a;

        /* renamed from: com.tencent.cloud.huiyansdkface.a.c.a.k$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ byte[] f10125a;
            public final /* synthetic */ AnonymousClass2 b;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, byte[] bArr) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass2(k kVar) {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
        }
    }

    public k(com.tencent.cloud.huiyansdkface.a.c.a aVar, Camera camera) {
    }

    public static /* synthetic */ void a(k kVar, com.tencent.cloud.huiyansdkface.a.e.a aVar, byte[] bArr) {
    }

    private void a(com.tencent.cloud.huiyansdkface.a.e.a aVar, byte[] bArr) {
    }

    public static /* synthetic */ boolean a(k kVar) {
    }

    private byte[] a(com.tencent.cloud.huiyansdkface.a.a.a.d dVar) {
    }

    public static /* synthetic */ byte[] a(k kVar, byte[] bArr) {
    }

    public static /* synthetic */ byte[] b(k kVar) {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.a.a.a.d c(k kVar) {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.a.e.b d(k kVar) {
    }

    public static /* synthetic */ ExecutorService d() {
    }

    public static /* synthetic */ int e(k kVar) {
    }

    public int a(int i2, int i3) {
    }

    public void a() {
    }

    @Override // com.tencent.cloud.huiyansdkface.a.e.c
    public void a(com.tencent.cloud.huiyansdkface.a.e.d dVar) {
    }

    @Override // com.tencent.cloud.huiyansdkface.a.e.c
    public void b() {
    }

    @Override // com.tencent.cloud.huiyansdkface.a.e.c
    public void c() {
    }
}
