package cn.sharesdk.framework;

import android.os.Handler;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ReflectablePlatformActionListener implements PlatformActionListener {

    /* renamed from: a  reason: collision with root package name */
    private int f80a;
    private Handler.Callback b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private Handler.Callback f81d;

    /* renamed from: e  reason: collision with root package name */
    private int f82e;

    /* renamed from: f  reason: collision with root package name */
    private Handler.Callback f83f;

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onCancel(Platform platform, int i2) {
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onComplete(Platform platform, int i2, HashMap<String, Object> hashMap) {
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onError(Platform platform, int i2, Throwable th) {
    }

    public void setOnCancelCallback(int i2, Handler.Callback callback) {
    }

    public void setOnCompleteCallback(int i2, Handler.Callback callback) {
    }

    public void setOnErrorCallback(int i2, Handler.Callback callback) {
    }
}
