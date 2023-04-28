package com.tencent.qcloud.tuikit.tuicontact.ui.pages;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupTypeSelectActivity extends BaseLightActivity implements View.OnClickListener {
    private static final String TAG = null;
    private TextView groupTypeTextView;
    private RecyclerView.Adapter mAdapter;
    private List<String> mDatas;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView mRecyclerView;
    private TitleBarLayout titleBarLayout;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.GroupTypeSelectActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ GroupTypeSelectActivity this$0;

        public AnonymousClass1(GroupTypeSelectActivity groupTypeSelectActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {
        private List<String> mDatas;
        public final /* synthetic */ GroupTypeSelectActivity this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.GroupTypeSelectActivity$MyAdapter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ MyAdapter this$1;
            public final /* synthetic */ String val$type;

            public AnonymousClass1(MyAdapter myAdapter, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class ViewHolder extends RecyclerView.ViewHolder {
            public ImageView imageView;
            public RelativeLayout itemLayout;
            public View rootView;
            public TextView subTextView;
            public TextView textView;
            public final /* synthetic */ MyAdapter this$1;

            public ViewHolder(MyAdapter myAdapter, View view) {
            }
        }

        public MyAdapter(GroupTypeSelectActivity groupTypeSelectActivity, List<String> list) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(ViewHolder viewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public ViewHolder onCreateViewHolder2(ViewGroup viewGroup, int i2) {
        }
    }

    private void initData() {
    }

    private void initView() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
