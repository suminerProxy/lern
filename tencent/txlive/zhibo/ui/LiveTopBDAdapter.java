package tencent.txlive.zhibo.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.taihebase.activity.view.LoadImageView;
import h.u.a.w.d0.g2;
import h.y.a.f.j;
import tencent.txlive.zhibo.audience.OnAudienceBanCall;
import tencent.txlive.zhibo.audience.RoomMemberBean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class LiveTopBDAdapter extends j<RoomMemberBean> {
    private Context context;
    private FragmentManager fragmentManager;
    private boolean isManager;
    private boolean isVerticalScreen;
    private OnAudienceBanCall onAudienceBanCall;

    /* renamed from: tencent.txlive.zhibo.ui.LiveTopBDAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements g2 {
        public final /* synthetic */ LiveTopBDAdapter this$0;
        public final /* synthetic */ RoomMemberBean val$itemData;

        /* renamed from: tencent.txlive.zhibo.ui.LiveTopBDAdapter$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public class C06601 implements g2 {
            public final /* synthetic */ AnonymousClass1 this$1;

            public C06601(AnonymousClass1 anonymousClass1) {
            }

            @Override // h.u.a.w.d0.g2
            public void onMenuItemCall(String str, int i2) {
            }
        }

        public AnonymousClass1(LiveTopBDAdapter liveTopBDAdapter, RoomMemberBean roomMemberBean) {
        }

        @Override // h.u.a.w.d0.g2
        public void onMenuItemCall(String str, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class ViewHolder extends RecyclerView.ViewHolder {
        public View itemView;
        public ImageView menu;
        public FrameLayout menuP;
        public final /* synthetic */ LiveTopBDAdapter this$0;
        public TextView topNum;
        public LoadImageView userLogo;
        public TextView userName;
        public TextView ybNum;

        public ViewHolder(LiveTopBDAdapter liveTopBDAdapter, View view) {
        }
    }

    public LiveTopBDAdapter(Context context) {
    }

    public static /* synthetic */ OnAudienceBanCall access$000(LiveTopBDAdapter liveTopBDAdapter) {
    }

    public static /* synthetic */ Context access$100(LiveTopBDAdapter liveTopBDAdapter) {
    }

    public static /* synthetic */ FragmentManager access$200(LiveTopBDAdapter liveTopBDAdapter) {
    }

    private /* synthetic */ void c(RoomMemberBean roomMemberBean, View view) {
    }

    public void bindListener(OnAudienceBanCall onAudienceBanCall) {
    }

    public /* synthetic */ void d(RoomMemberBean roomMemberBean, View view) {
    }

    public Context getContext() {
    }

    @Override // h.y.a.f.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // h.y.a.f.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }

    public void setFragmentManager(FragmentManager fragmentManager) {
    }

    public void setManagerType(boolean z) {
    }

    public void setScreenType(boolean z) {
    }
}
