package tencent.txlive.util;

import android.content.Context;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.model.InteractionMsgBean;
import com.showstartfans.activity.model.PostArticleData;
import com.showstartfans.activity.model.SceneDetailCommBean;
import com.tencent.android.tpush.common.MessageKey;
import h.y.a.m.n;
import h.y.a.m.o;
import h.y.a.p.w.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SceneTool.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJ;\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJ;\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJ;\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJ\b\u0010\u0015\u001a\u00020\u0006H\u0002JO\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\t\u001a\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJ;\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJ]\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\r2+\u0010\u000b\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020 \u0018\u00010\u001f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJS\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010$\u001a\u00020\r2+\u0010\u000b\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020%\u0018\u00010\u001f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJy\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020\n2+\u0010\u000b\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020 \u0018\u00010\u001f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJ[\u0010*\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010+\u001a\u00020\n2\b\b\u0002\u0010,\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\r2%\u0010\u000b\u001a!\u0012\u0015\u0012\u0013\u0018\u00010 ¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJØ\u0001\u0010-\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u00105\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\n2\b\b\u0002\u00106\u001a\u00020\n2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00108\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001e\u001a\u00020\r2%\u0010\u000b\u001a!\u0012\u0015\u0012\u0013\u0018\u000109¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0002\u0010:J\\\u0010;\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\r2:\u0010\u000b\u001a6\u0012\u0015\u0012\u0013\u0018\u00010=¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110>¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u0006\u0018\u00010<JD\u0010@\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010A\u001a\u00020\n2\u0006\u0010B\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010C\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010=J;\u0010E\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00182#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJ\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bH\u0002J;\u0010F\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJ\u001e\u0010G\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010H\u001a\u00020\nJ3\u0010I\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Ltencent/txlive/util/SceneTool;", "", "()V", "progressDialog", "Lcom/taihebase/activity/widget/dialog/ProgressDialog;", "commDoWish", "", "context", "Landroid/content/Context;", "reviewId", "", "callBac", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "commUnDoWish", "deleteComm", "deleteScene", "articleId", "dismissProgress", "doComm", "content", "", "newCommId", "doWish", "getHotCommList", "firstReviewId", "pageNo", "showProgress", "", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "getInteractionDate", "ctx", "type", "show", "Lcom/showstartfans/activity/model/InteractionMsgBean;", "getNewCommList", "excludeReviewIds", "minId", "pageSize", "getReplyCommList", "firstId", "lastId", "getSceneDataList", "siteId", "performerId", "fansId", "hostId", "activityId", "articleMinId", "keyword", "cityCode", "sort", "topicId", "isActivityDetail", "Lcom/showstartfans/activity/model/PostArticleData;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function1;)V", "getSceneDetails", "Lkotlin/Function2;", "Lcom/showstartfans/activity/model/Article;", "Lcom/taihebase/activity/network/ResultCode;", "code", "sendReport", "letterId", "reportUserId", MessageKey.MSG_SOURCE, "article", "shareSceneStatistics", "unDoWish", "updateScenePrivace", "showType", "userIsCanComm", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class SceneTool {
    @NotNull
    public static final SceneTool INSTANCE = null;
    @Nullable
    private static i progressDialog;

    private SceneTool() {
    }

    public static /* synthetic */ void a(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void b(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void c(Function2 function2, n nVar) {
    }

    /* renamed from: commDoWish$lambda-9  reason: not valid java name */
    private static final void m1656commDoWish$lambda9(Function1 function1, n nVar) {
    }

    /* renamed from: commUnDoWish$lambda-10  reason: not valid java name */
    private static final void m1657commUnDoWish$lambda10(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void d(boolean z, Function1 function1, n nVar) {
    }

    /* renamed from: deleteComm$lambda-11  reason: not valid java name */
    private static final void m1658deleteComm$lambda11(Function1 function1, n nVar) {
    }

    /* renamed from: deleteScene$lambda-14  reason: not valid java name */
    private static final void m1659deleteScene$lambda14(Function1 function1, n nVar) {
    }

    private final void dismissProgress() {
    }

    public static /* synthetic */ void doComm$default(SceneTool sceneTool, Context context, int i2, String str, int i3, Function1 function1, int i4, Object obj) {
    }

    /* renamed from: doComm$lambda-4  reason: not valid java name */
    private static final void m1660doComm$lambda4(Function1 function1, int i2, String str, int i3, n nVar) {
    }

    /* renamed from: doWish$lambda-2  reason: not valid java name */
    private static final void m1661doWish$lambda2(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void e(n nVar) {
    }

    public static /* synthetic */ void f(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void g(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void getHotCommList$default(SceneTool sceneTool, Context context, int i2, int i3, int i4, boolean z, Function1 function1, int i5, Object obj) {
    }

    /* renamed from: getHotCommList$lambda-5  reason: not valid java name */
    private static final void m1662getHotCommList$lambda5(boolean z, Function1 function1, n nVar) {
    }

    /* renamed from: getInteractionDate$lambda-16  reason: not valid java name */
    private static final void m1663getInteractionDate$lambda16(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void getNewCommList$default(SceneTool sceneTool, Context context, int i2, List list, int i3, int i4, boolean z, int i5, Function1 function1, int i6, Object obj) {
    }

    /* renamed from: getNewCommList$lambda-6  reason: not valid java name */
    private static final void m1664getNewCommList$lambda6(boolean z, Function1 function1, n nVar) {
    }

    public static /* synthetic */ void getReplyCommList$default(SceneTool sceneTool, Context context, int i2, int i3, int i4, boolean z, Function1 function1, int i5, Object obj) {
    }

    /* renamed from: getReplyCommList$lambda-7  reason: not valid java name */
    private static final void m1665getReplyCommList$lambda7(boolean z, Function1 function1, n nVar) {
    }

    public static /* synthetic */ void getSceneDataList$default(SceneTool sceneTool, Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, int i4, int i5, String str8, Integer num, boolean z, Function1 function1, int i6, Object obj) {
    }

    /* renamed from: getSceneDataList$lambda-1  reason: not valid java name */
    private static final void m1666getSceneDataList$lambda1(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void getSceneDetails$default(SceneTool sceneTool, Context context, int i2, boolean z, Function2 function2, int i3, Object obj) {
    }

    /* renamed from: getSceneDetails$lambda-0  reason: not valid java name */
    private static final void m1667getSceneDetails$lambda0(Function2 function2, n nVar) {
    }

    public static /* synthetic */ void h(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void i(boolean z, Function1 function1, n nVar) {
    }

    public static /* synthetic */ void j(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void k(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void l(n nVar) {
    }

    public static /* synthetic */ void m(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void n(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void o(Function1 function1, int i2, String str, int i3, n nVar) {
    }

    public static /* synthetic */ void p(boolean z, Function1 function1, n nVar) {
    }

    public static /* synthetic */ void q(Function1 function1, n nVar) {
    }

    public static /* synthetic */ void sendReport$default(SceneTool sceneTool, Context context, int i2, int i3, String str, int i4, int i5, Article article, int i6, Object obj) {
    }

    /* renamed from: sendReport$lambda-12  reason: not valid java name */
    private static final void m1668sendReport$lambda12(n nVar) {
    }

    /* renamed from: shareSceneStatistics$lambda-15  reason: not valid java name */
    private static final void m1669shareSceneStatistics$lambda15(Function1 function1, n nVar) {
    }

    private final void showProgress(Context context) {
    }

    /* renamed from: unDoWish$lambda-3  reason: not valid java name */
    private static final void m1670unDoWish$lambda3(Function1 function1, n nVar) {
    }

    /* renamed from: updateScenePrivace$lambda-13  reason: not valid java name */
    private static final void m1671updateScenePrivace$lambda13(n nVar) {
    }

    /* renamed from: userIsCanComm$lambda-8  reason: not valid java name */
    private static final void m1672userIsCanComm$lambda8(Function1 function1, n nVar) {
    }

    public final void commDoWish(@NotNull Context context, int i2, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    public final void commUnDoWish(@NotNull Context context, int i2, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    public final void deleteComm(@NotNull Context context, int i2, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    public final void deleteScene(@NotNull Context context, int i2, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    public final void doComm(@NotNull Context context, int i2, @Nullable String str, int i3, @Nullable Function1<? super Integer, Unit> function1) {
    }

    public final void doWish(@NotNull Context context, int i2, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    public final void getHotCommList(@NotNull Context context, int i2, int i3, int i4, boolean z, @Nullable Function1<? super List<? extends SceneDetailCommBean>, Unit> function1) {
    }

    public final void getInteractionDate(@NotNull Context context, int i2, int i3, boolean z, @Nullable Function1<? super List<? extends InteractionMsgBean>, Unit> function1) {
    }

    public final void getNewCommList(@NotNull Context context, int i2, @Nullable List<Integer> list, int i3, int i4, boolean z, int i5, @Nullable Function1<? super List<? extends SceneDetailCommBean>, Unit> function1) {
    }

    public final void getReplyCommList(@NotNull Context context, int i2, int i3, int i4, boolean z, @Nullable Function1<? super SceneDetailCommBean, Unit> function1) {
    }

    public final void getSceneDataList(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, int i2, int i3, int i4, int i5, @Nullable String str8, @Nullable Integer num, boolean z, @Nullable Function1<? super PostArticleData, Unit> function1) {
    }

    public final void getSceneDetails(@NotNull Context context, int i2, boolean z, @Nullable Function2<? super Article, ? super o, Unit> function2) {
    }

    public final void sendReport(@NotNull Context context, int i2, int i3, @Nullable String str, int i4, int i5, @Nullable Article article) {
    }

    public final void shareSceneStatistics(@NotNull Context context, @NotNull String str, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    public final void unDoWish(@NotNull Context context, int i2, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    public final void updateScenePrivace(@NotNull Context context, int i2, int i3) {
    }

    public final void userIsCanComm(@NotNull Context context, @Nullable Function1<? super Boolean, Unit> function1) {
    }
}
