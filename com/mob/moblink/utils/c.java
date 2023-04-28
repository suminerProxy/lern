package com.mob.moblink.utils;

import com.mob.moblink.ActionListener;
import com.mob.moblink.Scene;
import com.mob.moblink.beans.ConfigData;
import com.mob.moblink.beans.LinkData;
import com.mob.moblink.beans.SceneData;
import com.mob.moblink.utils.AsyncProtocol;
import com.mob.tools.RxMob;
import com.mob.tools.utils.DH;

/* compiled from: AsyncProtocolInMain.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class c {

    /* compiled from: AsyncProtocolInMain.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class a implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Scene f3905a;
        public final /* synthetic */ ActionListener b;

        /* compiled from: AsyncProtocolInMain.java */
        /* renamed from: com.mob.moblink.utils.c$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C0103a extends RxMob.QuickSubscribe<LinkData> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DH.DHResponse f3906a;
            public final /* synthetic */ a b;

            public C0103a(a aVar, DH.DHResponse dHResponse) {
            }

            @Override // com.mob.tools.RxMob.QuickSubscribe
            public void doNext(RxMob.Subscriber<LinkData> subscriber) {
            }
        }

        /* compiled from: AsyncProtocolInMain.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class b extends RxMob.Subscriber<LinkData> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f3907a;

            public b(a aVar) {
            }

            public void a(LinkData linkData) {
            }

            @Override // com.mob.tools.RxMob.Subscriber
            public /* bridge */ /* synthetic */ void onNext(LinkData linkData) {
            }
        }

        public a(Scene scene, ActionListener actionListener) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: AsyncProtocolInMain.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class b implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3908a;

        public b(String str) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: AsyncProtocolInMain.java */
    /* renamed from: com.mob.moblink.utils.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class C0104c extends RxMob.QuickSubscribe<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3909a;

        public C0104c(String str) {
        }

        @Override // com.mob.tools.RxMob.QuickSubscribe
        public void doNext(RxMob.Subscriber<String> subscriber) {
        }
    }

    /* compiled from: AsyncProtocolInMain.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class d extends RxMob.Subscriber<String> {
        public void a(String str) {
        }

        @Override // com.mob.tools.RxMob.Subscriber
        public /* bridge */ /* synthetic */ void onNext(String str) {
        }
    }

    /* compiled from: AsyncProtocolInMain.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class e implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3910a;

        /* compiled from: AsyncProtocolInMain.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class a extends RxMob.QuickSubscribe<String> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f3911a;
            public final /* synthetic */ e b;

            public a(e eVar, String str) {
            }

            @Override // com.mob.tools.RxMob.QuickSubscribe
            public void doNext(RxMob.Subscriber<String> subscriber) {
            }
        }

        /* compiled from: AsyncProtocolInMain.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class b extends RxMob.Subscriber<String> {
            public b(e eVar) {
            }

            public void a(String str) {
            }

            @Override // com.mob.tools.RxMob.Subscriber
            public /* bridge */ /* synthetic */ void onNext(String str) {
            }
        }

        public e(String str) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: AsyncProtocolInMain.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class f implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AsyncProtocol.DataListener f3912a;

        public f(AsyncProtocol.DataListener dataListener) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: AsyncProtocolInMain.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class g implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3913a;
        public final /* synthetic */ AsyncProtocol.DataListener b;

        /* compiled from: AsyncProtocolInMain.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class a extends RxMob.QuickSubscribe<SceneData> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DH.DHResponse f3914a;
            public final /* synthetic */ g b;

            public a(g gVar, DH.DHResponse dHResponse) {
            }

            @Override // com.mob.tools.RxMob.QuickSubscribe
            public void doNext(RxMob.Subscriber<SceneData> subscriber) {
            }
        }

        /* compiled from: AsyncProtocolInMain.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class b extends RxMob.Subscriber<SceneData> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f3915a;

            public b(g gVar) {
            }

            public void a(SceneData sceneData) {
            }

            @Override // com.mob.tools.RxMob.Subscriber
            public /* bridge */ /* synthetic */ void onNext(SceneData sceneData) {
            }
        }

        public g(String str, AsyncProtocol.DataListener dataListener) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: AsyncProtocolInMain.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class h implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3916a;
        public final /* synthetic */ AsyncProtocol.DataListener b;

        /* compiled from: AsyncProtocolInMain.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class a extends RxMob.QuickSubscribe<SceneData> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DH.DHResponse f3917a;
            public final /* synthetic */ h b;

            public a(h hVar, DH.DHResponse dHResponse) {
            }

            @Override // com.mob.tools.RxMob.QuickSubscribe
            public void doNext(RxMob.Subscriber<SceneData> subscriber) {
            }
        }

        /* compiled from: AsyncProtocolInMain.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class b extends RxMob.Subscriber<SceneData> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ h f3918a;

            public b(h hVar) {
            }

            public void a(SceneData sceneData) {
            }

            @Override // com.mob.tools.RxMob.Subscriber
            public /* bridge */ /* synthetic */ void onNext(SceneData sceneData) {
            }
        }

        public h(int i2, AsyncProtocol.DataListener dataListener) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    public static void a(Scene scene, ActionListener<String> actionListener) {
    }

    public static void b(String str) {
    }

    public static void c(String str) {
    }

    public static void a(String str) {
    }

    public static void a(AsyncProtocol.DataListener<ConfigData> dataListener) {
    }

    public static void a(String str, AsyncProtocol.DataListener<SceneData> dataListener) {
    }

    public static void a(int i2, AsyncProtocol.DataListener<SceneData> dataListener) {
    }
}
