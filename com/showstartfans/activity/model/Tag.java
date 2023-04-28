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

/* compiled from: PostArticleData.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 V2\u00020\u0001:\u0001VB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010R\u001a\u000201H\u0016J\u0018\u0010S\u001a\u00020T2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010U\u001a\u000201H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR\u001a\u00100\u001a\u000201X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R \u00106\u001a\b\u0012\u0004\u0012\u0002070\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010!\"\u0004\b9\u0010#R\u001a\u0010:\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\t\"\u0004\b<\u0010\u000bR\u001a\u0010=\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\t\"\u0004\b?\u0010\u000bR\u001a\u0010@\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\t\"\u0004\bB\u0010\u000bR\u001a\u0010C\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\t\"\u0004\bE\u0010\u000bR\u001a\u0010F\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\t\"\u0004\bH\u0010\u000bR\u001a\u0010I\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\t\"\u0004\bK\u0010\u000bR\u001c\u0010L\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\t\"\u0004\bN\u0010\u000bR\u001a\u0010O\u001a\u000201X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00103\"\u0004\bQ\u00105¨\u0006W"}, d2 = {"Lcom/showstartfans/activity/model/Tag;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "articleNum", "", "getArticleNum", "()Ljava/lang/String;", "setArticleNum", "(Ljava/lang/String;)V", InnerShareParams.AUTHOR, "Lcom/showstartfans/activity/model/UserInfoBean;", "getAuthor", "()Lcom/showstartfans/activity/model/UserInfoBean;", "setAuthor", "(Lcom/showstartfans/activity/model/UserInfoBean;)V", "canSendMoment", "getCanSendMoment", "setCanSendMoment", "canSendPost", "getCanSendPost", "setCanSendPost", "cityName", "getCityName", "setCityName", "desc", "getDesc", "setDesc", "fansList", "", "getFansList", "()Ljava/util/List;", "setFansList", "(Ljava/util/List;)V", "fansNum", "getFansNum", "setFansNum", "groupInfo", "Lcom/showstartfans/activity/model/GroupInfo;", "getGroupInfo", "()Lcom/showstartfans/activity/model/GroupInfo;", "setGroupInfo", "(Lcom/showstartfans/activity/model/GroupInfo;)V", "hasPhoto", "getHasPhoto", "setHasPhoto", "id", "", "getId", "()I", "setId", "(I)V", "moments", "Lcom/showstartfans/activity/model/Article;", "getMoments", "setMoments", "name", "getName", "setName", "onlookerNum", "getOnlookerNum", "setOnlookerNum", "photo", "getPhoto", "setPhoto", "showMoment", "getShowMoment", "setShowMoment", "showTime", "getShowTime", "setShowTime", InnerShareParams.SITE, "getSite", "setSite", "topicId", "getTopicId", "setTopicId", "type", "getType", "setType", "describeContents", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Tag implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    @NotNull
    private String articleNum;
    @Nullable
    private UserInfoBean author;
    @NotNull
    private String canSendMoment;
    @NotNull
    private String canSendPost;
    @NotNull
    private String cityName;
    @NotNull
    private String desc;
    @NotNull
    private List<UserInfoBean> fansList;
    @NotNull
    private String fansNum;
    @Nullable
    private GroupInfo groupInfo;
    @Nullable
    private String hasPhoto;
    private int id;
    @NotNull
    private List<Article> moments;
    @NotNull
    private String name;
    @NotNull
    private String onlookerNum;
    @NotNull
    private String photo;
    @NotNull
    private String showMoment;
    @NotNull
    private String showTime;
    @NotNull
    private String site;
    @Nullable
    private String topicId;
    private int type;

    /* compiled from: PostArticleData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/Tag$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/Tag;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/Tag;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<Tag> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public Tag a(@NotNull Parcel parcel) {
        }

        @NotNull
        public Tag[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Tag createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Tag[] newArray(int i2) {
        }
    }

    public Tag() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @NotNull
    public final String getArticleNum() {
    }

    @Nullable
    public final UserInfoBean getAuthor() {
    }

    @NotNull
    public final String getCanSendMoment() {
    }

    @NotNull
    public final String getCanSendPost() {
    }

    @NotNull
    public final String getCityName() {
    }

    @NotNull
    public final String getDesc() {
    }

    @NotNull
    public final List<UserInfoBean> getFansList() {
    }

    @NotNull
    public final String getFansNum() {
    }

    @Nullable
    public final GroupInfo getGroupInfo() {
    }

    @Nullable
    public final String getHasPhoto() {
    }

    public final int getId() {
    }

    @NotNull
    public final List<Article> getMoments() {
    }

    @NotNull
    public final String getName() {
    }

    @NotNull
    public final String getOnlookerNum() {
    }

    @NotNull
    public final String getPhoto() {
    }

    @NotNull
    public final String getShowMoment() {
    }

    @NotNull
    public final String getShowTime() {
    }

    @NotNull
    public final String getSite() {
    }

    @Nullable
    public final String getTopicId() {
    }

    public final int getType() {
    }

    public final void setArticleNum(@NotNull String str) {
    }

    public final void setAuthor(@Nullable UserInfoBean userInfoBean) {
    }

    public final void setCanSendMoment(@NotNull String str) {
    }

    public final void setCanSendPost(@NotNull String str) {
    }

    public final void setCityName(@NotNull String str) {
    }

    public final void setDesc(@NotNull String str) {
    }

    public final void setFansList(@NotNull List<UserInfoBean> list) {
    }

    public final void setFansNum(@NotNull String str) {
    }

    public final void setGroupInfo(@Nullable GroupInfo groupInfo) {
    }

    public final void setHasPhoto(@Nullable String str) {
    }

    public final void setId(int i2) {
    }

    public final void setMoments(@NotNull List<Article> list) {
    }

    public final void setName(@NotNull String str) {
    }

    public final void setOnlookerNum(@NotNull String str) {
    }

    public final void setPhoto(@NotNull String str) {
    }

    public final void setShowMoment(@NotNull String str) {
    }

    public final void setShowTime(@NotNull String str) {
    }

    public final void setSite(@NotNull String str) {
    }

    public final void setTopicId(@Nullable String str) {
    }

    public final void setType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public Tag(@NotNull Parcel parcel) {
    }
}
