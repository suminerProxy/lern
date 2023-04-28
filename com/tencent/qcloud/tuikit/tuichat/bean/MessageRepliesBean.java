package com.tencent.qcloud.tuikit.tuichat.bean;

import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MessageRepliesBean implements Serializable {
    public static final int VERSION = 1;
    private List<ReplyBean> replies;
    private int version;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ReplyBean implements Serializable {
        private String messageAbstract;
        private String messageID;
        private String messageSender;
        private transient String senderFaceUrl;
        private transient String senderShowName;

        public static /* synthetic */ String access$000(ReplyBean replyBean) {
        }

        public static /* synthetic */ String access$002(ReplyBean replyBean, String str) {
        }

        public static /* synthetic */ String access$102(ReplyBean replyBean, String str) {
        }

        public static /* synthetic */ String access$202(ReplyBean replyBean, String str) {
        }

        public String getMessageAbstract() {
        }

        public String getMessageID() {
        }

        public String getMessageSender() {
        }

        public String getSenderFaceUrl() {
        }

        public String getSenderShowName() {
        }

        public void setMessageAbstract(String str) {
        }

        public void setMessageID(String str) {
        }

        public void setMessageSender(String str) {
        }

        public void setSenderFaceUrl(String str) {
        }

        public void setSenderShowName(String str) {
        }
    }

    public void addReplyMessage(String str, String str2, String str3) {
    }

    public List<ReplyBean> getReplies() {
    }

    public int getRepliesSize() {
    }

    public int getVersion() {
    }

    public void removeReplyMessage(String str) {
    }

    public void setReplies(List<ReplyBean> list) {
    }

    public void setVersion(int i2) {
    }
}
