package com.showstartfans.activity.activitys.goods;

import android.view.View;
import com.showstartfans.activity.eventmodel.PeripheralDetailEvent;
import com.showstartfans.activity.model.PeripheralOrderDetailsBean;
import com.showstartfans.activity.view.textview.CountDownTextView;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import com.taihebase.activity.widget.Toolbar;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PeripheralOrderDetailsNewActivity.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0014J\b\u0010\u0011\u001a\u00020\u000bH\u0014J\b\u0010\u0012\u001a\u00020\u000bH\u0014J\b\u0010\u0013\u001a\u00020\u000bH\u0014J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u000bH\u0014J\b\u0010\u0018\u001a\u00020\u000bH\u0014J\b\u0010\u0019\u001a\u00020\bH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/showstartfans/activity/activitys/goods/PeripheralOrderDetailsNewActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "()V", "bean", "Lcom/showstartfans/activity/model/PeripheralOrderDetailsBean;", "order_id", "", "payFromToType", "", "type", "Confirm_receipt", "", "bindData", "getData", "isShowProgress", "", "initData", "initListener", "initView", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/PeripheralDetailEvent;", "onPause", "onResume", "setContentViewRes", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PeripheralOrderDetailsNewActivity extends BaseNoToolBarActivity {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final a f5532g = null;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private static final String f5533h = null;
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f5534d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private PeripheralOrderDetailsBean f5535e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private String f5536f;

    /* compiled from: PeripheralOrderDetailsNewActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/showstartfans/activity/activitys/goods/PeripheralOrderDetailsNewActivity$Companion;", "", "()V", "ORDER_ID", "", "getORDER_ID", "()Ljava/lang/String;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final String a() {
        }
    }

    /* compiled from: PeripheralOrderDetailsNewActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/goods/PeripheralOrderDetailsNewActivity$bindData$2", "Lcom/showstartfans/activity/view/textview/CountDownTextView$OnCountDownFinishListener;", "onCountDownFinish", "", "onUntilFinished", "millisUntilFinished", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements CountDownTextView.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PeripheralOrderDetailsBean f5537a;
        public final /* synthetic */ PeripheralOrderDetailsNewActivity b;

        public b(PeripheralOrderDetailsBean peripheralOrderDetailsBean, PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity) {
        }

        @Override // com.showstartfans.activity.view.textview.CountDownTextView.b
        public void onCountDownFinish() {
        }

        @Override // com.showstartfans.activity.view.textview.CountDownTextView.b
        public void onUntilFinished(long j2) {
        }
    }

    /* compiled from: PeripheralOrderDetailsNewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ PeripheralOrderDetailsNewActivity this$0;

        public c(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public static final /* synthetic */ String A() {
    }

    public static final /* synthetic */ String B(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity) {
    }

    private final void C(PeripheralOrderDetailsBean peripheralOrderDetailsBean) {
    }

    private static final void D(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity) {
    }

    private final void E(boolean z) {
    }

    private static final void F(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, n nVar) {
    }

    private static final void G(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity) {
    }

    private static final void H(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, Toolbar toolbar, float f2, int i2, int i3, int i4, int i5) {
    }

    private static final void I(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    private static final void J(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    private static final void K(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    private static final void L(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    private static final void M(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    private static final void N(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    private static final void O(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    public static /* synthetic */ void P(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    public static /* synthetic */ void Q(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    public static /* synthetic */ void R(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    public static /* synthetic */ void S(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity) {
    }

    public static /* synthetic */ void T(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, n nVar) {
    }

    public static /* synthetic */ void U(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    public static /* synthetic */ void V(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity) {
    }

    public static /* synthetic */ void W(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, n nVar) {
    }

    public static /* synthetic */ void X(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    public static /* synthetic */ void Y(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    public static /* synthetic */ void Z(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    public static /* synthetic */ void a0(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    public static /* synthetic */ void b0(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, Toolbar toolbar, float f2, int i2, int i3, int i4, int i5) {
    }

    private final void w() {
    }

    private static final void x(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, View view) {
    }

    private static final void y(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, n nVar) {
    }

    public static final /* synthetic */ void z(PeripheralOrderDetailsNewActivity peripheralOrderDetailsNewActivity, boolean z) {
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@NotNull PeripheralDetailEvent peripheralDetailEvent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
