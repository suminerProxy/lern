package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.platform.comapi.map.MapBundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UserPhotoBean.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b5\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 G2\u00020\u0001:\u0001GB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0091\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0016J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J³\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0001J\b\u0010=\u001a\u00020>H\u0016J\u0013\u0010?\u001a\u00020\u00062\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020>HÖ\u0001J\t\u0010C\u001a\u00020\bHÖ\u0001J\u0018\u0010D\u001a\u00020E2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010F\u001a\u00020>H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001a¨\u0006H"}, d2 = {"Lcom/showstartfans/activity/model/UserPhotoBean;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "alreadyPaid", "", "clickNum", "", "collect", "collectUser", "formatClickNum", "formatPraiseNum", "id", "mediaType", "paid", "photo", "cover", "praiseNum", "uploadTime", "videoType", "videoTypeStr", "(ZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlreadyPaid", "()Z", "getClickNum", "()Ljava/lang/String;", "getCollect", "setCollect", "(Z)V", "getCollectUser", "getCover", "getFormatClickNum", "getFormatPraiseNum", "setFormatPraiseNum", "(Ljava/lang/String;)V", "getId", "getMediaType", "getPaid", "getPhoto", "getPraiseNum", "setPraiseNum", "getUploadTime", "getVideoType", "getVideoTypeStr", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class UserPhotoBean implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    private final boolean alreadyPaid;
    @Nullable
    private final String clickNum;
    private boolean collect;
    private final boolean collectUser;
    private final boolean cover;
    @Nullable
    private final String formatClickNum;
    @Nullable
    private String formatPraiseNum;
    @Nullable
    private final String id;
    @Nullable
    private final String mediaType;
    private final boolean paid;
    @Nullable
    private final String photo;
    @Nullable
    private String praiseNum;
    @Nullable
    private final String uploadTime;
    @Nullable
    private final String videoType;
    @Nullable
    private final String videoTypeStr;

    /* compiled from: UserPhotoBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/UserPhotoBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/UserPhotoBean;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/UserPhotoBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<UserPhotoBean> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public UserPhotoBean a(@NotNull Parcel parcel) {
        }

        @NotNull
        public UserPhotoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UserPhotoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UserPhotoBean[] newArray(int i2) {
        }
    }

    public UserPhotoBean(boolean z, @Nullable String str, boolean z2, boolean z3, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z4, @Nullable String str6, boolean z5, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
    }

    public static /* synthetic */ UserPhotoBean copy$default(UserPhotoBean userPhotoBean, boolean z, String str, boolean z2, boolean z3, String str2, String str3, String str4, String str5, boolean z4, String str6, boolean z5, String str7, String str8, String str9, String str10, int i2, Object obj) {
    }

    public final boolean component1() {
    }

    @Nullable
    public final String component10() {
    }

    public final boolean component11() {
    }

    @Nullable
    public final String component12() {
    }

    @Nullable
    public final String component13() {
    }

    @Nullable
    public final String component14() {
    }

    @Nullable
    public final String component15() {
    }

    @Nullable
    public final String component2() {
    }

    public final boolean component3() {
    }

    public final boolean component4() {
    }

    @Nullable
    public final String component5() {
    }

    @Nullable
    public final String component6() {
    }

    @Nullable
    public final String component7() {
    }

    @Nullable
    public final String component8() {
    }

    public final boolean component9() {
    }

    @NotNull
    public final UserPhotoBean copy(boolean z, @Nullable String str, boolean z2, boolean z3, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z4, @Nullable String str6, boolean z5, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public final boolean getAlreadyPaid() {
    }

    @Nullable
    public final String getClickNum() {
    }

    public final boolean getCollect() {
    }

    public final boolean getCollectUser() {
    }

    public final boolean getCover() {
    }

    @Nullable
    public final String getFormatClickNum() {
    }

    @Nullable
    public final String getFormatPraiseNum() {
    }

    @Nullable
    public final String getId() {
    }

    @Nullable
    public final String getMediaType() {
    }

    public final boolean getPaid() {
    }

    @Nullable
    public final String getPhoto() {
    }

    @Nullable
    public final String getPraiseNum() {
    }

    @Nullable
    public final String getUploadTime() {
    }

    @Nullable
    public final String getVideoType() {
    }

    @Nullable
    public final String getVideoTypeStr() {
    }

    public int hashCode() {
    }

    public final void setCollect(boolean z) {
    }

    public final void setFormatPraiseNum(@Nullable String str) {
    }

    public final void setPraiseNum(@Nullable String str) {
    }

    @NotNull
    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public UserPhotoBean(@NotNull Parcel parcel) {
    }
}
