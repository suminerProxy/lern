package cn.sharesdk.framework;

import android.graphics.Bitmap;
import cn.sharesdk.framework.AgreementDialog;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ProvicyCanContinue;
import cn.sharesdk.framework.loopshare.MoblinkActionListener;
import java.util.HashMap;

/* compiled from: PlatformImpl.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private Platform f179a;
    private PlatformDb b;
    private d c;

    /* renamed from: d  reason: collision with root package name */
    private int f180d;

    /* renamed from: e  reason: collision with root package name */
    private int f181e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f182f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f183g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f184h;

    /* compiled from: PlatformImpl.java */
    /* renamed from: cn.sharesdk.framework.f$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements MoblinkActionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Platform.ShareParams f185a;
        public final /* synthetic */ f b;

        /* compiled from: PlatformImpl.java */
        /* renamed from: cn.sharesdk.framework.f$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C00101 extends Thread {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f186a;

            public C00101(AnonymousClass1 anonymousClass1) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(f fVar, Platform.ShareParams shareParams) {
        }

        @Override // cn.sharesdk.framework.loopshare.MoblinkActionListener
        public void onError(Throwable th) {
        }

        @Override // cn.sharesdk.framework.loopshare.MoblinkActionListener
        public void onResult(Object obj) {
        }
    }

    /* compiled from: PlatformImpl.java */
    /* renamed from: cn.sharesdk.framework.f$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements MoblinkActionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Platform.ShareParams f187a;
        public final /* synthetic */ f b;

        /* compiled from: PlatformImpl.java */
        /* renamed from: cn.sharesdk.framework.f$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 extends Thread {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass2 f188a;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass2(f fVar, Platform.ShareParams shareParams) {
        }

        @Override // cn.sharesdk.framework.loopshare.MoblinkActionListener
        public void onError(Throwable th) {
        }

        @Override // cn.sharesdk.framework.loopshare.MoblinkActionListener
        public void onResult(Object obj) {
        }
    }

    /* compiled from: PlatformImpl.java */
    /* renamed from: cn.sharesdk.framework.f$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f189a;

        public AnonymousClass3(f fVar, String str) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: PlatformImpl.java */
    /* renamed from: cn.sharesdk.framework.f$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f190a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ f c;

        /* compiled from: PlatformImpl.java */
        /* renamed from: cn.sharesdk.framework.f$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements ProvicyCanContinue.OnBusinessListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass4 f191a;

            public AnonymousClass1(AnonymousClass4 anonymousClass4) {
            }

            @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
            public void onContinue() {
            }

            @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
            public void onError(Throwable th) {
            }

            @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
            public void onStop() {
            }
        }

        public AnonymousClass4(f fVar, int i2, Object obj) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: PlatformImpl.java */
    /* renamed from: cn.sharesdk.framework.f$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Platform.ShareParams f192a;
        public final /* synthetic */ f b;

        public AnonymousClass5(f fVar, String str, Platform.ShareParams shareParams) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: PlatformImpl.java */
    /* renamed from: cn.sharesdk.framework.f$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 implements AgreementDialog.OnDialogDismiss {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f193a;
        public final /* synthetic */ f b;

        public AnonymousClass6(f fVar, String[] strArr) {
        }

        @Override // cn.sharesdk.framework.AgreementDialog.OnDialogDismiss
        public void consent() {
        }

        @Override // cn.sharesdk.framework.AgreementDialog.OnDialogDismiss
        public void refuse() {
        }
    }

    /* compiled from: PlatformImpl.java */
    /* renamed from: cn.sharesdk.framework.f$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass7 extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f194a;

        public AnonymousClass7(f fVar, String str) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: PlatformImpl.java */
    /* renamed from: cn.sharesdk.framework.f$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass8 extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f195a;
        public final /* synthetic */ f b;

        /* compiled from: PlatformImpl.java */
        /* renamed from: cn.sharesdk.framework.f$8$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements ProvicyCanContinue.OnBusinessListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass8 f196a;

            public AnonymousClass1(AnonymousClass8 anonymousClass8) {
            }

            @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
            public void onContinue() {
            }

            @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
            public void onError(Throwable th) {
            }

            @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
            public void onStop() {
            }
        }

        public AnonymousClass8(f fVar, String[] strArr) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: PlatformImpl.java */
    /* renamed from: cn.sharesdk.framework.f$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass9 implements AgreementDialog.OnDialogDismiss {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Platform.ShareParams f197a;
        public final /* synthetic */ f b;

        public AnonymousClass9(f fVar, Platform.ShareParams shareParams) {
        }

        @Override // cn.sharesdk.framework.AgreementDialog.OnDialogDismiss
        public void consent() {
        }

        @Override // cn.sharesdk.framework.AgreementDialog.OnDialogDismiss
        public void refuse() {
        }
    }

    public f(Platform platform) {
    }

    public static /* synthetic */ Platform a(f fVar) {
    }

    public static /* synthetic */ d b(f fVar) {
    }

    private String b(int i2) {
    }

    public static /* synthetic */ boolean c(f fVar) {
    }

    private boolean j() {
    }

    private String k() {
    }

    public boolean d() {
    }

    public boolean e() {
    }

    public boolean f() {
    }

    public PlatformDb g() {
    }

    public void h() {
    }

    public PlatformActionListener i() {
    }

    public static /* synthetic */ void a(f fVar, Platform.ShareParams shareParams) {
    }

    public static /* synthetic */ void b(f fVar, d dVar, int i2) {
    }

    public PlatformActionListener c() {
    }

    public String d(String str) {
    }

    public static /* synthetic */ void a(f fVar, d dVar, int i2) {
    }

    public int b() {
    }

    public void c(int i2, Object obj) {
    }

    public static /* synthetic */ void a(f fVar, String[] strArr) {
    }

    public void b(int i2, Object obj) {
    }

    public void a(String str) {
    }

    private void c(Platform.ShareParams shareParams) {
    }

    public void c(String str) {
    }

    public int a() {
    }

    public void a(PlatformActionListener platformActionListener) {
    }

    public void a(boolean z) {
    }

    private String a(int i2) {
    }

    public String a(int i2, String str, String str2) {
    }

    public void a(int i2, Object obj) {
    }

    private void a(d dVar, int i2) {
    }

    public void a(Platform.ShareParams shareParams) {
    }

    public void a(String[] strArr) {
    }

    public void a(String str, int i2, int i3) {
    }

    public void a(int i2, int i3, String str) {
    }

    private void b(d dVar, int i2) {
    }

    public void a(String str, String str2, short s, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
    }

    private void b(String[] strArr) {
    }

    public void a(String str, boolean z, ShareSDKCallback<String> shareSDKCallback) {
    }

    public void b(Platform.ShareParams shareParams) {
    }

    public String a(Bitmap bitmap) {
    }

    public String a(String str, boolean z, HashMap<String, String> hashMap) {
    }

    public void b(String str) {
    }
}
