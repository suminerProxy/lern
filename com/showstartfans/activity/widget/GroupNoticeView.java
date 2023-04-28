package com.showstartfans.activity.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alipay.sdk.util.l;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.model.GroupNoticeBean;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import h.u.a.c.t;
import h.u.a.g.yd;
import h.u.a.t.b2;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GroupNoticeView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000eJ\b\u0010\u0019\u001a\u00020\u0012H\u0002J\u001a\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\fJ\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/showstartfans/activity/widget/GroupNoticeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/showstartfans/activity/databinding/ItemGroupNoticeBinding;", "groupNotice", "Lcom/showstartfans/activity/model/GroupNoticeBean;", "isEdit", "", "lastGroupContent", "", "lastGroupPhoto", "localImage", "checkLocalImageAndUpload", "", "commit", "confirm", "measureImage", "path", "setData", "setDataImage", "updateConfirm", "updateStyle", Constant.LOGIN_ACTIVITY_DIAGLOG, "isManager", "uploadImage", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class GroupNoticeView extends ConstraintLayout {
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    public static final a f7401i = null;

    /* renamed from: j  reason: collision with root package name */
    public static final int f7402j = 100;
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private yd c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f7403d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7404e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private String f7405f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private String f7406g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private GroupNoticeBean f7407h;

    /* compiled from: GroupNoticeView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/showstartfans/activity/widget/GroupNoticeView$Companion;", "", "()V", "REQUEST_CODE", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: GroupNoticeView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/taihebase/activity/network/Result;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<n, Unit> {
        public final /* synthetic */ GroupNoticeView this$0;

        public b(GroupNoticeView groupNoticeView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(n nVar) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull n nVar) {
        }
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", am.aB, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", AnimatedPasterJsonConfig.CONFIG_COUNT, TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements TextWatcher {
        public final /* synthetic */ GroupNoticeView b;
        public final /* synthetic */ Context c;

        public c(GroupNoticeView groupNoticeView, Context context) {
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

    /* compiled from: GroupNoticeView.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001d\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/widget/GroupNoticeView$uploadImage$1", "Lcom/showstartfans/activity/utils/FileUtils$OnImageListener;", "onError", "", "throwable", "", "onSuccess", "paths", "", "", "([Ljava/lang/String;)V", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements b2.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GroupNoticeView f7408a;

        /* compiled from: GroupNoticeView.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/widget/GroupNoticeView$uploadImage$1$onSuccess$1", "Lcom/showstartfans/activity/activitys/UploadFileHelper$OnUploadImageMoreListener;", "onFail", "", l.c, "Lcom/taihebase/activity/network/Result;", "onProgress", "progress", "", "onSuccess", "value", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a implements t.c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ GroupNoticeView f7409a;
            public final /* synthetic */ String[] b;

            public a(GroupNoticeView groupNoticeView, String[] strArr) {
            }

            @Override // h.u.a.c.t.c
            public void a(@Nullable n nVar) {
            }

            @Override // h.u.a.c.t.c
            public void onProgress(int i2) {
            }

            @Override // h.u.a.c.t.c
            public void onSuccess(@Nullable String str) {
            }
        }

        public d(GroupNoticeView groupNoticeView) {
        }

        @Override // h.u.a.t.b2.b
        public void a(@Nullable String[] strArr) {
        }

        @Override // h.u.a.t.b2.b
        public void onError(@Nullable Throwable th) {
        }
    }

    @JvmOverloads
    public GroupNoticeView(@NotNull Context context) {
    }

    public /* synthetic */ GroupNoticeView(Context context, AttributeSet attributeSet, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static /* synthetic */ void A(GroupNoticeView groupNoticeView, float f2) {
    }

    public static /* synthetic */ void B(Context context, View view) {
    }

    private final void C(String str) {
    }

    private static final void D(GroupNoticeView groupNoticeView, float f2) {
    }

    private final void E() {
    }

    public static /* synthetic */ void G(GroupNoticeView groupNoticeView, boolean z, boolean z2, int i2, Object obj) {
    }

    private final void H(String str) {
    }

    private static final void c(GroupNoticeView groupNoticeView, Context context, View view) {
    }

    private static final void d(GroupNoticeView groupNoticeView, Context context, View view) {
    }

    private static final void e(Context context, View view) {
    }

    private static final void f(Context context, View view) {
    }

    private static final void g(GroupNoticeView groupNoticeView, Context context, View view) {
    }

    private static final void h(GroupNoticeView groupNoticeView, View view) {
    }

    public static final /* synthetic */ void i(GroupNoticeView groupNoticeView) {
    }

    public static final /* synthetic */ yd j(GroupNoticeView groupNoticeView) {
    }

    public static final /* synthetic */ GroupNoticeBean k(GroupNoticeView groupNoticeView) {
    }

    public static final /* synthetic */ String l(GroupNoticeView groupNoticeView) {
    }

    public static final /* synthetic */ String m(GroupNoticeView groupNoticeView) {
    }

    public static final /* synthetic */ String n(GroupNoticeView groupNoticeView) {
    }

    public static final /* synthetic */ boolean o(GroupNoticeView groupNoticeView) {
    }

    public static final /* synthetic */ void p(GroupNoticeView groupNoticeView) {
    }

    private final void q() {
    }

    private final void r() {
    }

    private static final void s(GroupNoticeView groupNoticeView, n nVar) {
    }

    private final void t() {
    }

    public static /* synthetic */ void u(Context context, View view) {
    }

    public static /* synthetic */ void v(GroupNoticeView groupNoticeView, Context context, View view) {
    }

    public static /* synthetic */ void w(GroupNoticeView groupNoticeView, Context context, View view) {
    }

    public static /* synthetic */ void x(GroupNoticeView groupNoticeView, View view) {
    }

    public static /* synthetic */ void y(GroupNoticeView groupNoticeView, n nVar) {
    }

    public static /* synthetic */ void z(GroupNoticeView groupNoticeView, Context context, View view) {
    }

    public final void F(boolean z, boolean z2) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void setData(@NotNull GroupNoticeBean groupNoticeBean) {
    }

    public final void setDataImage(@NotNull String str) {
    }

    @JvmOverloads
    public GroupNoticeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
