package com.tencent.tpns.baseapi.core.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.tpns.baseapi.base.util.CacheHelper;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, SharedPreferences> f13680a = null;

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.baseapi.core.a.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CacheHelper.Key[] f13681a;
        public final /* synthetic */ Context b;

        public AnonymousClass1(CacheHelper.Key[] keyArr, Context context) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.baseapi.core.a.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class C0257a {

        /* renamed from: a  reason: collision with root package name */
        private static Handler f13682a;
        private static final Object b = null;
        private static final LinkedList<Runnable> c = null;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f13683d;

        /* renamed from: e  reason: collision with root package name */
        private static final Object f13684e = null;

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.tpns.baseapi.core.a.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class HandlerC0258a extends Handler {

            /* compiled from: ProGuard */
            /* renamed from: com.tencent.tpns.baseapi.core.a.a$a$a$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class AnonymousClass1 extends TTask {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ HandlerC0258a f13685a;

                public AnonymousClass1(HandlerC0258a handlerC0258a) {
                }

                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                }
            }

            public HandlerC0258a(Looper looper) {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
            }
        }

        public static /* synthetic */ void a() {
        }

        private static Handler b() {
        }

        private static void c() {
        }

        public static void a(Runnable runnable, boolean z) {
        }
    }

    public static /* synthetic */ SharedPreferences a(Context context, String str) {
    }

    private static void b(Context context, String str) {
    }

    public static void b(Context context, CacheHelper.Key<?>... keyArr) {
    }

    private static SharedPreferences c(Context context, String str) {
    }

    private static SharedPreferences d(Context context, String str) {
    }

    public static /* synthetic */ void a(SharedPreferences.Editor editor, String str, Object obj) {
    }

    public static void a(Context context, CacheHelper.Key<?>... keyArr) {
    }

    public static <T> T b(Context context, CacheHelper.Key<T> key) {
    }

    private static <T> void b(SharedPreferences.Editor editor, String str, T t) {
    }

    private static boolean a() {
    }

    private static void a(Context context, boolean z, CacheHelper.Key<?>... keyArr) {
    }

    public static <T> T a(Context context, CacheHelper.Key<T> key) {
    }

    private static <T> T a(SharedPreferences sharedPreferences, String str, T t) {
    }
}
