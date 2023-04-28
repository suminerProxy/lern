package com.showstartfans.activity.activitys.goods;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.baidu.platform.comapi.map.MapController;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.model.AddressBean;
import com.taihebase.activity.base.BaseNewActivity;
import h.u.a.g.dh;
import h.u.a.g.m3;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PeripheralOrderEditAddressDetailActivity.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0014J\"\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0010H\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/showstartfans/activity/activitys/goods/PeripheralOrderEditAddressDetailActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "afterId", "", "binding", "Lcom/showstartfans/activity/databinding/ActivityPeripheralOrderEditAddressDetailBinding;", "orderId", "orderStatus", "createAddressItemView", "Lcom/showstartfans/activity/databinding/ItemPeripheralOrderAddressBinding;", MapController.ITEM_LAYER_TAG, "Lcom/showstartfans/activity/model/AddressBean;", "isLast", "", "getAfterDetail", "", "isShow", "initData", "initListener", "initView", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "", "resultCode", "data", "Landroid/content/Intent;", "onResume", "setContentViewResByViewBind", "Landroid/view/View;", "setCurrentAddress", "bean", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PeripheralOrderEditAddressDetailActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final a f5538g = null;
    @NotNull
    public Map<Integer, View> b;
    private m3 c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f5539d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private String f5540e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f5541f;

    /* compiled from: PeripheralOrderEditAddressDetailActivity.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/showstartfans/activity/activitys/goods/PeripheralOrderEditAddressDetailActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "afterId", "", "orderStatus", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ void b(a aVar, Context context, String str, String str2, int i2, Object obj) {
        }

        public final void a(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        }
    }

    private static final void A(PeripheralOrderEditAddressDetailActivity peripheralOrderEditAddressDetailActivity, n nVar) {
    }

    private static final void B(PeripheralOrderEditAddressDetailActivity peripheralOrderEditAddressDetailActivity, View view) {
    }

    private static final void C(PeripheralOrderEditAddressDetailActivity peripheralOrderEditAddressDetailActivity, View view) {
    }

    public static /* synthetic */ void D(PeripheralOrderEditAddressDetailActivity peripheralOrderEditAddressDetailActivity, n nVar) {
    }

    public static /* synthetic */ void E(PeripheralOrderEditAddressDetailActivity peripheralOrderEditAddressDetailActivity, View view) {
    }

    public static /* synthetic */ void F(PeripheralOrderEditAddressDetailActivity peripheralOrderEditAddressDetailActivity, View view) {
    }

    public static /* synthetic */ void G(PeripheralOrderEditAddressDetailActivity peripheralOrderEditAddressDetailActivity, View view) {
    }

    private final void H(AddressBean addressBean) {
    }

    private final dh w(AddressBean addressBean, boolean z) {
    }

    private static final void x(PeripheralOrderEditAddressDetailActivity peripheralOrderEditAddressDetailActivity, View view) {
    }

    private final void y(boolean z) {
    }

    public static /* synthetic */ void z(PeripheralOrderEditAddressDetailActivity peripheralOrderEditAddressDetailActivity, boolean z, int i2, Object obj) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
