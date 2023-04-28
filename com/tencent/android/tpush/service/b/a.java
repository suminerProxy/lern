package com.tencent.android.tpush.service.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.android.tpush.data.MessageId;
import com.tencent.android.tpush.rpc.c;
import com.tencent.android.tpush.service.protocol.j;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ProGuard */
@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.INTENTSCHEMECHECK, EType.INTENTCHECK, EType.RECEIVERCHECK})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f8870a;
    private static final byte[] b = null;
    private static long c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f8871d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f8872e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f8873f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile boolean f8874g;

    /* renamed from: h  reason: collision with root package name */
    private static ConcurrentHashMap<Long, Map<String, List<Long>>> f8875h;

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.android.tpush.service.b.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f8877a;
        public final /* synthetic */ a b;
        private com.tencent.android.tpush.rpc.a c;

        /* renamed from: d  reason: collision with root package name */
        private c f8878d;

        /* renamed from: e  reason: collision with root package name */
        private ServiceConnection f8879e;

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.android.tpush.service.b.a$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class ServiceConnectionC01581 implements ServiceConnection {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f8880a;

            public ServiceConnectionC01581(AnonymousClass1 anonymousClass1) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        }

        public AnonymousClass1(a aVar, Intent intent) {
        }

        public static /* synthetic */ ServiceConnection a(AnonymousClass1 anonymousClass1, ServiceConnection serviceConnection) {
        }

        public static /* synthetic */ c b(AnonymousClass1 anonymousClass1) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }

        public static /* synthetic */ com.tencent.android.tpush.rpc.a a(AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ com.tencent.android.tpush.rpc.a a(AnonymousClass1 anonymousClass1, com.tencent.android.tpush.rpc.a aVar) {
        }

        public static /* synthetic */ c a(AnonymousClass1 anonymousClass1, c cVar) {
        }
    }

    private a() {
    }

    public static a a() {
    }

    private static synchronized void c() {
    }

    public void b(ArrayList<j> arrayList, long j2, com.tencent.android.tpush.service.channel.a aVar) {
    }

    public synchronized void a(Context context, Intent intent) {
    }

    private void b(Context context, String str) {
    }

    private synchronized void a(Context context, MessageId messageId) {
    }

    public void a(Context context, String str, MessageId messageId) {
    }

    private static JSONArray b() {
    }

    private ArrayList<MessageId> a(Context context, String str) {
    }

    public void a(Context context, String str, ArrayList<MessageId> arrayList) {
    }

    private void a(j jVar, long j2, com.tencent.android.tpush.service.channel.a aVar) {
    }

    public void a(String str, Intent intent, String str2) {
    }

    public void a(Intent intent) {
    }

    public void a(ArrayList<j> arrayList, long j2, com.tencent.android.tpush.service.channel.a aVar) {
    }

    private synchronized void a(String str) {
    }

    private synchronized boolean a(JSONObject jSONObject) {
    }

    private static List<Long> a(JSONArray jSONArray) {
    }

    private void a(Context context, String str, String str2, ArrayList<?> arrayList) {
    }

    private Object a(Context context, String str, String str2) {
    }
}
