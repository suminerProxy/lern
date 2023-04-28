package com.baidu.location.d;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.baidu.location.LLSInterface;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class a extends Service implements LLSInterface {

    /* renamed from: a  reason: collision with root package name */
    public static HandlerC0031a f1407a;
    public static long c;

    /* renamed from: g  reason: collision with root package name */
    private static long f1408g;
    public Messenger b;

    /* renamed from: d  reason: collision with root package name */
    private Looper f1409d;

    /* renamed from: e  reason: collision with root package name */
    private HandlerThread f1410e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1411f;

    /* renamed from: h  reason: collision with root package name */
    private int f1412h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1413i;

    /* renamed from: com.baidu.location.d.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class HandlerC0031a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<a> f1414a;

        public HandlerC0031a(Looper looper, a aVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public static /* synthetic */ int a(a aVar) {
    }

    private void a() {
    }

    private void a(Message message) {
    }

    public static /* synthetic */ void a(a aVar, Message message) {
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
    }

    private void b() {
    }

    private void b(Message message) {
    }

    public static /* synthetic */ void b(a aVar) {
    }

    public static /* synthetic */ void b(a aVar, Message message) {
    }

    private void c(Message message) {
    }

    public static /* synthetic */ void c(a aVar) {
    }

    public static /* synthetic */ void c(a aVar, Message message) {
    }

    @Override // com.baidu.location.LLSInterface
    public double getVersion() {
    }

    @Override // android.app.Service, com.baidu.location.LLSInterface
    public IBinder onBind(Intent intent) {
    }

    @Override // com.baidu.location.LLSInterface
    public void onCreate(Context context) {
    }

    @Override // android.app.Service, com.baidu.location.LLSInterface
    public void onDestroy() {
    }

    @Override // android.app.Service, com.baidu.location.LLSInterface
    public int onStartCommand(Intent intent, int i2, int i3) {
    }

    @Override // android.app.Service, com.baidu.location.LLSInterface
    public void onTaskRemoved(Intent intent) {
    }

    @Override // com.baidu.location.LLSInterface
    public boolean onUnBind(Intent intent) {
    }
}
