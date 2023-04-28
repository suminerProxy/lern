package com.showstartfans.activity.base;

import android.os.Handler;
import android.os.Message;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import com.showstartfans.activity.model.UserInfoBean;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.u.a.m.b;
import h.y.a.m.n;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class BaseThirdLoginActivity extends BaseSendCodeActivity {

    /* renamed from: h  reason: collision with root package name */
    public final int f6492h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6493i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6494j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6495k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6496l;

    /* renamed from: m  reason: collision with root package name */
    private int f6497m;

    /* renamed from: n  reason: collision with root package name */
    private Handler f6498n;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements PlatformActionListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ BaseThirdLoginActivity c;

        public a(BaseThirdLoginActivity baseThirdLoginActivity, int i2) {
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
    }

    public static /* synthetic */ Handler O(BaseThirdLoginActivity baseThirdLoginActivity) {
    }

    public static /* synthetic */ BaseNewFunctionActivity P(BaseThirdLoginActivity baseThirdLoginActivity) {
    }

    private void Q(String str, int i2, b bVar) {
    }

    private /* synthetic */ void R(b bVar, int i2, n nVar) {
    }

    private /* synthetic */ boolean T(Message message) {
    }

    private /* synthetic */ void V(String str, String str2, int i2, String str3, n nVar) {
    }

    private void Y(int i2) {
    }

    private void a0(String str, int i2) {
    }

    private void b0(String str, String str2, int i2, int i3, String str3, String str4) {
    }

    @Override // com.showstartfans.activity.base.BaseSendCodeActivity
    public void J(UserInfoBean userInfoBean, String str) {
    }

    public /* synthetic */ void S(b bVar, int i2, n nVar) {
    }

    public /* synthetic */ boolean U(Message message) {
    }

    public /* synthetic */ void W(String str, String str2, int i2, String str3, n nVar) {
    }

    public void X(String str, String str2, int i2, String str3, UserInfoBean userInfoBean) {
    }

    public void Z(int i2) {
    }
}
