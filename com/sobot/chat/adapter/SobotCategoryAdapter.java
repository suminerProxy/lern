package com.sobot.chat.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sobot.chat.adapter.base.SobotBaseAdapter;
import com.sobot.chat.api.model.StDocModel;
import com.sobot.chat.notchlib.INotchScreen;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotCategoryAdapter extends SobotBaseAdapter<StDocModel> {
    private Activity mActivity;
    private LayoutInflater mInflater;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class ViewHolder {
        private Activity mActivity;
        private TextView sobot_tv_title;

        /* renamed from: com.sobot.chat.adapter.SobotCategoryAdapter$ViewHolder$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements INotchScreen.NotchScreenCallback {
            public final /* synthetic */ ViewHolder this$0;
            public final /* synthetic */ View val$view;

            public AnonymousClass1(ViewHolder viewHolder, View view) {
            }

            @Override // com.sobot.chat.notchlib.INotchScreen.NotchScreenCallback
            public void onResult(INotchScreen.NotchScreenInfo notchScreenInfo) {
            }
        }

        public ViewHolder(Context context, Activity activity, View view) {
        }

        public void bindData(int i2, StDocModel stDocModel) {
        }

        public void displayInNotch(View view) {
        }
    }

    public SobotCategoryAdapter(Context context, Activity activity, List<StDocModel> list) {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }
}
