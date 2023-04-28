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
public class LiveAudienceAdapter extends j<RoomMemberBean> {
    private Context context;
    private FragmentManager fragmentManager;
    private boolean isManager;
    private boolean isVerticalScreen;
    private OnAudienceBanCall onAudienceBanCall;

    /* renamed from: tencent.txlive.zhibo.ui.LiveAudienceAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements g2 {
        public final /* synthetic */ LiveAudienceAdapter this$0;
        public final /* synthetic */ RoomMemberBean val$itemData;

        public AnonymousClass1(LiveAudienceAdapter liveAudienceAdapter, RoomMemberBean roomMemberBean) {
        }

        private /* synthetic */ void a(RoomMemberBean roomMemberBean, String str, int i2) {
        }

        public /* synthetic */ void b(RoomMemberBean roomMemberBean, String str, int i2) {
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
        public final /* synthetic */ LiveAudienceAdapter this$0;
        public LoadImageView userLogo;
        public TextView userName;

        public ViewHolder(LiveAudienceAdapter liveAudienceAdapter, View view) {
        }
    }

    public LiveAudienceAdapter(Context context) {
    }

    public static /* synthetic */ OnAudienceBanCall access$000(LiveAudienceAdapter liveAudienceAdapter) {
    }

    public static /* synthetic */ FragmentManager access$100(LiveAudienceAdapter liveAudienceAdapter) {
    }

    public static /* synthetic */ Context access$200(LiveAudienceAdapter liveAudienceAdapter) {
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
