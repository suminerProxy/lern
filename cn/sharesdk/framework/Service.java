package cn.sharesdk.framework;

import cn.sharesdk.framework.Platform;
import com.mob.tools.utils.DH;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class Service {

    /* renamed from: cn.sharesdk.framework.Service$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareSDKCallback f84a;
        public final /* synthetic */ Service b;

        public AnonymousClass1(Service service, ShareSDKCallback shareSDKCallback) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class ServiceEvent {
        private static final int PLATFORM = 1;
        public Service service;

        /* renamed from: cn.sharesdk.framework.Service$ServiceEvent$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements DH.DHResponder {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ShareSDKCallback f85a;
            public final /* synthetic */ ServiceEvent b;

            public AnonymousClass1(ServiceEvent serviceEvent, ShareSDKCallback shareSDKCallback) {
            }

            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
            }
        }

        public ServiceEvent(Service service) {
        }

        public HashMap<String, Object> filterShareContent(int i2, Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        }

        public final void toString(ShareSDKCallback<String> shareSDKCallback) {
        }
    }

    @Deprecated
    public String getDeviceKey() {
    }

    public void getDeviceKey(ShareSDKCallback<String> shareSDKCallback) {
    }

    public abstract int getServiceVersionInt();

    public abstract String getServiceVersionName();

    public void onBind() {
    }

    public void onUnbind() {
    }
}
