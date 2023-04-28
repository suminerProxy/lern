package com.showstartfans.activity.activitys.goods;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import cn.sharesdk.framework.InnerShareParams;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.activitys.address.EditAddressActivity;
import h.y.a.m.i;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PeripheralOrderEditAddressActivity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0012\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\fH\u0014J\b\u0010\u0014\u001a\u00020\fH\u0014J\b\u0010\u0015\u001a\u00020\fH\u0014J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/showstartfans/activity/activitys/goods/PeripheralOrderEditAddressActivity;", "Lcom/showstartfans/activity/activitys/address/EditAddressActivity;", "()V", "default_icon_save", "Landroid/widget/ImageView;", "isSave", "", "orderId", "", "txt_set_save", "Landroid/widget/LinearLayout;", "confirm", "", "phone", "areaCode", InnerShareParams.ADDRESS, "name", "getCurrentAddress", "isShow", "initData", "initListener", "initView", "realDeal", "params", "Lcom/taihebase/activity/network/ApiParams;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PeripheralOrderEditAddressActivity extends EditAddressActivity {
    @NotNull
    public static final a x = null;
    @NotNull
    public Map<Integer, View> s;
    @Nullable
    private LinearLayout t;
    @Nullable
    private ImageView u;
    private boolean v;
    @NotNull
    private String w;

    /* compiled from: PeripheralOrderEditAddressActivity.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/activitys/goods/PeripheralOrderEditAddressActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/app/Activity;", "orderId", "", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "", "Landroid/content/Context;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull Activity activity, @NotNull String str, int i2) {
        }

        public final void b(@NotNull Context context, @NotNull String str) {
        }
    }

    private final void S(String str, String str2, String str3, String str4) {
    }

    private static final void T(PeripheralOrderEditAddressActivity peripheralOrderEditAddressActivity, n nVar) {
    }

    private final void U(boolean z) {
    }

    public static /* synthetic */ void V(PeripheralOrderEditAddressActivity peripheralOrderEditAddressActivity, boolean z, int i2, Object obj) {
    }

    private static final void W(PeripheralOrderEditAddressActivity peripheralOrderEditAddressActivity, n nVar) {
    }

    private static final void X(PeripheralOrderEditAddressActivity peripheralOrderEditAddressActivity, View view) {
    }

    public static /* synthetic */ void Y(PeripheralOrderEditAddressActivity peripheralOrderEditAddressActivity, View view) {
    }

    public static /* synthetic */ void Z(PeripheralOrderEditAddressActivity peripheralOrderEditAddressActivity, n nVar) {
    }

    public static /* synthetic */ void a0(PeripheralOrderEditAddressActivity peripheralOrderEditAddressActivity, n nVar) {
    }

    @Override // com.showstartfans.activity.activitys.address.EditAddressActivity
    public void O(@NotNull i iVar) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // com.showstartfans.activity.activitys.address.EditAddressActivity, com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.showstartfans.activity.activitys.address.EditAddressActivity, com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // com.showstartfans.activity.activitys.address.EditAddressActivity, com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }
}
