package com.sobot.chat.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sobot.chat.adapter.base.SobotBaseAdapter;
import com.sobot.chat.api.model.StCategoryModel;
import com.sobot.chat.widget.SobotImageView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotHelpCenterAdapter extends SobotBaseAdapter<StCategoryModel> {
    private LayoutInflater mInflater;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class ViewHolder {
        private Context mContext;
        private int sobot_bg_default_pic;
        private LinearLayout sobot_container;
        private RelativeLayout sobot_rl;
        private TextView sobot_tv_descripe;
        private SobotImageView sobot_tv_icon;
        private TextView sobot_tv_title;

        public ViewHolder(Context context, View view) {
        }

        public void bindData(int i2, StCategoryModel stCategoryModel) {
        }
    }

    public SobotHelpCenterAdapter(Context context, List<StCategoryModel> list) {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }
}
