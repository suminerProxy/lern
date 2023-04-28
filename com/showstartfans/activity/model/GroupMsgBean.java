package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MessageUnreadBean.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0015H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/showstartfans/activity/model/GroupMsgBean;", "Landroid/os/Parcelable;", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "createTimestamp", "", "getCreateTimestamp", "()J", "setCreateTimestamp", "(J)V", "showTime", "getShowTime", "setShowTime", "unReadNum", "", "getUnReadNum", "()I", "setUnReadNum", "(I)V", "describeContents", "formatToCrowdConversationInfo", "Lcom/tencent/qcloud/tuikit/tuiconversation/bean/ConversationInfo;", "formatToGoodConversationInfo", "writeToParcel", "", "dest", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class GroupMsgBean implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    @NotNull
    private static final String ID_XIUDONG_CROWD = null;
    @NotNull
    private static final String ID_XIUDONG_GOOD = null;
    @NotNull
    private String content;
    private long createTimestamp;
    @NotNull
    private String showTime;
    private int unReadNum;

    /* compiled from: MessageUnreadBean.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001d\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/showstartfans/activity/model/GroupMsgBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/GroupMsgBean;", "()V", "ID_XIUDONG_CROWD", "", "getID_XIUDONG_CROWD", "()Ljava/lang/String;", "ID_XIUDONG_GOOD", "getID_XIUDONG_GOOD", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/GroupMsgBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<GroupMsgBean> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public GroupMsgBean a(@NotNull Parcel parcel) {
        }

        @NotNull
        public final String b() {
        }

        @NotNull
        public final String c() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GroupMsgBean createFromParcel(Parcel parcel) {
        }

        @NotNull
        public GroupMsgBean[] d(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GroupMsgBean[] newArray(int i2) {
        }
    }

    public GroupMsgBean(@NotNull Parcel parcel) {
    }

    public static final /* synthetic */ String access$getID_XIUDONG_CROWD$cp() {
    }

    public static final /* synthetic */ String access$getID_XIUDONG_GOOD$cp() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Nullable
    public final ConversationInfo formatToCrowdConversationInfo() {
    }

    @Nullable
    public final ConversationInfo formatToGoodConversationInfo() {
    }

    @NotNull
    public final String getContent() {
    }

    public final long getCreateTimestamp() {
    }

    @NotNull
    public final String getShowTime() {
    }

    public final int getUnReadNum() {
    }

    public final void setContent(@NotNull String str) {
    }

    public final void setCreateTimestamp(long j2) {
    }

    public final void setShowTime(@NotNull String str) {
    }

    public final void setUnReadNum(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }
}
