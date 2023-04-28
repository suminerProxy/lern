package cn.sharesdk.sina.weibo.utils;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.authorize.SSOAuthorizeActivity;
import cn.sharesdk.framework.authorize.SSOListener;
import cn.sharesdk.framework.authorize.c;
import com.mob.tools.utils.DH;

/* compiled from: SinaWeiboSSOProcessor.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class b extends c implements ServiceConnection {

    /* renamed from: d  reason: collision with root package name */
    private String f314d;

    /* renamed from: e  reason: collision with root package name */
    private String f315e;

    /* renamed from: f  reason: collision with root package name */
    private String[] f316f;

    /* compiled from: SinaWeiboSSOProcessor.java */
    /* renamed from: cn.sharesdk.sina.weibo.utils.b$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ShareSDKCallback<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f317a;

        public AnonymousClass1(b bVar) {
        }

        public void a(Boolean bool) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(Boolean bool) {
        }
    }

    /* compiled from: SinaWeiboSSOProcessor.java */
    /* renamed from: cn.sharesdk.sina.weibo.utils.b$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements ShareSDKCallback<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f318a;
        public final /* synthetic */ ShareSDKCallback b;
        public final /* synthetic */ b c;

        public AnonymousClass2(b bVar, Intent intent, ShareSDKCallback shareSDKCallback) {
        }

        public void a(Boolean bool) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(Boolean bool) {
        }
    }

    /* compiled from: SinaWeiboSSOProcessor.java */
    /* renamed from: cn.sharesdk.sina.weibo.utils.b$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareSDKCallback f319a;
        public final /* synthetic */ b b;

        /* compiled from: SinaWeiboSSOProcessor.java */
        /* renamed from: cn.sharesdk.sina.weibo.utils.b$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements DH.DHResponder {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass3 f320a;

            public AnonymousClass1(AnonymousClass3 anonymousClass3) {
            }

            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
            }
        }

        public AnonymousClass3(b bVar, ShareSDKCallback shareSDKCallback) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    public b(SSOAuthorizeActivity sSOAuthorizeActivity) {
    }

    public static /* synthetic */ SSOAuthorizeActivity a(b bVar) {
    }

    public static /* synthetic */ SSOListener b(b bVar) {
    }

    public static /* synthetic */ SSOListener c(b bVar) {
    }

    public static /* synthetic */ int d(b bVar) {
    }

    public static /* synthetic */ SSOAuthorizeActivity e(b bVar) {
    }

    public static /* synthetic */ SSOAuthorizeActivity f(b bVar) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    private void b(Intent intent) {
    }

    private void c(Intent intent) {
    }

    public void a(String str, String str2, String[] strArr) {
    }

    @Override // cn.sharesdk.framework.authorize.c
    public void a() {
    }

    private void a(String str, String str2, ShareSDKCallback<Boolean> shareSDKCallback) {
    }

    private void a(Intent intent, ShareSDKCallback<Boolean> shareSDKCallback) {
    }

    @Override // cn.sharesdk.framework.authorize.c
    public void a(int i2, int i3, Intent intent) {
    }
}
