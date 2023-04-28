package com.tencent.ugc;

import android.content.Context;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXUGCBase {
    private static TXUGCBaseListener mListener;
    private static TXUGCBase sInstance;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class TXUGCBaseListener {
        public abstract void onLicenceLoaded(int i2, String str);
    }

    private TXUGCBase() {
    }

    public static TXUGCBase getInstance() {
    }

    public static /* synthetic */ void lambda$setListener$0(int i2, String str) {
    }

    public static void setListener(TXUGCBaseListener tXUGCBaseListener) {
    }

    public String getLicenceInfo(Context context) {
    }

    public void setLicence(Context context, String str, String str2) {
    }
}
