package tencent.txlive.zhibo.widget.danku;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tencent.txlive.util.LinkListData;
import tencent.txlive.zhibo.msg.TCChatEntity;

/* compiled from: DanmuMgr.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013J\u0016\u0010\u001d\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001fH\u0002J \u0010 \u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001f2\b\b\u0002\u0010!\u001a\u00020\bH\u0002J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013H\u0002J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013J\u0006\u0010$\u001a\u00020\u001bJ\u0006\u0010%\u001a\u00020\u001bJ\u0006\u0010&\u001a\u00020\u001bJ\u0006\u0010'\u001a\u00020\u001bJ\u0006\u0010(\u001a\u00020\u001bJ\u0010\u0010)\u001a\u00020\u001b2\b\u0010*\u001a\u0004\u0018\u00010\u0015J\u0006\u0010+\u001a\u00020\u001bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Ltencent/txlive/zhibo/widget/danku/DanmuMgr;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ADD_DANMU_TIME", "", "DANMU_PADDING", "", "DANMU_PADDING_INNER", "DANMU_RADIUS", "DANMU_TEXT_SIZE", "", "TAG", "", "canKeepMaxItems", "danmuCount", "linkList", "Ltencent/txlive/util/LinkListData;", "Ltencent/txlive/zhibo/msg/TCChatEntity;", "mDanmakuView", "Ltencent/txlive/zhibo/widget/danku/LiveDanmakuView;", "mDanmuHandler", "Landroid/os/Handler;", "mDanmuThread", "Landroid/os/HandlerThread;", "addDanmu", "", "userInfo", "addListItem", "mList", "", "addMsgList", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "addOneItem", "addSelfDanmu", "clear", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "hide", "pause", "resume", "setDanmakuView", "danmakuView", "show", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class DanmuMgr {
    private final long ADD_DANMU_TIME;
    private final int DANMU_PADDING;
    private final int DANMU_PADDING_INNER;
    private final int DANMU_RADIUS;
    private final float DANMU_TEXT_SIZE;
    @NotNull
    private final String TAG;
    private int canKeepMaxItems;
    private int danmuCount;
    @NotNull
    private final LinkListData<TCChatEntity> linkList;
    @Nullable
    private LiveDanmakuView mDanmakuView;
    @Nullable
    private final Handler mDanmuHandler;
    @Nullable
    private HandlerThread mDanmuThread;

    /* compiled from: DanmuMgr.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Ltencent/txlive/zhibo/msg/TCChatEntity;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: tencent.txlive.zhibo.widget.danku.DanmuMgr$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<List<? extends TCChatEntity>, Unit> {
        public final /* synthetic */ DanmuMgr this$0;

        public AnonymousClass1(DanmuMgr danmuMgr) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TCChatEntity> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<? extends TCChatEntity> list) {
        }
    }

    public DanmuMgr(@Nullable Context context) {
    }

    public static /* synthetic */ void a(DanmuMgr danmuMgr, List list) {
    }

    private final void addListItem(List<? extends TCChatEntity> list) {
    }

    /* renamed from: addListItem$lambda-1  reason: not valid java name */
    private static final void m1754addListItem$lambda1(DanmuMgr danmuMgr, List list) {
    }

    /* renamed from: addListItem$lambda-1$lambda-0  reason: not valid java name */
    private static final void m1755addListItem$lambda1$lambda0(DanmuMgr danmuMgr, TCChatEntity tCChatEntity) {
    }

    private final void addMsgList(List<? extends TCChatEntity> list, int i2) {
    }

    public static /* synthetic */ void addMsgList$default(DanmuMgr danmuMgr, List list, int i2, int i3, Object obj) {
    }

    private final void addOneItem(TCChatEntity tCChatEntity) {
    }

    /* renamed from: addOneItem$lambda-2  reason: not valid java name */
    private static final void m1756addOneItem$lambda2(DanmuMgr danmuMgr, TCChatEntity tCChatEntity) {
    }

    public static /* synthetic */ void b(DanmuMgr danmuMgr, TCChatEntity tCChatEntity) {
    }

    public static /* synthetic */ void c(DanmuMgr danmuMgr, TCChatEntity tCChatEntity) {
    }

    public final void addDanmu(@NotNull TCChatEntity tCChatEntity) {
    }

    public final void addSelfDanmu(@NotNull TCChatEntity tCChatEntity) {
    }

    public final void clear() {
    }

    public final void destroy() {
    }

    public final void hide() {
    }

    public final void pause() {
    }

    public final void resume() {
    }

    public final void setDanmakuView(@Nullable LiveDanmakuView liveDanmakuView) {
    }

    public final void show() {
    }
}
