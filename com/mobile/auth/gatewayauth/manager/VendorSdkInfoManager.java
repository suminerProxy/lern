package com.mobile.auth.gatewayauth.manager;

import android.util.SparseArray;
import com.mobile.auth.gatewayauth.annotations.SafeProtector;
import com.mobile.auth.gatewayauth.manager.e;
import com.mobile.auth.gatewayauth.model.MonitorStruct;
import com.mobile.auth.gatewayauth.model.VendorConfig;
import java.util.concurrent.CountDownLatch;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class VendorSdkInfoManager {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray<VendorConfig> f5001a;
    private SparseArray<VendorConfig> b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private String f5002d;

    /* renamed from: e  reason: collision with root package name */
    private d f5003e;

    /* renamed from: f  reason: collision with root package name */
    private SystemManager f5004f;

    /* renamed from: g  reason: collision with root package name */
    private com.mobile.auth.s.a f5005g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5006h;

    /* renamed from: com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5007a;
        public final /* synthetic */ e b;
        public final /* synthetic */ VendorSdkInfoManager c;

        /* renamed from: com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C01231 implements RequestCallback<Void, String> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CountDownLatch f5008a;
            public final /* synthetic */ AnonymousClass1 b;

            public C01231(AnonymousClass1 anonymousClass1, CountDownLatch countDownLatch) {
            }

            public void a(String str) {
            }

            public void a(Void r1) {
            }

            @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
            public /* synthetic */ void onError(String str) {
            }

            @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
            public /* synthetic */ void onSuccess(Void r1) {
            }
        }

        public AnonymousClass1(VendorSdkInfoManager vendorSdkInfoManager, String str, e eVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements e.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MonitorStruct f5009a;
        public final /* synthetic */ RequestCallback b;
        public final /* synthetic */ VendorSdkInfoManager c;

        public AnonymousClass2(VendorSdkInfoManager vendorSdkInfoManager, MonitorStruct monitorStruct, RequestCallback requestCallback) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.e.a
        public void a(String str, String str2) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.e.a
        public void a(String str, String str2, SparseArray<VendorConfig> sparseArray) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends com.mobile.auth.x.e<VendorConfig> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VendorSdkInfoManager f5010a;

        public AnonymousClass3(VendorSdkInfoManager vendorSdkInfoManager) {
        }
    }

    public VendorSdkInfoManager(d dVar, SystemManager systemManager) {
    }

    public static /* synthetic */ SparseArray a(VendorSdkInfoManager vendorSdkInfoManager) {
    }

    private MonitorStruct a(String str) {
    }

    public static /* synthetic */ void a(VendorSdkInfoManager vendorSdkInfoManager, MonitorStruct monitorStruct) {
    }

    public static /* synthetic */ void a(VendorSdkInfoManager vendorSdkInfoManager, String str) {
    }

    private void a(MonitorStruct monitorStruct) {
    }

    private void a(String[] strArr) {
    }

    private void a(String[] strArr, SparseArray<VendorConfig> sparseArray) {
    }

    public static /* synthetic */ String b(VendorSdkInfoManager vendorSdkInfoManager) {
    }

    private void b(String[] strArr) {
    }

    private void c(String[] strArr) {
    }

    @SafeProtector
    private native void loadVendorConfigsBySceneCodeFromDisk(String str);

    @SafeProtector
    private native void storeVendorConfigsBySceneCodeToDisk(String str);

    public VendorConfig a(int i2) {
    }

    public String a(boolean z) {
    }

    public void a(String str, RequestCallback<Void, String> requestCallback, e eVar) {
    }

    public boolean a() {
    }

    public boolean a(String str, e eVar) {
    }

    public boolean b() {
    }

    public String c() {
    }

    public boolean d() {
    }

    @SafeProtector
    public native void setLocalVendorSdkInfo(String str);
}
