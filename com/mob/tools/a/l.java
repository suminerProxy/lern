package com.mob.tools.a;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.location.LocationListener;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface l {
    PackageInfo a(String str, int i2) throws PackageManager.NameNotFoundException;

    String a();

    String a(int i2);

    String a(String str);

    String a(String str, String str2);

    Enumeration<InetAddress> a(NetworkInterface networkInterface);

    List<ResolveInfo> a(Intent intent, int i2);

    void a(String str, long j2, float f2, LocationListener locationListener);

    ApplicationInfo b(String str, int i2) throws PackageManager.NameNotFoundException;

    ResolveInfo b(Intent intent, int i2);

    Location b(String str);

    String b();

    Enumeration<NetworkInterface> c();

    int d();

    int e();

    ApplicationInfo f();
}
