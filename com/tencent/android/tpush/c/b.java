package com.tencent.android.tpush.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.tpns.baseapi.base.util.TTask;

/* compiled from: ProGuard */
@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20160810", reviewer = 3, vComment = {EType.RECEIVERCHECK, EType.INTENTCHECK})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class b {

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.android.tpush.c.b$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f8641a;

        public AnonymousClass1(Context context) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.android.tpush.c.b$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f8642a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.android.tpush.c.b$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends TTask {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f8643a;
            public final /* synthetic */ AnonymousClass2 b;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, Context context) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        public AnonymousClass2(long j2, String str, String str2) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    public static void a(Context context) {
    }

    public static /* synthetic */ void b(Context context) {
    }

    private static void c(Context context) {
    }
}
