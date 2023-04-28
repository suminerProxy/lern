package org.repackage.com.zui.opendeviceidlibrary;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import org.repackage.com.zui.deviceidservice.IDeviceidInterface;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class OpenDeviceId {
    private static String c = "OpenDeviceId library";

    /* renamed from: d  reason: collision with root package name */
    private static boolean f29948d;

    /* renamed from: a  reason: collision with root package name */
    private Context f29949a;
    private IDeviceidInterface b;

    /* renamed from: e  reason: collision with root package name */
    private ServiceConnection f29950e;

    /* renamed from: f  reason: collision with root package name */
    private CallBack f29951f;

    /* renamed from: org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OpenDeviceId f29952a;

        public AnonymousClass1(OpenDeviceId openDeviceId) {
        }

        @Override // android.content.ServiceConnection
        public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface CallBack<T> {
        void a(T t, OpenDeviceId openDeviceId);
    }

    public static /* synthetic */ IDeviceidInterface a(OpenDeviceId openDeviceId, IDeviceidInterface iDeviceidInterface) {
    }

    public String b() {
    }

    public boolean c() {
    }

    public String d() {
    }

    public String e() {
    }

    public void f() {
    }

    public static /* synthetic */ CallBack a(OpenDeviceId openDeviceId) {
    }

    public static /* synthetic */ void a(OpenDeviceId openDeviceId, String str) {
    }

    public int a(Context context, CallBack<String> callBack) {
    }

    private void b(String str) {
    }

    public String a() {
    }

    public void a(boolean z) {
    }

    private void a(String str) {
    }
}
