package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import cn.sharesdk.framework.InnerShareParams;
import com.baidu.platform.comapi.map.MapBundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PostArticleData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010)\u001a\u0004\u0018\u00010*J\b\u0010+\u001a\u00020\u0007H\u0016J\u0018\u0010,\u001a\u00020-2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0007H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001a\u0010\u001d\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u001a\u0010#\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u000bR\u001a\u0010&\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000b¨\u00060"}, d2 = {"Lcom/showstartfans/activity/model/AuthorInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "activityRoleType", "", "getActivityRoleType", "()I", "setActivityRoleType", "(I)V", InnerShareParams.ADDRESS, "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "avatar", "getAvatar", "setAvatar", "id", "getId", "setId", "isCollect", "setCollect", "name", "getName", "setName", "relationship", "getRelationship", "setRelationship", "signature", "getSignature", "setSignature", "userLevel", "getUserLevel", "setUserLevel", "userType", "getUserType", "setUserType", "converToUserInfoBean", "Lcom/showstartfans/activity/model/UserInfoBean;", "describeContents", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class AuthorInfo implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    private int activityRoleType;
    @NotNull
    private String address;
    @NotNull
    private String avatar;
    private int id;
    private int isCollect;
    @NotNull
    private String name;
    private int relationship;
    @NotNull
    private String signature;
    private int userLevel;
    private int userType;

    /* compiled from: PostArticleData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/AuthorInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/AuthorInfo;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/AuthorInfo;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<AuthorInfo> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public AuthorInfo a(@NotNull Parcel parcel) {
        }

        @NotNull
        public AuthorInfo[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AuthorInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AuthorInfo[] newArray(int i2) {
        }
    }

    public AuthorInfo() {
    }

    @Nullable
    public final UserInfoBean converToUserInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public final int getActivityRoleType() {
    }

    @NotNull
    public final String getAddress() {
    }

    @NotNull
    public final String getAvatar() {
    }

    public final int getId() {
    }

    @NotNull
    public final String getName() {
    }

    public final int getRelationship() {
    }

    @NotNull
    public final String getSignature() {
    }

    public final int getUserLevel() {
    }

    public final int getUserType() {
    }

    public final int isCollect() {
    }

    public final void setActivityRoleType(int i2) {
    }

    public final void setAddress(@NotNull String str) {
    }

    public final void setAvatar(@NotNull String str) {
    }

    public final void setCollect(int i2) {
    }

    public final void setId(int i2) {
    }

    public final void setName(@NotNull String str) {
    }

    public final void setRelationship(int i2) {
    }

    public final void setSignature(@NotNull String str) {
    }

    public final void setUserLevel(int i2) {
    }

    public final void setUserType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public AuthorInfo(@NotNull Parcel parcel) {
    }
}
