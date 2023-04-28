package tencent.txlive.zhibo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.model.LiveTopGoodsClaBean;
import com.taihebase.activity.view.LoadImageView;
import h.y.a.f.j;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class LiveTopClaAdapter extends j<LiveTopGoodsClaBean> {
    private Context context;
    private int currentIndex;
    private int dp15;
    private int dp8;
    private WeakReference<OnClaClickCall> listener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface OnClaClickCall {
        void onSelectCla(LiveTopGoodsClaBean liveTopGoodsClaBean);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class ViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout fp;
        public LinearLayout itemP;
        public final /* synthetic */ LiveTopClaAdapter this$0;
        public TextView topName;
        public LoadImageView userLogo;

        public ViewHolder(LiveTopClaAdapter liveTopClaAdapter, View view) {
        }
    }

    public LiveTopClaAdapter(Context context) {
    }

    private /* synthetic */ void c(int i2, LiveTopGoodsClaBean liveTopGoodsClaBean, View view) {
    }

    public void bindListener(OnClaClickCall onClaClickCall) {
    }

    public /* synthetic */ void d(int i2, LiveTopGoodsClaBean liveTopGoodsClaBean, View view) {
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
