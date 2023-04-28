package tencent.im;

import com.tencent.imsdk.v2.V2TIMGroupInfoResult;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.umeng.analytics.pro.am;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import tencent.im.TencentIMControl;

/* compiled from: TencentIMControl.kt */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\f"}, d2 = {"tencent/im/TencentIMControl$getGroupReceiveMessage$1", "Lcom/tencent/imsdk/v2/V2TIMValueCallback;", "", "Lcom/tencent/imsdk/v2/V2TIMGroupInfoResult;", "onError", "", "i", "", am.aB, "", "onSuccess", "v2TIMGroupInfoResults", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class TencentIMControl$getGroupReceiveMessage$1 implements V2TIMValueCallback<List<? extends V2TIMGroupInfoResult>> {
    public final /* synthetic */ Function1<TencentIMControl.ReceiveMode, Unit> $callBac;

    public TencentIMControl$getGroupReceiveMessage$1(Function1<? super TencentIMControl.ReceiveMode, Unit> function1) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMValueCallback
    public void onError(int i2, @NotNull String str) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMValueCallback
    public /* bridge */ /* synthetic */ void onSuccess(List<? extends V2TIMGroupInfoResult> list) {
    }

    /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
    public void onSuccess2(@NotNull List<? extends V2TIMGroupInfoResult> list) {
    }
}
