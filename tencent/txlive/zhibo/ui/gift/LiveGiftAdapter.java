package tencent.txlive.zhibo.ui.gift;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.GoodsLiveBean;
import h.y.a.f.j;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class LiveGiftAdapter extends j<GoodsLiveBean> {
    public int dp10;
    public int dp8;
    public WeakReference<OnGiftSelectCall> listener;
    public int select;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface OnGiftSelectCall {
        void onGiftSelectCall(GoodsLiveBean goodsLiveBean);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class ViewHodler extends RecyclerView.ViewHolder {
        public SimpleDraweeView gift_icon;
        public View itemView;
        public LinearLayout noteParent;
        public RelativeLayout parent;
        public TextView pro_money;
        public TextView pro_name;
        public TextView sale_off;
        public final /* synthetic */ LiveGiftAdapter this$0;

        public ViewHodler(LiveGiftAdapter liveGiftAdapter, View view) {
        }
    }

    public LiveGiftAdapter(Context context) {
    }

    private /* synthetic */ void c(int i2, GoodsLiveBean goodsLiveBean, View view) {
    }

    private void init() {
    }

    public void bindListener(OnGiftSelectCall onGiftSelectCall) {
    }

    public /* synthetic */ void d(int i2, GoodsLiveBean goodsLiveBean, View view) {
    }

    public GoodsLiveBean getSelectPayPro() {
    }

    @Override // h.y.a.f.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.y.a.f.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }

    @Override // h.y.a.f.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }
}
