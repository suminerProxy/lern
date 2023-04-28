package com.tencent.qcloud.tuikit.tuicontact.bean;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ConversationInfo implements Serializable, Comparable<ConversationInfo> {
    public static final int TYPE_COMMON = 1;
    public static final int TYPE_CUSTOM = 2;
    public static final int TYPE_FORWAR_SELECT = 3;
    public static final int TYPE_RECENT_LABEL = 4;
    private String atInfoText;
    private String conversationId;
    private String groupType;
    private String iconPath;
    private List<Object> iconUrlList;
    private String id;
    private boolean isGroup;
    private long lastMessageTime;
    private long orderKey;
    private boolean showDisturbIcon;
    private String title;

    /* renamed from: top  reason: collision with root package name */
    private boolean f12899top;
    private int type;
    private int unRead;

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@NonNull ConversationInfo conversationInfo) {
    }

    public String getAtInfoText() {
    }

    public String getConversationId() {
    }

    public String getGroupType() {
    }

    public String getIconPath() {
    }

    public List<Object> getIconUrlList() {
    }

    public String getId() {
    }

    public long getLastMessageTime() {
    }

    public long getOrderKey() {
    }

    public String getTitle() {
    }

    public int getType() {
    }

    public int getUnRead() {
    }

    public boolean isGroup() {
    }

    public boolean isShowDisturbIcon() {
    }

    public boolean isTop() {
    }

    public void setAtInfoText(String str) {
    }

    public void setConversationId(String str) {
    }

    public void setGroup(boolean z) {
    }

    public void setGroupType(String str) {
    }

    public void setIconPath(String str) {
    }

    public void setIconUrlList(List<Object> list) {
    }

    public void setId(String str) {
    }

    public void setLastMessageTime(long j2) {
    }

    public void setOrderKey(long j2) {
    }

    public void setShowDisturbIcon(boolean z) {
    }

    public void setTitle(String str) {
    }

    public void setTop(boolean z) {
    }

    public void setType(int i2) {
    }

    public void setUnRead(int i2) {
    }

    public String toString() {
    }

    /* renamed from: compareTo  reason: avoid collision after fix types in other method */
    public int compareTo2(@NonNull ConversationInfo conversationInfo) {
    }
}
