package com.sobot.chat.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sobot.chat.adapter.base.SobotBaseAdapter;
import com.sobot.chat.api.model.ZhiChiUploadAppFileModelResult;
import com.sobot.chat.widget.image.SobotRCImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotPicListAdapter extends SobotBaseAdapter<ZhiChiUploadAppFileModelResult> {
    public static final int ADD = 0;
    public static final int DEL = 2;
    public static final int PIC = 1;
    public ViewClickListener listener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class SobotFileHolder {
        private ViewClickListener listener;
        private Context mContext;
        private int position;
        public SobotRCImageView sobot_iv_pic;
        public ImageView sobot_iv_pic_add;
        public LinearLayout sobot_iv_pic_add_ll;
        private ImageView sobot_remove;

        /* renamed from: com.sobot.chat.adapter.SobotPicListAdapter$SobotFileHolder$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ SobotFileHolder this$0;

            public AnonymousClass1(SobotFileHolder sobotFileHolder) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* renamed from: com.sobot.chat.adapter.SobotPicListAdapter$SobotFileHolder$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass2 implements View.OnClickListener {
            public final /* synthetic */ SobotFileHolder this$0;

            public AnonymousClass2(SobotFileHolder sobotFileHolder) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* renamed from: com.sobot.chat.adapter.SobotPicListAdapter$SobotFileHolder$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass3 implements View.OnClickListener {
            public final /* synthetic */ SobotFileHolder this$0;

            public AnonymousClass3(SobotFileHolder sobotFileHolder) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public SobotFileHolder(Context context, View view) {
        }

        public static /* synthetic */ ViewClickListener access$000(SobotFileHolder sobotFileHolder) {
        }

        public static /* synthetic */ int access$100(SobotFileHolder sobotFileHolder) {
        }

        public void bindData(ZhiChiUploadAppFileModelResult zhiChiUploadAppFileModelResult) {
        }

        public void setListener(ViewClickListener viewClickListener) {
        }

        public void setPosition(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface ViewClickListener {
        void clickView(View view, int i2, int i3);
    }

    public SobotPicListAdapter(Context context, List<ZhiChiUploadAppFileModelResult> list) {
    }

    public void addData(ZhiChiUploadAppFileModelResult zhiChiUploadAppFileModelResult) {
    }

    public void addDatas(List<ZhiChiUploadAppFileModelResult> list) {
    }

    @Override // com.sobot.chat.adapter.base.SobotBaseAdapter, android.widget.Adapter
    public int getCount() {
    }

    @Override // com.sobot.chat.adapter.base.SobotBaseAdapter, android.widget.Adapter
    public /* bridge */ /* synthetic */ Object getItem(int i2) {
    }

    public ArrayList<ZhiChiUploadAppFileModelResult> getPicList() {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    public void restDataView() {
    }

    public void setOnClickItemViewListener(ViewClickListener viewClickListener) {
    }

    @Override // com.sobot.chat.adapter.base.SobotBaseAdapter, android.widget.Adapter
    public ZhiChiUploadAppFileModelResult getItem(int i2) {
    }
}
