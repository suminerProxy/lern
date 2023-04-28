package com.showstartfans.activity.activitys.article;

import android.app.Activity;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.taihe.photoselector.model.PhotoModel;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.u.a.g.p6;
import h.u.a.h.s0;
import h.u.a.u.f4.d;
import h.u.a.u.f4.f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EditVideoActivity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0014J\b\u0010\u000f\u001a\u00020\rH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0014J\b\u0010\u0013\u001a\u00020\rH\u0014J\b\u0010\u0014\u001a\u00020\rH\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/showstartfans/activity/activitys/article/EditVideoActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "binding", "Lcom/showstartfans/activity/databinding/ActivityVideoEditBinding;", "cuting", "", "outputPath", "", "progressDialog", "Lcom/showstartfans/activity/dialog/NormalProgressDialog;", "videoPath", "finish", "", "initData", "initListener", "initView", "needTopToolbar", "onDestroy", "onPause", "onRestart", "setContentViewResByViewBind", "Landroid/view/View;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class EditVideoActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public static final a f5281h = null;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private static Function1<? super PhotoModel, Unit> f5282i;
    @NotNull
    public Map<Integer, View> b;
    private p6 c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private s0 f5283d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5284e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f5285f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private String f5286g;

    /* compiled from: EditVideoActivity.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132+\u0010\u0003\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004j\u0004\u0018\u0001`\nR?\u0010\u0003\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004j\u0004\u0018\u0001`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/showstartfans/activity/activitys/article/EditVideoActivity$Companion;", "", "()V", "callback", "Lkotlin/Function1;", "Lcom/taihe/photoselector/model/PhotoModel;", "Lkotlin/ParameterName;", "name", "model", "", "Lcom/showstartfans/activity/activitys/article/CallBack;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "setCallback", "(Lkotlin/jvm/functions/Function1;)V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "act", "Landroid/app/Activity;", "videoPath", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Nullable
        public final Function1<PhotoModel, Unit> a() {
        }

        public final void b(@NotNull Activity activity, @Nullable String str, @Nullable Function1<? super PhotoModel, Unit> function1) {
        }

        public final void c(@Nullable Function1<? super PhotoModel, Unit> function1) {
        }
    }

    /* compiled from: EditVideoActivity.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/article/EditVideoActivity$initListener$3", "Lcom/showstartfans/activity/view/videocut/VideoTrimListener;", "onCancel", "", "onFinishTrim", "url", "", "onProgress", "progress", "", "onStartTrim", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EditVideoActivity f5287a;

        /* compiled from: EditVideoActivity.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/activitys/article/EditVideoActivity$initListener$3$onFinishTrim$1", "Lcom/showstartfans/activity/view/videocut/BackgroundExecutor$Task;", "execute", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class a extends d.a {

            /* renamed from: i  reason: collision with root package name */
            public final /* synthetic */ String f5288i;

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ EditVideoActivity f5289j;

            public a(String str, EditVideoActivity editVideoActivity) {
            }

            private static final void l(EditVideoActivity editVideoActivity, PhotoModel photoModel) {
            }

            public static /* synthetic */ void m(EditVideoActivity editVideoActivity, PhotoModel photoModel) {
            }

            @Override // h.u.a.u.f4.d.a
            public void j() {
            }
        }

        public b(EditVideoActivity editVideoActivity) {
        }

        @Override // h.u.a.u.f4.f
        public void a(@Nullable String str) {
        }

        @Override // h.u.a.u.f4.f
        public void b() {
        }

        @Override // h.u.a.u.f4.f
        public void onCancel() {
        }

        @Override // h.u.a.u.f4.f
        public void onProgress(float f2) {
        }
    }

    public static final /* synthetic */ void A(EditVideoActivity editVideoActivity, boolean z) {
    }

    public static final /* synthetic */ void B(EditVideoActivity editVideoActivity, s0 s0Var) {
    }

    private static final void C(EditVideoActivity editVideoActivity, View view) {
    }

    private static final void D(EditVideoActivity editVideoActivity, View view) {
    }

    public static /* synthetic */ void E(EditVideoActivity editVideoActivity, View view) {
    }

    public static /* synthetic */ void F(EditVideoActivity editVideoActivity, View view) {
    }

    public static final /* synthetic */ Function1 w() {
    }

    public static final /* synthetic */ BaseNewFunctionActivity x(EditVideoActivity editVideoActivity) {
    }

    public static final /* synthetic */ s0 y(EditVideoActivity editVideoActivity) {
    }

    public static final /* synthetic */ void z(Function1 function1) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, android.app.Activity
    public void onRestart() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
