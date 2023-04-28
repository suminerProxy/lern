package net.security.device.api;

import android.content.Context;
import net.security.device.api.id.IGAIDGetter;
import net.security.device.api.id.IOAIDGetter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SecurityDevice {
    private static SecurityDevice s_instance;
    private Context ctx;
    private Thread initThread;
    private boolean isInited;
    private Thread otherThread;
    private String userAppKey;

    /* renamed from: net.security.device.api.SecurityDevice$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ SecurityDevice this$0;
        public final /* synthetic */ int val$isIPv6;

        public AnonymousClass1(SecurityDevice securityDevice, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: net.security.device.api.SecurityDevice$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ SecurityDevice this$0;

        public AnonymousClass2(SecurityDevice securityDevice) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: net.security.device.api.SecurityDevice$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass3 implements IOAIDGetter {
        public final /* synthetic */ SecurityDevice this$0;

        public AnonymousClass3(SecurityDevice securityDevice) {
        }

        @Override // net.security.device.api.id.IOAIDGetter
        public void onOAIDGetComplete(String str) {
        }

        @Override // net.security.device.api.id.IOAIDGetter
        public void onOAIDGetError(Exception exc) {
        }
    }

    /* renamed from: net.security.device.api.SecurityDevice$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass4 implements IGAIDGetter {
        public final /* synthetic */ SecurityDevice this$0;

        public AnonymousClass4(SecurityDevice securityDevice) {
        }

        @Override // net.security.device.api.id.IGAIDGetter
        public void onGAIDGetComplete(String str) {
        }

        @Override // net.security.device.api.id.IGAIDGetter
        public void onGAIDGetError(Exception exc) {
        }
    }

    public static /* synthetic */ void access$000(SecurityDevice securityDevice, int i2) {
    }

    public static /* synthetic */ void access$100(SecurityDevice securityDevice) {
    }

    public static /* synthetic */ void access$200(SecurityDevice securityDevice, String str) {
    }

    public static /* synthetic */ void access$300(SecurityDevice securityDevice, String str) {
    }

    private Context getCtx() {
    }

    public static SecurityDevice getInstance() {
    }

    private native SecuritySessionId getSessionIdRaw();

    private native SecuritySession getSessionRaw();

    public static native String gs(String str);

    private void initCommon(Context context, String str, SecurityInitListener securityInitListener, int i2) {
    }

    private native int initRaw(Context context, String str, int i2);

    private native void lxRaw();

    private native void otherThreadInit(Context context, String str);

    private void otherThreadRun() {
    }

    private native void reportUserDataRaw(String str, String str2);

    private void runInit(int i2) {
    }

    private native void setAppKeyRaw(Context context, String str);

    private void setId1(String str) {
    }

    private native void setId1Raw(String str);

    private void setId2(String str) {
    }

    private native void setId2Raw(String str);

    private native void setUrlHost(String str, String str2);

    public boolean getId1() {
    }

    public boolean getId2() {
    }

    public SecuritySession getSession() {
    }

    public SecuritySessionId getSessionId() {
    }

    public void init(Context context, String str, SecurityInitListener securityInitListener) {
    }

    public void initV6(Context context, String str, SecurityInitListener securityInitListener) {
    }

    public void lx() {
    }

    public void reportUserData(int i2, String str) {
    }

    public void setServer(String str, String str2) {
    }
}
