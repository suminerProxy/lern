package com.sobot.chat.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.sobot.chat.adapter.base.SobotBaseAdapter;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.viewHolder.base.MessageHolderBase;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotMsgAdapter extends SobotBaseAdapter<ZhiChiMessageBase> {
    public static final int MSG_TYPE_AUDIO_R = 6;
    public static final int MSG_TYPE_CARD_L = 27;
    public static final int MSG_TYPE_CARD_R = 24;
    public static final int MSG_TYPE_CONSULT = 7;
    public static final int MSG_TYPE_CUSTOM_EVALUATE = 8;
    public static final int MSG_TYPE_FILE_L = 19;
    public static final int MSG_TYPE_FILE_R = 20;
    public static final int MSG_TYPE_FRAUD_PREVENTION = 29;
    private static final int MSG_TYPE_ILLEGAL = 0;
    public static final int MSG_TYPE_IMG_L = 4;
    public static final int MSG_TYPE_IMG_R = 5;
    public static final int MSG_TYPE_LOCATION_R = 22;
    public static final int MSG_TYPE_MUITI_LEAVE_MSG_R = 31;
    public static final int MSG_TYPE_MULTI_ROUND_R = 12;
    public static final int MSG_TYPE_NOTICE = 23;
    public static final int MSG_TYPE_RETRACTED_MSG = 16;
    public static final int MSG_TYPE_RICH = 3;
    public static final int MSG_TYPE_ROBOT_ANSWER_ITEMS = 17;
    public static final int MSG_TYPE_ROBOT_KEYWORD_ITEMS = 18;
    public static final int MSG_TYPE_ROBOT_ORDERCARD_L = 26;
    public static final int MSG_TYPE_ROBOT_ORDERCARD_R = 25;
    public static final int MSG_TYPE_ROBOT_QUESTION_RECOMMEND = 15;
    public static final int MSG_TYPE_ROBOT_TEMPLATE1 = 9;
    public static final int MSG_TYPE_ROBOT_TEMPLATE2 = 10;
    public static final int MSG_TYPE_ROBOT_TEMPLATE3 = 11;
    public static final int MSG_TYPE_ROBOT_TEMPLATE4 = 13;
    public static final int MSG_TYPE_ROBOT_TEMPLATE5 = 14;
    public static final int MSG_TYPE_ROBOT_TEMPLATE6 = 28;
    public static final int MSG_TYPE_TIP = 2;
    public static final int MSG_TYPE_TXT_L = 0;
    public static final int MSG_TYPE_TXT_R = 1;
    public static final int MSG_TYPE_VIDEO_L = 30;
    public static final int MSG_TYPE_VIDEO_R = 21;
    private static final String[] layoutRes = null;
    private SobotMsgCallBack mMsgCallBack;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface SobotMsgCallBack {
        void addMessage(ZhiChiMessageBase zhiChiMessageBase);

        void clickAudioItem(ZhiChiMessageBase zhiChiMessageBase);

        void doClickTransferBtn(ZhiChiMessageBase zhiChiMessageBase);

        void doEvaluate(boolean z, ZhiChiMessageBase zhiChiMessageBase);

        void doRevaluate(boolean z, ZhiChiMessageBase zhiChiMessageBase);

        void hidePanelAndKeyboard();

        void mulitDiaToLeaveMsg(String str);

        void removeMessageByMsgId(String str);

        void sendConsultingContent();

        void sendMessage(String str);

        void sendMessageToRobot(ZhiChiMessageBase zhiChiMessageBase, int i2, int i3, String str);

        void sendMessageToRobot(ZhiChiMessageBase zhiChiMessageBase, int i2, int i3, String str, String str2);
    }

    public SobotMsgAdapter(Context context, List<ZhiChiMessageBase> list, SobotMsgCallBack sobotMsgCallBack) {
    }

    private ZhiChiMessageBase getMsgInfo(String str) {
    }

    private String getTimeStr(ZhiChiMessageBase zhiChiMessageBase, int i2) {
    }

    private View initView(View view, int i2, int i3, ZhiChiMessageBase zhiChiMessageBase) {
    }

    private void removeByAction(ZhiChiMessageBase zhiChiMessageBase, String str, String str2, boolean z) {
    }

    private void setDefaultCid(String str, ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void addData(List<ZhiChiMessageBase> list) {
    }

    public void addDataBefore(ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void addMessage(int i2, ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void cancelVoiceUiById(String str) {
    }

    @Override // com.sobot.chat.adapter.base.SobotBaseAdapter, android.widget.Adapter
    public /* bridge */ /* synthetic */ Object getItem(int i2) {
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i2) {
    }

    public int getMsgInfoPosition(String str) {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
    }

    public void handerRemindTiem(MessageHolderBase messageHolderBase, int i2) {
    }

    public void justAddData(ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void removeByMsgId(String str) {
    }

    public void removeConsulting() {
    }

    public void removeEvaluateData() {
    }

    public void removeKeyWordTranferItem() {
    }

    public void submitEvaluateData(int i2, int i3) {
    }

    public void updateDataById(String str, ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void updateDataStateById(String str, ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void updateMsgInfoById(String str, int i2, int i3) {
    }

    public void updatePicStatusById(String str, int i2) {
    }

    public void updateVoiceStatusById(String str, int i2, String str2) {
    }

    @Override // com.sobot.chat.adapter.base.SobotBaseAdapter, android.widget.Adapter
    public ZhiChiMessageBase getItem(int i2) {
    }

    public void addData(ZhiChiMessageBase zhiChiMessageBase) {
    }

    private void setDefaultCid(List<ZhiChiMessageBase> list) {
    }
}
