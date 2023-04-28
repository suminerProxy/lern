package com.tencent.qcloud.tuikit.tuiconversation.ui.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class ConversationBaseHolder extends RecyclerView.ViewHolder {
    public ConversationListAdapter mAdapter;
    public View rootView;

    public ConversationBaseHolder(View view) {
    }

    public abstract void layoutViews(ConversationInfo conversationInfo, int i2);

    public void setAdapter(RecyclerView.Adapter adapter) {
    }
}
