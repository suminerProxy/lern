package tencent.im;

import android.app.Application;
import android.content.Context;
import cn.sharesdk.framework.InnerShareParams;
import com.google.android.exoplayer2.util.MimeTypes;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import h.c.a.a.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TencentIMControl.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u00013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0006\u0010\f\u001a\u00020\rJ\"\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rH\u0002J7\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2%\u0010\u0015\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0016H\u0007J\u0010\u0010\u001b\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u001c\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\tJ\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002JK\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\t2\b\u0010#\u001a\u0004\u0018\u00010\t2%\u0010\u0015\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0016J\u0006\u0010%\u001a\u00020\u0013J,\u0010&\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010\t2\b\u0010*\u001a\u0004\u0018\u00010\t2\u0006\u0010+\u001a\u00020\u0004J@\u0010&\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010\t2\b\u0010*\u001a\u0004\u0018\u00010\t2\u0006\u0010+\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\t2\b\u0010-\u001a\u0004\u0018\u00010.J$\u0010/\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010\t2\b\u0010*\u001a\u0004\u0018\u00010\tJ\u001a\u00100\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u00010\t2\b\u00102\u001a\u0004\u0018\u00010\tR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u00064"}, d2 = {"Ltencent/im/TencentIMControl;", "", "()V", "MSG_REVOKE_EDIT_TIME", "", "getMSG_REVOKE_EDIT_TIME$annotations", "getMSG_REVOKE_EDIT_TIME", "()I", "addForeToFirst", "", "a", "fore", "checkImLogin", "", "formatImId", "ImID", InnerShareParams.SCENCE, "isFromConversation", "getGroupReceiveMessage", "", "groupid", "callBac", "Lkotlin/Function1;", "Ltencent/im/TencentIMControl$ReceiveMode;", "Lkotlin/ParameterName;", "name", a.f16081l, "getUserIdByImId", "getUserTypeByImId", "initConfig", "initListener", "loginIm", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", TUIConstants.TUILive.USER_ID, "userSign", "success", "loginOutIm", "openChat", "ctx", "Landroid/content/Context;", "imID", "imName", TUIConstants.TUIChat.CHAT_TYPE, TUIConstants.TUIChat.GROUP_TYPE, "fromConversation", "Lcom/tencent/qcloud/tuikit/tuiconversation/bean/ConversationInfo;", "openGroupCommunityChat", "setImUserInfo", "userAvatar", "userNickName", "ReceiveMode", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class TencentIMControl {
    @NotNull
    public static final TencentIMControl INSTANCE = null;
    private static final int MSG_REVOKE_EDIT_TIME = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: TencentIMControl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ltencent/im/TencentIMControl$ReceiveMode;", "", "(Ljava/lang/String;I)V", "ReceiveAndNotify", "NotReceive", "ReceiveNotNotify", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class ReceiveMode {
        private static final /* synthetic */ ReceiveMode[] $VALUES = null;
        public static final ReceiveMode NotReceive = null;
        public static final ReceiveMode ReceiveAndNotify = null;
        public static final ReceiveMode ReceiveNotNotify = null;

        private static final /* synthetic */ ReceiveMode[] $values() {
        }

        private ReceiveMode(String str, int i2) {
        }

        public static ReceiveMode valueOf(String str) {
        }

        public static ReceiveMode[] values() {
        }
    }

    private TencentIMControl() {
    }

    public static final /* synthetic */ void access$initConfig(TencentIMControl tencentIMControl) {
    }

    public static final /* synthetic */ void access$initListener(TencentIMControl tencentIMControl) {
    }

    private final String addForeToFirst(String str, String str2) {
    }

    private final String formatImId(String str, int i2, boolean z) {
    }

    @JvmStatic
    public static final void getGroupReceiveMessage(@NotNull String str, @Nullable Function1<? super ReceiveMode, Unit> function1) {
    }

    public static final int getMSG_REVOKE_EDIT_TIME() {
    }

    @JvmStatic
    public static /* synthetic */ void getMSG_REVOKE_EDIT_TIME$annotations() {
    }

    private final void initConfig() {
    }

    private final void initListener() {
    }

    public final boolean checkImLogin() {
    }

    @NotNull
    public final String getUserIdByImId(@Nullable String str) {
    }

    public final int getUserTypeByImId(@Nullable String str) {
    }

    public final void loginIm(@Nullable Application application, @Nullable String str, @Nullable String str2, @Nullable Function1<? super Boolean, Unit> function1) {
    }

    public final void loginOutIm() {
    }

    public final void openChat(@Nullable Context context, @Nullable String str, @Nullable String str2, int i2) {
    }

    public final void openGroupCommunityChat(@Nullable Context context, @Nullable String str, @Nullable String str2) {
    }

    public final void setImUserInfo(@Nullable String str, @Nullable String str2) {
    }

    public final void openChat(@Nullable Context context, @Nullable String str, @Nullable String str2, int i2, @Nullable String str3, @Nullable ConversationInfo conversationInfo) {
    }
}
