package com.tencent.android.tpush.message;

import android.content.Context;
import android.content.Intent;
import com.tencent.android.tpush.XGIOperateCallback;
import com.tencent.tpns.baseapi.base.util.CommonWorkingThread;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.ArrayList;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ArrayList<Long> f8784a;
    private static volatile e b;
    private static long c;

    /* renamed from: d  reason: collision with root package name */
    private Context f8785d = null;

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f8789a;
        private Context b;
        private Intent c;

        /* renamed from: d  reason: collision with root package name */
        private XGIOperateCallback f8790d;

        public a(e eVar, Context context, Intent intent, XGIOperateCallback xGIOperateCallback) {
        }

        private void a() {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Intent intent) {
        CommonWorkingThread.getInstance().execute(new TTask(this, intent) { // from class: com.tencent.android.tpush.message.e.1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Intent f8786a;
            public final /* synthetic */ e b;

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        });
    }

    public void b(Intent intent) {
        CommonWorkingThread.getInstance().execute(new TTask(this, intent) { // from class: com.tencent.android.tpush.message.e.2

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Intent f8787a;
            public final /* synthetic */ e b;

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        });
    }

    public static e a(Context context) {
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e();
                    b.f8785d = context.getApplicationContext();
                    com.tencent.android.tpush.service.b.b(b.f8785d);
                }
            }
        }
        return b;
    }

    public void a(Intent intent) {
        CommonWorkingThread.getInstance().execute(new a(this, this.f8785d, intent, null));
    }

    public static synchronized boolean a(Long l2) {
        synchronized (e.class) {
            try {
                if (f8784a == null) {
                    f8784a = new ArrayList<>();
                }
            } finally {
                return true;
            }
            if (f8784a.contains(l2)) {
                return false;
            }
            f8784a.add(l2);
            if (f8784a.size() > 200) {
                f8784a.remove(0);
            }
            return true;
        }
    }

    public synchronized void a(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - c > 120000 || z) {
            c = currentTimeMillis;
            CommonWorkingThread.getInstance().execute(new TTask(this) { // from class: com.tencent.android.tpush.message.e.3

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ e f8788a;

                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                }
            });
        }
    }
}
