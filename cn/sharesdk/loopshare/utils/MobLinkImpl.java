package cn.sharesdk.loopshare.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import cn.sharesdk.loopshare.ActionListener;
import cn.sharesdk.loopshare.RestoreSceneListener;
import cn.sharesdk.loopshare.Scene;
import cn.sharesdk.loopshare.SceneRestorable;
import cn.sharesdk.loopshare.beans.ConfigData;
import cn.sharesdk.loopshare.beans.SceneData;
import cn.sharesdk.loopshare.utils.AppStatus;
import cn.sharesdk.loopshare.utils.AsyncProtocol;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MobLinkImpl {

    /* renamed from: a  reason: collision with root package name */
    private static int f245a;
    private HashMap<String, RestoreSceneListener> b;
    private SceneRestorable c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f246d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f247e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Integer f248f;

    /* renamed from: g  reason: collision with root package name */
    private AppStatus f249g;

    /* renamed from: h  reason: collision with root package name */
    private AppListener f250h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<Class<? extends Activity>> f251i;

    /* renamed from: j  reason: collision with root package name */
    private a f252j;

    /* renamed from: k  reason: collision with root package name */
    private b f253k;

    /* renamed from: l  reason: collision with root package name */
    private WeakReference<Activity> f254l;

    /* renamed from: cn.sharesdk.loopshare.utils.MobLinkImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f255a;
        public final /* synthetic */ Intent b;
        public final /* synthetic */ MobLinkImpl c;

        /* renamed from: cn.sharesdk.loopshare.utils.MobLinkImpl$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class HandlerC00121 extends Handler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f256a;

            public HandlerC00121(AnonymousClass1 anonymousClass1, Looper looper) {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
            }
        }

        /* renamed from: cn.sharesdk.loopshare.utils.MobLinkImpl$1$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Handler f257a;
            public final /* synthetic */ AnonymousClass1 b;

            /* renamed from: cn.sharesdk.loopshare.utils.MobLinkImpl$1$2$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
            public class RunnableC00131 implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass2 f258a;

                public RunnableC00131(AnonymousClass2 anonymousClass2) {
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            }

            public AnonymousClass2(AnonymousClass1 anonymousClass1, Handler handler) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(MobLinkImpl mobLinkImpl, Activity activity, Intent intent) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: cn.sharesdk.loopshare.utils.MobLinkImpl$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f259a;
        public final /* synthetic */ SceneRestorable b;
        public final /* synthetic */ MobLinkImpl c;

        public AnonymousClass2(MobLinkImpl mobLinkImpl, Activity activity, SceneRestorable sceneRestorable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AppListener extends AppStatus.OnAppStatusListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MobLinkImpl f260a;

        private AppListener(MobLinkImpl mobLinkImpl) {
        }

        @Override // cn.sharesdk.loopshare.utils.AppStatus.OnAppStatusListener
        public void onAppStatusChanged(boolean z) {
        }

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onCreated(Activity activity, Bundle bundle) {
        }

        @Override // cn.sharesdk.loopshare.utils.AppStatus.OnAppStatusListener, com.mob.tools.utils.ActivityTracker.Tracker
        public void onResumed(Activity activity) {
        }

        public /* synthetic */ AppListener(MobLinkImpl mobLinkImpl, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a extends AsyncProtocol.a<ConfigData> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MobLinkImpl f261a;
        private cn.sharesdk.loopshare.utils.b b;

        private a(MobLinkImpl mobLinkImpl) {
        }

        public static /* synthetic */ cn.sharesdk.loopshare.utils.b a(a aVar, cn.sharesdk.loopshare.utils.b bVar) {
        }

        @Override // cn.sharesdk.loopshare.utils.AsyncProtocol.a, cn.sharesdk.loopshare.utils.AsyncProtocol.DataListener
        public /* synthetic */ void onReceiveData(Object obj) {
        }

        public /* synthetic */ a(MobLinkImpl mobLinkImpl, AnonymousClass1 anonymousClass1) {
        }

        public void a(ConfigData configData) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b extends AsyncProtocol.a<SceneData> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MobLinkImpl f262a;
        private cn.sharesdk.loopshare.utils.b b;
        private int c;

        private b(MobLinkImpl mobLinkImpl) {
        }

        public static /* synthetic */ cn.sharesdk.loopshare.utils.b a(b bVar, cn.sharesdk.loopshare.utils.b bVar2) {
        }

        @Override // cn.sharesdk.loopshare.utils.AsyncProtocol.a, cn.sharesdk.loopshare.utils.AsyncProtocol.DataListener
        public /* synthetic */ void onReceiveData(Object obj) {
        }

        public /* synthetic */ b(MobLinkImpl mobLinkImpl, AnonymousClass1 anonymousClass1) {
        }

        public void a(int i2) {
        }

        public void a(SceneData sceneData) {
        }
    }

    public static /* synthetic */ int a() {
    }

    public static /* synthetic */ int b() {
    }

    public static /* synthetic */ AppListener c(MobLinkImpl mobLinkImpl) {
    }

    public static /* synthetic */ AppStatus d(MobLinkImpl mobLinkImpl) {
    }

    public static /* synthetic */ WeakReference e(MobLinkImpl mobLinkImpl) {
    }

    private void f(Intent intent, Activity activity) {
    }

    private void g(Intent intent, Activity activity) {
    }

    public static /* synthetic */ AppStatus a(MobLinkImpl mobLinkImpl, AppStatus appStatus) {
    }

    public static /* synthetic */ Integer b(MobLinkImpl mobLinkImpl) {
    }

    public static /* synthetic */ void c(MobLinkImpl mobLinkImpl, Activity activity, Intent intent) {
    }

    private boolean d(Intent intent) {
    }

    private String e() {
    }

    public static /* synthetic */ Integer a(MobLinkImpl mobLinkImpl, Integer num) {
    }

    public static /* synthetic */ void b(MobLinkImpl mobLinkImpl, Activity activity, Intent intent) {
    }

    private void c(Intent intent, Activity activity) {
    }

    private void e(Intent intent, Activity activity) {
    }

    public static /* synthetic */ void a(MobLinkImpl mobLinkImpl) {
    }

    public static /* synthetic */ void b(MobLinkImpl mobLinkImpl, Intent intent, Activity activity) {
    }

    public static /* synthetic */ void a(MobLinkImpl mobLinkImpl, Activity activity, Intent intent) {
    }

    private void b(Intent intent, Activity activity) {
    }

    public static /* synthetic */ void a(MobLinkImpl mobLinkImpl, Activity activity, SceneRestorable sceneRestorable) {
    }

    private boolean c() {
    }

    public static /* synthetic */ void a(MobLinkImpl mobLinkImpl, Intent intent, Activity activity) {
    }

    public static /* synthetic */ void a(MobLinkImpl mobLinkImpl, Intent intent, Activity activity, SceneData.Res res, int i2) {
    }

    private boolean c(Intent intent) {
    }

    public static /* synthetic */ void a(MobLinkImpl mobLinkImpl, Intent intent, Activity activity, boolean z) {
    }

    private boolean b(Intent intent) {
    }

    private void d() {
    }

    public static /* synthetic */ void a(MobLinkImpl mobLinkImpl, String str, Intent intent, Activity activity) {
    }

    private void d(Intent intent, Activity activity) {
    }

    public void c(String str, Scene scene) {
    }

    public static /* synthetic */ void a(MobLinkImpl mobLinkImpl, boolean z) {
    }

    public static /* synthetic */ boolean a(MobLinkImpl mobLinkImpl, Intent intent) {
    }

    private void c(Activity activity, Intent intent) {
    }

    public void a(RestoreSceneListener restoreSceneListener) {
    }

    private void b(Activity activity, Intent intent) {
    }

    public void a(String str, RestoreSceneListener restoreSceneListener) {
    }

    public void b(String str, Scene scene) {
    }

    private void b(Activity activity, SceneRestorable sceneRestorable) {
    }

    public void a(Scene scene, ActionListener<String> actionListener) {
    }

    private void a(Intent intent, Activity activity, boolean z) {
    }

    private boolean a(Intent intent) {
    }

    private void a(String str, Intent intent, Activity activity) {
    }

    public void a(Class<? extends Activity>... clsArr) {
    }

    private void a(boolean z) {
    }

    public void a(Intent intent, Activity activity) {
    }

    private void a(Activity activity, Intent intent) {
    }

    private Class a(SceneData.Res res, int i2) {
    }

    public Class a(String str, Scene scene) {
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

    private String a(Context context) {
    }

    private void a(Activity activity) {
    }
}
