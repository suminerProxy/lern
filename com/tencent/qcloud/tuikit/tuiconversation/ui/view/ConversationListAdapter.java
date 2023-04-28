package com.tencent.qcloud.tuikit.tuiconversation.ui.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListAdapter;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemClickListener;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemLongClickListener;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ConversationListAdapter extends RecyclerView.Adapter implements IConversationListAdapter {
    public static final int FOOTER_COUNT = 1;
    public static int HEADER_COUNT = 1;
    public static final int ITEM_TYPE_FOOTER_LOADING = -99;
    public static final int ITEM_TYPE_HEADER_SEARCH = 101;
    public static final int SELECT_COUNT = 1;
    public static final int SELECT_LABEL_COUNT = 1;
    private int currentPosition;
    private boolean isClick;
    public boolean isForwardFragment;
    public boolean isShowMultiSelectCheckBox;
    private int mBottomTextSize;
    public List<ConversationInfo> mDataSource;
    private int mDateTextSize;
    private boolean mHasShowUnreadDot;
    public boolean mIsLoading;
    private int mItemAvatarRadius;
    public OnItemClickListener mOnItemClickListener;
    private OnItemLongClickListener mOnItemLongClickListener;
    private final HashMap<String, Boolean> mSelectedPositions;
    private int mTopTextSize;
    public View searchView;
    public boolean showFoldedStyle;

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationListAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ ConversationListAdapter this$0;
        public final /* synthetic */ ConversationInfo val$conversationInfo;
        public final /* synthetic */ int val$viewType;

        public AnonymousClass1(ConversationListAdapter conversationListAdapter, int i2, ConversationInfo conversationInfo) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationListAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnLongClickListener {
        public final /* synthetic */ ConversationListAdapter this$0;
        public final /* synthetic */ ConversationInfo val$conversationInfo;

        public AnonymousClass2(ConversationListAdapter conversationListAdapter, ConversationInfo conversationInfo) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationListAdapter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ ConversationListAdapter this$0;
        public final /* synthetic */ String val$conversationId;
        public final /* synthetic */ ConversationInfo val$conversationInfo;
        public final /* synthetic */ int val$viewType;

        public AnonymousClass3(ConversationListAdapter conversationListAdapter, String str, int i2, ConversationInfo conversationInfo) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationListAdapter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ ConversationListAdapter this$0;
        public final /* synthetic */ String val$conversationId;
        public final /* synthetic */ ConversationInfo val$conversationInfo;
        public final /* synthetic */ int val$viewType;

        public AnonymousClass4(ConversationListAdapter conversationListAdapter, String str, ConversationInfo conversationInfo, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class FooterViewHolder extends ConversationBaseHolder {
        public final /* synthetic */ ConversationListAdapter this$0;

        public FooterViewHolder(@NonNull ConversationListAdapter conversationListAdapter, View view) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationBaseHolder
        public void layoutViews(ConversationInfo conversationInfo, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ForwardLabelHolder extends ConversationBaseHolder {
        public ForwardLabelHolder(View view) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationBaseHolder
        public void layoutViews(ConversationInfo conversationInfo, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ForwardSelectHolder extends ConversationBaseHolder {
        private final TextView titleView;

        public ForwardSelectHolder(View view) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationBaseHolder
        public void layoutViews(ConversationInfo conversationInfo, int i2) {
        }

        public void refreshTitle(boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class HeaderViewHolder extends RecyclerView.ViewHolder {
        public HeaderViewHolder(@NonNull View view) {
        }
    }

    public static /* synthetic */ OnItemLongClickListener access$000(ConversationListAdapter conversationListAdapter) {
    }

    public void disableItemUnreadDot(boolean z) {
    }

    public int getCurrentPosition() {
    }

    public int getIndexInAdapter(ConversationInfo conversationInfo) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListAdapter
    public ConversationInfo getItem(int i2) {
    }

    public int getItemAvatarRadius() {
    }

    public int getItemBottomTextSize() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    public int getItemDateTextSize() {
    }

    public int getItemIndexInAdapter(int i2) {
    }

    public int getItemTopTextSize() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
    }

    public List<ConversationInfo> getSelectedItem() {
    }

    public boolean hasItemUnreadDot() {
    }

    public boolean isClick() {
    }

    public boolean isItemChecked(String str) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListAdapter
    public void onDataSourceChanged(List<ConversationInfo> list) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListAdapter
    public void onItemChanged(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListAdapter
    public void onItemInserted(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListAdapter
    public void onItemRangeChanged(int i2, int i3) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListAdapter
    public void onItemRemoved(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListAdapter
    public void onLoadingStateChanged(boolean z) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationListAdapter
    public void onViewNeedRefresh() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
    }

    public void setCheckBoxStatus(ConversationInfo conversationInfo, int i2, ConversationBaseHolder conversationBaseHolder) {
    }

    public void setClick(boolean z) {
    }

    public void setCurrentPosition(int i2, boolean z) {
    }

    public void setForwardFragment(boolean z) {
    }

    public void setItemAvatarRadius(int i2) {
    }

    public void setItemBottomTextSize(int i2) {
    }

    public void setItemChecked(String str, boolean z) {
    }

    public void setItemDateTextSize(int i2) {
    }

    public void setItemTopTextSize(int i2) {
    }

    public void setOnClickListener(RecyclerView.ViewHolder viewHolder, int i2, ConversationInfo conversationInfo) {
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
    }

    public void setSearchView(View view) {
    }

    public void setSelectConversations(List<ConversationInfo> list) {
    }

    public void setShowFoldedStyle(boolean z) {
    }

    public void setShowMultiSelectCheckBox(boolean z) {
    }
}
