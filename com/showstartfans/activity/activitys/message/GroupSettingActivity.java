package com.showstartfans.activity.activitys.message;

import android.content.Context;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.eventmodel.OnGroupChatStyleChangeEvnet;
import com.showstartfans.activity.eventmodel.OnGroupNoticeUpdateEvent;
import com.showstartfans.activity.eventmodel.OnGtoupPremissionEvent;
import com.showstartfans.activity.model.GroupInfoNewBean;
import com.taihebase.activity.base.BaseNewActivity;
import com.tencent.qcloud.tuicore.TUIConstants;
import h.u.a.g.l1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GroupSettingActivity.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0014J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0014J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\rH\u0014J\b\u0010\u0014\u001a\u00020\rH\u0014J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0018H\u0007J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0019H\u0007J\b\u0010\u001a\u001a\u00020\rH\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\u0012\u0010\u001d\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u001f\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/showstartfans/activity/activitys/message/GroupSettingActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "binding", "Lcom/showstartfans/activity/databinding/ActivityGroupSettingBinding;", "groupId", "", "hasManagerPermission", "", "isAdmin", "mBean", "Lcom/showstartfans/activity/model/GroupInfoNewBean;", "OnRefresh", "", "getData", "initData", "bean", "initListener", "initUI", "initView", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/OnGroupChatStyleChangeEvnet;", "Lcom/showstartfans/activity/eventmodel/OnGroupNoticeUpdateEvent;", "Lcom/showstartfans/activity/eventmodel/OnGtoupPremissionEvent;", "onResume", "setContentViewResByViewBind", "Landroid/view/View;", "updateNoticeText", TUIConstants.TUIChat.NOTICE, "updateSpeakPermissionText", "speakPermission", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class GroupSettingActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public static final a f5979h = null;
    @NotNull
    public Map<Integer, View> b;
    private l1 c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f5980d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5981e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5982f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private GroupInfoNewBean f5983g;

    /* compiled from: GroupSettingActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/message/GroupSettingActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "groupId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@Nullable Context context, @Nullable String str) {
        }
    }

    /* compiled from: GroupSettingActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/GroupInfoNewBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<GroupInfoNewBean, Unit> {
        public final /* synthetic */ GroupSettingActivity this$0;

        public b(GroupSettingActivity groupSettingActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GroupInfoNewBean groupInfoNewBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable GroupInfoNewBean groupInfoNewBean) {
        }
    }

    private static final void A(GroupSettingActivity groupSettingActivity, View view) {
    }

    private static final void B(GroupSettingActivity groupSettingActivity, View view) {
    }

    private static final void C(GroupSettingActivity groupSettingActivity, View view) {
    }

    private static final void D(GroupSettingActivity groupSettingActivity, View view) {
    }

    private static final void E(GroupSettingActivity groupSettingActivity, View view) {
    }

    private static final void F(GroupSettingActivity groupSettingActivity, View view) {
    }

    private static final void G(GroupSettingActivity groupSettingActivity, View view) {
    }

    private static final void H(GroupSettingActivity groupSettingActivity, View view) {
    }

    public static /* synthetic */ void I(GroupSettingActivity groupSettingActivity, View view) {
    }

    public static /* synthetic */ void J(GroupSettingActivity groupSettingActivity, View view) {
    }

    public static /* synthetic */ void K(GroupSettingActivity groupSettingActivity, View view) {
    }

    public static /* synthetic */ void L(GroupSettingActivity groupSettingActivity, View view) {
    }

    public static /* synthetic */ void M(GroupSettingActivity groupSettingActivity, View view) {
    }

    public static /* synthetic */ void N(GroupSettingActivity groupSettingActivity, View view) {
    }

    public static /* synthetic */ void O(GroupSettingActivity groupSettingActivity, View view) {
    }

    public static /* synthetic */ void P(GroupSettingActivity groupSettingActivity, View view) {
    }

    private final void Q(String str) {
    }

    private final void R(String str) {
    }

    private final void initUI() {
    }

    public static final /* synthetic */ void x(GroupSettingActivity groupSettingActivity, GroupInfoNewBean groupInfoNewBean) {
    }

    private final void y() {
    }

    private final void z(GroupInfoNewBean groupInfoNewBean) {
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
    public final void onEvent(@Nullable OnGroupNoticeUpdateEvent onGroupNoticeUpdateEvent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }

    public final void w() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable OnGroupChatStyleChangeEvnet onGroupChatStyleChangeEvnet) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable OnGtoupPremissionEvent onGtoupPremissionEvent) {
    }
}
