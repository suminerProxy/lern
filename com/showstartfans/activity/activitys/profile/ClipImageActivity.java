package com.showstartfans.activity.activitys.profile;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.crop.view.GestureCropImageView;
import com.showstartfans.activity.crop.view.OverlayView;
import com.showstartfans.activity.crop.view.TransformImageView;
import com.taihebase.activity.base.BaseNewActivity;
import h.u.a.g.w;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClipImageActivity.kt */
@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\f\u0018\u0000 22\u00020\u0001:\u00012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0014J-\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\b2\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0013H\u0014J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020&H\u0014J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020*H\u0002J\u001a\u0010+\u001a\u00020\u00132\b\u0010,\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u000200H\u0014J\b\u00101\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ClipImageActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "binding", "Lcom/showstartfans/activity/databinding/ActivityClipImageBinding;", "mCompressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "mCompressQuality", "", "mGestureCropImageView", "Lcom/showstartfans/activity/crop/view/GestureCropImageView;", "mImageListener", "com/showstartfans/activity/activitys/profile/ClipImageActivity$mImageListener$1", "Lcom/showstartfans/activity/activitys/profile/ClipImageActivity$mImageListener$1;", "mOutputUri", "Landroid/net/Uri;", "mOverlayView", "Lcom/showstartfans/activity/crop/view/OverlayView;", "cropAndSaveImage", "", "initData", "initListener", "initView", "initiateRootViews", "onDestroy", "onRequestPermissionsResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStop", "processOptions", "intent", "Landroid/content/Intent;", "setContentViewResByViewBind", "Landroid/widget/RelativeLayout;", "setImageData", "setResultException", "throwable", "", "setResultUri", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "resultAspectRatio", "", "setStatusBarTextWhite", "", "setupAspectRatioWidget", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ClipImageActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public static final a f6212j = null;

    /* renamed from: k  reason: collision with root package name */
    public static final int f6213k = 90;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private static Function1<? super Uri, Unit> f6214l;
    @NotNull
    public Map<Integer, View> b;
    private w c;

    /* renamed from: d  reason: collision with root package name */
    private GestureCropImageView f6215d;

    /* renamed from: e  reason: collision with root package name */
    private OverlayView f6216e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Uri f6217f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private Bitmap.CompressFormat f6218g;

    /* renamed from: h  reason: collision with root package name */
    private int f6219h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final b f6220i;

    /* compiled from: ClipImageActivity.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JM\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072+\u0010\u0005\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006j\u0004\u0018\u0001`\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R?\u0010\u0005\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006j\u0004\u0018\u0001`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ClipImageActivity$Companion;", "", "()V", "DEFAULT_COMPRESS_QUALITY", "", "callback", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "outUri", "", "Lcom/showstartfans/activity/activitys/profile/OnClipCallBack;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "setCallback", "(Lkotlin/jvm/functions/Function1;)V", "start", "context", "Landroid/content/Context;", "inputUri", "outputUri", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Nullable
        public final Function1<Uri, Unit> a() {
        }

        public final void b(@Nullable Function1<? super Uri, Unit> function1) {
        }

        @JvmStatic
        public final void c(@NotNull Context context, @NotNull Uri uri, @NotNull Uri uri2, @Nullable Function1<? super Uri, Unit> function1) {
        }
    }

    /* compiled from: ClipImageActivity.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0014\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016¨\u0006\b"}, d2 = {"com/showstartfans/activity/activitys/profile/ClipImageActivity$mImageListener$1", "Lcom/showstartfans/activity/crop/view/TransformImageView$DefaultTransformImageListener;", "onLoadComplete", "", "onLoadFailure", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends TransformImageView.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ClipImageActivity f6221a;

        /* compiled from: ClipImageActivity.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/showstartfans/activity/activitys/profile/ClipImageActivity$mImageListener$1$onLoadComplete$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a implements Animation.AnimationListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ClipImageActivity f6222a;

            public a(ClipImageActivity clipImageActivity) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@NotNull Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@NotNull Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@NotNull Animation animation) {
            }
        }

        public b(ClipImageActivity clipImageActivity) {
        }

        @Override // com.showstartfans.activity.crop.view.TransformImageView.b, com.showstartfans.activity.crop.view.TransformImageView.c
        public void a() {
        }

        @Override // com.showstartfans.activity.crop.view.TransformImageView.b, com.showstartfans.activity.crop.view.TransformImageView.c
        public void b(@NotNull Exception exc) {
        }
    }

    private final void A() {
    }

    private static final void B(ClipImageActivity clipImageActivity, View view) {
    }

    private static final void C(ClipImageActivity clipImageActivity, View view) {
    }

    private final void D() {
    }

    public static /* synthetic */ void E(ClipImageActivity clipImageActivity, View view) {
    }

    public static /* synthetic */ void F(ClipImageActivity clipImageActivity, View view) {
    }

    private final void G(Intent intent) {
    }

    private final void I(Intent intent) {
    }

    private final void J(Throwable th) {
    }

    private final void K(Uri uri, float f2) {
    }

    private final void L() {
    }

    @JvmStatic
    public static final void M(@NotNull Context context, @NotNull Uri uri, @NotNull Uri uri2, @Nullable Function1<? super Uri, Unit> function1) {
    }

    public static final /* synthetic */ w w(ClipImageActivity clipImageActivity) {
    }

    public static final /* synthetic */ Function1 x() {
    }

    public static final /* synthetic */ void y(Function1 function1) {
    }

    public static final /* synthetic */ void z(ClipImageActivity clipImageActivity, Throwable th) {
    }

    @NotNull
    public RelativeLayout H() {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i2, @NotNull String[] strArr, @NotNull int[] iArr) {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public /* bridge */ /* synthetic */ View setContentViewResByViewBind() {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity
    public boolean setStatusBarTextWhite() {
    }
}
