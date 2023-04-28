package com.showstartfans.activity.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.showstartfans.activity.model.UserFriendBean;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatFrameLayout;

/* compiled from: FollowView.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 :2\u00020\u0001:\u0001:B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\tH\u0016J\b\u00100\u001a\u00020 H\u0002J\u0012\u00101\u001a\u00020 2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u00102\u001a\u00020 H\u0002J\b\u00103\u001a\u00020 H\u0002J\"\u00104\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u0001062\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\fJ&\u00104\u001a\u00020 2\u0006\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u00109\u001a\u00020 2\u0006\u0010/\u001a\u00020\tR\u001a\u0010\u000b\u001a\u00020\fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000Rg\u0010\u0019\u001aO\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001aj\u0004\u0018\u0001`!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/showstartfans/activity/widget/FollowView;", "Lskin/support/widget/SkinCompatFrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "canCancle", "", "getCanCancle", "()Z", "setCanCancle", "(Z)V", "canChat", "getCanChat", "setCanChat", "height_bg", "mId", "", "mRelationship", "mUserType", "onFollowListener", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "success", "isFollow", "newRelationship", "", "Lcom/showstartfans/activity/widget/OnFollowListener;", "getOnFollowListener", "()Lkotlin/jvm/functions/Function3;", "setOnFollowListener", "(Lkotlin/jvm/functions/Function3;)V", "tv_text", "Landroid/widget/TextView;", "getTv_text", "()Landroid/widget/TextView;", "setTv_text", "(Landroid/widget/TextView;)V", Oauth2AccessToken.KEY_SCREEN_NAME, "width_bg", "OnSetStatus", "relationship", "followOrCancel", "init", "initLis", "openChat", "setData", "bean", "Lcom/showstartfans/activity/model/UserFriendBean;", "id", "userType", "updateRelationship", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FollowView extends SkinCompatFrameLayout {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public static final a f7381m = null;
    @NotNull
    public Map<Integer, View> b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7382d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private TextView f7383e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f7384f;

    /* renamed from: g  reason: collision with root package name */
    private int f7385g;

    /* renamed from: h  reason: collision with root package name */
    private int f7386h;

    /* renamed from: i  reason: collision with root package name */
    private int f7387i;

    /* renamed from: j  reason: collision with root package name */
    private int f7388j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private Function3<? super Boolean, ? super Boolean, ? super Integer, Unit> f7389k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private String f7390l;

    /* compiled from: FollowView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/showstartfans/activity/widget/FollowView$Companion;", "", "()V", "getNewRelationship", "", "isFollow", "", "oldRelationship", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final int a(boolean z, int i2) {
        }
    }

    /* compiled from: FollowView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Ref.IntRef $isWish;
        public final /* synthetic */ FollowView this$0;

        public b(Ref.IntRef intRef, FollowView followView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    public FollowView(@NotNull Context context) {
    }

    private static final void f(FollowView followView, View view) {
    }

    public static final /* synthetic */ String i(FollowView followView) {
    }

    public static final /* synthetic */ int j(FollowView followView) {
    }

    public static final /* synthetic */ int k(FollowView followView) {
    }

    private final void l() {
    }

    private final void m(AttributeSet attributeSet) {
    }

    private final void n() {
    }

    private static final void o(FollowView followView, View view) {
    }

    public static /* synthetic */ void p(FollowView followView, View view) {
    }

    public static /* synthetic */ void q(FollowView followView, View view) {
    }

    private final void r() {
    }

    public static /* synthetic */ void u(FollowView followView, UserFriendBean userFriendBean, boolean z, boolean z2, int i2, Object obj) {
    }

    public void e(int i2) {
    }

    public void g() {
    }

    public final boolean getCanCancle() {
    }

    public final boolean getCanChat() {
    }

    @Nullable
    public final Function3<Boolean, Boolean, Integer, Unit> getOnFollowListener() {
    }

    @Nullable
    public final TextView getTv_text() {
    }

    @Nullable
    public View h(int i2) {
    }

    public final void s(@Nullable UserFriendBean userFriendBean, boolean z, boolean z2) {
    }

    public final void setCanCancle(boolean z) {
    }

    public final void setCanChat(boolean z) {
    }

    public final void setOnFollowListener(@Nullable Function3<? super Boolean, ? super Boolean, ? super Integer, Unit> function3) {
    }

    public final void setTv_text(@Nullable TextView textView) {
    }

    public final void t(@NotNull String str, int i2, int i3, boolean z) {
    }

    public final void v(int i2) {
    }

    public FollowView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public FollowView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
