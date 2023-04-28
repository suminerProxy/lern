package com.mob.tools.a;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.concurrent.BlockingQueue;
import java.util.function.Consumer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class i {

    /* renamed from: com.mob.tools.a.i$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Consumer<Location> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f4289a;

        public AnonymousClass1(BlockingQueue blockingQueue) {
        }

        public void a(Location location) {
        }

        @Override // java.util.function.Consumer
        public /* synthetic */ void accept(Location location) {
        }
    }

    /* renamed from: com.mob.tools.a.i$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements LocationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f4290a;

        public AnonymousClass2(BlockingQueue blockingQueue) {
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

    public static Location a(Context context, String str) throws Throwable {
    }

    public static Location a(Context context, String str, long j2) throws Throwable {
    }
}
