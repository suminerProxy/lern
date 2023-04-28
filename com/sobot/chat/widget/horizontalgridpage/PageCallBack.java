package com.sobot.chat.widget.horizontalgridpage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public interface PageCallBack {
    void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2);

    RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2);

    void onItemClickListener(View view, int i2);

    void onItemLongClickListener(View view, int i2);
}
