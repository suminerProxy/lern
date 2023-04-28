package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.ShareBean;
import com.showstartfans.activity.model.ShareMouldBean;
import com.showstartfans.activity.view.BaseShareMouldView;
import com.taihebase.activity.base.BaseNewActivity;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import h.u.a.g.v4;
import h.u.a.o.u;
import h.u.a.w.z;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareMouldEditActivity.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0014J\b\u0010\u0017\u001a\u00020\fH\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/ShareMouldEditActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "activityId", "", "binding", "Lcom/showstartfans/activity/databinding/ActivityShareMouldEditBinding;", "currentMouldView", "Lcom/showstartfans/activity/view/BaseShareMouldView;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "isEdit", "", "mData", "Lcom/showstartfans/activity/model/ShareMouldBean;", "mType", "changeContent", "", "checkUIMode", "getData", "initData", "initListener", "initView", "needTopToolbar", "onBackPressed", "setContentViewResByViewBind", "Landroid/view/View;", "setEditMode", "edit", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ShareMouldEditActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public static final a f5858j = null;
    @NotNull
    public Map<Integer, View> b;
    private v4 c;

    /* renamed from: d  reason: collision with root package name */
    private int f5859d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private String f5860e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private BaseShareMouldView f5861f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private ShareMouldBean f5862g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5863h;

    /* renamed from: i  reason: collision with root package name */
    private int f5864i;

    /* compiled from: ShareMouldEditActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/ShareMouldEditActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "type", "", "activityId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@Nullable Context context, int i2, @Nullable String str) {
        }
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", am.aB, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", AnimatedPasterJsonConfig.CONFIG_COUNT, TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements TextWatcher {
        public final /* synthetic */ ShareMouldEditActivity b;

        public b(ShareMouldEditActivity shareMouldEditActivity) {
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

    /* compiled from: ShareMouldEditActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/ShareBean;", "invoke", "(Lcom/showstartfans/activity/model/ShareBean;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<ShareBean, Boolean> {
        public final /* synthetic */ ShareMouldEditActivity this$0;

        /* compiled from: ShareMouldEditActivity.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/maintab/ShareMouldEditActivity$initListener$2$1", "Lcom/showstartfans/activity/widget/ShareUtil$OnShareStatusListentr;", "onCancel", "", "onFail", "onSuccess", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a implements z.b {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ShareMouldEditActivity f5865a;

            public a(ShareMouldEditActivity shareMouldEditActivity) {
            }

            @Override // h.u.a.w.z.b
            public void onCancel() {
            }

            @Override // h.u.a.w.z.b
            public void onFail() {
            }

            @Override // h.u.a.w.z.b
            public void onSuccess() {
            }
        }

        public c(ShareMouldEditActivity shareMouldEditActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(ShareBean shareBean) {
        }

        @NotNull
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(@Nullable ShareBean shareBean) {
        }
    }

    /* compiled from: ShareMouldEditActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/NewShareBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function1<u, Unit> {
        public final /* synthetic */ ShareMouldEditActivity this$0;

        public d(ShareMouldEditActivity shareMouldEditActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable u uVar) {
        }
    }

    /* compiled from: ShareMouldEditActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/widget/FrameLayout;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<FrameLayout, Unit> {
        public final /* synthetic */ ShareMouldEditActivity this$0;

        public e(ShareMouldEditActivity shareMouldEditActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FrameLayout frameLayout) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull FrameLayout frameLayout) {
        }
    }

    private final void A() {
    }

    private static final void B(ShareMouldEditActivity shareMouldEditActivity, n nVar) {
    }

    private static final void C(ShareMouldEditActivity shareMouldEditActivity, View view) {
    }

    private static final void D(ShareMouldEditActivity shareMouldEditActivity, View view) {
    }

    private static final void E(ShareMouldEditActivity shareMouldEditActivity, View view) {
    }

    public static /* synthetic */ void F(ShareMouldEditActivity shareMouldEditActivity, View view) {
    }

    public static /* synthetic */ void G(ShareMouldEditActivity shareMouldEditActivity, View view) {
    }

    public static /* synthetic */ void H(ShareMouldEditActivity shareMouldEditActivity, n nVar) {
    }

    public static /* synthetic */ void I(ShareMouldEditActivity shareMouldEditActivity, View view) {
    }

    private final void J(boolean z) {
    }

    public static final /* synthetic */ v4 w(ShareMouldEditActivity shareMouldEditActivity) {
    }

    public static final /* synthetic */ BaseShareMouldView x(ShareMouldEditActivity shareMouldEditActivity) {
    }

    private final void y() {
    }

    private final void z() {
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
