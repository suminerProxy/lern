package h.u.a.c.w;

import android.app.Application;
import android.widget.Toast;
import h.u.a.t.b2;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MomentPublishHelper.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002Jb\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012H\u0002JJ\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012JV\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\u001b"}, d2 = {"Lcom/showstartfans/activity/activitys/article/MomentPublishHelper;", "", "()V", "compressImage", "", "ctx", "Landroid/app/Application;", "path", "doPublish", "", "content", "multimediaUrl", "images", "mood", "targetId", "type", "", "callBack", "Lkotlin/Function1;", "", "publishText", "image", "publishVideo", "videoCoverPath", "videoPath", "uploadImage", "uploadVideo", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class r1 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final r1 f20015a = null;

    /* compiled from: MomentPublishHelper.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001b\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/article/MomentPublishHelper$compressImage$1", "Lcom/showstartfans/activity/utils/FileUtils$OnImageListener;", "onError", "", "throwable", "", "onSuccess", "paths", "", "", "([Ljava/lang/String;)V", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a implements b2.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f20016a;
        public final /* synthetic */ CountDownLatch b;

        public a(Ref.ObjectRef<String> objectRef, CountDownLatch countDownLatch) {
        }

        @Override // h.u.a.t.b2.b
        public void a(@NotNull String[] strArr) {
        }

        @Override // h.u.a.t.b2.b
        public void onError(@Nullable Throwable th) {
        }
    }

    /* compiled from: MomentPublishHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.showstartfans.activity.activitys.article.MomentPublishHelper$publishText$1", f = "MomentPublishHelper.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b extends SuspendLambda implements Function2<k.b.v0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Boolean, Unit> $callBack;
        public final /* synthetic */ String $content;
        public final /* synthetic */ Application $ctx;
        public final /* synthetic */ String $image;
        public final /* synthetic */ String $mood;
        public final /* synthetic */ String $targetId;
        public int label;

        /* compiled from: MomentPublishHelper.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "com.showstartfans.activity.activitys.article.MomentPublishHelper$publishText$1$imageUrl$1", f = "MomentPublishHelper.kt", i = {}, l = {40, 48}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class a extends SuspendLambda implements Function2<k.b.v0, Continuation<? super String>, Object> {
            public final /* synthetic */ Application $ctx;
            public final /* synthetic */ String $image;
            public int label;

            /* compiled from: MomentPublishHelper.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Landroid/widget/Toast;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "com.showstartfans.activity.activitys.article.MomentPublishHelper$publishText$1$imageUrl$1$1", f = "MomentPublishHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: h.u.a.c.w.r1$b$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public static final class C0348a extends SuspendLambda implements Function2<k.b.v0, Continuation<? super Toast>, Object> {
                public int label;

                public C0348a(Continuation<? super C0348a> continuation) {
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(k.b.v0 v0Var, Continuation<? super Toast> continuation) {
                }

                @Nullable
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(@NotNull k.b.v0 v0Var, @Nullable Continuation<? super Toast> continuation) {
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                }
            }

            /* compiled from: MomentPublishHelper.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Landroid/widget/Toast;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "com.showstartfans.activity.activitys.article.MomentPublishHelper$publishText$1$imageUrl$1$2", f = "MomentPublishHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: h.u.a.c.w.r1$b$a$b  reason: collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public static final class C0349b extends SuspendLambda implements Function2<k.b.v0, Continuation<? super Toast>, Object> {
                public int label;

                public C0349b(Continuation<? super C0349b> continuation) {
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(k.b.v0 v0Var, Continuation<? super Toast> continuation) {
                }

                @Nullable
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(@NotNull k.b.v0 v0Var, @Nullable Continuation<? super Toast> continuation) {
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                }
            }

            public a(Application application, String str, Continuation<? super a> continuation) {
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(k.b.v0 v0Var, Continuation<? super String> continuation) {
            }

            @Nullable
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull k.b.v0 v0Var, @Nullable Continuation<? super String> continuation) {
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
            }
        }

        public b(String str, Function1<? super Boolean, Unit> function1, Application application, String str2, String str3, String str4, Continuation<? super b> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(k.b.v0 v0Var, Continuation<? super Unit> continuation) {
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull k.b.v0 v0Var, @Nullable Continuation<? super Unit> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* compiled from: MomentPublishHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.showstartfans.activity.activitys.article.MomentPublishHelper$publishVideo$1", f = "MomentPublishHelper.kt", i = {1}, l = {79, 95}, m = "invokeSuspend", n = {"videoUrl"}, s = {"L$0"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class c extends SuspendLambda implements Function2<k.b.v0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Boolean, Unit> $callBack;
        public final /* synthetic */ String $content;
        public final /* synthetic */ Application $ctx;
        public final /* synthetic */ String $mood;
        public final /* synthetic */ String $targetId;
        public final /* synthetic */ String $videoCoverPath;
        public final /* synthetic */ String $videoPath;
        public Object L$0;
        public int label;

        /* compiled from: MomentPublishHelper.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "com.showstartfans.activity.activitys.article.MomentPublishHelper$publishVideo$1$coverUrl$1", f = "MomentPublishHelper.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class a extends SuspendLambda implements Function2<k.b.v0, Continuation<? super String>, Object> {
            public final /* synthetic */ Application $ctx;
            public final /* synthetic */ String $videoCoverPath;
            public int label;

            /* compiled from: MomentPublishHelper.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Landroid/widget/Toast;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "com.showstartfans.activity.activitys.article.MomentPublishHelper$publishVideo$1$coverUrl$1$1", f = "MomentPublishHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: h.u.a.c.w.r1$c$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public static final class C0350a extends SuspendLambda implements Function2<k.b.v0, Continuation<? super Toast>, Object> {
                public int label;

                public C0350a(Continuation<? super C0350a> continuation) {
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(k.b.v0 v0Var, Continuation<? super Toast> continuation) {
                }

                @Nullable
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(@NotNull k.b.v0 v0Var, @Nullable Continuation<? super Toast> continuation) {
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                }
            }

            public a(Application application, String str, Continuation<? super a> continuation) {
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(k.b.v0 v0Var, Continuation<? super String> continuation) {
            }

            @Nullable
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull k.b.v0 v0Var, @Nullable Continuation<? super String> continuation) {
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
            }
        }

        /* compiled from: MomentPublishHelper.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "com.showstartfans.activity.activitys.article.MomentPublishHelper$publishVideo$1$videoUrl$1", f = "MomentPublishHelper.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class b extends SuspendLambda implements Function2<k.b.v0, Continuation<? super String>, Object> {
            public final /* synthetic */ Application $ctx;
            public final /* synthetic */ String $videoPath;
            public int label;

            /* compiled from: MomentPublishHelper.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Landroid/widget/Toast;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "com.showstartfans.activity.activitys.article.MomentPublishHelper$publishVideo$1$videoUrl$1$1", f = "MomentPublishHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public static final class a extends SuspendLambda implements Function2<k.b.v0, Continuation<? super Toast>, Object> {
                public int label;

                public a(Continuation<? super a> continuation) {
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(k.b.v0 v0Var, Continuation<? super Toast> continuation) {
                }

                @Nullable
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(@NotNull k.b.v0 v0Var, @Nullable Continuation<? super Toast> continuation) {
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                }
            }

            public b(Application application, String str, Continuation<? super b> continuation) {
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(k.b.v0 v0Var, Continuation<? super String> continuation) {
            }

            @Nullable
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull k.b.v0 v0Var, @Nullable Continuation<? super String> continuation) {
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
            }
        }

        public c(String str, Function1<? super Boolean, Unit> function1, String str2, Application application, String str3, String str4, String str5, Continuation<? super c> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(k.b.v0 v0Var, Continuation<? super Unit> continuation) {
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull k.b.v0 v0Var, @Nullable Continuation<? super Unit> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* compiled from: MomentPublishHelper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/taihebase/activity/network/Result;", "isCoverSuccess", "", "coverValue", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class d extends Lambda implements Function3<h.y.a.m.n, Boolean, String, Unit> {
        public final /* synthetic */ CountDownLatch $countDownLatch;
        public final /* synthetic */ Ref.ObjectRef<String> $resultUrl;

        public d(Ref.ObjectRef<String> objectRef, CountDownLatch countDownLatch) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(h.y.a.m.n nVar, Boolean bool, String str) {
        }

        public final void invoke(@Nullable h.y.a.m.n nVar, boolean z, @Nullable String str) {
        }
    }

    private r1() {
    }

    public static final /* synthetic */ String a(r1 r1Var, Application application, String str) {
    }

    public static final /* synthetic */ void b(r1 r1Var, Application application, String str, String str2, String str3, String str4, String str5, int i2, Function1 function1) {
    }

    public static final /* synthetic */ String c(r1 r1Var, Application application, String str) {
    }

    public static final /* synthetic */ String d(r1 r1Var, Application application, String str) {
    }

    private final String e(Application application, String str) {
    }

    private final void f(Application application, String str, String str2, String str3, String str4, String str5, int i2, Function1<? super Boolean, Unit> function1) {
    }

    public static /* synthetic */ void g(r1 r1Var, Application application, String str, String str2, String str3, String str4, String str5, int i2, Function1 function1, int i3, Object obj) {
    }

    private static final void h(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void i(Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void j(Ref.ObjectRef objectRef, CountDownLatch countDownLatch, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void l(r1 r1Var, Application application, String str, String str2, String str3, String str4, Function1 function1, int i2, Object obj) {
    }

    public static /* synthetic */ void n(r1 r1Var, Application application, String str, String str2, String str3, String str4, String str5, Function1 function1, int i2, Object obj) {
    }

    private final String o(Application application, String str) {
    }

    private final String p(Application application, String str) {
    }

    private static final void q(Ref.ObjectRef objectRef, CountDownLatch countDownLatch, h.y.a.m.n nVar) {
    }

    public final void k(@NotNull Application application, @Nullable String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    public final void m(@NotNull Application application, @Nullable String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Function1<? super Boolean, Unit> function1) {
    }
}
