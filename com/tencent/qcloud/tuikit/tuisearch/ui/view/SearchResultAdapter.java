package com.tencent.qcloud.tuikit.tuisearch.ui.view;

import android.animation.Animator;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuikit.tuisearch.bean.SearchDataBean;
import com.tencent.qcloud.tuikit.tuisearch.ui.interfaces.ISearchResultAdapter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SearchResultAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements ISearchResultAdapter {
    public static final int CONTACT_TYPE = 2;
    public static final int CONVERSATION_TYPE = 1;
    public static final int GROUP_TYPE = 3;
    private Animator animator;
    private Context context;
    private List<String> list;
    private List<SearchDataBean> mDataList;
    private boolean mIsShowAll;
    private int mShowCount;
    private int mTotalCount;
    private int mViewType;
    private onItemClickListener onItemClickListener;
    private String text;

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.view.SearchResultAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ SearchResultAdapter this$0;
        public final /* synthetic */ int val$position;

        public AnonymousClass1(SearchResultAdapter searchResultAdapter, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class ContactViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout mLlItem;
        private TextView mSubTvLabelText;
        private TextView mSubTvText;
        private TextView mTvText;
        private ImageView mUserIconView;
        public final /* synthetic */ SearchResultAdapter this$0;

        public ContactViewHolder(SearchResultAdapter searchResultAdapter, View view) {
        }

        public static /* synthetic */ TextView access$000(ContactViewHolder contactViewHolder) {
        }

        public static /* synthetic */ TextView access$100(ContactViewHolder contactViewHolder) {
        }

        public static /* synthetic */ ImageView access$200(ContactViewHolder contactViewHolder) {
        }

        public static /* synthetic */ TextView access$300(ContactViewHolder contactViewHolder) {
        }

        public static /* synthetic */ LinearLayout access$500(ContactViewHolder contactViewHolder) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface onItemClickListener {
        void onClick(View view, int i2);
    }

    public SearchResultAdapter(Context context) {
    }

    public static /* synthetic */ onItemClickListener access$400(SearchResultAdapter searchResultAdapter) {
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

    public int getShowCount() {
    }

    public int getTotalCount() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuisearch.ui.interfaces.ISearchResultAdapter
    public void onDataSourceChanged(List<SearchDataBean> list, int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuisearch.ui.interfaces.ISearchResultAdapter
    public void onIsShowAllChanged(boolean z) {
    }

    @Override // com.tencent.qcloud.tuikit.tuisearch.ui.interfaces.ISearchResultAdapter
    public void onTotalCountChanged(int i2) {
    }

    public void setOnItemClickListener(onItemClickListener onitemclicklistener) {
    }

    public void setShowCount(int i2) {
    }

    public void setText(String str) {
    }
}
