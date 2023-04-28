package com.sobot.chat.api.model;

import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotRobotGuess implements Serializable {
    private String originQuestion;
    private List<RespInfoListBean> respInfoList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class RespInfoListBean {
        private String docId;
        private String highlight;
        private String question;

        public String getDocId() {
        }

        public String getHighlight() {
        }

        public String getQuestion() {
        }

        public void setDocId(String str) {
        }

        public void setHighlight(String str) {
        }

        public void setQuestion(String str) {
        }
    }

    public String getOriginQuestion() {
    }

    public List<RespInfoListBean> getRespInfoList() {
    }

    public void setOriginQuestion(String str) {
    }

    public void setRespInfoList(List<RespInfoListBean> list) {
    }
}
