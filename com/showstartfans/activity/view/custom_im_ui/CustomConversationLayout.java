package com.showstartfans.activity.view.custom_im_ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.showstartfans.activity.model.GroupMsgBean;
import com.showstartfans.activity.model.MessageGroupJoinBean;
import com.showstartfans.activity.model.MessageUnreadBean;
import com.showstartfans.activity.view.ShowStartCService;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemClickListener;
import com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationListLayout;
import h.u.a.u.y3.j.d;
import h.y.a.m.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomConversationLayout.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001jB\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u0012\u00105\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u0012\u00106\u001a\u0002022\b\u00107\u001a\u0004\u0018\u00010\u001fH\u0002J\u0006\u00108\u001a\u000202J\u0010\u00109\u001a\u0002022\b\u00107\u001a\u0004\u0018\u00010\u001fJ\u0006\u0010:\u001a\u000202J\u0012\u0010;\u001a\u0002022\b\u0010<\u001a\u0004\u0018\u00010\u001fH\u0016J\u0006\u0010=\u001a\u000202J\b\u0010>\u001a\u000202H\u0016J\u0012\u0010?\u001a\u0002022\b\u0010<\u001a\u0004\u0018\u00010\u001fH\u0016J\u0006\u0010@\u001a\u000202J\u0010\u0010A\u001a\u0002022\u0006\u0010B\u001a\u00020\nH\u0002J\b\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u0004\u0018\u00010\u001f2\u0006\u0010F\u001a\u00020\nJ\b\u0010G\u001a\u000202H\u0002J\n\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0010\u0010J\u001a\u0002022\u0006\u0010K\u001a\u00020\u0015H\u0016J\b\u0010L\u001a\u000202H\u0002J\u0010\u0010M\u001a\u0002022\b\b\u0002\u0010N\u001a\u00020\u0015J\b\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u000202H\u0002J\u0006\u0010R\u001a\u00020\u0015J\b\u0010S\u001a\u000202H\u0002J\u0012\u0010T\u001a\u0002022\b\u0010<\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010U\u001a\u0002022\b\u00107\u001a\u0004\u0018\u00010\u001f2\u0006\u0010V\u001a\u00020\u0015H\u0016J\b\u0010W\u001a\u000202H\u0014J\u0010\u0010X\u001a\u0002022\u0006\u0010Y\u001a\u00020\u0015H\u0002J \u0010Z\u001a\u0002022\b\u0010<\u001a\u0004\u0018\u00010\u001f2\f\u0010[\u001a\b\u0012\u0002\b\u0003\u0018\u00010\\H\u0016J\u0006\u0010]\u001a\u000202J\u000e\u0010^\u001a\u0002022\u0006\u0010_\u001a\u00020\u0015J\u0012\u0010`\u001a\u0002022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$J\u0010\u0010a\u001a\u0002022\b\u0010b\u001a\u0004\u0018\u00010cJ\u0010\u0010d\u001a\u0002022\u0006\u0010e\u001a\u00020fH\u0016J\u0012\u0010g\u001a\u0002022\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010h\u001a\u0002022\b\u0010,\u001a\u0004\u0018\u00010-J\u0006\u0010i\u001a\u000202R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u001f0(j\b\u0012\u0004\u0012\u00020\u001f`)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018¨\u0006k"}, d2 = {"Lcom/showstartfans/activity/view/custom_im_ui/CustomConversationLayout;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/qcloud/tuikit/tuiconversation/ui/interfaces/IConversationLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/showstartfans/activity/view/custom_im_ui/adapter/CustomConversationListAdapter;", "getAdapter", "()Lcom/showstartfans/activity/view/custom_im_ui/adapter/CustomConversationListAdapter;", "setAdapter", "(Lcom/showstartfans/activity/view/custom_im_ui/adapter/CustomConversationListAdapter;)V", "groupBean", "Lcom/showstartfans/activity/model/MessageGroupJoinBean;", "isCheckedGroup", "", "()Z", "setCheckedGroup", "(Z)V", "isEditMode", "isInit", "iv_gougoou_group", "Landroid/widget/ImageView;", "mCheckMap", "Ljava/util/HashMap;", "Lcom/tencent/qcloud/tuikit/tuiconversation/bean/ConversationInfo;", "mConversationList", "Lcom/showstartfans/activity/view/custom_im_ui/CustomConversationListLayout;", "message_group_join_p", "onCheckChangeListener", "Lcom/showstartfans/activity/view/custom_im_ui/CustomConversationLayout$OnCheckChangeListener;", "presenter", "Lcom/showstartfans/activity/view/custom_im_ui/kits/CustomConversationPresenter;", "saveInfos", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "service_showstart", "Lcom/showstartfans/activity/view/ShowStartCService;", "unreadBean", "Lcom/showstartfans/activity/model/MessageUnreadBean;", "useGetMessagePoint", "getUseGetMessagePoint", "setUseGetMessagePoint", "OnCrowdMessage", "", "bean", "Lcom/showstartfans/activity/model/GroupMsgBean;", "OnGoodMessage", "OnLongClick", "conversationInfo", "OnRefresh", "addConversationAuto", "checkALL", TUIConstants.TUIConversation.METHOD_CLEAR_CONVERSATION_MESSAGE, "conversation", "clearUnRead", "clearUnreadStatusOfFoldItem", TUIConstants.TUIConversation.METHOD_DELETE_CONVERSATION, "deleteJoinGroup", "deleteeFromHttp", "type", "getConversationList", "Lcom/tencent/qcloud/tuikit/tuiconversation/ui/view/ConversationListLayout;", "getItemData", "pos", "getMessagePoint", "getTitleBar", "Lcom/tencent/qcloud/tuicore/component/TitleBarLayout;", "hideFoldedItem", "needHide", "init", "initDefault", "editMode", "initHeadView", "Landroid/view/View;", "initListener", "isCheckXDService", "loadConversation", "markConversationHidden", "markConversationUnread", "markUnread", "onDetachedFromWindow", "setCheckGroup", "check", "setConversationTop", "callBack", "Lcom/tencent/qcloud/tuicore/component/interfaces/IUIKitCallback;", "setGroupItemMessage", "setNightMode", "nightMode", "setOnCheckChangeListener", "setOnItemClickListener", "listener", "Lcom/tencent/qcloud/tuikit/tuiconversation/ui/interfaces/OnItemClickListener;", "setParentLayout", "parent", "", "setPresenter", "setUnReadMsgData", "unCheckALL", "OnCheckChangeListener", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class CustomConversationLayout extends RelativeLayout implements IConversationLayout {
    @NotNull
    public Map<Integer, View> b;
    private boolean c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<ConversationInfo> f7112d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private CustomConversationListLayout f7113e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private h.u.a.u.y3.j.d f7114f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7115g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private RelativeLayout f7116h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private ShowStartCService f7117i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private MessageGroupJoinBean f7118j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7119k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private ImageView f7120l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7121m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private HashMap<Integer, ConversationInfo> f7122n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private a f7123o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private MessageUnreadBean f7124p;
    @Nullable
    private h.u.a.u.y3.q.a q;

    /* compiled from: CustomConversationLayout.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\bH&¨\u0006\u000b"}, d2 = {"Lcom/showstartfans/activity/view/custom_im_ui/CustomConversationLayout$OnCheckChangeListener;", "", "onCheckChange", "", "isCheckedGroup", "", "isCheckedServide", "checkMap", "Ljava/util/HashMap;", "", "Lcom/tencent/qcloud/tuikit/tuiconversation/bean/ConversationInfo;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface a {
        void a(boolean z, boolean z2, @Nullable HashMap<Integer, ConversationInfo> hashMap);
    }

    /* compiled from: CustomConversationLayout.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/view/custom_im_ui/CustomConversationLayout$initHeadView$1", "Landroid/view/View$OnLongClickListener;", "onLongClick", "", "p0", "Landroid/view/View;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements View.OnLongClickListener {
        public final /* synthetic */ CustomConversationLayout b;

        public b(CustomConversationLayout customConversationLayout) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(@Nullable View view) {
        }
    }

    /* compiled from: CustomConversationLayout.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/view/custom_im_ui/CustomConversationLayout$initHeadView$2", "Landroid/view/View$OnLongClickListener;", "onLongClick", "", "p0", "Landroid/view/View;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements View.OnLongClickListener {
        public final /* synthetic */ CustomConversationLayout b;

        public c(CustomConversationLayout customConversationLayout) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(@Nullable View view) {
        }
    }

    /* compiled from: CustomConversationLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ CustomConversationLayout this$0;

        public d(CustomConversationLayout customConversationLayout) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: CustomConversationLayout.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/view/custom_im_ui/CustomConversationLayout$loadConversation$1", "Lcom/tencent/qcloud/tuicore/component/interfaces/IUIKitCallback;", "", "Lcom/tencent/qcloud/tuikit/tuiconversation/bean/ConversationInfo;", "onSuccess", "", "data", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends IUIKitCallback<List<? extends ConversationInfo>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomConversationLayout f7125a;

        public e(CustomConversationLayout customConversationLayout) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<? extends ConversationInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(@Nullable List<? extends ConversationInfo> list) {
        }
    }

    /* compiled from: CustomConversationLayout.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/showstartfans/activity/view/custom_im_ui/CustomConversationLayout$setOnCheckChangeListener$1", "Lcom/showstartfans/activity/view/custom_im_ui/adapter/CustomConversationListAdapter$OnCheckChangeListener;", "onCheckChange", "", "checkMap", "Ljava/util/HashMap;", "", "Lcom/tencent/qcloud/tuikit/tuiconversation/bean/ConversationInfo;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f implements d.i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomConversationLayout f7126a;
        public final /* synthetic */ a b;

        public f(CustomConversationLayout customConversationLayout, a aVar) {
        }

        @Override // h.u.a.u.y3.j.d.i
        public void a(@Nullable HashMap<Integer, ConversationInfo> hashMap) {
        }
    }

    public CustomConversationLayout(@Nullable Context context) {
    }

    private final View A() {
    }

    private final void B() {
    }

    private static final void C(CustomConversationLayout customConversationLayout, View view) {
    }

    private static final void D(CustomConversationLayout customConversationLayout, View view, ConversationInfo conversationInfo) {
    }

    public static /* synthetic */ void G(CustomConversationLayout customConversationLayout, View view) {
    }

    public static /* synthetic */ void H(CustomConversationLayout customConversationLayout, View view, String str, int i2) {
    }

    public static /* synthetic */ void I(CustomConversationLayout customConversationLayout, View view) {
    }

    public static /* synthetic */ void J(CustomConversationLayout customConversationLayout, View view, ConversationInfo conversationInfo) {
    }

    public static /* synthetic */ void K(CustomConversationLayout customConversationLayout, ConversationInfo conversationInfo, View view) {
    }

    public static /* synthetic */ void L(ConversationInfo conversationInfo, boolean z, CustomConversationLayout customConversationLayout, View view, String str, int i2) {
    }

    public static /* synthetic */ void M(CustomConversationLayout customConversationLayout, n nVar) {
    }

    private final void N() {
    }

    public static /* synthetic */ void P(CustomConversationLayout customConversationLayout, a aVar, int i2, Object obj) {
    }

    private final void a(GroupMsgBean groupMsgBean) {
    }

    private final void b(GroupMsgBean groupMsgBean) {
    }

    private final void c(ConversationInfo conversationInfo) {
    }

    private static final void d(CustomConversationLayout customConversationLayout, View view, String str, int i2) {
    }

    private static final void e(CustomConversationLayout customConversationLayout, View view) {
    }

    private static final void f(ConversationInfo conversationInfo, boolean z, CustomConversationLayout customConversationLayout, View view, String str, int i2) {
    }

    private static final void g(CustomConversationLayout customConversationLayout, ConversationInfo conversationInfo, View view) {
    }

    private final void getMessagePoint() {
    }

    public static final /* synthetic */ void k(CustomConversationLayout customConversationLayout, ConversationInfo conversationInfo) {
    }

    public static final /* synthetic */ HashMap l(CustomConversationLayout customConversationLayout) {
    }

    public static final /* synthetic */ a m(CustomConversationLayout customConversationLayout) {
    }

    public static final /* synthetic */ ShowStartCService n(CustomConversationLayout customConversationLayout) {
    }

    public static final /* synthetic */ void o(CustomConversationLayout customConversationLayout, boolean z) {
    }

    public static final /* synthetic */ void p(CustomConversationLayout customConversationLayout, HashMap hashMap) {
    }

    private final void setCheckGroup(boolean z) {
    }

    private final void setPresenter(h.u.a.u.y3.q.a aVar) {
    }

    private final void u(int i2) {
    }

    private static final void w(CustomConversationLayout customConversationLayout, n nVar) {
    }

    private final void x() {
    }

    public static /* synthetic */ void z(CustomConversationLayout customConversationLayout, boolean z, int i2, Object obj) {
    }

    public final boolean E() {
    }

    public final boolean F() {
    }

    public final void O() {
    }

    public final void Q() {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public void clearConversationMessage(@Nullable ConversationInfo conversationInfo) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public void clearUnreadStatusOfFoldItem() {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public void deleteConversation(@Nullable ConversationInfo conversationInfo) {
    }

    @Nullable
    public final h.u.a.u.y3.j.d getAdapter() {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public /* bridge */ /* synthetic */ View getConversationList() {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ILayout
    @Nullable
    public TitleBarLayout getTitleBar() {
    }

    public final boolean getUseGetMessagePoint() {
    }

    public final void h() {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public void hideFoldedItem(boolean z) {
    }

    public void i() {
    }

    @Nullable
    public View j(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public void markConversationHidden(@Nullable ConversationInfo conversationInfo) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public void markConversationUnread(@Nullable ConversationInfo conversationInfo, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    public final void q(@Nullable ConversationInfo conversationInfo) {
    }

    public final void r() {
    }

    public final void s() {
    }

    public final void setAdapter(@Nullable h.u.a.u.y3.j.d dVar) {
    }

    public final void setCheckedGroup(boolean z) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    public void setConversationTop(@Nullable ConversationInfo conversationInfo, @Nullable IUIKitCallback<?> iUIKitCallback) {
    }

    public final void setNightMode(boolean z) {
    }

    public final void setOnCheckChangeListener(@Nullable a aVar) {
    }

    public final void setOnItemClickListener(@Nullable OnItemClickListener onItemClickListener) {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ILayout
    public void setParentLayout(@NotNull Object obj) {
    }

    public final void setUnReadMsgData(@Nullable MessageUnreadBean messageUnreadBean) {
    }

    public final void setUseGetMessagePoint(boolean z) {
    }

    public final void t() {
    }

    @Nullable
    public final ConversationInfo v(int i2) {
    }

    public final void y(boolean z) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.IConversationLayout
    @NotNull
    public ConversationListLayout getConversationList() {
    }

    public CustomConversationLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public CustomConversationLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
