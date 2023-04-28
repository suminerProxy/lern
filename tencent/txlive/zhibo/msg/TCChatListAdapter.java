package tencent.txlive.zhibo.msg;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.tencent.qcloud.tuicore.TUIConstants;
import h.a.a.a.a.i.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tencent.txlive.util.LinkListData;
import tencent.txlive.zhibo.audience.BaseLiveRecycleAdapter;
import tencent.txlive.zhibo.audience.OnAudienceBanCall;
import tencent.txlive.zhibo.audience.RoomMemberBean;

/* compiled from: TCChatListAdapter.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0002J\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0002J \u0010\"\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020\rH\u0002J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0002H\u0002J\u0017\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u001cH\u0002J\u0006\u0010)\u001a\u00020\u001cJ\b\u0010*\u001a\u00020\tH\u0002J\u0018\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\rH\u0016J\u0018\u0010/\u001a\u00020-2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\rH\u0016J\u0010\u00103\u001a\u00020\u001c2\b\b\u0002\u00104\u001a\u00020\tJ\u000e\u00105\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u00106\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0011J\u000e\u00108\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u00109\u001a\u00020\u001cH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Ltencent/txlive/zhibo/msg/TCChatListAdapter;", "Ltencent/txlive/zhibo/audience/BaseLiveRecycleAdapter;", "Ltencent/txlive/zhibo/msg/TCChatEntity;", "ctx", "Landroid/content/Context;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView;)V", "authorized", "", "call", "Ltencent/txlive/zhibo/audience/OnAudienceBanCall;", "canKeepMaxItems", "", "delayHandler", "Landroid/os/Handler;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "isScrolling", "linkList", "Ltencent/txlive/util/LinkListData;", "recyclerView", TUIConstants.TUILive.ROOM_ID, "", "unReadNum", "unReadPop", "Landroid/widget/TextView;", "addListItem", "", "mList", "", "addMsg", "entity", "addMsgFromMySelf", "addMsgList", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "addOneItem", "calcNameColor", "type", "(Ljava/lang/Integer;)I", "dealOnScroll", "dispose", "isVisBottom", "onBindViewHolder", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", g.C, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "scrollToBottom", "scroll", "setCall", "setData", "fragmentM", "setUnReadPop", "showNumPop", "ViewHolder", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class TCChatListAdapter extends BaseLiveRecycleAdapter<TCChatEntity> {
    private boolean authorized;
    @Nullable
    private OnAudienceBanCall call;
    private int canKeepMaxItems;
    @NotNull
    private final Handler delayHandler;
    @Nullable
    private FragmentManager fragmentManager;
    private boolean isScrolling;
    @NotNull
    private final LinkListData<TCChatEntity> linkList;
    @NotNull
    private RecyclerView recyclerView;
    @NotNull
    private String roomId;
    private int unReadNum;
    @Nullable
    private TextView unReadPop;

    /* compiled from: TCChatListAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Ltencent/txlive/zhibo/msg/TCChatEntity;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: tencent.txlive.zhibo.msg.TCChatListAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<List<? extends TCChatEntity>, Unit> {
        public final /* synthetic */ TCChatListAdapter this$0;

        public AnonymousClass1(TCChatListAdapter tCChatListAdapter) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TCChatEntity> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<? extends TCChatEntity> list) {
        }
    }

    /* compiled from: TCChatListAdapter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltencent/txlive/zhibo/msg/TCChatListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "sendcontext", "Landroid/widget/TextView;", "getSendcontext", "()Landroid/widget/TextView;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        @NotNull
        private final TextView sendcontext;

        public ViewHolder(@NotNull View view) {
        }

        @NotNull
        public final TextView getSendcontext() {
        }
    }

    public TCChatListAdapter(@NotNull Context context, @NotNull RecyclerView recyclerView) {
    }

    public static final /* synthetic */ Handler access$getDelayHandler$p(TCChatListAdapter tCChatListAdapter) {
    }

    public static final /* synthetic */ TextView access$getUnReadPop$p(TCChatListAdapter tCChatListAdapter) {
    }

    public static final /* synthetic */ boolean access$isVisBottom(TCChatListAdapter tCChatListAdapter) {
    }

    public static final /* synthetic */ void access$setScrolling$p(TCChatListAdapter tCChatListAdapter, boolean z) {
    }

    public static final /* synthetic */ void access$setUnReadNum$p(TCChatListAdapter tCChatListAdapter, int i2) {
    }

    private final void addListItem(List<? extends TCChatEntity> list) {
    }

    /* renamed from: addListItem$lambda-7  reason: not valid java name */
    private static final void m1722addListItem$lambda7(TCChatListAdapter tCChatListAdapter, List list) {
    }

    private final void addMsgList(List<? extends TCChatEntity> list, int i2) {
    }

    public static /* synthetic */ void addMsgList$default(TCChatListAdapter tCChatListAdapter, List list, int i2, int i3, Object obj) {
    }

    private final void addOneItem(TCChatEntity tCChatEntity) {
    }

    /* renamed from: addOneItem$lambda-6  reason: not valid java name */
    private static final void m1723addOneItem$lambda6(TCChatListAdapter tCChatListAdapter, TCChatEntity tCChatEntity) {
    }

    public static /* synthetic */ void c(TCChatListAdapter tCChatListAdapter, TCChatEntity tCChatEntity, View view) {
    }

    private final int calcNameColor(Integer num) {
    }

    public static /* synthetic */ void d(TCChatListAdapter tCChatListAdapter, TCChatEntity tCChatEntity) {
    }

    private final void dealOnScroll() {
    }

    /* renamed from: delayHandler$lambda-0  reason: not valid java name */
    private static final boolean m1724delayHandler$lambda0(TCChatListAdapter tCChatListAdapter, Message message) {
    }

    public static /* synthetic */ boolean e(TCChatListAdapter tCChatListAdapter, Message message) {
    }

    public static /* synthetic */ void f(TCChatListAdapter tCChatListAdapter, List list) {
    }

    public static /* synthetic */ void g(TCChatListAdapter tCChatListAdapter, RoomMemberBean roomMemberBean, TCChatEntity tCChatEntity, String str, int i2) {
    }

    public static /* synthetic */ void h(TCChatListAdapter tCChatListAdapter, RoomMemberBean roomMemberBean, String str, int i2) {
    }

    private final boolean isVisBottom() {
    }

    /* renamed from: onBindViewHolder$lambda-4$lambda-3  reason: not valid java name */
    private static final void m1725onBindViewHolder$lambda4$lambda3(TCChatListAdapter tCChatListAdapter, TCChatEntity tCChatEntity, View view) {
    }

    /* renamed from: onBindViewHolder$lambda-4$lambda-3$lambda-2  reason: not valid java name */
    private static final void m1726onBindViewHolder$lambda4$lambda3$lambda2(TCChatListAdapter tCChatListAdapter, RoomMemberBean roomMemberBean, TCChatEntity tCChatEntity, String str, int i2) {
    }

    /* renamed from: onBindViewHolder$lambda-4$lambda-3$lambda-2$lambda-1  reason: not valid java name */
    private static final void m1727onBindViewHolder$lambda4$lambda3$lambda2$lambda1(TCChatListAdapter tCChatListAdapter, RoomMemberBean roomMemberBean, String str, int i2) {
    }

    public static /* synthetic */ void scrollToBottom$default(TCChatListAdapter tCChatListAdapter, boolean z, int i2, Object obj) {
    }

    private final void showNumPop() {
    }

    public final void addMsg(@NotNull TCChatEntity tCChatEntity) {
    }

    public final void addMsgFromMySelf(@NotNull TCChatEntity tCChatEntity) {
    }

    public final void dispose() {
    }

    @Override // tencent.txlive.zhibo.audience.BaseLiveRecycleAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseLiveRecycleAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i2) {
    }

    public final void scrollToBottom(boolean z) {
    }

    public final void setCall(@NotNull OnAudienceBanCall onAudienceBanCall) {
    }

    public final void setData(boolean z, @NotNull String str, @NotNull FragmentManager fragmentManager) {
    }

    public final void setUnReadPop(@NotNull TextView textView) {
    }
}
