package h.u.a.c.w;

import android.app.Application;
import com.showstartfans.activity.model.AtBean;
import com.taihe.ffmpeg.FFmpegUtil;
import h.u.a.c.t;
import h.u.a.t.b2;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArticlePublishHelper.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J{\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0002\u0010\u0017Ju\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0019Jy\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u001dJZ\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00042@\u0010 \u001a<\u0012\u0013\u0012\u00110\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u0007\u0018\u00010!j\u0004\u0018\u0001`'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/showstartfans/activity/activitys/article/ArticlePublishHelper;", "", "()V", "TAG", "", "bgImageUrl", "doPublish", "", "ctx", "Landroid/app/Application;", "content", "multimediaUrl", "images", "showType", "targetId", "type", "", "attachInfo", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/model/AtBean;", "Lkotlin/collections/ArrayList;", "topicIds", "", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;[Ljava/lang/String;)V", "publishText", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;[Ljava/lang/String;)V", "publishVideo", "videoConverPath", "videoPath", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;[Ljava/lang/String;)V", "uploadVideo", "path", "callBack", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isSuccess", "value", "Lcom/showstartfans/activity/activitys/article/upLoadVideoCallBack;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class o1 {
    @NotNull
    public static final b c = null;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final Lazy<o1> f19995d = null;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final String f19996a;
    @NotNull
    private String b;

    /* compiled from: ArticlePublishHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/article/ArticlePublishHelper;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a extends Lambda implements Function0<o1> {
        public static final a INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ o1 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final o1 invoke() {
        }
    }

    /* compiled from: ArticlePublishHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/article/ArticlePublishHelper$Companion;", "", "()V", "instance", "Lcom/showstartfans/activity/activitys/article/ArticlePublishHelper;", "getInstance", "()Lcom/showstartfans/activity/activitys/article/ArticlePublishHelper;", "instance$delegate", "Lkotlin/Lazy;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final o1 a() {
        }
    }

    /* compiled from: ArticlePublishHelper.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001b\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/article/ArticlePublishHelper$publishText$1", "Lcom/showstartfans/activity/utils/FileUtils$OnImageListener;", "onError", "", "throwable", "", "onSuccess", "paths", "", "", "([Ljava/lang/String;)V", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class c implements b2.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f19997a;
        public final /* synthetic */ o1 b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f19998d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f19999e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList<AtBean> f20000f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ String[] f20001g;

        /* compiled from: ArticlePublishHelper.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/article/ArticlePublishHelper$publishText$1$onSuccess$1", "Lcom/showstartfans/activity/activitys/UploadFileHelper$OnUploadImageMoreListener;", "onFail", "", com.alipay.sdk.util.l.c, "Lcom/taihebase/activity/network/Result;", "onProgress", "progress", "", "onSuccess", "value", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class a implements t.c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String[] f20002a;
            public final /* synthetic */ o1 b;
            public final /* synthetic */ Application c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ String f20003d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ String f20004e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ String f20005f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ ArrayList<AtBean> f20006g;

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ String[] f20007h;

            public a(String[] strArr, o1 o1Var, Application application, String str, String str2, String str3, ArrayList<AtBean> arrayList, String[] strArr2) {
            }

            @Override // h.u.a.c.t.c
            public void a(@Nullable h.y.a.m.n nVar) {
            }

            @Override // h.u.a.c.t.c
            public void onProgress(int i2) {
            }

            @Override // h.u.a.c.t.c
            public void onSuccess(@Nullable String str) {
            }
        }

        public c(Application application, o1 o1Var, String str, String str2, String str3, ArrayList<AtBean> arrayList, String[] strArr) {
        }

        @Override // h.u.a.t.b2.b
        public void a(@NotNull String[] strArr) {
        }

        @Override // h.u.a.t.b2.b
        public void onError(@Nullable Throwable th) {
        }
    }

    /* compiled from: ArticlePublishHelper.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/article/ArticlePublishHelper$publishVideo$1", "Lcom/taihe/ffmpeg/FFmpegUtil$onCallBack;", "onComplete", "", "onFailure", "onProgress", "progress", "", "onStart", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class d implements FFmpegUtil.onCallBack {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o1 f20008a;
        public final /* synthetic */ Application b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f20009d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f20010e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f20011f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ String f20012g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ ArrayList<AtBean> f20013h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ String[] f20014i;

        /* compiled from: ArticlePublishHelper.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "isSuccess", "", "value", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class a extends Lambda implements Function2<Boolean, String, Unit> {
            public final /* synthetic */ ArrayList<AtBean> $attachInfo;
            public final /* synthetic */ String $content;
            public final /* synthetic */ Application $ctx;
            public final /* synthetic */ String $showType;
            public final /* synthetic */ String $targetId;
            public final /* synthetic */ String[] $topicIds;
            public final /* synthetic */ String $videoConverPath;
            public final /* synthetic */ o1 this$0;

            /* compiled from: ArticlePublishHelper.kt */
            @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "resule", "Lcom/taihebase/activity/network/Result;", "isConverSuccess", "", "ConverValue", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: h.u.a.c.w.o1$d$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public static final class C0347a extends Lambda implements Function3<h.y.a.m.n, Boolean, String, Unit> {
                public final /* synthetic */ ArrayList<AtBean> $attachInfo;
                public final /* synthetic */ String $content;
                public final /* synthetic */ Application $ctx;
                public final /* synthetic */ String $showType;
                public final /* synthetic */ String $targetId;
                public final /* synthetic */ String[] $topicIds;
                public final /* synthetic */ String $value;
                public final /* synthetic */ String $videoConverPath;
                public final /* synthetic */ o1 this$0;

                public C0347a(String str, o1 o1Var, Application application, String str2, String str3, String str4, String str5, ArrayList<AtBean> arrayList, String[] strArr) {
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(h.y.a.m.n nVar, Boolean bool, String str) {
                }

                public final void invoke(@Nullable h.y.a.m.n nVar, boolean z, @Nullable String str) {
                }
            }

            public a(Application application, String str, o1 o1Var, String str2, String str3, String str4, ArrayList<AtBean> arrayList, String[] strArr) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str) {
            }

            public final void invoke(boolean z, @Nullable String str) {
            }
        }

        public d(o1 o1Var, Application application, String str, String str2, String str3, String str4, String str5, ArrayList<AtBean> arrayList, String[] strArr) {
        }

        @Override // com.taihe.ffmpeg.FFmpegUtil.onCallBack
        public void onComplete() {
        }

        @Override // com.taihe.ffmpeg.FFmpegUtil.onCallBack
        public void onFailure() {
        }

        @Override // com.taihe.ffmpeg.FFmpegUtil.onCallBack
        public void onProgress(float f2) {
        }

        @Override // com.taihe.ffmpeg.FFmpegUtil.onCallBack
        public void onStart() {
        }
    }

    public static final /* synthetic */ void a(o1 o1Var, Application application, String str, String str2, String str3, String str4, String str5, int i2, ArrayList arrayList, String[] strArr) {
    }

    public static final /* synthetic */ Lazy b() {
    }

    public static final /* synthetic */ void c(o1 o1Var, Application application, String str, Function2 function2) {
    }

    private final void d(Application application, String str, String str2, String str3, String str4, String str5, int i2, ArrayList<AtBean> arrayList, String[] strArr) {
    }

    private static final void e(o1 o1Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void f(Function2 function2, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void g(o1 o1Var, h.y.a.m.n nVar) {
    }

    private final void j(Application application, String str, Function2<? super Boolean, ? super String, Unit> function2) {
    }

    private static final void k(Function2 function2, h.y.a.m.n nVar) {
    }

    public final void h(@NotNull Application application, @Nullable String str, @Nullable String str2, @NotNull String[] strArr, @Nullable String str3, @Nullable String str4, @Nullable ArrayList<AtBean> arrayList, @Nullable String[] strArr2) {
    }

    public final void i(@NotNull Application application, @Nullable String str, @Nullable String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable ArrayList<AtBean> arrayList, @Nullable String[] strArr) {
    }
}
