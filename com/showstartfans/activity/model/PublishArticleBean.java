package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import cn.sharesdk.framework.InnerShareParams;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PublishArticleBean.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 82\u00020\u0001:\u00018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B[\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fHÆ\u0003Js\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001J\b\u0010-\u001a\u00020.H\u0016J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\b\u00104\u001a\u00020\u0006H\u0016J\u0018\u00105\u001a\u0002062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00107\u001a\u00020.H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0017R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013¨\u00069"}, d2 = {"Lcom/showstartfans/activity/model/PublishArticleBean;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "cityName", "", "id", InnerShareParams.LATITUDE, InnerShareParams.LONGITUDE, "poster", "siteName", "startTime", "startTimestamp", InnerShareParams.TAGS, "", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCityName", "()Ljava/lang/String;", "getId", "getLatitude", "setLatitude", "(Ljava/lang/String;)V", "getLongitude", "setLongitude", "getPoster", "getSiteName", "getStartTime", "getStartTimestamp", "setStartTimestamp", "getTags", "()Ljava/util/List;", "getTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PublishArticleBean implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    @NotNull
    private final String cityName;
    @NotNull
    private final String id;
    @NotNull
    private String latitude;
    @NotNull
    private String longitude;
    @NotNull
    private final String poster;
    @NotNull
    private final String siteName;
    @NotNull
    private final String startTime;
    @NotNull
    private String startTimestamp;
    @NotNull
    private final List<String> tags;
    @NotNull
    private final String title;

    /* compiled from: PublishArticleBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/PublishArticleBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/PublishArticleBean;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/PublishArticleBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<PublishArticleBean> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public PublishArticleBean a(@NotNull Parcel parcel) {
        }

        @NotNull
        public PublishArticleBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PublishArticleBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PublishArticleBean[] newArray(int i2) {
        }
    }

    public PublishArticleBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<String> list, @NotNull String str9) {
    }

    public static /* synthetic */ PublishArticleBean copy$default(PublishArticleBean publishArticleBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, int i2, Object obj) {
    }

    @NotNull
    public final String component1() {
    }

    @NotNull
    public final String component10() {
    }

    @NotNull
    public final String component2() {
    }

    @NotNull
    public final String component3() {
    }

    @NotNull
    public final String component4() {
    }

    @NotNull
    public final String component5() {
    }

    @NotNull
    public final String component6() {
    }

    @NotNull
    public final String component7() {
    }

    @NotNull
    public final String component8() {
    }

    @NotNull
    public final List<String> component9() {
    }

    @NotNull
    public final PublishArticleBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<String> list, @NotNull String str9) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    @NotNull
    public final String getCityName() {
    }

    @NotNull
    public final String getId() {
    }

    @NotNull
    public final String getLatitude() {
    }

    @NotNull
    public final String getLongitude() {
    }

    @NotNull
    public final String getPoster() {
    }

    @NotNull
    public final String getSiteName() {
    }

    @NotNull
    public final String getStartTime() {
    }

    @NotNull
    public final String getStartTimestamp() {
    }

    @NotNull
    public final List<String> getTags() {
    }

    @NotNull
    public final String getTitle() {
    }

    public int hashCode() {
    }

    public final void setLatitude(@NotNull String str) {
    }

    public final void setLongitude(@NotNull String str) {
    }

    public final void setStartTimestamp(@NotNull String str) {
    }

    @NotNull
    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public PublishArticleBean(@NotNull Parcel parcel) {
    }
}
