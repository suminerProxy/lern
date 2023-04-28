package com.showstartfans.activity.activitys.usercenter;

import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.sdk.util.l;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.gatewayauth.Constant;
import com.taihe.photoselector.model.PhotoModel;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import h.a.a.a.a.i.g;
import h.u.a.c.t;
import h.u.a.g.f4;
import h.u.a.o.y;
import h.u.a.t.b2;
import h.y.a.m.n;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RefundOrderActivity.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u000e\u001a\u00020\fH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0014J\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/RefundOrderActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "binding", "Lcom/showstartfans/activity/databinding/ActivityRefundOrderBinding;", "imageDatas", "", "Lcom/taihe/photoselector/model/PhotoModel;", "reasons", "Lcom/showstartfans/activity/model/RefundReason;", "selectedReason", "getTips", "", "initData", "initListener", "initView", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "", "resultCode", "intent", "Landroid/content/Intent;", "refund", "reason", "", "images", "setContentViewResByViewBind", "Landroid/widget/ScrollView;", "uploadImage", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class RefundOrderActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final a f6357g = null;
    @NotNull
    public Map<Integer, View> b;
    private f4 c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private y f6358d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private List<y> f6359e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final List<PhotoModel> f6360f;

    /* compiled from: RefundOrderActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/RefundOrderActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "act", "Landroid/app/Activity;", "orderId", "", "price", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull Activity activity, long j2, double d2) {
        }
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", am.aB, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", AnimatedPasterJsonConfig.CONFIG_COUNT, TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements TextWatcher {
        public final /* synthetic */ RefundOrderActivity b;

        public b(RefundOrderActivity refundOrderActivity) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: RefundOrderActivity.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"com/showstartfans/activity/activitys/usercenter/RefundOrderActivity$initView$1", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "", "onBindViewHolder", "", "holder", g.C, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RefundOrderActivity f6361a;

        /* compiled from: RefundOrderActivity.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/showstartfans/activity/activitys/usercenter/RefundOrderActivity$initView$1$onCreateViewHolder$1", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends RecyclerView.ViewHolder {
            public a(RelativeLayout relativeLayout) {
            }
        }

        public d(RefundOrderActivity refundOrderActivity) {
        }

        public static /* synthetic */ void c(RefundOrderActivity refundOrderActivity, int i2, View view) {
        }

        public static /* synthetic */ void d(RefundOrderActivity refundOrderActivity, int i2, d dVar, View view) {
        }

        private static final void e(RefundOrderActivity refundOrderActivity, int i2, d dVar, View view) {
        }

        private static final void f(RefundOrderActivity refundOrderActivity, int i2, View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i2) {
        }
    }

    /* compiled from: RefundOrderActivity.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001d\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/usercenter/RefundOrderActivity$uploadImage$1", "Lcom/showstartfans/activity/utils/FileUtils$OnImageListener;", "onError", "", "throwable", "", "onSuccess", "paths", "", "", "([Ljava/lang/String;)V", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e implements b2.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RefundOrderActivity f6362a;
        public final /* synthetic */ String b;

        /* compiled from: RefundOrderActivity.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/usercenter/RefundOrderActivity$uploadImage$1$onSuccess$1", "Lcom/showstartfans/activity/activitys/UploadFileHelper$OnUploadImageMoreListener;", "onFail", "", l.c, "Lcom/taihebase/activity/network/Result;", "onProgress", "progress", "", "onSuccess", "value", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a implements t.c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RefundOrderActivity f6363a;
            public final /* synthetic */ String[] b;
            public final /* synthetic */ String c;

            public a(RefundOrderActivity refundOrderActivity, String[] strArr, String str) {
            }

            @Override // h.u.a.c.t.c
            public void a(@Nullable n nVar) {
            }

            @Override // h.u.a.c.t.c
            public void onProgress(int i2) {
            }

            @Override // h.u.a.c.t.c
            public void onSuccess(@Nullable String str) {
            }
        }

        public e(RefundOrderActivity refundOrderActivity, String str) {
        }

        @Override // h.u.a.t.b2.b
        public void a(@Nullable String[] strArr) {
        }

        @Override // h.u.a.t.b2.b
        public void onError(@Nullable Throwable th) {
        }
    }

    public static final /* synthetic */ y A(RefundOrderActivity refundOrderActivity) {
    }

    public static final /* synthetic */ void B(RefundOrderActivity refundOrderActivity, String str, String str2) {
    }

    public static final /* synthetic */ void C(RefundOrderActivity refundOrderActivity, y yVar) {
    }

    private final void D() {
    }

    private static final void E(RefundOrderActivity refundOrderActivity, n nVar) {
    }

    private static final void F(RefundOrderActivity refundOrderActivity, View view) {
    }

    private static final void G(RefundOrderActivity refundOrderActivity, View view) {
    }

    private static final void H(RefundOrderActivity refundOrderActivity, View view) {
    }

    public static /* synthetic */ void I(RefundOrderActivity refundOrderActivity, View view) {
    }

    public static /* synthetic */ void J(RefundOrderActivity refundOrderActivity, n nVar) {
    }

    public static /* synthetic */ void K(RefundOrderActivity refundOrderActivity, View view) {
    }

    public static /* synthetic */ void L(RefundOrderActivity refundOrderActivity, long j2, n nVar) {
    }

    public static /* synthetic */ void M(RefundOrderActivity refundOrderActivity, View view) {
    }

    private final void N(String str, String str2) {
    }

    private static final void O(RefundOrderActivity refundOrderActivity, long j2, n nVar) {
    }

    private final void Q(String str) {
    }

    public static final /* synthetic */ void w(RefundOrderActivity refundOrderActivity, String str) {
    }

    public static final /* synthetic */ f4 x(RefundOrderActivity refundOrderActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity y(RefundOrderActivity refundOrderActivity) {
    }

    public static final /* synthetic */ List z(RefundOrderActivity refundOrderActivity) {
    }

    @NotNull
    public ScrollView P() {
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public /* bridge */ /* synthetic */ View setContentViewResByViewBind() {
    }

    /* compiled from: RefundOrderActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "reason", "Lcom/showstartfans/activity/model/RefundReason;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<y, Unit> {
        public final /* synthetic */ RefundOrderActivity this$0;

        public c(RefundOrderActivity refundOrderActivity) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable y yVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
        }
    }
}
