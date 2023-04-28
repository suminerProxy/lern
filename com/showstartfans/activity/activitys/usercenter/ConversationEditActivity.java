package com.showstartfans.activity.activitys.usercenter;

import android.content.Context;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.taihebase.activity.base.BaseNewActivity;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import h.u.a.g.d0;
import h.u.a.u.y3.j.d;
import h.y.a.m.n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConversationEditActivity.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0014J\b\u0010\u000f\u001a\u00020\nH\u0014J\b\u0010\u0010\u001a\u00020\nH\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/ConversationEditActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "adapter", "Lcom/showstartfans/activity/view/custom_im_ui/adapter/CustomConversationListAdapter;", "binding", "Lcom/showstartfans/activity/databinding/ActivityConversationEditBinding;", "checkAlling", "", "getMessagePoint", "", "imConversations", "", "Lcom/tencent/qcloud/tuikit/tuiconversation/bean/ConversationInfo;", "initData", "initListener", "initView", "setContentViewResByViewBind", "Landroid/view/View;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ConversationEditActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final a f6315e = null;
    @NotNull
    public Map<Integer, View> b;
    private d0 c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private d f6316d;

    /* compiled from: ConversationEditActivity.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/ConversationEditActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final void a(@NotNull Context context) {
        }
    }

    /* compiled from: ConversationEditActivity.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/usercenter/ConversationEditActivity$initView$1", "Lcom/tencent/qcloud/tuicore/component/interfaces/IUIKitCallback;", "", "Lcom/tencent/qcloud/tuikit/tuiconversation/bean/ConversationInfo;", "onSuccess", "", "data", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends IUIKitCallback<List<? extends ConversationInfo>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ConversationEditActivity f6317a;

        public b(ConversationEditActivity conversationEditActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<? extends ConversationInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(@Nullable List<? extends ConversationInfo> list) {
        }
    }

    private static final void A(ConversationEditActivity conversationEditActivity, HashMap hashMap) {
    }

    private static final void B(ConversationEditActivity conversationEditActivity, int i2, View view) {
    }

    private static final void C(ConversationEditActivity conversationEditActivity, View view) {
    }

    private static final void D(ConversationEditActivity conversationEditActivity, View view) {
    }

    public static /* synthetic */ void E(ConversationEditActivity conversationEditActivity, View view) {
    }

    public static /* synthetic */ void F(ConversationEditActivity conversationEditActivity, HashMap hashMap) {
    }

    public static /* synthetic */ void G(ConversationEditActivity conversationEditActivity, int i2, View view) {
    }

    public static /* synthetic */ void H(ConversationEditActivity conversationEditActivity, List list, n nVar) {
    }

    public static /* synthetic */ void I(ConversationEditActivity conversationEditActivity, View view) {
    }

    @JvmStatic
    public static final void J(@NotNull Context context) {
    }

    public static final /* synthetic */ void w(ConversationEditActivity conversationEditActivity, List list) {
    }

    private final boolean x() {
    }

    private final void y(List<? extends ConversationInfo> list) {
    }

    private static final void z(ConversationEditActivity conversationEditActivity, List list, n nVar) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
