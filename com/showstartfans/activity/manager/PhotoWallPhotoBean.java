package com.showstartfans.activity.manager;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.platform.comapi.map.MapBundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PhotoWallPhotoBean.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010(\u001a\u00020%H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000b¨\u0006*"}, d2 = {"Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "Landroid/os/Parcelable;", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "activityId", "", "getActivityId", "()Ljava/lang/String;", "setActivityId", "(Ljava/lang/String;)V", "goodsId", "getGoodsId", "setGoodsId", "id", "getId", "setId", "name", "getName", "setName", "noWatermarkUrl", "getNoWatermarkUrl", "setNoWatermarkUrl", "price", "getPrice", "setPrice", "shootingTime", "getShootingTime", "setShootingTime", "skuId", "getSkuId", "setSkuId", "watermarkUrl", "getWatermarkUrl", "setWatermarkUrl", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PhotoWallPhotoBean implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    @Nullable
    private String activityId;
    @Nullable
    private String goodsId;
    @Nullable
    private String id;
    @Nullable
    private String name;
    @Nullable
    private String noWatermarkUrl;
    @Nullable
    private String price;
    @Nullable
    private String shootingTime;
    @Nullable
    private String skuId;
    @Nullable
    private String watermarkUrl;

    /* compiled from: PhotoWallPhotoBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/manager/PhotoWallPhotoBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<PhotoWallPhotoBean> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public PhotoWallPhotoBean a(@NotNull Parcel parcel) {
        }

        @NotNull
        public PhotoWallPhotoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PhotoWallPhotoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PhotoWallPhotoBean[] newArray(int i2) {
        }
    }

    public PhotoWallPhotoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Nullable
    public final String getActivityId() {
    }

    @Nullable
    public final String getGoodsId() {
    }

    @Nullable
    public final String getId() {
    }

    @Nullable
    public final String getName() {
    }

    @Nullable
    public final String getNoWatermarkUrl() {
    }

    @Nullable
    public final String getPrice() {
    }

    @Nullable
    public final String getShootingTime() {
    }

    @Nullable
    public final String getSkuId() {
    }

    @Nullable
    public final String getWatermarkUrl() {
    }

    public final void setActivityId(@Nullable String str) {
    }

    public final void setGoodsId(@Nullable String str) {
    }

    public final void setId(@Nullable String str) {
    }

    public final void setName(@Nullable String str) {
    }

    public final void setNoWatermarkUrl(@Nullable String str) {
    }

    public final void setPrice(@Nullable String str) {
    }

    public final void setShootingTime(@Nullable String str) {
    }

    public final void setSkuId(@Nullable String str) {
    }

    public final void setWatermarkUrl(@Nullable String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public PhotoWallPhotoBean(@NotNull Parcel parcel) {
    }
}
