package com.showstartfans.activity.activitys.usercenter;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.activitys.message.CommentDetailActivity;
import com.showstartfans.activity.model.PSSTagBean;
import com.showstartfans.activity.model.PSSTagRequestBean;
import com.showstartfans.activity.model.SSTagBean;
import com.showstartfans.activity.model.UserHomePagerInfoBean;
import com.taihebase.activity.base.BaseNewActivity;
import h.u.a.c.n0.o9.x;
import h.u.a.g.p0;
import h.y.a.m.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EditUserTagActivity.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J \u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0014J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\u0018\u0010\u001b\u001a\u00020\u00132\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/EditUserTagActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/usercenter/adapter/EditUserTagAdapter;", "binding", "Lcom/showstartfans/activity/databinding/ActivityEditUserTagBinding;", "infoBean", "Lcom/showstartfans/activity/model/UserHomePagerInfoBean;", "isCanSave", "", "labsList", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/model/SSTagBean;", "Lkotlin/collections/ArrayList;", "type", "", "checkLabsIsChange", "finishToJump", "", "getLabels", "", "Lcom/showstartfans/activity/model/PSSTagRequestBean;", "Lcom/showstartfans/activity/model/PSSTagBean;", "initData", "initListener", "initView", "saveUserTag", "styleList", "setCanSave", "setContentViewResByViewBind", "Landroid/view/View;", "showLabsChangeDialog", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class EditUserTagActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    public static final a f6326i = null;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public static final String f6327j = "data";
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public static final String f6328k = "type";
    @NotNull
    public Map<Integer, View> b;
    private p0 c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private x f6329d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<SSTagBean> f6330e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private UserHomePagerInfoBean f6331f;

    /* renamed from: g  reason: collision with root package name */
    private int f6332g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6333h;

    /* compiled from: EditUserTagActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/EditUserTagActivity$Companion;", "", "()V", "DATA_KEY", "", CommentDetailActivity.w, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: EditUserTagActivity.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/usercenter/EditUserTagActivity$initView$1", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends RecyclerView.ItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EditUserTagActivity f6334a;

        public b(EditUserTagActivity editUserTagActivity) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        }
    }

    private static final void A(EditUserTagActivity editUserTagActivity, n nVar) {
    }

    private static final void B(EditUserTagActivity editUserTagActivity, View view) {
    }

    private static final void C(EditUserTagActivity editUserTagActivity, View view) {
    }

    private static final void D(EditUserTagActivity editUserTagActivity, View view) {
    }

    public static /* synthetic */ void E(EditUserTagActivity editUserTagActivity, View view) {
    }

    public static /* synthetic */ void F(EditUserTagActivity editUserTagActivity, n nVar) {
    }

    public static /* synthetic */ void G(EditUserTagActivity editUserTagActivity, View view) {
    }

    public static /* synthetic */ void H(EditUserTagActivity editUserTagActivity, View view) {
    }

    public static /* synthetic */ void I(EditUserTagActivity editUserTagActivity, View view) {
    }

    public static /* synthetic */ void J(EditUserTagActivity editUserTagActivity, n nVar) {
    }

    private final void K(List<? extends PSSTagRequestBean> list) {
    }

    private static final void L(EditUserTagActivity editUserTagActivity, n nVar) {
    }

    private final void N() {
    }

    private static final void O(EditUserTagActivity editUserTagActivity, View view) {
    }

    private final boolean w() {
    }

    private final void x() {
    }

    private final List<PSSTagRequestBean> y(List<? extends PSSTagBean> list) {
    }

    private final void z() {
    }

    public final void M(boolean z) {
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
