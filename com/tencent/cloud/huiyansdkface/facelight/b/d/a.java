package com.tencent.cloud.huiyansdkface.facelight.b.d;

import android.content.Context;
import android.hardware.Camera;
import android.view.View;
import com.tencent.cloud.huiyansdkface.a.g.a;
import com.tencent.cloud.huiyansdkface.facelight.b.a.f;
import com.tencent.cloud.huiyansdkface.facelight.net.SendTuringCamToken;
import com.tencent.cloud.huiyansdkface.facelight.net.SendTuringPackage;
import com.tencent.cloud.huiyansdkface.wehttp2.WeReq;
import com.tencent.turingcam.TuringCallback;
import com.tencent.turingcam.view.TuringPreviewDisplay;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private TuringPreviewDisplay f10237a;
    private boolean b;
    private long c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10238d;

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.b.d.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements TuringCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0170a f10239a;
        public final /* synthetic */ a b;

        public AnonymousClass1(a aVar, a.InterfaceC0170a interfaceC0170a) {
        }

        @Override // com.tencent.turingcam.TuringCallback
        public void onException(Throwable th) {
        }

        @Override // com.tencent.turingcam.TuringCallback
        public void onFinish(long j2, byte[] bArr) {
        }

        @Override // com.tencent.turingcam.TuringCallback
        public void onFinishFrameCheck(long j2, byte[] bArr) {
        }

        @Override // com.tencent.turingcam.TuringCallback
        public void onPreviewAvailable() {
        }

        @Override // com.tencent.turingcam.TuringCallback
        public void onPreviewDestroyed() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.b.d.a$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f10240a;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.b.d.a$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends com.tencent.cloud.huiyansdkface.facelight.b.b.b {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass2 f10241a;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, long j2, long j3) {
            }

            @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
            public void a() {
            }

            @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
            public void a(long j2) {
            }
        }

        public AnonymousClass2(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.b.d.a$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements WeReq.Callback<SendTuringPackage.GetFaceCompareTypeResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10242a;
        public final /* synthetic */ a b;

        public AnonymousClass3(a aVar, String str) {
        }

        public void a(WeReq weReq, SendTuringPackage.GetFaceCompareTypeResponse getFaceCompareTypeResponse) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onFailed(WeReq weReq, WeReq.ErrType errType, int i2, String str, IOException iOException) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onFinish() {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onStart(WeReq weReq) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public /* synthetic */ void onSuccess(WeReq weReq, Object obj) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.b.d.a$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements WeReq.Callback<SendTuringCamToken.TuringCamTokenResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f10243a;

        public AnonymousClass4(a aVar) {
        }

        public void a(WeReq weReq, SendTuringCamToken.TuringCamTokenResponse turingCamTokenResponse) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onFailed(WeReq weReq, WeReq.ErrType errType, int i2, String str, IOException iOException) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onFinish() {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onStart(WeReq weReq) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public /* synthetic */ void onSuccess(WeReq weReq, Object obj) {
        }
    }

    public static /* synthetic */ long a(a aVar) {
    }

    public static /* synthetic */ long a(a aVar, long j2) {
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
    }

    public static /* synthetic */ boolean b(a aVar) {
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
    }

    public static /* synthetic */ void c(a aVar) {
    }

    private void d() {
    }

    public static /* synthetic */ void d(a aVar) {
    }

    private void e() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.b.d.b
    public View a(Context context) {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.b.d.b
    public f a() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.b.d.b
    public void a(Camera camera) {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.b.d.b
    public void a(Camera camera, String str) {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.b.d.b
    public void a(a.InterfaceC0170a interfaceC0170a) {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.b.d.b
    public void a(byte[] bArr) {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.b.d.b
    public boolean b() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.b.d.b
    public void c() {
    }
}
