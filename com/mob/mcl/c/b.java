package com.mob.mcl.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.mob.tools.utils.DH;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f3758a;
    private Context b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private ScheduledExecutorService f3759d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f3760e;

    /* renamed from: com.mob.mcl.c.b$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f3761a;

        /* renamed from: com.mob.mcl.c.b$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C00941 extends com.mob.tools.utils.b<Void> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f3762a;

            public C00941(AnonymousClass1 anonymousClass1) {
            }

            @Override // com.mob.tools.utils.b
            public /* bridge */ /* synthetic */ void a(Void r1) {
            }

            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void a2(Void r1) {
            }
        }

        public AnonymousClass1(b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mob.mcl.c.b$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f3763a;

        /* renamed from: com.mob.mcl.c.b$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass2 f3764a;

            /* renamed from: com.mob.mcl.c.b$2$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class C00951 extends com.mob.tools.utils.b<Boolean> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass1 f3765a;

                public C00951(AnonymousClass1 anonymousClass1) {
                }

                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void a2(Boolean bool) {
                }

                @Override // com.mob.tools.utils.b
                public /* bridge */ /* synthetic */ void a(Boolean bool) {
                }
            }

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass2(b bVar) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.mob.mcl.c.b$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f3766a;

        /* renamed from: com.mob.mcl.c.b$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Intent f3767a;
            public final /* synthetic */ Context b;
            public final /* synthetic */ AnonymousClass3 c;

            /* renamed from: com.mob.mcl.c.b$3$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class C00961 implements DH.DHResponder {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass1 f3768a;

                public C00961(AnonymousClass1 anonymousClass1) {
                }

                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                }
            }

            public AnonymousClass1(AnonymousClass3 anonymousClass3, Intent intent, Context context) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass3(b bVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* renamed from: com.mob.mcl.c.b$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 extends com.mob.tools.utils.b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.mob.tools.utils.b f3769a;
        public final /* synthetic */ b b;

        public AnonymousClass4(b bVar, com.mob.tools.utils.b bVar2) {
        }

        @Override // com.mob.tools.utils.b
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(Boolean bool) {
        }
    }

    private b() {
    }

    public static /* synthetic */ void a(b bVar, int i2) {
    }

    private void c() {
    }

    private BroadcastReceiver d() {
    }

    public void b() {
    }

    public static /* synthetic */ void a(b bVar, com.mob.tools.utils.b bVar2) {
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
    }

    public static b a() {
    }

    private void a(int i2) {
    }

    private void a(com.mob.tools.utils.b<Void> bVar) {
    }
}
