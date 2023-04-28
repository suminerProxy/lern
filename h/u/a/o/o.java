package h.u.a.o;

import com.mobile.auth.gatewayauth.Constant;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LogisticsBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\b¨\u00066"}, d2 = {"Lcom/showstartfans/activity/model/Logistics;", "Ljava/io/Serializable;", "()V", "courier", "", "getCourier", "()Ljava/lang/String;", "setCourier", "(Ljava/lang/String;)V", "courierPhone", "getCourierPhone", "setCourierPhone", "deliverystatus", "getDeliverystatus", "setDeliverystatus", "expName", "getExpName", "setExpName", "expPhone", "getExpPhone", "setExpPhone", "expSite", "getExpSite", "setExpSite", "isOpen", "", "()Z", "setOpen", "(Z)V", "issign", "getIssign", "setIssign", "list", "", "Lcom/showstartfans/activity/model/Log;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "logo", "getLogo", "setLogo", Constant.LOGIN_ACTIVITY_NUMBER, "getNumber", "setNumber", "takeTime", "getTakeTime", "setTakeTime", "type", "getType", "setType", "updateTime", "getUpdateTime", "setUpdateTime", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class o implements Serializable {
    @NotNull
    private String courier;
    @NotNull
    private String courierPhone;
    @NotNull
    private String deliverystatus;
    @NotNull
    private String expName;
    @NotNull
    private String expPhone;
    @NotNull
    private String expSite;
    private boolean isOpen;
    @NotNull
    private String issign;
    @Nullable
    private List<m> list;
    @NotNull
    private String logo;
    @NotNull
    private String number;
    @NotNull
    private String takeTime;
    @NotNull
    private String type;
    @NotNull
    private String updateTime;

    @NotNull
    public final String getCourier() {
    }

    @NotNull
    public final String getCourierPhone() {
    }

    @NotNull
    public final String getDeliverystatus() {
    }

    @NotNull
    public final String getExpName() {
    }

    @NotNull
    public final String getExpPhone() {
    }

    @NotNull
    public final String getExpSite() {
    }

    @NotNull
    public final String getIssign() {
    }

    @Nullable
    public final List<m> getList() {
    }

    @NotNull
    public final String getLogo() {
    }

    @NotNull
    public final String getNumber() {
    }

    @NotNull
    public final String getTakeTime() {
    }

    @NotNull
    public final String getType() {
    }

    @NotNull
    public final String getUpdateTime() {
    }

    public final boolean isOpen() {
    }

    public final void setCourier(@NotNull String str) {
    }

    public final void setCourierPhone(@NotNull String str) {
    }

    public final void setDeliverystatus(@NotNull String str) {
    }

    public final void setExpName(@NotNull String str) {
    }

    public final void setExpPhone(@NotNull String str) {
    }

    public final void setExpSite(@NotNull String str) {
    }

    public final void setIssign(@NotNull String str) {
    }

    public final void setList(@Nullable List<m> list) {
    }

    public final void setLogo(@NotNull String str) {
    }

    public final void setNumber(@NotNull String str) {
    }

    public final void setOpen(boolean z) {
    }

    public final void setTakeTime(@NotNull String str) {
    }

    public final void setType(@NotNull String str) {
    }

    public final void setUpdateTime(@NotNull String str) {
    }
}
