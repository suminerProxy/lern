package com.tencent.tpns.mqttchannel.core.services;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.tencent.android.tpns.mqtt.IMqttActionListener;
import com.tencent.android.tpns.mqtt.IMqttDeliveryToken;
import com.tencent.android.tpns.mqtt.IMqttToken;
import com.tencent.android.tpns.mqtt.MqttAsyncClient;
import com.tencent.android.tpns.mqtt.MqttCallbackExtended;
import com.tencent.android.tpns.mqtt.MqttMessage;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.mqttchannel.api.MqttConnectState;
import com.tencent.tpns.mqttchannel.api.OnMqttCallback;
import com.tencent.tpns.mqttchannel.core.common.data.Request;
import com.tencent.tpns.mqttchannel.core.common.inf.IMqttCallback;
import com.tencent.tpns.mqttchannel.core.common.inf.IMqttService;
import com.tencent.tpns.mqttchannel.services.BaseMqttClientService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class IMqttServiceImpl extends IMqttService.Stub implements MqttCallbackExtended {
    public static int b;
    private static long c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f13761d;

    /* renamed from: e  reason: collision with root package name */
    private static ExecutorService f13762e;

    /* renamed from: l  reason: collision with root package name */
    private static int f13763l;
    private static ConcurrentHashMap<Long, IMqttCallback> y;
    private long A;
    private volatile boolean B;
    private ReentrantLock C;

    /* renamed from: a  reason: collision with root package name */
    public Object f13764a;

    /* renamed from: f  reason: collision with root package name */
    private volatile MqttAsyncClient f13765f;

    /* renamed from: g  reason: collision with root package name */
    private volatile MqttConnectState f13766g;

    /* renamed from: h  reason: collision with root package name */
    private volatile int f13767h;

    /* renamed from: i  reason: collision with root package name */
    private volatile int f13768i;

    /* renamed from: j  reason: collision with root package name */
    private volatile int f13769j;

    /* renamed from: k  reason: collision with root package name */
    private volatile int[] f13770k;

    /* renamed from: m  reason: collision with root package name */
    private Context f13771m;

    /* renamed from: n  reason: collision with root package name */
    private Map<Long, Pair<IMqttCallback, TTask>> f13772n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13773o;

    /* renamed from: p  reason: collision with root package name */
    private Class f13774p;
    private Handler q;
    private boolean r;
    private boolean s;
    private boolean t;
    private volatile int u;
    private volatile int v;
    private BaseMqttClientService w;
    private List<IMqttCallback> x;
    private Queue<Request> z;

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IMqttServiceImpl f13775a;

        public AnonymousClass1(IMqttServiceImpl iMqttServiceImpl) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass10 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13776a = null;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IMqttServiceImpl f13777a;

        public AnonymousClass11(IMqttServiceImpl iMqttServiceImpl) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 implements IMqttActionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IMqttServiceImpl f13778a;

        public AnonymousClass12(IMqttServiceImpl iMqttServiceImpl) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IMqttCallback f13779a;
        public final /* synthetic */ IMqttServiceImpl b;

        public AnonymousClass13(IMqttServiceImpl iMqttServiceImpl, IMqttCallback iMqttCallback) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 implements IMqttActionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IMqttCallback f13780a;
        public final /* synthetic */ IMqttServiceImpl b;

        public AnonymousClass14(IMqttServiceImpl iMqttServiceImpl, IMqttCallback iMqttCallback) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 implements IMqttActionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IMqttCallback f13781a;
        public final /* synthetic */ IMqttServiceImpl b;

        public AnonymousClass15(IMqttServiceImpl iMqttServiceImpl, IMqttCallback iMqttCallback) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass16 extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IMqttServiceImpl f13782a;

        public AnonymousClass16(IMqttServiceImpl iMqttServiceImpl) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass17 extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Request f13783a;
        public final /* synthetic */ IMqttCallback b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ IMqttServiceImpl f13784d;

        public AnonymousClass17(IMqttServiceImpl iMqttServiceImpl, Request request, IMqttCallback iMqttCallback, String str) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass18 implements IMqttActionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Request f13785a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ IMqttCallback f13786d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ IMqttServiceImpl f13787e;

        public AnonymousClass18(IMqttServiceImpl iMqttServiceImpl, Request request, String str, JSONObject jSONObject, IMqttCallback iMqttCallback) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends OnMqttCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Request f13788a;
        public final /* synthetic */ IMqttCallback b;
        public final /* synthetic */ IMqttServiceImpl c;

        public AnonymousClass2(IMqttServiceImpl iMqttServiceImpl, Request request, IMqttCallback iMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.b
        public void callback(int i2, String str) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements IMqttActionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Request f13789a;
        public final /* synthetic */ IMqttCallback b;
        public final /* synthetic */ IMqttServiceImpl c;

        public AnonymousClass3(IMqttServiceImpl iMqttServiceImpl, Request request, IMqttCallback iMqttCallback) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements IMqttActionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IMqttCallback f13790a;
        public final /* synthetic */ Request b;
        public final /* synthetic */ IMqttServiceImpl c;

        public AnonymousClass4(IMqttServiceImpl iMqttServiceImpl, IMqttCallback iMqttCallback, Request request) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements IMqttActionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Request f13791a;
        public final /* synthetic */ IMqttCallback b;
        public final /* synthetic */ IMqttServiceImpl c;

        public AnonymousClass5(IMqttServiceImpl iMqttServiceImpl, Request request, IMqttCallback iMqttCallback) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements IMqttActionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IMqttServiceImpl f13792a;

        public AnonymousClass6(IMqttServiceImpl iMqttServiceImpl) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IMqttServiceImpl f13793a;

        public AnonymousClass7(IMqttServiceImpl iMqttServiceImpl) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IMqttCallback f13794a;
        public final /* synthetic */ IMqttServiceImpl b;

        public AnonymousClass8(IMqttServiceImpl iMqttServiceImpl, IMqttCallback iMqttCallback) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.services.IMqttServiceImpl$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IMqttServiceImpl f13795a;

        public AnonymousClass9(IMqttServiceImpl iMqttServiceImpl) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13796a = null;
        public static final a b = null;
        public static final a c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final a f13797d = null;

        /* renamed from: e  reason: collision with root package name */
        public static final a f13798e = null;

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ a[] f13799f = null;

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class b extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public IMqttCallback f13800a;
        public final /* synthetic */ IMqttServiceImpl b;

        public b(IMqttServiceImpl iMqttServiceImpl, IMqttCallback iMqttCallback, int i2) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    public IMqttServiceImpl(Context context) {
    }

    public static /* synthetic */ int a(IMqttServiceImpl iMqttServiceImpl, int i2) {
    }

    public static /* synthetic */ int b(IMqttServiceImpl iMqttServiceImpl, int i2) {
    }

    public static /* synthetic */ int c(IMqttServiceImpl iMqttServiceImpl, int i2) {
    }

    public static /* synthetic */ void d(IMqttServiceImpl iMqttServiceImpl) {
    }

    public static /* synthetic */ void e(IMqttServiceImpl iMqttServiceImpl) {
    }

    public static /* synthetic */ void f(IMqttServiceImpl iMqttServiceImpl) {
    }

    public static /* synthetic */ void g(IMqttServiceImpl iMqttServiceImpl) {
    }

    public static /* synthetic */ Map h(IMqttServiceImpl iMqttServiceImpl) {
    }

    public static /* synthetic */ void i(IMqttServiceImpl iMqttServiceImpl) {
    }

    public static /* synthetic */ int j(IMqttServiceImpl iMqttServiceImpl) {
    }

    public static /* synthetic */ void k(IMqttServiceImpl iMqttServiceImpl) {
    }

    public static /* synthetic */ void l(IMqttServiceImpl iMqttServiceImpl) {
    }

    private synchronized void m() {
    }

    private synchronized void n() {
    }

    @SuppressLint({"HandlerLeak"})
    private void o() {
    }

    private void p() {
    }

    private boolean q() {
    }

    private void r() {
    }

    private boolean s() {
    }

    private synchronized void t() {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttCallbackExtended
    public void connectComplete(boolean z, String str) {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttCallback
    public void connectionLost(Throwable th) {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttCallback
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
    public void getConnectState(IMqttCallback iMqttCallback) {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttCallback
    public void messageArrived(String str, MqttMessage mqttMessage) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
    public void ping(IMqttCallback iMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
    public void sendPublishData(Request request, IMqttCallback iMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
    public void sendRequest(Request request, IMqttCallback iMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
    public void startConnect(IMqttCallback iMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
    public void stopConnect(IMqttCallback iMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
    public void subscrbie(Request request, IMqttCallback iMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
    public void unSubscrbie(Request request, IMqttCallback iMqttCallback) {
    }

    public static /* synthetic */ long a(IMqttServiceImpl iMqttServiceImpl, long j2) {
    }

    public static /* synthetic */ Handler b(IMqttServiceImpl iMqttServiceImpl) {
    }

    public static /* synthetic */ void c(IMqttServiceImpl iMqttServiceImpl) {
    }

    public static /* synthetic */ void d(IMqttServiceImpl iMqttServiceImpl, IMqttCallback iMqttCallback) {
    }

    private void e() {
    }

    private a f() {
    }

    private void g() {
    }

    private void h() {
    }

    private void i() {
    }

    private void j() {
    }

    private void k() {
    }

    private void l() {
    }

    public static /* synthetic */ Context a(IMqttServiceImpl iMqttServiceImpl) {
    }

    public static /* synthetic */ boolean b(IMqttServiceImpl iMqttServiceImpl, IMqttCallback iMqttCallback) {
    }

    public static /* synthetic */ void c(IMqttServiceImpl iMqttServiceImpl, IMqttCallback iMqttCallback) {
    }

    private synchronized void d() {
    }

    public static /* synthetic */ MqttConnectState a(IMqttServiceImpl iMqttServiceImpl, MqttConnectState mqttConnectState) {
    }

    private IMqttCallback b(Long l2) {
    }

    private synchronized void c() {
    }

    public static /* synthetic */ void a(IMqttServiceImpl iMqttServiceImpl, int i2, Message message) {
    }

    public static /* synthetic */ void a(IMqttServiceImpl iMqttServiceImpl, int i2, Request request) {
    }

    public static /* synthetic */ void a(IMqttServiceImpl iMqttServiceImpl, Request request, IMqttCallback iMqttCallback, String str) {
    }

    private boolean d(IMqttCallback iMqttCallback) {
    }

    private void e(IMqttCallback iMqttCallback) {
    }

    public static /* synthetic */ void a(IMqttServiceImpl iMqttServiceImpl, IMqttCallback iMqttCallback) {
    }

    public static /* synthetic */ void a(IMqttServiceImpl iMqttServiceImpl, IMqttCallback iMqttCallback, int i2, String str) {
    }

    private void f(IMqttCallback iMqttCallback) {
    }

    public static /* synthetic */ void a(IMqttServiceImpl iMqttServiceImpl, boolean z) {
    }

    public static /* synthetic */ boolean a(IMqttServiceImpl iMqttServiceImpl, IMqttCallback iMqttCallback, boolean z) {
    }

    private synchronized void a(IMqttCallback iMqttCallback) {
    }

    private void b(IMqttCallback iMqttCallback) {
    }

    private Request c(Long l2) {
    }

    private void b(Request request, IMqttCallback iMqttCallback) {
    }

    private void c(IMqttCallback iMqttCallback) {
    }

    private static void a(Long l2, IMqttCallback iMqttCallback) {
    }

    private void c(Request request, IMqttCallback iMqttCallback) {
    }

    private static IMqttCallback a(Long l2) {
    }

    private void a(Request request, IMqttCallback iMqttCallback) {
    }

    public void b() {
    }

    public IMqttServiceImpl(Context context, BaseMqttClientService baseMqttClientService) {
    }

    private boolean a(Context context) {
    }

    private void b(int i2, Request request) {
    }

    private ArrayList<String> b(Context context) {
    }

    private boolean a(IMqttCallback iMqttCallback, boolean z) {
    }

    private void a(Request request, IMqttCallback iMqttCallback, String str) {
    }

    private void d(Request request, IMqttCallback iMqttCallback) {
    }

    private void a(IMqttCallback iMqttCallback, int i2, String str) {
    }

    private void a(int i2, Request request) {
    }

    private void a(int i2, Message message) {
    }

    private synchronized void a(boolean z) {
    }

    private void a(Request request) {
    }
}
