package h.u.a.o;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RefundResultBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/showstartfans/activity/model/RefundResultBean;", "Ljava/io/Serializable;", "()V", "notes", "", "", "getNotes", "()Ljava/util/List;", "setNotes", "(Ljava/util/List;)V", UMModuleRegister.PROCESS, "Lcom/showstartfans/activity/model/Process;", "getProcess", "setProcess", "refundPrice", "getRefundPrice", "()Ljava/lang/String;", "setRefundPrice", "(Ljava/lang/String;)V", "refundStatus", "", "getRefundStatus", "()I", "setRefundStatus", "(I)V", "remark", "getRemark", "setRemark", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class z implements Serializable {
    @Nullable
    private List<String> notes;
    @Nullable
    private List<x> process;
    @NotNull
    private String refundPrice;
    private int refundStatus;
    @NotNull
    private String remark;

    @Nullable
    public final List<String> getNotes() {
    }

    @Nullable
    public final List<x> getProcess() {
    }

    @NotNull
    public final String getRefundPrice() {
    }

    public final int getRefundStatus() {
    }

    @NotNull
    public final String getRemark() {
    }

    public final void setNotes(@Nullable List<String> list) {
    }

    public final void setProcess(@Nullable List<x> list) {
    }

    public final void setRefundPrice(@NotNull String str) {
    }

    public final void setRefundStatus(int i2) {
    }

    public final void setRemark(@NotNull String str) {
    }
}
