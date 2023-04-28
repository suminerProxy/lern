package com.sobot.chat.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sobot.chat.api.model.ZhiChiGroupBase;
import com.sobot.chat.widget.horizontalgridpage.SobotRecyclerCallBack;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotSikllAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final int STYLE_DEF = 0;
    private static final int STYLE_PIC_TEXT = 1;
    private static final int STYLE_PIC_TEXT_DES = 2;
    private SobotRecyclerCallBack callBack;
    private List<ZhiChiGroupBase> list;
    private Context mContext;
    private int msgFlag;

    /* renamed from: com.sobot.chat.adapter.SobotSikllAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ SobotSikllAdapter this$0;

        public AnonymousClass1(SobotSikllAdapter sobotSikllAdapter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.adapter.SobotSikllAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnLongClickListener {
        public final /* synthetic */ SobotSikllAdapter this$0;

        public AnonymousClass2(SobotSikllAdapter sobotSikllAdapter) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView sobot_iv_group_img;
        private TextView sobot_tv_group_desc;
        private TextView sobot_tv_group_name;
        public final /* synthetic */ SobotSikllAdapter this$0;

        public ViewHolder(SobotSikllAdapter sobotSikllAdapter, Context context, View view) {
        }

        public static /* synthetic */ TextView access$100(ViewHolder viewHolder) {
        }

        public static /* synthetic */ ImageView access$200(ViewHolder viewHolder) {
        }

        public static /* synthetic */ TextView access$300(ViewHolder viewHolder) {
        }
    }

    public SobotSikllAdapter(Context context, List<ZhiChiGroupBase> list, int i2, SobotRecyclerCallBack sobotRecyclerCallBack) {
    }

    public static /* synthetic */ SobotRecyclerCallBack access$000(SobotSikllAdapter sobotSikllAdapter) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
    }

    public List<ZhiChiGroupBase> getList() {
    }

    public int getMsgFlag() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }

    public void setList(List<ZhiChiGroupBase> list) {
    }

    public void setListener(RecyclerView.ViewHolder viewHolder) {
    }

    public void setMsgFlag(int i2) {
    }

    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
    public ViewHolder onCreateViewHolder2(ViewGroup viewGroup, int i2) {
    }
}
