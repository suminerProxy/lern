package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import cn.sharesdk.framework.InnerShareParams;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PostArticleData.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 y2\u00020\u00012\u00020\u0002:\u0001yB\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010s\u001a\u00020\u001cH\u0016J\u0016\u0010t\u001a\u0012\u0012\u0004\u0012\u00020u0\u000ej\b\u0012\u0004\u0012\u00020u`\u0010J\u0018\u0010v\u001a\u00020w2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010x\u001a\u00020\u001cH\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\fR\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u001a\u0010-\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 R.\u00100\u001a\u0016\u0012\u0004\u0012\u000201\u0018\u00010\u000ej\n\u0012\u0004\u0012\u000201\u0018\u0001`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0012\"\u0004\b3\u0010\u0014R\u001a\u00104\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R \u00107\u001a\b\u0012\u0004\u0012\u00020908X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010'\"\u0004\b@\u0010)R\u001a\u0010A\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010'\"\u0004\bC\u0010)R\u001a\u0010D\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010'\"\u0004\bF\u0010)R\u001c\u0010G\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010'\"\u0004\bI\u0010)R \u0010J\u001a\b\u0012\u0004\u0012\u00020%08X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010;\"\u0004\bL\u0010=R\u001a\u0010M\u001a\u00020NX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u001e\"\u0004\bU\u0010 R\u001a\u0010V\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u001e\"\u0004\bX\u0010 R\u001c\u0010Y\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\n\"\u0004\b[\u0010\fR.\u0010\\\u001a\u0016\u0012\u0004\u0012\u00020]\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020]\u0018\u0001`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0012\"\u0004\b_\u0010\u0014R\u001a\u0010`\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010'\"\u0004\bb\u0010)R.\u0010c\u001a\u0016\u0012\u0004\u0012\u00020%\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020%\u0018\u0001`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0012\"\u0004\be\u0010\u0014R.\u0010f\u001a\u0016\u0012\u0004\u0012\u00020g\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020g\u0018\u0001`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0012\"\u0004\bi\u0010\u0014R\u001a\u0010j\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u001e\"\u0004\bl\u0010 R\u001a\u0010m\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010'\"\u0004\bo\u0010)R\u001a\u0010p\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u001e\"\u0004\br\u0010 ¨\u0006z"}, d2 = {"Lcom/showstartfans/activity/model/Article;", "Lcom/showstartfans/activity/model/BaseImMessageBean;", "Landroid/os/Parcelable;", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "activityInfo", "Lcom/showstartfans/activity/model/ActivityInfo;", "getActivityInfo", "()Lcom/showstartfans/activity/model/ActivityInfo;", "setActivityInfo", "(Lcom/showstartfans/activity/model/ActivityInfo;)V", "attachInfo", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/model/AtBean;", "Lkotlin/collections/ArrayList;", "getAttachInfo", "()Ljava/util/ArrayList;", "setAttachInfo", "(Ljava/util/ArrayList;)V", "authorInfo", "Lcom/showstartfans/activity/model/AuthorInfo;", "getAuthorInfo", "()Lcom/showstartfans/activity/model/AuthorInfo;", "setAuthorInfo", "(Lcom/showstartfans/activity/model/AuthorInfo;)V", "category", "", "getCategory", "()I", "setCategory", "(I)V", "cityInfo", "getCityInfo", "setCityInfo", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "ding", "getDing", "setDing", "dingCount", "getDingCount", "setDingCount", "dingUsers", "Lcom/showstartfans/activity/model/UserInfoBean;", "getDingUsers", "setDingUsers", "id", "getId", "setId", "letters", "", "Lcom/showstartfans/activity/model/Letter;", "getLetters", "()Ljava/util/List;", "setLetters", "(Ljava/util/List;)V", "mood", "getMood", "setMood", "moodTitle", "getMoodTitle", "setMoodTitle", "multimediaUrl", "getMultimediaUrl", "setMultimediaUrl", "photo", "getPhoto", "setPhoto", "photos", "getPhotos", "setPhotos", "pushTimestamp", "", "getPushTimestamp", "()J", "setPushTimestamp", "(J)V", "reviewCount", "getReviewCount", "setReviewCount", "showType", "getShowType", "setShowType", InnerShareParams.SITE, "getSite", "setSite", "tagPhoto", "Lcom/showstartfans/activity/model/TagPhotoBean;", "getTagPhoto", "setTagPhoto", "time", "getTime", "setTime", "topicIds", "getTopicIds", "setTopicIds", "topicList", "Lcom/showstartfans/activity/model/TagBean;", "getTopicList", "setTopicList", "type", "getType", "setType", "videoAvatar", "getVideoAvatar", "setVideoAvatar", "viewCount", "getViewCount", "setViewCount", "describeContents", "getTags", "Lcom/showstartfans/activity/model/SceneTagInfoBean;", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Article extends BaseImMessageBean implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    @Nullable
    private ActivityInfo activityInfo;
    @Nullable
    private ArrayList<AtBean> attachInfo;
    @Nullable
    private AuthorInfo authorInfo;
    private int category;
    @Nullable
    private ActivityInfo cityInfo;
    @NotNull
    private String content;
    private int ding;
    private int dingCount;
    @Nullable
    private ArrayList<UserInfoBean> dingUsers;
    private int id;
    @NotNull
    private List<Letter> letters;
    @NotNull
    private String mood;
    @NotNull
    private String moodTitle;
    @NotNull
    private String multimediaUrl;
    @Nullable
    private String photo;
    @NotNull
    private List<String> photos;
    private long pushTimestamp;
    private int reviewCount;
    private int showType;
    @Nullable
    private ActivityInfo site;
    @Nullable
    private ArrayList<TagPhotoBean> tagPhoto;
    @NotNull
    private String time;
    @Nullable
    private ArrayList<String> topicIds;
    @Nullable
    private ArrayList<TagBean> topicList;
    private int type;
    @NotNull
    private String videoAvatar;
    private int viewCount;

    /* compiled from: PostArticleData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/Article$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/Article;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/Article;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<Article> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public Article a(@NotNull Parcel parcel) {
        }

        @NotNull
        public Article[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Article createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Article[] newArray(int i2) {
        }
    }

    public Article() {
    }

    @Override // com.showstartfans.activity.model.BaseImMessageBean, android.os.Parcelable
    public int describeContents() {
    }

    @Nullable
    public final ActivityInfo getActivityInfo() {
    }

    @Nullable
    public final ArrayList<AtBean> getAttachInfo() {
    }

    @Nullable
    public final AuthorInfo getAuthorInfo() {
    }

    public final int getCategory() {
    }

    @Nullable
    public final ActivityInfo getCityInfo() {
    }

    @NotNull
    public final String getContent() {
    }

    public final int getDing() {
    }

    public final int getDingCount() {
    }

    @Nullable
    public final ArrayList<UserInfoBean> getDingUsers() {
    }

    public final int getId() {
    }

    @NotNull
    public final List<Letter> getLetters() {
    }

    @NotNull
    public final String getMood() {
    }

    @NotNull
    public final String getMoodTitle() {
    }

    @NotNull
    public final String getMultimediaUrl() {
    }

    @Nullable
    public final String getPhoto() {
    }

    @NotNull
    public final List<String> getPhotos() {
    }

    public final long getPushTimestamp() {
    }

    public final int getReviewCount() {
    }

    public final int getShowType() {
    }

    @Nullable
    public final ActivityInfo getSite() {
    }

    @Nullable
    public final ArrayList<TagPhotoBean> getTagPhoto() {
    }

    @NotNull
    public final ArrayList<SceneTagInfoBean> getTags() {
    }

    @NotNull
    public final String getTime() {
    }

    @Nullable
    public final ArrayList<String> getTopicIds() {
    }

    @Nullable
    public final ArrayList<TagBean> getTopicList() {
    }

    public final int getType() {
    }

    @NotNull
    public final String getVideoAvatar() {
    }

    public final int getViewCount() {
    }

    public final void setActivityInfo(@Nullable ActivityInfo activityInfo) {
    }

    public final void setAttachInfo(@Nullable ArrayList<AtBean> arrayList) {
    }

    public final void setAuthorInfo(@Nullable AuthorInfo authorInfo) {
    }

    public final void setCategory(int i2) {
    }

    public final void setCityInfo(@Nullable ActivityInfo activityInfo) {
    }

    public final void setContent(@NotNull String str) {
    }

    public final void setDing(int i2) {
    }

    public final void setDingCount(int i2) {
    }

    public final void setDingUsers(@Nullable ArrayList<UserInfoBean> arrayList) {
    }

    public final void setId(int i2) {
    }

    public final void setLetters(@NotNull List<Letter> list) {
    }

    public final void setMood(@NotNull String str) {
    }

    public final void setMoodTitle(@NotNull String str) {
    }

    public final void setMultimediaUrl(@NotNull String str) {
    }

    public final void setPhoto(@Nullable String str) {
    }

    public final void setPhotos(@NotNull List<String> list) {
    }

    public final void setPushTimestamp(long j2) {
    }

    public final void setReviewCount(int i2) {
    }

    public final void setShowType(int i2) {
    }

    public final void setSite(@Nullable ActivityInfo activityInfo) {
    }

    public final void setTagPhoto(@Nullable ArrayList<TagPhotoBean> arrayList) {
    }

    public final void setTime(@NotNull String str) {
    }

    public final void setTopicIds(@Nullable ArrayList<String> arrayList) {
    }

    public final void setTopicList(@Nullable ArrayList<TagBean> arrayList) {
    }

    public final void setType(int i2) {
    }

    public final void setVideoAvatar(@NotNull String str) {
    }

    public final void setViewCount(int i2) {
    }

    @Override // com.showstartfans.activity.model.BaseImMessageBean, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public Article(@NotNull Parcel parcel) {
    }
}
