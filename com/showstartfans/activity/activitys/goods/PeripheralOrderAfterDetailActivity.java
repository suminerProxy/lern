package com.showstartfans.activity.activitys.goods;

import android.content.Context;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.BuildConfig;
import com.showstartfans.activity.model.GoodOrderAfterDetailBean;
import com.showstartfans.activity.model.GoodsOrderAfterSaleLog;
import com.taihebase.activity.base.BaseNewActivity;
import h.u.a.g.i3;
import h.y.a.m.n;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PeripheralOrderAfterDetailActivity.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J&\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0002J \u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J \u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0014J\b\u0010\u001d\u001a\u00020\u0019H\u0014J\b\u0010\u001e\u001a\u00020\u0019H\u0014J\b\u0010\u001f\u001a\u00020\nH\u0014J\b\u0010 \u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/showstartfans/activity/activitys/goods/PeripheralOrderAfterDetailActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "afterId", "", "bean", "Lcom/showstartfans/activity/model/GoodOrderAfterDetailBean;", "binding", "Lcom/showstartfans/activity/databinding/ActivityPeripheralOrderAfterDetailBinding;", "createItemAddress", "Landroid/view/View;", "isHead", "", "title", "createItemGood", "createItemPhoto", "photos", "", "createItemText", "value", "createLog", BuildConfig.FLAVOR_type, "Lcom/showstartfans/activity/model/GoodsOrderAfterSaleLog;", "isLast", "getAfterDetail", "", "isShow", "initData", "initListener", "initView", "onResume", "setContentViewResByViewBind", "updateConfirm", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PeripheralOrderAfterDetailActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static final a f5515f = null;
    @NotNull
    public Map<Integer, View> b;
    private i3 c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f5516d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private GoodOrderAfterDetailBean f5517e;

    /* compiled from: PeripheralOrderAfterDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/goods/PeripheralOrderAfterDetailActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "afterId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull Context context, @NotNull String str) {
        }
    }

    private static final void A(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, List list, View view) {
    }

    private static final void B(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, List list, View view) {
    }

    private static final void C(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, List list, View view) {
    }

    private final View D(boolean z, String str, String str2) {
    }

    private final View E(GoodsOrderAfterSaleLog goodsOrderAfterSaleLog, boolean z, boolean z2) {
    }

    private final void F(boolean z) {
    }

    public static /* synthetic */ void G(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, boolean z, int i2, Object obj) {
    }

    private static final void H(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, n nVar) {
    }

    private static final void I(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, View view) {
    }

    public static /* synthetic */ void J(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, List list, View view) {
    }

    public static /* synthetic */ void K(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, List list, View view) {
    }

    public static /* synthetic */ void L(boolean z, PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, View view) {
    }

    public static /* synthetic */ void M(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, View view) {
    }

    public static /* synthetic */ void N(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, View view) {
    }

    public static /* synthetic */ void O(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, n nVar) {
    }

    public static /* synthetic */ void P(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, View view) {
    }

    public static /* synthetic */ void Q(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, List list, View view) {
    }

    private final void R() {
    }

    private static final void S(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, View view) {
    }

    private static final void T(PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, View view) {
    }

    private final View w(boolean z, String str) {
    }

    private static final void x(boolean z, PeripheralOrderAfterDetailActivity peripheralOrderAfterDetailActivity, View view) {
    }

    private final View y(boolean z) {
    }

    private final View z(boolean z, String str, List<String> list) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
