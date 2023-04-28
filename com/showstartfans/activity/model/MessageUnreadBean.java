package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.platform.comapi.map.MapBundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MessageUnreadBean.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 12\u00020\u0001:\u00011B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010-\u001a\u00020\u0007H\u0016J\u0018\u0010.\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0007H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR\u001a\u0010$\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001a\u0010*\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000b¨\u00062"}, d2 = {"Lcom/showstartfans/activity/model/MessageUnreadBean;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "activityMsgNum", "", "getActivityMsgNum", "()I", "setActivityMsgNum", "(I)V", "attentionNum", "getAttentionNum", "setAttentionNum", "commentMsgNum", "getCommentMsgNum", "setCommentMsgNum", "fansMsgNum", "getFansMsgNum", "setFansMsgNum", "goodsMsgVo", "Lcom/showstartfans/activity/model/GroupMsgBean;", "getGoodsMsgVo", "()Lcom/showstartfans/activity/model/GroupMsgBean;", "setGoodsMsgVo", "(Lcom/showstartfans/activity/model/GroupMsgBean;)V", "groupMsgVo", "getGroupMsgVo", "setGroupMsgVo", "likeMsgNum", "getLikeMsgNum", "setLikeMsgNum", "officialMsgNum", "getOfficialMsgNum", "setOfficialMsgNum", "orderMsgNum", "getOrderMsgNum", "setOrderMsgNum", "raiseMsgVo", "getRaiseMsgVo", "setRaiseMsgVo", "statementMsgNum", "getStatementMsgNum", "setStatementMsgNum", "describeContents", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class MessageUnreadBean implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    private int activityMsgNum;
    private int attentionNum;
    private int commentMsgNum;
    private int fansMsgNum;
    @Nullable
    private GroupMsgBean goodsMsgVo;
    @Nullable
    private GroupMsgBean groupMsgVo;
    private int likeMsgNum;
    private int officialMsgNum;
    private int orderMsgNum;
    @Nullable
    private GroupMsgBean raiseMsgVo;
    private int statementMsgNum;

    /* compiled from: MessageUnreadBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/MessageUnreadBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/MessageUnreadBean;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/MessageUnreadBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<MessageUnreadBean> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public MessageUnreadBean a(@NotNull Parcel parcel) {
        }

        @NotNull
        public MessageUnreadBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageUnreadBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageUnreadBean[] newArray(int i2) {
        }
    }

    public MessageUnreadBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public final int getActivityMsgNum() {
    }

    public final int getAttentionNum() {
    }

    public final int getCommentMsgNum() {
    }

    public final int getFansMsgNum() {
    }

    @Nullable
    public final GroupMsgBean getGoodsMsgVo() {
    }

    @Nullable
    public final GroupMsgBean getGroupMsgVo() {
    }

    public final int getLikeMsgNum() {
    }

    public final int getOfficialMsgNum() {
    }

    public final int getOrderMsgNum() {
    }

    @Nullable
    public final GroupMsgBean getRaiseMsgVo() {
    }

    public final int getStatementMsgNum() {
    }

    public final void setActivityMsgNum(int i2) {
    }

    public final void setAttentionNum(int i2) {
    }

    public final void setCommentMsgNum(int i2) {
    }

    public final void setFansMsgNum(int i2) {
    }

    public final void setGoodsMsgVo(@Nullable GroupMsgBean groupMsgBean) {
    }

    public final void setGroupMsgVo(@Nullable GroupMsgBean groupMsgBean) {
    }

    public final void setLikeMsgNum(int i2) {
    }

    public final void setOfficialMsgNum(int i2) {
    }

    public final void setOrderMsgNum(int i2) {
    }

    public final void setRaiseMsgVo(@Nullable GroupMsgBean groupMsgBean) {
    }

    public final void setStatementMsgNum(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public MessageUnreadBean(@NotNull Parcel parcel) {
    }
}
