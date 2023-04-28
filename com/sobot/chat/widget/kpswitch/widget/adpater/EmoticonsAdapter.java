package com.sobot.chat.widget.kpswitch.widget.adpater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sobot.chat.widget.kpswitch.widget.data.EmoticonPageEntity;
import com.sobot.chat.widget.kpswitch.widget.interfaces.EmoticonClickListener;
import com.sobot.chat.widget.kpswitch.widget.interfaces.EmoticonDisplayListener;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class EmoticonsAdapter<T> extends BaseAdapter {
    public final int DEF_HEIGHTMAXTATIO;
    public Context mContext;
    public ArrayList<T> mData;
    public final int mDefalutItemHeight;
    public int mDelbtnPosition;
    public EmoticonPageEntity mEmoticonPageEntity;
    public LayoutInflater mInflater;
    public int mItemHeight;
    public int mItemHeightMax;
    public double mItemHeightMaxRatio;
    public int mItemHeightMin;
    public EmoticonDisplayListener mOnDisPlayListener;
    public EmoticonClickListener mOnEmoticonClickListener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class ViewHolder {
        public ImageView iv_emoticon;
        public LinearLayout ly_root;
        public View rootView;
        public TextView tv_emoticon;
    }

    public EmoticonsAdapter(Context context, EmoticonPageEntity emoticonPageEntity, EmoticonClickListener emoticonClickListener) {
    }

    private void checkDelBtn(EmoticonPageEntity emoticonPageEntity) {
    }

    public void bindView(int i2, ViewGroup viewGroup, ViewHolder viewHolder) {
    }

    @Override // android.widget.Adapter
    public int getCount() {
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
    }

    public int getResDimenId(String str) {
    }

    public int getResId(String str) {
    }

    public int getResLayoutId(String str) {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    public boolean isDelBtn(int i2) {
    }

    public void setDelbtnPosition(int i2) {
    }

    public void setItemHeight(int i2) {
    }

    public void setItemHeightMax(int i2) {
    }

    public void setItemHeightMaxRatio(double d2) {
    }

    public void setItemHeightMin(int i2) {
    }

    public void setOnDisPlayListener(EmoticonDisplayListener emoticonDisplayListener) {
    }

    public void updateUI(ViewHolder viewHolder, ViewGroup viewGroup) {
    }
}
