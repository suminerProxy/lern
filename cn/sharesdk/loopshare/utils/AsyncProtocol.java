package cn.sharesdk.loopshare.utils;

import android.os.Handler;
import android.os.Message;
import cn.sharesdk.loopshare.beans.ConfigData;
import cn.sharesdk.loopshare.beans.SceneData;
import com.mob.tools.RxMob;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AsyncProtocol {

    /* renamed from: cn.sharesdk.loopshare.utils.AsyncProtocol$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 extends RxMob.QuickSubscribe<ConfigData> {
        @Override // com.mob.tools.RxMob.QuickSubscribe
        public void doNext(RxMob.Subscriber<ConfigData> subscriber) throws Throwable {
        }
    }

    /* renamed from: cn.sharesdk.loopshare.utils.AsyncProtocol$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 extends RxMob.Subscriber<ConfigData> {
        public final /* synthetic */ DataListener val$l;

        public AnonymousClass2(DataListener dataListener) {
        }

        @Override // com.mob.tools.RxMob.Subscriber
        public /* bridge */ /* synthetic */ void onNext(ConfigData configData) {
        }

        /* renamed from: onNext  reason: avoid collision after fix types in other method */
        public void onNext2(ConfigData configData) {
        }
    }

    /* renamed from: cn.sharesdk.loopshare.utils.AsyncProtocol$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass3 extends RxMob.QuickSubscribe<SceneData> {
        public final /* synthetic */ String val$linkId;

        public AnonymousClass3(String str) {
        }

        @Override // com.mob.tools.RxMob.QuickSubscribe
        public void doNext(RxMob.Subscriber<SceneData> subscriber) {
        }
    }

    /* renamed from: cn.sharesdk.loopshare.utils.AsyncProtocol$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass4 extends RxMob.Subscriber<SceneData> {
        public final /* synthetic */ DataListener val$l;

        public AnonymousClass4(DataListener dataListener) {
        }

        @Override // com.mob.tools.RxMob.Subscriber
        public /* bridge */ /* synthetic */ void onNext(SceneData sceneData) {
        }

        /* renamed from: onNext  reason: avoid collision after fix types in other method */
        public void onNext2(SceneData sceneData) {
        }
    }

    /* renamed from: cn.sharesdk.loopshare.utils.AsyncProtocol$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass5 extends RxMob.QuickSubscribe<SceneData> {
        public final /* synthetic */ int val$status;

        public AnonymousClass5(int i2) {
        }

        @Override // com.mob.tools.RxMob.QuickSubscribe
        public void doNext(RxMob.Subscriber<SceneData> subscriber) {
        }
    }

    /* renamed from: cn.sharesdk.loopshare.utils.AsyncProtocol$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass6 extends RxMob.Subscriber<SceneData> {
        public final /* synthetic */ DataListener val$l;

        public AnonymousClass6(DataListener dataListener) {
        }

        @Override // com.mob.tools.RxMob.Subscriber
        public /* bridge */ /* synthetic */ void onNext(SceneData sceneData) {
        }

        /* renamed from: onNext  reason: avoid collision after fix types in other method */
        public void onNext2(SceneData sceneData) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface DataListener<T> {
        void onReceiveData(T t);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnGetConfigListener {
        void onConfig(int i2, ConfigData configData);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnGetSceneListner {
        void onScene(int i2, SceneData sceneData);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class a<T> implements DataListener<T> {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f241a;

        public boolean a() {
        }

        public boolean b() {
        }

        @Override // cn.sharesdk.loopshare.utils.AsyncProtocol.DataListener
        public void onReceiveData(T t) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f242a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        private String f243d;

        /* renamed from: cn.sharesdk.loopshare.utils.AsyncProtocol$b$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Handler.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f244a;

            public AnonymousClass1(b bVar) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        public b(String str, int i2, int i3) {
        }

        public static /* synthetic */ String a(b bVar) {
        }

        public static /* synthetic */ void b(b bVar) {
        }

        private void b() {
        }

        public void a() {
        }
    }

    public static ConfigData a() {
    }

    public static void b() {
    }

    public static void a(String str, int i2, int i3) {
    }

    public static void a(int i2, DataListener<SceneData> dataListener) {
    }
}
