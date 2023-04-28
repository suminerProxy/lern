package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;

/* compiled from: CoolpadDeviceIdSupplier.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ab implements z {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14679a = "Coolpad";
    private static final String b = "com.coolpad.deviceidsupport";
    private static final String c = "com.coolpad.deviceidsupport.DeviceIdService";

    /* renamed from: d  reason: collision with root package name */
    private static a f14680d;

    /* renamed from: e  reason: collision with root package name */
    private String f14681e;

    /* renamed from: f  reason: collision with root package name */
    private CountDownLatch f14682f;

    /* renamed from: g  reason: collision with root package name */
    private Context f14683g;

    /* renamed from: h  reason: collision with root package name */
    private final ServiceConnection f14684h;

    /* compiled from: CoolpadDeviceIdSupplier.java */
    /* renamed from: com.umeng.analytics.pro.ab$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ab f14685a;

        public AnonymousClass1(ab abVar) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static /* synthetic */ Context a(ab abVar) {
    }

    public static /* synthetic */ String b(ab abVar) {
    }

    public static /* synthetic */ CountDownLatch c(ab abVar) {
    }

    public static /* synthetic */ a a() {
    }

    private void b(Context context) {
    }

    private void c(Context context) {
    }

    public static /* synthetic */ a a(a aVar) {
    }

    public static /* synthetic */ String a(ab abVar, String str) {
    }

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
    }
}
