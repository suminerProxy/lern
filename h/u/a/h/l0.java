package h.u.a.h;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.tencent.imsdk.v2.V2TIMGroupMemberInfoResult;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.GroupMemberInfo;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import h.u.a.g.y8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GroupMemberSelectDialog.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ1\u0010&\u001a\u00020\u001e2'\u0010'\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020*0)¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u001e0(H\u0002J\b\u0010,\u001a\u00020\u001eH\u0002J\u001c\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u00103\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0016H\u0002J\u0010\u00104\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0016H\u0002J\b\u00105\u001a\u00020\u001eH\u0002J\b\u00106\u001a\u00020\u001eH\u0016J\b\u00107\u001a\u00020\u001eH\u0002J,\u00108\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00142\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0)0:H\u0002J\b\u0010<\u001a\u00020\u001eH\u0002J\u0012\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J(\u0010A\u001a\u00020\u001e2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00162\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0016H\u0002R\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000Rb\u0010\u0018\u001aJ\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0016¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0016¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0019j\u0004\u0018\u0001`\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/showstartfans/activity/dialog/GroupMemberSelectDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseBottomSheetDialogFragment;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "groupId", "", "isAdmin", "", "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Z)V", "TAG", "kotlin.jvm.PlatformType", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "binding", "Lcom/showstartfans/activity/databinding/DialogGroupMemberBinding;", "getGroupId", "()Ljava/lang/String;", "()Z", "isSelectFriends", "limit", "", "mMembers", "Ljava/util/ArrayList;", "Lcom/tencent/qcloud/tuikit/tuicontact/bean/GroupMemberInfo;", "onSelectListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "result_ids", "result_names", "", "Lcom/showstartfans/activity/dialog/OnSelectListener;", "getOnSelectListener", "()Lkotlin/jvm/functions/Function2;", "setOnSelectListener", "(Lkotlin/jvm/functions/Function2;)V", "presenter", "Lcom/showstartfans/activity/view/custom_im_ui/presenter/CustomContactPresenter;", "getAdminList", "callback", "Lkotlin/Function1;", "", "Lcom/showstartfans/activity/model/MyContactItemBean;", "datas", "getData", "getDialogView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "getMembersNameCard", "getMembersUserId", "init", "initView", "listener", "loadGroupByFilter", "filter", "Lcom/tencent/qcloud/tuicore/component/interfaces/IUIKitCallback;", "Lcom/tencent/qcloud/tuikit/tuicontact/bean/ContactItemBean;", "loadTencentData", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "setResult", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class l0 extends h.y.a.o.y.a {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public Map<Integer, View> f24266e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final AppCompatActivity f24267f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private final String f24268g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f24269h;

    /* renamed from: i  reason: collision with root package name */
    private final String f24270i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private Function2<? super ArrayList<String>, ? super ArrayList<String>, Unit> f24271j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<GroupMemberInfo> f24272k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private h.u.a.u.y3.s.b f24273l;

    /* renamed from: m  reason: collision with root package name */
    private int f24274m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f24275n;

    /* renamed from: o  reason: collision with root package name */
    private y8 f24276o;

    /* compiled from: GroupMemberSelectDialog.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/dialog/GroupMemberSelectDialog$getAdminList$1", "Lcom/tencent/qcloud/tuicore/component/interfaces/IUIKitCallback;", "", "Lcom/tencent/qcloud/tuikit/tuicontact/bean/ContactItemBean;", "onError", "", "errCode", "", "errMsg", "", "data", "onSuccess", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends IUIKitCallback<List<? extends ContactItemBean>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList<h.u.a.o.t> f24277a;
        public final /* synthetic */ l0 b;
        public final /* synthetic */ Function1<List<? extends h.u.a.o.t>, Unit> c;

        /* compiled from: GroupMemberSelectDialog.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/dialog/GroupMemberSelectDialog$getAdminList$1$onSuccess$1", "Lcom/tencent/qcloud/tuicore/component/interfaces/IUIKitCallback;", "", "Lcom/tencent/qcloud/tuikit/tuicontact/bean/ContactItemBean;", "onError", "", "errCode", "", "errMsg", "", "data", "onSuccess", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: h.u.a.h.l0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class C0359a extends IUIKitCallback<List<? extends ContactItemBean>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ArrayList<h.u.a.o.t> f24278a;
            public final /* synthetic */ Function1<List<? extends h.u.a.o.t>, Unit> b;

            public C0359a(ArrayList<h.u.a.o.t> arrayList, Function1<? super List<? extends h.u.a.o.t>, Unit> function1) {
            }

            public void a(int i2, @Nullable String str, @Nullable List<? extends ContactItemBean> list) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public /* bridge */ /* synthetic */ void onError(int i2, String str, List<? extends ContactItemBean> list) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public /* bridge */ /* synthetic */ void onSuccess(List<? extends ContactItemBean> list) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(@Nullable List<? extends ContactItemBean> list) {
            }
        }

        public a(ArrayList<h.u.a.o.t> arrayList, l0 l0Var, Function1<? super List<? extends h.u.a.o.t>, Unit> function1) {
        }

        public void a(int i2, @Nullable String str, @Nullable List<? extends ContactItemBean> list) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onError(int i2, String str, List<? extends ContactItemBean> list) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<? extends ContactItemBean> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(@Nullable List<? extends ContactItemBean> list) {
        }
    }

    /* compiled from: GroupMemberSelectDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/model/MyContactItemBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<List<? extends h.u.a.o.t>, Unit> {
        public final /* synthetic */ l0 this$0;

        public b(l0 l0Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends h.u.a.o.t> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<? extends h.u.a.o.t> list) {
        }
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", am.aB, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", AnimatedPasterJsonConfig.CONFIG_COUNT, TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements TextWatcher {
        public final /* synthetic */ l0 b;

        public c(l0 l0Var) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: GroupMemberSelectDialog.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/dialog/GroupMemberSelectDialog$loadGroupByFilter$1", "Lcom/tencent/imsdk/v2/V2TIMValueCallback;", "Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfoResult;", "onError", "", "code", "", "desc", "", "onSuccess", "v2TIMGroupMemberInfoResult", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements V2TIMValueCallback<V2TIMGroupMemberInfoResult> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IUIKitCallback<List<ContactItemBean>> f24279a;
        public final /* synthetic */ l0 b;

        public d(IUIKitCallback<List<ContactItemBean>> iUIKitCallback, l0 l0Var) {
        }

        public void a(@NotNull V2TIMGroupMemberInfoResult v2TIMGroupMemberInfoResult) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, @NotNull String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMGroupMemberInfoResult v2TIMGroupMemberInfoResult) {
        }
    }

    public l0(@NotNull AppCompatActivity appCompatActivity, @Nullable String str, boolean z) {
    }

    public static /* synthetic */ void A(l0 l0Var, View view) {
    }

    public static /* synthetic */ void B(l0 l0Var, int i2, ContactItemBean contactItemBean) {
    }

    private final void C() {
    }

    private final void D(String str, int i2, IUIKitCallback<List<ContactItemBean>> iUIKitCallback) {
    }

    private final void E() {
    }

    private final void G(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
    }

    public static final /* synthetic */ y8 h(l0 l0Var) {
    }

    public static final /* synthetic */ String i(l0 l0Var) {
    }

    public static final /* synthetic */ void j(l0 l0Var, String str, int i2, IUIKitCallback iUIKitCallback) {
    }

    public static final /* synthetic */ void k(l0 l0Var) {
    }

    private final void m(Function1<? super List<? extends h.u.a.o.t>, Unit> function1) {
    }

    private final void n() {
    }

    private final ArrayList<String> r() {
    }

    private final ArrayList<String> s() {
    }

    private final void v() {
    }

    private static final void w(l0 l0Var, int i2, ContactItemBean contactItemBean) {
    }

    private static final void x(l0 l0Var, View view) {
    }

    public final void F(@Nullable Function2<? super ArrayList<String>, ? super ArrayList<String>, Unit> function2) {
    }

    @Override // h.y.a.o.y.a
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.o.y.a
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.o.y.a
    @Nullable
    public View f(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
    }

    @Override // h.y.a.o.y.a
    public void initView() {
    }

    @NotNull
    public final AppCompatActivity l() {
    }

    @Override // h.y.a.o.y.a, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
    }

    @Override // h.y.a.o.y.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Nullable
    public final String q() {
    }

    @Nullable
    public final Function2<ArrayList<String>, ArrayList<String>, Unit> u() {
    }

    public final boolean y() {
    }

    public final boolean z() {
    }
}
