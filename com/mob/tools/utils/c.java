package com.mob.tools.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

@SuppressLint({"MissingPermission"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f4534a;
    private Location b;
    private Location c;

    /* renamed from: d  reason: collision with root package name */
    private LocationManager f4535d;

    /* renamed from: e  reason: collision with root package name */
    private LocationListener f4536e;

    /* renamed from: f  reason: collision with root package name */
    private long f4537f;

    /* renamed from: g  reason: collision with root package name */
    private a f4538g;

    /* renamed from: h  reason: collision with root package name */
    private volatile Location f4539h;

    /* renamed from: com.mob.tools.utils.c$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements LocationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f4540a;

        public AnonymousClass1(c cVar) {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i2, Bundle bundle) {
        }
    }

    /* renamed from: com.mob.tools.utils.c$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f4541a;

        /* renamed from: com.mob.tools.utils.c$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements GpsStatus.Listener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass2 f4542a;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // android.location.GpsStatus.Listener
            public void onGpsStatusChanged(int i2) {
            }
        }

        public AnonymousClass2(c cVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mob.tools.utils.c$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends GnssStatus.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f4543a;

        public AnonymousClass3(c cVar) {
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface a {
        void a();
    }

    private c() {
    }

    public static /* synthetic */ long a(c cVar, long j2) {
    }

    public static /* synthetic */ Location b(c cVar, Location location) {
    }

    private void d() {
    }

    private void e() {
    }

    public Location c() {
    }

    public static /* synthetic */ Location a(c cVar, Location location) {
    }

    public static /* synthetic */ void b(c cVar) {
    }

    public static /* synthetic */ LocationManager a(c cVar) {
    }

    private Location b(Context context, int i2, int i3, boolean z) {
    }

    public static c a() {
    }

    public Location a(Context context, int i2, int i3, boolean z) {
    }

    public void a(a aVar) {
    }

    public Location a(Context context, int i2, int i3, boolean z, boolean z2) {
    }

    private Location a(String str) {
    }

    private void b(Context context, String str, long j2) {
    }

    private Location a(Context context, String str, long j2) {
    }

    public Location b() {
    }

    private Location a(boolean z) {
    }

    public void a(Location location) {
    }
}
