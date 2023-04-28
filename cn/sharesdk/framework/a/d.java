package cn.sharesdk.framework.a;

import android.os.Handler;
import android.os.Message;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.utils.f;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.FileLocker;
import java.io.File;

/* compiled from: StatisticsLogger.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class d extends f {
    private static d b;
    private a c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f146d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f147e;

    /* renamed from: f  reason: collision with root package name */
    private long f148f;

    /* renamed from: g  reason: collision with root package name */
    private File f149g;

    /* renamed from: h  reason: collision with root package name */
    private FileLocker f150h;

    /* compiled from: StatisticsLogger.java */
    /* renamed from: cn.sharesdk.framework.a.d$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f151a;

        public AnonymousClass1(d dVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: StatisticsLogger.java */
    /* renamed from: cn.sharesdk.framework.a.d$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements ShareSDKCallback<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f152a;

        public AnonymousClass2(d dVar) {
        }

        public void a(Boolean bool) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(Boolean bool) {
        }
    }

    /* compiled from: StatisticsLogger.java */
    /* renamed from: cn.sharesdk.framework.a.d$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cn.sharesdk.framework.a.b.c f153a;
        public final /* synthetic */ d b;

        public AnonymousClass3(d dVar, cn.sharesdk.framework.a.b.c cVar) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: StatisticsLogger.java */
    /* renamed from: cn.sharesdk.framework.a.d$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements ShareSDKCallback<cn.sharesdk.framework.a.b.c> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f154a;

        public AnonymousClass4(d dVar) {
        }

        public void a(cn.sharesdk.framework.a.b.c cVar) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(cn.sharesdk.framework.a.b.c cVar) {
        }
    }

    /* compiled from: StatisticsLogger.java */
    /* renamed from: cn.sharesdk.framework.a.d$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cn.sharesdk.framework.a.b.c f155a;
        public final /* synthetic */ ShareSDKCallback b;
        public final /* synthetic */ d c;

        public AnonymousClass5(d dVar, cn.sharesdk.framework.a.b.c cVar, ShareSDKCallback shareSDKCallback) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: StatisticsLogger.java */
    /* renamed from: cn.sharesdk.framework.a.d$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f156a;

        public AnonymousClass6(d dVar) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    private d() {
    }

    public static /* synthetic */ a a(d dVar) {
    }

    public static /* synthetic */ Handler b(d dVar) {
    }

    public static /* synthetic */ Handler c(d dVar) {
    }

    public static synchronized d a() {
    }

    public void b(cn.sharesdk.framework.a.b.c cVar) {
    }

    @Override // cn.sharesdk.framework.utils.f
    public void c(Message message) {
    }

    public void a(Handler handler) {
    }

    @Override // cn.sharesdk.framework.utils.f
    public void a(Message message) {
    }

    @Override // cn.sharesdk.framework.utils.f
    public void b(Message message) {
    }

    private void c(cn.sharesdk.framework.a.b.c cVar) {
    }

    public void a(cn.sharesdk.framework.a.b.c cVar) {
    }

    private void a(cn.sharesdk.framework.a.b.c cVar, ShareSDKCallback<cn.sharesdk.framework.a.b.c> shareSDKCallback) {
    }
}
