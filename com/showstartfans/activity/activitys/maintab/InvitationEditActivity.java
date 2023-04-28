package com.showstartfans.activity.activitys.maintab;

import android.app.Activity;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.ShareMouldBean;
import com.showstartfans.activity.view.InvitationView;
import com.taihebase.activity.base.BaseNewActivity;
import h.u.a.g.b2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InvitationEditActivity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\f\u001a\u00020\nH\u0014J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/InvitationEditActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "binding", "Lcom/showstartfans/activity/databinding/ActivityInvitationEditBinding;", "isShare", "", "mData", "Lcom/showstartfans/activity/model/ShareMouldBean;", "initData", "", "initListener", "initView", "needTopToolbar", "onBackPressed", "setContentViewResByViewBind", "Landroid/view/View;", "sheShareMode", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class InvitationEditActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static final a f5809f = null;
    @NotNull
    public Map<Integer, View> b;
    private boolean c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private ShareMouldBean f5810d;

    /* renamed from: e  reason: collision with root package name */
    private b2 f5811e;

    /* compiled from: InvitationEditActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/InvitationEditActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "act", "Landroid/app/Activity;", "bean", "Lcom/showstartfans/activity/model/ShareMouldBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull Activity activity, @Nullable ShareMouldBean shareMouldBean) {
        }
    }

    /* compiled from: InvitationEditActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/view/InvitationView;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<InvitationView, Unit> {
        public final /* synthetic */ InvitationEditActivity this$0;

        public b(InvitationEditActivity invitationEditActivity) {
        }

        public static /* synthetic */ void a(InvitationEditActivity invitationEditActivity) {
        }

        public static /* synthetic */ void b(InvitationEditActivity invitationEditActivity) {
        }

        /* renamed from: invoke$lambda-1  reason: not valid java name */
        private static final void m18invoke$lambda1(InvitationEditActivity invitationEditActivity) {
        }

        /* renamed from: invoke$lambda-1$lambda-0  reason: not valid java name */
        private static final void m19invoke$lambda1$lambda0(InvitationEditActivity invitationEditActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InvitationView invitationView) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InvitationView invitationView) {
        }
    }

    public static /* synthetic */ void A(InvitationEditActivity invitationEditActivity, View view) {
    }

    private final void B(boolean z) {
    }

    public static final /* synthetic */ b2 w(InvitationEditActivity invitationEditActivity) {
    }

    private static final void x(InvitationEditActivity invitationEditActivity, View view) {
    }

    private static final void y(InvitationEditActivity invitationEditActivity, View view) {
    }

    public static /* synthetic */ void z(InvitationEditActivity invitationEditActivity, View view) {
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
    public boolean needTopToolbar() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
