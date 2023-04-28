package cn.sharesdk.framework;

import android.app.Activity;
import android.os.Message;
import cn.sharesdk.framework.utils.j;
import com.mob.tools.utils.DH;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: ShareSDKCoreThread.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class i extends cn.sharesdk.framework.utils.f {
    private a b;
    private HashMap<String, HashMap<String, String>> c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<Platform> f200d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, Integer> f201e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap<Integer, String> f202f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap<Integer, CustomPlatform> f203g;

    /* renamed from: h  reason: collision with root package name */
    private HashMap<Integer, HashMap<String, Object>> f204h;

    /* renamed from: i  reason: collision with root package name */
    private HashMap<Integer, Service> f205i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f206j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f207k;

    /* compiled from: ShareSDKCoreThread.java */
    /* renamed from: cn.sharesdk.framework.i$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f208a;

        public AnonymousClass1(i iVar) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ShareSDKCoreThread.java */
    /* renamed from: cn.sharesdk.framework.i$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareSDKCallback f209a;
        public final /* synthetic */ i b;

        /* compiled from: ShareSDKCoreThread.java */
        /* renamed from: cn.sharesdk.framework.i$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 extends j.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ cn.sharesdk.framework.a.a f210a;
            public final /* synthetic */ String b;
            public final /* synthetic */ AnonymousClass2 c;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, cn.sharesdk.framework.a.a aVar, String str) {
            }

            @Override // cn.sharesdk.framework.utils.j.a
            public void a() throws Throwable {
            }
        }

        public AnonymousClass2(i iVar, ShareSDKCallback shareSDKCallback) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: ShareSDKCoreThread.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f211a = null;
        public static final a b = null;
        private static final /* synthetic */ a[] c = null;

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    public static /* synthetic */ HashMap a(i iVar, cn.sharesdk.framework.a.a aVar, HashMap hashMap, String str) {
    }

    private void h() {
    }

    @Override // cn.sharesdk.framework.utils.f
    public void b(Message message) {
    }

    public boolean b() {
    }

    @Override // cn.sharesdk.framework.utils.f
    public void c() {
    }

    public void d(Class<? extends CustomPlatform> cls) {
    }

    public void e(Class<? extends CustomPlatform> cls) {
    }

    public boolean f() {
    }

    public void g() {
    }

    public static /* synthetic */ void a(i iVar, cn.sharesdk.framework.a.a aVar, ShareSDKCallback shareSDKCallback, String str) {
    }

    public void b(Class<? extends Service> cls) {
    }

    public static /* synthetic */ boolean a(i iVar, HashMap hashMap) {
    }

    public void a(Activity activity) {
    }

    public Activity a() {
    }

    public boolean e() {
    }

    public void a(boolean z) {
    }

    public <T extends Service> T c(Class<T> cls) {
    }

    @Override // cn.sharesdk.framework.utils.f
    public void a(Message message) {
    }

    public void b(int i2) {
    }

    public void b(boolean z) {
    }

    public int b(String str) {
    }

    public Platform[] d() {
    }

    public String c(int i2) {
    }

    public String b(String str, String str2) {
    }

    public void a(Class<? extends Service> cls) {
    }

    public Platform a(String str) {
    }

    public void a(int i2) {
    }

    public void a(int i2, Platform platform) {
    }

    public void a(String str, int i2) {
    }

    public void a(String str, HashMap<String, Object> hashMap) {
    }

    public void a(List<HashMap<String, Object>> list) {
    }

    public void a(String str, String str2) {
    }

    public void a(int i2, int i3) {
    }

    public String a(int i2, String str) {
    }

    public void a(ShareSDKCallback<Boolean> shareSDKCallback) {
    }

    private void a(cn.sharesdk.framework.a.a aVar, ShareSDKCallback<Boolean> shareSDKCallback, String str) {
    }

    private HashMap<String, Object> a(cn.sharesdk.framework.a.a aVar, HashMap<String, Object> hashMap, String str) {
    }

    private boolean a(HashMap<String, Object> hashMap) {
    }

    public void a(String str, boolean z, int i2, String str2, ShareSDKCallback<String> shareSDKCallback) {
    }
}
