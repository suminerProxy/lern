package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.sobot.chat.api.model.ConsultingContent;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.viewHolder.base.MessageHolderBase;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CardMessageHolder extends MessageHolderBase implements View.OnClickListener {
    private int defaultPicResId;
    private ConsultingContent mConsultingContent;
    private View mContainer;
    private TextView mDes;
    private TextView mLabel;
    private ImageView mPic;
    private TextView mTitle;

    public CardMessageHolder(Context context, View view) {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
