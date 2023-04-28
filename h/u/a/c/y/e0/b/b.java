package h.u.a.c.y.e0.b;

import android.content.Context;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.model.LatLng;

/* compiled from: ClusterItem.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface b {
    BitmapDescriptor getBitmapDescriptor(Context context, int i2, int i3, String str);

    String getImage();

    MarkerOptions getMarkerOptions();

    LatLng getPosition();

    boolean isScale();
}
