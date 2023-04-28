package com.mob.moblink.utils;

import android.os.Handler;
import android.os.Message;
import com.mob.moblink.beans.ConfigData;
import com.mob.moblink.beans.LogData;
import com.mob.moblink.beans.SceneData;
import com.mob.tools.RxMob;
import com.mob.tools.utils.DH;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AsyncProtocol {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface DataListener<T> {
        void onReceiveData(T t);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class a implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3887a;
        public final /* synthetic */ DataListener b;

        /* renamed from: com.mob.moblink.utils.AsyncProtocol$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C0100a extends RxMob.QuickSubscribe<SceneData> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DH.DHResponse f3888a;
            public final /* synthetic */ a b;

            public C0100a(a aVar, DH.DHResponse dHResponse) {
            }

            @Override // com.mob.tools.RxMob.QuickSubscribe
            public void doNext(RxMob.Subscriber<SceneData> subscriber) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class b extends RxMob.Subscriber<SceneData> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f3889a;

            public b(a aVar) {
            }

            public void a(SceneData sceneData) {
            }

            @Override // com.mob.tools.RxMob.Subscriber
            public /* bridge */ /* synthetic */ void onNext(SceneData sceneData) {
            }
        }

        public a(int i2, DataListener dataListener) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class b<T> implements DataListener<T> {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f3890a;

        public boolean a() {
        }

        public boolean b() {
        }

        @Override // com.mob.moblink.utils.AsyncProtocol.DataListener
        public void onReceiveData(T t) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private String f3891a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f3892d;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class a implements DH.DHResponder {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f3893a;

            /* renamed from: com.mob.moblink.utils.AsyncProtocol$c$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class C0101a extends RxMob.QuickSubscribe<LogData> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ String f3894a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ a f3895d;

                public C0101a(a aVar, String str, String str2, String str3) {
                }

                @Override // com.mob.tools.RxMob.QuickSubscribe
                public void doNext(RxMob.Subscriber<LogData> subscriber) throws Throwable {
                }
            }

            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class b extends RxMob.Subscriber<LogData> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ a f3896a;

                public b(a aVar) {
                }

                private void b(LogData logData) {
                }

                public void a(LogData logData) {
                }

                @Override // com.mob.tools.RxMob.Subscriber
                public void onError(Throwable th) {
                }

                @Override // com.mob.tools.RxMob.Subscriber
                public /* bridge */ /* synthetic */ void onNext(LogData logData) {
                }
            }

            public a(c cVar) {
            }

            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class b implements Handler.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f3897a;

            public b(c cVar) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        public c(String str, int i2, int i3) {
        }

        public static /* synthetic */ String a(c cVar) {
        }

        public static /* synthetic */ void b(c cVar) {
        }

        private void b() {
        }

        public void a() {
        }
    }

    public static void a(String str, int i2, int i3) {
    }

    public static ConfigData b() {
    }

    public static void a() {
    }

    public static void a(int i2, DataListener<SceneData> dataListener) {
    }
}
