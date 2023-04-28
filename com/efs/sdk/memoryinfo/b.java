package com.efs.sdk.memoryinfo;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final EfsReporter f3165a;
    public boolean b;
    public final Context mContext;

    /* renamed from: com.efs.sdk.memoryinfo.b$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements IConfigCallback {
        public final /* synthetic */ b c;

        /* renamed from: com.efs.sdk.memoryinfo.b$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class HandlerC00531 extends Handler {

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ HandlerThread f3166d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f3167e;

            public HandlerC00531(AnonymousClass1 anonymousClass1, Looper looper, HandlerThread handlerThread) {
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
            }
        }

        /* renamed from: com.efs.sdk.memoryinfo.b$1$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f3168e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Handler f3169f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ int f3170g;

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ int f3171h;

            public AnonymousClass2(AnonymousClass1 anonymousClass1, Handler handler, int i2, int i3) {
            }

            @Override // java.lang.Runnable
            public final void run() {
            }
        }

        public AnonymousClass1(b bVar) {
        }

        @Override // com.efs.sdk.base.observer.IConfigCallback
        public final void onChange(Map<String, Object> map) {
        }
    }

    /* renamed from: com.efs.sdk.memoryinfo.b$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ b c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Handler f3172f;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ long f3173i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ int f3174j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ e f3175k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ String f3176l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ int f3177m;

        public AnonymousClass2(b bVar, long j2, int i2, Handler handler, e eVar, String str, int i3) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public b(Context context, EfsReporter efsReporter) {
    }

    public static /* synthetic */ void a(b bVar, e eVar, String str) {
    }
}
