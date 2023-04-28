package com.tencent.qcloud.tuikit.tuiconversation.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationFoldPresenter;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListAdapter;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListLayout;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemClickListener;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemLongClickListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FoldedConversationListLayout extends RecyclerView implements IConversationListLayout {
    private boolean isFolded;
    private ConversationListAdapter mAdapter;
    private ConversationFoldPresenter presenter;

    public FoldedConversationListLayout(Context context) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListLayout
    public void disableItemUnreadDot(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public /* bridge */ /* synthetic */ RecyclerView.Adapter getAdapter() {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListLayout
    public /* bridge */ /* synthetic */ View getListLayout() {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListLayout
    public FoldedConversationListLayout getListLayout() {
    }

    public void init() {
    }

    public void loadConversation() {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListLayout
    public void setAdapter(IConversationListAdapter iConversationListAdapter) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListLayout
    public void setBackground(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListLayout
    public void setItemAvatarRadius(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListLayout
    public void setItemBottomTextSize(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListLayout
    public void setItemDateTextSize(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListLayout
    public void setItemTopTextSize(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListLayout
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListLayout
    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
    }

    public void setPresenter(ConversationFoldPresenter conversationFoldPresenter) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public ConversationListAdapter getAdapter() {
    }

    public FoldedConversationListLayout(Context context, @Nullable AttributeSet attributeSet) {
    }

    public FoldedConversationListLayout(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
