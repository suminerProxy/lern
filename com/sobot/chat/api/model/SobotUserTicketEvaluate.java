package com.sobot.chat.api.model;

import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotUserTicketEvaluate implements Serializable {
    private boolean isEvalution;
    private boolean isOpen;
    private String remark;
    private int score;
    private List<TicketScoreInfooListBean> ticketScoreInfooList;
    private boolean txtFlag;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class TicketScoreInfooListBean implements Serializable {
        private String companyId;
        private String configId;
        private String createId;
        private long createTime;
        private int score;
        private String scoreExplain;
        private String scoreId;
        private String updateId;
        private long updateTime;

        public String getCompanyId() {
        }

        public String getConfigId() {
        }

        public String getCreateId() {
        }

        public long getCreateTime() {
        }

        public int getScore() {
        }

        public String getScoreExplain() {
        }

        public String getScoreId() {
        }

        public String getUpdateId() {
        }

        public long getUpdateTime() {
        }

        public void setCompanyId(String str) {
        }

        public void setConfigId(String str) {
        }

        public void setCreateId(String str) {
        }

        public void setCreateTime(long j2) {
        }

        public void setScore(int i2) {
        }

        public void setScoreExplain(String str) {
        }

        public void setScoreId(String str) {
        }

        public void setUpdateId(String str) {
        }

        public void setUpdateTime(long j2) {
        }
    }

    public String getRemark() {
    }

    public int getScore() {
    }

    public List<TicketScoreInfooListBean> getTicketScoreInfooList() {
    }

    public boolean isEvalution() {
    }

    public boolean isOpen() {
    }

    public boolean isTxtFlag() {
    }

    public void setEvalution(boolean z) {
    }

    public void setOpen(boolean z) {
    }

    public void setRemark(String str) {
    }

    public void setScore(int i2) {
    }

    public void setTicketScoreInfooList(List<TicketScoreInfooListBean> list) {
    }

    public void setTxtFlag(boolean z) {
    }
}
