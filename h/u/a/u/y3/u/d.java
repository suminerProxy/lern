package h.u.a.u.y3.u;

import android.content.Context;
import cn.sharesdk.framework.InnerShareParams;
import com.showstartfans.activity.model.AuthorInfo;
import com.tencent.imsdk.v2.V2TIMGroupMemberFullInfo;
import com.tencent.imsdk.v2.V2TIMUserFullInfo;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.umeng.analytics.pro.am;
import h.y.a.m.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GroupMemberInfoUtils.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0007J\u001a\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0007J\u001c\u0010\u0017\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0006H\u0007J\u001c\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J8\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007R-\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tRJ\u0010\n\u001a>\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r0\u0004j\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/showstartfans/activity/view/custom_im_ui/utils/GroupMemberInfoUtils;", "", "()V", "groupInfoMap", "Ljava/util/HashMap;", "", "Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;", "Lkotlin/collections/HashMap;", "getGroupInfoMap", "()Ljava/util/HashMap;", "mMuteMap", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/model/AuthorInfo;", "Lkotlin/collections/ArrayList;", "addToMuteList", "", "groupId", "userImId", "getGroupMemberInfo", "groupUserId", "loadMuteList", "ctx", "Landroid/content/Context;", "memberIsMuted", "", "putGroupMemberInfo", "info", "removeFromMuteList", "updateGroupInfo", InnerShareParams.GROPU_ID, "userList", "listener", "Lcom/showstartfans/activity/view/custom_im_ui/utils/GroupMemberInfoUtils$OnUpdateGroupInfoListener;", "OnUpdateGroupInfoListener", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class d {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final d f24972a = null;
    @NotNull
    private static final HashMap<String, ArrayList<AuthorInfo>> b = null;
    @NotNull
    private static final HashMap<String, V2TIMGroupMemberFullInfo> c = null;

    /* compiled from: GroupMemberInfoUtils.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/showstartfans/activity/view/custom_im_ui/utils/GroupMemberInfoUtils$OnUpdateGroupInfoListener;", "", "OnResule", "", "success", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface a {
        void a(boolean z);
    }

    /* compiled from: GroupMemberInfoUtils.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/view/custom_im_ui/utils/GroupMemberInfoUtils$updateGroupInfo$1", "Lcom/tencent/imsdk/v2/V2TIMValueCallback;", "", "Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;", "onError", "", "i", "", am.aB, "", "onSuccess", "v2TIMGroupMemberFullInfos", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements V2TIMValueCallback<List<? extends V2TIMGroupMemberFullInfo>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24973a;
        public final /* synthetic */ ArrayList<String> b;
        public final /* synthetic */ a c;

        /* compiled from: GroupMemberInfoUtils.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;", "invoke", "(Ljava/util/List;)Lkotlin/Unit;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends Lambda implements Function1<List<? extends V2TIMUserFullInfo>, Unit> {
            public final /* synthetic */ a $listener;

            public a(a aVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends V2TIMUserFullInfo> list) {
            }

            @Nullable
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Unit invoke2(@Nullable List<? extends V2TIMUserFullInfo> list) {
            }
        }

        public b(String str, ArrayList<String> arrayList, a aVar) {
        }

        public void a(@NotNull List<? extends V2TIMGroupMemberFullInfo> list) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, @NotNull String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<? extends V2TIMGroupMemberFullInfo> list) {
        }
    }

    private d() {
    }

    @JvmStatic
    public static final void a(@Nullable String str, @Nullable String str2) {
    }

    @JvmStatic
    @Nullable
    public static final V2TIMGroupMemberFullInfo c(@NotNull String str, @NotNull String str2) {
    }

    public static /* synthetic */ void d(String str, n nVar) {
    }

    @JvmStatic
    public static final void e(@NotNull Context context, @Nullable String str) {
    }

    private static final void f(String str, n nVar) {
    }

    @JvmStatic
    public static final boolean g(@Nullable String str, @Nullable String str2) {
    }

    @JvmStatic
    public static final void h(@NotNull String str, @NotNull String str2, @NotNull V2TIMGroupMemberFullInfo v2TIMGroupMemberFullInfo) {
    }

    @JvmStatic
    public static final void i(@Nullable String str, @Nullable String str2) {
    }

    @JvmStatic
    public static final void j(@Nullable String str, @Nullable ArrayList<String> arrayList, @Nullable a aVar) {
    }

    @NotNull
    public final HashMap<String, V2TIMGroupMemberFullInfo> b() {
    }
}
