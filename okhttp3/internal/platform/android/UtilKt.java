package okhttp3.internal.platform.android;

import com.baidu.platform.comapi.map.MapBundleKey;
import com.umeng.analytics.pro.am;
import kotlin.Metadata;

/* compiled from: util.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0016\u0010\t\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", MapBundleKey.MapObjKey.OBJ_LEVEL, "", "message", "", am.aI, "", "androidLog", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "MAX_LOG_LENGTH", "I", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class UtilKt {
    private static final int MAX_LOG_LENGTH = 4000;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        r7 = r2 + 1;
     */
    @okhttp3.internal.SuppressSignatureCheck
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void androidLog(int r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.Nullable java.lang.Throwable r9) {
        /*
            r0 = 5
            if (r7 == r0) goto L4
            r0 = 3
        L4:
            if (r9 == 0) goto L1e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            java.lang.String r8 = "\n"
            r7.append(r8)
            java.lang.String r8 = android.util.Log.getStackTraceString(r9)
            r7.append(r8)
            java.lang.String r8 = r7.toString()
        L1e:
            r7 = 0
            int r9 = r8.length()
        L23:
            if (r7 >= r9) goto L5a
            r2 = 10
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            r3 = r7
            int r1 = kotlin.text.StringsKt__StringsKt.indexOf$default(r1, r2, r3, r4, r5, r6)
            r2 = -1
            if (r1 == r2) goto L34
            goto L35
        L34:
            r1 = r9
        L35:
            int r2 = r7 + 4000
            int r2 = java.lang.Math.min(r1, r2)
            if (r8 == 0) goto L52
            java.lang.String r7 = r8.substring(r7, r2)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r3)
            java.lang.String r3 = "OkHttp"
            android.util.Log.println(r0, r3, r7)
            if (r2 < r1) goto L50
            int r7 = r2 + 1
            goto L23
        L50:
            r7 = r2
            goto L35
        L52:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            r7.<init>(r8)
            throw r7
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.android.UtilKt.androidLog(int, java.lang.String, java.lang.Throwable):void");
    }
}
