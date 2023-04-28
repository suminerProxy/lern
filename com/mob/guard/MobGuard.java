package com.mob.guard;

import android.content.Context;
import com.mob.tools.proguard.PublicMemberKeeper;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MobGuard implements PublicMemberKeeper {

    /* renamed from: com.mob.guard.MobGuard$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements com.mob.mgs.OnIdChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OnIdChangeListener f3727a;

        public AnonymousClass1(OnIdChangeListener onIdChangeListener) {
        }

        @Override // com.mob.mgs.OnIdChangeListener
        public void onChanged(String str, String str2) {
        }
    }

    /* renamed from: com.mob.guard.MobGuard$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements com.mob.mgs.OnAppActiveListener {
        public final /* synthetic */ OnAppActiveListener val$listener;

        public AnonymousClass2(OnAppActiveListener onAppActiveListener) {
        }

        @Override // com.mob.mgs.OnAppActiveListener
        public void onAppActive(Context context, int i2) {
        }
    }

    public static String getGuardId() {
    }

    public static void setOnAppActiveListener(OnAppActiveListener onAppActiveListener) {
    }

    public static void getGuardId(OnIdChangeListener onIdChangeListener) {
    }
}
