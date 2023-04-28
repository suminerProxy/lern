package com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.imsdk.v2.V2TIMDownloadCallback;
import com.tencent.imsdk.v2.V2TIMElem;
import com.tencent.imsdk.v2.V2TIMImageElem;
import com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean;
import com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanActivity;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnMatrixChangedListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnPhotoTapListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnSingleFlingListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.view.PhotoView;
import com.tencent.qcloud.tuikit.tuichat.component.video.UIKitVideoView;
import com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ImageVideoScanAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final String BROADCAST_DOWNLOAD_COMPLETED_ACTION = "PhotoViewActivityDownloadOriginImageCompleted";
    private static final String DOWNLOAD_ORIGIN_IMAGE_PATH = "downloadOriginImagePath";
    private static final String TAG = "ImageVideoScanAdapter";
    private BroadcastReceiver downloadReceiver;
    private Handler durationHandler;
    private String mCacheImagePath;
    private Context mContext;
    private List<TUIMessageBean> mDataSource;
    private boolean mIsVideoPlay;
    private TUIMessageBean mNewLocateMessage;
    private TUIMessageBean mOldLocateMessage;
    private ImageVideoScanActivity.OnItemClickListener onItemClickListener;
    private Runnable updateSeekBarTime;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnTouchListener {
        public final /* synthetic */ ImageVideoScanAdapter this$0;

        public AnonymousClass1(ImageVideoScanAdapter imageVideoScanAdapter) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 implements IPlayer.OnPreparedListener {
        public final /* synthetic */ ImageVideoScanAdapter this$0;
        public final /* synthetic */ ViewHolder val$holder;
        public final /* synthetic */ VideoMessageBean val$videoMessageBean;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$10$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass10 this$1;

            public AnonymousClass1(AnonymousClass10 anonymousClass10) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass10(ImageVideoScanAdapter imageVideoScanAdapter, ViewHolder viewHolder, VideoMessageBean videoMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer.OnPreparedListener
        public void onPrepared(IPlayer iPlayer) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 implements IPlayer.OnSeekCompleteListener {
        public final /* synthetic */ ImageVideoScanAdapter this$0;

        public AnonymousClass11(ImageVideoScanAdapter imageVideoScanAdapter) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer.OnSeekCompleteListener
        public void OnSeekComplete(IPlayer iPlayer) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 implements VideoMessageBean.VideoDownloadCallback {
        public final /* synthetic */ ImageVideoScanAdapter this$0;
        public final /* synthetic */ boolean val$autoPlay;
        public final /* synthetic */ ViewHolder val$holder;
        public final /* synthetic */ VideoMessageBean val$msg;
        public final /* synthetic */ int val$position;

        public AnonymousClass12(ImageVideoScanAdapter imageVideoScanAdapter, ViewHolder viewHolder, VideoMessageBean videoMessageBean, int i2, boolean z) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
        public void onProgress(long j2, long j3) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements ImageMessageBean.ImageBean.ImageDownloadCallback {
        public final /* synthetic */ ImageVideoScanAdapter this$0;
        public final /* synthetic */ ViewHolder val$holder;
        public final /* synthetic */ ImageMessageBean val$imageMessageBean;
        public final /* synthetic */ String val$path;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass2 this$1;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass2(ImageVideoScanAdapter imageVideoScanAdapter, ViewHolder viewHolder, ImageMessageBean imageMessageBean, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean.ImageBean.ImageDownloadCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean.ImageBean.ImageDownloadCallback
        public void onProgress(long j2, long j3) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean.ImageBean.ImageDownloadCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ ImageVideoScanAdapter this$0;
        public final /* synthetic */ V2TIMImageElem.V2TIMImage val$finalMCurrentOriginalImage;
        public final /* synthetic */ ViewHolder val$holder;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements V2TIMDownloadCallback {
            public final /* synthetic */ AnonymousClass3 this$1;
            public final /* synthetic */ String val$path;

            /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$3$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class RunnableC02121 implements Runnable {
                public final /* synthetic */ AnonymousClass1 this$2;

                public RunnableC02121(AnonymousClass1 anonymousClass1) {
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            }

            public AnonymousClass1(AnonymousClass3 anonymousClass3, String str) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMCallback
            public void onError(int i2, String str) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMDownloadCallback
            public void onProgress(V2TIMElem.V2ProgressInfo v2ProgressInfo) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMCallback
            public void onSuccess() {
            }
        }

        public AnonymousClass3(ImageVideoScanAdapter imageVideoScanAdapter, V2TIMImageElem.V2TIMImage v2TIMImage, ViewHolder viewHolder) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends BroadcastReceiver {
        public final /* synthetic */ ImageVideoScanAdapter this$0;
        public final /* synthetic */ ViewHolder val$holder;

        public AnonymousClass4(ImageVideoScanAdapter imageVideoScanAdapter, ViewHolder viewHolder) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements VideoMessageBean.VideoDownloadCallback {
        public final /* synthetic */ ImageVideoScanAdapter this$0;
        public final /* synthetic */ ViewHolder val$holder;
        public final /* synthetic */ String val$path;
        public final /* synthetic */ VideoMessageBean val$videoMessageBean;

        public AnonymousClass5(ImageVideoScanAdapter imageVideoScanAdapter, ViewHolder viewHolder, VideoMessageBean videoMessageBean, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
        public void onProgress(long j2, long j3) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ ImageVideoScanAdapter this$0;
        public final /* synthetic */ ViewHolder val$holder;

        public AnonymousClass6(ImageVideoScanAdapter imageVideoScanAdapter, ViewHolder viewHolder) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public final /* synthetic */ ImageVideoScanAdapter this$0;
        public final /* synthetic */ ViewHolder val$holder;

        public AnonymousClass7(ImageVideoScanAdapter imageVideoScanAdapter, ViewHolder viewHolder) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ ImageVideoScanAdapter this$0;
        public final /* synthetic */ ViewHolder val$holder;

        public AnonymousClass8(ImageVideoScanAdapter imageVideoScanAdapter, ViewHolder viewHolder) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanAdapter$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements View.OnClickListener {
        public final /* synthetic */ ImageVideoScanAdapter this$0;
        public final /* synthetic */ ViewHolder val$holder;

        public AnonymousClass9(ImageVideoScanAdapter imageVideoScanAdapter, ViewHolder viewHolder) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class MatrixChangeListener implements OnMatrixChangedListener {
        public final /* synthetic */ ImageVideoScanAdapter this$0;

        private MatrixChangeListener(ImageVideoScanAdapter imageVideoScanAdapter) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnMatrixChangedListener
        public void onMatrixChanged(RectF rectF) {
        }

        public /* synthetic */ MatrixChangeListener(ImageVideoScanAdapter imageVideoScanAdapter, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class PhotoTapListener implements OnPhotoTapListener {
        public final /* synthetic */ ImageVideoScanAdapter this$0;

        private PhotoTapListener(ImageVideoScanAdapter imageVideoScanAdapter) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnPhotoTapListener
        public void onPhotoTap(ImageView imageView, float f2, float f3) {
        }

        public /* synthetic */ PhotoTapListener(ImageVideoScanAdapter imageVideoScanAdapter, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class SingleFlingListener implements OnSingleFlingListener {
        public final /* synthetic */ ImageVideoScanAdapter this$0;

        private SingleFlingListener(ImageVideoScanAdapter imageVideoScanAdapter) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnSingleFlingListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        }

        public /* synthetic */ SingleFlingListener(ImageVideoScanAdapter imageVideoScanAdapter, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView closeButton;
        public boolean downloadVideoFailed;
        public boolean downloadVideoFinished;
        public ProgressBar loadingView;
        public ImageView pauseCenterView;
        public PhotoView photoView;
        public RelativeLayout photoViewLayout;
        public ImageView playButton;
        public LinearLayout playControlLayout;
        public SeekBar playSeekBar;
        public ImageView snapImageView;
        public final /* synthetic */ ImageVideoScanAdapter this$0;
        public TextView timeBeginView;
        public TextView timeEndView;
        public UIKitVideoView videoView;
        public FrameLayout videoViewLayout;
        public TextView viewOriginalButton;

        public ViewHolder(ImageVideoScanAdapter imageVideoScanAdapter, View view) {
        }
    }

    public static /* synthetic */ void access$1000(ImageVideoScanAdapter imageVideoScanAdapter, ViewHolder viewHolder, String str) {
    }

    public static /* synthetic */ boolean access$1100(ImageVideoScanAdapter imageVideoScanAdapter) {
    }

    public static /* synthetic */ boolean access$1102(ImageVideoScanAdapter imageVideoScanAdapter, boolean z) {
    }

    public static /* synthetic */ Handler access$1200(ImageVideoScanAdapter imageVideoScanAdapter) {
    }

    public static /* synthetic */ Handler access$1202(ImageVideoScanAdapter imageVideoScanAdapter, Handler handler) {
    }

    public static /* synthetic */ Runnable access$1300(ImageVideoScanAdapter imageVideoScanAdapter) {
    }

    public static /* synthetic */ Runnable access$1302(ImageVideoScanAdapter imageVideoScanAdapter, Runnable runnable) {
    }

    public static /* synthetic */ void access$1400(ImageVideoScanAdapter imageVideoScanAdapter, ViewHolder viewHolder, VideoMessageBean videoMessageBean) {
    }

    public static /* synthetic */ String access$300() {
    }

    public static /* synthetic */ void access$400(ImageVideoScanAdapter imageVideoScanAdapter, ImageView imageView, Object obj) {
    }

    public static /* synthetic */ Context access$500(ImageVideoScanAdapter imageVideoScanAdapter) {
    }

    public static /* synthetic */ String access$602(ImageVideoScanAdapter imageVideoScanAdapter, String str) {
    }

    public static /* synthetic */ void access$700(ImageVideoScanAdapter imageVideoScanAdapter, ViewHolder viewHolder, int i2, int i3) {
    }

    public static /* synthetic */ ImageVideoScanActivity.OnItemClickListener access$800(ImageVideoScanAdapter imageVideoScanAdapter) {
    }

    public static /* synthetic */ void access$900(ImageVideoScanAdapter imageVideoScanAdapter, ViewHolder viewHolder) {
    }

    private void clickPlayVideo(ViewHolder viewHolder) {
    }

    private TUIMessageBean getItem(int i2) {
    }

    private void getVideo(ViewHolder viewHolder, String str, VideoMessageBean videoMessageBean, boolean z, int i2) {
    }

    private void loadImageIntoView(ImageView imageView, Object obj) {
    }

    private void loadPhotoView(ViewHolder viewHolder, ImageMessageBean imageMessageBean, int i2) {
    }

    private void loadVideoView(ViewHolder viewHolder, VideoMessageBean videoMessageBean, int i2) {
    }

    private void performPhotoView(ViewHolder viewHolder, TUIMessageBean tUIMessageBean, int i2) {
    }

    private void performVideoView(ViewHolder viewHolder, TUIMessageBean tUIMessageBean, int i2) {
    }

    private void playControlInit(ViewHolder viewHolder) {
    }

    private void playVideo(ViewHolder viewHolder, VideoMessageBean videoMessageBean) {
    }

    private Uri processVideoMessage(VideoMessageBean videoMessageBean) {
    }

    private void updateVideoView(ViewHolder viewHolder, int i2, int i3) {
    }

    private void updateVideoViewSize(ViewHolder viewHolder, String str) {
    }

    public int addDataToSource(List<TUIMessageBean> list, int i2, int i3) {
    }

    public void destroyView(RecyclerView recyclerView, int i2) {
    }

    public List<TUIMessageBean> getDataSource() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    public TUIMessageBean getNewLocateMessage() {
    }

    public TUIMessageBean getOldLocateMessage() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }

    public void onDataChanged(TUIMessageBean tUIMessageBean) {
    }

    public void resetVideo(ViewHolder viewHolder) {
    }

    public void setDataSource(List<TUIMessageBean> list) {
    }

    public void setOnItemClickListener(ImageVideoScanActivity.OnItemClickListener onItemClickListener) {
    }

    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
    public ViewHolder onCreateViewHolder2(ViewGroup viewGroup, int i2) {
    }
}
