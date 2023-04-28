package com.showstartfans.activity.activitys.article;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.view.videocut.VideoConverSelectView;
import com.taihe.ffmpeg.FFmpegUtil;
import com.taihebase.activity.base.BaseNewActivity;
import h.j.a.f;
import h.u.a.g.q5;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TakePictureForMomentActivity.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u000e\u001a\u00020\fH\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\fH\u0014J-\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\fH\u0014J\b\u0010\u001f\u001a\u00020\fH\u0014J\u001a\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/showstartfans/activity/activitys/article/TakePictureForMomentActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "binding", "Lcom/showstartfans/activity/databinding/ActivityTakePictureBinding;", "isVideo", "", "selector", "Lcom/showstartfans/activity/view/videocut/VideoConverSelectView;", "stopRunnable", "Ljava/lang/Runnable;", "initData", "", "initListener", "initView", "needTopToolbar", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStart", "onStop", "onVideoComplete", "videoPath", "cover", "setContentViewResByViewBind", "Landroid/view/View;", "startTakeAnimation", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TakePictureForMomentActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final a f5351g = null;
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private VideoConverSelectView c;

    /* renamed from: d  reason: collision with root package name */
    private q5 f5352d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5353e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f5354f;

    /* compiled from: TakePictureForMomentActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/showstartfans/activity/activitys/article/TakePictureForMomentActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "act", "Landroid/app/Activity;", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "", "isFromPhoto", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ void b(a aVar, Activity activity, int i2, boolean z, int i3, Object obj) {
        }

        public final void a(@NotNull Activity activity, int i2, boolean z) {
        }
    }

    /* compiled from: TakePictureForMomentActivity.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/article/TakePictureForMomentActivity$initListener$6", "Lcom/flurgle/camerakit/CameraListener;", "onPictureTaken", "", "jpeg", "", "onVideoTaken", "video", "Ljava/io/File;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TakePictureForMomentActivity f5355a;

        /* compiled from: TakePictureForMomentActivity.kt */
        @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/article/TakePictureForMomentActivity$initListener$6$onVideoTaken$1", "Lcom/taihe/ffmpeg/FFmpegUtil$onCallBack;", "onComplete", "", "onFailure", "onProgress", "progress", "", "onStart", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class a implements FFmpegUtil.onCallBack {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TakePictureForMomentActivity f5356a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ String f5357d;

            public a(TakePictureForMomentActivity takePictureForMomentActivity, String str, String str2, String str3) {
            }

            public static /* synthetic */ void a(TakePictureForMomentActivity takePictureForMomentActivity, String str, String str2) {
            }

            private static final void b(TakePictureForMomentActivity takePictureForMomentActivity, String str, String str2) {
            }

            @Override // com.taihe.ffmpeg.FFmpegUtil.onCallBack
            public void onComplete() {
            }

            @Override // com.taihe.ffmpeg.FFmpegUtil.onCallBack
            public void onFailure() {
            }

            @Override // com.taihe.ffmpeg.FFmpegUtil.onCallBack
            public void onProgress(float f2) {
            }

            @Override // com.taihe.ffmpeg.FFmpegUtil.onCallBack
            public void onStart() {
            }
        }

        public b(TakePictureForMomentActivity takePictureForMomentActivity) {
        }

        @Override // h.j.a.f
        public void d(@Nullable byte[] bArr) {
        }

        @Override // h.j.a.f
        public void e(@Nullable File file) {
        }
    }

    private static final void A(TakePictureForMomentActivity takePictureForMomentActivity, View view) {
    }

    private static final void B(TakePictureForMomentActivity takePictureForMomentActivity, View view) {
    }

    private static final void C(TakePictureForMomentActivity takePictureForMomentActivity) {
    }

    private static final void D(TakePictureForMomentActivity takePictureForMomentActivity, View view) {
    }

    private static final void E(TakePictureForMomentActivity takePictureForMomentActivity, View view) {
    }

    private static final void F(TakePictureForMomentActivity takePictureForMomentActivity, View view) {
    }

    public static /* synthetic */ void G(TakePictureForMomentActivity takePictureForMomentActivity) {
    }

    public static /* synthetic */ void H(TakePictureForMomentActivity takePictureForMomentActivity, View view) {
    }

    public static /* synthetic */ void I(TakePictureForMomentActivity takePictureForMomentActivity) {
    }

    public static /* synthetic */ void J(TakePictureForMomentActivity takePictureForMomentActivity, View view) {
    }

    public static /* synthetic */ void K(TakePictureForMomentActivity takePictureForMomentActivity, View view) {
    }

    public static /* synthetic */ void L(TakePictureForMomentActivity takePictureForMomentActivity) {
    }

    public static /* synthetic */ void M(TakePictureForMomentActivity takePictureForMomentActivity, View view) {
    }

    public static /* synthetic */ void N(TakePictureForMomentActivity takePictureForMomentActivity, View view) {
    }

    private static final void O(TakePictureForMomentActivity takePictureForMomentActivity) {
    }

    private final void P(String str, String str2) {
    }

    private final void Q() {
    }

    private static final void R(TakePictureForMomentActivity takePictureForMomentActivity) {
    }

    public static final /* synthetic */ q5 w(TakePictureForMomentActivity takePictureForMomentActivity) {
    }

    public static final /* synthetic */ VideoConverSelectView x(TakePictureForMomentActivity takePictureForMomentActivity) {
    }

    public static final /* synthetic */ void y(TakePictureForMomentActivity takePictureForMomentActivity, String str, String str2) {
    }

    public static final /* synthetic */ void z(TakePictureForMomentActivity takePictureForMomentActivity, VideoConverSelectView videoConverSelectView) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public boolean needTopToolbar() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i2, @NotNull String[] strArr, @NotNull int[] iArr) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
