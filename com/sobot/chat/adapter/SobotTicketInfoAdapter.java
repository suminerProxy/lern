package com.sobot.chat.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.sobot.chat.adapter.base.SobotBaseAdapter;
import com.sobot.chat.api.model.SobotUserTicketInfo;
import com.sobot.chat.notchlib.INotchScreen;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotTicketInfoAdapter extends SobotBaseAdapter<SobotUserTicketInfo> {
    public static final int MSG_TYPE_FILE = 0;
    private static final String[] layoutRes = null;
    private Activity activity;
    private Context mContext;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class BaseViewHolder {
        public Context mContext;

        public BaseViewHolder(Context context, View view) {
        }

        public abstract void bindData(SobotUserTicketInfo sobotUserTicketInfo);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class TicketInfoViewHolder extends BaseViewHolder {
        private int bg1_resId;
        private int bg2_resId;
        private int bg3_resId;
        private Activity mActivity;
        private Context mContext;
        private ImageView sobot_tv_new;
        private String str1_resId;
        private String str2_resId;
        private String str3_resId;
        public final /* synthetic */ SobotTicketInfoAdapter this$0;
        private TextView tv_code;
        private TextView tv_content;
        private TextView tv_ticket_status;
        private TextView tv_time;
        private TextView tv_title;

        /* renamed from: com.sobot.chat.adapter.SobotTicketInfoAdapter$TicketInfoViewHolder$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements INotchScreen.NotchScreenCallback {
            public final /* synthetic */ TicketInfoViewHolder this$1;
            public final /* synthetic */ View val$view;

            public AnonymousClass1(TicketInfoViewHolder ticketInfoViewHolder, View view) {
            }

            @Override // com.sobot.chat.notchlib.INotchScreen.NotchScreenCallback
            public void onResult(INotchScreen.NotchScreenInfo notchScreenInfo) {
            }
        }

        public TicketInfoViewHolder(SobotTicketInfoAdapter sobotTicketInfoAdapter, Activity activity, Context context, View view) {
        }

        @Override // com.sobot.chat.adapter.SobotTicketInfoAdapter.BaseViewHolder
        public void bindData(SobotUserTicketInfo sobotUserTicketInfo) {
        }

        public void displayInNotch(View view) {
        }
    }

    public SobotTicketInfoAdapter(Activity activity, Context context, List list) {
    }

    private View initView(View view, int i2, int i3, SobotUserTicketInfo sobotUserTicketInfo) {
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i2) {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
    }
}
