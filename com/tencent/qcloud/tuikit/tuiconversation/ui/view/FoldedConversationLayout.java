package com.tencent.qcloud.tuikit.tuiconversation.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationFoldPresenter;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FoldedConversationLayout extends RelativeLayout implements IConversationLayout {
    private FoldedConversationListLayout conversationListLayout;
    private ConversationFoldPresenter presenter;
    private TitleBarLayout titleBarLayout;

    public FoldedConversationLayout(Context context) {
    }

    private void init() {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public void clearConversationMessage(ConversationInfo conversationInfo) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public void clearUnreadStatusOfFoldItem() {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public void deleteConversation(ConversationInfo conversationInfo) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public /* bridge */ /* synthetic */ View getConversationList() {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ILayout
    public TitleBarLayout getTitleBar() {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public void hideFoldedItem(boolean z) {
    }

    public void initDefault() {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public void markConversationHidden(ConversationInfo conversationInfo) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public void markConversationUnread(ConversationInfo conversationInfo, boolean z) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public void setConversationTop(ConversationInfo conversationInfo, IUIKitCallback iUIKitCallback) {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ILayout
    public void setParentLayout(Object obj) {
    }

    public void setPresenter(ConversationFoldPresenter conversationFoldPresenter) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public FoldedConversationListLayout getConversationList() {
    }

    public FoldedConversationLayout(Context context, AttributeSet attributeSet) {
    }

    public FoldedConversationLayout(Context context, AttributeSet attributeSet, int i2) {
    }
}
