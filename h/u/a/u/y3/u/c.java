package h.u.a.u.y3.u;

import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.BaseImMessageBean;
import com.showstartfans.activity.model.ImMessageBean;
import com.showstartfans.activity.model.MessageLikeBean;
import com.showstartfans.activity.model.MessageNoticeBean;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomMessageUtils.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u0012\u0010\u0018\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J!\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0014\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010#\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010$\u001a\u00020%2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J)\u0010&\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u001aH\u0003¢\u0006\u0002\u0010(J\u001a\u0010)\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010*\u001a\u00020%H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/showstartfans/activity/view/custom_im_ui/utils/CustomMessageUtils;", "", "()V", "CUSTOM_MSG_TYPE_ARTICLE", "", "CUSTOM_MSG_TYPE_GROUP_NOTICE", "CUSTOM_MSG_TYPE_GROUP_NOTICE_CONFIRM", "CUSTOM_MSG_TYPE_NOTICE", "addObjToCloudCustomData", "", "msg", "Lcom/tencent/qcloud/tuikit/tuichat/bean/message/TUIMessageBean;", "key", MapBundleKey.MapObjKey.OBJ_SL_OBJ, "Ljava/lang/Object;", "checkSaveLastMsg", "getCloudCustomDataJson", "getContent", "getImMessageBean", "Lcom/showstartfans/activity/model/ImMessageBean;", TUIConstants.TUIChat.V2TIMMESSAGE, "Lcom/tencent/imsdk/v2/V2TIMMessage;", "getImMessageDataBean", "Lcom/showstartfans/activity/model/BaseImMessageBean;", "getKey", "getLastReadMessageSeq", "Lcom/showstartfans/activity/model/ChaceMsgBean;", "type", "", "imId", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/showstartfans/activity/model/ChaceMsgBean;", "getMessageLikeBean", "Lcom/showstartfans/activity/model/MessageLikeBean;", "getMessageNoticeBean", "Lcom/showstartfans/activity/model/MessageNoticeBean;", "getSenderName", "isZaned", "", "setLastReadMessage", "bean", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/showstartfans/activity/model/ChaceMsgBean;)V", "setZan", "zan", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class c {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final c f24969a = null;
    @NotNull
    public static final String b = "1";
    @NotNull
    public static final String c = "2";
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public static final String f24970d = "3";
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final String f24971e = "4";

    private c() {
    }

    @JvmStatic
    public static final void a(@Nullable TUIMessageBean tUIMessageBean, @Nullable String str, @Nullable Object obj) {
    }

    @JvmStatic
    public static final void b(@Nullable TUIMessageBean tUIMessageBean) {
    }

    @JvmStatic
    @NotNull
    public static final String c(@Nullable TUIMessageBean tUIMessageBean) {
    }

    @JvmStatic
    @NotNull
    public static final String d(@Nullable TUIMessageBean tUIMessageBean) {
    }

    private final ImMessageBean e(V2TIMMessage v2TIMMessage) {
    }

    @JvmStatic
    @Nullable
    public static final BaseImMessageBean f(@Nullable V2TIMMessage v2TIMMessage) {
    }

    private final String g(TUIMessageBean tUIMessageBean) {
    }

    @JvmStatic
    @Nullable
    public static final h.u.a.o.e h(@Nullable Integer num, @NotNull String str) {
    }

    @JvmStatic
    @Nullable
    public static final MessageLikeBean i(@Nullable TUIMessageBean tUIMessageBean) {
    }

    @JvmStatic
    @Nullable
    public static final MessageNoticeBean j(@Nullable TUIMessageBean tUIMessageBean) {
    }

    @JvmStatic
    @NotNull
    public static final String k(@Nullable TUIMessageBean tUIMessageBean) {
    }

    @JvmStatic
    public static final boolean l(@Nullable TUIMessageBean tUIMessageBean) {
    }

    @JvmStatic
    private static final void m(Integer num, String str, h.u.a.o.e eVar) {
    }

    @JvmStatic
    public static final void n(@Nullable TUIMessageBean tUIMessageBean, boolean z) {
    }
}
