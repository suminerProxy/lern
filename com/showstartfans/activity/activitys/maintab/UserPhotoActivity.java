package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import cn.sharesdk.framework.InnerShareParams;
import com.alipay.sdk.util.l;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.eventmodel.ConverChangeEvent;
import com.showstartfans.activity.eventmodel.DeleteConverEvent;
import com.showstartfans.activity.view.UserHeaderView;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihe.photoselector.model.PhotoModel;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import h.u.a.c.f0.n9;
import h.u.a.c.t;
import h.u.a.g.q3;
import h.u.a.t.b2;
import h.y.a.m.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UserPhotoActivity.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 I2\u00020\u0001:\u0001IB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\nH\u0002J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\nH\u0002J3\u0010#\u001a\u00020\u001b2)\u0010$\u001a%\u0012\u0013\u0012\u00110&¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u001b\u0018\u00010%j\u0004\u0018\u0001`*H\u0002J\b\u0010+\u001a\u00020\u001bH\u0014J\u0012\u0010,\u001a\u00020\u001b2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\b\u0010/\u001a\u00020\u001bH\u0014J\b\u00100\u001a\u00020\u001bH\u0014J\b\u00101\u001a\u00020&H\u0002J\"\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000106H\u0014J\u0012\u00107\u001a\u00020\u001b2\b\u00108\u001a\u0004\u0018\u000109H\u0007J\u0012\u00107\u001a\u00020\u001b2\b\u00108\u001a\u0004\u0018\u00010:H\u0007J\b\u0010;\u001a\u00020.H\u0014J\u0012\u0010<\u001a\u00020\u001b2\b\u0010=\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010>\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\nH\u0002J.\u0010@\u001a\u00020\u001b2\b\u0010A\u001a\u0004\u0018\u00010\u00042\b\u0010B\u001a\u0004\u0018\u00010\u00042\u0006\u0010C\u001a\u00020\n2\b\u0010D\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010E\u001a\u00020\u001b2\b\u0010F\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010G\u001a\u00020\u001b2\b\u0010H\u001a\u0004\u0018\u00010\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/UserPhotoActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "UserId", "", "adapter", "Lcom/showstartfans/activity/activitys/maintab/UserPhotoItemAdapter;", "binding", "Lcom/showstartfans/activity/databinding/ActivityPhotoUserBinding;", "changeConver_requestCode", "", "converPicture", "mPage", "mTopImage", "Lcom/facebook/drawee/view/SimpleDraweeView;", "photoCount", "spacing", "getSpacing", "()I", "spacing$delegate", "Lkotlin/Lazy;", "tv_fans_name", "Landroid/widget/TextView;", "tv_fans_photo_num", "uhv_user_header", "Lcom/showstartfans/activity/view/UserHeaderView;", "checkLocalImage", "", "datas", "", "Lcom/taihe/photoselector/model/PhotoModel;", "finish", "getData", "page", "getListData", "getUserHomePagerInfo", "call", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isSuccess", "Lcom/showstartfans/activity/activitys/maintab/CallBack;", "initData", "initHeader", "headerView", "Landroid/view/View;", "initListener", "initView", "isMe", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "data", "Landroid/content/Intent;", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/ConverChangeEvent;", "Lcom/showstartfans/activity/eventmodel/DeleteConverEvent;", "setContentViewResByViewBind", "setConverImage", InnerShareParams.IMAGE_URL, "setPohotoNum", AnimatedPasterJsonConfig.CONFIG_COUNT, "updateUserBg", "mediaId", "path", "isCover", "originImage", "uploadImage", "images", "uploadUserConvert", "photoBean", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class UserPhotoActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final a f5882o = null;
    @NotNull
    public Map<Integer, View> b;
    private final int c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f5883d;

    /* renamed from: e  reason: collision with root package name */
    private q3 f5884e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private n9 f5885f;

    /* renamed from: g  reason: collision with root package name */
    private int f5886g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private String f5887h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private UserHeaderView f5888i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private TextView f5889j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private TextView f5890k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private SimpleDraweeView f5891l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private String f5892m;

    /* renamed from: n  reason: collision with root package name */
    private int f5893n;

    /* compiled from: UserPhotoActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/UserPhotoActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "UserId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@Nullable Context context, @Nullable String str) {
        }
    }

    /* compiled from: UserPhotoActivity.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001d\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/maintab/UserPhotoActivity$checkLocalImage$1", "Lcom/showstartfans/activity/utils/FileUtils$OnImageListener;", "onError", "", "throwable", "", "onSuccess", "paths", "", "", "([Ljava/lang/String;)V", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements b2.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UserPhotoActivity f5894a;

        /* compiled from: UserPhotoActivity.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/maintab/UserPhotoActivity$checkLocalImage$1$onSuccess$1", "Lcom/showstartfans/activity/activitys/UploadFileHelper$OnUploadImageMoreListener;", "onFail", "", l.c, "Lcom/taihebase/activity/network/Result;", "onProgress", "progress", "", "onSuccess", "value", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a implements t.c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String[] f5895a;
            public final /* synthetic */ UserPhotoActivity b;

            public a(String[] strArr, UserPhotoActivity userPhotoActivity) {
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

        public b(UserPhotoActivity userPhotoActivity) {
        }

        @Override // h.u.a.t.b2.b
        public void a(@Nullable String[] strArr) {
        }

        @Override // h.u.a.t.b2.b
        public void onError(@Nullable Throwable th) {
        }
    }

    /* compiled from: UserPhotoActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ int $page;
        public final /* synthetic */ UserPhotoActivity this$0;

        public c(UserPhotoActivity userPhotoActivity, int i2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: UserPhotoActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/UserPhotoActivity$initListener$1", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UserPhotoActivity f5896a;

        public d(UserPhotoActivity userPhotoActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* compiled from: UserPhotoActivity.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/showstartfans/activity/activitys/maintab/UserPhotoActivity$initView$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", h.a.a.a.a.i.g.C, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends GridLayoutManager.SpanSizeLookup {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GridLayoutManager f5897a;
        public final /* synthetic */ UserPhotoActivity b;

        public e(GridLayoutManager gridLayoutManager, UserPhotoActivity userPhotoActivity) {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i2) {
        }
    }

    /* compiled from: UserPhotoActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function0<Integer> {
        public final /* synthetic */ UserPhotoActivity this$0;

        public f(UserPhotoActivity userPhotoActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
        }
    }

    /* compiled from: UserPhotoActivity.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001d\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/maintab/UserPhotoActivity$uploadUserConvert$1", "Lcom/showstartfans/activity/utils/FileUtils$OnImageListener;", "onError", "", "throwable", "", "onSuccess", "paths", "", "", "([Ljava/lang/String;)V", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g implements b2.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UserPhotoActivity f5898a;
        public final /* synthetic */ String b;

        /* compiled from: UserPhotoActivity.kt */
        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002O\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001j\u0002`\u000bJ%\u0010\f\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¨\u0006\r"}, d2 = {"com/showstartfans/activity/activitys/maintab/UserPhotoActivity$uploadUserConvert$1$onSuccess$1", "Lkotlin/Function3;", "Lcom/taihebase/activity/network/Result;", "Lkotlin/ParameterName;", "name", l.c, "", "isSuccess", "", "value", "", "Lcom/showstartfans/activity/activitys/upLoadImageCallBack;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a implements Function3<n, Boolean, String, Unit> {
            public final /* synthetic */ String[] b;
            public final /* synthetic */ UserPhotoActivity c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ String f5899d;

            public a(String[] strArr, UserPhotoActivity userPhotoActivity, String str) {
            }

            public void a(@Nullable n nVar, boolean z, @Nullable String str) {
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(n nVar, Boolean bool, String str) {
            }
        }

        public g(UserPhotoActivity userPhotoActivity, String str) {
        }

        @Override // h.u.a.t.b2.b
        public void a(@Nullable String[] strArr) {
        }

        @Override // h.u.a.t.b2.b
        public void onError(@Nullable Throwable th) {
        }
    }

    public static final /* synthetic */ int A(UserPhotoActivity userPhotoActivity) {
    }

    public static final /* synthetic */ void B(UserPhotoActivity userPhotoActivity, String str, String str2, int i2, String str3) {
    }

    public static final /* synthetic */ void C(UserPhotoActivity userPhotoActivity, String str) {
    }

    private final void D(List<? extends PhotoModel> list) {
    }

    private final void E(int i2) {
    }

    private final void F(int i2) {
    }

    private static final void G(UserPhotoActivity userPhotoActivity, int i2, n nVar) {
    }

    private final void I(Function1<? super Boolean, Unit> function1) {
    }

    private static final void J(UserPhotoActivity userPhotoActivity, Function1 function1, n nVar) {
    }

    private final void K(View view) {
    }

    private static final void L(UserPhotoActivity userPhotoActivity, View view) {
    }

    private static final void M(UserPhotoActivity userPhotoActivity, ArrayList arrayList) {
    }

    private final boolean N() {
    }

    public static /* synthetic */ void O(UserPhotoActivity userPhotoActivity, Function1 function1, n nVar) {
    }

    public static /* synthetic */ void P(UserPhotoActivity userPhotoActivity, String str, n nVar) {
    }

    public static /* synthetic */ void Q(UserPhotoActivity userPhotoActivity, ArrayList arrayList) {
    }

    public static /* synthetic */ void R(UserPhotoActivity userPhotoActivity, View view) {
    }

    public static /* synthetic */ void S(UserPhotoActivity userPhotoActivity, int i2, n nVar) {
    }

    public static /* synthetic */ void T(UserPhotoActivity userPhotoActivity, List list, Boolean bool) {
    }

    public static /* synthetic */ void U(UserPhotoActivity userPhotoActivity, n nVar, String str, Object obj) {
    }

    public static /* synthetic */ void V(UserPhotoActivity userPhotoActivity, n nVar) {
    }

    public static /* synthetic */ void W(UserPhotoActivity userPhotoActivity, List list, View view) {
    }

    private static final void X(UserPhotoActivity userPhotoActivity, List list, View view) {
    }

    private static final void Y(UserPhotoActivity userPhotoActivity, List list, Boolean bool) {
    }

    private final void Z(String str) {
    }

    private final void a0(int i2) {
    }

    private final void b0(String str, String str2, int i2, String str3) {
    }

    private static final void c0(UserPhotoActivity userPhotoActivity, String str, n nVar) {
    }

    private static final void d0(UserPhotoActivity userPhotoActivity, n nVar, String str, Object obj) {
    }

    private final void e0(String str) {
    }

    private static final void f0(UserPhotoActivity userPhotoActivity, n nVar) {
    }

    private final void g0(PhotoModel photoModel) {
    }

    public static final /* synthetic */ n9 w(UserPhotoActivity userPhotoActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity x(UserPhotoActivity userPhotoActivity) {
    }

    public static final /* synthetic */ void y(UserPhotoActivity userPhotoActivity, int i2) {
    }

    public static final /* synthetic */ void z(UserPhotoActivity userPhotoActivity, int i2) {
    }

    public final int H() {
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable ConverChangeEvent converChangeEvent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable DeleteConverEvent deleteConverEvent) {
    }
}
