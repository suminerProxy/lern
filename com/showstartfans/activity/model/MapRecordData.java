package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.widget.j;
import com.baidu.platform.comapi.map.MapBundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: MapRecordData.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 82\u00020\u0001:\u00018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u00104\u001a\u00020\u0007H\u0016J\u0018\u00105\u001a\u0002062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0007H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\u001a\u0010%\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R\u001a\u0010(\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000f\"\u0004\b3\u0010\u0011¨\u00069"}, d2 = {"Lcom/showstartfans/activity/model/MapRecordData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "activityId", "", "getActivityId", "()I", "setActivityId", "(I)V", "articleAvatar", "", "getArticleAvatar", "()Ljava/lang/String;", "setArticleAvatar", "(Ljava/lang/String;)V", "articleId", "getArticleId", "setArticleId", "avatar", "getAvatar", "setAvatar", "groupTime", "getGroupTime", "setGroupTime", "isAnimation", "", "()Z", "setAnimation", "(Z)V", "isRecord", "setRecord", "showTime", "getShowTime", "setShowTime", "siteName", "getSiteName", "setSiteName", "time", "getTime", "setTime", "timeStamp", "", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "title", "getTitle", j.f843d, "describeContents", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class MapRecordData implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    private int activityId;
    @NotNull
    private String articleAvatar;
    private int articleId;
    @NotNull
    private String avatar;
    @NotNull
    private String groupTime;
    private boolean isAnimation;
    private int isRecord;
    @NotNull
    private String showTime;
    @NotNull
    private String siteName;
    @NotNull
    private String time;
    private long timeStamp;
    @NotNull
    private String title;

    /* compiled from: MapRecordData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/MapRecordData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/MapRecordData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/MapRecordData;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<MapRecordData> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public MapRecordData a(@NotNull Parcel parcel) {
        }

        @NotNull
        public MapRecordData[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MapRecordData createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MapRecordData[] newArray(int i2) {
        }
    }

    public MapRecordData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public final int getActivityId() {
    }

    @NotNull
    public final String getArticleAvatar() {
    }

    public final int getArticleId() {
    }

    @NotNull
    public final String getAvatar() {
    }

    @NotNull
    public final String getGroupTime() {
    }

    @NotNull
    public final String getShowTime() {
    }

    @NotNull
    public final String getSiteName() {
    }

    @NotNull
    public final String getTime() {
    }

    public final long getTimeStamp() {
    }

    @NotNull
    public final String getTitle() {
    }

    public final boolean isAnimation() {
    }

    public final int isRecord() {
    }

    public final void setActivityId(int i2) {
    }

    public final void setAnimation(boolean z) {
    }

    public final void setArticleAvatar(@NotNull String str) {
    }

    public final void setArticleId(int i2) {
    }

    public final void setAvatar(@NotNull String str) {
    }

    public final void setGroupTime(@NotNull String str) {
    }

    public final void setRecord(int i2) {
    }

    public final void setShowTime(@NotNull String str) {
    }

    public final void setSiteName(@NotNull String str) {
    }

    public final void setTime(@NotNull String str) {
    }

    public final void setTimeStamp(long j2) {
    }

    public final void setTitle(@NotNull String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public MapRecordData(@NotNull Parcel parcel) {
    }
}
