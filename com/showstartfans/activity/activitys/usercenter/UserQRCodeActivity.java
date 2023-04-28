package com.showstartfans.activity.activitys.usercenter;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.CountDownTimer;
import android.view.View;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import h.y.a.k.d;
import h.y.a.m.n;
import i.a.d0;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UserQRCodeActivity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\b\u0010\u0016\u001a\u00020\u0014H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u001a\u0010\u0019\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0003J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0014J\b\u0010\u001c\u001a\u00020\u000eH\u0014J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/UserQRCodeActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "()V", "balanceUrl", "", "countDownTimer", "Landroid/os/CountDownTimer;", "getCountDownTimer", "()Landroid/os/CountDownTimer;", "setCountDownTimer", "(Landroid/os/CountDownTimer;)V", "fromRealActivity", "", "realStatus", "", "canvasBitmap", "Landroid/graphics/Bitmap;", "bitmap", "color", "getRealMsg", "", "initData", "initListener", "initView", "loadData", "loadQRCode", "onBackPressed", "onDestroy", "setContentViewRes", "setQrCode", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class UserQRCodeActivity extends BaseNoToolBarActivity {
    @NotNull
    public Map<Integer, View> b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private int f6461d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private String f6462e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private CountDownTimer f6463f;

    /* compiled from: UserQRCodeActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/usercenter/UserQRCodeActivity$countDownTimer$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UserQRCodeActivity f6464a;

        public a(UserQRCodeActivity userQRCodeActivity) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j2) {
        }
    }

    /* compiled from: UserQRCodeActivity.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/usercenter/UserQRCodeActivity$loadData$1", "Lcom/taihebase/activity/listener/OnGetBitmapListenerCall;", "onFailure_", "", "dataSource", "Lcom/facebook/datasource/DataSource;", "Lcom/facebook/common/references/CloseableReference;", "Lcom/facebook/imagepipeline/image/CloseableImage;", "onSuccess_", "bitmap", "Landroid/graphics/Bitmap;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UserQRCodeActivity f6465a;
        public final /* synthetic */ int b;

        public b(UserQRCodeActivity userQRCodeActivity, int i2) {
        }

        @Override // h.y.a.k.d
        public void a(@Nullable DataSource<CloseableReference<CloseableImage>> dataSource) {
        }

        @Override // h.y.a.k.d
        public void b(@Nullable Bitmap bitmap) {
        }
    }

    private final void B() {
    }

    private static final void C(UserQRCodeActivity userQRCodeActivity, n nVar) {
    }

    private static final void D(UserQRCodeActivity userQRCodeActivity, View view) {
    }

    private static final void E(UserQRCodeActivity userQRCodeActivity, View view) {
    }

    private static final void F(UserQRCodeActivity userQRCodeActivity, View view) {
    }

    private static final void G(UserQRCodeActivity userQRCodeActivity, View view) {
    }

    public static /* synthetic */ void H(UserQRCodeActivity userQRCodeActivity, View view) {
    }

    public static /* synthetic */ void I(UserQRCodeActivity userQRCodeActivity, Bitmap bitmap) {
    }

    public static /* synthetic */ void J(UserQRCodeActivity userQRCodeActivity, View view) {
    }

    public static /* synthetic */ void K(UserQRCodeActivity userQRCodeActivity, View view) {
    }

    public static /* synthetic */ void L(UserQRCodeActivity userQRCodeActivity, Bitmap bitmap, int i2, d0 d0Var) {
    }

    public static /* synthetic */ void M(UserQRCodeActivity userQRCodeActivity, View view) {
    }

    public static /* synthetic */ void N(UserQRCodeActivity userQRCodeActivity, n nVar) {
    }

    private final void O(int i2) {
    }

    @SuppressLint({"CheckResult"})
    private final void P(Bitmap bitmap, int i2) {
    }

    private static final void Q(UserQRCodeActivity userQRCodeActivity, Bitmap bitmap) {
    }

    private static final void R(UserQRCodeActivity userQRCodeActivity, Bitmap bitmap, int i2, d0 d0Var) {
    }

    private final void T(int i2) {
    }

    public static final /* synthetic */ int w(UserQRCodeActivity userQRCodeActivity) {
    }

    public static final /* synthetic */ void x(UserQRCodeActivity userQRCodeActivity, Bitmap bitmap, int i2) {
    }

    public static final /* synthetic */ void y(UserQRCodeActivity userQRCodeActivity, int i2) {
    }

    private final Bitmap z(Bitmap bitmap, int i2) {
    }

    @NotNull
    public final CountDownTimer A() {
    }

    public final void S(@NotNull CountDownTimer countDownTimer) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
