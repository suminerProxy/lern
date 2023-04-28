package com.sobot.chat.adapter.base;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class SobotBaseGvAdapter<T> extends SobotBaseAdapter {
    public LayoutInflater mInflater;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class BaseViewHolder<T> {
        public Context mContext;
        public View mItemView;

        public BaseViewHolder(Context context, View view) {
        }

        public abstract void bindData(T t, int i2);
    }

    public SobotBaseGvAdapter(Context context, List<T> list) {
    }

    public ColorStateList createColorStateList(int i2, int i3, int i4, int i5) {
    }

    public abstract String getContentLayoutName();

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    public abstract BaseViewHolder getViewHolder(Context context, View view);
}
