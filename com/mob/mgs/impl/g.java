package com.mob.mgs.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.mob.mgs.OnAppActiveListener;
import com.mob.tools.utils.DH;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static OnAppActiveListener f3876a = null;
    private static int b = 1;
    private static volatile boolean c;

    /* renamed from: com.mob.mgs.impl.g$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f3877a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Context c;

        /* renamed from: com.mob.mgs.impl.g$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C00981 implements Handler.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f3878a;
            public final /* synthetic */ AnonymousClass1 b;

            public C00981(AnonymousClass1 anonymousClass1, String str) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        /* renamed from: com.mob.mgs.impl.g$1$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends h {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f3879a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ String f3880d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ String f3881e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f3882f;

            public AnonymousClass2(AnonymousClass1 anonymousClass1, String str, String str2, String str3, String str4, String str5) {
            }

            @Override // com.mob.mgs.impl.h
            public void a() throws Throwable {
            }
        }

        /* renamed from: com.mob.mgs.impl.g$1$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass3 implements Handler.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f3883a;

            /* renamed from: com.mob.mgs.impl.g$1$3$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class C00991 implements DH.DHResponder {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass3 f3884a;

                public C00991(AnonymousClass3 anonymousClass3) {
                }

                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                }
            }

            public AnonymousClass3(AnonymousClass1 anonymousClass1) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        public AnonymousClass1(Intent intent, boolean z, Context context) {
        }

        @Override // com.mob.mgs.impl.h
        public void a() throws Throwable {
        }
    }

    public static /* synthetic */ int a(int i2) {
    }

    public static /* synthetic */ int b() {
    }

    public static /* synthetic */ OnAppActiveListener c() {
    }

    public static /* synthetic */ boolean a() {
    }

    public static /* synthetic */ boolean a(boolean z) {
    }

    public static void a(Context context, Intent intent, boolean z) {
    }

    public static void a(OnAppActiveListener onAppActiveListener) {
    }
}
