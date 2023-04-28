package h.u.a.w;

import android.annotation.SuppressLint;
import android.content.Context;
import cn.sharesdk.framework.InnerShareParams;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import com.showstartfans.activity.model.ShareBean;
import h.u.a.t.s2;
import java.io.File;
import java.util.HashMap;

/* compiled from: ShareUtil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class z implements PlatformActionListener {
    private Context b;
    private ShareBean c;

    /* renamed from: d  reason: collision with root package name */
    private h.y.a.h.h f25357d;

    /* renamed from: e  reason: collision with root package name */
    private String f25358e;

    /* renamed from: f  reason: collision with root package name */
    private b f25359f;

    /* compiled from: ShareUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements s2 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25360a;
        public final /* synthetic */ File b;
        public final /* synthetic */ z c;

        public a(z zVar, String str, File file) {
        }

        @Override // h.u.a.t.s2
        public void a(String str, File file) {
        }

        @Override // h.u.a.t.s2
        public void onFailure(String str, String str2) {
        }

        @Override // h.u.a.t.s2
        public void onProgress(int i2) {
        }
    }

    /* compiled from: ShareUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        void onCancel();

        void onFail();

        void onSuccess();
    }

    public z(Context context) {
    }

    public static /* synthetic */ Context a(z zVar) {
    }

    public static /* synthetic */ void b(z zVar, String str, String str2) {
    }

    @SuppressLint({"CheckResult"})
    private void c() {
    }

    public static z d(Context context) {
    }

    private void e(String str, int i2, int i3, String str2) {
    }

    private InnerShareParams f(boolean z, String str, InnerShareParams innerShareParams) {
    }

    public static boolean g(String str) {
    }

    private /* synthetic */ void h(Boolean bool) throws Exception {
    }

    private /* synthetic */ void j(String str, int i2, h.y.a.m.n nVar) {
    }

    private /* synthetic */ void l(int i2, h.y.a.h.h hVar, String str, ShareBean shareBean, Boolean bool) throws Exception {
    }

    private void q() {
    }

    private void r(String str) {
    }

    private void s(String str) {
    }

    private void t(String str) {
    }

    private void u(String str) {
    }

    private void v(String str) {
    }

    private void w(String str, String str2) {
    }

    public /* synthetic */ void i(Boolean bool) {
    }

    public /* synthetic */ void k(String str, int i2, h.y.a.m.n nVar) {
    }

    public /* synthetic */ void m(int i2, h.y.a.h.h hVar, String str, ShareBean shareBean, Boolean bool) {
    }

    public void n(String str) {
    }

    public void o(int i2, String str, h.y.a.h.h hVar, ShareBean shareBean) {
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onCancel(Platform platform, int i2) {
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onComplete(Platform platform, int i2, HashMap<String, Object> hashMap) {
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onError(Platform platform, int i2, Throwable th) {
    }

    @SuppressLint({"CheckResult"})
    public void p(int i2, String str, h.y.a.h.h hVar, ShareBean shareBean, b bVar) {
    }
}
