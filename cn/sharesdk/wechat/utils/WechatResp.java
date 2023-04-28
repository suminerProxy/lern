package cn.sharesdk.wechat.utils;

import android.os.Bundle;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class WechatResp {

    /* renamed from: g  reason: collision with root package name */
    public int f414g;

    /* renamed from: h  reason: collision with root package name */
    public String f415h;

    /* renamed from: i  reason: collision with root package name */
    public String f416i;

    /* renamed from: j  reason: collision with root package name */
    public String f417j;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ErrCode {
        public static final int ERR_AUTH_DENIED = -4;
        public static final int ERR_BAN = -6;
        public static final int ERR_COMM = -1;
        public static final int ERR_OK = 0;
        public static final int ERR_SENT_FAILED = -3;
        public static final int ERR_UNSUPPORT = -5;
        public static final int ERR_USER_CANCEL = -2;
    }

    public abstract int a();

    public void a(Bundle bundle) {
    }

    public void b(Bundle bundle) {
    }
}
