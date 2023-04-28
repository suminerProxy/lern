package com.showstartfans.activity.activitys.photo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.model.PSSTagRequestBean;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import com.tencent.cloud.huiyansdkface.facelight.api.WbCloudFaceContant;
import h.u.a.g.s;
import h.y.a.m.n;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UserHeadeBrowingActivity.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J?\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112+\u0010\u0012\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0013j\u0004\u0018\u0001`\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0014J\b\u0010\u001a\u001a\u00020\u000fH\u0014J\b\u0010\u001b\u001a\u00020\u000fH\u0014J\"\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020$H\u0014JR\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00042\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u00100\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u00062"}, d2 = {"Lcom/showstartfans/activity/activitys/photo/UserHeadeBrowingActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "()V", "REQUESTCODE_PICTURE", "", "avatar", "", "binding", "Lcom/showstartfans/activity/databinding/ActivityBrowingUserHeadBinding;", "screenHeight", "getScreenHeight", "()I", "screenHeight$delegate", "Lkotlin/Lazy;", "gotToClip", "", "file", "Ljava/io/File;", "callback", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "outUri", "Lcom/showstartfans/activity/activitys/profile/OnClipCallBack;", "initData", "initListener", "initView", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "data", "Landroid/content/Intent;", "setContentViewResByViewBind", "Landroid/view/View;", "setStatusBarTextWhite", "", "updateUserInfoMsg", "nickName", WbCloudFaceContant.SIGN, "birthday", "", "sex", "styleList", "", "Lcom/showstartfans/activity/model/PSSTagRequestBean;", "cityCode", "homeBg", "uploadImage", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class UserHeadeBrowingActivity extends BaseNoToolBarActivity {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final a f6149g = null;
    @NotNull
    public Map<Integer, View> b;
    private final int c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f6150d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private String f6151e;

    /* renamed from: f  reason: collision with root package name */
    private s f6152f;

    /* compiled from: UserHeadeBrowingActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/photo/UserHeadeBrowingActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "avatar", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@Nullable Context context, @Nullable String str) {
        }
    }

    /* compiled from: UserHeadeBrowingActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002!\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007J\u0011\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/photo/UserHeadeBrowingActivity$initListener$2$1", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isFromAuto", "", "Lcom/showstartfans/activity/activitys/article/OnBack;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements Function1<Boolean, Unit> {
        public void a(boolean z) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }
    }

    /* compiled from: UserHeadeBrowingActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007J\u0013\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/photo/UserHeadeBrowingActivity$onActivityResult$1", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "outUri", "", "Lcom/showstartfans/activity/activitys/profile/OnClipCallBack;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements Function1<Uri, Unit> {
        public final /* synthetic */ UserHeadeBrowingActivity b;

        public c(UserHeadeBrowingActivity userHeadeBrowingActivity) {
        }

        public void a(@Nullable Uri uri) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
        }
    }

    /* compiled from: UserHeadeBrowingActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<Integer> {
        public final /* synthetic */ UserHeadeBrowingActivity this$0;

        public d(UserHeadeBrowingActivity userHeadeBrowingActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    /* compiled from: UserHeadeBrowingActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "aBoolean", "", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ String $homeBg;

        public e(String str) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Boolean bool) {
        }
    }

    private final int A() {
    }

    private final void B(File file, Function1<? super Uri, Unit> function1) {
    }

    private static final void C(UserHeadeBrowingActivity userHeadeBrowingActivity, View view) {
    }

    private static final void D(UserHeadeBrowingActivity userHeadeBrowingActivity, View view) {
    }

    public static /* synthetic */ void E(UserHeadeBrowingActivity userHeadeBrowingActivity, View view) {
    }

    public static /* synthetic */ void F(UserHeadeBrowingActivity userHeadeBrowingActivity, n nVar) {
    }

    public static /* synthetic */ void G(UserHeadeBrowingActivity userHeadeBrowingActivity, View view) {
    }

    private final void H(String str, String str2, long j2, int i2, List<? extends PSSTagRequestBean> list, String str3, String str4, String str5) {
    }

    public static /* synthetic */ void I(UserHeadeBrowingActivity userHeadeBrowingActivity, String str, String str2, long j2, int i2, List list, String str3, String str4, String str5, int i3, Object obj) {
    }

    private final void J(File file) {
    }

    private static final void K(UserHeadeBrowingActivity userHeadeBrowingActivity, n nVar) {
    }

    public static final /* synthetic */ s w(UserHeadeBrowingActivity userHeadeBrowingActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity x(UserHeadeBrowingActivity userHeadeBrowingActivity) {
    }

    public static final /* synthetic */ int y(UserHeadeBrowingActivity userHeadeBrowingActivity) {
    }

    public static final /* synthetic */ void z(UserHeadeBrowingActivity userHeadeBrowingActivity, File file) {
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity
    public boolean setStatusBarTextWhite() {
    }
}
