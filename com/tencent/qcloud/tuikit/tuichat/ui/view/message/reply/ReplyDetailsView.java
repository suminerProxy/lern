package com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.gatherimage.UserIconView;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageRepliesBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ReplyDetailsView extends RecyclerView {
    private ReplyDetailsAdapter adapter;
    private LinearLayoutManager layoutManager;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ReplyDetailsAdapter extends RecyclerView.Adapter<ReplyDetailsViewHolder> {
        public Map<MessageRepliesBean.ReplyBean, TUIMessageBean> data;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull ReplyDetailsViewHolder replyDetailsViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ ReplyDetailsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        public void setData(Map<MessageRepliesBean.ReplyBean, TUIMessageBean> map) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull ReplyDetailsViewHolder replyDetailsViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public ReplyDetailsViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ReplyDetailsViewHolder extends RecyclerView.ViewHolder {
        public TextView messageText;
        public TextView timeText;
        public UserIconView userFaceView;
        public TextView userNameTv;

        public ReplyDetailsViewHolder(View view) {
        }
    }

    public ReplyDetailsView(@NonNull Context context) {
    }

    private void initView() {
    }

    public void setData(Map<MessageRepliesBean.ReplyBean, TUIMessageBean> map) {
    }

    public ReplyDetailsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ReplyDetailsView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
