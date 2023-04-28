package tencent.txlive.zhibo.widget.video;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.rtmp.ui.TXCloudVideoView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class TCVideoView {
    public boolean isUsed;
    public Button kickButton;
    public FrameLayout loadingBkg;
    public ImageView loadingImg;
    public String userID;
    public TXCloudVideoView videoView;

    /* renamed from: tencent.txlive.zhibo.widget.video.TCVideoView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ TCVideoView this$0;
        public final /* synthetic */ OnRoomViewListener val$l;

        public AnonymousClass1(TCVideoView tCVideoView, OnRoomViewListener onRoomViewListener) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface OnRoomViewListener {
        void onKickUser(String str);
    }

    public TCVideoView(TXCloudVideoView tXCloudVideoView, Button button, FrameLayout frameLayout, ImageView imageView, OnRoomViewListener onRoomViewListener) {
    }

    public void setUsed(boolean z) {
    }

    public void startLoading() {
    }

    public void stopLoading(boolean z) {
    }

    public void stopLoading() {
    }
}
