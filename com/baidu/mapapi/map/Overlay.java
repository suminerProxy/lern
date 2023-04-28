package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class Overlay {
    public int A;
    public boolean B;
    public Bundle C;
    public a listener;
    public com.baidu.mapsdkplatform.comapi.map.h type;
    public String z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface a {
        void a(Overlay overlay);

        void b(Overlay overlay);

        boolean c(Overlay overlay);
    }

    public static boolean b(List<HoleOptions> list, Bundle bundle) {
    }

    private static boolean c(List<CircleHoleOptions> list, Bundle bundle) {
    }

    private static boolean d(List<PolygonHoleOptions> list, Bundle bundle) {
    }

    public Bundle a(Bundle bundle) {
    }

    public Bundle getExtraInfo() {
    }

    public int getZIndex() {
    }

    public boolean isRemoved() {
    }

    public boolean isVisible() {
    }

    public void remove() {
    }

    public void setExtraInfo(Bundle bundle) {
    }

    public void setVisible(boolean z) {
    }

    public void setZIndex(int i2) {
    }

    public Bundle a() {
    }

    public static void a(int i2, Bundle bundle) {
    }

    public static void a(List<LatLng> list, Bundle bundle) {
    }

    public static void c(int i2, Bundle bundle) {
    }

    public static void b(int i2, Bundle bundle) {
    }
}
