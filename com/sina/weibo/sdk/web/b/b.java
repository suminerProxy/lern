package com.sina.weibo.sdk.web.b;

import android.content.Context;
import android.os.Bundle;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.web.WebData;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class b {
    public Context Z;
    public WebData aC;
    public String aD;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface a {
        void onComplete();

        void onError(String str);
    }

    public b() {
    }

    public abstract void a(Bundle bundle);

    public void a(a aVar) {
    }

    public abstract void b(Bundle bundle);

    public abstract String getUrl();

    public final void readFromBundle(Bundle bundle) {
    }

    public final void setContext(Context context) {
    }

    public boolean t() {
    }

    public final WebData u() {
    }

    public final Bundle writeToBundle(Bundle bundle) {
    }

    public b(AuthInfo authInfo, int i2, String str, String str2) {
    }
}
