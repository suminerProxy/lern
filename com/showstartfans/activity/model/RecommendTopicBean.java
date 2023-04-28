package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.tencent.android.tpush.common.MessageKey;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RecommendTopicBean.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010*\u001a\u00020\u0013H\u0016J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0013H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001a\u0010'\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017¨\u00060"}, d2 = {"Lcom/showstartfans/activity/model/RecommendTopicBean;", "Landroid/os/Parcelable;", "()V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "accessNumView", "", "getAccessNumView", "()Ljava/lang/String;", "setAccessNumView", "(Ljava/lang/String;)V", "articleNumView", "getArticleNumView", "setArticleNumView", "desc", "getDesc", "setDesc", "id", "", "getId", "()I", "setId", "(I)V", "name", "getName", "setName", "newestArticle", "Lcom/showstartfans/activity/model/Article;", "getNewestArticle", "()Lcom/showstartfans/activity/model/Article;", "setNewestArticle", "(Lcom/showstartfans/activity/model/Article;)V", "targetId", "getTargetId", "setTargetId", MessageKey.MSG_TARGET_TYPE, "getTargetType", "setTargetType", "type", "getType", "setType", "describeContents", "writeToParcel", "", "dest", "flags", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class RecommendTopicBean implements Parcelable {
    @JvmField
    @NotNull
    public static final Parcelable.Creator<RecommendTopicBean> CREATOR = null;
    @NotNull
    public static final b Companion = null;
    @Nullable
    private String accessNumView;
    @Nullable
    private String articleNumView;
    @Nullable
    private String desc;
    private int id;
    @Nullable
    private String name;
    @Nullable
    private Article newestArticle;
    private int targetId;
    private int targetType;
    private int type;

    /* compiled from: RecommendTopicBean.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/model/RecommendTopicBean$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/RecommendTopicBean;", "createFromParcel", "in", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/RecommendTopicBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<RecommendTopicBean> {
        @NotNull
        public RecommendTopicBean a(@NotNull Parcel parcel) {
        }

        @NotNull
        public RecommendTopicBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RecommendTopicBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RecommendTopicBean[] newArray(int i2) {
        }
    }

    /* compiled from: RecommendTopicBean.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/showstartfans/activity/model/RecommendTopicBean$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/RecommendTopicBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public RecommendTopicBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Nullable
    public final String getAccessNumView() {
    }

    @Nullable
    public final String getArticleNumView() {
    }

    @Nullable
    public final String getDesc() {
    }

    public final int getId() {
    }

    @Nullable
    public final String getName() {
    }

    @Nullable
    public final Article getNewestArticle() {
    }

    public final int getTargetId() {
    }

    public final int getTargetType() {
    }

    public final int getType() {
    }

    public final void setAccessNumView(@Nullable String str) {
    }

    public final void setArticleNumView(@Nullable String str) {
    }

    public final void setDesc(@Nullable String str) {
    }

    public final void setId(int i2) {
    }

    public final void setName(@Nullable String str) {
    }

    public final void setNewestArticle(@Nullable Article article) {
    }

    public final void setTargetId(int i2) {
    }

    public final void setTargetType(int i2) {
    }

    public final void setType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public RecommendTopicBean(@NotNull Parcel parcel) {
    }
}
