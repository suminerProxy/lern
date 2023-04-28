package com.mob.moblink.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mob.moblink.ActionListener;
import com.mob.moblink.RestoreSceneListener;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.mob.moblink.beans.ConfigData;
import com.mob.moblink.beans.SceneData;
import com.mob.moblink.utils.AsyncProtocol;
import com.mob.moblink.utils.a;
import com.mob.moblink.utils.g;
import com.mob.tools.utils.DH;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: MobLinkImpl.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class f {

    /* renamed from: l  reason: collision with root package name */
    private static int f3920l;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f3921m;

    /* renamed from: n  reason: collision with root package name */
    private static volatile boolean f3922n;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, RestoreSceneListener> f3923a;
    private SceneRestorable b;
    private volatile boolean c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f3924d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Integer f3925e;

    /* renamed from: f  reason: collision with root package name */
    private com.mob.moblink.utils.a f3926f;

    /* renamed from: g  reason: collision with root package name */
    private C0107f f3927g;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference<Activity> f3928h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<Class<? extends Activity>> f3929i;

    /* renamed from: j  reason: collision with root package name */
    private g f3930j;

    /* renamed from: k  reason: collision with root package name */
    private h f3931k;

    /* compiled from: MobLinkImpl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f3932a;
        public final /* synthetic */ Intent b;
        public final /* synthetic */ f c;

        /* compiled from: MobLinkImpl.java */
        /* renamed from: com.mob.moblink.utils.f$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class HandlerC0105a extends Handler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f3933a;

            public HandlerC0105a(a aVar, Looper looper) {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
            }
        }

        /* compiled from: MobLinkImpl.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Handler f3934a;
            public final /* synthetic */ a b;

            /* compiled from: MobLinkImpl.java */
            /* renamed from: com.mob.moblink.utils.f$a$b$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class RunnableC0106a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ b f3935a;

                public RunnableC0106a(b bVar) {
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            }

            public b(a aVar, Handler handler) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(f fVar, Activity activity, Intent intent) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: MobLinkImpl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class b extends g.a {
        public b(f fVar) {
        }

        @Override // com.mob.moblink.utils.g.a
        public void a() throws Throwable {
        }
    }

    /* compiled from: MobLinkImpl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f3936a;
        public final /* synthetic */ SceneRestorable b;
        public final /* synthetic */ f c;

        public c(f fVar, Activity activity, SceneRestorable sceneRestorable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: MobLinkImpl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class d implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f3937a;
        public final /* synthetic */ Activity b;

        public d(f fVar, Intent intent, Activity activity) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: MobLinkImpl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class e implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f3938a;

        public e(f fVar, Activity activity) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: MobLinkImpl.java */
    /* renamed from: com.mob.moblink.utils.f$f  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class C0107f extends a.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f3939a;

        private C0107f(f fVar) {
        }

        @Override // com.mob.moblink.utils.a.b
        public void a(boolean z) {
        }

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onCreated(Activity activity, Bundle bundle) {
        }

        @Override // com.mob.moblink.utils.a.b, com.mob.tools.utils.ActivityTracker.Tracker
        public void onResumed(Activity activity) {
        }

        public /* synthetic */ C0107f(f fVar, a aVar) {
        }
    }

    /* compiled from: MobLinkImpl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class g extends AsyncProtocol.b<ConfigData> {
        private com.mob.moblink.utils.d b;
        public final /* synthetic */ f c;

        private g(f fVar) {
        }

        public static /* synthetic */ com.mob.moblink.utils.d a(g gVar, com.mob.moblink.utils.d dVar) {
        }

        @Override // com.mob.moblink.utils.AsyncProtocol.b, com.mob.moblink.utils.AsyncProtocol.DataListener
        public /* bridge */ /* synthetic */ void onReceiveData(Object obj) {
        }

        public /* synthetic */ g(f fVar, a aVar) {
        }

        public void a(ConfigData configData) {
        }
    }

    /* compiled from: MobLinkImpl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class h extends AsyncProtocol.b<SceneData> {
        private com.mob.moblink.utils.d b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ f f3940d;

        private h(f fVar) {
        }

        public static /* synthetic */ com.mob.moblink.utils.d a(h hVar, com.mob.moblink.utils.d dVar) {
        }

        @Override // com.mob.moblink.utils.AsyncProtocol.b, com.mob.moblink.utils.AsyncProtocol.DataListener
        public /* bridge */ /* synthetic */ void onReceiveData(Object obj) {
        }

        public /* synthetic */ h(f fVar, a aVar) {
        }

        public void a(int i2) {
        }

        public void a(SceneData sceneData) {
        }
    }

    public static /* synthetic */ void a(f fVar, Intent intent) {
    }

    public static /* synthetic */ void b(f fVar, Activity activity, Intent intent) {
    }

    public static /* synthetic */ C0107f c(f fVar) {
    }

    public static /* synthetic */ WeakReference d(f fVar) {
    }

    public static /* synthetic */ void e(f fVar) {
    }

    public static /* synthetic */ void f(f fVar) {
    }

    private boolean g() {
    }

    public static /* synthetic */ Integer a(f fVar) {
    }

    public static /* synthetic */ boolean b(f fVar, Intent intent) {
    }

    public static /* synthetic */ void c(f fVar, Activity activity, Intent intent) {
    }

    private boolean d(Intent intent) {
    }

    private void e(Intent intent, Activity activity) {
    }

    private void f(Intent intent, Activity activity) {
    }

    public static /* synthetic */ Integer a(f fVar, Integer num) {
    }

    public static /* synthetic */ void b(f fVar, Intent intent, Activity activity) {
    }

    public static /* synthetic */ int c() {
    }

    private void g(Intent intent, Activity activity) {
    }

    public static /* synthetic */ void a(f fVar, String str, Intent intent, Activity activity) {
    }

    public static /* synthetic */ com.mob.moblink.utils.a b(f fVar) {
    }

    private boolean c(Intent intent) {
    }

    public static /* synthetic */ void a(f fVar, Intent intent, Activity activity) {
    }

    public static /* synthetic */ int b() {
    }

    private void d() {
    }

    private String f() {
    }

    public static /* synthetic */ void a(f fVar, Activity activity, Intent intent) {
    }

    private boolean b(Intent intent) {
    }

    private void d(Intent intent, Activity activity) {
    }

    private void e(Intent intent) {
    }

    public static /* synthetic */ com.mob.moblink.utils.a a(f fVar, com.mob.moblink.utils.a aVar) {
    }

    public static /* synthetic */ boolean a() {
    }

    public static /* synthetic */ boolean a(boolean z) {
    }

    public static /* synthetic */ void a(f fVar, Activity activity, SceneRestorable sceneRestorable) {
    }

    public static /* synthetic */ void a(f fVar, Intent intent, Activity activity, boolean z) {
    }

    private void e() {
    }

    public static /* synthetic */ void a(f fVar, Intent intent, Activity activity, SceneData.Res res, int i2) {
    }

    private void b(boolean z) {
    }

    private void c(Activity activity, Intent intent) {
    }

    public static /* synthetic */ void a(f fVar, boolean z) {
    }

    public void a(RestoreSceneListener restoreSceneListener) {
    }

    public void b(String str, Scene scene) {
    }

    private void b(Intent intent, Activity activity) {
    }

    public Class c(String str, Scene scene) {
    }

    public void a(String str, RestoreSceneListener restoreSceneListener) {
    }

    private void b(Activity activity, SceneRestorable sceneRestorable) {
    }

    private void c(Intent intent, Activity activity) {
    }

    public void a(Scene scene, ActionListener<String> actionListener) {
    }

    private void a(Intent intent, Activity activity, boolean z) {
    }

    private void b(Activity activity, Intent intent) {
    }

    private void a(String str, Intent intent, Activity activity) {
    }

    public void a(Class<? extends Activity>... clsArr) {
    }

    private boolean a(Intent intent) {
    }

    public void a(Intent intent, Activity activity) {
    }

    private void a(Activity activity, Intent intent) {
    }

    private Class a(SceneData.Res res, int i2) {
    }

    public void a(String str, Scene scene) {
    }

    private RestoreSceneListener a(String str) {
    }

    private void a(Intent intent, Activity activity, SceneData.Res res, int i2) {
    }

    private void a(Activity activity, Class cls, Intent intent) {
    }

    private Uri a(SceneData.Res res) {
    }

    public void a(Activity activity, SceneRestorable sceneRestorable) {
    }

    private void a(Activity activity) {
    }
}
