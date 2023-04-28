package com.sobot.chat.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sobot.chat.adapter.base.SobotBaseAdapter;
import com.sobot.chat.api.model.SobotFileModel;
import com.sobot.chat.api.model.StUserDealTicketInfo;
import com.sobot.chat.api.model.StUserDealTicketReply;
import com.sobot.chat.notchlib.INotchScreen;
import com.sobot.chat.widget.StExpandableTextView;
import com.sobot.chat.widget.attachment.AttachmentView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotTicketDetailAdapter extends SobotBaseAdapter<Object> {
    public static final int MSG_TYPE_HEAD = 0;
    public static final int MSG_TYPE_TYPE1 = 1;
    public static final int MSG_TYPE_TYPE2 = 2;
    public static final int MSG_TYPE_TYPE3 = 3;
    public static final int MSG_TYPE_TYPE4 = 4;
    private static final String[] layoutRes = null;
    private int attachmentCount;
    public AttachmentView.Listener listener;
    private Activity mActivity;
    private Context mContext;

    /* renamed from: com.sobot.chat.adapter.SobotTicketDetailAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements AttachmentView.Listener {
        public final /* synthetic */ SobotTicketDetailAdapter this$0;

        public AnonymousClass1(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
        }

        @Override // com.sobot.chat.widget.attachment.AttachmentView.Listener
        public void downFileLister(SobotFileModel sobotFileModel, int i2) {
        }

        @Override // com.sobot.chat.widget.attachment.AttachmentView.Listener
        public void previewMp4(SobotFileModel sobotFileModel, int i2) {
        }

        @Override // com.sobot.chat.widget.attachment.AttachmentView.Listener
        public void previewPic(String str, String str2, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.adapter.SobotTicketDetailAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements INotchScreen.NotchScreenCallback {
        public final /* synthetic */ SobotTicketDetailAdapter this$0;
        public final /* synthetic */ int val$addPaddingLeft;
        public final /* synthetic */ View val$view;

        public AnonymousClass2(SobotTicketDetailAdapter sobotTicketDetailAdapter, View view, int i2) {
        }

        @Override // com.sobot.chat.notchlib.INotchScreen.NotchScreenCallback
        public void onResult(INotchScreen.NotchScreenInfo notchScreenInfo) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class BaseViewHolder {
        public Context mContext;

        public BaseViewHolder(Context context, View view) {
        }

        public abstract void bindData(Object obj, int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class HeadViewHolder extends BaseViewHolder {
        private int bg1_resId;
        private int bg2_resId;
        private int bg3_resId;
        private ImageView imageView;
        private Context mContext;
        private RecyclerView recyclerView;
        private String str1_resId;
        private String str2_resId;
        private String str3_resId;
        private TextView textView;
        public final /* synthetic */ SobotTicketDetailAdapter this$0;
        private StExpandableTextView tv_exp;
        private TextView tv_ticket_status;
        private TextView tv_time;
        private TextView tv_title;

        /* renamed from: com.sobot.chat.adapter.SobotTicketDetailAdapter$HeadViewHolder$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements StExpandableTextView.OnExpandStateChangeListener {
            public final /* synthetic */ HeadViewHolder this$1;
            public final /* synthetic */ SobotTicketDetailAdapter val$this$0;

            public AnonymousClass1(HeadViewHolder headViewHolder, SobotTicketDetailAdapter sobotTicketDetailAdapter) {
            }

            @Override // com.sobot.chat.widget.StExpandableTextView.OnExpandStateChangeListener
            public void onExpandStateChanged(TextView textView, boolean z) {
            }
        }

        public HeadViewHolder(SobotTicketDetailAdapter sobotTicketDetailAdapter, Context context, View view) {
        }

        public static /* synthetic */ Context access$300(HeadViewHolder headViewHolder) {
        }

        public static /* synthetic */ TextView access$400(HeadViewHolder headViewHolder) {
        }

        @Override // com.sobot.chat.adapter.SobotTicketDetailAdapter.BaseViewHolder
        public void bindData(Object obj, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class Type1ViewHolder extends BaseViewHolder {
        private View sobot_line_split;
        private View sobot_line_view;
        private LinearLayout sobot_ll_root;
        private TextView sobot_tv_icon2;
        private TextView sobot_tv_secod;
        private TextView sobot_tv_status;
        private TextView sobot_tv_time;
        public final /* synthetic */ SobotTicketDetailAdapter this$0;

        public Type1ViewHolder(SobotTicketDetailAdapter sobotTicketDetailAdapter, Context context, View view) {
        }

        @Override // com.sobot.chat.adapter.SobotTicketDetailAdapter.BaseViewHolder
        public void bindData(Object obj, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class Type2ViewHolder extends BaseViewHolder {
        private RecyclerView recyclerView;
        private View sobot_line_split;
        private LinearLayout sobot_ll_container;
        private LinearLayout sobot_ll_root;
        private View sobot_top_line_view;
        private TextView sobot_tv_content;
        private TextView sobot_tv_content_detail;
        private View sobot_tv_content_detail_split;
        private LinearLayout sobot_tv_content_ll;
        private TextView sobot_tv_icon2;
        private TextView sobot_tv_secod;
        private TextView sobot_tv_status;
        private TextView sobot_tv_time;
        public final /* synthetic */ SobotTicketDetailAdapter this$0;

        /* renamed from: com.sobot.chat.adapter.SobotTicketDetailAdapter$Type2ViewHolder$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ Type2ViewHolder this$1;
            public final /* synthetic */ StUserDealTicketReply val$reply;

            public AnonymousClass1(Type2ViewHolder type2ViewHolder, StUserDealTicketReply stUserDealTicketReply) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public Type2ViewHolder(SobotTicketDetailAdapter sobotTicketDetailAdapter, Context context, View view) {
        }

        @Override // com.sobot.chat.adapter.SobotTicketDetailAdapter.BaseViewHolder
        public void bindData(Object obj, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class Type3ViewHolder extends BaseViewHolder {
        private RecyclerView recyclerView;
        private View sobot_line_split;
        private LinearLayout sobot_ll_root;
        private View sobot_top_line_view;
        private TextView sobot_tv_content;
        private TextView sobot_tv_content_detail;
        private View sobot_tv_content_detail_split;
        private LinearLayout sobot_tv_content_ll;
        private TextView sobot_tv_icon2;
        private TextView sobot_tv_secod;
        private TextView sobot_tv_status;
        private TextView sobot_tv_time;
        public final /* synthetic */ SobotTicketDetailAdapter this$0;

        /* renamed from: com.sobot.chat.adapter.SobotTicketDetailAdapter$Type3ViewHolder$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ Type3ViewHolder this$1;
            public final /* synthetic */ StUserDealTicketInfo val$data;

            public AnonymousClass1(Type3ViewHolder type3ViewHolder, StUserDealTicketInfo stUserDealTicketInfo) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public Type3ViewHolder(SobotTicketDetailAdapter sobotTicketDetailAdapter, Context context, View view) {
        }

        @Override // com.sobot.chat.adapter.SobotTicketDetailAdapter.BaseViewHolder
        public void bindData(Object obj, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class Type4ViewHolder extends BaseViewHolder {
        private LinearLayout sobot_ll_remark;
        private LinearLayout sobot_ll_score;
        private LinearLayout sobot_my_evaluate_ll;
        private TextView sobot_my_evaluate_tv;
        private RatingBar sobot_ratingBar;
        private TextView sobot_tv_my_evaluate_remark;
        private TextView sobot_tv_my_evaluate_score;
        private TextView sobot_tv_remark;
        public final /* synthetic */ SobotTicketDetailAdapter this$0;

        public Type4ViewHolder(SobotTicketDetailAdapter sobotTicketDetailAdapter, Context context, View view) {
        }

        @Override // com.sobot.chat.adapter.SobotTicketDetailAdapter.BaseViewHolder
        public void bindData(Object obj, int i2) {
        }
    }

    public SobotTicketDetailAdapter(Activity activity, Context context, List list) {
    }

    public static /* synthetic */ Context access$000(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$100(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$1000(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$1100(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$1200(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$1300(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$1400(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$1500(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$1600(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$1700(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$1800(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$1900(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$200(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$2000(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$2100(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$2200(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$2300(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$2400(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$2500(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$2600(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$2700(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$2800(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$2900(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$3000(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$3100(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$3200(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$3300(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$3400(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$3500(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$3600(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$3700(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$3800(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$3900(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$4000(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$4100(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$4200(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$4300(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$4400(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$4500(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$4600(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$4700(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$4800(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$4900(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Activity access$500(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$5000(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$5100(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$5200(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$5300(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$5400(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$5500(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$5600(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$5700(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$5800(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$5900(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$600(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$6000(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$6100(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$6200(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$6300(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$6400(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$6500(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$6600(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$6700(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$6800(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$6900(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$700(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$7000(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$7100(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$7200(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$7300(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$7400(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$7500(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$7600(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$7700(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$7800(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$7900(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$800(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$8000(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$8100(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$8200(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$8300(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$8400(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$8500(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$8600(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$8700(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ Context access$900(SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    private View initView(View view, int i2, int i3, Object obj) {
    }

    public void displayInNotch(Activity activity, View view, int i2) {
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i2) {
    }

    public int getLinkTextColor() {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
    }

    public SobotTicketDetailAdapter(Activity activity, Context context, List list, int i2) {
    }
}
