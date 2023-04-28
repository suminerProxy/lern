package tencent.txlive.zhibo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.LiveTopUserBean;
import com.taihebase.activity.view.LoadImageView;
import com.taihebase.activity.widget.ExpandLayout;
import h.y.a.f.j;
import tencent.txlive.zhibo.audience.RoomMemberBean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class LiveTopManAdapter extends j<LiveTopUserBean> {
    private final int TYPE_TITLE;
    private final int TYPE_TOP;
    private String claIcon;
    private FragmentManager fragmentManager;
    private boolean isTopHot;
    private ExpandLayout lastExp;
    private LinearLayout lastItemP;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class ViewHolder extends RecyclerView.ViewHolder {
        public SimpleDraweeView cla_icon;
        public LinearLayout clip;
        public ExpandLayout exp;
        public RecyclerView goods;
        public LinearLayout itemP;
        public View itemView;
        public LinearLayout other_cla;
        public final /* synthetic */ LiveTopManAdapter this$0;
        public ImageView topLogo;
        public TextView topNo;
        public TextView topPrice;
        public TextView topPrice_p;
        public TextView topUser_name;
        public LoadImageView userLogo;

        public ViewHolder(LiveTopManAdapter liveTopManAdapter, View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class ViewHolderTitle extends RecyclerView.ViewHolder {
        public final /* synthetic */ LiveTopManAdapter this$0;
        public TextView title;

        public ViewHolderTitle(LiveTopManAdapter liveTopManAdapter, View view) {
        }
    }

    public LiveTopManAdapter(Context context) {
    }

    private /* synthetic */ void c(RoomMemberBean roomMemberBean, String str, int i2) {
    }

    private /* synthetic */ void e(LiveTopUserBean liveTopUserBean, RoomMemberBean roomMemberBean, String str, int i2) {
    }

    private /* synthetic */ void g(int i2, ViewHolder viewHolder, LiveTopUserBean liveTopUserBean, View view) {
    }

    private /* synthetic */ void i(LiveTopUserBean liveTopUserBean, View view) {
    }

    public /* synthetic */ void d(RoomMemberBean roomMemberBean, String str, int i2) {
    }

    public /* synthetic */ void f(LiveTopUserBean liveTopUserBean, RoomMemberBean roomMemberBean, String str, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
    }

    public /* synthetic */ void h(int i2, ViewHolder viewHolder, LiveTopUserBean liveTopUserBean, View view) {
    }

    public /* synthetic */ void j(LiveTopUserBean liveTopUserBean, View view) {
    }

    @Override // h.y.a.f.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // h.y.a.f.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }

    public void setClaIcon(String str) {
    }

    public void setFragmentManager(FragmentManager fragmentManager) {
    }

    public void setTopHot(boolean z) {
    }
}
