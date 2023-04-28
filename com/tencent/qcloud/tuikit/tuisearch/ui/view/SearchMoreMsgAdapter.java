package com.tencent.qcloud.tuikit.tuisearch.ui.view;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuikit.tuisearch.bean.SearchDataBean;
import com.tencent.qcloud.tuikit.tuisearch.ui.interfaces.ISearchMoreMsgAdapter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SearchMoreMsgAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements ISearchMoreMsgAdapter {
    private static final int SEARCH_MESSAGE_HEADER_TYPE = -1100;
    private Context context;
    private boolean isConversationVisible;
    private List<SearchDataBean> mDataList;
    private int mTotalCount;
    private int mViewType;
    private View.OnClickListener onConversationClickListener;
    private onItemClickListener onItemClickListener;
    private SearchDataBean searchDataBean;
    private String text;

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.view.SearchMoreMsgAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ SearchMoreMsgAdapter this$0;
        public final /* synthetic */ int val$position;

        public AnonymousClass1(SearchMoreMsgAdapter searchMoreMsgAdapter, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class MessageViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout mLlItem;
        private TextView mSubTvLabelText;
        private TextView mSubTvText;
        private TextView mTvText;
        private ImageView mUserIconView;

        public MessageViewHolder(View view) {
        }

        public static /* synthetic */ TextView access$000(MessageViewHolder messageViewHolder) {
        }

        public static /* synthetic */ ImageView access$100(MessageViewHolder messageViewHolder) {
        }

        public static /* synthetic */ TextView access$200(MessageViewHolder messageViewHolder) {
        }

        public static /* synthetic */ TextView access$300(MessageViewHolder messageViewHolder) {
        }

        public static /* synthetic */ LinearLayout access$500(MessageViewHolder messageViewHolder) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class SearchMessageHeaderHolder extends RecyclerView.ViewHolder {
        private ImageView conversationIcon;
        private RelativeLayout conversationLayout;
        private TextView conversationTitle;

        public SearchMessageHeaderHolder(@NonNull View view) {
        }

        public static /* synthetic */ RelativeLayout access$600(SearchMessageHeaderHolder searchMessageHeaderHolder) {
        }

        public static /* synthetic */ ImageView access$700(SearchMessageHeaderHolder searchMessageHeaderHolder) {
        }

        public static /* synthetic */ TextView access$800(SearchMessageHeaderHolder searchMessageHeaderHolder) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface onItemClickListener {
        void onClick(View view, int i2);
    }

    public SearchMoreMsgAdapter(Context context) {
    }

    public static /* synthetic */ onItemClickListener access$400(SearchMoreMsgAdapter searchMoreMsgAdapter) {
    }

    private void bindSearchHeaderHolder(SearchMessageHeaderHolder searchMessageHeaderHolder) {
    }

    private SpannableString matcherSearchText(int i2, String str, String str2) {
    }

    public List<SearchDataBean> getDataSource() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
    }

    public int getTotalCount() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuisearch.ui.interfaces.ISearchMoreMsgAdapter
    public void onDataSourceChanged(List<SearchDataBean> list) {
    }

    @Override // com.tencent.qcloud.tuikit.tuisearch.ui.interfaces.ISearchMoreMsgAdapter
    public void onTotalCountChanged(int i2) {
    }

    public void setConversationVisible(boolean z) {
    }

    public void setOnConversationClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnItemClickListener(onItemClickListener onitemclicklistener) {
    }

    public void setSearchDataBean(SearchDataBean searchDataBean) {
    }

    public void setText(String str) {
    }
}
