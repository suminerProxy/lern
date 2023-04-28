package com.showstartfans.activity.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import cn.sharesdk.framework.InnerShareParams;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.model.LatLng;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import h.u.a.c.y.e0.b.b;
import h.u.a.g.w7;
import h.y.a.k.d;
import java.io.Serializable;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MapShowData.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J(\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u000bH\u0002J(\u00100\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u000bH\u0002J\b\u00101\u001a\u00020\tH\u0016J*\u00102\u001a\u0004\u0018\u0001032\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u000bH\u0016J\b\u00104\u001a\u00020\u000bH\u0016J\b\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020\u001cH\u0016J\u0018\u00108\u001a\u0002092\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\tH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001c\u0010&\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u000f¨\u0006;"}, d2 = {"Lcom/showstartfans/activity/model/MapBaseData;", "Lcom/showstartfans/activity/activitys/community/clusterutil/clustering/ClusterItem;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "MARKER_ZINDEX", "", "expPoster", "", "getExpPoster", "()Ljava/lang/String;", "setExpPoster", "(Ljava/lang/String;)V", "expPushedUniNum", "getExpPushedUniNum", "()I", "setExpPushedUniNum", "(I)V", "expSessionNum", "getExpSessionNum", "setExpSessionNum", "expSiteNum", "getExpSiteNum", "setExpSiteNum", "latLng", "Lcom/baidu/mapapi/model/LatLng;", InnerShareParams.LATITUDE, "", "getLatitude", "()D", "setLatitude", "(D)V", InnerShareParams.LONGITUDE, "getLongitude", "setLongitude", "name", "getName", "setName", "createMarkerViewForRecord", "Landroid/view/View;", "context", "Landroid/content/Context;", "push", "pushed", "value", "createMarkerViewForRecorded", "describeContents", "getBitmapDescriptor", "Lcom/baidu/mapapi/map/BitmapDescriptor;", "getImage", "getMarkerOptions", "Lcom/baidu/mapapi/map/MarkerOptions;", "getPosition", "writeToParcel", "", "flags", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class MapBaseData implements b, Parcelable, Serializable {
    private final int MARKER_ZINDEX;
    @Nullable
    private String expPoster;
    private int expPushedUniNum;
    private int expSessionNum;
    private int expSiteNum;
    @Nullable
    private LatLng latLng;
    private double latitude;
    private double longitude;
    @Nullable
    private String name;

    /* compiled from: MapShowData.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/model/MapBaseData$createMarkerViewForRecorded$1", "Lcom/taihebase/activity/listener/OnGetBitmapListenerCall;", "onFailure_", "", "dataSource", "Lcom/facebook/datasource/DataSource;", "Lcom/facebook/common/references/CloseableReference;", "Lcom/facebook/imagepipeline/image/CloseableImage;", "onSuccess_", "bitmap", "Landroid/graphics/Bitmap;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w7 f6540a;
        public final /* synthetic */ CountDownLatch b;

        public a(w7 w7Var, CountDownLatch countDownLatch) {
        }

        @Override // h.y.a.k.d
        public void a(@Nullable DataSource<CloseableReference<CloseableImage>> dataSource) {
        }

        @Override // h.y.a.k.d
        public void b(@Nullable Bitmap bitmap) {
        }
    }

    public MapBaseData() {
    }

    private final View createMarkerViewForRecord(Context context, int i2, int i3, String str) {
    }

    private final View createMarkerViewForRecorded(Context context, int i2, int i3, String str) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // h.u.a.c.y.e0.b.b
    @Nullable
    public BitmapDescriptor getBitmapDescriptor(@NotNull Context context, int i2, int i3, @NotNull String str) {
    }

    @Nullable
    public final String getExpPoster() {
    }

    public final int getExpPushedUniNum() {
    }

    public final int getExpSessionNum() {
    }

    public final int getExpSiteNum() {
    }

    @Override // h.u.a.c.y.e0.b.b
    @NotNull
    public String getImage() {
    }

    public final double getLatitude() {
    }

    public final double getLongitude() {
    }

    @Override // h.u.a.c.y.e0.b.b
    @NotNull
    public MarkerOptions getMarkerOptions() {
    }

    @Nullable
    public final String getName() {
    }

    @Override // h.u.a.c.y.e0.b.b
    @NotNull
    public LatLng getPosition() {
    }

    public final void setExpPoster(@Nullable String str) {
    }

    public final void setExpPushedUniNum(int i2) {
    }

    public final void setExpSessionNum(int i2) {
    }

    public final void setExpSiteNum(int i2) {
    }

    public final void setLatitude(double d2) {
    }

    public final void setLongitude(double d2) {
    }

    public final void setName(@Nullable String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public MapBaseData(@NotNull Parcel parcel) {
    }
}
