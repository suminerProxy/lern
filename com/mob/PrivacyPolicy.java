package com.mob;

import android.os.Handler;
import android.os.Message;
import com.mob.tools.proguard.ClassKeeper;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.Serializable;
import java.util.Locale;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PrivacyPolicy implements ClassKeeper, PublicMemberKeeper, Serializable {
    public static final int POLICY_TYPE_TXT = 2;
    public static final int POLICY_TYPE_URL = 1;

    /* renamed from: a  reason: collision with root package name */
    private String f3378a;
    private String b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private long f3379d;

    /* renamed from: com.mob.PrivacyPolicy$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OnPolicyListener f3380a;
        public final /* synthetic */ Throwable b;

        public AnonymousClass1(OnPolicyListener onPolicyListener, Throwable th) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnPolicyListener extends ClassKeeper, PublicMemberKeeper {
        void onComplete(PrivacyPolicy privacyPolicy);

        void onFailure(Throwable th);
    }

    public PrivacyPolicy() {
    }

    private String a(String str) {
    }

    public static PrivacyPolicy getPrivacyPolicy(int i2, Locale locale) throws Throwable {
    }

    @Deprecated
    public static void getPrivacyPolicyAsync(int i2, OnPolicyListener onPolicyListener) {
    }

    public String getContent() {
    }

    public int getPpVersion() {
    }

    public long getTimestamp() {
    }

    public String getTitle() {
    }

    public void setContent(String str) {
    }

    public void setPpVersion(int i2) {
    }

    public void setTimestamp(long j2) {
    }

    public void setTitle(String str) {
    }

    public PrivacyPolicy(String str) {
    }

    @Deprecated
    public static void getPrivacyPolicyAsync(int i2, Locale locale, OnPolicyListener onPolicyListener) {
    }
}
