package cn.sharesdk.onekeyshare;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class OnekeyShareThemeImpl implements PlatformActionListener, Handler.Callback {
    public PlatformActionListener callback;
    public Context context;
    public ArrayList<CustomerLogo> customerLogos;
    public ShareContentCustomizeCallback customizeCallback;
    public boolean dialogMode;
    public boolean disableSSO;
    public HashMap<String, String> hiddenPlatforms;
    public HashMap<String, Object> shareParamsMap;
    public boolean silent;

    /* renamed from: cn.sharesdk.onekeyshare.OnekeyShareThemeImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ OnekeyShareThemeImpl this$0;
        public final /* synthetic */ String val$resOrName;

        public AnonymousClass1(OnekeyShareThemeImpl onekeyShareThemeImpl, String str) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    private void prepareForEditPage(Platform platform) {
    }

    private void toast(String str) {
    }

    public final void disableSSO() {
    }

    public final boolean formateShareData(Platform platform) {
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
    }

    public final boolean isUseClientToShare(Platform platform) {
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public final void onCancel(Platform platform, int i2) {
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public final void onComplete(Platform platform, int i2, HashMap<String, Object> hashMap) {
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public final void onError(Platform platform, int i2, Throwable th) {
    }

    public final void setCustomerLogos(ArrayList<CustomerLogo> arrayList) {
    }

    public final void setDialogMode(boolean z) {
    }

    public final void setHiddenPlatforms(HashMap<String, String> hashMap) {
    }

    public final void setPlatformActionListener(PlatformActionListener platformActionListener) {
    }

    public final void setShareContentCustomizeCallback(ShareContentCustomizeCallback shareContentCustomizeCallback) {
    }

    public final void setShareParamsMap(HashMap<String, Object> hashMap) {
    }

    public final void setSilent(boolean z) {
    }

    public final Platform.ShareParams shareDataToShareParams(Platform platform) {
    }

    public final void shareSilently(Platform platform) {
    }

    public final void show(Context context) {
    }

    public abstract void showEditPage(Context context, Platform platform, Platform.ShareParams shareParams);

    public abstract void showPlatformPage(Context context);
}
