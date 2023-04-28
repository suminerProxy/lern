package h.u.a.c;

import android.annotation.SuppressLint;
import android.app.Application;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UploadFileHelper.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0002Jq\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2W\u0010\t\u001aS\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nj\u0004\u0018\u0001`\u0012J/\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/showstartfans/activity/activitys/UploadFileHelper;", "", "()V", "upLoadImage", "", "ctx", "Landroid/app/Application;", "picturePath", "", "callBack", "Lkotlin/Function3;", "Lcom/taihebase/activity/network/Result;", "Lkotlin/ParameterName;", "name", com.alipay.sdk.util.l.c, "", "isSuccess", "value", "Lcom/showstartfans/activity/activitys/upLoadImageCallBack;", "upLoadImageMore", "images", "", "Lcom/showstartfans/activity/activitys/UploadFileHelper$OnUploadImageMoreListener;", "(Landroid/app/Application;[Ljava/lang/String;Lcom/showstartfans/activity/activitys/UploadFileHelper$OnUploadImageMoreListener;)V", "Companion", "OnUploadImageMoreListener", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class t {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final b f19957a = null;
    @NotNull
    private static final Lazy<t> b = null;

    /* compiled from: UploadFileHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/UploadFileHelper;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a extends Lambda implements Function0<t> {
        public static final a INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ t invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final t invoke() {
        }
    }

    /* compiled from: UploadFileHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/UploadFileHelper$Companion;", "", "()V", "instance", "Lcom/showstartfans/activity/activitys/UploadFileHelper;", "getInstance", "()Lcom/showstartfans/activity/activitys/UploadFileHelper;", "instance$delegate", "Lkotlin/Lazy;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final t a() {
        }
    }

    /* compiled from: UploadFileHelper.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/activitys/UploadFileHelper$OnUploadImageMoreListener;", "", "onFail", "", com.alipay.sdk.util.l.c, "Lcom/taihebase/activity/network/Result;", "onProgress", "progress", "", "onSuccess", "value", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface c {
        void a(@Nullable h.y.a.m.n nVar);

        void onProgress(int i2);

        void onSuccess(@Nullable String str);
    }

    /* compiled from: UploadFileHelper.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002O\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001j\u0002`\u000bJ%\u0010\f\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¨\u0006\r"}, d2 = {"com/showstartfans/activity/activitys/UploadFileHelper$upLoadImageMore$callBackOne$1", "Lkotlin/Function3;", "Lcom/taihebase/activity/network/Result;", "Lkotlin/ParameterName;", "name", com.alipay.sdk.util.l.c, "", "isSuccess", "", "value", "", "Lcom/showstartfans/activity/activitys/upLoadImageCallBack;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class d implements Function3<h.y.a.m.n, Boolean, String, Unit> {
        public final /* synthetic */ LinkedHashMap<String, String> b;
        public final /* synthetic */ String[] c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f19958d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ c f19959e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ t f19960f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Application f19961g;

        public d(LinkedHashMap<String, String> linkedHashMap, String[] strArr, Ref.IntRef intRef, c cVar, t tVar, Application application) {
        }

        public void a(@Nullable h.y.a.m.n nVar, boolean z, @Nullable String str) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(h.y.a.m.n nVar, Boolean bool, String str) {
        }
    }

    public static final /* synthetic */ Lazy a() {
    }

    public static /* synthetic */ void b(Function3 function3, h.y.a.m.n nVar) {
    }

    private static final void d(Function3 function3, h.y.a.m.n nVar) {
    }

    public final void c(@NotNull Application application, @Nullable String str, @Nullable Function3<? super h.y.a.m.n, ? super Boolean, ? super String, Unit> function3) {
    }

    @SuppressLint({"NewApi"})
    public final void e(@NotNull Application application, @Nullable String[] strArr, @Nullable c cVar) {
    }
}
