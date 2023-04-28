package com.tencent.qcloud.tuikit.tuicontact.presenter;

import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GetUserStatusHelper {
    private static final int INTERFACE_CALL_PERIOD = 1000;
    private static final int MAX_USER_LIMIT = 500;
    private static final String TAG = "GetUserStatusHelper";
    private static final GetUserStatusHelper instance = null;
    private Thread getUserStatusThread;
    private final ContactProvider provider;
    private final LinkedBlockingDeque<GetUserStatusTask> taskQueue;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.GetUserStatusHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends Thread {
        public final /* synthetic */ GetUserStatusHelper this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.GetUserStatusHelper$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class C02311 extends IUIKitCallback<Void> {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ GetUserStatusTask val$task;

            public C02311(AnonymousClass1 anonymousClass1, GetUserStatusTask getUserStatusTask) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(Void r1) {
            }
        }

        public AnonymousClass1(GetUserStatusHelper getUserStatusHelper, String str) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class GetUserStatusTask {
        private WeakReference<IUIKitCallback<Void>> callbackWeakReference;
        private List<ContactItemBean> data;

        public static /* synthetic */ boolean access$200(GetUserStatusTask getUserStatusTask) {
        }

        public static /* synthetic */ List access$300(GetUserStatusTask getUserStatusTask) {
        }

        public static /* synthetic */ List access$302(GetUserStatusTask getUserStatusTask, List list) {
        }

        public static /* synthetic */ void access$400(GetUserStatusTask getUserStatusTask) {
        }

        public static /* synthetic */ void access$500(GetUserStatusTask getUserStatusTask, int i2, String str) {
        }

        private void callbackError(int i2, String str) {
        }

        private void callbackSuccess() {
        }

        private boolean isNeedRequest() {
        }

        public void setCallback(IUIKitCallback<Void> iUIKitCallback) {
        }

        public void setLoadedData(List<ContactItemBean> list) {
        }
    }

    private GetUserStatusHelper() {
    }

    public static /* synthetic */ LinkedBlockingDeque access$000(GetUserStatusHelper getUserStatusHelper) {
    }

    public static /* synthetic */ Thread access$102(GetUserStatusHelper getUserStatusHelper, Thread thread) {
    }

    public static /* synthetic */ ContactProvider access$600(GetUserStatusHelper getUserStatusHelper) {
    }

    public static void enqueue(GetUserStatusTask getUserStatusTask) {
    }

    private synchronized void execute() {
    }
}
