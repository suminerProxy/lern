package com.tencent.qcloud.tuikit.tuisearch.bean;

import android.net.Uri;
import com.tencent.imsdk.v2.V2TIMCallback;
import com.tencent.imsdk.v2.V2TIMMessage;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MessageInfo implements Serializable {
    public static final int MSG_STATUS_DELETE = 274;
    public static final int MSG_STATUS_DOWNLOADED = 6;
    public static final int MSG_STATUS_DOWNLOADING = 4;
    public static final int MSG_STATUS_NORMAL = 0;
    public static final int MSG_STATUS_READ = 273;
    public static final int MSG_STATUS_REVOKE = 275;
    public static final int MSG_STATUS_SENDING = 1;
    public static final int MSG_STATUS_SEND_FAIL = 3;
    public static final int MSG_STATUS_SEND_SUCCESS = 2;
    public static final int MSG_STATUS_UN_DOWNLOAD = 5;
    public static final int MSG_TYPE_AUDIO = 48;
    public static final int MSG_TYPE_CUSTOM = 128;
    public static final int MSG_TYPE_CUSTOM_FACE = 112;
    public static final int MSG_TYPE_FILE = 80;
    public static final int MSG_TYPE_GROUP_CREATE = 257;
    public static final int MSG_TYPE_GROUP_DELETE = 258;
    public static final int MSG_TYPE_GROUP_JOIN = 259;
    public static final int MSG_TYPE_GROUP_KICK = 261;
    public static final int MSG_TYPE_GROUP_MODIFY_NAME = 262;
    public static final int MSG_TYPE_GROUP_MODIFY_NOTICE = 263;
    public static final int MSG_TYPE_GROUP_QUITE = 260;
    public static final int MSG_TYPE_IMAGE = 32;
    public static final int MSG_TYPE_LOCATION = 96;
    public static final int MSG_TYPE_MERGE = 129;
    public static final int MSG_TYPE_MIME = 1;
    public static final int MSG_TYPE_TEXT = 0;
    public static final int MSG_TYPE_TIPS = 256;
    public static final int MSG_TYPE_VIDEO = 64;
    private final String TAG;
    private String dataPath;
    private String dataUri;
    private int downloadStatus;
    private Object extra;
    private String faceUrl;
    private String friendRemark;
    private String fromUser;
    private boolean group;
    private String groupId;
    private String groupNameCard;
    private String id;
    private int imgHeight;
    private int imgWidth;
    private boolean isIgnoreShow;
    private long msgTime;
    private int msgType;
    private String nameCard;
    private String nickName;
    private boolean peerRead;
    private boolean read;
    private boolean self;
    private int status;
    private V2TIMMessage timMessage;
    private long uniqueId;
    private String userId;

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.bean.MessageInfo$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements V2TIMCallback {
        public final /* synthetic */ MessageInfo this$0;

        public AnonymousClass1(MessageInfo messageInfo) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    public boolean checkEquals(String str) {
    }

    public byte[] getCustomElemData() {
    }

    public int getCustomInt() {
    }

    public String getDataPath() {
    }

    public String getDataUri() {
    }

    public Uri getDataUriObj() {
    }

    public int getDownloadStatus() {
    }

    public int getElemType() {
    }

    public Object getExtra() {
    }

    public String getFaceUrl() {
    }

    public String getFriendRemark() {
    }

    public String getFromUser() {
    }

    public String getGroupId() {
    }

    public String getGroupNameCard() {
    }

    public String getId() {
    }

    public int getImgHeight() {
    }

    public int getImgWidth() {
    }

    public boolean getIsIgnoreShow() {
    }

    public int getMessageInfoElemType() {
    }

    public long getMsgTime() {
    }

    public int getMsgType() {
    }

    public String getNameCard() {
    }

    public String getNickName() {
    }

    public int getStatus() {
    }

    public V2TIMMessage getTimMessage() {
    }

    public long getUniqueId() {
    }

    public String getUserId() {
    }

    public boolean isGroup() {
    }

    public boolean isPeerRead() {
    }

    public boolean isRead() {
    }

    public boolean isSelf() {
    }

    public boolean remove() {
    }

    public void setCustomInt(int i2) {
    }

    public void setDataPath(String str) {
    }

    public void setDataUri(Uri uri) {
    }

    public void setDownloadStatus(int i2) {
    }

    public void setExtra(Object obj) {
    }

    public void setFaceUrl(String str) {
    }

    public void setFriendRemark(String str) {
    }

    public void setFromUser(String str) {
    }

    public void setGroup(boolean z) {
    }

    public void setGroupId(String str) {
    }

    public void setGroupNameCard(String str) {
    }

    public void setId(String str) {
    }

    public void setIgnoreShow(boolean z) {
    }

    public void setImgHeight(int i2) {
    }

    public void setImgWidth(int i2) {
    }

    public void setMsgTime(long j2) {
    }

    public void setMsgType(int i2) {
    }

    public void setNameCard(String str) {
    }

    public void setNickName(String str) {
    }

    public void setPeerRead(boolean z) {
    }

    public void setRead(boolean z) {
    }

    public void setSelf(boolean z) {
    }

    public void setStatus(int i2) {
    }

    public void setTimMessage(V2TIMMessage v2TIMMessage) {
    }

    public void setUniqueId(long j2) {
    }

    public void setUserId(String str) {
    }

    public void setDataUri(String str) {
    }
}
