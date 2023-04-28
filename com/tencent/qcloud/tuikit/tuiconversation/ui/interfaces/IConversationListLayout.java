package com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces;

import android.view.View;
import com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationListAdapter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface IConversationListLayout {
    void disableItemUnreadDot(boolean z);

    ConversationListAdapter getAdapter();

    View getListLayout();

    void setAdapter(IConversationListAdapter iConversationListAdapter);

    void setBackground(int i2);

    void setItemAvatarRadius(int i2);

    void setItemBottomTextSize(int i2);

    void setItemDateTextSize(int i2);

    void setItemTopTextSize(int i2);

    void setOnItemClickListener(OnItemClickListener onItemClickListener);

    void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener);
}
