package com.tencent.qcloud.tuikit.tuichat.ui.view.message;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuikit.tuichat.bean.message.QuoteMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.ICommonMessageAdapter;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageAdapter;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MessageAdapter extends RecyclerView.Adapter implements IMessageAdapter, ICommonMessageAdapter {
    public static final int ITEM_POSITION_UNKNOWN = -1;
    public static final String TAG = "MessageAdapter";
    public boolean isForwardMode;
    public boolean isReplyDetailMode;
    public boolean isShowMultiSelectCheckBox;
    public List<TUIMessageBean> mDataSource;
    public int mHighShowPosition;
    public boolean mLoading;
    public OnItemClickListener mOnItemClickListener;
    public MessageRecyclerView mRecycleView;
    public HashMap<String, Boolean> mSelectedPositions;
    public ChatPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ MessageAdapter this$0;
        public final /* synthetic */ String val$msgId;
        public final /* synthetic */ int val$position;

        public AnonymousClass1(MessageAdapter messageAdapter, String str, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ MessageAdapter this$0;
        public final /* synthetic */ String val$msgId;
        public final /* synthetic */ int val$position;

        public AnonymousClass2(MessageAdapter messageAdapter, String str, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageAdapter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends OnItemClickListener {
        public final /* synthetic */ MessageAdapter this$0;
        public final /* synthetic */ String val$msgId;

        public AnonymousClass3(MessageAdapter messageAdapter, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onMessageClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onMessageLongClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onReEditRevokeMessage(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onRecallClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onReplyMessageClick(View view, int i2, QuoteMessageBean quoteMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onUserIconClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onUserIconLongClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageAdapter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ MessageAdapter this$0;
        public final /* synthetic */ String val$msgId;
        public final /* synthetic */ int val$position;

        public AnonymousClass4(MessageAdapter messageAdapter, String str, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public void changeCheckedStatus(String str, int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.ICommonMessageAdapter
    public TUIMessageBean getItem(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    public List<TUIMessageBean> getItemList(int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
    }

    public int getMessagePosition(TUIMessageBean tUIMessageBean) {
    }

    public OnItemClickListener getOnItemClickListener() {
    }

    public ArrayList<TUIMessageBean> getSelectedItem() {
    }

    public boolean isItemChecked(String str) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageAdapter
    public void onDataSourceChanged(List<TUIMessageBean> list) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageAdapter
    public void onScrollToEnd() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageAdapter
    public void onViewNeedRefresh(int i2, TUIMessageBean tUIMessageBean) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
    }

    public void refreshLoadView() {
    }

    public void resetSelectableText() {
    }

    public void setCheckBoxStatus(int i2, String str, MessageBaseHolder messageBaseHolder) {
    }

    public void setForwardMode(boolean z) {
    }

    public void setHighShowPosition(int i2) {
    }

    public void setItemChecked(String str, boolean z) {
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
    }

    public void setPresenter(ChatPresenter chatPresenter) {
    }

    public void setReplyDetailMode(boolean z) {
    }

    public void setShowMultiSelectCheckBox(boolean z) {
    }

    public void showLoading() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageAdapter
    public void onViewNeedRefresh(int i2, int i3) {
    }
}
