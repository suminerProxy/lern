package com.sobot.chat.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.sobot.chat.adapter.base.SobotBaseAdapter;
import com.sobot.chat.api.model.SobotProvinInfo;
import com.sobot.chat.notchlib.INotchScreen;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotProvinAdapter extends SobotBaseAdapter<SobotProvinInfo.SobotProvinceModel> {
    private Activity mActivity;
    private Context mContext;
    private ViewHolder myViewHolder;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class ViewHolder {
        private ImageView categoryIshave;
        private TextView categoryTitle;
        private Activity mActivity;
        private Context mContext;
        private View work_order_category_line;

        /* renamed from: com.sobot.chat.adapter.SobotProvinAdapter$ViewHolder$1  reason: invalid class name */
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

        public ViewHolder(Activity activity, Context context, View view) {
        }

        public static /* synthetic */ View access$000(ViewHolder viewHolder) {
        }

        public void bindData(SobotProvinInfo.SobotProvinceModel sobotProvinceModel) {
        }

        public void displayInNotch(View view) {
        }
    }

    public SobotProvinAdapter(Activity activity, Context context, List list) {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }
}
