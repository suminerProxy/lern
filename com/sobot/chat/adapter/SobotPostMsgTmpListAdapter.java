package com.sobot.chat.adapter;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sobot.chat.adapter.base.SobotBaseGvAdapter;
import com.sobot.chat.api.model.SobotPostMsgTemplate;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotPostMsgTmpListAdapter extends SobotBaseGvAdapter<SobotPostMsgTemplate> {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class ViewHolder extends SobotBaseGvAdapter.BaseViewHolder<SobotPostMsgTemplate> {
        private LinearLayout sobot_ll_content;
        private TextView sobot_tv_content;

        public /* synthetic */ ViewHolder(Context context, View view, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.sobot.chat.adapter.base.SobotBaseGvAdapter.BaseViewHolder
        public /* bridge */ /* synthetic */ void bindData(SobotPostMsgTemplate sobotPostMsgTemplate, int i2) {
        }

        private ViewHolder(Context context, View view) {
        }

        /* renamed from: bindData  reason: avoid collision after fix types in other method */
        public void bindData2(SobotPostMsgTemplate sobotPostMsgTemplate, int i2) {
        }
    }

    public SobotPostMsgTmpListAdapter(Context context, List<SobotPostMsgTemplate> list) {
    }

    @Override // com.sobot.chat.adapter.base.SobotBaseGvAdapter
    public String getContentLayoutName() {
    }

    @Override // com.sobot.chat.adapter.base.SobotBaseGvAdapter
    public SobotBaseGvAdapter.BaseViewHolder getViewHolder(Context context, View view) {
    }
}
