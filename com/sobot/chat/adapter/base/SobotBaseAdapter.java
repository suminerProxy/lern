package com.sobot.chat.adapter.base;

import android.content.Context;
import android.widget.BaseAdapter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class SobotBaseAdapter<T> extends BaseAdapter {
    public Context context;
    public List<T> list;

    public SobotBaseAdapter(Context context, List<T> list) {
    }

    public Context getContext() {
    }

    @Override // android.widget.Adapter
    public int getCount() {
    }

    public List<T> getDatas() {
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
    }

    public String getResString(String str) {
    }

    public int getResStringId(String str) {
    }
}
