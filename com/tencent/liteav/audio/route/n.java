package com.tencent.liteav.audio.route;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class n extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11411a;
    public b b;
    private final a c;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {
        public void onBluetoothConnectionChanged(boolean z) {
        }

        public void onBluetoothSCOConnected(boolean z) {
        }

        public void onWiredHeadsetConnectionChanged(boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class b implements BluetoothProfile.ServiceListener {

        /* renamed from: a  reason: collision with root package name */
        public final BluetoothAdapter f11412a;
        public BluetoothProfile b;
        public final Object c;

        /* renamed from: d  reason: collision with root package name */
        private final Context f11413d;

        public b(Context context) {
        }

        private static BluetoothAdapter c() {
        }

        private List<BluetoothDevice> d() {
        }

        private boolean e() {
        }

        public final boolean a() {
        }

        public final void b() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public final void onServiceConnected(int i2, BluetoothProfile bluetoothProfile) {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public final void onServiceDisconnected(int i2) {
        }
    }

    public n(Context context, a aVar) {
    }

    private static int a(Intent intent, String str, int i2) {
    }

    private static String a(int i2) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
    }

    public static /* synthetic */ boolean a(Context context) {
    }
}
