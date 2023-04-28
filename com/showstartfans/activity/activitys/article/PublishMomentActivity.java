package com.showstartfans.activity.activitys.article;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.view.DyVideoView;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import h.u.a.c.w.s1;
import h.u.a.g.x3;
import h.u.a.o.s;
import h.u.a.w.c0.m2;
import h.y.a.f.m;
import h.y.a.m.n;
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

/* compiled from: PublishMomentActivity.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 =2\u00020\u0001:\u0002=>B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0014J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\b\u0010\u001c\u001a\u00020\u0017H\u0014J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\"\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\u0017H\u0016J\u0012\u0010&\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020\u0017H\u0014J\b\u0010*\u001a\u00020\u0017H\u0014J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0006H\u0002J\b\u0010-\u001a\u00020\u0017H\u0002J\b\u0010.\u001a\u00020\u0017H\u0002J\u0010\u0010/\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u00100\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002J\b\u00101\u001a\u000202H\u0014J\u0010\u00103\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\bH\u0002J\u0012\u00104\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u00105\u001a\u00020\u00172\u000e\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107H\u0002J\u0018\u00109\u001a\u00020\u00172\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u000107H\u0002J\u0010\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014¨\u0006?"}, d2 = {"Lcom/showstartfans/activity/activitys/article/PublishMomentActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "binding", "Lcom/showstartfans/activity/databinding/ActivityPublishMomentBinding;", "content", "", "coverData", "Lcom/showstartfans/activity/activitys/article/PublishMomentActivity$Data;", "imageAdapter", "Lcom/showstartfans/activity/indiefragment/AdapterShowMoment;", "getImageAdapter", "()Lcom/showstartfans/activity/indiefragment/AdapterShowMoment;", "imageAdapter$delegate", "Lkotlin/Lazy;", "mood", "Lcom/showstartfans/activity/model/Mood;", "moodAdapter", "Lcom/showstartfans/activity/activitys/article/MoodAdapter;", "getMoodAdapter", "()Lcom/showstartfans/activity/activitys/article/MoodAdapter;", "moodAdapter$delegate", "finish", "", "getCutPath", MapBundleKey.MapObjKey.OBJ_SRC, "initData", "initListener", "initView", "needTopToolbar", "", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "play", "path", "publish", "requestMomentBefore", "resultImage", "resultVideo", "setContentViewResByViewBind", "Landroid/view/View;", "setCover", "setEmoji", "updateBackGround", "backgroundList", "", "Lcom/showstartfans/activity/model/BackGround;", "updateMood", "moodList", "uploadComplete", "success", "Companion", "Data", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PublishMomentActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    public static final a f5308i = null;

    /* renamed from: j  reason: collision with root package name */
    public static final int f5309j = 100;

    /* renamed from: k  reason: collision with root package name */
    public static final int f5310k = 200;
    @NotNull
    public Map<Integer, View> b;
    private x3 c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f5311d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f5312e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f5313f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private b f5314g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private s f5315h;

    /* compiled from: PublishMomentActivity.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/showstartfans/activity/activitys/article/PublishMomentActivity$Companion;", "", "()V", "SELECT_PHOTO_REQUEST", "", "TAKE_MOMENT_REQUEST", "dealOpen", "", "act", "Landroid/app/Activity;", "id", "", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {

        /* compiled from: PublishMomentActivity.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/showstartfans/activity/activitys/article/PublishMomentActivity$Companion$open$1", "Lcom/showstartfans/activity/widget/dialog/OnRealNameTwoPointCall;", "onRealNameTwoPoint", "", "onRealNameTwoPointFail", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.showstartfans.activity.activitys.article.PublishMomentActivity$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class C0131a implements m2 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f5316a;
            public final /* synthetic */ String b;

            public C0131a(Activity activity, String str) {
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

        public static final /* synthetic */ void a(a aVar, Activity activity, String str) {
        }

        private final void b(Activity activity, String str) {
        }

        public final void c(@NotNull Activity activity, @NotNull String str) {
        }
    }

    /* compiled from: PublishMomentActivity.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/showstartfans/activity/activitys/article/PublishMomentActivity$Data;", "", "cover", "", "(Ljava/lang/String;)V", "path", "(Ljava/lang/String;Ljava/lang/String;)V", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCover", "()Ljava/lang/String;", "setCover", "getPath", "setPath", "getType", "setType", "isCoverLocal", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private String f5317a;
        @NotNull
        private String b;
        @NotNull
        private String c;

        public b(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        }

        @NotNull
        public final String a() {
        }

        @NotNull
        public final String b() {
        }

        @NotNull
        public final String c() {
        }

        public final boolean d() {
        }

        public final void e(@NotNull String str) {
        }

        public final void f(@NotNull String str) {
        }

        public final void g(@NotNull String str) {
        }

        public b(@NotNull String str) {
        }

        public b(@NotNull String str, @NotNull String str2) {
        }
    }

    /* compiled from: PublishMomentActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/indiefragment/AdapterShowMoment;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class c extends Lambda implements Function0<h.u.a.k.j> {
        public final /* synthetic */ PublishMomentActivity this$0;

        public c(PublishMomentActivity publishMomentActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.k.j invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.k.j invoke() {
        }
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", am.aB, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", AnimatedPasterJsonConfig.CONFIG_COUNT, TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class d implements TextWatcher {
        public final /* synthetic */ PublishMomentActivity b;

        public d(PublishMomentActivity publishMomentActivity) {
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

    /* compiled from: PublishMomentActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Integer;)Ljava/lang/Void;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class e extends Lambda implements Function1<Integer, Void> {
        public final /* synthetic */ PublishMomentActivity this$0;

        public e(PublishMomentActivity publishMomentActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Void invoke(Integer num) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Void invoke2(Integer num) {
        }
    }

    /* compiled from: PublishMomentActivity.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/article/PublishMomentActivity$initView$2", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class f extends RecyclerView.ItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PublishMomentActivity f5318a;

        public f(PublishMomentActivity publishMomentActivity) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        }
    }

    /* compiled from: PublishMomentActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/article/MoodAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class g extends Lambda implements Function0<s1> {
        public final /* synthetic */ PublishMomentActivity this$0;

        /* compiled from: PublishMomentActivity.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/article/PublishMomentActivity$moodAdapter$2$1$1", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter$OnItemClickListener;", "OnItemClick", "", h.a.a.a.a.i.g.C, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class a implements m.b {
            public final /* synthetic */ s1 b;
            public final /* synthetic */ PublishMomentActivity c;

            public a(s1 s1Var, PublishMomentActivity publishMomentActivity) {
            }

            @Override // h.y.a.f.m.b
            public void c(int i2) {
            }
        }

        public g(PublishMomentActivity publishMomentActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ s1 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final s1 invoke() {
        }
    }

    /* compiled from: PublishMomentActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/activitys/article/PublishMomentActivity$play$1", "Lcom/showstartfans/activity/view/DyVideoView$DySuperPlayerObserver;", "onPlayPrepared", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class h extends DyVideoView.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PublishMomentActivity f5319a;

        public h(PublishMomentActivity publishMomentActivity) {
        }

        public static /* synthetic */ void i(PublishMomentActivity publishMomentActivity, h hVar) {
        }

        private static final void j(PublishMomentActivity publishMomentActivity, h hVar) {
        }

        @Override // com.showstartfans.activity.view.DyVideoView.a
        public void e() {
        }
    }

    /* compiled from: PublishMomentActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class i extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ PublishMomentActivity this$0;

        public i(PublishMomentActivity publishMomentActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: PublishMomentActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class j extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ PublishMomentActivity this$0;

        public j(PublishMomentActivity publishMomentActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    public static final /* synthetic */ void A(PublishMomentActivity publishMomentActivity, b bVar) {
    }

    public static final /* synthetic */ void B(PublishMomentActivity publishMomentActivity, s sVar) {
    }

    public static final /* synthetic */ void C(PublishMomentActivity publishMomentActivity, boolean z) {
    }

    private final String D(String str) {
    }

    private final h.u.a.k.j E() {
    }

    private final s1 F() {
    }

    private static final void G(PublishMomentActivity publishMomentActivity, View view) {
    }

    private static final void H(PublishMomentActivity publishMomentActivity, View view) {
    }

    private static final void I(PublishMomentActivity publishMomentActivity, View view) {
    }

    private static final void J(PublishMomentActivity publishMomentActivity, View view) {
    }

    private static final void K(PublishMomentActivity publishMomentActivity, View view) {
    }

    private static final void L(PublishMomentActivity publishMomentActivity, View view) {
    }

    private static final void M(PublishMomentActivity publishMomentActivity, View view) {
    }

    private static final void N(PublishMomentActivity publishMomentActivity) {
    }

    public static /* synthetic */ void O(PublishMomentActivity publishMomentActivity) {
    }

    public static /* synthetic */ void P(PublishMomentActivity publishMomentActivity, View view) {
    }

    public static /* synthetic */ void Q(PublishMomentActivity publishMomentActivity, View view) {
    }

    public static /* synthetic */ void R(PublishMomentActivity publishMomentActivity, View view) {
    }

    public static /* synthetic */ void S(PublishMomentActivity publishMomentActivity, n nVar) {
    }

    public static /* synthetic */ void T(PublishMomentActivity publishMomentActivity, View view) {
    }

    public static /* synthetic */ void U(PublishMomentActivity publishMomentActivity, View view) {
    }

    public static /* synthetic */ void V(PublishMomentActivity publishMomentActivity, View view) {
    }

    public static /* synthetic */ void W(PublishMomentActivity publishMomentActivity, View view) {
    }

    private final void X(String str) {
    }

    private final void Y() {
    }

    private final void Z() {
    }

    private static final void a0(PublishMomentActivity publishMomentActivity, n nVar) {
    }

    private final void b0(Intent intent) {
    }

    private final void c0(Intent intent) {
    }

    private final void d0(b bVar) {
    }

    private final void e0(s sVar) {
    }

    private final void f0(List<h.u.a.o.c> list) {
    }

    private final void g0(List<s> list) {
    }

    private final void h0(boolean z) {
    }

    public static final /* synthetic */ x3 w(PublishMomentActivity publishMomentActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity x(PublishMomentActivity publishMomentActivity) {
    }

    public static final /* synthetic */ h.u.a.k.j y(PublishMomentActivity publishMomentActivity) {
    }

    public static final /* synthetic */ void z(PublishMomentActivity publishMomentActivity, String str) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
