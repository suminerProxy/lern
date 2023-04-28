package h.y.a.m;

import android.text.TextUtils;
import h.y.a.n.u;
import h.y.a.n.u0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TerminalRequestEHelper.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002¨\u0006\u000b"}, d2 = {"Lcom/taihebase/activity/network/TerminalRequestEHelper;", "", "()V", "terminalRequestEncryption", "", "interfaceId", "sessionId", "transformationCode", "num", "", "encodingStr", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class p {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final p f26256a = new p();

    private p() {
    }

    @JvmStatic
    @NotNull
    public static final String a(@Nullable String str, @Nullable String str2) {
        String str3 = "00";
        if (!TextUtils.isEmpty(str)) {
            try {
                Intrinsics.checkNotNull(str);
                String encodingInterfaceId = u.b(Long.parseLong(str));
                p pVar = f26256a;
                Intrinsics.checkNotNullExpressionValue(encodingInterfaceId, "encodingInterfaceId");
                str3 = pVar.b(2, encodingInterfaceId);
            } catch (Exception unused) {
            }
        }
        String stringPlus = Intrinsics.stringPlus("", str3);
        String str4 = "0000";
        if (!TextUtils.isEmpty(str2)) {
            try {
                Intrinsics.checkNotNull(str2);
                String encodingSessionId = u.b(Long.parseLong(str2));
                p pVar2 = f26256a;
                Intrinsics.checkNotNullExpressionValue(encodingSessionId, "encodingSessionId");
                str4 = pVar2.b(4, encodingSessionId);
            } catch (Exception unused2) {
            }
        }
        String stringPlus2 = Intrinsics.stringPlus(stringPlus, str4);
        String F0 = u0.L().F0();
        String str5 = "000000";
        if (!TextUtils.isEmpty(F0)) {
            try {
                Intrinsics.checkNotNull(F0);
                String encodingUserId = u.b(Long.parseLong(F0));
                p pVar3 = f26256a;
                Intrinsics.checkNotNullExpressionValue(encodingUserId, "encodingUserId");
                str5 = pVar3.b(6, encodingUserId);
            } catch (Exception unused3) {
            }
        }
        return Intrinsics.stringPlus(stringPlus2, str5);
    }

    private final String b(int i2, String str) {
        int i3 = 0;
        if (!TextUtils.isEmpty(str)) {
            if (str.length() < i2) {
                StringBuilder sb = new StringBuilder();
                int length = i2 - str.length();
                while (i3 < length) {
                    i3++;
                    sb.append("0");
                }
                sb.append(str);
                str = sb.toString();
            }
            Intrinsics.checkNotNullExpressionValue(str, "{\n            if (encodi…lse encodingStr\n        }");
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        while (i3 < i2) {
            i3++;
            sb2.append("0");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "{\n            val str = … str.toString()\n        }");
        return sb3;
    }
}
