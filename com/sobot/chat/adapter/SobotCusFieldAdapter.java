package com.sobot.chat.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.sobot.chat.adapter.base.SobotBaseAdapter;
import com.sobot.chat.api.model.SobotCusFieldDataInfo;
import com.sobot.chat.notchlib.INotchScreen;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotCusFieldAdapter extends SobotBaseAdapter<SobotCusFieldDataInfo> implements Filterable {
    private List<SobotCusFieldDataInfo> adminList;
    private List<SobotCusFieldDataInfo> displayList;
    private int fieldType;
    private Activity mActivity;
    private Context mContext;
    private MyFilter mFilter;
    private MyViewHolder myViewHolder;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class MyFilter extends Filter {
        public final /* synthetic */ SobotCusFieldAdapter this$0;

        public MyFilter(SobotCusFieldAdapter sobotCusFieldAdapter) {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class MyViewHolder {
        private ImageView categorySmallCheckBox;
        private ImageView categorySmallIshave;
        private TextView categorySmallTitle;
        private View categorySmallline;
        private Activity mActivity;
        public final /* synthetic */ SobotCusFieldAdapter this$0;

        /* renamed from: com.sobot.chat.adapter.SobotCusFieldAdapter$MyViewHolder$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements INotchScreen.NotchScreenCallback {
            public final /* synthetic */ MyViewHolder this$1;
            public final /* synthetic */ View val$view;

            public AnonymousClass1(MyViewHolder myViewHolder, View view) {
            }

            @Override // com.sobot.chat.notchlib.INotchScreen.NotchScreenCallback
            public void onResult(INotchScreen.NotchScreenInfo notchScreenInfo) {
            }
        }

        public MyViewHolder(SobotCusFieldAdapter sobotCusFieldAdapter, Activity activity, View view) {
        }

        public static /* synthetic */ TextView access$000(MyViewHolder myViewHolder) {
        }

        public static /* synthetic */ ImageView access$100(MyViewHolder myViewHolder) {
        }

        public static /* synthetic */ ImageView access$200(MyViewHolder myViewHolder) {
        }

        public static /* synthetic */ View access$300(MyViewHolder myViewHolder) {
        }

        public void displayInNotch(View view) {
        }
    }

    public SobotCusFieldAdapter(Activity activity, Context context, List<SobotCusFieldDataInfo> list, int i2) {
    }

    public static /* synthetic */ Context access$400(SobotCusFieldAdapter sobotCusFieldAdapter) {
    }

    public static /* synthetic */ Context access$500(SobotCusFieldAdapter sobotCusFieldAdapter) {
    }

    public static /* synthetic */ Context access$600(SobotCusFieldAdapter sobotCusFieldAdapter) {
    }

    public static /* synthetic */ Context access$700(SobotCusFieldAdapter sobotCusFieldAdapter) {
    }

    public static /* synthetic */ List access$800(SobotCusFieldAdapter sobotCusFieldAdapter) {
    }

    public static /* synthetic */ List access$900(SobotCusFieldAdapter sobotCusFieldAdapter) {
    }

    public static /* synthetic */ List access$902(SobotCusFieldAdapter sobotCusFieldAdapter, List list) {
    }

    @Override // com.sobot.chat.adapter.base.SobotBaseAdapter, android.widget.Adapter
    public int getCount() {
    }

    @Override // android.widget.Filterable
    public /* bridge */ /* synthetic */ Filter getFilter() {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // android.widget.Filterable
    public MyFilter getFilter() {
    }
}
