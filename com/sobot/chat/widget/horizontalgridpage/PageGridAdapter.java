package com.sobot.chat.widget.horizontalgridpage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PageGridAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private PageCallBack callBack;
    private int column;
    private ArrayList<T> data;
    private int itemWidth;
    private int pageMargin;
    private int row;
    private ZhiChiMessageBase zhiChiMessageBase;

    /* renamed from: com.sobot.chat.widget.horizontalgridpage.PageGridAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ PageGridAdapter this$0;

        public AnonymousClass1(PageGridAdapter pageGridAdapter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.widget.horizontalgridpage.PageGridAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnLongClickListener {
        public final /* synthetic */ PageGridAdapter this$0;

        public AnonymousClass2(PageGridAdapter pageGridAdapter) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    public PageGridAdapter(PageCallBack pageCallBack) {
    }

    public static /* synthetic */ PageCallBack access$000(PageGridAdapter pageGridAdapter) {
    }

    private ArrayList<T> convert(ArrayList<T> arrayList) {
    }

    private void setListener(RecyclerView.ViewHolder viewHolder) {
    }

    public ArrayList<T> getData() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    public ZhiChiMessageBase getZhiChiMessageBaseData() {
    }

    public void init(PageBuilder pageBuilder) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }

    public void setData(ArrayList<T> arrayList) {
    }

    public void setZhiChiMessageBaseData(ZhiChiMessageBase zhiChiMessageBase) {
    }

    public PageGridAdapter(ArrayList<T> arrayList, PageCallBack pageCallBack) {
    }
}
