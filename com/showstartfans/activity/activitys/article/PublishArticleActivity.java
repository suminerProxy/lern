package com.showstartfans.activity.activitys.article;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.activitys.photo.PhotoVideoBrowingActivity;
import com.showstartfans.activity.model.PublishArticleBean;
import com.showstartfans.activity.model.UserInfoBean;
import com.showstartfans.activity.view.videocut.VideoConverSelectView;
import com.taihe.photoselector.model.PhotoModel;
import com.taihebase.activity.base.BaseNewActivity;
import com.tencent.android.tpush.common.MessageKey;
import h.u.a.c.w.u1;
import h.u.a.g.w3;
import h.u.a.w.c0.m2;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PublishArticleActivity.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0014J\u0010\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\bJ\b\u0010!\u001a\u00020\u0019H\u0015J\b\u0010\"\u001a\u00020\u0019H\u0014J\b\u0010#\u001a\u00020$H\u0016J\"\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\u0019H\u0002J\u0012\u0010+\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010-\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020\u0019H\u0014J\b\u00101\u001a\u00020\u0019H\u0014J\u0010\u00102\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/H\u0014J\u0010\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020/H\u0014J\b\u00105\u001a\u00020\u0019H\u0002J\b\u00106\u001a\u000207H\u0014J\u0010\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u0006H\u0002J\u0010\u0010:\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/showstartfans/activity/activitys/article/PublishArticleActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "binding", "Lcom/showstartfans/activity/databinding/ActivityPublishArticleBinding;", "finishMode", "", "mData", "Lcom/showstartfans/activity/model/PublishArticleBean;", "mMode", "maxVideoTime", "photoAdapter", "Lcom/showstartfans/activity/activitys/article/PublishArticlePhotoAdapter;", "requestCode_SelectPhoto", "showType", "tagAdapter", "Lcom/showstartfans/activity/adapter/TageAdapter;", "targetId", "", "videoConverSelectView", "Lcom/showstartfans/activity/view/videocut/VideoConverSelectView;", "videoConvertPath", "videoData", "Lcom/taihe/photoselector/model/PhotoModel;", "checkCanPublish", "", "checkNormalConver", "model", "checkOnlyMe", "checkVideoModeUI", "finish", "initData", "data", "initListener", "initView", "needTopToolbar", "", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "onBackPressed", "onClickDeleteVide", "onConverChange", "newConverPath", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onRestoreInstanceState", "onSaveInstanceState", "outState", "publishArticle", "setContentViewResByViewBind", "Landroid/view/View;", "setMode", h.c.a.a.a.f16081l, "setShowType", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PublishArticleActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public static final a f5292p = null;
    private static final int q = 0;
    private static final int r = 0;
    @NotNull
    private static final String s = null;
    @NotNull
    public Map<Integer, View> b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private int f5293d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5294e;

    /* renamed from: f  reason: collision with root package name */
    private w3 f5295f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private u1 f5296g;

    /* renamed from: h  reason: collision with root package name */
    private h.u.a.d.u1 f5297h;

    /* renamed from: i  reason: collision with root package name */
    private int f5298i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private PhotoModel f5299j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private String f5300k;

    /* renamed from: l  reason: collision with root package name */
    private int f5301l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    private String f5302m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private PublishArticleBean f5303n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private VideoConverSelectView f5304o;

    /* compiled from: PublishArticleActivity.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/showstartfans/activity/activitys/article/PublishArticleActivity$Companion;", "", "()V", "FINISH_MODE_CLICK_EXIT", "", "getFINISH_MODE_CLICK_EXIT", "()I", "FINISH_MODE_CLICK_PUBLISH", "getFINISH_MODE_CLICK_PUBLISH", "KEY_FINISH_MODE", "", "getKEY_FINISH_MODE", "()Ljava/lang/String;", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "act", "Landroid/app/Activity;", "targetId", MessageKey.MSG_TARGET_TYPE, Constant.LOGIN_ACTIVITY_REQUEST_CODE, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {

        /* compiled from: PublishArticleActivity.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/showstartfans/activity/activitys/article/PublishArticleActivity$Companion$open$1", "Lcom/showstartfans/activity/widget/dialog/OnRealNameTwoPointCall;", "onRealNameTwoPoint", "", "onRealNameTwoPointFail", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.showstartfans.activity.activitys.article.PublishArticleActivity$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class C0130a implements m2 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f5305a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ int f5306d;

            public C0130a(Activity activity, String str, String str2, int i2) {
            }

            @Override // h.u.a.w.c0.m2
            public void a() {
            }

            @Override // h.u.a.w.c0.m2
            public void b() {
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ void d(BaseNewActivity baseNewActivity, Activity activity, String str, int i2, n nVar) {
        }

        private static final void f(BaseNewActivity baseNewActivity, Activity activity, String str, int i2, n nVar) {
        }

        public final int a() {
        }

        public final int b() {
        }

        @NotNull
        public final String c() {
        }

        public final void e(@NotNull Activity activity, @Nullable String str, @Nullable String str2, int i2) {
        }
    }

    /* compiled from: PublishArticleActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ PublishArticleActivity this$0;

        public b(PublishArticleActivity publishArticleActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable String str) {
        }
    }

    /* compiled from: PublishArticleActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ PublishArticleActivity this$0;

        public c(PublishArticleActivity publishArticleActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: PublishArticleActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/UserInfoBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class d extends Lambda implements Function1<UserInfoBean, Unit> {
        public final /* synthetic */ PublishArticleActivity this$0;

        public d(PublishArticleActivity publishArticleActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserInfoBean userInfoBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable UserInfoBean userInfoBean) {
        }
    }

    /* compiled from: PublishArticleActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/article/PublishArticleActivity$initListener$6$1", "Lcom/showstartfans/activity/activitys/photo/PhotoVideoBrowingActivity$OnDataEditListener;", "onClickDelete", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class e implements PhotoVideoBrowingActivity.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PublishArticleActivity f5307a;

        public e(PublishArticleActivity publishArticleActivity) {
        }

        @Override // com.showstartfans.activity.activitys.photo.PhotoVideoBrowingActivity.c
        public void a(int i2) {
        }
    }

    /* compiled from: PublishArticleActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007J\u0013\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/article/PublishArticleActivity$initListener$8$1", "Lkotlin/Function1;", "Lcom/taihe/photoselector/model/PhotoModel;", "Lkotlin/ParameterName;", "name", "model", "", "Lcom/showstartfans/activity/activitys/article/CallBack;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class f implements Function1<PhotoModel, Unit> {
        public final /* synthetic */ PublishArticleActivity b;

        public f(PublishArticleActivity publishArticleActivity) {
        }

        public void a(@Nullable PhotoModel photoModel) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PhotoModel photoModel) {
        }
    }

    /* compiled from: PublishArticleActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class g extends Lambda implements Function0<Unit> {
        public final /* synthetic */ PublishArticleActivity this$0;

        /* compiled from: PublishArticleActivity.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/UserInfoBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class a extends Lambda implements Function1<UserInfoBean, Unit> {
            public final /* synthetic */ PublishArticleActivity this$0;

            public a(PublishArticleActivity publishArticleActivity) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UserInfoBean userInfoBean) {
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable UserInfoBean userInfoBean) {
            }
        }

        public g(PublishArticleActivity publishArticleActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: PublishArticleActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007J\u0013\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/article/PublishArticleActivity$onActivityResult$1", "Lkotlin/Function1;", "Lcom/taihe/photoselector/model/PhotoModel;", "Lkotlin/ParameterName;", "name", "model", "", "Lcom/showstartfans/activity/activitys/article/CallBack;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class h implements Function1<PhotoModel, Unit> {
        public final /* synthetic */ PublishArticleActivity b;

        public h(PublishArticleActivity publishArticleActivity) {
        }

        public void a(@Nullable PhotoModel photoModel) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PhotoModel photoModel) {
        }
    }

    /* compiled from: PublishArticleActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class i extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ PublishArticleActivity this$0;

        public i(PublishArticleActivity publishArticleActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    public static final /* synthetic */ int A() {
    }

    public static final /* synthetic */ String B() {
    }

    public static final /* synthetic */ void C(PublishArticleActivity publishArticleActivity) {
    }

    public static final /* synthetic */ void D(PublishArticleActivity publishArticleActivity, String str) {
    }

    private final void E() {
    }

    private final void F(PhotoModel photoModel) {
    }

    private final void G() {
    }

    private final void H() {
    }

    private static final void J(PublishArticleActivity publishArticleActivity, View view) {
    }

    private static final void K(PublishArticleActivity publishArticleActivity, View view) {
    }

    private static final void L(PublishArticleActivity publishArticleActivity, View view) {
    }

    private static final void M(PublishArticleActivity publishArticleActivity, View view) {
    }

    private static final void N(PublishArticleActivity publishArticleActivity, Boolean bool) {
    }

    private static final void O(PublishArticleActivity publishArticleActivity, View view) {
    }

    private static final void P(PublishArticleActivity publishArticleActivity, View view) {
    }

    private static final void Q(PublishArticleActivity publishArticleActivity, View view) {
    }

    private static final void R(PublishArticleActivity publishArticleActivity, View view) {
    }

    private static final void S(PublishArticleActivity publishArticleActivity, View view) {
    }

    private static final void T(PublishArticleActivity publishArticleActivity, View view) {
    }

    private static final void U(PublishArticleActivity publishArticleActivity, View view) {
    }

    public static /* synthetic */ void V(PublishArticleActivity publishArticleActivity, View view) {
    }

    public static /* synthetic */ void W(PublishArticleActivity publishArticleActivity, View view) {
    }

    public static /* synthetic */ void X(PublishArticleActivity publishArticleActivity, View view) {
    }

    public static /* synthetic */ void Y(PublishArticleActivity publishArticleActivity, View view) {
    }

    public static /* synthetic */ void Z(PublishArticleActivity publishArticleActivity, View view) {
    }

    public static /* synthetic */ void a0(PublishArticleActivity publishArticleActivity, View view) {
    }

    public static /* synthetic */ void b0(PublishArticleActivity publishArticleActivity, View view) {
    }

    public static /* synthetic */ void c0(PublishArticleActivity publishArticleActivity, View view) {
    }

    public static /* synthetic */ void d0(PublishArticleActivity publishArticleActivity, View view) {
    }

    public static /* synthetic */ void e0(PublishArticleActivity publishArticleActivity, Boolean bool) {
    }

    public static /* synthetic */ void f0(PublishArticleActivity publishArticleActivity, View view) {
    }

    public static /* synthetic */ void g0(PublishArticleActivity publishArticleActivity, View view) {
    }

    public static /* synthetic */ void h0(PublishArticleActivity publishArticleActivity, View view) {
    }

    private static final void i0(PublishArticleActivity publishArticleActivity, View view) {
    }

    private final void j0() {
    }

    private final void k0(String str) {
    }

    private final void l0() {
    }

    private final void m0(int i2) {
    }

    private final void n0(int i2) {
    }

    public static final /* synthetic */ void w(PublishArticleActivity publishArticleActivity) {
    }

    public static final /* synthetic */ void x(PublishArticleActivity publishArticleActivity, PhotoModel photoModel) {
    }

    public static final /* synthetic */ w3 y(PublishArticleActivity publishArticleActivity) {
    }

    public static final /* synthetic */ int z() {
    }

    public final void I(@Nullable PublishArticleBean publishArticleBean) {
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
    @SuppressLint({"CheckResult"})
    public void initListener() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public boolean needTopToolbar() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, com.tbruyelle.rxpermissions.BaseFixOTranslucentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NotNull Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle bundle) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
