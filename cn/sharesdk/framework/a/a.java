package cn.sharesdk.framework.a;

import android.os.Handler;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.a.e;
import cn.sharesdk.framework.a.b.f;
import com.mob.tools.utils.DH;
import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: EventManager.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f95a;
    private c b;
    private e c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f96d;

    /* compiled from: EventManager.java */
    /* renamed from: cn.sharesdk.framework.a.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareSDKCallback f97a;
        public final /* synthetic */ a b;

        public AnonymousClass1(a aVar, ShareSDKCallback shareSDKCallback) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: EventManager.java */
    /* renamed from: cn.sharesdk.framework.a.a$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements ShareSDKCallback<HashMap<String, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Handler f98a;
        public final /* synthetic */ a b;

        public AnonymousClass2(a aVar, Handler handler) {
        }

        public void a(HashMap<String, Object> hashMap) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(HashMap<String, Object> hashMap) {
        }
    }

    /* compiled from: EventManager.java */
    /* renamed from: cn.sharesdk.framework.a.a$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements ShareSDKCallback<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f.a f99a;
        public final /* synthetic */ f b;
        public final /* synthetic */ a c;

        public AnonymousClass3(a aVar, f.a aVar2, f fVar) {
        }

        public void a(String str) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(String str) {
        }
    }

    /* compiled from: EventManager.java */
    /* renamed from: cn.sharesdk.framework.a.a$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareSDKCallback f100a;
        public final /* synthetic */ String b;
        public final /* synthetic */ a c;

        public AnonymousClass4(a aVar, ShareSDKCallback shareSDKCallback, String str) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: EventManager.java */
    /* renamed from: cn.sharesdk.framework.a.a$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements ShareSDKCallback<HashMap<String, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareSDKCallback f101a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Pattern c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f102d;

        public AnonymousClass5(a aVar, ShareSDKCallback shareSDKCallback, String str, Pattern pattern) {
        }

        public void a(HashMap<String, Object> hashMap) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(HashMap<String, Object> hashMap) {
        }
    }

    private a() {
    }

    public static /* synthetic */ e a(a aVar) {
    }

    public static /* synthetic */ c b(a aVar) {
    }

    private String c(String str) throws Throwable {
    }

    public static /* synthetic */ void a(a aVar, cn.sharesdk.framework.a.b.c cVar) {
    }

    private void b(cn.sharesdk.framework.a.b.c cVar) {
    }

    public static a a() {
    }

    public void a(String str) {
    }

    public void b() {
    }

    public void a(ShareSDKCallback<Boolean> shareSDKCallback) {
    }

    public void a(Handler handler) {
    }

    public HashMap<String, Object> c() {
    }

    public void a(cn.sharesdk.framework.a.b.c cVar) {
    }

    public HashMap<String, Object> b(String str) {
    }

    private void a(cn.sharesdk.framework.a.b.b bVar) throws Throwable {
    }

    private void a(f fVar) throws Throwable {
    }

    private void a(String str, b bVar, ShareSDKCallback<String> shareSDKCallback) throws Throwable {
    }

    private void a(String str, ShareSDKCallback<String> shareSDKCallback) throws Throwable {
    }

    private boolean a(String str, boolean z) throws Throwable {
    }

    public void a(String str, int i2, boolean z, String str2, ShareSDKCallback<String> shareSDKCallback) {
    }

    private void a(String str, String str2, int i2, String str3, ShareSDKCallback<String> shareSDKCallback) throws Throwable {
    }

    public void a(HashMap<String, Object> hashMap) {
    }

    public HashMap<String, Object> a(String str, String str2) {
    }

    public String a(String str, int i2, boolean z, String str2, HashMap<String, String> hashMap) {
    }

    private String a(String str, String str2, int i2, String str3, HashMap<String, String> hashMap) throws Throwable {
    }
}
