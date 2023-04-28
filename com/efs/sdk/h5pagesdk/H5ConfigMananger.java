package com.efs.sdk.h5pagesdk;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class H5ConfigMananger {
    private final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private final int f3132a;
    private EfsReporter b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3133d;
    private Context mContext;

    /* renamed from: com.efs.sdk.h5pagesdk.H5ConfigMananger$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements IConfigCallback {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ H5ConfigMananger f3134e;

        public AnonymousClass1(H5ConfigMananger h5ConfigMananger) {
        }

        @Override // com.efs.sdk.base.observer.IConfigCallback
        public final void onChange(Map<String, Object> map) {
        }
    }

    /* renamed from: com.efs.sdk.h5pagesdk.H5ConfigMananger$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ H5ConfigMananger f3135e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f3136f;

        public AnonymousClass2(H5ConfigMananger h5ConfigMananger, String str) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public H5ConfigMananger(Context context, EfsReporter efsReporter) {
    }

    public static /* synthetic */ int a(H5ConfigMananger h5ConfigMananger) {
    }

    public static /* synthetic */ EfsReporter b(H5ConfigMananger h5ConfigMananger) {
    }

    public String generateLaunchOptions() {
    }

    public boolean isH5TracerEnable() {
    }

    public void sendData(String str) {
    }

    public static /* synthetic */ int a(H5ConfigMananger h5ConfigMananger, int i2) {
    }

    public static /* synthetic */ boolean a(H5ConfigMananger h5ConfigMananger, boolean z) {
    }

    public static /* synthetic */ boolean a(int i2) {
    }
}
