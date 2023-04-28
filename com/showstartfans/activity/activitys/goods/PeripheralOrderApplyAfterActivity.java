package com.showstartfans.activity.activitys.goods;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.sdk.util.l;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.model.ApplyAfterInfoBean;
import com.taihe.photoselector.model.PhotoModel;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import h.a.a.a.a.i.g;
import h.u.a.c.t;
import h.u.a.g.j3;
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

/* compiled from: PeripheralOrderApplyAfterActivity.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0012\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0014J\b\u0010\u001f\u001a\u00020\u0016H\u0014J\b\u0010 \u001a\u00020\u0016H\u0014J\"\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020'H\u0014J\b\u0010(\u001a\u00020\u0016H\u0002J\b\u0010)\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/showstartfans/activity/activitys/goods/PeripheralOrderApplyAfterActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "binding", "Lcom/showstartfans/activity/databinding/ActivityPeripheralOrderApplyAfterBinding;", "goodName", "", "goodSku", "goodUrl", "goodsId", "imageDatas", "", "Lcom/taihe/photoselector/model/PhotoModel;", "infoBean", "Lcom/showstartfans/activity/model/ApplyAfterInfoBean;", "orderDetailId", "orderId", "reasons", "", "Lcom/showstartfans/activity/model/RefundReason;", "selectedReason", "confirm", "", "imageUrls", "getInfo", "isShow", "", "getTips", "type", "", "initData", "initListener", "initView", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "intent", "Landroid/content/Intent;", "setContentViewResByViewBind", "Landroid/view/View;", "updateNumberStatus", "uploadImage", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PeripheralOrderApplyAfterActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public static final a f5518n = null;
    @NotNull
    public Map<Integer, View> b;
    private j3 c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f5519d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private String f5520e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f5521f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private String f5522g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private String f5523h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private String f5524i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private ApplyAfterInfoBean f5525j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private List<y> f5526k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private y f5527l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    private final List<PhotoModel> f5528m;

    /* compiled from: PeripheralOrderApplyAfterActivity.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lcom/showstartfans/activity/activitys/goods/PeripheralOrderApplyAfterActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "orderId", "", "orderDetailId", "goodsId", "goodUrl", "goodName", "goodSku", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        }
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", am.aB, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", AnimatedPasterJsonConfig.CONFIG_COUNT, TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements TextWatcher {
        public final /* synthetic */ PeripheralOrderApplyAfterActivity b;

        public b(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity) {
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

    /* compiled from: PeripheralOrderApplyAfterActivity.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"com/showstartfans/activity/activitys/goods/PeripheralOrderApplyAfterActivity$initView$1", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "", "onBindViewHolder", "", "holder", g.C, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PeripheralOrderApplyAfterActivity f5529a;

        /* compiled from: PeripheralOrderApplyAfterActivity.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/showstartfans/activity/activitys/goods/PeripheralOrderApplyAfterActivity$initView$1$onCreateViewHolder$1", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends RecyclerView.ViewHolder {
            public a(RelativeLayout relativeLayout) {
            }
        }

        public d(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity) {
        }

        public static /* synthetic */ void c(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, int i2, View view) {
        }

        public static /* synthetic */ void d(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, int i2, d dVar, View view) {
        }

        private static final void e(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, int i2, d dVar, View view) {
        }

        private static final void f(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, int i2, View view) {
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

    /* compiled from: PeripheralOrderApplyAfterActivity.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001d\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/goods/PeripheralOrderApplyAfterActivity$uploadImage$1", "Lcom/showstartfans/activity/utils/FileUtils$OnImageListener;", "onError", "", "throwable", "", "onSuccess", "paths", "", "", "([Ljava/lang/String;)V", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e implements b2.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PeripheralOrderApplyAfterActivity f5530a;

        /* compiled from: PeripheralOrderApplyAfterActivity.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/goods/PeripheralOrderApplyAfterActivity$uploadImage$1$onSuccess$1", "Lcom/showstartfans/activity/activitys/UploadFileHelper$OnUploadImageMoreListener;", "onFail", "", l.c, "Lcom/taihebase/activity/network/Result;", "onProgress", "progress", "", "onSuccess", "value", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a implements t.c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ PeripheralOrderApplyAfterActivity f5531a;
            public final /* synthetic */ String[] b;

            public a(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, String[] strArr) {
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

        public e(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity) {
        }

        @Override // h.u.a.t.b2.b
        public void a(@Nullable String[] strArr) {
        }

        @Override // h.u.a.t.b2.b
        public void onError(@Nullable Throwable th) {
        }
    }

    public static final /* synthetic */ List A(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity) {
    }

    public static final /* synthetic */ y B(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity) {
    }

    public static final /* synthetic */ void C(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, y yVar) {
    }

    private final void D(String str) {
    }

    private static final void E(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, n nVar) {
    }

    private final void F(boolean z) {
    }

    public static /* synthetic */ void G(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, boolean z, int i2, Object obj) {
    }

    private static final void H(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, n nVar) {
    }

    private final void I(int i2) {
    }

    private static final void J(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, n nVar) {
    }

    private static final void K(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, View view) {
    }

    private static final void L(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, View view) {
    }

    private static final void M(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, View view) {
    }

    private static final void N(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, View view) {
    }

    private static final void O(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, View view) {
    }

    public static /* synthetic */ void P(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, n nVar) {
    }

    public static /* synthetic */ void Q(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, View view) {
    }

    public static /* synthetic */ void R(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, n nVar) {
    }

    public static /* synthetic */ void S(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, View view) {
    }

    public static /* synthetic */ void T(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, View view) {
    }

    public static /* synthetic */ void U(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, View view) {
    }

    public static /* synthetic */ void V(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, View view) {
    }

    public static /* synthetic */ void W(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, n nVar) {
    }

    private final void X() {
    }

    private final void Y() {
    }

    public static final /* synthetic */ void w(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, String str) {
    }

    public static final /* synthetic */ void x(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity, String str) {
    }

    public static final /* synthetic */ j3 y(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity z(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity) {
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
    @NotNull
    public View setContentViewResByViewBind() {
    }

    /* compiled from: PeripheralOrderApplyAfterActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "reason", "Lcom/showstartfans/activity/model/RefundReason;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<y, Unit> {
        public final /* synthetic */ PeripheralOrderApplyAfterActivity this$0;

        public c(PeripheralOrderApplyAfterActivity peripheralOrderApplyAfterActivity) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable y yVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
        }
    }
}
