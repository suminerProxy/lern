package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: MapRecordData.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0007H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/showstartfans/activity/model/MapRecordListData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "hadMore", "", "getHadMore", "()I", "setHadMore", "(I)V", "recordList", "", "Lcom/showstartfans/activity/model/MapRecordData;", "getRecordList", "()Ljava/util/List;", "setRecordList", "(Ljava/util/List;)V", "describeContents", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class MapRecordListData implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    private int hadMore;
    @NotNull
    private List<MapRecordData> recordList;

    /* compiled from: MapRecordData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/MapRecordListData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/MapRecordListData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/MapRecordListData;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<MapRecordListData> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public MapRecordListData a(@NotNull Parcel parcel) {
        }

        @NotNull
        public MapRecordListData[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MapRecordListData createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MapRecordListData[] newArray(int i2) {
        }
    }

    public MapRecordListData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public final int getHadMore() {
    }

    @NotNull
    public final List<MapRecordData> getRecordList() {
    }

    public final void setHadMore(int i2) {
    }

    public final void setRecordList(@NotNull List<MapRecordData> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public MapRecordListData(@NotNull Parcel parcel) {
    }
}
