package com.sobot.chat.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.sobot.chat.adapter.base.SobotBaseAdapter;
import com.sobot.chat.api.model.SobotMsgCenterModel;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotMsgCenterAdapter extends SobotBaseAdapter<SobotMsgCenterModel> {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class SobotMsgCenterViewHolder {
        public Context context;
        private SobotMsgCenterModel data;
        public int defaultFaceId;
        public ImageView sobot_iv_face;
        public TextView sobot_tv_content;
        public TextView sobot_tv_date;
        public TextView sobot_tv_title;
        public TextView sobot_tv_unread_count;

        public SobotMsgCenterViewHolder(Context context, View view) {
        }

        private void setUnReadNum(TextView textView, int i2) {
        }

        public void bindData(SobotMsgCenterModel sobotMsgCenterModel) {
        }
    }

    public SobotMsgCenterAdapter(Context context, List<SobotMsgCenterModel> list) {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }
}
