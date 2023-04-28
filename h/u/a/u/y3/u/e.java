package h.u.a.u.y3.u;

import com.showstartfans.activity.model.UserInfoBean;
import com.tencent.imsdk.v2.V2TIMUserFullInfo;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImUserInfoUtils.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0018\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0004JQ\u0010\f\u001a\u00020\n2\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u000f2-\u0010\u0010\u001a)\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0011¨\u0006\u0016"}, d2 = {"Lcom/showstartfans/activity/view/custom_im_ui/utils/ImUserInfoUtils;", "", "()V", "getUserInfo", "Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;", "imUserId", "", "getUserInfoBean", "Lcom/showstartfans/activity/model/UserInfoBean;", "putUserInfo", "", "info", "updateUserInfo", "userIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "callBack", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "infos", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class e {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final e f24974a = null;

    /* compiled from: ImUserInfoUtils.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/view/custom_im_ui/utils/ImUserInfoUtils$updateUserInfo$1", "Lcom/tencent/imsdk/v2/V2TIMValueCallback;", "", "Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;", "onError", "", "p0", "", "p1", "", "onSuccess", "v2TIMUserFullInfos", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements V2TIMValueCallback<List<? extends V2TIMUserFullInfo>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Function1<List<? extends V2TIMUserFullInfo>, Unit> f24975a;

        public a(Function1<? super List<? extends V2TIMUserFullInfo>, Unit> function1) {
        }

        public void a(@Nullable List<? extends V2TIMUserFullInfo> list) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, @Nullable String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<? extends V2TIMUserFullInfo> list) {
        }
    }

    private e() {
    }

    @JvmStatic
    @Nullable
    public static final UserInfoBean b(@Nullable String str) {
    }

    @Nullable
    public final V2TIMUserFullInfo a(@Nullable String str) {
    }

    public final void c(@Nullable String str, @NotNull V2TIMUserFullInfo v2TIMUserFullInfo) {
    }

    public final void d(@Nullable ArrayList<String> arrayList, @Nullable Function1<? super List<? extends V2TIMUserFullInfo>, Unit> function1) {
    }
}
