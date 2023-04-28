package com.showstartfans.activity.activitys.group;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapController;
import com.showstartfans.activity.model.GroupManagerArticleBean;
import com.showstartfans.activity.model.GroupManagerItemBean;
import com.taihebase.activity.base.BaseNewActivity;
import com.tencent.qcloud.tuicore.TUIConstants;
import h.a.a.a.a.i.g;
import h.u.a.g.be;
import h.u.a.g.i1;
import h.u.a.g.xd;
import h.u.a.o.k;
import h.y.a.f.m;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GroupMemberNewActivity.kt */
@Metadata(d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0014J\b\u0010\u0016\u001a\u00020\u0010H\u0014J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/showstartfans/activity/activitys/group/GroupMemberNewActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "adapter", "com/showstartfans/activity/activitys/group/GroupMemberNewActivity$adapter$2$1", "getAdapter", "()Lcom/showstartfans/activity/activitys/group/GroupMemberNewActivity$adapter$2$1;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/showstartfans/activity/databinding/ActivityGroupMemberNewBinding;", "groupId", "", "isManager", "", "addBlackList", "", TUIConstants.TUILive.USER_ID, "", "finish", "initData", "initListener", "initView", "onEvent", "event", "Lcom/showstartfans/activity/model/FollowStatusChangeEvent;", "removeBlackList", "report", "requestData", "setContentViewResByViewBind", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class GroupMemberNewActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final a f5626g = null;
    @NotNull
    public Map<Integer, View> b;
    private boolean c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f5627d;

    /* renamed from: e  reason: collision with root package name */
    private i1 f5628e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f5629f;

    /* compiled from: GroupMemberNewActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/group/GroupMemberNewActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "groupId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final void a(@NotNull Context context, @NotNull String str) {
        }
    }

    /* compiled from: GroupMemberNewActivity.kt */
    @Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/showstartfans/activity/activitys/group/GroupMemberNewActivity$adapter$2$1", "invoke", "()Lcom/showstartfans/activity/activitys/group/GroupMemberNewActivity$adapter$2$1;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<a> {
        public final /* synthetic */ GroupMemberNewActivity this$0;

        /* compiled from: GroupMemberNewActivity.kt */
        @Metadata(d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J*\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0014¨\u0006\u0018"}, d2 = {"com/showstartfans/activity/activitys/group/GroupMemberNewActivity$adapter$2$1", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "", "bindHolderItem", "", MapController.ITEM_LAYER_TAG, "Lcom/showstartfans/activity/model/GroupManagerItemBean;", "itemBinding", "Lcom/showstartfans/activity/databinding/ItemGroupMemberNewBinding;", "bindHolderTitle", "", "Lcom/showstartfans/activity/databinding/ItemGroupTitleBinding;", "getItemViewType", "", g.C, "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends m<Object> {

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ GroupMemberNewActivity f5630n;

            public a(GroupMemberNewActivity groupMemberNewActivity) {
            }

            private final void Q(GroupManagerItemBean groupManagerItemBean, xd xdVar) {
            }

            private static final void R(GroupMemberNewActivity groupMemberNewActivity, GroupManagerItemBean groupManagerItemBean, View view) {
            }

            private static final void S(GroupMemberNewActivity groupMemberNewActivity, GroupManagerItemBean groupManagerItemBean, View view, String str, int i2) {
            }

            private static final void T(a aVar, GroupManagerItemBean groupManagerItemBean, View view) {
            }

            private static final void U(a aVar, GroupManagerArticleBean groupManagerArticleBean, View view) {
            }

            private static final void V(a aVar, GroupManagerArticleBean groupManagerArticleBean, View view) {
            }

            private static final void W(a aVar, GroupManagerArticleBean groupManagerArticleBean, View view) {
            }

            private final void X(String str, be beVar) {
            }

            public static /* synthetic */ void Y(GroupMemberNewActivity groupMemberNewActivity, GroupManagerItemBean groupManagerItemBean, View view, String str, int i2) {
            }

            public static /* synthetic */ void Z(a aVar, GroupManagerArticleBean groupManagerArticleBean, View view) {
            }

            public static /* synthetic */ void a0(a aVar, GroupManagerArticleBean groupManagerArticleBean, View view) {
            }

            public static /* synthetic */ void b0(a aVar, GroupManagerArticleBean groupManagerArticleBean, View view) {
            }

            public static /* synthetic */ void c0(GroupMemberNewActivity groupMemberNewActivity, GroupManagerItemBean groupManagerItemBean, View view) {
            }

            public static /* synthetic */ void d0(a aVar, GroupManagerItemBean groupManagerItemBean, View view) {
            }

            @Override // h.y.a.f.m
            @NotNull
            public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
            }

            @Override // h.y.a.f.m, androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemViewType(int i2) {
            }

            @Override // h.y.a.f.m
            public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
            }
        }

        public b(GroupMemberNewActivity groupMemberNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ a invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final a invoke() {
        }
    }

    private final void A(int i2) {
    }

    private static final void B(GroupMemberNewActivity groupMemberNewActivity, n nVar) {
    }

    private final b.a C() {
    }

    public static /* synthetic */ void D(GroupMemberNewActivity groupMemberNewActivity, n nVar) {
    }

    public static /* synthetic */ void E(GroupMemberNewActivity groupMemberNewActivity, n nVar) {
    }

    public static /* synthetic */ void F(GroupMemberNewActivity groupMemberNewActivity, int i2, View view, String str, int i3) {
    }

    public static /* synthetic */ void G(GroupMemberNewActivity groupMemberNewActivity, n nVar) {
    }

    private final void H(int i2) {
    }

    private static final void I(GroupMemberNewActivity groupMemberNewActivity, n nVar) {
    }

    private final void J(int i2) {
    }

    private static final void K(GroupMemberNewActivity groupMemberNewActivity, int i2, View view, String str, int i3) {
    }

    private final void L() {
    }

    private static final void M(GroupMemberNewActivity groupMemberNewActivity, n nVar) {
    }

    @JvmStatic
    public static final void O(@NotNull Context context, @NotNull String str) {
    }

    public static final /* synthetic */ void w(GroupMemberNewActivity groupMemberNewActivity, int i2) {
    }

    public static final /* synthetic */ boolean x(GroupMemberNewActivity groupMemberNewActivity) {
    }

    public static final /* synthetic */ void y(GroupMemberNewActivity groupMemberNewActivity, int i2) {
    }

    public static final /* synthetic */ void z(GroupMemberNewActivity groupMemberNewActivity, int i2) {
    }

    @NotNull
    public ConstraintLayout N() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // android.app.Activity
    public void finish() {
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable k kVar) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public /* bridge */ /* synthetic */ View setContentViewResByViewBind() {
    }
}
