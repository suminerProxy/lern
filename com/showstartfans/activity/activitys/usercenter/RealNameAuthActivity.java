package com.showstartfans.activity.activitys.usercenter;

import android.content.Intent;
import android.view.View;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.showstartfans.activity.eventmodel.RefreshRealNameMsgEvent;
import com.showstartfans.activity.model.UserRealNameInfoBean;
import com.taihebase.activity.base.BaseNewActivity;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Metadata;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealNameAuthActivity.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010\t\u001a\u00020\u0007H\u0014J\b\u0010\n\u001a\u00020\u0007H\u0014J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0014J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/RealNameAuthActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "Lcom/mob/moblink/SceneRestorable;", "()V", "infoBean", "Lcom/showstartfans/activity/model/UserRealNameInfoBean;", "getRealStatusMsg", "", "initData", "initListener", "initView", "onBackPressed", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/RefreshRealNameMsgEvent;", "onNewIntent", "intent", "Landroid/content/Intent;", "onReturnSceneData", "p0", "Lcom/mob/moblink/Scene;", "realNameTwo", "realType", "", "bean", "setContentViewRes", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class RealNameAuthActivity extends BaseNewActivity implements SceneRestorable {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private UserRealNameInfoBean c;

    private static final void A(RealNameAuthActivity realNameAuthActivity, View view) {
    }

    public static /* synthetic */ void B(RealNameAuthActivity realNameAuthActivity, n nVar) {
    }

    public static /* synthetic */ void C(RealNameAuthActivity realNameAuthActivity, View view) {
    }

    public static /* synthetic */ void D(RealNameAuthActivity realNameAuthActivity, View view) {
    }

    public static /* synthetic */ void E(RealNameAuthActivity realNameAuthActivity, View view) {
    }

    private final void F(int i2, UserRealNameInfoBean userRealNameInfoBean) {
    }

    private final void w() {
    }

    private static final void x(RealNameAuthActivity realNameAuthActivity, n nVar) {
    }

    private static final void y(RealNameAuthActivity realNameAuthActivity, View view) {
    }

    private static final void z(RealNameAuthActivity realNameAuthActivity, View view) {
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshRealNameMsgEvent refreshRealNameMsgEvent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
    }

    @Override // com.mob.moblink.SceneRestorable
    public void onReturnSceneData(@Nullable Scene scene) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
