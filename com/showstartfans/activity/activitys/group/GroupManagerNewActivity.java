package com.showstartfans.activity.activitys.group;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapController;
import com.showstartfans.activity.model.AuthorInfo;
import com.taihebase.activity.base.BaseNewActivity;
import com.tencent.qcloud.tuicore.TUIConstants;
import h.a.a.a.a.i.g;
import h.u.a.g.be;
import h.u.a.g.f1;
import h.u.a.g.ud;
import h.y.a.f.m;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GroupManagerNewActivity.kt */
@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0014J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/showstartfans/activity/activitys/group/GroupManagerNewActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "adapter", "com/showstartfans/activity/activitys/group/GroupManagerNewActivity$adapter$2$1", "getAdapter", "()Lcom/showstartfans/activity/activitys/group/GroupManagerNewActivity$adapter$2$1;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/showstartfans/activity/databinding/ActivityGroupManagerNewBinding;", "groupId", "", "isOwner", "", "addManager", "", TUIConstants.TUILive.USER_ID, "", "initData", "initListener", "initView", "removeManager", "requestData", "setContentViewResByViewBind", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class GroupManagerNewActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final a f5614g = null;
    @NotNull
    public Map<Integer, View> b;
    private boolean c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f5615d;

    /* renamed from: e  reason: collision with root package name */
    private f1 f5616e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f5617f;

    /* compiled from: GroupManagerNewActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/group/GroupManagerNewActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "groupId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
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

    /* compiled from: GroupManagerNewActivity.kt */
    @Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/showstartfans/activity/activitys/group/GroupManagerNewActivity$adapter$2$1", "invoke", "()Lcom/showstartfans/activity/activitys/group/GroupManagerNewActivity$adapter$2$1;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<a> {
        public final /* synthetic */ GroupManagerNewActivity this$0;

        /* compiled from: GroupManagerNewActivity.kt */
        @Metadata(d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J*\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0014¨\u0006\u0018"}, d2 = {"com/showstartfans/activity/activitys/group/GroupManagerNewActivity$adapter$2$1", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "", "bindHolderItem", "", g.C, "", MapController.ITEM_LAYER_TAG, "Lcom/showstartfans/activity/model/AuthorInfo;", "itemBinding", "Lcom/showstartfans/activity/databinding/ItemGroupManagerNewBinding;", "bindHolderTitle", "", "Lcom/showstartfans/activity/databinding/ItemGroupTitleBinding;", "getItemViewType", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends m<Object> {

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ GroupManagerNewActivity f5618n;

            public a(GroupManagerNewActivity groupManagerNewActivity) {
            }

            private final void Q(int i2, AuthorInfo authorInfo, ud udVar) {
            }

            private static final void R(a aVar, GroupManagerNewActivity groupManagerNewActivity, AuthorInfo authorInfo, View view) {
            }

            private static final void S(GroupManagerNewActivity groupManagerNewActivity, AuthorInfo authorInfo, View view) {
            }

            private final void T(String str, be beVar) {
            }

            public static /* synthetic */ void U(a aVar, GroupManagerNewActivity groupManagerNewActivity, AuthorInfo authorInfo, View view) {
            }

            public static /* synthetic */ void V(GroupManagerNewActivity groupManagerNewActivity, AuthorInfo authorInfo, View view) {
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

        public b(GroupManagerNewActivity groupManagerNewActivity) {
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

    /* compiled from: GroupManagerNewActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", TUIConstants.TUILive.USER_ID, "", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ GroupManagerNewActivity this$0;

        public c(GroupManagerNewActivity groupManagerNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Integer num) {
        }
    }

    private static final void A(GroupManagerNewActivity groupManagerNewActivity, n nVar) {
    }

    private final b.a B() {
    }

    private static final void C(GroupManagerNewActivity groupManagerNewActivity, View view) {
    }

    public static /* synthetic */ void D(GroupManagerNewActivity groupManagerNewActivity, n nVar) {
    }

    public static /* synthetic */ void E(GroupManagerNewActivity groupManagerNewActivity, n nVar) {
    }

    public static /* synthetic */ void F(GroupManagerNewActivity groupManagerNewActivity, n nVar) {
    }

    public static /* synthetic */ void G(GroupManagerNewActivity groupManagerNewActivity, View view) {
    }

    private final void H(int i2) {
    }

    private static final void I(GroupManagerNewActivity groupManagerNewActivity, n nVar) {
    }

    private final void J() {
    }

    private static final void K(GroupManagerNewActivity groupManagerNewActivity, n nVar) {
    }

    @JvmStatic
    public static final void M(@NotNull Context context, @NotNull String str) {
    }

    public static final /* synthetic */ void w(GroupManagerNewActivity groupManagerNewActivity, int i2) {
    }

    public static final /* synthetic */ boolean x(GroupManagerNewActivity groupManagerNewActivity) {
    }

    public static final /* synthetic */ void y(GroupManagerNewActivity groupManagerNewActivity, int i2) {
    }

    private final void z(int i2) {
    }

    @NotNull
    public ConstraintLayout L() {
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
    public /* bridge */ /* synthetic */ View setContentViewResByViewBind() {
    }
}
