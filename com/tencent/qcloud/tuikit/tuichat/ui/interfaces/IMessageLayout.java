package com.tencent.qcloud.tuikit.tuichat.ui.interfaces;

import com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageAdapter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface IMessageLayout extends IMessageProperties {
    void addPopAction(ChatPopMenu.ChatPopMenuAction chatPopMenuAction);

    OnItemClickListener getOnItemClickListener();

    List<ChatPopMenu.ChatPopMenuAction> getPopActions();

    void setAdapter(MessageAdapter messageAdapter);

    void setOnItemClickListener(OnItemClickListener onItemClickListener);
}
