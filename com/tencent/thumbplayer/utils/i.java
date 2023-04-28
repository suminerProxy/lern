package com.tencent.thumbplayer.utils;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class i extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static int f13593a = 0;
    private static String b = "unknown";
    private static int c;

    /* renamed from: d  reason: collision with root package name */
    private static int f13594d;

    /* renamed from: e  reason: collision with root package name */
    private static String f13595e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<b> f13596f;

    /* renamed from: g  reason: collision with root package name */
    private HandlerThread f13597g;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static i f13598a;

        public static /* synthetic */ i a() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface b {
        void a(int i2, int i3, int i4, int i5);
    }

    private i() {
    }

    public /* synthetic */ i(AnonymousClass1 anonymousClass1) {
    }

    public static i a() {
    }

    private synchronized void a(Context context, Handler handler) {
    }

    private boolean a(NetworkInfo networkInfo) {
    }

    public static int b() {
    }

    @RequiresApi(api = 3)
    private static int b(NetworkInfo networkInfo) {
    }

    @RequiresApi(api = 3)
    @SuppressLint({"MissingPermission"})
    private void b(Context context) {
    }

    public static int c() {
    }

    private String c(NetworkInfo networkInfo) {
    }

    private static boolean d() {
    }

    private synchronized void e() {
    }

    private void f() {
    }

    public synchronized void a(Context context) {
    }

    public synchronized void a(b bVar) {
    }

    public synchronized void b(b bVar) {
    }

    @Override // android.content.BroadcastReceiver
    @RequiresApi(api = 3)
    public void onReceive(Context context, Intent intent) {
    }
}
