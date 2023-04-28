package com.baidu.location;

import android.app.Notification;
import android.content.Context;
import android.content.ServiceConnection;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.webkit.WebView;
import com.baidu.location.b.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class LocationClient implements d.a {
    public static final int CONNECT_HOT_SPOT_FALSE = 0;
    public static final int CONNECT_HOT_SPOT_TRUE = 1;
    public static final int CONNECT_HOT_SPOT_UNKNOWN = -1;
    public static final int LOC_DIAGNOSTIC_TYPE_BETTER_OPEN_GPS = 1;
    public static final int LOC_DIAGNOSTIC_TYPE_BETTER_OPEN_WIFI = 2;
    public static final int LOC_DIAGNOSTIC_TYPE_FAIL_UNKNOWN = 9;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_CHECK_LOC_PERMISSION = 4;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_CHECK_NET = 3;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_CLOSE_FLYMODE = 7;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_INSERT_SIMCARD_OR_OPEN_WIFI = 6;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_OPEN_PHONE_LOC_SWITCH = 5;
    public static final int LOC_DIAGNOSTIC_TYPE_SERVER_FAIL = 8;
    private Boolean A;
    private boolean B;
    private com.baidu.location.b.d C;
    private boolean D;
    private boolean E;
    private boolean F;
    private ServiceConnection G;

    /* renamed from: a  reason: collision with root package name */
    private long f1114a;
    private String b;
    private LocationClientOption c;

    /* renamed from: d  reason: collision with root package name */
    private LocationClientOption f1115d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1116e;

    /* renamed from: f  reason: collision with root package name */
    private Context f1117f;

    /* renamed from: g  reason: collision with root package name */
    private Messenger f1118g;

    /* renamed from: h  reason: collision with root package name */
    private a f1119h;

    /* renamed from: i  reason: collision with root package name */
    private final Messenger f1120i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<BDLocationListener> f1121j;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<BDAbstractLocationListener> f1122k;

    /* renamed from: l  reason: collision with root package name */
    private BDLocation f1123l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1124m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1125n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1126o;

    /* renamed from: p  reason: collision with root package name */
    private b f1127p;
    private boolean q;
    private final Object r;
    private long s;
    private long t;
    private String u;
    private String v;
    private boolean w;
    private boolean x;
    private Boolean y;
    private Boolean z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<LocationClient> f1128a;

        public a(Looper looper, LocationClient locationClient) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocationClient f1129a;

        private b(LocationClient locationClient) {
        }

        public /* synthetic */ b(LocationClient locationClient, com.baidu.location.b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public LocationClient(Context context) {
    }

    public LocationClient(Context context, LocationClientOption locationClientOption) {
    }

    public static /* synthetic */ Messenger a(LocationClient locationClient) {
    }

    public static /* synthetic */ Messenger a(LocationClient locationClient, Messenger messenger) {
    }

    public static /* synthetic */ b a(LocationClient locationClient, b bVar) {
    }

    public static /* synthetic */ com.baidu.location.b.d a(LocationClient locationClient, com.baidu.location.b.d dVar) {
    }

    private void a() {
    }

    private void a(int i2) {
    }

    private void a(int i2, Notification notification) {
    }

    private void a(Message message) {
    }

    private void a(Message message, int i2) {
    }

    private void a(BDLocation bDLocation) {
    }

    public static /* synthetic */ void a(LocationClient locationClient, int i2, Notification notification) {
    }

    public static /* synthetic */ void a(LocationClient locationClient, Message message) {
    }

    public static /* synthetic */ void a(LocationClient locationClient, Message message, int i2) {
    }

    public static /* synthetic */ void a(LocationClient locationClient, BDLocation bDLocation) {
    }

    private void a(boolean z) {
    }

    public static /* synthetic */ boolean a(LocationClient locationClient, boolean z) {
    }

    private void b() {
    }

    private void b(Message message) {
    }

    public static /* synthetic */ void b(LocationClient locationClient, Message message) {
    }

    public static /* synthetic */ boolean b(LocationClient locationClient) {
    }

    public static /* synthetic */ boolean b(LocationClient locationClient, boolean z) {
    }

    private Bundle c() {
    }

    public static /* synthetic */ a c(LocationClient locationClient) {
    }

    private void c(Message message) {
    }

    public static /* synthetic */ void c(LocationClient locationClient, Message message) {
    }

    public static /* synthetic */ boolean c(LocationClient locationClient, boolean z) {
    }

    public static /* synthetic */ Messenger d(LocationClient locationClient) {
    }

    private void d() {
    }

    private void d(Message message) {
    }

    public static /* synthetic */ void d(LocationClient locationClient, Message message) {
    }

    public static /* synthetic */ boolean d(LocationClient locationClient, boolean z) {
    }

    public static /* synthetic */ Bundle e(LocationClient locationClient) {
    }

    private void e(Message message) {
    }

    public static /* synthetic */ void e(LocationClient locationClient, Message message) {
    }

    public static /* synthetic */ void e(LocationClient locationClient, boolean z) {
    }

    public static /* synthetic */ LocationClientOption f(LocationClient locationClient) {
    }

    public static /* synthetic */ Boolean g(LocationClient locationClient) {
    }

    public static BDLocation getBDLocationInCoorType(BDLocation bDLocation, String str) {
    }

    public static /* synthetic */ com.baidu.location.b.d h(LocationClient locationClient) {
    }

    public static /* synthetic */ Context i(LocationClient locationClient) {
    }

    public static /* synthetic */ LocationClientOption j(LocationClient locationClient) {
    }

    public static /* synthetic */ Object k(LocationClient locationClient) {
    }

    public static /* synthetic */ ArrayList l(LocationClient locationClient) {
    }

    public static /* synthetic */ ArrayList m(LocationClient locationClient) {
    }

    public static /* synthetic */ boolean n(LocationClient locationClient) {
    }

    public static /* synthetic */ b o(LocationClient locationClient) {
    }

    public static /* synthetic */ void p(LocationClient locationClient) {
    }

    public static /* synthetic */ void q(LocationClient locationClient) {
    }

    public static /* synthetic */ void r(LocationClient locationClient) {
    }

    public static /* synthetic */ boolean s(LocationClient locationClient) {
    }

    public static /* synthetic */ boolean t(LocationClient locationClient) {
    }

    public void disableAssistantLocation() {
    }

    public void disableLocInForeground(boolean z) {
    }

    public void enableAssistantLocation(WebView webView) {
    }

    public void enableLocInForeground(int i2, Notification notification) {
    }

    public String getAccessKey() {
    }

    public BDLocation getLastKnownLocation() {
    }

    public LocationClientOption getLocOption() {
    }

    public String getVersion() {
    }

    public boolean isStarted() {
    }

    public void onReceiveLightLocString(String str) {
    }

    @Override // com.baidu.location.b.d.a
    public void onReceiveLocation(BDLocation bDLocation) {
    }

    public void registerLocationListener(BDAbstractLocationListener bDAbstractLocationListener) {
    }

    public void registerLocationListener(BDLocationListener bDLocationListener) {
    }

    public boolean requestHotSpotState() {
    }

    public int requestLocation() {
    }

    public void restart() {
    }

    public void setLocOption(LocationClientOption locationClientOption) {
    }

    public void start() {
    }

    public void stop() {
    }

    public void unRegisterLocationListener(BDAbstractLocationListener bDAbstractLocationListener) {
    }

    public void unRegisterLocationListener(BDLocationListener bDLocationListener) {
    }

    public boolean updateLocation(Location location) {
    }
}
